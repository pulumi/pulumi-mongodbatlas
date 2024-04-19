// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// `mongodbatlas.AdvancedCluster` describes an Advanced Cluster. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:**
        /// &lt;br&gt; &amp;#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
        /// &lt;br&gt; &amp;#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
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
        ///                             InstanceSize = "M5",
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
        /// </summary>
        public static Task<GetAdvancedClusterResult> InvokeAsync(GetAdvancedClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAdvancedClusterResult>("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", args ?? new GetAdvancedClusterArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.AdvancedCluster` describes an Advanced Cluster. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:**
        /// &lt;br&gt; &amp;#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
        /// &lt;br&gt; &amp;#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
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
        ///                             InstanceSize = "M5",
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
        /// </summary>
        public static Output<GetAdvancedClusterResult> Invoke(GetAdvancedClusterInvokeArgs args, InvokeOptions? options = null)
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
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

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
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

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
        /// <summary>
        /// Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `bi_connector`
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterBiConnectorConfigResult> BiConnectorConfigs;
        /// <summary>
        /// Type of the cluster that you want to create.
        /// </summary>
        public readonly string ClusterType;
        /// <summary>
        /// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClusterConnectionStringResult> ConnectionStrings;
        public readonly string CreateDate;
        /// <summary>
        /// Capacity, in gigabytes, of the host's root volume.
        /// </summary>
        public readonly double DiskSizeGb;
        /// <summary>
        /// Possible values are AWS, GCP, AZURE or NONE.
        /// </summary>
        public readonly string EncryptionAtRestProvider;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **DEPRECATED** Use `tags` instead.
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
        /// Flag that indicates if the cluster uses Continuous Cloud Backup.
        /// </summary>
        public readonly bool PitEnabled;
        public readonly string ProjectId;
        /// <summary>
        /// Configuration for cluster regions and the hardware provisioned in them. See below.
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

            ImmutableArray<Outputs.GetAdvancedClusterConnectionStringResult> connectionStrings,

            string createDate,

            double diskSizeGb,

            string encryptionAtRestProvider,

            string id,

            ImmutableArray<Outputs.GetAdvancedClusterLabelResult> labels,

            string mongoDbMajorVersion,

            string mongoDbVersion,

            string name,

            bool paused,

            bool pitEnabled,

            string projectId,

            ImmutableArray<Outputs.GetAdvancedClusterReplicationSpecResult> replicationSpecs,

            string rootCertType,

            string stateName,

            ImmutableArray<Outputs.GetAdvancedClusterTagResult> tags,

            bool terminationProtectionEnabled,

            string versionReleaseSystem)
        {
            AdvancedConfigurations = advancedConfigurations;
            BackupEnabled = backupEnabled;
            BiConnectorConfigs = biConnectorConfigs;
            ClusterType = clusterType;
            ConnectionStrings = connectionStrings;
            CreateDate = createDate;
            DiskSizeGb = diskSizeGb;
            EncryptionAtRestProvider = encryptionAtRestProvider;
            Id = id;
            Labels = labels;
            MongoDbMajorVersion = mongoDbMajorVersion;
            MongoDbVersion = mongoDbVersion;
            Name = name;
            Paused = paused;
            PitEnabled = pitEnabled;
            ProjectId = projectId;
            ReplicationSpecs = replicationSpecs;
            RootCertType = rootCertType;
            StateName = stateName;
            Tags = tags;
            TerminationProtectionEnabled = terminationProtectionEnabled;
            VersionReleaseSystem = versionReleaseSystem;
        }
    }
}
