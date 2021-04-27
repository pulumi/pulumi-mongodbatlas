// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `NetworkContainer` provides a Network Peering Container resource. The resource lets you create, edit and delete network peering containers. The resource requires your Project ID.  Each cloud provider requires slightly different attributes so read the argument reference carefully.
//
//  Network peering container is a general term used to describe any cloud providers' VPC/VNet concept.  Containers only need to be created if the peering connection to the cloud provider will be created before the first cluster that requires the container.  If the cluster has been/will be created first Atlas automatically creates the required container per the "containers per cloud provider" information that follows (in this case you can obtain the container id from the cluster resource attribute `containerId`).
//
// The following is the maximum number of Network Peering containers per cloud provider:
// <br> &#8226;  GCP -  One container per project.
// <br> &#8226;  AWS and Azure - One container per cloud provider region.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
//
// ## Example Usage
// ### Example with AWS
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v2/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewNetworkContainer(ctx, "test", &mongodbatlas.NetworkContainerArgs{
// 			AtlasCidrBlock: pulumi.String("10.8.0.0/21"),
// 			ProjectId:      pulumi.String("<YOUR-PROJECT-ID>"),
// 			ProviderName:   pulumi.String("AWS"),
// 			RegionName:     pulumi.String("US_EAST_1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Example with GCP
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v2/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewNetworkContainer(ctx, "test", &mongodbatlas.NetworkContainerArgs{
// 			AtlasCidrBlock: pulumi.String("10.8.0.0/21"),
// 			ProjectId:      pulumi.String("<YOUR-PROJECT-ID>"),
// 			ProviderName:   pulumi.String("GCP"),
// 			Regions: pulumi.StringArray{
// 				pulumi.String("US_EAST_4"),
// 				pulumi.String("US_WEST_3"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Example with Azure
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v2/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewNetworkContainer(ctx, "test", &mongodbatlas.NetworkContainerArgs{
// 			AtlasCidrBlock: pulumi.String("10.8.0.0/21"),
// 			ProjectId:      pulumi.String("<YOUR-PROJECT-ID>"),
// 			ProviderName:   pulumi.String("AZURE"),
// 			Region:         pulumi.String("US_EAST_2"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Clusters can be imported using project ID and network peering container id, in the format `PROJECTID-CONTAINER-ID`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/networkContainer:NetworkContainer my_container 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a
// ```
//
//  See detailed information for arguments and attributes[MongoDB API Network Peering Container](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/)
type NetworkContainer struct {
	pulumi.CustomResourceState

	// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
	// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
	// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
	// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
	AtlasCidrBlock pulumi.StringOutput `pulumi:"atlasCidrBlock"`
	// Unique identifier of the Azure subscription in which the VNet resides.
	// * * `vnetName` - 	The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	AzureSubscriptionId pulumi.StringOutput `pulumi:"azureSubscriptionId"`
	// The Network Peering Container ID.
	ContainerId pulumi.StringOutput `pulumi:"containerId"`
	// Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	GcpProjectId pulumi.StringOutput `pulumi:"gcpProjectId"`
	// Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	// **AZURE ONLY:**
	NetworkName pulumi.StringOutput `pulumi:"networkName"`
	// Unique identifier for the Atlas project for this Network Peering Container.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
	ProviderName pulumi.StringPtrOutput `pulumi:"providerName"`
	// Indicates whether the project has Network Peering connections deployed in the container.
	// **AWS ONLY:**
	Provisioned pulumi.BoolOutput `pulumi:"provisioned"`
	// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
	Region pulumi.StringOutput `pulumi:"region"`
	// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	RegionName pulumi.StringOutput `pulumi:"regionName"`
	// Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
	Regions  pulumi.StringArrayOutput `pulumi:"regions"`
	VnetName pulumi.StringOutput      `pulumi:"vnetName"`
	// Unique identifier of Atlas' AWS VPC.
	// **CGP ONLY:**
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewNetworkContainer registers a new resource with the given unique name, arguments, and options.
func NewNetworkContainer(ctx *pulumi.Context,
	name string, args *NetworkContainerArgs, opts ...pulumi.ResourceOption) (*NetworkContainer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AtlasCidrBlock == nil {
		return nil, errors.New("invalid value for required argument 'AtlasCidrBlock'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource NetworkContainer
	err := ctx.RegisterResource("mongodbatlas:index/networkContainer:NetworkContainer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkContainer gets an existing NetworkContainer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkContainer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkContainerState, opts ...pulumi.ResourceOption) (*NetworkContainer, error) {
	var resource NetworkContainer
	err := ctx.ReadResource("mongodbatlas:index/networkContainer:NetworkContainer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkContainer resources.
type networkContainerState struct {
	// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
	// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
	// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
	// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
	AtlasCidrBlock *string `pulumi:"atlasCidrBlock"`
	// Unique identifier of the Azure subscription in which the VNet resides.
	// * * `vnetName` - 	The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	AzureSubscriptionId *string `pulumi:"azureSubscriptionId"`
	// The Network Peering Container ID.
	ContainerId *string `pulumi:"containerId"`
	// Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	GcpProjectId *string `pulumi:"gcpProjectId"`
	// Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	// **AZURE ONLY:**
	NetworkName *string `pulumi:"networkName"`
	// Unique identifier for the Atlas project for this Network Peering Container.
	ProjectId *string `pulumi:"projectId"`
	// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
	ProviderName *string `pulumi:"providerName"`
	// Indicates whether the project has Network Peering connections deployed in the container.
	// **AWS ONLY:**
	Provisioned *bool `pulumi:"provisioned"`
	// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
	Region *string `pulumi:"region"`
	// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	RegionName *string `pulumi:"regionName"`
	// Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
	Regions  []string `pulumi:"regions"`
	VnetName *string  `pulumi:"vnetName"`
	// Unique identifier of Atlas' AWS VPC.
	// **CGP ONLY:**
	VpcId *string `pulumi:"vpcId"`
}

type NetworkContainerState struct {
	// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
	// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
	// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
	// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
	AtlasCidrBlock pulumi.StringPtrInput
	// Unique identifier of the Azure subscription in which the VNet resides.
	// * * `vnetName` - 	The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	AzureSubscriptionId pulumi.StringPtrInput
	// The Network Peering Container ID.
	ContainerId pulumi.StringPtrInput
	// Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	GcpProjectId pulumi.StringPtrInput
	// Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
	// **AZURE ONLY:**
	NetworkName pulumi.StringPtrInput
	// Unique identifier for the Atlas project for this Network Peering Container.
	ProjectId pulumi.StringPtrInput
	// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
	ProviderName pulumi.StringPtrInput
	// Indicates whether the project has Network Peering connections deployed in the container.
	// **AWS ONLY:**
	Provisioned pulumi.BoolPtrInput
	// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
	Region pulumi.StringPtrInput
	// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	RegionName pulumi.StringPtrInput
	// Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
	Regions  pulumi.StringArrayInput
	VnetName pulumi.StringPtrInput
	// Unique identifier of Atlas' AWS VPC.
	// **CGP ONLY:**
	VpcId pulumi.StringPtrInput
}

func (NetworkContainerState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkContainerState)(nil)).Elem()
}

type networkContainerArgs struct {
	// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
	// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
	// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
	// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
	AtlasCidrBlock string `pulumi:"atlasCidrBlock"`
	// Unique identifier for the Atlas project for this Network Peering Container.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
	ProviderName *string `pulumi:"providerName"`
	// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
	Region *string `pulumi:"region"`
	// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	RegionName *string `pulumi:"regionName"`
	// Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
	Regions []string `pulumi:"regions"`
}

// The set of arguments for constructing a NetworkContainer resource.
type NetworkContainerArgs struct {
	// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
	// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
	// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
	// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
	AtlasCidrBlock pulumi.StringInput
	// Unique identifier for the Atlas project for this Network Peering Container.
	ProjectId pulumi.StringInput
	// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
	ProviderName pulumi.StringPtrInput
	// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
	Region pulumi.StringPtrInput
	// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	RegionName pulumi.StringPtrInput
	// Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
	Regions pulumi.StringArrayInput
}

func (NetworkContainerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkContainerArgs)(nil)).Elem()
}

type NetworkContainerInput interface {
	pulumi.Input

	ToNetworkContainerOutput() NetworkContainerOutput
	ToNetworkContainerOutputWithContext(ctx context.Context) NetworkContainerOutput
}

func (*NetworkContainer) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkContainer)(nil))
}

func (i *NetworkContainer) ToNetworkContainerOutput() NetworkContainerOutput {
	return i.ToNetworkContainerOutputWithContext(context.Background())
}

func (i *NetworkContainer) ToNetworkContainerOutputWithContext(ctx context.Context) NetworkContainerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkContainerOutput)
}

func (i *NetworkContainer) ToNetworkContainerPtrOutput() NetworkContainerPtrOutput {
	return i.ToNetworkContainerPtrOutputWithContext(context.Background())
}

func (i *NetworkContainer) ToNetworkContainerPtrOutputWithContext(ctx context.Context) NetworkContainerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkContainerPtrOutput)
}

type NetworkContainerPtrInput interface {
	pulumi.Input

	ToNetworkContainerPtrOutput() NetworkContainerPtrOutput
	ToNetworkContainerPtrOutputWithContext(ctx context.Context) NetworkContainerPtrOutput
}

type networkContainerPtrType NetworkContainerArgs

func (*networkContainerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkContainer)(nil))
}

func (i *networkContainerPtrType) ToNetworkContainerPtrOutput() NetworkContainerPtrOutput {
	return i.ToNetworkContainerPtrOutputWithContext(context.Background())
}

func (i *networkContainerPtrType) ToNetworkContainerPtrOutputWithContext(ctx context.Context) NetworkContainerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkContainerPtrOutput)
}

// NetworkContainerArrayInput is an input type that accepts NetworkContainerArray and NetworkContainerArrayOutput values.
// You can construct a concrete instance of `NetworkContainerArrayInput` via:
//
//          NetworkContainerArray{ NetworkContainerArgs{...} }
type NetworkContainerArrayInput interface {
	pulumi.Input

	ToNetworkContainerArrayOutput() NetworkContainerArrayOutput
	ToNetworkContainerArrayOutputWithContext(context.Context) NetworkContainerArrayOutput
}

type NetworkContainerArray []NetworkContainerInput

func (NetworkContainerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NetworkContainer)(nil))
}

func (i NetworkContainerArray) ToNetworkContainerArrayOutput() NetworkContainerArrayOutput {
	return i.ToNetworkContainerArrayOutputWithContext(context.Background())
}

func (i NetworkContainerArray) ToNetworkContainerArrayOutputWithContext(ctx context.Context) NetworkContainerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkContainerArrayOutput)
}

// NetworkContainerMapInput is an input type that accepts NetworkContainerMap and NetworkContainerMapOutput values.
// You can construct a concrete instance of `NetworkContainerMapInput` via:
//
//          NetworkContainerMap{ "key": NetworkContainerArgs{...} }
type NetworkContainerMapInput interface {
	pulumi.Input

	ToNetworkContainerMapOutput() NetworkContainerMapOutput
	ToNetworkContainerMapOutputWithContext(context.Context) NetworkContainerMapOutput
}

type NetworkContainerMap map[string]NetworkContainerInput

func (NetworkContainerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NetworkContainer)(nil))
}

func (i NetworkContainerMap) ToNetworkContainerMapOutput() NetworkContainerMapOutput {
	return i.ToNetworkContainerMapOutputWithContext(context.Background())
}

func (i NetworkContainerMap) ToNetworkContainerMapOutputWithContext(ctx context.Context) NetworkContainerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkContainerMapOutput)
}

type NetworkContainerOutput struct {
	*pulumi.OutputState
}

func (NetworkContainerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkContainer)(nil))
}

func (o NetworkContainerOutput) ToNetworkContainerOutput() NetworkContainerOutput {
	return o
}

func (o NetworkContainerOutput) ToNetworkContainerOutputWithContext(ctx context.Context) NetworkContainerOutput {
	return o
}

func (o NetworkContainerOutput) ToNetworkContainerPtrOutput() NetworkContainerPtrOutput {
	return o.ToNetworkContainerPtrOutputWithContext(context.Background())
}

func (o NetworkContainerOutput) ToNetworkContainerPtrOutputWithContext(ctx context.Context) NetworkContainerPtrOutput {
	return o.ApplyT(func(v NetworkContainer) *NetworkContainer {
		return &v
	}).(NetworkContainerPtrOutput)
}

type NetworkContainerPtrOutput struct {
	*pulumi.OutputState
}

func (NetworkContainerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkContainer)(nil))
}

func (o NetworkContainerPtrOutput) ToNetworkContainerPtrOutput() NetworkContainerPtrOutput {
	return o
}

func (o NetworkContainerPtrOutput) ToNetworkContainerPtrOutputWithContext(ctx context.Context) NetworkContainerPtrOutput {
	return o
}

type NetworkContainerArrayOutput struct{ *pulumi.OutputState }

func (NetworkContainerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NetworkContainer)(nil))
}

func (o NetworkContainerArrayOutput) ToNetworkContainerArrayOutput() NetworkContainerArrayOutput {
	return o
}

func (o NetworkContainerArrayOutput) ToNetworkContainerArrayOutputWithContext(ctx context.Context) NetworkContainerArrayOutput {
	return o
}

func (o NetworkContainerArrayOutput) Index(i pulumi.IntInput) NetworkContainerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NetworkContainer {
		return vs[0].([]NetworkContainer)[vs[1].(int)]
	}).(NetworkContainerOutput)
}

type NetworkContainerMapOutput struct{ *pulumi.OutputState }

func (NetworkContainerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NetworkContainer)(nil))
}

func (o NetworkContainerMapOutput) ToNetworkContainerMapOutput() NetworkContainerMapOutput {
	return o
}

func (o NetworkContainerMapOutput) ToNetworkContainerMapOutputWithContext(ctx context.Context) NetworkContainerMapOutput {
	return o
}

func (o NetworkContainerMapOutput) MapIndex(k pulumi.StringInput) NetworkContainerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NetworkContainer {
		return vs[0].(map[string]NetworkContainer)[vs[1].(string)]
	}).(NetworkContainerOutput)
}

func init() {
	pulumi.RegisterOutputType(NetworkContainerOutput{})
	pulumi.RegisterOutputType(NetworkContainerPtrOutput{})
	pulumi.RegisterOutputType(NetworkContainerArrayOutput{})
	pulumi.RegisterOutputType(NetworkContainerMapOutput{})
}
