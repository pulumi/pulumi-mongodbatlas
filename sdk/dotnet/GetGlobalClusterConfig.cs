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
        /// `mongodbatlas..GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGlobalClusterConfigResult> InvokeAsync(GetGlobalClusterConfigArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGlobalClusterConfigResult>("mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig", args ?? new GetGlobalClusterConfigArgs(), options.WithVersion());
    }


    public sealed class GetGlobalClusterConfigArgs : Pulumi.InvokeArgs
    {
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
        /// * `cluster_name - (Required) The name of the Global Cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetGlobalClusterConfigArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetGlobalClusterConfigResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        /// </summary>
        public readonly ImmutableDictionary<string, object> CustomZoneMapping;
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

            ImmutableDictionary<string, object> customZoneMapping,

            string id,

            ImmutableArray<Outputs.GetGlobalClusterConfigManagedNamespaceResult> managedNamespaces,

            string projectId)
        {
            ClusterName = clusterName;
            CustomZoneMapping = customZoneMapping;
            Id = id;
            ManagedNamespaces = managedNamespaces;
            ProjectId = projectId;
        }
    }
}
