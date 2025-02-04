// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotExportJobComponentArgs;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotExportJobCustomDataArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudBackupSnapshotExportJobState extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSnapshotExportJobState Empty = new CloudBackupSnapshotExportJobState();

    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     * 
     */
    @Import(name="components")
    private @Nullable Output<List<CloudBackupSnapshotExportJobComponentArgs>> components;

    /**
     * @return _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     * 
     */
    public Optional<Output<List<CloudBackupSnapshotExportJobComponentArgs>>> components() {
        return Optional.ofNullable(this.components);
    }

    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    @Import(name="customDatas")
    private @Nullable Output<List<CloudBackupSnapshotExportJobCustomDataArgs>> customDatas;

    /**
     * @return Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    public Optional<Output<List<CloudBackupSnapshotExportJobCustomDataArgs>>> customDatas() {
        return Optional.ofNullable(this.customDatas);
    }

    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
     * 
     */
    @Import(name="exportBucketId")
    private @Nullable Output<String> exportBucketId;

    /**
     * @return Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
     * 
     */
    public Optional<Output<String>> exportBucketId() {
        return Optional.ofNullable(this.exportBucketId);
    }

    /**
     * Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    @Import(name="exportJobId")
    private @Nullable Output<String> exportJobId;

    /**
     * @return Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    public Optional<Output<String>> exportJobId() {
        return Optional.ofNullable(this.exportJobId);
    }

    @Import(name="exportStatusExportedCollections")
    private @Nullable Output<Integer> exportStatusExportedCollections;

    public Optional<Output<Integer>> exportStatusExportedCollections() {
        return Optional.ofNullable(this.exportStatusExportedCollections);
    }

    @Import(name="exportStatusTotalCollections")
    private @Nullable Output<Integer> exportStatusTotalCollections;

    public Optional<Output<Integer>> exportStatusTotalCollections() {
        return Optional.ofNullable(this.exportStatusTotalCollections);
    }

    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    @Import(name="finishedAt")
    private @Nullable Output<String> finishedAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    public Optional<Output<String>> finishedAt() {
        return Optional.ofNullable(this.finishedAt);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     * * `Cancelled` - indicates that the export job has cancelled
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     * * `Cancelled` - indicates that the export job has cancelled
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private CloudBackupSnapshotExportJobState() {}

    private CloudBackupSnapshotExportJobState(CloudBackupSnapshotExportJobState $) {
        this.clusterName = $.clusterName;
        this.components = $.components;
        this.createdAt = $.createdAt;
        this.customDatas = $.customDatas;
        this.exportBucketId = $.exportBucketId;
        this.exportJobId = $.exportJobId;
        this.exportStatusExportedCollections = $.exportStatusExportedCollections;
        this.exportStatusTotalCollections = $.exportStatusTotalCollections;
        this.finishedAt = $.finishedAt;
        this.prefix = $.prefix;
        this.projectId = $.projectId;
        this.snapshotId = $.snapshotId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudBackupSnapshotExportJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBackupSnapshotExportJobState $;

        public Builder() {
            $ = new CloudBackupSnapshotExportJobState();
        }

        public Builder(CloudBackupSnapshotExportJobState defaults) {
            $ = new CloudBackupSnapshotExportJobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Atlas cluster whose snapshot you want to export.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
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
         * @param components _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
         * 
         * @return builder
         * 
         */
        public Builder components(@Nullable Output<List<CloudBackupSnapshotExportJobComponentArgs>> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
         * 
         * @return builder
         * 
         */
        public Builder components(List<CloudBackupSnapshotExportJobComponentArgs> components) {
            return components(Output.of(components));
        }

        /**
         * @param components _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
         * 
         * @return builder
         * 
         */
        public Builder components(CloudBackupSnapshotExportJobComponentArgs... components) {
            return components(List.of(components));
        }

        /**
         * @param createdAt Timestamp in ISO 8601 date and time format in UTC when the export job was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Timestamp in ISO 8601 date and time format in UTC when the export job was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param customDatas Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
         * 
         * @return builder
         * 
         */
        public Builder customDatas(@Nullable Output<List<CloudBackupSnapshotExportJobCustomDataArgs>> customDatas) {
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
        public Builder exportBucketId(@Nullable Output<String> exportBucketId) {
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
         * @param exportJobId Unique identifier of the export job.
         * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
         * 
         * @return builder
         * 
         */
        public Builder exportJobId(@Nullable Output<String> exportJobId) {
            $.exportJobId = exportJobId;
            return this;
        }

        /**
         * @param exportJobId Unique identifier of the export job.
         * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
         * 
         * @return builder
         * 
         */
        public Builder exportJobId(String exportJobId) {
            return exportJobId(Output.of(exportJobId));
        }

        public Builder exportStatusExportedCollections(@Nullable Output<Integer> exportStatusExportedCollections) {
            $.exportStatusExportedCollections = exportStatusExportedCollections;
            return this;
        }

        public Builder exportStatusExportedCollections(Integer exportStatusExportedCollections) {
            return exportStatusExportedCollections(Output.of(exportStatusExportedCollections));
        }

        public Builder exportStatusTotalCollections(@Nullable Output<Integer> exportStatusTotalCollections) {
            $.exportStatusTotalCollections = exportStatusTotalCollections;
            return this;
        }

        public Builder exportStatusTotalCollections(Integer exportStatusTotalCollections) {
            return exportStatusTotalCollections(Output.of(exportStatusTotalCollections));
        }

        /**
         * @param finishedAt Timestamp in ISO 8601 date and time format in UTC when the export job completes.
         * 
         * @return builder
         * 
         */
        public Builder finishedAt(@Nullable Output<String> finishedAt) {
            $.finishedAt = finishedAt;
            return this;
        }

        /**
         * @param finishedAt Timestamp in ISO 8601 date and time format in UTC when the export job completes.
         * 
         * @return builder
         * 
         */
        public Builder finishedAt(String finishedAt) {
            return finishedAt(Output.of(finishedAt));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
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
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
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

        /**
         * @param state Status of the export job. Value can be one of the following:
         * * `Queued` - indicates that the export job is queued
         * * `InProgress` - indicates that the snapshot is being exported
         * * `Successful` - indicates that the export job has completed successfully
         * * `Failed` - indicates that the export job has failed
         * * `Cancelled` - indicates that the export job has cancelled
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Status of the export job. Value can be one of the following:
         * * `Queued` - indicates that the export job is queued
         * * `InProgress` - indicates that the snapshot is being exported
         * * `Successful` - indicates that the export job has completed successfully
         * * `Failed` - indicates that the export job has failed
         * * `Cancelled` - indicates that the export job has cancelled
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public CloudBackupSnapshotExportJobState build() {
            return $;
        }
    }

}
