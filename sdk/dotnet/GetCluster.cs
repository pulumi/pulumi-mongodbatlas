// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCluster
    {
        /// <summary>
        /// `mongodbatlas..Cluster` describes a Cluster. The. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:**
        /// &lt;br&gt; &amp;#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
        /// &lt;br&gt; &amp;#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClusterResult> InvokeAsync(GetClusterArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClusterResult>("mongodbatlas:index/getCluster:getCluster", args ?? new GetClusterArgs(), options.WithVersion());
    }


    public sealed class GetClusterArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetClusterArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetClusterResult
    {
        /// <summary>
        /// (Optional) Specifies whether cluster tier auto-scaling is enabled. The default is false.
        /// </summary>
        public readonly bool AutoScalingComputeEnabled;
        /// <summary>
        /// (Optional) Set to `true` to enable the cluster tier to scale down.
        /// </summary>
        public readonly bool AutoScalingComputeScaleDownEnabled;
        /// <summary>
        /// Indicates whether disk auto-scaling is enabled.
        /// </summary>
        public readonly bool AutoScalingDiskGbEnabled;
        /// <summary>
        /// Indicates Cloud service provider on which the server for a multi-tenant cluster is provisioned.
        /// </summary>
        public readonly string BackingProviderName;
        /// <summary>
        /// Legacy Option, Indicates whether Atlas continuous backups are enabled for the cluster.
        /// </summary>
        public readonly bool BackupEnabled;
        /// <summary>
        /// Indicates BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details.
        /// </summary>
        public readonly Outputs.GetClusterBiConnectorResult BiConnector;
        /// <summary>
        /// Indicates the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
        /// </summary>
        public readonly string ClusterType;
        /// <summary>
        /// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
        /// - `connection_strings.standard` -   Public mongodb:// connection string for this cluster.
        /// - `connection_strings.standard_srv` - Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t, use connectionStrings.standard.
        /// - `connection_strings.aws_private_link` -  [Private-endpoint-aware](https://docs.atlas.mongodb.com/security-private-endpoint/#private-endpoint-connection-strings) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a AWS PrivateLink connection to this cluster.
        /// - `connection_strings.aws_private_link_srv` - [Private-endpoint-aware](https://docs.atlas.mongodb.com/security-private-endpoint/#private-endpoint-connection-strings) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a AWS PrivateLink connection to this cluster. Use this URI format if your driver supports it. If it doesn’t, use connectionStrings.awsPrivateLink.
        /// - `connection_strings.private` -   [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
        /// - `connection_strings.private_srv` -  [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
        /// </summary>
        public readonly Outputs.GetClusterConnectionStringsResult ConnectionStrings;
        /// <summary>
        /// The Network Peering Container ID.
        /// </summary>
        public readonly string ContainerId;
        /// <summary>
        /// Indicates the size in gigabytes of the server’s root volume (AWS/GCP Only).
        /// </summary>
        public readonly double DiskSizeGb;
        /// <summary>
        /// Indicates whether Encryption at Rest is enabled or disabled.
        /// </summary>
        public readonly string EncryptionAtRestProvider;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetClusterLabelResult> Labels;
        /// <summary>
        /// Indicates the version of the cluster to deploy.
        /// </summary>
        public readonly string MongoDbMajorVersion;
        /// <summary>
        /// Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
        /// </summary>
        public readonly string MongoDbVersion;
        /// <summary>
        /// Base connection string for the cluster. Atlas only displays this field after the cluster is operational, not while it builds the cluster.
        /// </summary>
        public readonly string MongoUri;
        /// <summary>
        /// Lists when the connection string was last updated. The connection string changes, for example, if you change a replica set to a sharded cluster.
        /// </summary>
        public readonly string MongoUriUpdated;
        /// <summary>
        /// Describes connection string for connecting to the Atlas cluster. Includes the replicaSet, ssl, and authSource query parameters in the connection string with values appropriate for the cluster.
        /// </summary>
        public readonly string MongoUriWithOptions;
        /// <summary>
        /// The name of the current plugin
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Number of shards to deploy in the specified zone.
        /// </summary>
        public readonly int NumShards;
        /// <summary>
        /// Flag that indicates whether the cluster is paused or not.
        /// </summary>
        public readonly bool Paused;
        /// <summary>
        /// Flag that indicates if the cluster uses Continuous Cloud Backup.
        /// </summary>
        public readonly bool PitEnabled;
        public readonly string ProjectId;
        /// <summary>
        /// (Optional) Maximum instance size to which your cluster can automatically scale.
        /// </summary>
        public readonly string ProviderAutoScalingComputeMaxInstanceSize;
        /// <summary>
        /// (Optional) Minimum instance size to which your cluster can automatically scale.
        /// </summary>
        public readonly string ProviderAutoScalingComputeMinInstanceSize;
        /// <summary>
        /// Flag indicating if the cluster uses Cloud Backup Snapshots for backups.
        /// </summary>
        public readonly bool ProviderBackupEnabled;
        /// <summary>
        /// Indicates the maximum input/output operations per second (IOPS) the system can perform. The possible values depend on the selected providerSettings.instanceSizeName and diskSizeGB.
        /// </summary>
        public readonly int ProviderDiskIops;
        /// <summary>
        /// Describes Azure disk type of the server’s root volume (Azure Only).
        /// </summary>
        public readonly string ProviderDiskTypeName;
        /// <summary>
        /// Indicates whether the Amazon EBS encryption is enabled. This feature encrypts the server’s root volume for both data at rest within the volume and data moving between the volume and the instance.
        /// </summary>
        public readonly bool ProviderEncryptEbsVolume;
        /// <summary>
        /// Atlas provides different instance sizes, each with a default storage capacity and RAM size.
        /// </summary>
        public readonly string ProviderInstanceSizeName;
        /// <summary>
        /// Indicates the cloud service provider on which the servers are provisioned.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Indicates Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the Atlas Region name, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        public readonly string ProviderRegionName;
        /// <summary>
        /// Indicates the type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.
        /// </summary>
        public readonly string ProviderVolumeType;
        /// <summary>
        /// Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
        /// </summary>
        public readonly int ReplicationFactor;
        /// <summary>
        /// Configuration for cluster regions.  See Replication Spec below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterReplicationSpecResult> ReplicationSpecs;
        /// <summary>
        /// current snapshot schedule and retention settings for the cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterSnapshotBackupPolicyResult> SnapshotBackupPolicies;
        /// <summary>
        /// Connection string for connecting to the Atlas cluster. The +srv modifier forces the connection to use TLS/SSL. See the mongoURI for additional options.
        /// </summary>
        public readonly string SrvAddress;
        /// <summary>
        /// Indicates the current state of the cluster. The possible states are:
        /// - IDLE
        /// - CREATING
        /// - UPDATING
        /// - DELETING
        /// - DELETED
        /// - REPAIRING
        /// </summary>
        public readonly string StateName;

        [OutputConstructor]
        private GetClusterResult(
            bool autoScalingComputeEnabled,

            bool autoScalingComputeScaleDownEnabled,

            bool autoScalingDiskGbEnabled,

            string backingProviderName,

            bool backupEnabled,

            Outputs.GetClusterBiConnectorResult biConnector,

            string clusterType,

            Outputs.GetClusterConnectionStringsResult connectionStrings,

            string containerId,

            double diskSizeGb,

            string encryptionAtRestProvider,

            string id,

            ImmutableArray<Outputs.GetClusterLabelResult> labels,

            string mongoDbMajorVersion,

            string mongoDbVersion,

            string mongoUri,

            string mongoUriUpdated,

            string mongoUriWithOptions,

            string name,

            int numShards,

            bool paused,

            bool pitEnabled,

            string projectId,

            string providerAutoScalingComputeMaxInstanceSize,

            string providerAutoScalingComputeMinInstanceSize,

            bool providerBackupEnabled,

            int providerDiskIops,

            string providerDiskTypeName,

            bool providerEncryptEbsVolume,

            string providerInstanceSizeName,

            string providerName,

            string providerRegionName,

            string providerVolumeType,

            int replicationFactor,

            ImmutableArray<Outputs.GetClusterReplicationSpecResult> replicationSpecs,

            ImmutableArray<Outputs.GetClusterSnapshotBackupPolicyResult> snapshotBackupPolicies,

            string srvAddress,

            string stateName)
        {
            AutoScalingComputeEnabled = autoScalingComputeEnabled;
            AutoScalingComputeScaleDownEnabled = autoScalingComputeScaleDownEnabled;
            AutoScalingDiskGbEnabled = autoScalingDiskGbEnabled;
            BackingProviderName = backingProviderName;
            BackupEnabled = backupEnabled;
            BiConnector = biConnector;
            ClusterType = clusterType;
            ConnectionStrings = connectionStrings;
            ContainerId = containerId;
            DiskSizeGb = diskSizeGb;
            EncryptionAtRestProvider = encryptionAtRestProvider;
            Id = id;
            Labels = labels;
            MongoDbMajorVersion = mongoDbMajorVersion;
            MongoDbVersion = mongoDbVersion;
            MongoUri = mongoUri;
            MongoUriUpdated = mongoUriUpdated;
            MongoUriWithOptions = mongoUriWithOptions;
            Name = name;
            NumShards = numShards;
            Paused = paused;
            PitEnabled = pitEnabled;
            ProjectId = projectId;
            ProviderAutoScalingComputeMaxInstanceSize = providerAutoScalingComputeMaxInstanceSize;
            ProviderAutoScalingComputeMinInstanceSize = providerAutoScalingComputeMinInstanceSize;
            ProviderBackupEnabled = providerBackupEnabled;
            ProviderDiskIops = providerDiskIops;
            ProviderDiskTypeName = providerDiskTypeName;
            ProviderEncryptEbsVolume = providerEncryptEbsVolume;
            ProviderInstanceSizeName = providerInstanceSizeName;
            ProviderName = providerName;
            ProviderRegionName = providerRegionName;
            ProviderVolumeType = providerVolumeType;
            ReplicationFactor = replicationFactor;
            ReplicationSpecs = replicationSpecs;
            SnapshotBackupPolicies = snapshotBackupPolicies;
            SrvAddress = srvAddress;
            StateName = stateName;
        }
    }
}
