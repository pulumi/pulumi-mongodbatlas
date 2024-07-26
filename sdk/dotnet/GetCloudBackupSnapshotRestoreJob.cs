// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSnapshotRestoreJob
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.CloudBackupSnapshotRestoreJob
        /// 
        /// `mongodbatlas.CloudBackupSnapshotRestoreJob` provides a Cloud Backup Snapshot Restore Job datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetCloudBackupSnapshotRestoreJobResult> InvokeAsync(GetCloudBackupSnapshotRestoreJobArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupSnapshotRestoreJobResult>("mongodbatlas:index/getCloudBackupSnapshotRestoreJob:getCloudBackupSnapshotRestoreJob", args ?? new GetCloudBackupSnapshotRestoreJobArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.CloudBackupSnapshotRestoreJob
        /// 
        /// `mongodbatlas.CloudBackupSnapshotRestoreJob` provides a Cloud Backup Snapshot Restore Job datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Output<GetCloudBackupSnapshotRestoreJobResult> Invoke(GetCloudBackupSnapshotRestoreJobInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotRestoreJobResult>("mongodbatlas:index/getCloudBackupSnapshotRestoreJob:getCloudBackupSnapshotRestoreJob", args ?? new GetCloudBackupSnapshotRestoreJobInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupSnapshotRestoreJobArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster for which you want to retrieve the restore job.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// A base64-encoded ID  of `project_id`, `cluster_name`, and `job_id` of this resource. **Note**: This attribute is deprecated, use `snapshot_restore_job_id` instead.
        /// </summary>
        [Input("jobId")]
        public string? JobId { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the restore job to retrieve. Required for versions 1.18.0 and later.
        /// </summary>
        [Input("snapshotRestoreJobId")]
        public string? SnapshotRestoreJobId { get; set; }

        public GetCloudBackupSnapshotRestoreJobArgs()
        {
        }
        public static new GetCloudBackupSnapshotRestoreJobArgs Empty => new GetCloudBackupSnapshotRestoreJobArgs();
    }

    public sealed class GetCloudBackupSnapshotRestoreJobInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster for which you want to retrieve the restore job.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// A base64-encoded ID  of `project_id`, `cluster_name`, and `job_id` of this resource. **Note**: This attribute is deprecated, use `snapshot_restore_job_id` instead.
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the restore job to retrieve. Required for versions 1.18.0 and later.
        /// </summary>
        [Input("snapshotRestoreJobId")]
        public Input<string>? SnapshotRestoreJobId { get; set; }

        public GetCloudBackupSnapshotRestoreJobInvokeArgs()
        {
        }
        public static new GetCloudBackupSnapshotRestoreJobInvokeArgs Empty => new GetCloudBackupSnapshotRestoreJobInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupSnapshotRestoreJobResult
    {
        /// <summary>
        /// Indicates whether the restore job was canceled.
        /// </summary>
        public readonly bool Cancelled;
        public readonly string ClusterName;
        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas created the restore job.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Type of restore job to create. Possible values are: automated and download.
        /// </summary>
        public readonly string DeliveryType;
        /// <summary>
        /// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        /// </summary>
        public readonly ImmutableArray<string> DeliveryUrls;
        /// <summary>
        /// Indicates whether the restore job expired.
        /// </summary>
        public readonly bool Expired;
        /// <summary>
        /// UTC ISO 8601 formatted point in time when the restore job expires.
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// UTC ISO 8601 formatted point in time when the restore job completed.
        /// </summary>
        public readonly string FinishedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? JobId;
        public readonly int OplogInc;
        public readonly int OplogTs;
        public readonly int PointInTimeUtcSeconds;
        public readonly string ProjectId;
        /// <summary>
        /// Unique identifier of the source snapshot ID of the restore job.
        /// </summary>
        public readonly string SnapshotId;
        public readonly string? SnapshotRestoreJobId;
        /// <summary>
        /// Name of the target Atlas cluster to which the restore job restores the snapshot. Only visible if deliveryType is automated.
        /// </summary>
        public readonly string TargetClusterName;
        /// <summary>
        /// Name of the target Atlas project of the restore job. Only visible if deliveryType is automated.
        /// </summary>
        public readonly string TargetProjectId;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        /// * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch.
        /// * `oplogInc` - Oplog operation number from which to you want to restore this snapshot.
        /// * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch.
        /// </summary>
        public readonly string Timestamp;

        [OutputConstructor]
        private GetCloudBackupSnapshotRestoreJobResult(
            bool cancelled,

            string clusterName,

            string createdAt,

            string deliveryType,

            ImmutableArray<string> deliveryUrls,

            bool expired,

            string expiresAt,

            string finishedAt,

            string id,

            string? jobId,

            int oplogInc,

            int oplogTs,

            int pointInTimeUtcSeconds,

            string projectId,

            string snapshotId,

            string? snapshotRestoreJobId,

            string targetClusterName,

            string targetProjectId,

            string timestamp)
        {
            Cancelled = cancelled;
            ClusterName = clusterName;
            CreatedAt = createdAt;
            DeliveryType = deliveryType;
            DeliveryUrls = deliveryUrls;
            Expired = expired;
            ExpiresAt = expiresAt;
            FinishedAt = finishedAt;
            Id = id;
            JobId = jobId;
            OplogInc = oplogInc;
            OplogTs = oplogTs;
            PointInTimeUtcSeconds = pointInTimeUtcSeconds;
            ProjectId = projectId;
            SnapshotId = snapshotId;
            SnapshotRestoreJobId = snapshotRestoreJobId;
            TargetClusterName = targetClusterName;
            TargetProjectId = targetProjectId;
            Timestamp = timestamp;
        }
    }
}
