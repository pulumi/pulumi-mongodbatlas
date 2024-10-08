// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetGlobalClusterConfig
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.GlobalClusterConfig
        /// 
        /// `mongodbatlas.GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
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
        ///     var test = new Mongodbatlas.AdvancedCluster("test", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "&lt;CLUSTER-NAME&gt;",
        ///         ClusterType = "GEOSHARDED",
        ///         BackupEnabled = true,
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 1",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_CENTRAL_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 1",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_CENTRAL_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 2",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "US_EAST_2",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 2",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "US_EAST_2",
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var configGlobalClusterConfig = new Mongodbatlas.GlobalClusterConfig("config", new()
        ///     {
        ///         ProjectId = test.ProjectId,
        ///         ClusterName = test.Name,
        ///         ManagedNamespaces = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.GlobalClusterConfigManagedNamespaceArgs
        ///             {
        ///                 Db = "mydata",
        ///                 Collection = "publishers",
        ///                 CustomShardKey = "city",
        ///             },
        ///         },
        ///         CustomZoneMappings = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.GlobalClusterConfigCustomZoneMappingArgs
        ///             {
        ///                 Location = "CA",
        ///                 Zone = "Zone 1",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var config = Mongodbatlas.GetGlobalClusterConfig.Invoke(new()
        ///     {
        ///         ProjectId = configGlobalClusterConfig.ProjectId,
        ///         ClusterName = configGlobalClusterConfig.ClusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGlobalClusterConfigResult> InvokeAsync(GetGlobalClusterConfigArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGlobalClusterConfigResult>("mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig", args ?? new GetGlobalClusterConfigArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.GlobalClusterConfig
        /// 
        /// `mongodbatlas.GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
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
        ///     var test = new Mongodbatlas.AdvancedCluster("test", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         Name = "&lt;CLUSTER-NAME&gt;",
        ///         ClusterType = "GEOSHARDED",
        ///         BackupEnabled = true,
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 1",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_CENTRAL_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 1",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "EU_CENTRAL_1",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 2",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "US_EAST_2",
        ///                     },
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 ZoneName = "Zone 2",
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M30",
        ///                             NodeCount = 3,
        ///                         },
        ///                         ProviderName = "AWS",
        ///                         Priority = 7,
        ///                         RegionName = "US_EAST_2",
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var configGlobalClusterConfig = new Mongodbatlas.GlobalClusterConfig("config", new()
        ///     {
        ///         ProjectId = test.ProjectId,
        ///         ClusterName = test.Name,
        ///         ManagedNamespaces = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.GlobalClusterConfigManagedNamespaceArgs
        ///             {
        ///                 Db = "mydata",
        ///                 Collection = "publishers",
        ///                 CustomShardKey = "city",
        ///             },
        ///         },
        ///         CustomZoneMappings = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.GlobalClusterConfigCustomZoneMappingArgs
        ///             {
        ///                 Location = "CA",
        ///                 Zone = "Zone 1",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var config = Mongodbatlas.GetGlobalClusterConfig.Invoke(new()
        ///     {
        ///         ProjectId = configGlobalClusterConfig.ProjectId,
        ///         ClusterName = configGlobalClusterConfig.ClusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGlobalClusterConfigResult> Invoke(GetGlobalClusterConfigInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGlobalClusterConfigResult>("mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig", args ?? new GetGlobalClusterConfigInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGlobalClusterConfigArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Global Cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        [Input("managedNamespaces")]
        private List<Inputs.GetGlobalClusterConfigManagedNamespaceArgs>? _managedNamespaces;

        /// <summary>
        /// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        /// </summary>
        public List<Inputs.GetGlobalClusterConfigManagedNamespaceArgs> ManagedNamespaces
        {
            get => _managedNamespaces ?? (_managedNamespaces = new List<Inputs.GetGlobalClusterConfigManagedNamespaceArgs>());
            set => _managedNamespaces = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetGlobalClusterConfigArgs()
        {
        }
        public static new GetGlobalClusterConfigArgs Empty => new GetGlobalClusterConfigArgs();
    }

    public sealed class GetGlobalClusterConfigInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Global Cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        [Input("managedNamespaces")]
        private InputList<Inputs.GetGlobalClusterConfigManagedNamespaceInputArgs>? _managedNamespaces;

        /// <summary>
        /// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        /// </summary>
        public InputList<Inputs.GetGlobalClusterConfigManagedNamespaceInputArgs> ManagedNamespaces
        {
            get => _managedNamespaces ?? (_managedNamespaces = new InputList<Inputs.GetGlobalClusterConfigManagedNamespaceInputArgs>());
            set => _managedNamespaces = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetGlobalClusterConfigInvokeArgs()
        {
        }
        public static new GetGlobalClusterConfigInvokeArgs Empty => new GetGlobalClusterConfigInvokeArgs();
    }


    [OutputType]
    public sealed class GetGlobalClusterConfigResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead.
        /// </summary>
        public readonly ImmutableDictionary<string, string> CustomZoneMapping;
        /// <summary>
        /// A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        /// </summary>
        public readonly ImmutableDictionary<string, string> CustomZoneMappingZoneId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGlobalClusterConfigManagedNamespaceResult> ManagedNamespaces;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetGlobalClusterConfigResult(
            string clusterName,

            ImmutableDictionary<string, string> customZoneMapping,

            ImmutableDictionary<string, string> customZoneMappingZoneId,

            string id,

            ImmutableArray<Outputs.GetGlobalClusterConfigManagedNamespaceResult> managedNamespaces,

            string projectId)
        {
            ClusterName = clusterName;
            CustomZoneMapping = customZoneMapping;
            CustomZoneMappingZoneId = customZoneMappingZoneId;
            Id = id;
            ManagedNamespaces = managedNamespaces;
            ProjectId = projectId;
        }
    }
}
