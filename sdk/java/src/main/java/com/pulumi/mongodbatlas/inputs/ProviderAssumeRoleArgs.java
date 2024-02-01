// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderAssumeRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderAssumeRoleArgs Empty = new ProviderAssumeRoleArgs();

    /**
     * The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * A unique identifier that might be required when you assume a role in another account.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return A unique identifier that might be required when you assume a role in another account.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    @Import(name="policyArns")
    private @Nullable Output<List<String>> policyArns;

    /**
     * @return Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    public Optional<Output<List<String>>> policyArns() {
        return Optional.ofNullable(this.policyArns);
    }

    /**
     * Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * An identifier for the assumed role session.
     * 
     */
    @Import(name="sessionName")
    private @Nullable Output<String> sessionName;

    /**
     * @return An identifier for the assumed role session.
     * 
     */
    public Optional<Output<String>> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }

    /**
     * Source identity specified by the principal assuming the role.
     * 
     */
    @Import(name="sourceIdentity")
    private @Nullable Output<String> sourceIdentity;

    /**
     * @return Source identity specified by the principal assuming the role.
     * 
     */
    public Optional<Output<String>> sourceIdentity() {
        return Optional.ofNullable(this.sourceIdentity);
    }

    /**
     * Assume role session tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Assume role session tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Assume role session tag keys to pass to any subsequent sessions.
     * 
     */
    @Import(name="transitiveTagKeys")
    private @Nullable Output<List<String>> transitiveTagKeys;

    /**
     * @return Assume role session tag keys to pass to any subsequent sessions.
     * 
     */
    public Optional<Output<List<String>>> transitiveTagKeys() {
        return Optional.ofNullable(this.transitiveTagKeys);
    }

    private ProviderAssumeRoleArgs() {}

    private ProviderAssumeRoleArgs(ProviderAssumeRoleArgs $) {
        this.duration = $.duration;
        this.externalId = $.externalId;
        this.policy = $.policy;
        this.policyArns = $.policyArns;
        this.roleArn = $.roleArn;
        this.sessionName = $.sessionName;
        this.sourceIdentity = $.sourceIdentity;
        this.tags = $.tags;
        this.transitiveTagKeys = $.transitiveTagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderAssumeRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderAssumeRoleArgs $;

        public Builder() {
            $ = new ProviderAssumeRoleArgs();
        }

        public Builder(ProviderAssumeRoleArgs defaults) {
            $ = new ProviderAssumeRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param externalId A unique identifier that might be required when you assume a role in another account.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId A unique identifier that might be required when you assume a role in another account.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param policy IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param policyArns Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policyArns(@Nullable Output<List<String>> policyArns) {
            $.policyArns = policyArns;
            return this;
        }

        /**
         * @param policyArns Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policyArns(List<String> policyArns) {
            return policyArns(Output.of(policyArns));
        }

        /**
         * @param policyArns Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policyArns(String... policyArns) {
            return policyArns(List.of(policyArns));
        }

        /**
         * @param roleArn Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param sessionName An identifier for the assumed role session.
         * 
         * @return builder
         * 
         */
        public Builder sessionName(@Nullable Output<String> sessionName) {
            $.sessionName = sessionName;
            return this;
        }

        /**
         * @param sessionName An identifier for the assumed role session.
         * 
         * @return builder
         * 
         */
        public Builder sessionName(String sessionName) {
            return sessionName(Output.of(sessionName));
        }

        /**
         * @param sourceIdentity Source identity specified by the principal assuming the role.
         * 
         * @return builder
         * 
         */
        public Builder sourceIdentity(@Nullable Output<String> sourceIdentity) {
            $.sourceIdentity = sourceIdentity;
            return this;
        }

        /**
         * @param sourceIdentity Source identity specified by the principal assuming the role.
         * 
         * @return builder
         * 
         */
        public Builder sourceIdentity(String sourceIdentity) {
            return sourceIdentity(Output.of(sourceIdentity));
        }

        /**
         * @param tags Assume role session tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Assume role session tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transitiveTagKeys Assume role session tag keys to pass to any subsequent sessions.
         * 
         * @return builder
         * 
         */
        public Builder transitiveTagKeys(@Nullable Output<List<String>> transitiveTagKeys) {
            $.transitiveTagKeys = transitiveTagKeys;
            return this;
        }

        /**
         * @param transitiveTagKeys Assume role session tag keys to pass to any subsequent sessions.
         * 
         * @return builder
         * 
         */
        public Builder transitiveTagKeys(List<String> transitiveTagKeys) {
            return transitiveTagKeys(Output.of(transitiveTagKeys));
        }

        /**
         * @param transitiveTagKeys Assume role session tag keys to pass to any subsequent sessions.
         * 
         * @return builder
         * 
         */
        public Builder transitiveTagKeys(String... transitiveTagKeys) {
            return transitiveTagKeys(List.of(transitiveTagKeys));
        }

        public ProviderAssumeRoleArgs build() {
            return $;
        }
    }

}
