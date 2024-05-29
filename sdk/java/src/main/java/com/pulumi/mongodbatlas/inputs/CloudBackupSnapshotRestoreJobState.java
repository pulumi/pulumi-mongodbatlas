// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudBackupSnapshotRestoreJobState extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSnapshotRestoreJobState Empty = new CloudBackupSnapshotRestoreJobState();

    /**
     * Indicates whether the restore job was canceled.
     * 
     */
    @Import(name="cancelled")
    private @Nullable Output<Boolean> cancelled;

    /**
     * @return Indicates whether the restore job was canceled.
     * 
     */
    public Optional<Output<Boolean>> cancelled() {
        return Optional.ofNullable(this.cancelled);
    }

    /**
     * The name of the Atlas cluster whose snapshot you want to restore.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster whose snapshot you want to restore.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * UTC ISO 8601 formatted point in time when Atlas created the restore job.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return UTC ISO 8601 formatted point in time when Atlas created the restore job.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     * 
     */
    @Import(name="deliveryTypeConfig")
    private @Nullable Output<CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs> deliveryTypeConfig;

    /**
     * @return Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     * 
     */
    public Optional<Output<CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs>> deliveryTypeConfig() {
        return Optional.ofNullable(this.deliveryTypeConfig);
    }

    /**
     * One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     * 
     */
    @Import(name="deliveryUrls")
    private @Nullable Output<List<String>> deliveryUrls;

    /**
     * @return One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     * 
     */
    public Optional<Output<List<String>>> deliveryUrls() {
        return Optional.ofNullable(this.deliveryUrls);
    }

    /**
     * Indicates whether the restore job expired.
     * 
     */
    @Import(name="expired")
    private @Nullable Output<Boolean> expired;

    /**
     * @return Indicates whether the restore job expired.
     * 
     */
    public Optional<Output<Boolean>> expired() {
        return Optional.ofNullable(this.expired);
    }

    /**
     * UTC ISO 8601 formatted point in time when the restore job expires.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return UTC ISO 8601 formatted point in time when the restore job expires.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    @Import(name="finishedAt")
    private @Nullable Output<String> finishedAt;

    /**
     * @return UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    public Optional<Output<String>> finishedAt() {
        return Optional.ofNullable(this.finishedAt);
    }

    /**
     * The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * The unique identifier of the restore job.
     * 
     */
    @Import(name="snapshotRestoreJobId")
    private @Nullable Output<String> snapshotRestoreJobId;

    /**
     * @return The unique identifier of the restore job.
     * 
     */
    public Optional<Output<String>> snapshotRestoreJobId() {
        return Optional.ofNullable(this.snapshotRestoreJobId);
    }

    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
     *   Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogInc.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
     *   Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogTs.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
     *   Two conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
     * 
     */
    @Import(name="timestamp")
    private @Nullable Output<String> timestamp;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
     *   Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogInc.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
     *   Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogTs.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
     *   Two conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
     * 
     */
    public Optional<Output<String>> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    private CloudBackupSnapshotRestoreJobState() {}

    private CloudBackupSnapshotRestoreJobState(CloudBackupSnapshotRestoreJobState $) {
        this.cancelled = $.cancelled;
        this.clusterName = $.clusterName;
        this.createdAt = $.createdAt;
        this.deliveryTypeConfig = $.deliveryTypeConfig;
        this.deliveryUrls = $.deliveryUrls;
        this.expired = $.expired;
        this.expiresAt = $.expiresAt;
        this.finishedAt = $.finishedAt;
        this.projectId = $.projectId;
        this.snapshotId = $.snapshotId;
        this.snapshotRestoreJobId = $.snapshotRestoreJobId;
        this.timestamp = $.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudBackupSnapshotRestoreJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBackupSnapshotRestoreJobState $;

        public Builder() {
            $ = new CloudBackupSnapshotRestoreJobState();
        }

        public Builder(CloudBackupSnapshotRestoreJobState defaults) {
            $ = new CloudBackupSnapshotRestoreJobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cancelled Indicates whether the restore job was canceled.
         * 
         * @return builder
         * 
         */
        public Builder cancelled(@Nullable Output<Boolean> cancelled) {
            $.cancelled = cancelled;
            return this;
        }

        /**
         * @param cancelled Indicates whether the restore job was canceled.
         * 
         * @return builder
         * 
         */
        public Builder cancelled(Boolean cancelled) {
            return cancelled(Output.of(cancelled));
        }

        /**
         * @param clusterName The name of the Atlas cluster whose snapshot you want to restore.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Atlas cluster whose snapshot you want to restore.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param createdAt UTC ISO 8601 formatted point in time when Atlas created the restore job.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.18.0.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt UTC ISO 8601 formatted point in time when Atlas created the restore job.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.18.0.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param deliveryTypeConfig Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
         * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
         * * `delivery_type_config.download` - Set to `true` to use the download configuration.
         * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
         * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
         * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
         * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
         * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
         * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
         * 
         * @return builder
         * 
         */
        public Builder deliveryTypeConfig(@Nullable Output<CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs> deliveryTypeConfig) {
            $.deliveryTypeConfig = deliveryTypeConfig;
            return this;
        }

        /**
         * @param deliveryTypeConfig Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
         * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
         * * `delivery_type_config.download` - Set to `true` to use the download configuration.
         * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
         * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
         * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
         * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
         * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
         * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
         * 
         * @return builder
         * 
         */
        public Builder deliveryTypeConfig(CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs deliveryTypeConfig) {
            return deliveryTypeConfig(Output.of(deliveryTypeConfig));
        }

        /**
         * @param deliveryUrls One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
         * 
         * @return builder
         * 
         */
        public Builder deliveryUrls(@Nullable Output<List<String>> deliveryUrls) {
            $.deliveryUrls = deliveryUrls;
            return this;
        }

        /**
         * @param deliveryUrls One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
         * 
         * @return builder
         * 
         */
        public Builder deliveryUrls(List<String> deliveryUrls) {
            return deliveryUrls(Output.of(deliveryUrls));
        }

        /**
         * @param deliveryUrls One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
         * 
         * @return builder
         * 
         */
        public Builder deliveryUrls(String... deliveryUrls) {
            return deliveryUrls(List.of(deliveryUrls));
        }

        /**
         * @param expired Indicates whether the restore job expired.
         * 
         * @return builder
         * 
         */
        public Builder expired(@Nullable Output<Boolean> expired) {
            $.expired = expired;
            return this;
        }

        /**
         * @param expired Indicates whether the restore job expired.
         * 
         * @return builder
         * 
         */
        public Builder expired(Boolean expired) {
            return expired(Output.of(expired));
        }

        /**
         * @param expiresAt UTC ISO 8601 formatted point in time when the restore job expires.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt UTC ISO 8601 formatted point in time when the restore job expires.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param finishedAt UTC ISO 8601 formatted point in time when the restore job completed.
         * 
         * @return builder
         * 
         */
        public Builder finishedAt(@Nullable Output<String> finishedAt) {
            $.finishedAt = finishedAt;
            return this;
        }

        /**
         * @param finishedAt UTC ISO 8601 formatted point in time when the restore job completed.
         * 
         * @return builder
         * 
         */
        public Builder finishedAt(String finishedAt) {
            return finishedAt(Output.of(finishedAt));
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param snapshotId Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param snapshotRestoreJobId The unique identifier of the restore job.
         * 
         * @return builder
         * 
         */
        public Builder snapshotRestoreJobId(@Nullable Output<String> snapshotRestoreJobId) {
            $.snapshotRestoreJobId = snapshotRestoreJobId;
            return this;
        }

        /**
         * @param snapshotRestoreJobId The unique identifier of the restore job.
         * 
         * @return builder
         * 
         */
        public Builder snapshotRestoreJobId(String snapshotRestoreJobId) {
            return snapshotRestoreJobId(Output.of(snapshotRestoreJobId));
        }

        /**
         * @param timestamp Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
         * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
         *   Three conditions apply to this parameter:
         * * Enable Continuous Cloud Backup on your cluster.
         * * Specify oplogInc.
         * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
         * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
         *   Three conditions apply to this parameter:
         * * Enable Continuous Cloud Backup on your cluster.
         * * Specify oplogTs.
         * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
         * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
         *   Two conditions apply to this parameter:
         * * Enable Continuous Cloud Backup on your cluster.
         * * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(@Nullable Output<String> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param timestamp Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
         * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
         *   Three conditions apply to this parameter:
         * * Enable Continuous Cloud Backup on your cluster.
         * * Specify oplogInc.
         * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
         * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
         *   Three conditions apply to this parameter:
         * * Enable Continuous Cloud Backup on your cluster.
         * * Specify oplogTs.
         * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
         * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
         *   Two conditions apply to this parameter:
         * * Enable Continuous Cloud Backup on your cluster.
         * * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(String timestamp) {
            return timestamp(Output.of(timestamp));
        }

        public CloudBackupSnapshotRestoreJobState build() {
            return $;
        }
    }

}
