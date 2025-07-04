// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetNetworkContainers
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getNetworkContainers
        /// 
        /// `mongodbatlas.getNetworkContainers` describes all Network Peering Containers. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("test", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         AtlasCidrBlock = "10.8.0.0/21",
        ///         ProviderName = "AWS",
        ///         RegionName = "US_EAST_1",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetNetworkContainers.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkContainer.ProjectId,
        ///         ProviderName = testNetworkContainer.ProviderName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworkContainersResult> InvokeAsync(GetNetworkContainersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkContainersResult>("mongodbatlas:index/getNetworkContainers:getNetworkContainers", args ?? new GetNetworkContainersArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getNetworkContainers
        /// 
        /// `mongodbatlas.getNetworkContainers` describes all Network Peering Containers. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("test", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         AtlasCidrBlock = "10.8.0.0/21",
        ///         ProviderName = "AWS",
        ///         RegionName = "US_EAST_1",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetNetworkContainers.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkContainer.ProjectId,
        ///         ProviderName = testNetworkContainer.ProviderName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkContainersResult> Invoke(GetNetworkContainersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkContainersResult>("mongodbatlas:index/getNetworkContainers:getNetworkContainers", args ?? new GetNetworkContainersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getNetworkContainers
        /// 
        /// `mongodbatlas.getNetworkContainers` describes all Network Peering Containers. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("test", new()
        ///     {
        ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
        ///         AtlasCidrBlock = "10.8.0.0/21",
        ///         ProviderName = "AWS",
        ///         RegionName = "US_EAST_1",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetNetworkContainers.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkContainer.ProjectId,
        ///         ProviderName = testNetworkContainer.ProviderName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkContainersResult> Invoke(GetNetworkContainersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkContainersResult>("mongodbatlas:index/getNetworkContainers:getNetworkContainers", args ?? new GetNetworkContainersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkContainersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for this Network peering container. Accepted values are AWS, GCP, and Azure.
        /// </summary>
        [Input("providerName", required: true)]
        public string ProviderName { get; set; } = null!;

        public GetNetworkContainersArgs()
        {
        }
        public static new GetNetworkContainersArgs Empty => new GetNetworkContainersArgs();
    }

    public sealed class GetNetworkContainersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for this Network peering container. Accepted values are AWS, GCP, and Azure.
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        public GetNetworkContainersInvokeArgs()
        {
        }
        public static new GetNetworkContainersInvokeArgs Empty => new GetNetworkContainersInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkContainersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// Cloud provider for this Network Peering connection. If omitted, Atlas sets this parameter to AWS.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// A list where each represents a Network Peering Container.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkContainersResultResult> Results;

        [OutputConstructor]
        private GetNetworkContainersResult(
            string id,

            string projectId,

            string providerName,

            ImmutableArray<Outputs.GetNetworkContainersResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            ProviderName = providerName;
            Results = results;
        }
    }
}
