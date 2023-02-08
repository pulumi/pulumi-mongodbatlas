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


public final class GetCloudProviderSnapshotRestoreJobsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudProviderSnapshotRestoreJobsArgs Empty = new GetCloudProviderSnapshotRestoreJobsArgs();

    /**
     * The name of the Atlas cluster for which you want to retrieve restore jobs.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster for which you want to retrieve restore jobs.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    @Import(name="itemsPerPage")
    private @Nullable Output<Integer> itemsPerPage;

    /**
     * @return Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    public Optional<Output<Integer>> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * The page to return. Defaults to `1`.
     * 
     */
    @Import(name="pageNum")
    private @Nullable Output<Integer> pageNum;

    /**
     * @return The page to return. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * The unique identifier of the project for the Atlas cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetCloudProviderSnapshotRestoreJobsArgs() {}

    private GetCloudProviderSnapshotRestoreJobsArgs(GetCloudProviderSnapshotRestoreJobsArgs $) {
        this.clusterName = $.clusterName;
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudProviderSnapshotRestoreJobsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudProviderSnapshotRestoreJobsArgs $;

        public Builder() {
            $ = new GetCloudProviderSnapshotRestoreJobsArgs();
        }

        public Builder(GetCloudProviderSnapshotRestoreJobsArgs defaults) {
            $ = new GetCloudProviderSnapshotRestoreJobsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Atlas cluster for which you want to retrieve restore jobs.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Atlas cluster for which you want to retrieve restore jobs.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(@Nullable Output<Integer> itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(Integer itemsPerPage) {
            return itemsPerPage(Output.of(itemsPerPage));
        }

        /**
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(@Nullable Output<Integer> pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(Integer pageNum) {
            return pageNum(Output.of(pageNum));
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetCloudProviderSnapshotRestoreJobsArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}