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

// ## # Resource: FederatedSettingsOrgRoleMapping
//
// `FederatedSettingsOrgRoleMapping` provides an Role Mapping resource. This allows organization role mapping to be created.
//
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
//			_, err := mongodbatlas.NewFederatedSettingsOrgRoleMapping(ctx, "org_group_role_mapping_import", &mongodbatlas.FederatedSettingsOrgRoleMappingArgs{
//				FederationSettingsId: pulumi.String("627a9687f7f7f7f774de306f14"),
//				OrgId:                pulumi.String("627a9683e7f7f7ff7fe306f14"),
//				ExternalGroupName:    pulumi.String("myGrouptest"),
//				RoleAssignments: mongodbatlas.FederatedSettingsOrgRoleMappingRoleAssignmentArray{
//					&mongodbatlas.FederatedSettingsOrgRoleMappingRoleAssignmentArgs{
//						OrgId: pulumi.String("627a9683e7f7f7ff7fe306f14"),
//						Roles: pulumi.StringArray{
//							pulumi.String("ORG_MEMBER"),
//							pulumi.String("ORG_GROUP_CREATOR"),
//							pulumi.String("ORG_BILLING_ADMIN"),
//						},
//					},
//					&mongodbatlas.FederatedSettingsOrgRoleMappingRoleAssignmentArgs{
//						GroupId: pulumi.String("628aa20d7f7f7f7f7098b81b8"),
//						Roles: pulumi.StringArray{
//							pulumi.String("GROUP_OWNER"),
//							pulumi.String("GROUP_DATA_ACCESS_ADMIN"),
//							pulumi.String("GROUP_SEARCH_INDEX_EDITOR"),
//							pulumi.String("GROUP_DATA_ACCESS_READ_ONLY"),
//						},
//					},
//					&mongodbatlas.FederatedSettingsOrgRoleMappingRoleAssignmentArgs{
//						GroupId: pulumi.String("628aa20d7f7f7f7f7078b81b8"),
//						Roles: pulumi.StringArray{
//							pulumi.String("GROUP_OWNER"),
//							pulumi.String("GROUP_DATA_ACCESS_ADMIN"),
//							pulumi.String("GROUP_SEARCH_INDEX_EDITOR"),
//							pulumi.String("GROUP_DATA_ACCESS_READ_ONLY"),
//							pulumi.String("GROUP_DATA_ACCESS_READ_WRITE"),
//						},
//					},
//				},
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
// ## Import
//
// FederatedSettingsOrgRoleMapping can be imported using federation_settings_id-org_id-role_mapping_id, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/federatedSettingsOrgRoleMapping:FederatedSettingsOrgRoleMapping org_group_role_mapping_import 6287a663c7f7f7f71c441c6c-627a96837f7f7f7e306f14-628ae97f7f7468ea3727
// ```
// For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
type FederatedSettingsOrgRoleMapping struct {
	pulumi.CustomResourceState

	// Unique human-readable label that identifies the identity provider group to which this role mapping applies.
	ExternalGroupName pulumi.StringOutput `pulumi:"externalGroupName"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringOutput `pulumi:"federationSettingsId"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Atlas roles and the unique identifiers of the groups and organizations associated with each role.
	RoleAssignments FederatedSettingsOrgRoleMappingRoleAssignmentArrayOutput `pulumi:"roleAssignments"`
	// Unique 24-hexadecimal digit string that identifies this role mapping.
	RoleMappingId pulumi.StringOutput `pulumi:"roleMappingId"`
}

// NewFederatedSettingsOrgRoleMapping registers a new resource with the given unique name, arguments, and options.
func NewFederatedSettingsOrgRoleMapping(ctx *pulumi.Context,
	name string, args *FederatedSettingsOrgRoleMappingArgs, opts ...pulumi.ResourceOption) (*FederatedSettingsOrgRoleMapping, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExternalGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ExternalGroupName'")
	}
	if args.FederationSettingsId == nil {
		return nil, errors.New("invalid value for required argument 'FederationSettingsId'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.RoleAssignments == nil {
		return nil, errors.New("invalid value for required argument 'RoleAssignments'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FederatedSettingsOrgRoleMapping
	err := ctx.RegisterResource("mongodbatlas:index/federatedSettingsOrgRoleMapping:FederatedSettingsOrgRoleMapping", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFederatedSettingsOrgRoleMapping gets an existing FederatedSettingsOrgRoleMapping resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFederatedSettingsOrgRoleMapping(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FederatedSettingsOrgRoleMappingState, opts ...pulumi.ResourceOption) (*FederatedSettingsOrgRoleMapping, error) {
	var resource FederatedSettingsOrgRoleMapping
	err := ctx.ReadResource("mongodbatlas:index/federatedSettingsOrgRoleMapping:FederatedSettingsOrgRoleMapping", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FederatedSettingsOrgRoleMapping resources.
type federatedSettingsOrgRoleMappingState struct {
	// Unique human-readable label that identifies the identity provider group to which this role mapping applies.
	ExternalGroupName *string `pulumi:"externalGroupName"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId *string `pulumi:"federationSettingsId"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId *string `pulumi:"orgId"`
	// Atlas roles and the unique identifiers of the groups and organizations associated with each role.
	RoleAssignments []FederatedSettingsOrgRoleMappingRoleAssignment `pulumi:"roleAssignments"`
	// Unique 24-hexadecimal digit string that identifies this role mapping.
	RoleMappingId *string `pulumi:"roleMappingId"`
}

type FederatedSettingsOrgRoleMappingState struct {
	// Unique human-readable label that identifies the identity provider group to which this role mapping applies.
	ExternalGroupName pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId pulumi.StringPtrInput
	// Atlas roles and the unique identifiers of the groups and organizations associated with each role.
	RoleAssignments FederatedSettingsOrgRoleMappingRoleAssignmentArrayInput
	// Unique 24-hexadecimal digit string that identifies this role mapping.
	RoleMappingId pulumi.StringPtrInput
}

func (FederatedSettingsOrgRoleMappingState) ElementType() reflect.Type {
	return reflect.TypeOf((*federatedSettingsOrgRoleMappingState)(nil)).Elem()
}

type federatedSettingsOrgRoleMappingArgs struct {
	// Unique human-readable label that identifies the identity provider group to which this role mapping applies.
	ExternalGroupName string `pulumi:"externalGroupName"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId string `pulumi:"orgId"`
	// Atlas roles and the unique identifiers of the groups and organizations associated with each role.
	RoleAssignments []FederatedSettingsOrgRoleMappingRoleAssignment `pulumi:"roleAssignments"`
}

// The set of arguments for constructing a FederatedSettingsOrgRoleMapping resource.
type FederatedSettingsOrgRoleMappingArgs struct {
	// Unique human-readable label that identifies the identity provider group to which this role mapping applies.
	ExternalGroupName pulumi.StringInput
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringInput
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId pulumi.StringInput
	// Atlas roles and the unique identifiers of the groups and organizations associated with each role.
	RoleAssignments FederatedSettingsOrgRoleMappingRoleAssignmentArrayInput
}

func (FederatedSettingsOrgRoleMappingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*federatedSettingsOrgRoleMappingArgs)(nil)).Elem()
}

type FederatedSettingsOrgRoleMappingInput interface {
	pulumi.Input

	ToFederatedSettingsOrgRoleMappingOutput() FederatedSettingsOrgRoleMappingOutput
	ToFederatedSettingsOrgRoleMappingOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingOutput
}

func (*FederatedSettingsOrgRoleMapping) ElementType() reflect.Type {
	return reflect.TypeOf((**FederatedSettingsOrgRoleMapping)(nil)).Elem()
}

func (i *FederatedSettingsOrgRoleMapping) ToFederatedSettingsOrgRoleMappingOutput() FederatedSettingsOrgRoleMappingOutput {
	return i.ToFederatedSettingsOrgRoleMappingOutputWithContext(context.Background())
}

func (i *FederatedSettingsOrgRoleMapping) ToFederatedSettingsOrgRoleMappingOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FederatedSettingsOrgRoleMappingOutput)
}

// FederatedSettingsOrgRoleMappingArrayInput is an input type that accepts FederatedSettingsOrgRoleMappingArray and FederatedSettingsOrgRoleMappingArrayOutput values.
// You can construct a concrete instance of `FederatedSettingsOrgRoleMappingArrayInput` via:
//
//	FederatedSettingsOrgRoleMappingArray{ FederatedSettingsOrgRoleMappingArgs{...} }
type FederatedSettingsOrgRoleMappingArrayInput interface {
	pulumi.Input

	ToFederatedSettingsOrgRoleMappingArrayOutput() FederatedSettingsOrgRoleMappingArrayOutput
	ToFederatedSettingsOrgRoleMappingArrayOutputWithContext(context.Context) FederatedSettingsOrgRoleMappingArrayOutput
}

type FederatedSettingsOrgRoleMappingArray []FederatedSettingsOrgRoleMappingInput

func (FederatedSettingsOrgRoleMappingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FederatedSettingsOrgRoleMapping)(nil)).Elem()
}

func (i FederatedSettingsOrgRoleMappingArray) ToFederatedSettingsOrgRoleMappingArrayOutput() FederatedSettingsOrgRoleMappingArrayOutput {
	return i.ToFederatedSettingsOrgRoleMappingArrayOutputWithContext(context.Background())
}

func (i FederatedSettingsOrgRoleMappingArray) ToFederatedSettingsOrgRoleMappingArrayOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FederatedSettingsOrgRoleMappingArrayOutput)
}

// FederatedSettingsOrgRoleMappingMapInput is an input type that accepts FederatedSettingsOrgRoleMappingMap and FederatedSettingsOrgRoleMappingMapOutput values.
// You can construct a concrete instance of `FederatedSettingsOrgRoleMappingMapInput` via:
//
//	FederatedSettingsOrgRoleMappingMap{ "key": FederatedSettingsOrgRoleMappingArgs{...} }
type FederatedSettingsOrgRoleMappingMapInput interface {
	pulumi.Input

	ToFederatedSettingsOrgRoleMappingMapOutput() FederatedSettingsOrgRoleMappingMapOutput
	ToFederatedSettingsOrgRoleMappingMapOutputWithContext(context.Context) FederatedSettingsOrgRoleMappingMapOutput
}

type FederatedSettingsOrgRoleMappingMap map[string]FederatedSettingsOrgRoleMappingInput

func (FederatedSettingsOrgRoleMappingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FederatedSettingsOrgRoleMapping)(nil)).Elem()
}

func (i FederatedSettingsOrgRoleMappingMap) ToFederatedSettingsOrgRoleMappingMapOutput() FederatedSettingsOrgRoleMappingMapOutput {
	return i.ToFederatedSettingsOrgRoleMappingMapOutputWithContext(context.Background())
}

func (i FederatedSettingsOrgRoleMappingMap) ToFederatedSettingsOrgRoleMappingMapOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FederatedSettingsOrgRoleMappingMapOutput)
}

type FederatedSettingsOrgRoleMappingOutput struct{ *pulumi.OutputState }

func (FederatedSettingsOrgRoleMappingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FederatedSettingsOrgRoleMapping)(nil)).Elem()
}

func (o FederatedSettingsOrgRoleMappingOutput) ToFederatedSettingsOrgRoleMappingOutput() FederatedSettingsOrgRoleMappingOutput {
	return o
}

func (o FederatedSettingsOrgRoleMappingOutput) ToFederatedSettingsOrgRoleMappingOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingOutput {
	return o
}

// Unique human-readable label that identifies the identity provider group to which this role mapping applies.
func (o FederatedSettingsOrgRoleMappingOutput) ExternalGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsOrgRoleMapping) pulumi.StringOutput { return v.ExternalGroupName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
func (o FederatedSettingsOrgRoleMappingOutput) FederationSettingsId() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsOrgRoleMapping) pulumi.StringOutput { return v.FederationSettingsId }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
func (o FederatedSettingsOrgRoleMappingOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsOrgRoleMapping) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Atlas roles and the unique identifiers of the groups and organizations associated with each role.
func (o FederatedSettingsOrgRoleMappingOutput) RoleAssignments() FederatedSettingsOrgRoleMappingRoleAssignmentArrayOutput {
	return o.ApplyT(func(v *FederatedSettingsOrgRoleMapping) FederatedSettingsOrgRoleMappingRoleAssignmentArrayOutput {
		return v.RoleAssignments
	}).(FederatedSettingsOrgRoleMappingRoleAssignmentArrayOutput)
}

// Unique 24-hexadecimal digit string that identifies this role mapping.
func (o FederatedSettingsOrgRoleMappingOutput) RoleMappingId() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsOrgRoleMapping) pulumi.StringOutput { return v.RoleMappingId }).(pulumi.StringOutput)
}

type FederatedSettingsOrgRoleMappingArrayOutput struct{ *pulumi.OutputState }

func (FederatedSettingsOrgRoleMappingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FederatedSettingsOrgRoleMapping)(nil)).Elem()
}

func (o FederatedSettingsOrgRoleMappingArrayOutput) ToFederatedSettingsOrgRoleMappingArrayOutput() FederatedSettingsOrgRoleMappingArrayOutput {
	return o
}

func (o FederatedSettingsOrgRoleMappingArrayOutput) ToFederatedSettingsOrgRoleMappingArrayOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingArrayOutput {
	return o
}

func (o FederatedSettingsOrgRoleMappingArrayOutput) Index(i pulumi.IntInput) FederatedSettingsOrgRoleMappingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FederatedSettingsOrgRoleMapping {
		return vs[0].([]*FederatedSettingsOrgRoleMapping)[vs[1].(int)]
	}).(FederatedSettingsOrgRoleMappingOutput)
}

type FederatedSettingsOrgRoleMappingMapOutput struct{ *pulumi.OutputState }

func (FederatedSettingsOrgRoleMappingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FederatedSettingsOrgRoleMapping)(nil)).Elem()
}

func (o FederatedSettingsOrgRoleMappingMapOutput) ToFederatedSettingsOrgRoleMappingMapOutput() FederatedSettingsOrgRoleMappingMapOutput {
	return o
}

func (o FederatedSettingsOrgRoleMappingMapOutput) ToFederatedSettingsOrgRoleMappingMapOutputWithContext(ctx context.Context) FederatedSettingsOrgRoleMappingMapOutput {
	return o
}

func (o FederatedSettingsOrgRoleMappingMapOutput) MapIndex(k pulumi.StringInput) FederatedSettingsOrgRoleMappingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FederatedSettingsOrgRoleMapping {
		return vs[0].(map[string]*FederatedSettingsOrgRoleMapping)[vs[1].(string)]
	}).(FederatedSettingsOrgRoleMappingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FederatedSettingsOrgRoleMappingInput)(nil)).Elem(), &FederatedSettingsOrgRoleMapping{})
	pulumi.RegisterInputType(reflect.TypeOf((*FederatedSettingsOrgRoleMappingArrayInput)(nil)).Elem(), FederatedSettingsOrgRoleMappingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FederatedSettingsOrgRoleMappingMapInput)(nil)).Elem(), FederatedSettingsOrgRoleMappingMap{})
	pulumi.RegisterOutputType(FederatedSettingsOrgRoleMappingOutput{})
	pulumi.RegisterOutputType(FederatedSettingsOrgRoleMappingArrayOutput{})
	pulumi.RegisterOutputType(FederatedSettingsOrgRoleMappingMapOutput{})
}
