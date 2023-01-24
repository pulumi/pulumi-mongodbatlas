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
    /// Cloud Backup Snapshot entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-SNAPSHOTID`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot test 5d0f1f73cf09a29120e173cf-MyClusterTest-5d116d82014b764445b2f9b5
    /// ```
    /// 
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/backups/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot")]
    public partial class CloudBackupSnapshot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cloud provider that stores this snapshot.
        /// </summary>
        [Output("cloudProvider")]
        public Output<string> CloudProvider { get; private set; } = null!;

        /// <summary>
        /// The name of the Atlas cluster that contains the snapshots you want to retrieve.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Description of the on-demand snapshot.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        /// </summary>
        [Output("expiresAt")]
        public Output<string> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        /// </summary>
        [Output("masterKeyUuid")]
        public Output<string> MasterKeyUuid { get; private set; } = null!;

        /// <summary>
        /// Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<Outputs.CloudBackupSnapshotMember>> Members { get; private set; } = null!;

        /// <summary>
        /// Version of the MongoDB server.
        /// </summary>
        [Output("mongodVersion")]
        public Output<string> MongodVersion { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Label given to a shard or config server from which Atlas took this snapshot.
        /// </summary>
        [Output("replicaSetName")]
        public Output<string> ReplicaSetName { get; private set; } = null!;

        /// <summary>
        /// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        /// </summary>
        [Output("retentionInDays")]
        public Output<int> RetentionInDays { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the snapshot.
        /// </summary>
        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
        /// </summary>
        [Output("snapshotIds")]
        public Output<ImmutableArray<string>> SnapshotIds { get; private set; } = null!;

        /// <summary>
        /// Specified the type of snapshot. Valid values are onDemand and scheduled.
        /// </summary>
        [Output("snapshotType")]
        public Output<string> SnapshotType { get; private set; } = null!;

        /// <summary>
        /// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Specifies the size of the snapshot in bytes.
        /// </summary>
        [Output("storageSizeBytes")]
        public Output<int> StorageSizeBytes { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of cluster: replicaSet or shardedCluster.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a CloudBackupSnapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudBackupSnapshot(string name, CloudBackupSnapshotArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot", name, args ?? new CloudBackupSnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudBackupSnapshot(string name, Input<string> id, CloudBackupSnapshotState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CloudBackupSnapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudBackupSnapshot Get(string name, Input<string> id, CloudBackupSnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudBackupSnapshot(name, id, state, options);
        }
    }

    public sealed class CloudBackupSnapshotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Atlas cluster that contains the snapshots you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// Description of the on-demand snapshot.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        /// </summary>
        [Input("retentionInDays", required: true)]
        public Input<int> RetentionInDays { get; set; } = null!;

        public CloudBackupSnapshotArgs()
        {
        }
        public static new CloudBackupSnapshotArgs Empty => new CloudBackupSnapshotArgs();
    }

    public sealed class CloudBackupSnapshotState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud provider that stores this snapshot.
        /// </summary>
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        /// <summary>
        /// The name of the Atlas cluster that contains the snapshots you want to retrieve.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Description of the on-demand snapshot.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        /// </summary>
        [Input("masterKeyUuid")]
        public Input<string>? MasterKeyUuid { get; set; }

        [Input("members")]
        private InputList<Inputs.CloudBackupSnapshotMemberGetArgs>? _members;

        /// <summary>
        /// Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
        /// </summary>
        public InputList<Inputs.CloudBackupSnapshotMemberGetArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.CloudBackupSnapshotMemberGetArgs>());
            set => _members = value;
        }

        /// <summary>
        /// Version of the MongoDB server.
        /// </summary>
        [Input("mongodVersion")]
        public Input<string>? MongodVersion { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Label given to a shard or config server from which Atlas took this snapshot.
        /// </summary>
        [Input("replicaSetName")]
        public Input<string>? ReplicaSetName { get; set; }

        /// <summary>
        /// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        /// </summary>
        [Input("retentionInDays")]
        public Input<int>? RetentionInDays { get; set; }

        /// <summary>
        /// Unique identifier of the snapshot.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("snapshotIds")]
        private InputList<string>? _snapshotIds;

        /// <summary>
        /// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
        /// </summary>
        public InputList<string> SnapshotIds
        {
            get => _snapshotIds ?? (_snapshotIds = new InputList<string>());
            set => _snapshotIds = value;
        }

        /// <summary>
        /// Specified the type of snapshot. Valid values are onDemand and scheduled.
        /// </summary>
        [Input("snapshotType")]
        public Input<string>? SnapshotType { get; set; }

        /// <summary>
        /// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Specifies the size of the snapshot in bytes.
        /// </summary>
        [Input("storageSizeBytes")]
        public Input<int>? StorageSizeBytes { get; set; }

        /// <summary>
        /// Specifies the type of cluster: replicaSet or shardedCluster.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public CloudBackupSnapshotState()
        {
        }
        public static new CloudBackupSnapshotState Empty => new CloudBackupSnapshotState();
    }
}
