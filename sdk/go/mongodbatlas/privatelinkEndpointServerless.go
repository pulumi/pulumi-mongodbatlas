// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `privatelinkEndpointServerless` Provides a Serverless PrivateLink Endpoint resource.
// This is the first of two resources required to configure PrivateLink for Serverless, the second is mongodbatlas_privatelink_endpoint_service_serverless.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example Usage
//
// ### AWS Example
// <!--Start PulumiCodeChooser -->
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
//			testServerlessInstance, err := mongodbatlas.NewServerlessInstance(ctx, "test", &mongodbatlas.ServerlessInstanceArgs{
//				ProjectId:                           pulumi.String("<PROJECT_ID>"),
//				Name:                                pulumi.String("test-db"),
//				ProviderSettingsBackingProviderName: pulumi.String("AWS"),
//				ProviderSettingsProviderName:        pulumi.String("SERVERLESS"),
//				ProviderSettingsRegionName:          pulumi.String("US_EAST_1"),
//				ContinuousBackupEnabled:             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewPrivatelinkEndpointServerless(ctx, "test", &mongodbatlas.PrivatelinkEndpointServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				ProviderName: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
// ```
// For more information see: [MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).
type PrivatelinkEndpointServerless struct {
	pulumi.CustomResourceState

	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId pulumi.StringOutput `pulumi:"endpointId"`
	// Unique string that identifies the PrivateLink endpoint service.
	EndpointServiceName pulumi.StringOutput `pulumi:"endpointServiceName"`
	// Human-readable label that identifies the serverless instance.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId pulumi.StringOutput `pulumi:"privateLinkServiceResourceId"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Cloud provider name; AWS is currently supported
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPrivatelinkEndpointServerless registers a new resource with the given unique name, arguments, and options.
func NewPrivatelinkEndpointServerless(ctx *pulumi.Context,
	name string, args *PrivatelinkEndpointServerlessArgs, opts ...pulumi.ResourceOption) (*PrivatelinkEndpointServerless, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
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
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivatelinkEndpointServerless
	err := ctx.RegisterResource("mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivatelinkEndpointServerless gets an existing PrivatelinkEndpointServerless resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivatelinkEndpointServerless(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivatelinkEndpointServerlessState, opts ...pulumi.ResourceOption) (*PrivatelinkEndpointServerless, error) {
	var resource PrivatelinkEndpointServerless
	err := ctx.ReadResource("mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivatelinkEndpointServerless resources.
type privatelinkEndpointServerlessState struct {
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId *string `pulumi:"endpointId"`
	// Unique string that identifies the PrivateLink endpoint service.
	EndpointServiceName *string `pulumi:"endpointServiceName"`
	// Human-readable label that identifies the serverless instance.
	InstanceName *string `pulumi:"instanceName"`
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId *string `pulumi:"privateLinkServiceResourceId"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId *string `pulumi:"projectId"`
	// Cloud provider name; AWS is currently supported
	ProviderName *string `pulumi:"providerName"`
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status *string `pulumi:"status"`
}

type PrivatelinkEndpointServerlessState struct {
	// Unique 24-hexadecimal digit string that identifies the private endpoint.
	EndpointId pulumi.StringPtrInput
	// Unique string that identifies the PrivateLink endpoint service.
	EndpointServiceName pulumi.StringPtrInput
	// Human-readable label that identifies the serverless instance.
	InstanceName pulumi.StringPtrInput
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId pulumi.StringPtrInput
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringPtrInput
	// Cloud provider name; AWS is currently supported
	ProviderName pulumi.StringPtrInput
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status pulumi.StringPtrInput
}

func (PrivatelinkEndpointServerlessState) ElementType() reflect.Type {
	return reflect.TypeOf((*privatelinkEndpointServerlessState)(nil)).Elem()
}

type privatelinkEndpointServerlessArgs struct {
	// Human-readable label that identifies the serverless instance.
	InstanceName string `pulumi:"instanceName"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider name; AWS is currently supported
	ProviderName string `pulumi:"providerName"`
}

// The set of arguments for constructing a PrivatelinkEndpointServerless resource.
type PrivatelinkEndpointServerlessArgs struct {
	// Human-readable label that identifies the serverless instance.
	InstanceName pulumi.StringInput
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringInput
	// Cloud provider name; AWS is currently supported
	ProviderName pulumi.StringInput
}

func (PrivatelinkEndpointServerlessArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privatelinkEndpointServerlessArgs)(nil)).Elem()
}

type PrivatelinkEndpointServerlessInput interface {
	pulumi.Input

	ToPrivatelinkEndpointServerlessOutput() PrivatelinkEndpointServerlessOutput
	ToPrivatelinkEndpointServerlessOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessOutput
}

func (*PrivatelinkEndpointServerless) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivatelinkEndpointServerless)(nil)).Elem()
}

func (i *PrivatelinkEndpointServerless) ToPrivatelinkEndpointServerlessOutput() PrivatelinkEndpointServerlessOutput {
	return i.ToPrivatelinkEndpointServerlessOutputWithContext(context.Background())
}

func (i *PrivatelinkEndpointServerless) ToPrivatelinkEndpointServerlessOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivatelinkEndpointServerlessOutput)
}

// PrivatelinkEndpointServerlessArrayInput is an input type that accepts PrivatelinkEndpointServerlessArray and PrivatelinkEndpointServerlessArrayOutput values.
// You can construct a concrete instance of `PrivatelinkEndpointServerlessArrayInput` via:
//
//	PrivatelinkEndpointServerlessArray{ PrivatelinkEndpointServerlessArgs{...} }
type PrivatelinkEndpointServerlessArrayInput interface {
	pulumi.Input

	ToPrivatelinkEndpointServerlessArrayOutput() PrivatelinkEndpointServerlessArrayOutput
	ToPrivatelinkEndpointServerlessArrayOutputWithContext(context.Context) PrivatelinkEndpointServerlessArrayOutput
}

type PrivatelinkEndpointServerlessArray []PrivatelinkEndpointServerlessInput

func (PrivatelinkEndpointServerlessArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivatelinkEndpointServerless)(nil)).Elem()
}

func (i PrivatelinkEndpointServerlessArray) ToPrivatelinkEndpointServerlessArrayOutput() PrivatelinkEndpointServerlessArrayOutput {
	return i.ToPrivatelinkEndpointServerlessArrayOutputWithContext(context.Background())
}

func (i PrivatelinkEndpointServerlessArray) ToPrivatelinkEndpointServerlessArrayOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivatelinkEndpointServerlessArrayOutput)
}

// PrivatelinkEndpointServerlessMapInput is an input type that accepts PrivatelinkEndpointServerlessMap and PrivatelinkEndpointServerlessMapOutput values.
// You can construct a concrete instance of `PrivatelinkEndpointServerlessMapInput` via:
//
//	PrivatelinkEndpointServerlessMap{ "key": PrivatelinkEndpointServerlessArgs{...} }
type PrivatelinkEndpointServerlessMapInput interface {
	pulumi.Input

	ToPrivatelinkEndpointServerlessMapOutput() PrivatelinkEndpointServerlessMapOutput
	ToPrivatelinkEndpointServerlessMapOutputWithContext(context.Context) PrivatelinkEndpointServerlessMapOutput
}

type PrivatelinkEndpointServerlessMap map[string]PrivatelinkEndpointServerlessInput

func (PrivatelinkEndpointServerlessMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivatelinkEndpointServerless)(nil)).Elem()
}

func (i PrivatelinkEndpointServerlessMap) ToPrivatelinkEndpointServerlessMapOutput() PrivatelinkEndpointServerlessMapOutput {
	return i.ToPrivatelinkEndpointServerlessMapOutputWithContext(context.Background())
}

func (i PrivatelinkEndpointServerlessMap) ToPrivatelinkEndpointServerlessMapOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivatelinkEndpointServerlessMapOutput)
}

type PrivatelinkEndpointServerlessOutput struct{ *pulumi.OutputState }

func (PrivatelinkEndpointServerlessOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivatelinkEndpointServerless)(nil)).Elem()
}

func (o PrivatelinkEndpointServerlessOutput) ToPrivatelinkEndpointServerlessOutput() PrivatelinkEndpointServerlessOutput {
	return o
}

func (o PrivatelinkEndpointServerlessOutput) ToPrivatelinkEndpointServerlessOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessOutput {
	return o
}

// Unique 24-hexadecimal digit string that identifies the private endpoint.
func (o PrivatelinkEndpointServerlessOutput) EndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.EndpointId }).(pulumi.StringOutput)
}

// Unique string that identifies the PrivateLink endpoint service.
func (o PrivatelinkEndpointServerlessOutput) EndpointServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.EndpointServiceName }).(pulumi.StringOutput)
}

// Human-readable label that identifies the serverless instance.
func (o PrivatelinkEndpointServerlessOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
func (o PrivatelinkEndpointServerlessOutput) PrivateLinkServiceResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.PrivateLinkServiceResourceId }).(pulumi.StringOutput)
}

// Unique 24-digit hexadecimal string that identifies the project.
func (o PrivatelinkEndpointServerlessOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider name; AWS is currently supported
func (o PrivatelinkEndpointServerlessOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
func (o PrivatelinkEndpointServerlessOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivatelinkEndpointServerless) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type PrivatelinkEndpointServerlessArrayOutput struct{ *pulumi.OutputState }

func (PrivatelinkEndpointServerlessArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivatelinkEndpointServerless)(nil)).Elem()
}

func (o PrivatelinkEndpointServerlessArrayOutput) ToPrivatelinkEndpointServerlessArrayOutput() PrivatelinkEndpointServerlessArrayOutput {
	return o
}

func (o PrivatelinkEndpointServerlessArrayOutput) ToPrivatelinkEndpointServerlessArrayOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessArrayOutput {
	return o
}

func (o PrivatelinkEndpointServerlessArrayOutput) Index(i pulumi.IntInput) PrivatelinkEndpointServerlessOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivatelinkEndpointServerless {
		return vs[0].([]*PrivatelinkEndpointServerless)[vs[1].(int)]
	}).(PrivatelinkEndpointServerlessOutput)
}

type PrivatelinkEndpointServerlessMapOutput struct{ *pulumi.OutputState }

func (PrivatelinkEndpointServerlessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivatelinkEndpointServerless)(nil)).Elem()
}

func (o PrivatelinkEndpointServerlessMapOutput) ToPrivatelinkEndpointServerlessMapOutput() PrivatelinkEndpointServerlessMapOutput {
	return o
}

func (o PrivatelinkEndpointServerlessMapOutput) ToPrivatelinkEndpointServerlessMapOutputWithContext(ctx context.Context) PrivatelinkEndpointServerlessMapOutput {
	return o
}

func (o PrivatelinkEndpointServerlessMapOutput) MapIndex(k pulumi.StringInput) PrivatelinkEndpointServerlessOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivatelinkEndpointServerless {
		return vs[0].(map[string]*PrivatelinkEndpointServerless)[vs[1].(string)]
	}).(PrivatelinkEndpointServerlessOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivatelinkEndpointServerlessInput)(nil)).Elem(), &PrivatelinkEndpointServerless{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivatelinkEndpointServerlessArrayInput)(nil)).Elem(), PrivatelinkEndpointServerlessArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivatelinkEndpointServerlessMapInput)(nil)).Elem(), PrivatelinkEndpointServerlessMap{})
	pulumi.RegisterOutputType(PrivatelinkEndpointServerlessOutput{})
	pulumi.RegisterOutputType(PrivatelinkEndpointServerlessArrayOutput{})
	pulumi.RegisterOutputType(PrivatelinkEndpointServerlessMapOutput{})
}
