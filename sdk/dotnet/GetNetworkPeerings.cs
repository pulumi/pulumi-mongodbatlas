// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// `mongodbatlas.getNetworkPeerings` describes all Network Peering Connections.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Example (AWS).
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testNetworkPeering = new Mongodbatlas.NetworkPeering("testNetworkPeering", new Mongodbatlas.NetworkPeeringArgs
        ///         {
        ///             AccepterRegionName = "us-east-1",
        ///             ProjectId = "&lt;YOUR-PROJEC-ID&gt;",
        ///             ContainerId = "507f1f77bcf86cd799439011",
        ///             ProviderName = "AWS",
        ///             RouteTableCidrBlock = "192.168.0.0/24",
        ///             VpcId = "vpc-abc123abc123",
        ///             AwsAccountId = "abc123abc123",
        ///         });
        ///         var testNetworkPeerings = testNetworkPeering.ProjectId.Apply(projectId =&gt; Mongodbatlas.GetNetworkPeerings.InvokeAsync(new Mongodbatlas.GetNetworkPeeringsArgs
        ///         {
        ///             ProjectId = projectId,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkPeeringsResult> InvokeAsync(GetNetworkPeeringsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworkPeeringsResult>("mongodbatlas:index/getNetworkPeerings:getNetworkPeerings", args ?? new GetNetworkPeeringsArgs(), options.WithVersion());
    }


    public sealed class GetNetworkPeeringsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetNetworkPeeringsArgs()
        {
        }
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
