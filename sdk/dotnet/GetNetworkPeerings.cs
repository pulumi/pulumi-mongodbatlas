// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetNetworkPeerings
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getNetworkPeerings
        /// 
        /// `mongodbatlas.getNetworkPeerings` describes all Network Peering Connections.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example (AWS).
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("test", new()
        ///     {
        ///         AccepterRegionName = "us-east-1",
        ///         ProjectId = "&lt;YOUR-PROJEC-ID&gt;",
        ///         ContainerId = "507f1f77bcf86cd799439011",
        ///         ProviderName = "AWS",
        ///         RouteTableCidrBlock = "192.168.0.0/24",
        ///         VpcId = "vpc-abc123abc123",
        ///         AwsAccountId = "abc123abc123",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetNetworkPeerings.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkPeering.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworkPeeringsResult> InvokeAsync(GetNetworkPeeringsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkPeeringsResult>("mongodbatlas:index/getNetworkPeerings:getNetworkPeerings", args ?? new GetNetworkPeeringsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getNetworkPeerings
        /// 
        /// `mongodbatlas.getNetworkPeerings` describes all Network Peering Connections.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example (AWS).
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("test", new()
        ///     {
        ///         AccepterRegionName = "us-east-1",
        ///         ProjectId = "&lt;YOUR-PROJEC-ID&gt;",
        ///         ContainerId = "507f1f77bcf86cd799439011",
        ///         ProviderName = "AWS",
        ///         RouteTableCidrBlock = "192.168.0.0/24",
        ///         VpcId = "vpc-abc123abc123",
        ///         AwsAccountId = "abc123abc123",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetNetworkPeerings.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkPeering.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkPeeringsResult> Invoke(GetNetworkPeeringsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkPeeringsResult>("mongodbatlas:index/getNetworkPeerings:getNetworkPeerings", args ?? new GetNetworkPeeringsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getNetworkPeerings
        /// 
        /// `mongodbatlas.getNetworkPeerings` describes all Network Peering Connections.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example (AWS).
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("test", new()
        ///     {
        ///         AccepterRegionName = "us-east-1",
        ///         ProjectId = "&lt;YOUR-PROJEC-ID&gt;",
        ///         ContainerId = "507f1f77bcf86cd799439011",
        ///         ProviderName = "AWS",
        ///         RouteTableCidrBlock = "192.168.0.0/24",
        ///         VpcId = "vpc-abc123abc123",
        ///         AwsAccountId = "abc123abc123",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetNetworkPeerings.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkPeering.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkPeeringsResult> Invoke(GetNetworkPeeringsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkPeeringsResult>("mongodbatlas:index/getNetworkPeerings:getNetworkPeerings", args ?? new GetNetworkPeeringsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkPeeringsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetNetworkPeeringsArgs()
        {
        }
        public static new GetNetworkPeeringsArgs Empty => new GetNetworkPeeringsArgs();
    }

    public sealed class GetNetworkPeeringsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetNetworkPeeringsInvokeArgs()
        {
        }
        public static new GetNetworkPeeringsInvokeArgs Empty => new GetNetworkPeeringsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkPeeringsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Network Peering Connection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkPeeringsResultResult> Results;

        [OutputConstructor]
        private GetNetworkPeeringsResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetNetworkPeeringsResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
