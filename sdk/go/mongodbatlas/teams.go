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

// This resource is deprecated. Please transition to using `Team` which defines the same underlying implementation, aligning the name of the resource with the implementation which manages a single team.
type Teams struct {
	pulumi.CustomResourceState

	Name      pulumi.StringOutput      `pulumi:"name"`
	OrgId     pulumi.StringOutput      `pulumi:"orgId"`
	TeamId    pulumi.StringOutput      `pulumi:"teamId"`
	Usernames pulumi.StringArrayOutput `pulumi:"usernames"`
}

// NewTeams registers a new resource with the given unique name, arguments, and options.
func NewTeams(ctx *pulumi.Context,
	name string, args *TeamsArgs, opts ...pulumi.ResourceOption) (*Teams, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Usernames == nil {
		return nil, errors.New("invalid value for required argument 'Usernames'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Teams
	err := ctx.RegisterResource("mongodbatlas:index/teams:Teams", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeams gets an existing Teams resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeams(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsState, opts ...pulumi.ResourceOption) (*Teams, error) {
	var resource Teams
	err := ctx.ReadResource("mongodbatlas:index/teams:Teams", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Teams resources.
type teamsState struct {
	Name      *string  `pulumi:"name"`
	OrgId     *string  `pulumi:"orgId"`
	TeamId    *string  `pulumi:"teamId"`
	Usernames []string `pulumi:"usernames"`
}

type TeamsState struct {
	Name      pulumi.StringPtrInput
	OrgId     pulumi.StringPtrInput
	TeamId    pulumi.StringPtrInput
	Usernames pulumi.StringArrayInput
}

func (TeamsState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsState)(nil)).Elem()
}

type teamsArgs struct {
	Name      *string  `pulumi:"name"`
	OrgId     string   `pulumi:"orgId"`
	Usernames []string `pulumi:"usernames"`
}

// The set of arguments for constructing a Teams resource.
type TeamsArgs struct {
	Name      pulumi.StringPtrInput
	OrgId     pulumi.StringInput
	Usernames pulumi.StringArrayInput
}

func (TeamsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsArgs)(nil)).Elem()
}

type TeamsInput interface {
	pulumi.Input

	ToTeamsOutput() TeamsOutput
	ToTeamsOutputWithContext(ctx context.Context) TeamsOutput
}

func (*Teams) ElementType() reflect.Type {
	return reflect.TypeOf((**Teams)(nil)).Elem()
}

func (i *Teams) ToTeamsOutput() TeamsOutput {
	return i.ToTeamsOutputWithContext(context.Background())
}

func (i *Teams) ToTeamsOutputWithContext(ctx context.Context) TeamsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsOutput)
}

// TeamsArrayInput is an input type that accepts TeamsArray and TeamsArrayOutput values.
// You can construct a concrete instance of `TeamsArrayInput` via:
//
//	TeamsArray{ TeamsArgs{...} }
type TeamsArrayInput interface {
	pulumi.Input

	ToTeamsArrayOutput() TeamsArrayOutput
	ToTeamsArrayOutputWithContext(context.Context) TeamsArrayOutput
}

type TeamsArray []TeamsInput

func (TeamsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Teams)(nil)).Elem()
}

func (i TeamsArray) ToTeamsArrayOutput() TeamsArrayOutput {
	return i.ToTeamsArrayOutputWithContext(context.Background())
}

func (i TeamsArray) ToTeamsArrayOutputWithContext(ctx context.Context) TeamsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsArrayOutput)
}

// TeamsMapInput is an input type that accepts TeamsMap and TeamsMapOutput values.
// You can construct a concrete instance of `TeamsMapInput` via:
//
//	TeamsMap{ "key": TeamsArgs{...} }
type TeamsMapInput interface {
	pulumi.Input

	ToTeamsMapOutput() TeamsMapOutput
	ToTeamsMapOutputWithContext(context.Context) TeamsMapOutput
}

type TeamsMap map[string]TeamsInput

func (TeamsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Teams)(nil)).Elem()
}

func (i TeamsMap) ToTeamsMapOutput() TeamsMapOutput {
	return i.ToTeamsMapOutputWithContext(context.Background())
}

func (i TeamsMap) ToTeamsMapOutputWithContext(ctx context.Context) TeamsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsMapOutput)
}

type TeamsOutput struct{ *pulumi.OutputState }

func (TeamsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Teams)(nil)).Elem()
}

func (o TeamsOutput) ToTeamsOutput() TeamsOutput {
	return o
}

func (o TeamsOutput) ToTeamsOutputWithContext(ctx context.Context) TeamsOutput {
	return o
}

func (o TeamsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Teams) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o TeamsOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Teams) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

func (o TeamsOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v *Teams) pulumi.StringOutput { return v.TeamId }).(pulumi.StringOutput)
}

func (o TeamsOutput) Usernames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Teams) pulumi.StringArrayOutput { return v.Usernames }).(pulumi.StringArrayOutput)
}

type TeamsArrayOutput struct{ *pulumi.OutputState }

func (TeamsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Teams)(nil)).Elem()
}

func (o TeamsArrayOutput) ToTeamsArrayOutput() TeamsArrayOutput {
	return o
}

func (o TeamsArrayOutput) ToTeamsArrayOutputWithContext(ctx context.Context) TeamsArrayOutput {
	return o
}

func (o TeamsArrayOutput) Index(i pulumi.IntInput) TeamsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Teams {
		return vs[0].([]*Teams)[vs[1].(int)]
	}).(TeamsOutput)
}

type TeamsMapOutput struct{ *pulumi.OutputState }

func (TeamsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Teams)(nil)).Elem()
}

func (o TeamsMapOutput) ToTeamsMapOutput() TeamsMapOutput {
	return o
}

func (o TeamsMapOutput) ToTeamsMapOutputWithContext(ctx context.Context) TeamsMapOutput {
	return o
}

func (o TeamsMapOutput) MapIndex(k pulumi.StringInput) TeamsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Teams {
		return vs[0].(map[string]*Teams)[vs[1].(string)]
	}).(TeamsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsInput)(nil)).Elem(), &Teams{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsArrayInput)(nil)).Elem(), TeamsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsMapInput)(nil)).Elem(), TeamsMap{})
	pulumi.RegisterOutputType(TeamsOutput{})
	pulumi.RegisterOutputType(TeamsArrayOutput{})
	pulumi.RegisterOutputType(TeamsMapOutput{})
}
