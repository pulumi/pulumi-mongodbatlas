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
    /// ## # Resource: mongodbatlas.GlobalClusterConfig
    /// 
    /// `mongodbatlas.GlobalClusterConfig` provides a Global Cluster Configuration resource.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// &gt; **NOTE:** This resource can only be used with Atlas-managed clusters. See doc for `global_cluster_self_managed_sharding` attribute in `mongodbatlas.AdvancedCluster` resource for more info.
    /// 
    /// &gt; **IMPORTANT:** You can update a Global Cluster Configuration to add new custom zone mappings and managed namespaces. However, once configured, you can't modify or partially delete custom zone mappings (you must remove them all at once). You can add or remove, but can't modify, managed namespaces. Any update that changes an existing managed namespace results in an error. [Read more about Global Cluster Configuration](https://www.mongodb.com/docs/atlas/global-clusters/). For more details, see [Global Clusters API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Global-Clusters)
    /// 
    /// ## Examples Usage
    /// 
    /// ### Example Global cluster
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
    ///     var config = new Mongodbatlas.GlobalClusterConfig("config", new()
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
    ///                 IsCustomShardKeyHashed = false,
    ///                 IsShardKeyUnique = false,
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
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
    /// ```
    /// See detailed information for arguments and attributes: [MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig")]
    public partial class GlobalClusterConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Global Cluster.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead.
        /// </summary>
        [Output("customZoneMapping")]
        public Output<ImmutableDictionary<string, string>> CustomZoneMapping { get; private set; } = null!;

        /// <summary>
        /// A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        /// </summary>
        [Output("customZoneMappingZoneId")]
        public Output<ImmutableDictionary<string, string>> CustomZoneMappingZoneId { get; private set; } = null!;

        /// <summary>
        /// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        /// </summary>
        [Output("customZoneMappings")]
        public Output<ImmutableArray<Outputs.GlobalClusterConfigCustomZoneMapping>> CustomZoneMappings { get; private set; } = null!;

        /// <summary>
        /// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        /// </summary>
        [Output("managedNamespaces")]
        public Output<ImmutableArray<Outputs.GlobalClusterConfigManagedNamespace>> ManagedNamespaces { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalClusterConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalClusterConfig(string name, GlobalClusterConfigArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, args ?? new GlobalClusterConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalClusterConfig(string name, Input<string> id, GlobalClusterConfigState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GlobalClusterConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalClusterConfig Get(string name, Input<string> id, GlobalClusterConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalClusterConfig(name, id, state, options);
        }
    }

    public sealed class GlobalClusterConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Global Cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        [Input("customZoneMappings")]
        private InputList<Inputs.GlobalClusterConfigCustomZoneMappingArgs>? _customZoneMappings;

        /// <summary>
        /// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        /// </summary>
        public InputList<Inputs.GlobalClusterConfigCustomZoneMappingArgs> CustomZoneMappings
        {
            get => _customZoneMappings ?? (_customZoneMappings = new InputList<Inputs.GlobalClusterConfigCustomZoneMappingArgs>());
            set => _customZoneMappings = value;
        }

        [Input("managedNamespaces")]
        private InputList<Inputs.GlobalClusterConfigManagedNamespaceArgs>? _managedNamespaces;

        /// <summary>
        /// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        /// </summary>
        public InputList<Inputs.GlobalClusterConfigManagedNamespaceArgs> ManagedNamespaces
        {
            get => _managedNamespaces ?? (_managedNamespaces = new InputList<Inputs.GlobalClusterConfigManagedNamespaceArgs>());
            set => _managedNamespaces = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GlobalClusterConfigArgs()
        {
        }
        public static new GlobalClusterConfigArgs Empty => new GlobalClusterConfigArgs();
    }

    public sealed class GlobalClusterConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Global Cluster.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("customZoneMapping")]
        private InputMap<string>? _customZoneMapping;

        /// <summary>
        /// (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead.
        /// </summary>
        [Obsolete(@"This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.")]
        public InputMap<string> CustomZoneMapping
        {
            get => _customZoneMapping ?? (_customZoneMapping = new InputMap<string>());
            set => _customZoneMapping = value;
        }

        [Input("customZoneMappingZoneId")]
        private InputMap<string>? _customZoneMappingZoneId;

        /// <summary>
        /// A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        /// </summary>
        public InputMap<string> CustomZoneMappingZoneId
        {
            get => _customZoneMappingZoneId ?? (_customZoneMappingZoneId = new InputMap<string>());
            set => _customZoneMappingZoneId = value;
        }

        [Input("customZoneMappings")]
        private InputList<Inputs.GlobalClusterConfigCustomZoneMappingGetArgs>? _customZoneMappings;

        /// <summary>
        /// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        /// </summary>
        public InputList<Inputs.GlobalClusterConfigCustomZoneMappingGetArgs> CustomZoneMappings
        {
            get => _customZoneMappings ?? (_customZoneMappings = new InputList<Inputs.GlobalClusterConfigCustomZoneMappingGetArgs>());
            set => _customZoneMappings = value;
        }

        [Input("managedNamespaces")]
        private InputList<Inputs.GlobalClusterConfigManagedNamespaceGetArgs>? _managedNamespaces;

        /// <summary>
        /// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        /// </summary>
        public InputList<Inputs.GlobalClusterConfigManagedNamespaceGetArgs> ManagedNamespaces
        {
            get => _managedNamespaces ?? (_managedNamespaces = new InputList<Inputs.GlobalClusterConfigManagedNamespaceGetArgs>());
            set => _managedNamespaces = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GlobalClusterConfigState()
        {
        }
        public static new GlobalClusterConfigState Empty => new GlobalClusterConfigState();
    }
}
