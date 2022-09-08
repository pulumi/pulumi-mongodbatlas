// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudBackupSnapshotExportBucketsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudBackupSnapshotExportBucketsPlainArgs Empty = new GetCloudBackupSnapshotExportBucketsPlainArgs();

    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    @Import(name="itemsPerPage")
    private @Nullable Integer itemsPerPage;

    /**
     * @return Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    public Optional<Integer> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * The page to return. Defaults to `1`.
     * 
     */
    @Import(name="pageNum")
    private @Nullable Integer pageNum;

    /**
     * @return The page to return. Defaults to `1`.
     * 
     */
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * The unique identifier of the project for the Atlas cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetCloudBackupSnapshotExportBucketsPlainArgs() {}

    private GetCloudBackupSnapshotExportBucketsPlainArgs(GetCloudBackupSnapshotExportBucketsPlainArgs $) {
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudBackupSnapshotExportBucketsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudBackupSnapshotExportBucketsPlainArgs $;

        public Builder() {
            $ = new GetCloudBackupSnapshotExportBucketsPlainArgs();
        }

        public Builder(GetCloudBackupSnapshotExportBucketsPlainArgs defaults) {
            $ = new GetCloudBackupSnapshotExportBucketsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(@Nullable Integer itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(@Nullable Integer pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetCloudBackupSnapshotExportBucketsPlainArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
