// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type CloudProviderAccessAuthorization struct {
	pulumi.CustomResourceState

	AuthorizedDate pulumi.StringOutput                                     `pulumi:"authorizedDate"`
	Aws            CloudProviderAccessAuthorizationAwsPtrOutput            `pulumi:"aws"`
	FeatureUsages  CloudProviderAccessAuthorizationFeatureUsageArrayOutput `pulumi:"featureUsages"`
	ProjectId      pulumi.StringOutput                                     `pulumi:"projectId"`
	RoleId         pulumi.StringOutput                                     `pulumi:"roleId"`
}

// NewCloudProviderAccessAuthorization registers a new resource with the given unique name, arguments, and options.
func NewCloudProviderAccessAuthorization(ctx *pulumi.Context,
	name string, args *CloudProviderAccessAuthorizationArgs, opts ...pulumi.ResourceOption) (*CloudProviderAccessAuthorization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.RoleId == nil {
		return nil, errors.New("invalid value for required argument 'RoleId'")
	}
	var resource CloudProviderAccessAuthorization
	err := ctx.RegisterResource("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudProviderAccessAuthorization gets an existing CloudProviderAccessAuthorization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudProviderAccessAuthorization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudProviderAccessAuthorizationState, opts ...pulumi.ResourceOption) (*CloudProviderAccessAuthorization, error) {
	var resource CloudProviderAccessAuthorization
	err := ctx.ReadResource("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudProviderAccessAuthorization resources.
type cloudProviderAccessAuthorizationState struct {
	AuthorizedDate *string                                        `pulumi:"authorizedDate"`
	Aws            *CloudProviderAccessAuthorizationAws           `pulumi:"aws"`
	FeatureUsages  []CloudProviderAccessAuthorizationFeatureUsage `pulumi:"featureUsages"`
	ProjectId      *string                                        `pulumi:"projectId"`
	RoleId         *string                                        `pulumi:"roleId"`
}

type CloudProviderAccessAuthorizationState struct {
	AuthorizedDate pulumi.StringPtrInput
	Aws            CloudProviderAccessAuthorizationAwsPtrInput
	FeatureUsages  CloudProviderAccessAuthorizationFeatureUsageArrayInput
	ProjectId      pulumi.StringPtrInput
	RoleId         pulumi.StringPtrInput
}

func (CloudProviderAccessAuthorizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderAccessAuthorizationState)(nil)).Elem()
}

type cloudProviderAccessAuthorizationArgs struct {
	Aws       *CloudProviderAccessAuthorizationAws `pulumi:"aws"`
	ProjectId string                               `pulumi:"projectId"`
	RoleId    string                               `pulumi:"roleId"`
}

// The set of arguments for constructing a CloudProviderAccessAuthorization resource.
type CloudProviderAccessAuthorizationArgs struct {
	Aws       CloudProviderAccessAuthorizationAwsPtrInput
	ProjectId pulumi.StringInput
	RoleId    pulumi.StringInput
}

func (CloudProviderAccessAuthorizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderAccessAuthorizationArgs)(nil)).Elem()
}

type CloudProviderAccessAuthorizationInput interface {
	pulumi.Input

	ToCloudProviderAccessAuthorizationOutput() CloudProviderAccessAuthorizationOutput
	ToCloudProviderAccessAuthorizationOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationOutput
}

func (*CloudProviderAccessAuthorization) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudProviderAccessAuthorization)(nil))
}

func (i *CloudProviderAccessAuthorization) ToCloudProviderAccessAuthorizationOutput() CloudProviderAccessAuthorizationOutput {
	return i.ToCloudProviderAccessAuthorizationOutputWithContext(context.Background())
}

func (i *CloudProviderAccessAuthorization) ToCloudProviderAccessAuthorizationOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderAccessAuthorizationOutput)
}

func (i *CloudProviderAccessAuthorization) ToCloudProviderAccessAuthorizationPtrOutput() CloudProviderAccessAuthorizationPtrOutput {
	return i.ToCloudProviderAccessAuthorizationPtrOutputWithContext(context.Background())
}

func (i *CloudProviderAccessAuthorization) ToCloudProviderAccessAuthorizationPtrOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderAccessAuthorizationPtrOutput)
}

type CloudProviderAccessAuthorizationPtrInput interface {
	pulumi.Input

	ToCloudProviderAccessAuthorizationPtrOutput() CloudProviderAccessAuthorizationPtrOutput
	ToCloudProviderAccessAuthorizationPtrOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationPtrOutput
}

type cloudProviderAccessAuthorizationPtrType CloudProviderAccessAuthorizationArgs

func (*cloudProviderAccessAuthorizationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudProviderAccessAuthorization)(nil))
}

func (i *cloudProviderAccessAuthorizationPtrType) ToCloudProviderAccessAuthorizationPtrOutput() CloudProviderAccessAuthorizationPtrOutput {
	return i.ToCloudProviderAccessAuthorizationPtrOutputWithContext(context.Background())
}

func (i *cloudProviderAccessAuthorizationPtrType) ToCloudProviderAccessAuthorizationPtrOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderAccessAuthorizationPtrOutput)
}

// CloudProviderAccessAuthorizationArrayInput is an input type that accepts CloudProviderAccessAuthorizationArray and CloudProviderAccessAuthorizationArrayOutput values.
// You can construct a concrete instance of `CloudProviderAccessAuthorizationArrayInput` via:
//
//          CloudProviderAccessAuthorizationArray{ CloudProviderAccessAuthorizationArgs{...} }
type CloudProviderAccessAuthorizationArrayInput interface {
	pulumi.Input

	ToCloudProviderAccessAuthorizationArrayOutput() CloudProviderAccessAuthorizationArrayOutput
	ToCloudProviderAccessAuthorizationArrayOutputWithContext(context.Context) CloudProviderAccessAuthorizationArrayOutput
}

type CloudProviderAccessAuthorizationArray []CloudProviderAccessAuthorizationInput

func (CloudProviderAccessAuthorizationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CloudProviderAccessAuthorization)(nil))
}

func (i CloudProviderAccessAuthorizationArray) ToCloudProviderAccessAuthorizationArrayOutput() CloudProviderAccessAuthorizationArrayOutput {
	return i.ToCloudProviderAccessAuthorizationArrayOutputWithContext(context.Background())
}

func (i CloudProviderAccessAuthorizationArray) ToCloudProviderAccessAuthorizationArrayOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderAccessAuthorizationArrayOutput)
}

// CloudProviderAccessAuthorizationMapInput is an input type that accepts CloudProviderAccessAuthorizationMap and CloudProviderAccessAuthorizationMapOutput values.
// You can construct a concrete instance of `CloudProviderAccessAuthorizationMapInput` via:
//
//          CloudProviderAccessAuthorizationMap{ "key": CloudProviderAccessAuthorizationArgs{...} }
type CloudProviderAccessAuthorizationMapInput interface {
	pulumi.Input

	ToCloudProviderAccessAuthorizationMapOutput() CloudProviderAccessAuthorizationMapOutput
	ToCloudProviderAccessAuthorizationMapOutputWithContext(context.Context) CloudProviderAccessAuthorizationMapOutput
}

type CloudProviderAccessAuthorizationMap map[string]CloudProviderAccessAuthorizationInput

func (CloudProviderAccessAuthorizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CloudProviderAccessAuthorization)(nil))
}

func (i CloudProviderAccessAuthorizationMap) ToCloudProviderAccessAuthorizationMapOutput() CloudProviderAccessAuthorizationMapOutput {
	return i.ToCloudProviderAccessAuthorizationMapOutputWithContext(context.Background())
}

func (i CloudProviderAccessAuthorizationMap) ToCloudProviderAccessAuthorizationMapOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderAccessAuthorizationMapOutput)
}

type CloudProviderAccessAuthorizationOutput struct {
	*pulumi.OutputState
}

func (CloudProviderAccessAuthorizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudProviderAccessAuthorization)(nil))
}

func (o CloudProviderAccessAuthorizationOutput) ToCloudProviderAccessAuthorizationOutput() CloudProviderAccessAuthorizationOutput {
	return o
}

func (o CloudProviderAccessAuthorizationOutput) ToCloudProviderAccessAuthorizationOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationOutput {
	return o
}

func (o CloudProviderAccessAuthorizationOutput) ToCloudProviderAccessAuthorizationPtrOutput() CloudProviderAccessAuthorizationPtrOutput {
	return o.ToCloudProviderAccessAuthorizationPtrOutputWithContext(context.Background())
}

func (o CloudProviderAccessAuthorizationOutput) ToCloudProviderAccessAuthorizationPtrOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationPtrOutput {
	return o.ApplyT(func(v CloudProviderAccessAuthorization) *CloudProviderAccessAuthorization {
		return &v
	}).(CloudProviderAccessAuthorizationPtrOutput)
}

type CloudProviderAccessAuthorizationPtrOutput struct {
	*pulumi.OutputState
}

func (CloudProviderAccessAuthorizationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudProviderAccessAuthorization)(nil))
}

func (o CloudProviderAccessAuthorizationPtrOutput) ToCloudProviderAccessAuthorizationPtrOutput() CloudProviderAccessAuthorizationPtrOutput {
	return o
}

func (o CloudProviderAccessAuthorizationPtrOutput) ToCloudProviderAccessAuthorizationPtrOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationPtrOutput {
	return o
}

type CloudProviderAccessAuthorizationArrayOutput struct{ *pulumi.OutputState }

func (CloudProviderAccessAuthorizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CloudProviderAccessAuthorization)(nil))
}

func (o CloudProviderAccessAuthorizationArrayOutput) ToCloudProviderAccessAuthorizationArrayOutput() CloudProviderAccessAuthorizationArrayOutput {
	return o
}

func (o CloudProviderAccessAuthorizationArrayOutput) ToCloudProviderAccessAuthorizationArrayOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationArrayOutput {
	return o
}

func (o CloudProviderAccessAuthorizationArrayOutput) Index(i pulumi.IntInput) CloudProviderAccessAuthorizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CloudProviderAccessAuthorization {
		return vs[0].([]CloudProviderAccessAuthorization)[vs[1].(int)]
	}).(CloudProviderAccessAuthorizationOutput)
}

type CloudProviderAccessAuthorizationMapOutput struct{ *pulumi.OutputState }

func (CloudProviderAccessAuthorizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CloudProviderAccessAuthorization)(nil))
}

func (o CloudProviderAccessAuthorizationMapOutput) ToCloudProviderAccessAuthorizationMapOutput() CloudProviderAccessAuthorizationMapOutput {
	return o
}

func (o CloudProviderAccessAuthorizationMapOutput) ToCloudProviderAccessAuthorizationMapOutputWithContext(ctx context.Context) CloudProviderAccessAuthorizationMapOutput {
	return o
}

func (o CloudProviderAccessAuthorizationMapOutput) MapIndex(k pulumi.StringInput) CloudProviderAccessAuthorizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CloudProviderAccessAuthorization {
		return vs[0].(map[string]CloudProviderAccessAuthorization)[vs[1].(string)]
	}).(CloudProviderAccessAuthorizationOutput)
}

func init() {
	pulumi.RegisterOutputType(CloudProviderAccessAuthorizationOutput{})
	pulumi.RegisterOutputType(CloudProviderAccessAuthorizationPtrOutput{})
	pulumi.RegisterOutputType(CloudProviderAccessAuthorizationArrayOutput{})
	pulumi.RegisterOutputType(CloudProviderAccessAuthorizationMapOutput{})
}
