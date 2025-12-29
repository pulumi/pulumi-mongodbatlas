---
name: pulumi-upgrade-provider
description: Automate Pulumi provider repo upgrades with the `upgrade-provider` tool. Use when upgrading a pulumi provider repository to a new upstream version, running `upgrade-provider`, and addressing its common failure modes like patch conflicts or missing module mappings.
---

# Pulumi Upgrade Provider

## Overview

Drive Pulumi provider upgrades by running the `upgrade-provider` tool and iterating on failures until the tool succeeds. Keep all git operations read-only in the repo; the tool owns branches, commits, and PRs.

## Run Loop

1. Run the upgrade tool from the repo root:

```console
upgrade-provider $ORG/$REPO --repo-path . > .pulumi/upgrade-provider-stdout.txt 2> /dev/null
```

2. Wait for completion (can take up to 10 minutes).
3. Scan `.pulumi/upgrade-provider-stdout.txt` for lines starting with `error: `.
4. If failed, fix the issue using the guidance in this skill's `references/upgrade-provider-errors.md` (from the skill folder, not the repo), then rerun the command.
5. If a conflict was fixed, report to the user exactly what changed (file paths + concrete edits or kept intent).
6. If the upgrade required changes to patches, run `./scripts/upstream.sh checkout` and review the applied commits:
   - List commit SHAs/titles from `upstream`.
   - Summarize the intent of each commit in plain language.
   - Call out any behavioral changes or risks.
7. When the tool completes successfully, proceed to Post-run Tasks.

## Post-run Tasks

The tool creates a PR when the upgrade completes successfully.

1. MUST fetch the PR URL for the current branch using read-only commands:

```console
gh pr view --json url --jq .url || gh pr list --head "$(git branch --show-current)" --json url --jq '.[0].url'
```

2. MUST append a "Fixes applied to unblock upgrade" section to the existing PR body if any fixes were applied (do not overwrite):

```console
repo=$(gh repo view --json nameWithOwner --jq .nameWithOwner)
pr_number=$(gh pr view --json number --jq .number)
gh pr view --json body --jq .body > /tmp/pr_body.txt

cat <<'EOF' >> /tmp/pr_body.txt

---

### Fixes applied to unblock upgrade

- <list concrete unblocker edits here, with file paths and intent>
EOF

gh api -X PATCH "repos/$repo/pulls/$pr_number" --raw-field body="$(cat /tmp/pr_body.txt)"
```

Use REST (`gh api`) instead of `gh pr edit` to avoid GraphQL project-card errors. Keep the original content intact; only append the new section.

## Notes

- `git rebase --continue --no-edit` is not supported in older git versions. Use `git rebase --continue` and accept the existing commit message when prompted.
- To avoid the editor prompt during `git rebase --continue`, run it with `GIT_EDITOR=true` (or `GIT_EDITOR=:`).

## Guardrails

- Never commit, push, or create branches manually; only run read-only git commands.
- `./scripts/upstream.sh checkout|rebase|check_in` are allowed because the tool manages git state.
- Do not stash changes; the tool manages git state.

## References

- Use this skill's `references/upgrade-provider-errors.md` (from the skill folder, not the repo) for patch conflict and new module mapping fixes.
