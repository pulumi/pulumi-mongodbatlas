// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
//
// ```
//
//	For more information see[MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).
type PrivatelinkEndpointServiceServerless struct {
	pulumi.CustomResourceState

	// Unique string that identifies the private endpoint's network interface.
	CloudProviderEndpointId pulumi.StringOutput `pulumi:"cloudProviderEndpointId"`
	// Human-readable string to associate with this private endpoint.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId pulumi.StringOutput `pulumi:"endpointId"`
	// Human-readable label that identifies the serverless instance.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
	PrivateEndpointIpAddress pulumi.StringOutput `pulumi:"privateEndpointIpAddress"`
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId pulumi.StringOutput `pulumi:"privateLinkServiceResourceId"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPrivatelinkEndpointServiceServerless registers a new resource with the given unique name, arguments, and options.
func NewPrivatelinkEndpointServiceServerless(ctx *pulumi.Context,
	name string, args *PrivatelinkEndpointServiceServerlessArgs, opts ...pulumi.ResourceOption) (*PrivatelinkEndpointServiceServerless, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointId == nil {
		return nil, errors.New("invalid value for required argument 'EndpointId'")
	}
	if args.InstanceName == nil {
		return nil, errors.New("invalid value for required argument 'InstanceName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	var resource PrivatelinkEndpointServiceServerless
	err := ctx.RegisterResource("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivatelinkEndpointServiceServerless gets an existing PrivatelinkEndpointServiceServerless resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivatelinkEndpointServiceServerless(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivatelinkEndpointServiceServerlessState, opts ...pulumi.ResourceOption) (*PrivatelinkEndpointServiceServerless, error) {
	var resource PrivatelinkEndpointServiceServerless
	err := ctx.ReadResource("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivatelinkEndpointServiceServerless resources.
type privatelinkEndpointServiceServerlessState struct {
	// Unique string that identifies the private endpoint's network interface.
	CloudProviderEndpointId *string `pulumi:"cloudProviderEndpointId"`
	// Human-readable string to associate with this private endpoint.
	Comment *string `pulumi:"comment"`
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId *string `pulumi:"endpointId"`
	// Human-readable label that identifies the serverless instance.
	InstanceName *string `pulumi:"instanceName"`
	// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
	PrivateEndpointIpAddress *string `pulumi:"privateEndpointIpAddress"`
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId *string `pulumi:"privateLinkServiceResourceId"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId *string `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
	ProviderName *string `pulumi:"providerName"`
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status *string `pulumi:"status"`
}

type PrivatelinkEndpointServiceServerlessState struct {
	// Unique string that identifies the private endpoint's network interface.
	CloudProviderEndpointId pulumi.StringPtrInput
	// Human-readable string to associate with this private endpoint.
	Comment pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId pulumi.StringPtrInput
	// Human-readable label that identifies the serverless instance.
	InstanceName pulumi.StringPtrInput
	// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
	PrivateEndpointIpAddress pulumi.StringPtrInput
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId pulumi.StringPtrInput
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringPtrInput
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
	ProviderName pulumi.StringPtrInput
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status pulumi.StringPtrInput
}

func (PrivatelinkEndpointServiceServerlessState) ElementType() reflect.Type {
	return reflect.TypeOf((*privatelinkEndpointServiceServerlessState)(nil)).Elem()
}

type privatelinkEndpointServiceServerlessArgs struct {
	// Unique string that identifies the private endpoint's network interface.
	CloudProviderEndpointId *string `pulumi:"cloudProviderEndpointId"`
	// Human-readable string to associate with this private endpoint.
	Comment *string `pulumi:"comment"`
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId string `pulumi:"endpointId"`
	// Human-readable label that identifies the serverless instance.
	InstanceName string `pulumi:"instanceName"`
	// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
	PrivateEndpointIpAddress *string `pulumi:"privateEndpointIpAddress"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
	ProviderName string `pulumi:"providerName"`
}

// The set of arguments for constructing a PrivatelinkEndpointServiceServerless resource.
type PrivatelinkEndpointServiceServerlessArgs struct {
	// Unique string that identifies the private endpoint's network interface.
	CloudProviderEndpointId pulumi.StringPtrInput
	// Human-readable string to associate with this private endpoint.
	Comment pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId pulumi.StringInput
	// Human-readable label that identifies the serverless instance.
	InstanceName pulumi.StringInput
	// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
	PrivateEndpointIpAddress pulumi.StringPtrInput
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringInput
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
	ProviderName pulumi.StringInput
}

func (PrivatelinkEndpointServiceServerlessArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privatelinkEndpointServiceServerlessArgs)(nil)).Elem()
}

type PrivatelinkEndpointServiceServerlessInput interface {
	pulumi.Input

	ToPrivatelinkEndpointServiceServerlessOutput() PrivatelinkEndpointServiceServerlessOutput
	ToPrivatelinkEndpointServiceServerlessOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessOutput
}

func (*PrivatelinkEndpointServiceServerless) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivatelinkEndpointServiceServerless)(nil)).Elem()
}

func (i *PrivatelinkEndpointServiceServerless) ToPrivatelinkEndpointServiceServerlessOutput() PrivatelinkEndpointServiceServerlessOutput {
	return i.ToPrivatelinkEndpointServiceServerlessOutputWithContext(context.Background())
}

func (i *PrivatelinkEndpointServiceServerless) ToPrivatelinkEndpointServiceServerlessOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivatelinkEndpointServiceServerlessOutput)
}

// PrivatelinkEndpointServiceServerlessArrayInput is an input type that accepts PrivatelinkEndpointServiceServerlessArray and PrivatelinkEndpointServiceServerlessArrayOutput values.
// You can construct a concrete instance of `PrivatelinkEndpointServiceServerlessArrayInput` via:
//
//	PrivatelinkEndpointServiceServerlessArray{ PrivatelinkEndpointServiceServerlessArgs{...} }
type PrivatelinkEndpointServiceServerlessArrayInput interface {
	pulumi.Input

	ToPrivatelinkEndpointServiceServerlessArrayOutput() PrivatelinkEndpointServiceServerlessArrayOutput
	ToPrivatelinkEndpointServiceServerlessArrayOutputWithContext(context.Context) PrivatelinkEndpointServiceServerlessArrayOutput
}

type PrivatelinkEndpointServiceServerlessArray []PrivatelinkEndpointServiceServerlessInput

func (PrivatelinkEndpointServiceServerlessArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivatelinkEndpointServiceServerless)(nil)).Elem()
}

func (i PrivatelinkEndpointServiceServerlessArray) ToPrivatelinkEndpointServiceServerlessArrayOutput() PrivatelinkEndpointServiceServerlessArrayOutput {
	return i.ToPrivatelinkEndpointServiceServerlessArrayOutputWithContext(context.Background())
}

func (i PrivatelinkEndpointServiceServerlessArray) ToPrivatelinkEndpointServiceServerlessArrayOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivatelinkEndpointServiceServerlessArrayOutput)
}

// PrivatelinkEndpointServiceServerlessMapInput is an input type that accepts PrivatelinkEndpointServiceServerlessMap and PrivatelinkEndpointServiceServerlessMapOutput values.
// You can construct a concrete instance of `PrivatelinkEndpointServiceServerlessMapInput` via:
//
//	PrivatelinkEndpointServiceServerlessMap{ "key": PrivatelinkEndpointServiceServerlessArgs{...} }
type PrivatelinkEndpointServiceServerlessMapInput interface {
	pulumi.Input

	ToPrivatelinkEndpointServiceServerlessMapOutput() PrivatelinkEndpointServiceServerlessMapOutput
	ToPrivatelinkEndpointServiceServerlessMapOutputWithContext(context.Context) PrivatelinkEndpointServiceServerlessMapOutput
}

type PrivatelinkEndpointServiceServerlessMap map[string]PrivatelinkEndpointServiceServerlessInput

func (PrivatelinkEndpointServiceServerlessMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivatelinkEndpointServiceServerless)(nil)).Elem()
}

func (i PrivatelinkEndpointServiceServerlessMap) ToPrivatelinkEndpointServiceServerlessMapOutput() PrivatelinkEndpointServiceServerlessMapOutput {
	return i.ToPrivatelinkEndpointServiceServerlessMapOutputWithContext(context.Background())
}

func (i PrivatelinkEndpointServiceServerlessMap) ToPrivatelinkEndpointServiceServerlessMapOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivatelinkEndpointServiceServerlessMapOutput)
}

type PrivatelinkEndpointServiceServerlessOutput struct{ *pulumi.OutputState }

func (PrivatelinkEndpointServiceServerlessOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivatelinkEndpointServiceServerless)(nil)).Elem()
}

func (o PrivatelinkEndpointServiceServerlessOutput) ToPrivatelinkEndpointServiceServerlessOutput() PrivatelinkEndpointServiceServerlessOutput {
	return o
}

func (o PrivatelinkEndpointServiceServerlessOutput) ToPrivatelinkEndpointServiceServerlessOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessOutput {
	return o
}

// Unique string that identifies the private endpoint's network interface.
func (o PrivatelinkEndpointServiceServerlessOutput) CloudProviderEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.CloudProviderEndpointId }).(pulumi.StringOutput)
}

// Human-readable string to associate with this private endpoint.
func (o PrivatelinkEndpointServiceServerlessOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Unique 24-hexadecimal digit string that identifies the private endpoint.
func (o PrivatelinkEndpointServiceServerlessOutput) EndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.EndpointId }).(pulumi.StringOutput)
}

// Human-readable label that identifies the serverless instance.
func (o PrivatelinkEndpointServiceServerlessOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
func (o PrivatelinkEndpointServiceServerlessOutput) PrivateEndpointIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.PrivateEndpointIpAddress }).(pulumi.StringOutput)
}

// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
func (o PrivatelinkEndpointServiceServerlessOutput) PrivateLinkServiceResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput {
		return v.PrivateLinkServiceResourceId
	}).(pulumi.StringOutput)
}

// Unique 24-digit hexadecimal string that identifies the project.
func (o PrivatelinkEndpointServiceServerlessOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
func (o PrivatelinkEndpointServiceServerlessOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
func (o PrivatelinkEndpointServiceServerlessOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServiceServerless) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type PrivatelinkEndpointServiceServerlessArrayOutput struct{ *pulumi.OutputState }

func (PrivatelinkEndpointServiceServerlessArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivatelinkEndpointServiceServerless)(nil)).Elem()
}

func (o PrivatelinkEndpointServiceServerlessArrayOutput) ToPrivatelinkEndpointServiceServerlessArrayOutput() PrivatelinkEndpointServiceServerlessArrayOutput {
	return o
}

func (o PrivatelinkEndpointServiceServerlessArrayOutput) ToPrivatelinkEndpointServiceServerlessArrayOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessArrayOutput {
	return o
}

func (o PrivatelinkEndpointServiceServerlessArrayOutput) Index(i pulumi.IntInput) PrivatelinkEndpointServiceServerlessOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivatelinkEndpointServiceServerless {
		return vs[0].([]*PrivatelinkEndpointServiceServerless)[vs[1].(int)]
	}).(PrivatelinkEndpointServiceServerlessOutput)
}

type PrivatelinkEndpointServiceServerlessMapOutput struct{ *pulumi.OutputState }

func (PrivatelinkEndpointServiceServerlessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivatelinkEndpointServiceServerless)(nil)).Elem()
}

func (o PrivatelinkEndpointServiceServerlessMapOutput) ToPrivatelinkEndpointServiceServerlessMapOutput() PrivatelinkEndpointServiceServerlessMapOutput {
	return o
}

func (o PrivatelinkEndpointServiceServerlessMapOutput) ToPrivatelinkEndpointServiceServerlessMapOutputWithContext(ctx context.Context) PrivatelinkEndpointServiceServerlessMapOutput {
	return o
}

func (o PrivatelinkEndpointServiceServerlessMapOutput) MapIndex(k pulumi.StringInput) PrivatelinkEndpointServiceServerlessOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivatelinkEndpointServiceServerless {
		return vs[0].(map[string]*PrivatelinkEndpointServiceServerless)[vs[1].(string)]
	}).(PrivatelinkEndpointServiceServerlessOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivatelinkEndpointServiceServerlessInput)(nil)).Elem(), &PrivatelinkEndpointServiceServerless{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivatelinkEndpointServiceServerlessArrayInput)(nil)).Elem(), PrivatelinkEndpointServiceServerlessArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivatelinkEndpointServiceServerlessMapInput)(nil)).Elem(), PrivatelinkEndpointServiceServerlessMap{})
	pulumi.RegisterOutputType(PrivatelinkEndpointServiceServerlessOutput{})
	pulumi.RegisterOutputType(PrivatelinkEndpointServiceServerlessArrayOutput{})
	pulumi.RegisterOutputType(PrivatelinkEndpointServiceServerlessMapOutput{})
}
