// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudBackupSnapshotExportBucketPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudBackupSnapshotExportBucketPlainArgs Empty = new GetCloudBackupSnapshotExportBucketPlainArgs();

    /**
     * Unique identifier of the snapshot export bucket.
     * 
     */
    @Import(name="exportBucketId", required=true)
    private String exportBucketId;

    /**
     * @return Unique identifier of the snapshot export bucket.
     * 
     */
    public String exportBucketId() {
        return this.exportBucketId;
    }

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
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

    private GetCloudBackupSnapshotExportBucketPlainArgs() {}

    private GetCloudBackupSnapshotExportBucketPlainArgs(GetCloudBackupSnapshotExportBucketPlainArgs $) {
        this.exportBucketId = $.exportBucketId;
        this.id = $.id;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudBackupSnapshotExportBucketPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudBackupSnapshotExportBucketPlainArgs $;

        public Builder() {
            $ = new GetCloudBackupSnapshotExportBucketPlainArgs();
        }

        public Builder(GetCloudBackupSnapshotExportBucketPlainArgs defaults) {
            $ = new GetCloudBackupSnapshotExportBucketPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exportBucketId Unique identifier of the snapshot export bucket.
         * 
         * @return builder
         * 
         */
        public Builder exportBucketId(String exportBucketId) {
            $.exportBucketId = exportBucketId;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
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

        public GetCloudBackupSnapshotExportBucketPlainArgs build() {
            $.exportBucketId = Objects.requireNonNull($.exportBucketId, "expected parameter 'exportBucketId' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}