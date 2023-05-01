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
    /// `mongodbatlas.GlobalClusterConfig` provides a Global Cluster Configuration resource.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
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
    ///     var test = new Mongodbatlas.Cluster("test", new()
    ///     {
    ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
    ///         Name = "&lt;CLUSTER-NAME&gt;",
    ///         CloudBackup = true,
    ///         ClusterType = "GEOSHARDED",
    ///         ProviderName = "AWS",
    ///         ProviderInstanceSizeName = "M30",
    ///         ReplicationSpecs = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ClusterReplicationSpecArgs
    ///             {
    ///                 ZoneName = "Zone 1",
    ///                 NumShards = 1,
    ///                 RegionsConfigs = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.ClusterReplicationSpecRegionsConfigArgs
    ///                     {
    ///                         RegionName = "EU_CENTRAL_1",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.ClusterReplicationSpecArgs
    ///             {
    ///                 ZoneName = "Zone 2",
    ///                 NumShards = 1,
    ///                 RegionsConfigs = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.ClusterReplicationSpecRegionsConfigArgs
    ///                     {
    ///                         RegionName = "US_EAST_2",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
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
    /// ### Example Global cluster config
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var cluster_test = new Mongodbatlas.Cluster("cluster-test", new()
    ///     {
    ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
    ///         Name = "cluster-test",
    ///         ClusterType = "REPLICASET",
    ///         ReplicationSpecs = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ClusterReplicationSpecArgs
    ///             {
    ///                 NumShards = 1,
    ///                 RegionsConfigs = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.ClusterReplicationSpecRegionsConfigArgs
    ///                     {
    ///                         RegionName = "US_EAST_1",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         BackupEnabled = true,
    ///         AutoScalingDiskGbEnabled = true,
    ///         MongoDbMajorVersion = "4.0",
    ///         ProviderName = "AWS",
    ///         ProviderInstanceSizeName = "M40",
    ///     });
    /// 
    ///     var config = new Mongodbatlas.GlobalClusterConfig("config", new()
    ///     {
    ///         ProjectId = mongodbatlas_cluster.Test.Project_id,
    ///         ClusterName = mongodbatlas_cluster.Test.Name,
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
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
    /// ```
    /// 
    ///  See detailed information for arguments and attributes[MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)
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
        /// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        /// </summary>
        [Output("customZoneMapping")]
        public Output<ImmutableDictionary<string, object>> CustomZoneMapping { get; private set; } = null!;

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
        private InputMap<object>? _customZoneMapping;

        /// <summary>
        /// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        /// </summary>
        public InputMap<object> CustomZoneMapping
        {
            get => _customZoneMapping ?? (_customZoneMapping = new InputMap<object>());
            set => _customZoneMapping = value;
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
