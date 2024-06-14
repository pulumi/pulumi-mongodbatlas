// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSnapshotExportJob
    {
        /// <summary>
        /// `mongodbatlas.CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         IamRoleId = "{IAM_ROLE_ID}",
        ///         BucketName = "example_bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportJob = new Mongodbatlas.CloudBackupSnapshotExportJob("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         SnapshotId = "{SNAPSHOT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///         CustomDatas = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudBackupSnapshotExportJobCustomDataArgs
        ///             {
        ///                 Key = "exported by",
        ///                 Value = "myName",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportJob.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         ExportJobId = testCloudBackupSnapshotExportJob.ExportJobId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudBackupSnapshotExportJobResult> InvokeAsync(GetCloudBackupSnapshotExportJobArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupSnapshotExportJobResult>("mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob", args ?? new GetCloudBackupSnapshotExportJobArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         IamRoleId = "{IAM_ROLE_ID}",
        ///         BucketName = "example_bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportJob = new Mongodbatlas.CloudBackupSnapshotExportJob("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         SnapshotId = "{SNAPSHOT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///         CustomDatas = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudBackupSnapshotExportJobCustomDataArgs
        ///             {
        ///                 Key = "exported by",
        ///                 Value = "myName",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportJob.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         ExportJobId = testCloudBackupSnapshotExportJob.ExportJobId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudBackupSnapshotExportJobResult> Invoke(GetCloudBackupSnapshotExportJobInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotExportJobResult>("mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob", args ?? new GetCloudBackupSnapshotExportJobInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupSnapshotExportJobArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas cluster whose export job you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the export job to retrieve.
        /// </summary>
        [Input("exportJobId", required: true)]
        public string ExportJobId { get; set; } = null!;

        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudBackupSnapshotExportJobArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportJobArgs Empty => new GetCloudBackupSnapshotExportJobArgs();
    }

    public sealed class GetCloudBackupSnapshotExportJobInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas cluster whose export job you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the export job to retrieve.
        /// </summary>
        [Input("exportJobId", required: true)]
        public Input<string> ExportJobId { get; set; } = null!;

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetCloudBackupSnapshotExportJobInvokeArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportJobInvokeArgs Empty => new GetCloudBackupSnapshotExportJobInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupSnapshotExportJobResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobComponentResult> Components;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobCustomDataResult> CustomDatas;
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
        public readonly string Id;
        public readonly string Prefix;
        public readonly string ProjectId;
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
        private GetCloudBackupSnapshotExportJobResult(
            string clusterName,

            ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobComponentResult> components,

            string createdAt,

            ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobCustomDataResult> customDatas,

            string errMsg,

            string exportBucketId,

            string exportJobId,

            int exportStatusExportedCollections,

            int exportStatusTotalCollections,

            string finishedAt,

            string id,

            string prefix,

            string projectId,

            string snapshotId,

            string state)
        {
            ClusterName = clusterName;
            Components = components;
            CreatedAt = createdAt;
            CustomDatas = customDatas;
            ErrMsg = errMsg;
            ExportBucketId = exportBucketId;
            ExportJobId = exportJobId;
            ExportStatusExportedCollections = exportStatusExportedCollections;
            ExportStatusTotalCollections = exportStatusTotalCollections;
            FinishedAt = finishedAt;
            Id = id;
            Prefix = prefix;
            ProjectId = projectId;
            SnapshotId = snapshotId;
            State = state;
        }
    }
}