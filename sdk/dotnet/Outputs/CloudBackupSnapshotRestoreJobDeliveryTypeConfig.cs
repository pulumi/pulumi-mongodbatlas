// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class CloudBackupSnapshotRestoreJobDeliveryTypeConfig
    {
        public readonly bool? Automated;
        public readonly bool? Download;
        public readonly int? OplogInc;
        public readonly int? OplogTs;
        public readonly bool? PointInTime;
        public readonly int? PointInTimeUtcSeconds;
        /// <summary>
        /// Name of the target Atlas cluster to which the restore job restores the snapshot. Only visible if deliveryType is automated.
        /// </summary>
        public readonly string? TargetClusterName;
        /// <summary>
        /// Name of the target Atlas project of the restore job. Only visible if deliveryType is automated.
        /// </summary>
        public readonly string? TargetProjectId;

        [OutputConstructor]
        private CloudBackupSnapshotRestoreJobDeliveryTypeConfig(
            bool? automated,

            bool? download,

            int? oplogInc,

            int? oplogTs,

            bool? pointInTime,

            int? pointInTimeUtcSeconds,

            string? targetClusterName,

            string? targetProjectId)
        {
            Automated = automated;
            Download = download;
            OplogInc = oplogInc;
            OplogTs = oplogTs;
            PointInTime = pointInTime;
            PointInTimeUtcSeconds = pointInTimeUtcSeconds;
            TargetClusterName = targetClusterName;
            TargetProjectId = targetProjectId;
        }
    }
}
