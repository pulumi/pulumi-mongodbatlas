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
    /// `mongodbatlas.NetworkPeering` provides a Network Peering Connection resource. The resource lets you create, edit and delete network peering connections. The resource requires your Project ID.
    /// 
    /// Ensure you have first created a network container if it is required for your configuration.  See the network_container resource documentation to determine if you need a network container first.  Examples for creating both container and peering resource are shown below as well as examples for creating the peering connection only.
    /// 
    /// &gt; **GCP AND AZURE ONLY:** Connect via Peering Only mode is deprecated, so no longer needed.  See disable Peering Only mode to disable.
    /// 
    /// &gt; **AZURE ONLY:** To create the peering request with an Azure VNET, you must grant Atlas the following permissions on the virtual network.
    ///     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/read
    ///     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/write
    ///     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/delete
    ///     Microsoft.Network/virtualNetworks/peer/action
    /// For more information see https://docs.atlas.mongodb.com/security-vpc-peering/ and https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/
    /// 
    /// &gt; **Create a Whitelist:** Ensure you whitelist the private IP ranges of the subnets in which your application is hosted in order to connect to your Atlas cluster.  See the project_ip_whitelist resource.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ### Container &amp; Peering Connection
    /// ### Example with AWS
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Container example provided but not always required, 
    ///     // see network_container documentation for details. 
    ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("testNetworkContainer", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         AtlasCidrBlock = "10.8.0.0/21",
    ///         ProviderName = "AWS",
    ///         RegionName = "US_EAST_1",
    ///     });
    /// 
    ///     // Create the peering connection request
    ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("testNetworkPeering", new()
    ///     {
    ///         AccepterRegionName = "us-east-1",
    ///         ProjectId = local.Project_id,
    ///         ContainerId = "507f1f77bcf86cd799439011",
    ///         ProviderName = "AWS",
    ///         RouteTableCidrBlock = "192.168.0.0/24",
    ///         VpcId = "vpc-abc123abc123",
    ///         AwsAccountId = "abc123abc123",
    ///     });
    /// 
    ///     // the following assumes an AWS provider is configured
    ///     // Accept the peering connection request
    ///     var peer = new Aws.Ec2.VpcPeeringConnectionAccepter("peer", new()
    ///     {
    ///         VpcPeeringConnectionId = testNetworkPeering.ConnectionId,
    ///         AutoAccept = true,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with GCP
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Container example provided but not always required, 
    ///     // see network_container documentation for details. 
    ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("testNetworkContainer", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         AtlasCidrBlock = "10.8.0.0/21",
    ///         ProviderName = "GCP",
    ///     });
    /// 
    ///     // Create the peering connection request
    ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("testNetworkPeering", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         ContainerId = testNetworkContainer.ContainerId,
    ///         ProviderName = "GCP",
    ///         GcpProjectId = local.GCP_PROJECT_ID,
    ///         NetworkName = "default",
    ///     });
    /// 
    ///     var @default = Gcp.Compute.GetNetwork.Invoke(new()
    ///     {
    ///         Name = "default",
    ///     });
    /// 
    ///     // Create the GCP peer
    ///     var peering = new Gcp.Compute.NetworkPeering("peering", new()
    ///     {
    ///         Network = @default.Apply(@default =&gt; @default.Apply(getNetworkResult =&gt; getNetworkResult.SelfLink)),
    ///         PeerNetwork = Output.Tuple(testNetworkPeering.AtlasGcpProjectId, testNetworkPeering.AtlasVpcName).Apply(values =&gt;
    ///         {
    ///             var atlasGcpProjectId = values.Item1;
    ///             var atlasVpcName = values.Item2;
    ///             return $"https://www.googleapis.com/compute/v1/projects/{atlasGcpProjectId}/global/networks/{atlasVpcName}";
    ///         }),
    ///     });
    /// 
    ///     // Create the cluster once the peering connection is completed
    ///     var testCluster = new Mongodbatlas.Cluster("testCluster", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         NumShards = 1,
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
    ///                         RegionName = "US_EAST_4",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AutoScalingDiskGbEnabled = true,
    ///         MongoDbMajorVersion = "4.2",
    ///         ProviderName = "GCP",
    ///         ProviderInstanceSizeName = "M10",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             "google_compute_network_peering.peering",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with Azure
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Ensure you have created the required Azure service principal first, see
    ///     // see https://docs.atlas.mongodb.com/security-vpc-peering/
    ///     // Container example provided but not always required, 
    ///     // see network_container documentation for details. 
    ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("testNetworkContainer", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         AtlasCidrBlock = local.ATLAS_CIDR_BLOCK,
    ///         ProviderName = "AZURE",
    ///         Region = "US_EAST_2",
    ///     });
    /// 
    ///     // Create the peering connection request
    ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("testNetworkPeering", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         ContainerId = testNetworkContainer.ContainerId,
    ///         ProviderName = "AZURE",
    ///         AzureDirectoryId = local.AZURE_DIRECTORY_ID,
    ///         AzureSubscriptionId = local.AZURE_SUBSCRIPTION_ID,
    ///         ResourceGroupName = local.AZURE_RESOURCES_GROUP_NAME,
    ///         VnetName = local.AZURE_VNET_NAME,
    ///     });
    /// 
    ///     // Create the cluster once the peering connection is completed
    ///     var testCluster = new Mongodbatlas.Cluster("testCluster", new()
    ///     {
    ///         ProjectId = local.Project_id,
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
    ///                         RegionName = "US_EAST_2",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AutoScalingDiskGbEnabled = true,
    ///         MongoDbMajorVersion = "4.2",
    ///         ProviderName = "AZURE",
    ///         ProviderDiskTypeName = "P4",
    ///         ProviderInstanceSizeName = "M10",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             "mongodbatlas_network_peering.test",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Peering Connection Only, Container Exists
    /// You can create a peering connection if an appropriate container for your cloud provider already exists in your project (see the network_container resource for more information).  A container may already exist if you have already created a cluster in your project, if so you may obtain the `container_id` from the cluster resource as shown in the examples below.
    /// ### Example with AWS
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create an Atlas cluster, this creates a container if one
    ///     // does not yet exist for this AWS region
    ///     var test = new Mongodbatlas.Cluster("test", new()
    ///     {
    ///         ProjectId = local.Project_id,
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
    ///                         RegionName = "US_EAST_2",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AutoScalingDiskGbEnabled = false,
    ///         MongoDbMajorVersion = "4.2",
    ///         ProviderName = "AWS",
    ///         ProviderInstanceSizeName = "M10",
    ///     });
    /// 
    ///     // the following assumes an AWS provider is configured
    ///     var @default = new Aws.Ec2.DefaultVpc("default", new()
    ///     {
    ///         Tags = 
    ///         {
    ///             { "Name", "Default VPC" },
    ///         },
    ///     });
    /// 
    ///     // Create the peering connection request
    ///     var mongoPeer = new Mongodbatlas.NetworkPeering("mongoPeer", new()
    ///     {
    ///         AccepterRegionName = "us-east-2",
    ///         ProjectId = local.Project_id,
    ///         ContainerId = test.ContainerId,
    ///         ProviderName = "AWS",
    ///         RouteTableCidrBlock = "172.31.0.0/16",
    ///         VpcId = @default.Id,
    ///         AwsAccountId = local.AWS_ACCOUNT_ID,
    ///     });
    /// 
    ///     // Accept the connection 
    ///     var awsPeer = new Aws.Ec2.VpcPeeringConnectionAccepter("awsPeer", new()
    ///     {
    ///         VpcPeeringConnectionId = mongoPeer.ConnectionId,
    ///         AutoAccept = true,
    ///         Tags = 
    ///         {
    ///             { "Side", "Accepter" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with GCP
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create an Atlas cluster, this creates a container if one
    ///     // does not yet exist for this GCP 
    ///     var testCluster = new Mongodbatlas.Cluster("testCluster", new()
    ///     {
    ///         ProjectId = local.Project_id,
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
    ///                         RegionName = "US_EAST_2",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AutoScalingDiskGbEnabled = true,
    ///         MongoDbMajorVersion = "4.2",
    ///         ProviderName = "GCP",
    ///         ProviderInstanceSizeName = "M10",
    ///     });
    /// 
    ///     // Create the peering connection request
    ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("testNetworkPeering", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         AtlasCidrBlock = "192.168.0.0/18",
    ///         ContainerId = testCluster.ContainerId,
    ///         ProviderName = "GCP",
    ///         GcpProjectId = local.GCP_PROJECT_ID,
    ///         NetworkName = "default",
    ///     });
    /// 
    ///     var @default = Gcp.Compute.GetNetwork.Invoke(new()
    ///     {
    ///         Name = "default",
    ///     });
    /// 
    ///     // Create the GCP peer
    ///     var peering = new Gcp.Compute.NetworkPeering("peering", new()
    ///     {
    ///         Network = @default.Apply(@default =&gt; @default.Apply(getNetworkResult =&gt; getNetworkResult.SelfLink)),
    ///         PeerNetwork = Output.Tuple(testNetworkPeering.AtlasGcpProjectId, testNetworkPeering.AtlasVpcName).Apply(values =&gt;
    ///         {
    ///             var atlasGcpProjectId = values.Item1;
    ///             var atlasVpcName = values.Item2;
    ///             return $"https://www.googleapis.com/compute/v1/projects/{atlasGcpProjectId}/global/networks/{atlasVpcName}";
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with Azure
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Ensure you have created the required Azure service principal first, see
    ///     // see https://docs.atlas.mongodb.com/security-vpc-peering/
    ///     // Create an Atlas cluster, this creates a container if one
    ///     // does not yet exist for this AZURE region
    ///     var testCluster = new Mongodbatlas.Cluster("testCluster", new()
    ///     {
    ///         ProjectId = local.Project_id,
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
    ///                         RegionName = "US_EAST_2",
    ///                         ElectableNodes = 3,
    ///                         Priority = 7,
    ///                         ReadOnlyNodes = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AutoScalingDiskGbEnabled = false,
    ///         MongoDbMajorVersion = "4.2",
    ///         ProviderName = "AZURE",
    ///         ProviderInstanceSizeName = "M10",
    ///     });
    /// 
    ///     // Create the peering connection request
    ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("testNetworkPeering", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         ContainerId = testCluster.ContainerId,
    ///         ProviderName = "AZURE",
    ///         AzureDirectoryId = local.AZURE_DIRECTORY_ID,
    ///         AzureSubscriptionId = local.AZURE_SUBSCRIPTION_ID,
    ///         ResourceGroupName = local.AZURE_RESOURCE_GROUP_NAME,
    ///         VnetName = local.AZURE_VNET_NAME,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Network Peering Connections can be imported using project ID and network peering id, in the format `PROJECTID-PEERID-PROVIDERNAME`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/networkPeering:NetworkPeering my_peering 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a-AWS
    /// ```
    ///  See detailed information for arguments and attributes[MongoDB API Network Peering Connection](https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/)
    /// 
    /// -&gt; __NOTE:__ If you need to get an existing container ID see the How-To Guide.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/networkPeering:NetworkPeering")]
    public partial class NetworkPeering : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        [Output("accepterRegionName")]
        public Output<string> AccepterRegionName { get; private set; } = null!;

        [Output("atlasCidrBlock")]
        public Output<string> AtlasCidrBlock { get; private set; } = null!;

        /// <summary>
        /// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
        /// </summary>
        [Output("atlasGcpProjectId")]
        public Output<string> AtlasGcpProjectId { get; private set; } = null!;

        [Output("atlasId")]
        public Output<string> AtlasId { get; private set; } = null!;

        [Output("atlasVpcName")]
        public Output<string> AtlasVpcName { get; private set; } = null!;

        /// <summary>
        /// AWS Account ID of the owner of the peer VPC.
        /// </summary>
        [Output("awsAccountId")]
        public Output<string> AwsAccountId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for an Azure AD directory.
        /// </summary>
        [Output("azureDirectoryId")]
        public Output<string> AzureDirectoryId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Azure subscription in which the VNet resides.
        /// </summary>
        [Output("azureSubscriptionId")]
        public Output<string> AzureSubscriptionId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Atlas network peering container.
        /// </summary>
        [Output("connectionId")]
        public Output<string> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
        /// </summary>
        [Output("containerId")]
        public Output<string> ContainerId { get; private set; } = null!;

        /// <summary>
        /// When `"status" : "FAILED"`, Atlas provides a description of the error.
        /// </summary>
        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
        /// </summary>
        [Output("errorState")]
        public Output<string> ErrorState { get; private set; } = null!;

        /// <summary>
        /// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
        /// </summary>
        [Output("errorStateName")]
        public Output<string> ErrorStateName { get; private set; } = null!;

        /// <summary>
        /// GCP project ID of the owner of the network peer.
        /// </summary>
        [Output("gcpProjectId")]
        public Output<string> GcpProjectId { get; private set; } = null!;

        /// <summary>
        /// Name of the network peer to which Atlas connects.
        /// 
        /// **AZURE ONLY:**
        /// </summary>
        [Output("networkName")]
        public Output<string> NetworkName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Atlas network peer.
        /// </summary>
        [Output("peerId")]
        public Output<string> PeerId { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the MongoDB Atlas project to create the database user.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
        /// 
        /// **AWS ONLY:**
        /// </summary>
        [Output("providerName")]
        public Output<string> ProviderName { get; private set; } = null!;

        /// <summary>
        /// Name of your Azure resource group.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// AWS VPC CIDR block or subnet.
        /// 
        /// **GCP ONLY:**
        /// </summary>
        [Output("routeTableCidrBlock")]
        public Output<string> RouteTableCidrBlock { get; private set; } = null!;

        /// <summary>
        /// Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
        /// </summary>
        [Output("statusName")]
        public Output<string> StatusName { get; private set; } = null!;

        /// <summary>
        /// Name of your Azure VNet.
        /// </summary>
        [Output("vnetName")]
        public Output<string> VnetName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkPeering resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkPeering(string name, NetworkPeeringArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/networkPeering:NetworkPeering", name, args ?? new NetworkPeeringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkPeering(string name, Input<string> id, NetworkPeeringState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/networkPeering:NetworkPeering", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkPeering resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkPeering Get(string name, Input<string> id, NetworkPeeringState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkPeering(name, id, state, options);
        }
    }

    public sealed class NetworkPeeringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        [Input("accepterRegionName")]
        public Input<string>? AccepterRegionName { get; set; }

        [Input("atlasCidrBlock")]
        public Input<string>? AtlasCidrBlock { get; set; }

        /// <summary>
        /// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
        /// </summary>
        [Input("atlasGcpProjectId")]
        public Input<string>? AtlasGcpProjectId { get; set; }

        [Input("atlasVpcName")]
        public Input<string>? AtlasVpcName { get; set; }

        /// <summary>
        /// AWS Account ID of the owner of the peer VPC.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// Unique identifier for an Azure AD directory.
        /// </summary>
        [Input("azureDirectoryId")]
        public Input<string>? AzureDirectoryId { get; set; }

        /// <summary>
        /// Unique identifier of the Azure subscription in which the VNet resides.
        /// </summary>
        [Input("azureSubscriptionId")]
        public Input<string>? AzureSubscriptionId { get; set; }

        /// <summary>
        /// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
        /// </summary>
        [Input("containerId", required: true)]
        public Input<string> ContainerId { get; set; } = null!;

        /// <summary>
        /// GCP project ID of the owner of the network peer.
        /// </summary>
        [Input("gcpProjectId")]
        public Input<string>? GcpProjectId { get; set; }

        /// <summary>
        /// Name of the network peer to which Atlas connects.
        /// 
        /// **AZURE ONLY:**
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        /// <summary>
        /// The unique ID for the MongoDB Atlas project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
        /// 
        /// **AWS ONLY:**
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        /// <summary>
        /// Name of your Azure resource group.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// AWS VPC CIDR block or subnet.
        /// 
        /// **GCP ONLY:**
        /// </summary>
        [Input("routeTableCidrBlock")]
        public Input<string>? RouteTableCidrBlock { get; set; }

        /// <summary>
        /// Name of your Azure VNet.
        /// </summary>
        [Input("vnetName")]
        public Input<string>? VnetName { get; set; }

        /// <summary>
        /// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public NetworkPeeringArgs()
        {
        }
        public static new NetworkPeeringArgs Empty => new NetworkPeeringArgs();
    }

    public sealed class NetworkPeeringState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        [Input("accepterRegionName")]
        public Input<string>? AccepterRegionName { get; set; }

        [Input("atlasCidrBlock")]
        public Input<string>? AtlasCidrBlock { get; set; }

        /// <summary>
        /// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
        /// </summary>
        [Input("atlasGcpProjectId")]
        public Input<string>? AtlasGcpProjectId { get; set; }

        [Input("atlasId")]
        public Input<string>? AtlasId { get; set; }

        [Input("atlasVpcName")]
        public Input<string>? AtlasVpcName { get; set; }

        /// <summary>
        /// AWS Account ID of the owner of the peer VPC.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// Unique identifier for an Azure AD directory.
        /// </summary>
        [Input("azureDirectoryId")]
        public Input<string>? AzureDirectoryId { get; set; }

        /// <summary>
        /// Unique identifier of the Azure subscription in which the VNet resides.
        /// </summary>
        [Input("azureSubscriptionId")]
        public Input<string>? AzureSubscriptionId { get; set; }

        /// <summary>
        /// Unique identifier of the Atlas network peering container.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
        /// </summary>
        [Input("containerId")]
        public Input<string>? ContainerId { get; set; }

        /// <summary>
        /// When `"status" : "FAILED"`, Atlas provides a description of the error.
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        /// <summary>
        /// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
        /// </summary>
        [Input("errorState")]
        public Input<string>? ErrorState { get; set; }

        /// <summary>
        /// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
        /// </summary>
        [Input("errorStateName")]
        public Input<string>? ErrorStateName { get; set; }

        /// <summary>
        /// GCP project ID of the owner of the network peer.
        /// </summary>
        [Input("gcpProjectId")]
        public Input<string>? GcpProjectId { get; set; }

        /// <summary>
        /// Name of the network peer to which Atlas connects.
        /// 
        /// **AZURE ONLY:**
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        /// <summary>
        /// Unique identifier of the Atlas network peer.
        /// </summary>
        [Input("peerId")]
        public Input<string>? PeerId { get; set; }

        /// <summary>
        /// The unique ID for the MongoDB Atlas project to create the database user.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
        /// 
        /// **AWS ONLY:**
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Name of your Azure resource group.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// AWS VPC CIDR block or subnet.
        /// 
        /// **GCP ONLY:**
        /// </summary>
        [Input("routeTableCidrBlock")]
        public Input<string>? RouteTableCidrBlock { get; set; }

        /// <summary>
        /// Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
        /// </summary>
        [Input("statusName")]
        public Input<string>? StatusName { get; set; }

        /// <summary>
        /// Name of your Azure VNet.
        /// </summary>
        [Input("vnetName")]
        public Input<string>? VnetName { get; set; }

        /// <summary>
        /// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public NetworkPeeringState()
        {
        }
        public static new NetworkPeeringState Empty => new NetworkPeeringState();
    }
}
