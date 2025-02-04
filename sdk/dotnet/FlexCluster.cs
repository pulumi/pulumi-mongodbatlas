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
    /// ## # Resource: mongodbatlas.FlexCluster
    /// 
    /// `mongodbatlas.FlexCluster` provides a Flex Cluster resource. The resource lets you create, update, delete and import a flex cluster.
    /// 
    /// **NOTE:** Flex Cluster is in Public Preview. In order to use the resource and data sources you need to set the environment variable MONGODB_ATLAS_ENABLE_PREVIEW to true.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// You can import the Flex Cluster resource by using the Project ID and Flex Cluster name, in the format `PROJECT_ID-FLEX_CLUSTER_NAME`. For example:
    /// 
    /// For more information see: [MongoDB Atlas API - Flex Cluster](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Flex-Clusters/operation/createFlexcluster) Documentation.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/flexCluster:FlexCluster")]
    public partial class FlexCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Flex backup configuration
        /// </summary>
        [Output("backupSettings")]
        public Output<Outputs.FlexClusterBackupSettings> BackupSettings { get; private set; } = null!;

        /// <summary>
        /// Flex cluster topology.
        /// </summary>
        [Output("clusterType")]
        public Output<string> ClusterType { get; private set; } = null!;

        /// <summary>
        /// Collection of Uniform Resource Locators that point to the MongoDB database.
        /// </summary>
        [Output("connectionStrings")]
        public Output<Outputs.FlexClusterConnectionStrings> ConnectionStrings { get; private set; } = null!;

        /// <summary>
        /// Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        /// </summary>
        [Output("createDate")]
        public Output<string> CreateDate { get; private set; } = null!;

        /// <summary>
        /// Version of MongoDB that the instance runs.
        /// </summary>
        [Output("mongoDbVersion")]
        public Output<string> MongoDbVersion { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        /// </summary>
        [Output("providerSettings")]
        public Output<Outputs.FlexClusterProviderSettings> ProviderSettings { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that indicates the current operating condition of this instance.
        /// </summary>
        [Output("stateName")]
        public Output<string> StateName { get; private set; } = null!;

        /// <summary>
        /// Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        /// </summary>
        [Output("terminationProtectionEnabled")]
        public Output<bool> TerminationProtectionEnabled { get; private set; } = null!;

        /// <summary>
        /// Method by which the cluster maintains the MongoDB versions.
        /// </summary>
        [Output("versionReleaseSystem")]
        public Output<string> VersionReleaseSystem { get; private set; } = null!;


        /// <summary>
        /// Create a FlexCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlexCluster(string name, FlexClusterArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/flexCluster:FlexCluster", name, args ?? new FlexClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FlexCluster(string name, Input<string> id, FlexClusterState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/flexCluster:FlexCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FlexCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FlexCluster Get(string name, Input<string> id, FlexClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new FlexCluster(name, id, state, options);
        }
    }

    public sealed class FlexClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Human-readable label that identifies the instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        /// </summary>
        [Input("providerSettings", required: true)]
        public Input<Inputs.FlexClusterProviderSettingsArgs> ProviderSettings { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        /// </summary>
        [Input("terminationProtectionEnabled")]
        public Input<bool>? TerminationProtectionEnabled { get; set; }

        public FlexClusterArgs()
        {
        }
        public static new FlexClusterArgs Empty => new FlexClusterArgs();
    }

    public sealed class FlexClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flex backup configuration
        /// </summary>
        [Input("backupSettings")]
        public Input<Inputs.FlexClusterBackupSettingsGetArgs>? BackupSettings { get; set; }

        /// <summary>
        /// Flex cluster topology.
        /// </summary>
        [Input("clusterType")]
        public Input<string>? ClusterType { get; set; }

        /// <summary>
        /// Collection of Uniform Resource Locators that point to the MongoDB database.
        /// </summary>
        [Input("connectionStrings")]
        public Input<Inputs.FlexClusterConnectionStringsGetArgs>? ConnectionStrings { get; set; }

        /// <summary>
        /// Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        /// </summary>
        [Input("createDate")]
        public Input<string>? CreateDate { get; set; }

        /// <summary>
        /// Version of MongoDB that the instance runs.
        /// </summary>
        [Input("mongoDbVersion")]
        public Input<string>? MongoDbVersion { get; set; }

        /// <summary>
        /// Human-readable label that identifies the instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        /// </summary>
        [Input("providerSettings")]
        public Input<Inputs.FlexClusterProviderSettingsGetArgs>? ProviderSettings { get; set; }

        /// <summary>
        /// Human-readable label that indicates the current operating condition of this instance.
        /// </summary>
        [Input("stateName")]
        public Input<string>? StateName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        /// </summary>
        [Input("terminationProtectionEnabled")]
        public Input<bool>? TerminationProtectionEnabled { get; set; }

        /// <summary>
        /// Method by which the cluster maintains the MongoDB versions.
        /// </summary>
        [Input("versionReleaseSystem")]
        public Input<string>? VersionReleaseSystem { get; set; }

        public FlexClusterState()
        {
        }
        public static new FlexClusterState Empty => new FlexClusterState();
    }
}
