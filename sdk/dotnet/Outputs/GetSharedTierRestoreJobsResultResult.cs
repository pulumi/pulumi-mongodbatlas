// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetSharedTierRestoreJobsResultResult
    {
        public readonly string DeliveryType;
        public readonly string ExpirationDate;
        public readonly string JobId;
        public readonly string RestoreFinishedDate;
        public readonly string RestoreScheduledDate;
        public readonly string SnapshotFinishedDate;
        public readonly string SnapshotId;
        public readonly string SnapshotUrl;
        public readonly string Status;
        public readonly string TargetDeploymentItemName;
        public readonly string TargetProjectId;

        [OutputConstructor]
        private GetSharedTierRestoreJobsResultResult(
            string deliveryType,

            string expirationDate,

            string jobId,

            string restoreFinishedDate,

            string restoreScheduledDate,

            string snapshotFinishedDate,

            string snapshotId,

            string snapshotUrl,

            string status,

            string targetDeploymentItemName,

            string targetProjectId)
        {
            DeliveryType = deliveryType;
            ExpirationDate = expirationDate;
            JobId = jobId;
            RestoreFinishedDate = restoreFinishedDate;
            RestoreScheduledDate = restoreScheduledDate;
            SnapshotFinishedDate = snapshotFinishedDate;
            SnapshotId = snapshotId;
            SnapshotUrl = snapshotUrl;
            Status = status;
            TargetDeploymentItemName = targetDeploymentItemName;
            TargetProjectId = targetProjectId;
        }
    }
}
