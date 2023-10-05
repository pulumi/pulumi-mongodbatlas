// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAtlasUsersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAtlasUsersArgs Empty = new GetAtlasUsersArgs();

    /**
     * Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
     * 
     * &gt; **IMPORTANT:** Either `org_id`, `project_id`, or `team_id` with `org_id` must be configurated.
     * 
     */
    @Import(name="itemsPerPage")
    private @Nullable Output<Integer> itemsPerPage;

    /**
     * @return Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
     * 
     * &gt; **IMPORTANT:** Either `org_id`, `project_id`, or `team_id` with `org_id` must be configurated.
     * 
     */
    public Optional<Output<Integer>> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `team_id` attributes is defined.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `team_id` attributes is defined.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
     * 
     */
    @Import(name="pageNum")
    private @Nullable Output<Integer> pageNum;

    /**
     * @return Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private GetAtlasUsersArgs() {}

    private GetAtlasUsersArgs(GetAtlasUsersArgs $) {
        this.itemsPerPage = $.itemsPerPage;
        this.orgId = $.orgId;
        this.pageNum = $.pageNum;
        this.projectId = $.projectId;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAtlasUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAtlasUsersArgs $;

        public Builder() {
            $ = new GetAtlasUsersArgs();
        }

        public Builder(GetAtlasUsersArgs defaults) {
            $ = new GetAtlasUsersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param itemsPerPage Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
         * 
         * &gt; **IMPORTANT:** Either `org_id`, `project_id`, or `team_id` with `org_id` must be configurated.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(@Nullable Output<Integer> itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @param itemsPerPage Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
         * 
         * &gt; **IMPORTANT:** Either `org_id`, `project_id`, or `team_id` with `org_id` must be configurated.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(Integer itemsPerPage) {
            return itemsPerPage(Output.of(itemsPerPage));
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `team_id` attributes is defined.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `team_id` attributes is defined.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param pageNum Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(@Nullable Output<Integer> pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param pageNum Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(Integer pageNum) {
            return pageNum(Output.of(pageNum));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param teamId Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public GetAtlasUsersArgs build() {
            return $;
        }
    }

}
