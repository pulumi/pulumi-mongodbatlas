// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetClusters
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getClusters
        /// 
        /// `mongodbatlas.Cluster` describes all Clusters by the provided project_id. The data source requires your Project ID.
        /// 
        /// &gt; **IMPORTANT:**
        /// &lt;br&gt; &amp;#8226; Multi Region Cluster: The `mongodbatlas.Cluster` data source doesn't return the `container_id` for each region utilized by the cluster. For retrieving the `container_id`, we recommend the `mongodbatlas.AdvancedCluster` data source instead.
        /// &lt;br&gt; &amp;#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
        /// &lt;br&gt; &amp;#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
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
        ///     var testCluster = new Mongodbatlas.Cluster("test", new()
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
        ///         CloudBackup = true,
        ///         AutoScalingDiskGbEnabled = true,
        ///         ProviderName = "AWS",
        ///         ProviderInstanceSizeName = "M40",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetClusters.Invoke(new()
        ///     {
        ///         ProjectId = testCluster.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetClustersResult> InvokeAsync(GetClustersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClustersResult>("mongodbatlas:index/getClusters:getClusters", args ?? new GetClustersArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getClusters
        /// 
        /// `mongodbatlas.Cluster` describes all Clusters by the provided project_id. The data source requires your Project ID.
        /// 
        /// &gt; **IMPORTANT:**
        /// &lt;br&gt; &amp;#8226; Multi Region Cluster: The `mongodbatlas.Cluster` data source doesn't return the `container_id` for each region utilized by the cluster. For retrieving the `container_id`, we recommend the `mongodbatlas.AdvancedCluster` data source instead.
        /// &lt;br&gt; &amp;#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
        /// &lt;br&gt; &amp;#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
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
        ///     var testCluster = new Mongodbatlas.Cluster("test", new()
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
        ///         CloudBackup = true,
        ///         AutoScalingDiskGbEnabled = true,
        ///         ProviderName = "AWS",
        ///         ProviderInstanceSizeName = "M40",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetClusters.Invoke(new()
        ///     {
        ///         ProjectId = testCluster.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetClustersResult> Invoke(GetClustersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClustersResult>("mongodbatlas:index/getClusters:getClusters", args ?? new GetClustersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getClusters
        /// 
        /// `mongodbatlas.Cluster` describes all Clusters by the provided project_id. The data source requires your Project ID.
        /// 
        /// &gt; **IMPORTANT:**
        /// &lt;br&gt; &amp;#8226; Multi Region Cluster: The `mongodbatlas.Cluster` data source doesn't return the `container_id` for each region utilized by the cluster. For retrieving the `container_id`, we recommend the `mongodbatlas.AdvancedCluster` data source instead.
        /// &lt;br&gt; &amp;#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
        /// &lt;br&gt; &amp;#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
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
        ///     var testCluster = new Mongodbatlas.Cluster("test", new()
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
        ///         CloudBackup = true,
        ///         AutoScalingDiskGbEnabled = true,
        ///         ProviderName = "AWS",
        ///         ProviderInstanceSizeName = "M40",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetClusters.Invoke(new()
        ///     {
        ///         ProjectId = testCluster.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetClustersResult> Invoke(GetClustersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetClustersResult>("mongodbatlas:index/getClusters:getClusters", args ?? new GetClustersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClustersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get the clusters.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetClustersArgs()
        {
        }
        public static new GetClustersArgs Empty => new GetClustersArgs();
    }

    public sealed class GetClustersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get the clusters.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetClustersInvokeArgs()
        {
        }
        public static new GetClustersInvokeArgs Empty => new GetClustersInvokeArgs();
    }


    [OutputType]
    public sealed class GetClustersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Cluster. See Cluster below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersResultResult> Results;

        [OutputConstructor]
        private GetClustersResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetClustersResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
