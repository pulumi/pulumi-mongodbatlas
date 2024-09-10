// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotExportJobCustomDataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CloudBackupSnapshotExportJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSnapshotExportJobArgs Empty = new CloudBackupSnapshotExportJobArgs();

    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    @Import(name="customDatas", required=true)
    private Output<List<CloudBackupSnapshotExportJobCustomDataArgs>> customDatas;

    /**
     * @return Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    public Output<List<CloudBackupSnapshotExportJobCustomDataArgs>> customDatas() {
        return this.customDatas;
    }

    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
     * 
     */
    @Import(name="exportBucketId", required=true)
    private Output<String> exportBucketId;

    /**
     * @return Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
     * 
     */
    public Output<String> exportBucketId() {
        return this.exportBucketId;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
     * 
     */
    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    /**
     * @return Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    private CloudBackupSnapshotExportJobArgs() {}

    private CloudBackupSnapshotExportJobArgs(CloudBackupSnapshotExportJobArgs $) {
        this.clusterName = $.clusterName;
        this.customDatas = $.customDatas;
        this.exportBucketId = $.exportBucketId;
        this.projectId = $.projectId;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudBackupSnapshotExportJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBackupSnapshotExportJobArgs $;

        public Builder() {
            $ = new CloudBackupSnapshotExportJobArgs();
        }

        public Builder(CloudBackupSnapshotExportJobArgs defaults) {
            $ = new CloudBackupSnapshotExportJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Atlas cluster whose snapshot you want to export.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the Atlas cluster whose snapshot you want to export.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param customDatas Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
         * 
         * @return builder
         * 
         */
        public Builder customDatas(Output<List<CloudBackupSnapshotExportJobCustomDataArgs>> customDatas) {
            $.customDatas = customDatas;
            return this;
        }

        /**
         * @param customDatas Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
         * 
         * @return builder
         * 
         */
        public Builder customDatas(List<CloudBackupSnapshotExportJobCustomDataArgs> customDatas) {
            return customDatas(Output.of(customDatas));
        }

        /**
         * @param customDatas Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
         * 
         * @return builder
         * 
         */
        public Builder customDatas(CloudBackupSnapshotExportJobCustomDataArgs... customDatas) {
            return customDatas(List.of(customDatas));
        }

        /**
         * @param exportBucketId Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
         * 
         * @return builder
         * 
         */
        public Builder exportBucketId(Output<String> exportBucketId) {
            $.exportBucketId = exportBucketId;
            return this;
        }

        /**
         * @param exportBucketId Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
         * 
         * @return builder
         * 
         */
        public Builder exportBucketId(String exportBucketId) {
            return exportBucketId(Output.of(exportBucketId));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param snapshotId Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public CloudBackupSnapshotExportJobArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("CloudBackupSnapshotExportJobArgs", "clusterName");
            }
            if ($.customDatas == null) {
                throw new MissingRequiredPropertyException("CloudBackupSnapshotExportJobArgs", "customDatas");
            }
            if ($.exportBucketId == null) {
                throw new MissingRequiredPropertyException("CloudBackupSnapshotExportJobArgs", "exportBucketId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("CloudBackupSnapshotExportJobArgs", "projectId");
            }
            if ($.snapshotId == null) {
                throw new MissingRequiredPropertyException("CloudBackupSnapshotExportJobArgs", "snapshotId");
            }
            return $;
        }
    }

}