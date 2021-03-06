// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one interface endpoint to a private endpoint connection in an Atlas project.
//
// > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
//   * Organization Owner
//   * Project Owner
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v2/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testPrivateLinkEndpoint, err := mongodbatlas.NewPrivateLinkEndpoint(ctx, "testPrivateLinkEndpoint", &mongodbatlas.PrivateLinkEndpointArgs{
// 			ProjectId:    pulumi.String("<PROJECT_ID>"),
// 			ProviderName: pulumi.String("AWS"),
// 			Region:       pulumi.String("us-east-1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ptfeService, err := ec2.NewVpcEndpoint(ctx, "ptfeService", &ec2.VpcEndpointArgs{
// 			VpcId:           pulumi.String("vpc-7fc0a543"),
// 			ServiceName:     testPrivateLinkEndpoint.EndpointServiceName,
// 			VpcEndpointType: pulumi.String("Interface"),
// 			SubnetIds: pulumi.StringArray{
// 				pulumi.String("subnet-de0406d2"),
// 			},
// 			SecurityGroupIds: pulumi.StringArray{
// 				pulumi.String("sg-3f238186"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = mongodbatlas.NewPrivateLinkEndpointService(ctx, "testPrivateLinkEndpointService", &mongodbatlas.PrivateLinkEndpointServiceArgs{
// 			ProjectId:         testPrivateLinkEndpoint.ProjectId,
// 			PrivateLinkId:     testPrivateLinkEndpoint.PrivateLinkId,
// 			EndpointServiceId: ptfeService.ID(),
// 			ProviderName:      pulumi.String("AWS"),
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
// Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
// ```
//
//  See detailed information for arguments and attributes[MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)
type PrivateLinkEndpointService struct {
	pulumi.CustomResourceState

	// Status of the interface endpoint for AWS.
	// Returns one of the following values:
	AwsConnectionStatus pulumi.StringOutput `pulumi:"awsConnectionStatus"`
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	AzureStatus pulumi.StringOutput `pulumi:"azureStatus"`
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested pulumi.BoolOutput `pulumi:"deleteRequested"`
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
	EndpointServiceId pulumi.StringOutput `pulumi:"endpointServiceId"`
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Unique identifier of the interface endpoint.
	InterfaceEndpointId pulumi.StringOutput `pulumi:"interfaceEndpointId"`
	// Name of the connection for this private endpoint that Atlas generates.
	PrivateEndpointConnectionName pulumi.StringOutput `pulumi:"privateEndpointConnectionName"`
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress pulumi.StringOutput `pulumi:"privateEndpointIpAddress"`
	// Unique identifier of the private endpoint.
	PrivateEndpointResourceId pulumi.StringOutput `pulumi:"privateEndpointResourceId"`
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId pulumi.StringOutput `pulumi:"privateLinkId"`
	// Unique identifier for the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
}

// NewPrivateLinkEndpointService registers a new resource with the given unique name, arguments, and options.
func NewPrivateLinkEndpointService(ctx *pulumi.Context,
	name string, args *PrivateLinkEndpointServiceArgs, opts ...pulumi.ResourceOption) (*PrivateLinkEndpointService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointServiceId == nil {
		return nil, errors.New("invalid value for required argument 'EndpointServiceId'")
	}
	if args.PrivateLinkId == nil {
		return nil, errors.New("invalid value for required argument 'PrivateLinkId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	var resource PrivateLinkEndpointService
	err := ctx.RegisterResource("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateLinkEndpointService gets an existing PrivateLinkEndpointService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateLinkEndpointService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateLinkEndpointServiceState, opts ...pulumi.ResourceOption) (*PrivateLinkEndpointService, error) {
	var resource PrivateLinkEndpointService
	err := ctx.ReadResource("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateLinkEndpointService resources.
type privateLinkEndpointServiceState struct {
	// Status of the interface endpoint for AWS.
	// Returns one of the following values:
	AwsConnectionStatus *string `pulumi:"awsConnectionStatus"`
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	AzureStatus *string `pulumi:"azureStatus"`
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested *bool `pulumi:"deleteRequested"`
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
	EndpointServiceId *string `pulumi:"endpointServiceId"`
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Unique identifier of the interface endpoint.
	InterfaceEndpointId *string `pulumi:"interfaceEndpointId"`
	// Name of the connection for this private endpoint that Atlas generates.
	PrivateEndpointConnectionName *string `pulumi:"privateEndpointConnectionName"`
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress *string `pulumi:"privateEndpointIpAddress"`
	// Unique identifier of the private endpoint.
	PrivateEndpointResourceId *string `pulumi:"privateEndpointResourceId"`
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId *string `pulumi:"privateLinkId"`
	// Unique identifier for the project.
	ProjectId *string `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
	ProviderName *string `pulumi:"providerName"`
}

type PrivateLinkEndpointServiceState struct {
	// Status of the interface endpoint for AWS.
	// Returns one of the following values:
	AwsConnectionStatus pulumi.StringPtrInput
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	AzureStatus pulumi.StringPtrInput
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested pulumi.BoolPtrInput
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
	EndpointServiceId pulumi.StringPtrInput
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage pulumi.StringPtrInput
	// Unique identifier of the interface endpoint.
	InterfaceEndpointId pulumi.StringPtrInput
	// Name of the connection for this private endpoint that Atlas generates.
	PrivateEndpointConnectionName pulumi.StringPtrInput
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress pulumi.StringPtrInput
	// Unique identifier of the private endpoint.
	PrivateEndpointResourceId pulumi.StringPtrInput
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId pulumi.StringPtrInput
	// Unique identifier for the project.
	ProjectId pulumi.StringPtrInput
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
	ProviderName pulumi.StringPtrInput
}

func (PrivateLinkEndpointServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointServiceState)(nil)).Elem()
}

type privateLinkEndpointServiceArgs struct {
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
	EndpointServiceId string `pulumi:"endpointServiceId"`
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress *string `pulumi:"privateEndpointIpAddress"`
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId string `pulumi:"privateLinkId"`
	// Unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
	ProviderName string `pulumi:"providerName"`
}

// The set of arguments for constructing a PrivateLinkEndpointService resource.
type PrivateLinkEndpointServiceArgs struct {
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
	EndpointServiceId pulumi.StringInput
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress pulumi.StringPtrInput
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId pulumi.StringInput
	// Unique identifier for the project.
	ProjectId pulumi.StringInput
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
	ProviderName pulumi.StringInput
}

func (PrivateLinkEndpointServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointServiceArgs)(nil)).Elem()
}

type PrivateLinkEndpointServiceInput interface {
	pulumi.Input

	ToPrivateLinkEndpointServiceOutput() PrivateLinkEndpointServiceOutput
	ToPrivateLinkEndpointServiceOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceOutput
}

func (*PrivateLinkEndpointService) ElementType() reflect.Type {
	return reflect.TypeOf((*PrivateLinkEndpointService)(nil))
}

func (i *PrivateLinkEndpointService) ToPrivateLinkEndpointServiceOutput() PrivateLinkEndpointServiceOutput {
	return i.ToPrivateLinkEndpointServiceOutputWithContext(context.Background())
}

func (i *PrivateLinkEndpointService) ToPrivateLinkEndpointServiceOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServiceOutput)
}

func (i *PrivateLinkEndpointService) ToPrivateLinkEndpointServicePtrOutput() PrivateLinkEndpointServicePtrOutput {
	return i.ToPrivateLinkEndpointServicePtrOutputWithContext(context.Background())
}

func (i *PrivateLinkEndpointService) ToPrivateLinkEndpointServicePtrOutputWithContext(ctx context.Context) PrivateLinkEndpointServicePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServicePtrOutput)
}

type PrivateLinkEndpointServicePtrInput interface {
	pulumi.Input

	ToPrivateLinkEndpointServicePtrOutput() PrivateLinkEndpointServicePtrOutput
	ToPrivateLinkEndpointServicePtrOutputWithContext(ctx context.Context) PrivateLinkEndpointServicePtrOutput
}

type privateLinkEndpointServicePtrType PrivateLinkEndpointServiceArgs

func (*privateLinkEndpointServicePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkEndpointService)(nil))
}

func (i *privateLinkEndpointServicePtrType) ToPrivateLinkEndpointServicePtrOutput() PrivateLinkEndpointServicePtrOutput {
	return i.ToPrivateLinkEndpointServicePtrOutputWithContext(context.Background())
}

func (i *privateLinkEndpointServicePtrType) ToPrivateLinkEndpointServicePtrOutputWithContext(ctx context.Context) PrivateLinkEndpointServicePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServicePtrOutput)
}

// PrivateLinkEndpointServiceArrayInput is an input type that accepts PrivateLinkEndpointServiceArray and PrivateLinkEndpointServiceArrayOutput values.
// You can construct a concrete instance of `PrivateLinkEndpointServiceArrayInput` via:
//
//          PrivateLinkEndpointServiceArray{ PrivateLinkEndpointServiceArgs{...} }
type PrivateLinkEndpointServiceArrayInput interface {
	pulumi.Input

	ToPrivateLinkEndpointServiceArrayOutput() PrivateLinkEndpointServiceArrayOutput
	ToPrivateLinkEndpointServiceArrayOutputWithContext(context.Context) PrivateLinkEndpointServiceArrayOutput
}

type PrivateLinkEndpointServiceArray []PrivateLinkEndpointServiceInput

func (PrivateLinkEndpointServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*PrivateLinkEndpointService)(nil))
}

func (i PrivateLinkEndpointServiceArray) ToPrivateLinkEndpointServiceArrayOutput() PrivateLinkEndpointServiceArrayOutput {
	return i.ToPrivateLinkEndpointServiceArrayOutputWithContext(context.Background())
}

func (i PrivateLinkEndpointServiceArray) ToPrivateLinkEndpointServiceArrayOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServiceArrayOutput)
}

// PrivateLinkEndpointServiceMapInput is an input type that accepts PrivateLinkEndpointServiceMap and PrivateLinkEndpointServiceMapOutput values.
// You can construct a concrete instance of `PrivateLinkEndpointServiceMapInput` via:
//
//          PrivateLinkEndpointServiceMap{ "key": PrivateLinkEndpointServiceArgs{...} }
type PrivateLinkEndpointServiceMapInput interface {
	pulumi.Input

	ToPrivateLinkEndpointServiceMapOutput() PrivateLinkEndpointServiceMapOutput
	ToPrivateLinkEndpointServiceMapOutputWithContext(context.Context) PrivateLinkEndpointServiceMapOutput
}

type PrivateLinkEndpointServiceMap map[string]PrivateLinkEndpointServiceInput

func (PrivateLinkEndpointServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*PrivateLinkEndpointService)(nil))
}

func (i PrivateLinkEndpointServiceMap) ToPrivateLinkEndpointServiceMapOutput() PrivateLinkEndpointServiceMapOutput {
	return i.ToPrivateLinkEndpointServiceMapOutputWithContext(context.Background())
}

func (i PrivateLinkEndpointServiceMap) ToPrivateLinkEndpointServiceMapOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServiceMapOutput)
}

type PrivateLinkEndpointServiceOutput struct {
	*pulumi.OutputState
}

func (PrivateLinkEndpointServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PrivateLinkEndpointService)(nil))
}

func (o PrivateLinkEndpointServiceOutput) ToPrivateLinkEndpointServiceOutput() PrivateLinkEndpointServiceOutput {
	return o
}

func (o PrivateLinkEndpointServiceOutput) ToPrivateLinkEndpointServiceOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceOutput {
	return o
}

func (o PrivateLinkEndpointServiceOutput) ToPrivateLinkEndpointServicePtrOutput() PrivateLinkEndpointServicePtrOutput {
	return o.ToPrivateLinkEndpointServicePtrOutputWithContext(context.Background())
}

func (o PrivateLinkEndpointServiceOutput) ToPrivateLinkEndpointServicePtrOutputWithContext(ctx context.Context) PrivateLinkEndpointServicePtrOutput {
	return o.ApplyT(func(v PrivateLinkEndpointService) *PrivateLinkEndpointService {
		return &v
	}).(PrivateLinkEndpointServicePtrOutput)
}

type PrivateLinkEndpointServicePtrOutput struct {
	*pulumi.OutputState
}

func (PrivateLinkEndpointServicePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkEndpointService)(nil))
}

func (o PrivateLinkEndpointServicePtrOutput) ToPrivateLinkEndpointServicePtrOutput() PrivateLinkEndpointServicePtrOutput {
	return o
}

func (o PrivateLinkEndpointServicePtrOutput) ToPrivateLinkEndpointServicePtrOutputWithContext(ctx context.Context) PrivateLinkEndpointServicePtrOutput {
	return o
}

type PrivateLinkEndpointServiceArrayOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PrivateLinkEndpointService)(nil))
}

func (o PrivateLinkEndpointServiceArrayOutput) ToPrivateLinkEndpointServiceArrayOutput() PrivateLinkEndpointServiceArrayOutput {
	return o
}

func (o PrivateLinkEndpointServiceArrayOutput) ToPrivateLinkEndpointServiceArrayOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceArrayOutput {
	return o
}

func (o PrivateLinkEndpointServiceArrayOutput) Index(i pulumi.IntInput) PrivateLinkEndpointServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) PrivateLinkEndpointService {
		return vs[0].([]PrivateLinkEndpointService)[vs[1].(int)]
	}).(PrivateLinkEndpointServiceOutput)
}

type PrivateLinkEndpointServiceMapOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]PrivateLinkEndpointService)(nil))
}

func (o PrivateLinkEndpointServiceMapOutput) ToPrivateLinkEndpointServiceMapOutput() PrivateLinkEndpointServiceMapOutput {
	return o
}

func (o PrivateLinkEndpointServiceMapOutput) ToPrivateLinkEndpointServiceMapOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceMapOutput {
	return o
}

func (o PrivateLinkEndpointServiceMapOutput) MapIndex(k pulumi.StringInput) PrivateLinkEndpointServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) PrivateLinkEndpointService {
		return vs[0].(map[string]PrivateLinkEndpointService)[vs[1].(string)]
	}).(PrivateLinkEndpointServiceOutput)
}

func init() {
	pulumi.RegisterOutputType(PrivateLinkEndpointServiceOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointServicePtrOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointServiceArrayOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointServiceMapOutput{})
}
