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

// ## Import
//
// Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
// ```
// See detailed information for arguments and attributes: [MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)
type PrivateLinkEndpointService struct {
	pulumi.CustomResourceState

	// Status of the interface endpoint for AWS.
	// Returns one of the following values:
	// * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn't yet created the VPC endpoint.
	// * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
	// * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
	// * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
	// * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
	// * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
	AwsConnectionStatus pulumi.StringOutput `pulumi:"awsConnectionStatus"`
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	AzureStatus pulumi.StringOutput `pulumi:"azureStatus"`
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested pulumi.BoolOutput `pulumi:"deleteRequested"`
	// (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
	EndpointGroupName pulumi.StringOutput `pulumi:"endpointGroupName"`
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
	EndpointServiceId pulumi.StringOutput `pulumi:"endpointServiceId"`
	// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
	Endpoints PrivateLinkEndpointServiceEndpointArrayOutput `pulumi:"endpoints"`
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
	GcpProjectId pulumi.StringPtrOutput `pulumi:"gcpProjectId"`
	// Status of the interface endpoint for GCP.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	GcpStatus pulumi.StringOutput `pulumi:"gcpStatus"`
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
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn't yet created the VPC endpoint.
	// * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
	// * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
	// * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
	// * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
	// * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
	AwsConnectionStatus *string `pulumi:"awsConnectionStatus"`
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	AzureStatus *string `pulumi:"azureStatus"`
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested *bool `pulumi:"deleteRequested"`
	// (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
	EndpointGroupName *string `pulumi:"endpointGroupName"`
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
	EndpointServiceId *string `pulumi:"endpointServiceId"`
	// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
	Endpoints []PrivateLinkEndpointServiceEndpoint `pulumi:"endpoints"`
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
	GcpProjectId *string `pulumi:"gcpProjectId"`
	// Status of the interface endpoint for GCP.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	GcpStatus *string `pulumi:"gcpStatus"`
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
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName *string `pulumi:"providerName"`
}

type PrivateLinkEndpointServiceState struct {
	// Status of the interface endpoint for AWS.
	// Returns one of the following values:
	// * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn't yet created the VPC endpoint.
	// * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
	// * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
	// * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
	// * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
	// * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
	AwsConnectionStatus pulumi.StringPtrInput
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	AzureStatus pulumi.StringPtrInput
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested pulumi.BoolPtrInput
	// (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
	EndpointGroupName pulumi.StringPtrInput
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
	EndpointServiceId pulumi.StringPtrInput
	// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
	Endpoints PrivateLinkEndpointServiceEndpointArrayInput
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage pulumi.StringPtrInput
	// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
	GcpProjectId pulumi.StringPtrInput
	// Status of the interface endpoint for GCP.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	GcpStatus pulumi.StringPtrInput
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
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName pulumi.StringPtrInput
}

func (PrivateLinkEndpointServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointServiceState)(nil)).Elem()
}

type privateLinkEndpointServiceArgs struct {
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
	EndpointServiceId string `pulumi:"endpointServiceId"`
	// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
	Endpoints []PrivateLinkEndpointServiceEndpoint `pulumi:"endpoints"`
	// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
	GcpProjectId *string `pulumi:"gcpProjectId"`
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress *string `pulumi:"privateEndpointIpAddress"`
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId string `pulumi:"privateLinkId"`
	// Unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName string `pulumi:"providerName"`
}

// The set of arguments for constructing a PrivateLinkEndpointService resource.
type PrivateLinkEndpointServiceArgs struct {
	// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
	EndpointServiceId pulumi.StringInput
	// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
	Endpoints PrivateLinkEndpointServiceEndpointArrayInput
	// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
	GcpProjectId pulumi.StringPtrInput
	// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
	PrivateEndpointIpAddress pulumi.StringPtrInput
	// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
	PrivateLinkId pulumi.StringInput
	// Unique identifier for the project.
	ProjectId pulumi.StringInput
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
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
	return reflect.TypeOf((**PrivateLinkEndpointService)(nil)).Elem()
}

func (i *PrivateLinkEndpointService) ToPrivateLinkEndpointServiceOutput() PrivateLinkEndpointServiceOutput {
	return i.ToPrivateLinkEndpointServiceOutputWithContext(context.Background())
}

func (i *PrivateLinkEndpointService) ToPrivateLinkEndpointServiceOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServiceOutput)
}

// PrivateLinkEndpointServiceArrayInput is an input type that accepts PrivateLinkEndpointServiceArray and PrivateLinkEndpointServiceArrayOutput values.
// You can construct a concrete instance of `PrivateLinkEndpointServiceArrayInput` via:
//
//	PrivateLinkEndpointServiceArray{ PrivateLinkEndpointServiceArgs{...} }
type PrivateLinkEndpointServiceArrayInput interface {
	pulumi.Input

	ToPrivateLinkEndpointServiceArrayOutput() PrivateLinkEndpointServiceArrayOutput
	ToPrivateLinkEndpointServiceArrayOutputWithContext(context.Context) PrivateLinkEndpointServiceArrayOutput
}

type PrivateLinkEndpointServiceArray []PrivateLinkEndpointServiceInput

func (PrivateLinkEndpointServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkEndpointService)(nil)).Elem()
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
//	PrivateLinkEndpointServiceMap{ "key": PrivateLinkEndpointServiceArgs{...} }
type PrivateLinkEndpointServiceMapInput interface {
	pulumi.Input

	ToPrivateLinkEndpointServiceMapOutput() PrivateLinkEndpointServiceMapOutput
	ToPrivateLinkEndpointServiceMapOutputWithContext(context.Context) PrivateLinkEndpointServiceMapOutput
}

type PrivateLinkEndpointServiceMap map[string]PrivateLinkEndpointServiceInput

func (PrivateLinkEndpointServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkEndpointService)(nil)).Elem()
}

func (i PrivateLinkEndpointServiceMap) ToPrivateLinkEndpointServiceMapOutput() PrivateLinkEndpointServiceMapOutput {
	return i.ToPrivateLinkEndpointServiceMapOutputWithContext(context.Background())
}

func (i PrivateLinkEndpointServiceMap) ToPrivateLinkEndpointServiceMapOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointServiceMapOutput)
}

type PrivateLinkEndpointServiceOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkEndpointService)(nil)).Elem()
}

func (o PrivateLinkEndpointServiceOutput) ToPrivateLinkEndpointServiceOutput() PrivateLinkEndpointServiceOutput {
	return o
}

func (o PrivateLinkEndpointServiceOutput) ToPrivateLinkEndpointServiceOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceOutput {
	return o
}

// Status of the interface endpoint for AWS.
// Returns one of the following values:
// * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn't yet created the VPC endpoint.
// * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
// * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
// * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
// * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
// * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
func (o PrivateLinkEndpointServiceOutput) AwsConnectionStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.AwsConnectionStatus }).(pulumi.StringOutput)
}

// Status of the interface endpoint for AZURE.
// Returns one of the following values:
// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
// * `FAILED` - Atlas failed to accept the connection your private endpoint.
// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
func (o PrivateLinkEndpointServiceOutput) AzureStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.AzureStatus }).(pulumi.StringOutput)
}

// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
func (o PrivateLinkEndpointServiceOutput) DeleteRequested() pulumi.BoolOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.BoolOutput { return v.DeleteRequested }).(pulumi.BoolOutput)
}

// (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
func (o PrivateLinkEndpointServiceOutput) EndpointGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.EndpointGroupName }).(pulumi.StringOutput)
}

// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
func (o PrivateLinkEndpointServiceOutput) EndpointServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.EndpointServiceId }).(pulumi.StringOutput)
}

// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
func (o PrivateLinkEndpointServiceOutput) Endpoints() PrivateLinkEndpointServiceEndpointArrayOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) PrivateLinkEndpointServiceEndpointArrayOutput { return v.Endpoints }).(PrivateLinkEndpointServiceEndpointArrayOutput)
}

// Error message pertaining to the interface endpoint. Returns null if there are no errors.
func (o PrivateLinkEndpointServiceOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
func (o PrivateLinkEndpointServiceOutput) GcpProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringPtrOutput { return v.GcpProjectId }).(pulumi.StringPtrOutput)
}

// Status of the interface endpoint for GCP.
// Returns one of the following values:
// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
// * `FAILED` - Atlas failed to accept the connection your private endpoint.
// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
func (o PrivateLinkEndpointServiceOutput) GcpStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.GcpStatus }).(pulumi.StringOutput)
}

// Unique identifier of the interface endpoint.
func (o PrivateLinkEndpointServiceOutput) InterfaceEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.InterfaceEndpointId }).(pulumi.StringOutput)
}

// Name of the connection for this private endpoint that Atlas generates.
func (o PrivateLinkEndpointServiceOutput) PrivateEndpointConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.PrivateEndpointConnectionName }).(pulumi.StringOutput)
}

// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
func (o PrivateLinkEndpointServiceOutput) PrivateEndpointIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.PrivateEndpointIpAddress }).(pulumi.StringOutput)
}

// Unique identifier of the private endpoint.
func (o PrivateLinkEndpointServiceOutput) PrivateEndpointResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.PrivateEndpointResourceId }).(pulumi.StringOutput)
}

// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
func (o PrivateLinkEndpointServiceOutput) PrivateLinkId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.PrivateLinkId }).(pulumi.StringOutput)
}

// Unique identifier for the project.
func (o PrivateLinkEndpointServiceOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
func (o PrivateLinkEndpointServiceOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpointService) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

type PrivateLinkEndpointServiceArrayOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkEndpointService)(nil)).Elem()
}

func (o PrivateLinkEndpointServiceArrayOutput) ToPrivateLinkEndpointServiceArrayOutput() PrivateLinkEndpointServiceArrayOutput {
	return o
}

func (o PrivateLinkEndpointServiceArrayOutput) ToPrivateLinkEndpointServiceArrayOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceArrayOutput {
	return o
}

func (o PrivateLinkEndpointServiceArrayOutput) Index(i pulumi.IntInput) PrivateLinkEndpointServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateLinkEndpointService {
		return vs[0].([]*PrivateLinkEndpointService)[vs[1].(int)]
	}).(PrivateLinkEndpointServiceOutput)
}

type PrivateLinkEndpointServiceMapOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkEndpointService)(nil)).Elem()
}

func (o PrivateLinkEndpointServiceMapOutput) ToPrivateLinkEndpointServiceMapOutput() PrivateLinkEndpointServiceMapOutput {
	return o
}

func (o PrivateLinkEndpointServiceMapOutput) ToPrivateLinkEndpointServiceMapOutputWithContext(ctx context.Context) PrivateLinkEndpointServiceMapOutput {
	return o
}

func (o PrivateLinkEndpointServiceMapOutput) MapIndex(k pulumi.StringInput) PrivateLinkEndpointServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateLinkEndpointService {
		return vs[0].(map[string]*PrivateLinkEndpointService)[vs[1].(string)]
	}).(PrivateLinkEndpointServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkEndpointServiceInput)(nil)).Elem(), &PrivateLinkEndpointService{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkEndpointServiceArrayInput)(nil)).Elem(), PrivateLinkEndpointServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkEndpointServiceMapInput)(nil)).Elem(), PrivateLinkEndpointServiceMap{})
	pulumi.RegisterOutputType(PrivateLinkEndpointServiceOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointServiceArrayOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointServiceMapOutput{})
}
