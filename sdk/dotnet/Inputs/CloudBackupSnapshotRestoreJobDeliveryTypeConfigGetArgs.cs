// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudBackupSnapshotRestoreJobDeliveryTypeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to `true` to use the automated configuration.
        /// </summary>
        [Input("automated")]
        public Input<bool>? Automated { get; set; }

        /// <summary>
        /// Set to `true` to use the download configuration.
        /// </summary>
        [Input("download")]
        public Input<bool>? Download { get; set; }

        /// <summary>
        /// Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        /// </summary>
        [Input("oplogInc")]
        public Input<int>? OplogInc { get; set; }

        /// <summary>
        /// Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        /// </summary>
        [Input("oplogTs")]
        public Input<int>? OplogTs { get; set; }

        [Input("pointInTime")]
        public Input<bool>? PointInTime { get; set; }

        /// <summary>
        /// Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        /// </summary>
        [Input("pointInTimeUtcSeconds")]
        public Input<int>? PointInTimeUtcSeconds { get; set; }

        /// <summary>
        /// Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// </summary>
        [Input("targetClusterName")]
        public Input<string>? TargetClusterName { get; set; }

        /// <summary>
        /// Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        /// </summary>
        [Input("targetProjectId")]
        public Input<string>? TargetProjectId { get; set; }

        public CloudBackupSnapshotRestoreJobDeliveryTypeConfigGetArgs()
        {
        }
        public static new CloudBackupSnapshotRestoreJobDeliveryTypeConfigGetArgs Empty => new CloudBackupSnapshotRestoreJobDeliveryTypeConfigGetArgs();
    }
}
