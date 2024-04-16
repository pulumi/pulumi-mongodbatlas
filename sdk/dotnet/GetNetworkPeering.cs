// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetNetworkPeering
    {
        /// <summary>
        /// `mongodbatlas.NetworkPeering` describes a Network Peering Connection.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// &gt; **NOTE:** If you need to get an existing container ID see the How-To Guide.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example (AWS).
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
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
        ///     var test = Mongodbatlas.GetNetworkPeering.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkPeering.ProjectId,
        ///         PeeringId = testNetworkPeering.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetNetworkPeeringResult> InvokeAsync(GetNetworkPeeringArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkPeeringResult>("mongodbatlas:index/getNetworkPeering:getNetworkPeering", args ?? new GetNetworkPeeringArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.NetworkPeering` describes a Network Peering Connection.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// 
        /// &gt; **NOTE:** If you need to get an existing container ID see the How-To Guide.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Example (AWS).
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
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
        ///     var test = Mongodbatlas.GetNetworkPeering.Invoke(new()
        ///     {
        ///         ProjectId = testNetworkPeering.ProjectId,
        ///         PeeringId = testNetworkPeering.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetNetworkPeeringResult> Invoke(GetNetworkPeeringInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkPeeringResult>("mongodbatlas:index/getNetworkPeering:getNetworkPeering", args ?? new GetNetworkPeeringInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkPeeringArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Atlas assigned unique ID for the peering connection.
        /// </summary>
        [Input("peeringId", required: true)]
        public string PeeringId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetNetworkPeeringArgs()
        {
        }
        public static new GetNetworkPeeringArgs Empty => new GetNetworkPeeringArgs();
    }

    public sealed class GetNetworkPeeringInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Atlas assigned unique ID for the peering connection.
        /// </summary>
        [Input("peeringId", required: true)]
        public Input<string> PeeringId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetNetworkPeeringInvokeArgs()
        {
        }
        public static new GetNetworkPeeringInvokeArgs Empty => new GetNetworkPeeringInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkPeeringResult
    {
        /// <summary>
        /// Specifies the region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        public readonly string AccepterRegionName;
        public readonly string AtlasCidrBlock;
        public readonly string AtlasId;
        /// <summary>
        /// Account ID of the owner of the peer VPC.
        /// </summary>
        public readonly string AwsAccountId;
        /// <summary>
        /// Unique identifier for an Azure AD directory.
        /// </summary>
        public readonly string AzureDirectoryId;
        /// <summary>
        /// Unique identifer of the Azure subscription in which the VNet resides.
        /// </summary>
        public readonly string AzureSubscriptionId;
        /// <summary>
        /// Unique identifier for the peering connection.
        /// </summary>
        public readonly string ConnectionId;
        public readonly string ContainerId;
        /// <summary>
        /// When `"status" : "FAILED"`, Atlas provides a description of the error.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
        /// </summary>
        public readonly string ErrorState;
        /// <summary>
        /// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
        /// </summary>
        public readonly string ErrorStateName;
        /// <summary>
        /// GCP project ID of the owner of the network peer.
        /// </summary>
        public readonly string GcpProjectId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the network peer to which Atlas connects.
        /// </summary>
        public readonly string NetworkName;
        public readonly string PeeringId;
        public readonly string ProjectId;
        /// <summary>
        /// Cloud provider for this VPC peering connection. If omitted, Atlas sets this parameter to AWS. (Possible Values `AWS`, `AZURE`, `GCP`).
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Name of your Azure resource group.
        /// </summary>
        public readonly string ResourceGroupName;
        /// <summary>
        /// Peer VPC CIDR block or subnet.
        /// </summary>
        public readonly string RouteTableCidrBlock;
        /// <summary>
        /// Status of the Atlas network peering connection: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING`, `WAITING_FOR_USER`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
        /// </summary>
        public readonly string StatusName;
        /// <summary>
        /// Name of your Azure VNet.
        /// </summary>
        public readonly string VnetName;
        /// <summary>
        /// Unique identifier of the peer VPC.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetNetworkPeeringResult(
            string accepterRegionName,

            string atlasCidrBlock,

            string atlasId,

            string awsAccountId,

            string azureDirectoryId,

            string azureSubscriptionId,

            string connectionId,

            string containerId,

            string errorMessage,

            string errorState,

            string errorStateName,

            string gcpProjectId,

            string id,

            string networkName,

            string peeringId,

            string projectId,

            string providerName,

            string resourceGroupName,

            string routeTableCidrBlock,

            string status,

            string statusName,

            string vnetName,

            string vpcId)
        {
            AccepterRegionName = accepterRegionName;
            AtlasCidrBlock = atlasCidrBlock;
            AtlasId = atlasId;
            AwsAccountId = awsAccountId;
            AzureDirectoryId = azureDirectoryId;
            AzureSubscriptionId = azureSubscriptionId;
            ConnectionId = connectionId;
            ContainerId = containerId;
            ErrorMessage = errorMessage;
            ErrorState = errorState;
            ErrorStateName = errorStateName;
            GcpProjectId = gcpProjectId;
            Id = id;
            NetworkName = networkName;
            PeeringId = peeringId;
            ProjectId = projectId;
            ProviderName = providerName;
            ResourceGroupName = resourceGroupName;
            RouteTableCidrBlock = routeTableCidrBlock;
            Status = status;
            StatusName = statusName;
            VnetName = vnetName;
            VpcId = vpcId;
        }
    }
}
