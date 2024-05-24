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
    public sealed class GetCloudBackupSnapshotExportJobsResultResult
    {
        /// <summary>
        /// _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobsResultComponentResult> Components;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobsResultCustomDataResult> CustomDatas;
        /// <summary>
        /// Error message, only if the export job failed.
        /// </summary>
        public readonly string ErrMsg;
        /// <summary>
        /// Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
        /// </summary>
        public readonly string ExportBucketId;
        /// <summary>
        /// Unique identifier of the export job.
        /// * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
        /// </summary>
        public readonly string ExportJobId;
        public readonly int ExportStatusExportedCollections;
        public readonly int ExportStatusTotalCollections;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job completes.
        /// </summary>
        public readonly string FinishedAt;
        public readonly string Prefix;
        /// <summary>
        /// Unique identifier of the Cloud Backup snapshot to export.
        /// </summary>
        public readonly string SnapshotId;
        /// <summary>
        /// Status of the export job. Value can be one of the following:
        /// * `Queued` - indicates that the export job is queued
        /// * `InProgress` - indicates that the snapshot is being exported
        /// * `Successful` - indicates that the export job has completed successfully
        /// * `Failed` - indicates that the export job has failed
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetCloudBackupSnapshotExportJobsResultResult(
            ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobsResultComponentResult> components,

            string createdAt,

            ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobsResultCustomDataResult> customDatas,

            string errMsg,

            string exportBucketId,

            string exportJobId,

            int exportStatusExportedCollections,

            int exportStatusTotalCollections,

            string finishedAt,

            string prefix,

            string snapshotId,

            string state)
        {
            Components = components;
            CreatedAt = createdAt;
            CustomDatas = customDatas;
            ErrMsg = errMsg;
            ExportBucketId = exportBucketId;
            ExportJobId = exportJobId;
            ExportStatusExportedCollections = exportStatusExportedCollections;
            ExportStatusTotalCollections = exportStatusTotalCollections;
            FinishedAt = finishedAt;
            Prefix = prefix;
            SnapshotId = snapshotId;
            State = state;
        }
    }
}
