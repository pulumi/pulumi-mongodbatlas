// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAdvancedCluster
    {
        /// <summary>
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
        ///     var exampleAdvancedCluster = new Mongodbatlas.AdvancedCluster("example", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "cluster-test",
        ///         ClusterType = "REPLICASET",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M0",
        ///                         },
        ///                         ProviderName = "TENANT",
        ///                         BackingProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         Priority = 7,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = exampleAdvancedCluster.ProjectId,
        ///         Name = exampleAdvancedCluster.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Example using latest sharding configurations with independent shard scaling in the cluster
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleAdvancedCluster = new Mongodbatlas.AdvancedCluster("example", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "cluster-test",
        ///         BackupEnabled = false,
        ///         ClusterType = "SHARDED",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             DiskIops = 3000,
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_WEST_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M40",
        ///                             DiskIops = 3000,
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_WEST_1",
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = exampleAdvancedCluster.ProjectId,
        ///         Name = exampleAdvancedCluster.Name,
        ///         UseReplicationSpecPerShard = true,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Example using Flex cluster
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example_flex = new Mongodbatlas.AdvancedCluster("example-flex", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "flex-cluster",
        ///         ClusterType = "REPLICASET",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ProviderName = "FLEX",
        ///                         BackingProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         Priority = 7,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = example_flex.ProjectId,
        ///         Name = example_flex.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAdvancedClusterResult> InvokeAsync(GetAdvancedClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAdvancedClusterResult>("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", args ?? new GetAdvancedClusterArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var exampleAdvancedCluster = new Mongodbatlas.AdvancedCluster("example", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "cluster-test",
        ///         ClusterType = "REPLICASET",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M0",
        ///                         },
        ///                         ProviderName = "TENANT",
        ///                         BackingProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         Priority = 7,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = exampleAdvancedCluster.ProjectId,
        ///         Name = exampleAdvancedCluster.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Example using latest sharding configurations with independent shard scaling in the cluster
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleAdvancedCluster = new Mongodbatlas.AdvancedCluster("example", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "cluster-test",
        ///         BackupEnabled = false,
        ///         ClusterType = "SHARDED",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             DiskIops = 3000,
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_WEST_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M40",
        ///                             DiskIops = 3000,
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_WEST_1",
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = exampleAdvancedCluster.ProjectId,
        ///         Name = exampleAdvancedCluster.Name,
        ///         UseReplicationSpecPerShard = true,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Example using Flex cluster
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example_flex = new Mongodbatlas.AdvancedCluster("example-flex", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "flex-cluster",
        ///         ClusterType = "REPLICASET",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ProviderName = "FLEX",
        ///                         BackingProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         Priority = 7,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = example_flex.ProjectId,
        ///         Name = example_flex.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAdvancedClusterResult> Invoke(GetAdvancedClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAdvancedClusterResult>("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", args ?? new GetAdvancedClusterInvokeArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var exampleAdvancedCluster = new Mongodbatlas.AdvancedCluster("example", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "cluster-test",
        ///         ClusterType = "REPLICASET",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M0",
        ///                         },
        ///                         ProviderName = "TENANT",
        ///                         BackingProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         Priority = 7,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = exampleAdvancedCluster.ProjectId,
        ///         Name = exampleAdvancedCluster.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Example using latest sharding configurations with independent shard scaling in the cluster
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleAdvancedCluster = new Mongodbatlas.AdvancedCluster("example", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "cluster-test",
        ///         BackupEnabled = false,
        ///         ClusterType = "SHARDED",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             DiskIops = 3000,
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_WEST_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M40",
        ///                             DiskIops = 3000,
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_WEST_1",
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = exampleAdvancedCluster.ProjectId,
        ///         Name = exampleAdvancedCluster.Name,
        ///         UseReplicationSpecPerShard = true,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Example using Flex cluster
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example_flex = new Mongodbatlas.AdvancedCluster("example-flex", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "flex-cluster",
        ///         ClusterType = "REPLICASET",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ProviderName = "FLEX",
        ///                         BackingProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         Priority = 7,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var example = Mongodbatlas.GetAdvancedCluster.Invoke(new()
        ///     {
        ///         ProjectId = example_flex.ProjectId,
        ///         Name = example_flex.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAdvancedClusterResult> Invoke(GetAdvancedClusterInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAdvancedClusterResult>("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", args ?? new GetAdvancedClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAdvancedClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Flag that indicates if the cluster uses Continuous Cloud Backup.
        /// </summary>
        [Input("pitEnabled")]
        public bool? PitEnabled { get; set; }

        /// <summary>
        /// The unique ID for the project to create the cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling.
        /// </summary>
        [Input("useReplicationSpecPerShard")]
        public bool? UseReplicationSpecPerShard { get; set; }

        public GetAdvancedClusterArgs()
        {
        }
        public static new GetAdvancedClusterArgs Empty => new GetAdvancedClusterArgs();
    }

    public sealed class GetAdvancedClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Flag that indicates if the cluster uses Continuous Cloud Backup.
        /// </summary>
        [Input("pitEnabled")]
        public Input<bool>? PitEnabled { get; set; }

        /// <summary>
        /// The unique ID for the project to create the cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling.
        /// </summary>
        [Input("useReplicationSpecPerShard")]
        public Input<bool>? UseReplicationSpecPerShard { get; set; }

        public GetAdvancedClusterInvokeArgs()
        {
        }
        public static new GetAdvancedClusterInvokeArgs Empty => new GetAdvancedClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetAdvancedClusterResult
    {
        /// <summary>
        /// Get the advanced configuration options. See Advanced Configuration below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterAdvancedConfigurationResult> AdvancedConfigurations;
        public readonly bool BackupEnabled;
        public readonly ImmutableArray<Outputs.GetAdvancedClusterBiConnectorConfigResult> BiConnectorConfigs;
        /// <summary>
        /// Type of the cluster that you want to create.
        /// </summary>
        public readonly string ClusterType;
        /// <summary>
        /// Config Server Management Mode for creating or updating a sharded cluster. Valid values are `ATLAS_MANAGED` (default) and `FIXED_TO_DEDICATED`. When configured as `ATLAS_MANAGED`, Atlas may automatically switch the cluster's config server type for optimal performance and savings. When configured as `FIXED_TO_DEDICATED`, the cluster will always use a dedicated config server. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
        /// </summary>
        public readonly string ConfigServerManagementMode;
        /// <summary>
        /// Describes a sharded cluster's config server type. Valid values are `DEDICATED` and `EMBEDDED`. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
        /// </summary>
        public readonly string ConfigServerType;
        /// <summary>
        /// Set of connection strings that your applications use to connect to this cluster. More information in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterConnectionStringResult> ConnectionStrings;
        public readonly string CreateDate;
        /// <summary>
        /// Storage capacity that the host's root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
        /// </summary>
        public readonly double DiskSizeGb;
        /// <summary>
        /// Possible values are AWS, GCP, AZURE or NONE.
        /// </summary>
        public readonly string EncryptionAtRestProvider;
        /// <summary>
        /// Flag that indicates if cluster uses Atlas-Managed Sharding (false) or Self-Managed Sharding (true).
        /// </summary>
        public readonly bool GlobalClusterSelfManagedSharding;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **(DEPRECATED)** Use `tags` instead.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterLabelResult> Labels;
        /// <summary>
        /// Version of the cluster to deploy.
        /// </summary>
        public readonly string MongoDbMajorVersion;
        /// <summary>
        /// Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
        /// </summary>
        public readonly string MongoDbVersion;
        public readonly string Name;
        /// <summary>
        /// Flag that indicates whether the cluster is paused or not.
        /// </summary>
        public readonly bool Paused;
        /// <summary>
        /// The pinned Feature Compatibility Version (FCV) with its associated expiration date. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterPinnedFcvResult> PinnedFcvs;
        /// <summary>
        /// Flag that indicates if the cluster uses Continuous Cloud Backup.
        /// </summary>
        public readonly bool PitEnabled;
        public readonly string ProjectId;
        /// <summary>
        /// (Optional) Flag that enables or disables log redaction, see the [manual](https://www.mongodb.com/docs/manual/administration/monitoring/#log-redaction) for more information.
        /// </summary>
        public readonly bool RedactClientLogData;
        /// <summary>
        /// (Optional) Replica set scaling mode for your cluster.
        /// </summary>
        public readonly string ReplicaSetScalingStrategy;
        /// <summary>
        /// List of settings that configure your cluster regions. If `use_replication_spec_per_shard = true`, this array has one object per shard representing node configurations in each shard. For replica sets there is only one object representing node configurations. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterReplicationSpecResult> ReplicationSpecs;
        /// <summary>
        /// Certificate Authority that MongoDB Atlas clusters use.
        /// </summary>
        public readonly string RootCertType;
        /// <summary>
        /// Current state of the cluster. The possible states are:
        /// </summary>
        public readonly string StateName;
        /// <summary>
        /// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterTagResult> Tags;
        /// <summary>
        /// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
        /// </summary>
        public readonly bool TerminationProtectionEnabled;
        public readonly bool? UseReplicationSpecPerShard;
        /// <summary>
        /// Release cadence that Atlas uses for this cluster.
        /// </summary>
        public readonly string VersionReleaseSystem;

        [OutputConstructor]
        private GetAdvancedClusterResult(
            ImmutableArray<Outputs.GetAdvancedClusterAdvancedConfigurationResult> advancedConfigurations,

            bool backupEnabled,

            ImmutableArray<Outputs.GetAdvancedClusterBiConnectorConfigResult> biConnectorConfigs,

            string clusterType,

            string configServerManagementMode,

            string configServerType,

            ImmutableArray<Outputs.GetAdvancedClusterConnectionStringResult> connectionStrings,

            string createDate,

            double diskSizeGb,

            string encryptionAtRestProvider,

            bool globalClusterSelfManagedSharding,

            string id,

            ImmutableArray<Outputs.GetAdvancedClusterLabelResult> labels,

            string mongoDbMajorVersion,

            string mongoDbVersion,

            string name,

            bool paused,

            ImmutableArray<Outputs.GetAdvancedClusterPinnedFcvResult> pinnedFcvs,

            bool pitEnabled,

            string projectId,

            bool redactClientLogData,

            string replicaSetScalingStrategy,

            ImmutableArray<Outputs.GetAdvancedClusterReplicationSpecResult> replicationSpecs,

            string rootCertType,

            string stateName,

            ImmutableArray<Outputs.GetAdvancedClusterTagResult> tags,

            bool terminationProtectionEnabled,

            bool? useReplicationSpecPerShard,

            string versionReleaseSystem)
        {
            AdvancedConfigurations = advancedConfigurations;
            BackupEnabled = backupEnabled;
            BiConnectorConfigs = biConnectorConfigs;
            ClusterType = clusterType;
            ConfigServerManagementMode = configServerManagementMode;
            ConfigServerType = configServerType;
            ConnectionStrings = connectionStrings;
            CreateDate = createDate;
            DiskSizeGb = diskSizeGb;
            EncryptionAtRestProvider = encryptionAtRestProvider;
            GlobalClusterSelfManagedSharding = globalClusterSelfManagedSharding;
            Id = id;
            Labels = labels;
            MongoDbMajorVersion = mongoDbMajorVersion;
            MongoDbVersion = mongoDbVersion;
            Name = name;
            Paused = paused;
            PinnedFcvs = pinnedFcvs;
            PitEnabled = pitEnabled;
            ProjectId = projectId;
            RedactClientLogData = redactClientLogData;
            ReplicaSetScalingStrategy = replicaSetScalingStrategy;
            ReplicationSpecs = replicationSpecs;
            RootCertType = rootCertType;
            StateName = stateName;
            Tags = tags;
            TerminationProtectionEnabled = terminationProtectionEnabled;
            UseReplicationSpecPerShard = useReplicationSpecPerShard;
            VersionReleaseSystem = versionReleaseSystem;
        }
    }
}
