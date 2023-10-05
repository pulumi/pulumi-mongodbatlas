// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// ## Import
    /// 
    /// Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
    /// ```
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob")]
    public partial class CloudBackupSnapshotRestoreJob : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether the restore job was canceled.
        /// </summary>
        [Output("cancelled")]
        public Output<bool> Cancelled { get; private set; } = null!;

        /// <summary>
        /// The name of the Atlas cluster whose snapshot you want to restore.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas created the restore job.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
        /// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
        /// * `delivery_type_config.download` - Set to `true` to use the download configuration.
        /// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
        /// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        /// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        /// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        /// </summary>
        [Output("deliveryTypeConfig")]
        public Output<Outputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfig?> DeliveryTypeConfig { get; private set; } = null!;

        /// <summary>
        /// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        /// </summary>
        [Output("deliveryUrls")]
        public Output<ImmutableArray<string>> DeliveryUrls { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the restore job expired.
        /// </summary>
        [Output("expired")]
        public Output<bool> Expired { get; private set; } = null!;

        /// <summary>
        /// UTC ISO 8601 formatted point in time when the restore job expires.
        /// </summary>
        [Output("expiresAt")]
        public Output<string> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// UTC ISO 8601 formatted point in time when the restore job completed.
        /// </summary>
        [Output("finishedAt")]
        public Output<string> FinishedAt { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the snapshot to restore.
        /// </summary>
        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the restore job.
        /// </summary>
        [Output("snapshotRestoreJobId")]
        public Output<string> SnapshotRestoreJobId { get; private set; } = null!;

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        /// </summary>
        [Output("timestamp")]
        public Output<string> Timestamp { get; private set; } = null!;


        /// <summary>
        /// Create a CloudBackupSnapshotRestoreJob resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudBackupSnapshotRestoreJob(string name, CloudBackupSnapshotRestoreJobArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob", name, args ?? new CloudBackupSnapshotRestoreJobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudBackupSnapshotRestoreJob(string name, Input<string> id, CloudBackupSnapshotRestoreJobState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CloudBackupSnapshotRestoreJob resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudBackupSnapshotRestoreJob Get(string name, Input<string> id, CloudBackupSnapshotRestoreJobState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudBackupSnapshotRestoreJob(name, id, state, options);
        }
    }

    public sealed class CloudBackupSnapshotRestoreJobArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Atlas cluster whose snapshot you want to restore.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
        /// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
        /// * `delivery_type_config.download` - Set to `true` to use the download configuration.
        /// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
        /// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        /// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        /// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        /// </summary>
        [Input("deliveryTypeConfig")]
        public Input<Inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs>? DeliveryTypeConfig { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the snapshot to restore.
        /// </summary>
        [Input("snapshotId", required: true)]
        public Input<string> SnapshotId { get; set; } = null!;

        public CloudBackupSnapshotRestoreJobArgs()
        {
        }
        public static new CloudBackupSnapshotRestoreJobArgs Empty => new CloudBackupSnapshotRestoreJobArgs();
    }

    public sealed class CloudBackupSnapshotRestoreJobState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the restore job was canceled.
        /// </summary>
        [Input("cancelled")]
        public Input<bool>? Cancelled { get; set; }

        /// <summary>
        /// The name of the Atlas cluster whose snapshot you want to restore.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas created the restore job.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
        /// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
        /// * `delivery_type_config.download` - Set to `true` to use the download configuration.
        /// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
        /// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        /// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        /// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        /// </summary>
        [Input("deliveryTypeConfig")]
        public Input<Inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfigGetArgs>? DeliveryTypeConfig { get; set; }

        [Input("deliveryUrls")]
        private InputList<string>? _deliveryUrls;

        /// <summary>
        /// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        /// </summary>
        public InputList<string> DeliveryUrls
        {
            get => _deliveryUrls ?? (_deliveryUrls = new InputList<string>());
            set => _deliveryUrls = value;
        }

        /// <summary>
        /// Indicates whether the restore job expired.
        /// </summary>
        [Input("expired")]
        public Input<bool>? Expired { get; set; }

        /// <summary>
        /// UTC ISO 8601 formatted point in time when the restore job expires.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// UTC ISO 8601 formatted point in time when the restore job completed.
        /// </summary>
        [Input("finishedAt")]
        public Input<string>? FinishedAt { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Unique identifier of the snapshot to restore.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The unique identifier of the restore job.
        /// </summary>
        [Input("snapshotRestoreJobId")]
        public Input<string>? SnapshotRestoreJobId { get; set; }

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        /// </summary>
        [Input("timestamp")]
        public Input<string>? Timestamp { get; set; }

        public CloudBackupSnapshotRestoreJobState()
        {
        }
        public static new CloudBackupSnapshotRestoreJobState Empty => new CloudBackupSnapshotRestoreJobState();
    }
}
