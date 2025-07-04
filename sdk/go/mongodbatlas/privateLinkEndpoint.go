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

// ## Example Usage
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
//			_, err := mongodbatlas.NewPrivateLinkEndpoint(ctx, "test", &mongodbatlas.PrivateLinkEndpointArgs{
//				ProjectId:    pulumi.String("<PROJECT-ID>"),
//				ProviderName: pulumi.String("AWS/AZURE"),
//				Region:       pulumi.String("US_EAST_1"),
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
// ### Available complete examples
// - Setup private connection to a MongoDB Atlas Cluster with AWS VPC
//
// ## Import
//
// Private Endpoint Service can be imported using project ID, private link ID, provider name and region, in the format `{project_id}-{private_link_id}-{provider_name}-{region}`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint test 1112222b3bf99403840e8934-3242342343112-AWS-us-east-1
// ```
// See detailed information for arguments and attributes: [MongoDB API Private Endpoint Service](https://docs.atlas.mongodb.com/reference/api/private-endpoints-service-create-one/)
type PrivateLinkEndpoint struct {
	pulumi.CustomResourceState

	// GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
	EndpointGroupNames pulumi.StringArrayOutput `pulumi:"endpointGroupNames"`
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName pulumi.StringOutput `pulumi:"endpointServiceName"`
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	// AWS:
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	// AZURE:
	InterfaceEndpoints pulumi.StringArrayOutput `pulumi:"interfaceEndpoints"`
	// All private endpoints that you have added to this Azure Private Link Service.
	PrivateEndpoints pulumi.StringArrayOutput `pulumi:"privateEndpoints"`
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId pulumi.StringOutput `pulumi:"privateLinkId"`
	// Name of the Azure Private Link Service that Atlas manages.
	// GCP:
	PrivateLinkServiceName       pulumi.StringOutput `pulumi:"privateLinkServiceName"`
	PrivateLinkServiceResourceId pulumi.StringOutput `pulumi:"privateLinkServiceResourceId"`
	// Required 	Unique identifier for the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
	Region pulumi.StringOutput `pulumi:"region"`
	// GCP region for the Private Service Connect endpoint service.
	RegionName pulumi.StringOutput `pulumi:"regionName"`
	// Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
	ServiceAttachmentNames pulumi.StringArrayOutput `pulumi:"serviceAttachmentNames"`
	// Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
	// AWS:
	// * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
	// * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
	// * `FAILED` 	A system failure has occurred.
	// * `DELETING` 	The AWS PrivateLink connection is being deleted.
	//   AZURE:
	// * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
	// * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
	// * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
	// * `DELETING` 	Atlas is deleting the Private Link service.
	//   GCP:
	// * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
	// * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
	// * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
	// * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPrivateLinkEndpoint registers a new resource with the given unique name, arguments, and options.
func NewPrivateLinkEndpoint(ctx *pulumi.Context,
	name string, args *PrivateLinkEndpointArgs, opts ...pulumi.ResourceOption) (*PrivateLinkEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivateLinkEndpoint
	err := ctx.RegisterResource("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateLinkEndpoint gets an existing PrivateLinkEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateLinkEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateLinkEndpointState, opts ...pulumi.ResourceOption) (*PrivateLinkEndpoint, error) {
	var resource PrivateLinkEndpoint
	err := ctx.ReadResource("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateLinkEndpoint resources.
type privateLinkEndpointState struct {
	// GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
	EndpointGroupNames []string `pulumi:"endpointGroupNames"`
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName *string `pulumi:"endpointServiceName"`
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	// AWS:
	ErrorMessage *string `pulumi:"errorMessage"`
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	// AZURE:
	InterfaceEndpoints []string `pulumi:"interfaceEndpoints"`
	// All private endpoints that you have added to this Azure Private Link Service.
	PrivateEndpoints []string `pulumi:"privateEndpoints"`
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId *string `pulumi:"privateLinkId"`
	// Name of the Azure Private Link Service that Atlas manages.
	// GCP:
	PrivateLinkServiceName       *string `pulumi:"privateLinkServiceName"`
	PrivateLinkServiceResourceId *string `pulumi:"privateLinkServiceResourceId"`
	// Required 	Unique identifier for the project.
	ProjectId *string `pulumi:"projectId"`
	// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName *string `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
	Region *string `pulumi:"region"`
	// GCP region for the Private Service Connect endpoint service.
	RegionName *string `pulumi:"regionName"`
	// Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
	ServiceAttachmentNames []string `pulumi:"serviceAttachmentNames"`
	// Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
	// AWS:
	// * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
	// * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
	// * `FAILED` 	A system failure has occurred.
	// * `DELETING` 	The AWS PrivateLink connection is being deleted.
	//   AZURE:
	// * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
	// * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
	// * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
	// * `DELETING` 	Atlas is deleting the Private Link service.
	//   GCP:
	// * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
	// * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
	// * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
	// * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
	Status *string `pulumi:"status"`
}

type PrivateLinkEndpointState struct {
	// GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
	EndpointGroupNames pulumi.StringArrayInput
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName pulumi.StringPtrInput
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	// AWS:
	ErrorMessage pulumi.StringPtrInput
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	// AZURE:
	InterfaceEndpoints pulumi.StringArrayInput
	// All private endpoints that you have added to this Azure Private Link Service.
	PrivateEndpoints pulumi.StringArrayInput
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId pulumi.StringPtrInput
	// Name of the Azure Private Link Service that Atlas manages.
	// GCP:
	PrivateLinkServiceName       pulumi.StringPtrInput
	PrivateLinkServiceResourceId pulumi.StringPtrInput
	// Required 	Unique identifier for the project.
	ProjectId pulumi.StringPtrInput
	// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName pulumi.StringPtrInput
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
	Region pulumi.StringPtrInput
	// GCP region for the Private Service Connect endpoint service.
	RegionName pulumi.StringPtrInput
	// Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
	ServiceAttachmentNames pulumi.StringArrayInput
	// Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
	// AWS:
	// * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
	// * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
	// * `FAILED` 	A system failure has occurred.
	// * `DELETING` 	The AWS PrivateLink connection is being deleted.
	//   AZURE:
	// * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
	// * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
	// * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
	// * `DELETING` 	Atlas is deleting the Private Link service.
	//   GCP:
	// * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
	// * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
	// * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
	// * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
	Status pulumi.StringPtrInput
}

func (PrivateLinkEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointState)(nil)).Elem()
}

type privateLinkEndpointArgs struct {
	// Required 	Unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
	// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName string `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a PrivateLinkEndpoint resource.
type PrivateLinkEndpointArgs struct {
	// Required 	Unique identifier for the project.
	ProjectId pulumi.StringInput
	// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
	ProviderName pulumi.StringInput
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
	Region pulumi.StringInput
}

func (PrivateLinkEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointArgs)(nil)).Elem()
}

type PrivateLinkEndpointInput interface {
	pulumi.Input

	ToPrivateLinkEndpointOutput() PrivateLinkEndpointOutput
	ToPrivateLinkEndpointOutputWithContext(ctx context.Context) PrivateLinkEndpointOutput
}

func (*PrivateLinkEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkEndpoint)(nil)).Elem()
}

func (i *PrivateLinkEndpoint) ToPrivateLinkEndpointOutput() PrivateLinkEndpointOutput {
	return i.ToPrivateLinkEndpointOutputWithContext(context.Background())
}

func (i *PrivateLinkEndpoint) ToPrivateLinkEndpointOutputWithContext(ctx context.Context) PrivateLinkEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointOutput)
}

// PrivateLinkEndpointArrayInput is an input type that accepts PrivateLinkEndpointArray and PrivateLinkEndpointArrayOutput values.
// You can construct a concrete instance of `PrivateLinkEndpointArrayInput` via:
//
//	PrivateLinkEndpointArray{ PrivateLinkEndpointArgs{...} }
type PrivateLinkEndpointArrayInput interface {
	pulumi.Input

	ToPrivateLinkEndpointArrayOutput() PrivateLinkEndpointArrayOutput
	ToPrivateLinkEndpointArrayOutputWithContext(context.Context) PrivateLinkEndpointArrayOutput
}

type PrivateLinkEndpointArray []PrivateLinkEndpointInput

func (PrivateLinkEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkEndpoint)(nil)).Elem()
}

func (i PrivateLinkEndpointArray) ToPrivateLinkEndpointArrayOutput() PrivateLinkEndpointArrayOutput {
	return i.ToPrivateLinkEndpointArrayOutputWithContext(context.Background())
}

func (i PrivateLinkEndpointArray) ToPrivateLinkEndpointArrayOutputWithContext(ctx context.Context) PrivateLinkEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointArrayOutput)
}

// PrivateLinkEndpointMapInput is an input type that accepts PrivateLinkEndpointMap and PrivateLinkEndpointMapOutput values.
// You can construct a concrete instance of `PrivateLinkEndpointMapInput` via:
//
//	PrivateLinkEndpointMap{ "key": PrivateLinkEndpointArgs{...} }
type PrivateLinkEndpointMapInput interface {
	pulumi.Input

	ToPrivateLinkEndpointMapOutput() PrivateLinkEndpointMapOutput
	ToPrivateLinkEndpointMapOutputWithContext(context.Context) PrivateLinkEndpointMapOutput
}

type PrivateLinkEndpointMap map[string]PrivateLinkEndpointInput

func (PrivateLinkEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkEndpoint)(nil)).Elem()
}

func (i PrivateLinkEndpointMap) ToPrivateLinkEndpointMapOutput() PrivateLinkEndpointMapOutput {
	return i.ToPrivateLinkEndpointMapOutputWithContext(context.Background())
}

func (i PrivateLinkEndpointMap) ToPrivateLinkEndpointMapOutputWithContext(ctx context.Context) PrivateLinkEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointMapOutput)
}

type PrivateLinkEndpointOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkEndpoint)(nil)).Elem()
}

func (o PrivateLinkEndpointOutput) ToPrivateLinkEndpointOutput() PrivateLinkEndpointOutput {
	return o
}

func (o PrivateLinkEndpointOutput) ToPrivateLinkEndpointOutputWithContext(ctx context.Context) PrivateLinkEndpointOutput {
	return o
}

// GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
func (o PrivateLinkEndpointOutput) EndpointGroupNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringArrayOutput { return v.EndpointGroupNames }).(pulumi.StringArrayOutput)
}

// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
func (o PrivateLinkEndpointOutput) EndpointServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.EndpointServiceName }).(pulumi.StringOutput)
}

// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
// AWS:
func (o PrivateLinkEndpointOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
// AZURE:
func (o PrivateLinkEndpointOutput) InterfaceEndpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringArrayOutput { return v.InterfaceEndpoints }).(pulumi.StringArrayOutput)
}

// All private endpoints that you have added to this Azure Private Link Service.
func (o PrivateLinkEndpointOutput) PrivateEndpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringArrayOutput { return v.PrivateEndpoints }).(pulumi.StringArrayOutput)
}

// Unique identifier of the AWS PrivateLink connection.
func (o PrivateLinkEndpointOutput) PrivateLinkId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.PrivateLinkId }).(pulumi.StringOutput)
}

// Name of the Azure Private Link Service that Atlas manages.
// GCP:
func (o PrivateLinkEndpointOutput) PrivateLinkServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.PrivateLinkServiceName }).(pulumi.StringOutput)
}

func (o PrivateLinkEndpointOutput) PrivateLinkServiceResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.PrivateLinkServiceResourceId }).(pulumi.StringOutput)
}

// Required 	Unique identifier for the project.
func (o PrivateLinkEndpointOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
func (o PrivateLinkEndpointOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// Cloud provider region in which you want to create the private endpoint connection.
// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
func (o PrivateLinkEndpointOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// GCP region for the Private Service Connect endpoint service.
func (o PrivateLinkEndpointOutput) RegionName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.RegionName }).(pulumi.StringOutput)
}

// Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
func (o PrivateLinkEndpointOutput) ServiceAttachmentNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringArrayOutput { return v.ServiceAttachmentNames }).(pulumi.StringArrayOutput)
}

// Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
// AWS:
//   - `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
//   - `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
//   - `FAILED` 	A system failure has occurred.
//   - `DELETING` 	The AWS PrivateLink connection is being deleted.
//     AZURE:
//   - `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
//   - `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
//   - `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
//   - `DELETING` 	Atlas is deleting the Private Link service.
//     GCP:
//   - `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
//   - `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
//   - `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
//   - `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
func (o PrivateLinkEndpointOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkEndpoint) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type PrivateLinkEndpointArrayOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkEndpoint)(nil)).Elem()
}

func (o PrivateLinkEndpointArrayOutput) ToPrivateLinkEndpointArrayOutput() PrivateLinkEndpointArrayOutput {
	return o
}

func (o PrivateLinkEndpointArrayOutput) ToPrivateLinkEndpointArrayOutputWithContext(ctx context.Context) PrivateLinkEndpointArrayOutput {
	return o
}

func (o PrivateLinkEndpointArrayOutput) Index(i pulumi.IntInput) PrivateLinkEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateLinkEndpoint {
		return vs[0].([]*PrivateLinkEndpoint)[vs[1].(int)]
	}).(PrivateLinkEndpointOutput)
}

type PrivateLinkEndpointMapOutput struct{ *pulumi.OutputState }

func (PrivateLinkEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkEndpoint)(nil)).Elem()
}

func (o PrivateLinkEndpointMapOutput) ToPrivateLinkEndpointMapOutput() PrivateLinkEndpointMapOutput {
	return o
}

func (o PrivateLinkEndpointMapOutput) ToPrivateLinkEndpointMapOutputWithContext(ctx context.Context) PrivateLinkEndpointMapOutput {
	return o
}

func (o PrivateLinkEndpointMapOutput) MapIndex(k pulumi.StringInput) PrivateLinkEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateLinkEndpoint {
		return vs[0].(map[string]*PrivateLinkEndpoint)[vs[1].(string)]
	}).(PrivateLinkEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkEndpointInput)(nil)).Elem(), &PrivateLinkEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkEndpointArrayInput)(nil)).Elem(), PrivateLinkEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkEndpointMapInput)(nil)).Elem(), PrivateLinkEndpointMap{})
	pulumi.RegisterOutputType(PrivateLinkEndpointOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointArrayOutput{})
	pulumi.RegisterOutputType(PrivateLinkEndpointMapOutput{})
}
