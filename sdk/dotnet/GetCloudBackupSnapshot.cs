// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSnapshot
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.CloudBackupSnapshot
        /// 
        /// `mongodbatlas.CloudBackupSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
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
        ///     var testCloudBackupSnapshot = new Mongodbatlas.CloudBackupSnapshot("test", new()
        ///     {
        ///         ProjectId = "5d0f1f73cf09a29120e173cf",
        ///         ClusterName = "MyClusterTest",
        ///         Description = "SomeDescription",
        ///         RetentionInDays = 1,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshot.Invoke(new()
        ///     {
        ///         SnapshotId = "5d1285acd5ec13b6c2d1726a",
        ///         ProjectId = testCloudBackupSnapshot.ProjectId,
        ///         ClusterName = testCloudBackupSnapshot.ClusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudBackupSnapshotResult> InvokeAsync(GetCloudBackupSnapshotArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupSnapshotResult>("mongodbatlas:index/getCloudBackupSnapshot:getCloudBackupSnapshot", args ?? new GetCloudBackupSnapshotArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.CloudBackupSnapshot
        /// 
        /// `mongodbatlas.CloudBackupSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
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
        ///     var testCloudBackupSnapshot = new Mongodbatlas.CloudBackupSnapshot("test", new()
        ///     {
        ///         ProjectId = "5d0f1f73cf09a29120e173cf",
        ///         ClusterName = "MyClusterTest",
        ///         Description = "SomeDescription",
        ///         RetentionInDays = 1,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshot.Invoke(new()
        ///     {
        ///         SnapshotId = "5d1285acd5ec13b6c2d1726a",
        ///         ProjectId = testCloudBackupSnapshot.ProjectId,
        ///         ClusterName = testCloudBackupSnapshot.ClusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudBackupSnapshotResult> Invoke(GetCloudBackupSnapshotInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotResult>("mongodbatlas:index/getCloudBackupSnapshot:getCloudBackupSnapshot", args ?? new GetCloudBackupSnapshotInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.CloudBackupSnapshot
        /// 
        /// `mongodbatlas.CloudBackupSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
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
        ///     var testCloudBackupSnapshot = new Mongodbatlas.CloudBackupSnapshot("test", new()
        ///     {
        ///         ProjectId = "5d0f1f73cf09a29120e173cf",
        ///         ClusterName = "MyClusterTest",
        ///         Description = "SomeDescription",
        ///         RetentionInDays = 1,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshot.Invoke(new()
        ///     {
        ///         SnapshotId = "5d1285acd5ec13b6c2d1726a",
        ///         ProjectId = testCloudBackupSnapshot.ProjectId,
        ///         ClusterName = testCloudBackupSnapshot.ClusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudBackupSnapshotResult> Invoke(GetCloudBackupSnapshotInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotResult>("mongodbatlas:index/getCloudBackupSnapshot:getCloudBackupSnapshot", args ?? new GetCloudBackupSnapshotInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupSnapshotArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster that contains the snapshot you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the snapshot you want to retrieve.
        /// </summary>
        [Input("snapshotId", required: true)]
        public string SnapshotId { get; set; } = null!;

        public GetCloudBackupSnapshotArgs()
        {
        }
        public static new GetCloudBackupSnapshotArgs Empty => new GetCloudBackupSnapshotArgs();
    }

    public sealed class GetCloudBackupSnapshotInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster that contains the snapshot you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the snapshot you want to retrieve.
        /// </summary>
        [Input("snapshotId", required: true)]
        public Input<string> SnapshotId { get; set; } = null!;

        public GetCloudBackupSnapshotInvokeArgs()
        {
        }
        public static new GetCloudBackupSnapshotInvokeArgs Empty => new GetCloudBackupSnapshotInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupSnapshotResult
    {
        /// <summary>
        /// Cloud provider that stores this snapshot.
        /// </summary>
        public readonly string CloudProvider;
        public readonly string ClusterName;
        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// UDescription of the snapshot. Only present for on-demand snapshots.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        /// </summary>
        public readonly string MasterKeyUuid;
        /// <summary>
        /// Block of List of snapshots and the cloud provider where the snapshots are stored. See below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotMemberResult> Members;
        /// <summary>
        /// Version of the MongoDB server.
        /// </summary>
        public readonly string MongodVersion;
        public readonly string ProjectId;
        /// <summary>
        /// Label given to a shard or config server from which Atlas took this snapshot.
        /// </summary>
        public readonly string ReplicaSetName;
        public readonly string SnapshotId;
        /// <summary>
        /// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster.
        /// </summary>
        public readonly ImmutableArray<string> SnapshotIds;
        /// <summary>
        /// Specified the type of snapshot. Valid values are onDemand and scheduled.
        /// </summary>
        public readonly string SnapshotType;
        /// <summary>
        /// Current status of the snapshot. One of the following values: queued, inProgress, completed, failed.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Specifies the size of the snapshot in bytes.
        /// </summary>
        public readonly int StorageSizeBytes;
        /// <summary>
        /// Specifies the type of cluster: replicaSet or shardedCluster.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCloudBackupSnapshotResult(
            string cloudProvider,

            string clusterName,

            string createdAt,

            string description,

            string expiresAt,

            string id,

            string masterKeyUuid,

            ImmutableArray<Outputs.GetCloudBackupSnapshotMemberResult> members,

            string mongodVersion,

            string projectId,

            string replicaSetName,

            string snapshotId,

            ImmutableArray<string> snapshotIds,

            string snapshotType,

            string status,

            int storageSizeBytes,

            string type)
        {
            CloudProvider = cloudProvider;
            ClusterName = clusterName;
            CreatedAt = createdAt;
            Description = description;
            ExpiresAt = expiresAt;
            Id = id;
            MasterKeyUuid = masterKeyUuid;
            Members = members;
            MongodVersion = mongodVersion;
            ProjectId = projectId;
            ReplicaSetName = replicaSetName;
            SnapshotId = snapshotId;
            SnapshotIds = snapshotIds;
            SnapshotType = snapshotType;
            Status = status;
            StorageSizeBytes = storageSizeBytes;
            Type = type;
        }
    }
}
