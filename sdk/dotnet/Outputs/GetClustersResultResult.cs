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
    public sealed class GetClustersResultResult
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
        public readonly Outputs.GetClustersResultBiConnectorResult BiConnector;
        /// <summary>
        /// Indicates the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
        /// </summary>
        public readonly string ClusterType;
        /// <summary>
        /// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
        /// - `connection_strings.standard` -   Public mongodb:// connection string for this cluster.
        /// - `connection_strings.standard_srv` - Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t, use connectionStrings.standard.
        /// - `connection_strings.aws_private_link` -  [Private-endpoint-aware](https://docs.atlas.mongodb.com/security-private-endpoint/#private-endpoint-connection-strings) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a AWS PrivateLink connection to this cluster. **DEPRECATED** Use `connection_strings.private_endpoint[n].connection_string` instead.
        /// - `connection_strings.aws_private_link_srv` - [Private-endpoint-aware](https://docs.atlas.mongodb.com/security-private-endpoint/#private-endpoint-connection-strings) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a AWS PrivateLink connection to this cluster. Use this URI format if your driver supports it. If it doesn’t, use connectionStrings.awsPrivateLink. **DEPRECATED** `connection_strings.private_endpoint[n].srv_connection_string` instead.
        /// - `connection_strings.private` -   [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
        /// - `connection_strings.private_srv` -  [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
        /// - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
        /// - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint.
        /// - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
        /// - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[n].connection_string` or `connection_strings.private_endpoint[n].srv_connection_string`
        /// - `connection_strings.private_endoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
        /// - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
        /// - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
        /// </summary>
        public readonly Outputs.GetClustersResultConnectionStringsResult ConnectionStrings;
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
        public readonly ImmutableArray<Outputs.GetClustersResultLabelResult> Labels;
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
        /// Indicates Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases. Requires the Atlas Region name, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        public readonly string ProviderRegionName;
        /// <summary>
        /// Indicates the type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.
        /// </summary>
        public readonly string ProviderVolumeType;
        /// <summary>
        /// (Deprecated) Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
        /// </summary>
        public readonly int ReplicationFactor;
        /// <summary>
        /// Configuration for cluster regions.  See Replication Spec below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersResultReplicationSpecResult> ReplicationSpecs;
        /// <summary>
        /// current snapshot schedule and retention settings for the cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersResultSnapshotBackupPolicyResult> SnapshotBackupPolicies;
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
        private GetClustersResultResult(
            bool autoScalingComputeEnabled,

            bool autoScalingComputeScaleDownEnabled,

            bool autoScalingDiskGbEnabled,

            string backingProviderName,

            bool backupEnabled,

            Outputs.GetClustersResultBiConnectorResult biConnector,

            string clusterType,

            Outputs.GetClustersResultConnectionStringsResult connectionStrings,

            string containerId,

            double diskSizeGb,

            string encryptionAtRestProvider,

            ImmutableArray<Outputs.GetClustersResultLabelResult> labels,

            string mongoDbMajorVersion,

            string mongoDbVersion,

            string mongoUri,

            string mongoUriUpdated,

            string mongoUriWithOptions,

            string name,

            int numShards,

            bool paused,

            bool pitEnabled,

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

            ImmutableArray<Outputs.GetClustersResultReplicationSpecResult> replicationSpecs,

            ImmutableArray<Outputs.GetClustersResultSnapshotBackupPolicyResult> snapshotBackupPolicies,

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
