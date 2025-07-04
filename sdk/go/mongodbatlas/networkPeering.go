// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Resource: NetworkPeering
//
// `NetworkPeering` provides a Network Peering Connection resource. The resource lets you create, edit and delete network peering connections. The resource requires your Project ID.
//
// Ensure you have first created a network container if it is required for your configuration.  See the networkContainer resource documentation to determine if you need a network container first.  Examples for creating both container and peering resource are shown below as well as examples for creating the peering connection only.
//
// > **GCP AND AZURE ONLY:** Connect via Peering Only mode is deprecated, so no longer needed.  See [disable Peering Only mode](https://docs.atlas.mongodb.com/reference/faq/connection-changes/#disable-peering-mode) for details
//
// > **AZURE ONLY:** To create the peering request with an Azure VNET, you must grant Atlas the following permissions on the virtual network.
//
//	Microsoft.Network/virtualNetworks/virtualNetworkPeerings/read
//	Microsoft.Network/virtualNetworks/virtualNetworkPeerings/write
//	Microsoft.Network/virtualNetworks/virtualNetworkPeerings/delete
//	Microsoft.Network/virtualNetworks/peer/action
//
// For more information see https://docs.atlas.mongodb.com/security-vpc-peering/ and https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/
//
// > **Create a Whitelist:** Ensure you whitelist the private IP ranges of the subnets in which your application is hosted in order to connect to your Atlas cluster.  See the projectIpWhitelist resource.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
//
// ## Example Usage
//
// ### Container & Peering Connection
//
// ### Example with AWS
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws"
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Container example provided but not always required,
//			// see network_container documentation for details.
//			_, err := mongodbatlas.NewNetworkContainer(ctx, "test", &mongodbatlas.NetworkContainerArgs{
//				ProjectId:      pulumi.Any(projectId),
//				AtlasCidrBlock: pulumi.String("10.8.0.0/21"),
//				ProviderName:   pulumi.String("AWS"),
//				RegionName:     pulumi.String("US_EAST_1"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create the peering connection request
//			testNetworkPeering, err := mongodbatlas.NewNetworkPeering(ctx, "test", &mongodbatlas.NetworkPeeringArgs{
//				AccepterRegionName:  pulumi.String("us-east-1"),
//				ProjectId:           pulumi.Any(projectId),
//				ContainerId:         pulumi.String("507f1f77bcf86cd799439011"),
//				ProviderName:        pulumi.String("AWS"),
//				RouteTableCidrBlock: pulumi.String("192.168.0.0/24"),
//				VpcId:               pulumi.String("vpc-abc123abc123"),
//				AwsAccountId:        pulumi.String("abc123abc123"),
//			})
//			if err != nil {
//				return err
//			}
//			// the following assumes an AWS provider is configured
//			// Accept the peering connection request
//			_, err = aws.NewVpcPeeringConnectionAccepter(ctx, "peer", &aws.VpcPeeringConnectionAccepterArgs{
//				VpcPeeringConnectionId: testNetworkPeering.ConnectionId,
//				AutoAccept:             true,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example with Azure
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Ensure you have created the required Azure service principal first, see
//			// see https://docs.atlas.mongodb.com/security-vpc-peering/
//			// Container example provided but not always required,
//			// see network_container documentation for details.
//			test, err := mongodbatlas.NewNetworkContainer(ctx, "test", &mongodbatlas.NetworkContainerArgs{
//				ProjectId:      pulumi.Any(projectId),
//				AtlasCidrBlock: pulumi.Any(ATLAS_CIDR_BLOCK),
//				ProviderName:   pulumi.String("AZURE"),
//				Region:         pulumi.String("US_EAST_2"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create the peering connection request
//			testNetworkPeering, err := mongodbatlas.NewNetworkPeering(ctx, "test", &mongodbatlas.NetworkPeeringArgs{
//				ProjectId:           pulumi.Any(projectId),
//				ContainerId:         test.ContainerId,
//				ProviderName:        pulumi.String("AZURE"),
//				AzureDirectoryId:    pulumi.Any(AZURE_DIRECTORY_ID),
//				AzureSubscriptionId: pulumi.Any(AZURE_SUBSCRIPTION_ID),
//				ResourceGroupName:   pulumi.Any(AZURE_RESOURCES_GROUP_NAME),
//				VnetName:            pulumi.Any(AZURE_VNET_NAME),
//			})
//			if err != nil {
//				return err
//			}
//			// Create the cluster once the peering connection is completed
//			_, err = mongodbatlas.NewAdvancedCluster(ctx, "test", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:     pulumi.Any(projectId),
//				Name:          pulumi.String("terraform-manually-test"),
//				ClusterType:   pulumi.String("REPLICASET"),
//				BackupEnabled: pulumi.Bool(true),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								Priority:     pulumi.Int(7),
//								ProviderName: pulumi.String("AZURE"),
//								RegionName:   pulumi.String("US_EAST_2"),
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M10"),
//									NodeCount:    pulumi.Int(3),
//								},
//							},
//						},
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				testNetworkPeering,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Peering Connection Only, Container Exists
// You can create a peering connection if an appropriate container for your cloud provider already exists in your project (see the networkContainer resource for more information).  A container may already exist if you have already created a cluster in your project, if so you may obtain the `containerId` from the cluster resource as shown in the examples below.
//
// ## Import
//
// Network Peering Connections can be imported using project ID and network peering id, in the format `PROJECTID-PEERID-PROVIDERNAME`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/networkPeering:NetworkPeering my_peering 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a-AWS
// ```
//
// Use the [MongoDB Atlas CLI][https://www.mongodb.com/docs/atlas/cli/current/command/atlas-networking-peering-list/#std-label-atlas-networking-peering-list] to obtain your `project_id` and `peering_id`. Attention gcp and azure users: The `atlas networking peering list` command returns only `AWS` peerings by default. You have to include the `--provider` parameter to list peerings for your cloud provider. Valid values are AWS, AZURE, or GCP.
//
// atlas projects list
//
// atlas networking peering list --projectId <projectId> --provider <AZURE|GCP|AWS>
//
// See detailed information for arguments and attributes: [MongoDB API Network Peering Connection](https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/)
type NetworkPeering struct {
	pulumi.CustomResourceState

	// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	AccepterRegionName pulumi.StringOutput `pulumi:"accepterRegionName"`
	AtlasCidrBlock     pulumi.StringOutput `pulumi:"atlasCidrBlock"`
	// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasGcpProjectId pulumi.StringOutput `pulumi:"atlasGcpProjectId"`
	AtlasId           pulumi.StringOutput `pulumi:"atlasId"`
	// Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasVpcName pulumi.StringOutput `pulumi:"atlasVpcName"`
	// AWS Account ID of the owner of the peer VPC.
	AwsAccountId pulumi.StringOutput `pulumi:"awsAccountId"`
	// Unique identifier for an Azure AD directory.
	AzureDirectoryId pulumi.StringOutput `pulumi:"azureDirectoryId"`
	// Unique identifier of the Azure subscription in which the VNet resides.
	AzureSubscriptionId pulumi.StringOutput `pulumi:"azureSubscriptionId"`
	// Unique identifier of the Atlas network peering container.
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
	ContainerId pulumi.StringOutput `pulumi:"containerId"`
	// When `"status" : "FAILED"`, Atlas provides a description of the error.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
	ErrorState pulumi.StringOutput `pulumi:"errorState"`
	// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
	ErrorStateName pulumi.StringOutput `pulumi:"errorStateName"`
	// GCP project ID of the owner of the network peer.
	GcpProjectId pulumi.StringOutput `pulumi:"gcpProjectId"`
	// Name of the network peer to which Atlas connects.
	//
	// **AZURE ONLY:**
	NetworkName pulumi.StringOutput `pulumi:"networkName"`
	// Unique identifier of the Atlas network peer.
	PeerId pulumi.StringOutput `pulumi:"peerId"`
	// The unique ID for the MongoDB Atlas project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
	//
	// **AWS ONLY:**
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// Name of your Azure resource group.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// AWS VPC CIDR block or subnet.
	//
	// **GCP ONLY:**
	RouteTableCidrBlock pulumi.StringOutput `pulumi:"routeTableCidrBlock"`
	// Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
	Status pulumi.StringOutput `pulumi:"status"`
	// (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
	StatusName pulumi.StringOutput `pulumi:"statusName"`
	// Name of your Azure VNet.
	VnetName pulumi.StringOutput `pulumi:"vnetName"`
	// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewNetworkPeering registers a new resource with the given unique name, arguments, and options.
func NewNetworkPeering(ctx *pulumi.Context,
	name string, args *NetworkPeeringArgs, opts ...pulumi.ResourceOption) (*NetworkPeering, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContainerId == nil {
		return nil, errors.New("invalid value for required argument 'ContainerId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetworkPeering
	err := ctx.RegisterResource("mongodbatlas:index/networkPeering:NetworkPeering", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkPeering gets an existing NetworkPeering resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkPeering(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkPeeringState, opts ...pulumi.ResourceOption) (*NetworkPeering, error) {
	var resource NetworkPeering
	err := ctx.ReadResource("mongodbatlas:index/networkPeering:NetworkPeering", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkPeering resources.
type networkPeeringState struct {
	// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	AccepterRegionName *string `pulumi:"accepterRegionName"`
	AtlasCidrBlock     *string `pulumi:"atlasCidrBlock"`
	// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasGcpProjectId *string `pulumi:"atlasGcpProjectId"`
	AtlasId           *string `pulumi:"atlasId"`
	// Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasVpcName *string `pulumi:"atlasVpcName"`
	// AWS Account ID of the owner of the peer VPC.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// Unique identifier for an Azure AD directory.
	AzureDirectoryId *string `pulumi:"azureDirectoryId"`
	// Unique identifier of the Azure subscription in which the VNet resides.
	AzureSubscriptionId *string `pulumi:"azureSubscriptionId"`
	// Unique identifier of the Atlas network peering container.
	ConnectionId *string `pulumi:"connectionId"`
	// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
	ContainerId *string `pulumi:"containerId"`
	// When `"status" : "FAILED"`, Atlas provides a description of the error.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
	ErrorState *string `pulumi:"errorState"`
	// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
	ErrorStateName *string `pulumi:"errorStateName"`
	// GCP project ID of the owner of the network peer.
	GcpProjectId *string `pulumi:"gcpProjectId"`
	// Name of the network peer to which Atlas connects.
	//
	// **AZURE ONLY:**
	NetworkName *string `pulumi:"networkName"`
	// Unique identifier of the Atlas network peer.
	PeerId *string `pulumi:"peerId"`
	// The unique ID for the MongoDB Atlas project.
	ProjectId *string `pulumi:"projectId"`
	// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
	//
	// **AWS ONLY:**
	ProviderName *string `pulumi:"providerName"`
	// Name of your Azure resource group.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// AWS VPC CIDR block or subnet.
	//
	// **GCP ONLY:**
	RouteTableCidrBlock *string `pulumi:"routeTableCidrBlock"`
	// Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
	Status *string `pulumi:"status"`
	// (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
	StatusName *string `pulumi:"statusName"`
	// Name of your Azure VNet.
	VnetName *string `pulumi:"vnetName"`
	// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
	VpcId *string `pulumi:"vpcId"`
}

type NetworkPeeringState struct {
	// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	AccepterRegionName pulumi.StringPtrInput
	AtlasCidrBlock     pulumi.StringPtrInput
	// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasGcpProjectId pulumi.StringPtrInput
	AtlasId           pulumi.StringPtrInput
	// Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasVpcName pulumi.StringPtrInput
	// AWS Account ID of the owner of the peer VPC.
	AwsAccountId pulumi.StringPtrInput
	// Unique identifier for an Azure AD directory.
	AzureDirectoryId pulumi.StringPtrInput
	// Unique identifier of the Azure subscription in which the VNet resides.
	AzureSubscriptionId pulumi.StringPtrInput
	// Unique identifier of the Atlas network peering container.
	ConnectionId pulumi.StringPtrInput
	// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
	ContainerId pulumi.StringPtrInput
	// When `"status" : "FAILED"`, Atlas provides a description of the error.
	ErrorMessage pulumi.StringPtrInput
	// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
	ErrorState pulumi.StringPtrInput
	// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
	ErrorStateName pulumi.StringPtrInput
	// GCP project ID of the owner of the network peer.
	GcpProjectId pulumi.StringPtrInput
	// Name of the network peer to which Atlas connects.
	//
	// **AZURE ONLY:**
	NetworkName pulumi.StringPtrInput
	// Unique identifier of the Atlas network peer.
	PeerId pulumi.StringPtrInput
	// The unique ID for the MongoDB Atlas project.
	ProjectId pulumi.StringPtrInput
	// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
	//
	// **AWS ONLY:**
	ProviderName pulumi.StringPtrInput
	// Name of your Azure resource group.
	ResourceGroupName pulumi.StringPtrInput
	// AWS VPC CIDR block or subnet.
	//
	// **GCP ONLY:**
	RouteTableCidrBlock pulumi.StringPtrInput
	// Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
	Status pulumi.StringPtrInput
	// (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
	StatusName pulumi.StringPtrInput
	// Name of your Azure VNet.
	VnetName pulumi.StringPtrInput
	// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
	VpcId pulumi.StringPtrInput
}

func (NetworkPeeringState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPeeringState)(nil)).Elem()
}

type networkPeeringArgs struct {
	// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	AccepterRegionName *string `pulumi:"accepterRegionName"`
	AtlasCidrBlock     *string `pulumi:"atlasCidrBlock"`
	// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasGcpProjectId *string `pulumi:"atlasGcpProjectId"`
	// Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasVpcName *string `pulumi:"atlasVpcName"`
	// AWS Account ID of the owner of the peer VPC.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// Unique identifier for an Azure AD directory.
	AzureDirectoryId *string `pulumi:"azureDirectoryId"`
	// Unique identifier of the Azure subscription in which the VNet resides.
	AzureSubscriptionId *string `pulumi:"azureSubscriptionId"`
	// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
	ContainerId string `pulumi:"containerId"`
	// GCP project ID of the owner of the network peer.
	GcpProjectId *string `pulumi:"gcpProjectId"`
	// Name of the network peer to which Atlas connects.
	//
	// **AZURE ONLY:**
	NetworkName *string `pulumi:"networkName"`
	// The unique ID for the MongoDB Atlas project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
	//
	// **AWS ONLY:**
	ProviderName string `pulumi:"providerName"`
	// Name of your Azure resource group.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// AWS VPC CIDR block or subnet.
	//
	// **GCP ONLY:**
	RouteTableCidrBlock *string `pulumi:"routeTableCidrBlock"`
	// Name of your Azure VNet.
	VnetName *string `pulumi:"vnetName"`
	// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
	VpcId *string `pulumi:"vpcId"`
}

// The set of arguments for constructing a NetworkPeering resource.
type NetworkPeeringArgs struct {
	// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	AccepterRegionName pulumi.StringPtrInput
	AtlasCidrBlock     pulumi.StringPtrInput
	// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasGcpProjectId pulumi.StringPtrInput
	// Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
	AtlasVpcName pulumi.StringPtrInput
	// AWS Account ID of the owner of the peer VPC.
	AwsAccountId pulumi.StringPtrInput
	// Unique identifier for an Azure AD directory.
	AzureDirectoryId pulumi.StringPtrInput
	// Unique identifier of the Azure subscription in which the VNet resides.
	AzureSubscriptionId pulumi.StringPtrInput
	// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
	ContainerId pulumi.StringInput
	// GCP project ID of the owner of the network peer.
	GcpProjectId pulumi.StringPtrInput
	// Name of the network peer to which Atlas connects.
	//
	// **AZURE ONLY:**
	NetworkName pulumi.StringPtrInput
	// The unique ID for the MongoDB Atlas project.
	ProjectId pulumi.StringInput
	// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
	//
	// **AWS ONLY:**
	ProviderName pulumi.StringInput
	// Name of your Azure resource group.
	ResourceGroupName pulumi.StringPtrInput
	// AWS VPC CIDR block or subnet.
	//
	// **GCP ONLY:**
	RouteTableCidrBlock pulumi.StringPtrInput
	// Name of your Azure VNet.
	VnetName pulumi.StringPtrInput
	// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
	VpcId pulumi.StringPtrInput
}

func (NetworkPeeringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPeeringArgs)(nil)).Elem()
}

type NetworkPeeringInput interface {
	pulumi.Input

	ToNetworkPeeringOutput() NetworkPeeringOutput
	ToNetworkPeeringOutputWithContext(ctx context.Context) NetworkPeeringOutput
}

func (*NetworkPeering) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPeering)(nil)).Elem()
}

func (i *NetworkPeering) ToNetworkPeeringOutput() NetworkPeeringOutput {
	return i.ToNetworkPeeringOutputWithContext(context.Background())
}

func (i *NetworkPeering) ToNetworkPeeringOutputWithContext(ctx context.Context) NetworkPeeringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPeeringOutput)
}

// NetworkPeeringArrayInput is an input type that accepts NetworkPeeringArray and NetworkPeeringArrayOutput values.
// You can construct a concrete instance of `NetworkPeeringArrayInput` via:
//
//	NetworkPeeringArray{ NetworkPeeringArgs{...} }
type NetworkPeeringArrayInput interface {
	pulumi.Input

	ToNetworkPeeringArrayOutput() NetworkPeeringArrayOutput
	ToNetworkPeeringArrayOutputWithContext(context.Context) NetworkPeeringArrayOutput
}

type NetworkPeeringArray []NetworkPeeringInput

func (NetworkPeeringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPeering)(nil)).Elem()
}

func (i NetworkPeeringArray) ToNetworkPeeringArrayOutput() NetworkPeeringArrayOutput {
	return i.ToNetworkPeeringArrayOutputWithContext(context.Background())
}

func (i NetworkPeeringArray) ToNetworkPeeringArrayOutputWithContext(ctx context.Context) NetworkPeeringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPeeringArrayOutput)
}

// NetworkPeeringMapInput is an input type that accepts NetworkPeeringMap and NetworkPeeringMapOutput values.
// You can construct a concrete instance of `NetworkPeeringMapInput` via:
//
//	NetworkPeeringMap{ "key": NetworkPeeringArgs{...} }
type NetworkPeeringMapInput interface {
	pulumi.Input

	ToNetworkPeeringMapOutput() NetworkPeeringMapOutput
	ToNetworkPeeringMapOutputWithContext(context.Context) NetworkPeeringMapOutput
}

type NetworkPeeringMap map[string]NetworkPeeringInput

func (NetworkPeeringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPeering)(nil)).Elem()
}

func (i NetworkPeeringMap) ToNetworkPeeringMapOutput() NetworkPeeringMapOutput {
	return i.ToNetworkPeeringMapOutputWithContext(context.Background())
}

func (i NetworkPeeringMap) ToNetworkPeeringMapOutputWithContext(ctx context.Context) NetworkPeeringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPeeringMapOutput)
}

type NetworkPeeringOutput struct{ *pulumi.OutputState }

func (NetworkPeeringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPeering)(nil)).Elem()
}

func (o NetworkPeeringOutput) ToNetworkPeeringOutput() NetworkPeeringOutput {
	return o
}

func (o NetworkPeeringOutput) ToNetworkPeeringOutputWithContext(ctx context.Context) NetworkPeeringOutput {
	return o
}

// Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
func (o NetworkPeeringOutput) AccepterRegionName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AccepterRegionName }).(pulumi.StringOutput)
}

func (o NetworkPeeringOutput) AtlasCidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AtlasCidrBlock }).(pulumi.StringOutput)
}

// The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
func (o NetworkPeeringOutput) AtlasGcpProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AtlasGcpProjectId }).(pulumi.StringOutput)
}

func (o NetworkPeeringOutput) AtlasId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AtlasId }).(pulumi.StringOutput)
}

// Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
func (o NetworkPeeringOutput) AtlasVpcName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AtlasVpcName }).(pulumi.StringOutput)
}

// AWS Account ID of the owner of the peer VPC.
func (o NetworkPeeringOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AwsAccountId }).(pulumi.StringOutput)
}

// Unique identifier for an Azure AD directory.
func (o NetworkPeeringOutput) AzureDirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AzureDirectoryId }).(pulumi.StringOutput)
}

// Unique identifier of the Azure subscription in which the VNet resides.
func (o NetworkPeeringOutput) AzureSubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.AzureSubscriptionId }).(pulumi.StringOutput)
}

// Unique identifier of the Atlas network peering container.
func (o NetworkPeeringOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
func (o NetworkPeeringOutput) ContainerId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ContainerId }).(pulumi.StringOutput)
}

// When `"status" : "FAILED"`, Atlas provides a description of the error.
func (o NetworkPeeringOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
func (o NetworkPeeringOutput) ErrorState() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ErrorState }).(pulumi.StringOutput)
}

// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
func (o NetworkPeeringOutput) ErrorStateName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ErrorStateName }).(pulumi.StringOutput)
}

// GCP project ID of the owner of the network peer.
func (o NetworkPeeringOutput) GcpProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.GcpProjectId }).(pulumi.StringOutput)
}

// Name of the network peer to which Atlas connects.
//
// **AZURE ONLY:**
func (o NetworkPeeringOutput) NetworkName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.NetworkName }).(pulumi.StringOutput)
}

// Unique identifier of the Atlas network peer.
func (o NetworkPeeringOutput) PeerId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.PeerId }).(pulumi.StringOutput)
}

// The unique ID for the MongoDB Atlas project.
func (o NetworkPeeringOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
//
// **AWS ONLY:**
func (o NetworkPeeringOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// Name of your Azure resource group.
func (o NetworkPeeringOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// AWS VPC CIDR block or subnet.
//
// **GCP ONLY:**
func (o NetworkPeeringOutput) RouteTableCidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.RouteTableCidrBlock }).(pulumi.StringOutput)
}

// Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
func (o NetworkPeeringOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
func (o NetworkPeeringOutput) StatusName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.StatusName }).(pulumi.StringOutput)
}

// Name of your Azure VNet.
func (o NetworkPeeringOutput) VnetName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.VnetName }).(pulumi.StringOutput)
}

// Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
func (o NetworkPeeringOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPeering) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type NetworkPeeringArrayOutput struct{ *pulumi.OutputState }

func (NetworkPeeringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPeering)(nil)).Elem()
}

func (o NetworkPeeringArrayOutput) ToNetworkPeeringArrayOutput() NetworkPeeringArrayOutput {
	return o
}

func (o NetworkPeeringArrayOutput) ToNetworkPeeringArrayOutputWithContext(ctx context.Context) NetworkPeeringArrayOutput {
	return o
}

func (o NetworkPeeringArrayOutput) Index(i pulumi.IntInput) NetworkPeeringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkPeering {
		return vs[0].([]*NetworkPeering)[vs[1].(int)]
	}).(NetworkPeeringOutput)
}

type NetworkPeeringMapOutput struct{ *pulumi.OutputState }

func (NetworkPeeringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPeering)(nil)).Elem()
}

func (o NetworkPeeringMapOutput) ToNetworkPeeringMapOutput() NetworkPeeringMapOutput {
	return o
}

func (o NetworkPeeringMapOutput) ToNetworkPeeringMapOutputWithContext(ctx context.Context) NetworkPeeringMapOutput {
	return o
}

func (o NetworkPeeringMapOutput) MapIndex(k pulumi.StringInput) NetworkPeeringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkPeering {
		return vs[0].(map[string]*NetworkPeering)[vs[1].(string)]
	}).(NetworkPeeringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPeeringInput)(nil)).Elem(), &NetworkPeering{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPeeringArrayInput)(nil)).Elem(), NetworkPeeringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPeeringMapInput)(nil)).Elem(), NetworkPeeringMap{})
	pulumi.RegisterOutputType(NetworkPeeringOutput{})
	pulumi.RegisterOutputType(NetworkPeeringArrayOutput{})
	pulumi.RegisterOutputType(NetworkPeeringMapOutput{})
}
