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

// ## # Resource: CustomDbRole
//
// `CustomDbRole` provides a Custom DB Role resource. The customDBRoles resource lets you retrieve, create and modify the custom MongoDB roles in your cluster. Use custom MongoDB roles to specify custom sets of actions which cannot be described by the built-in Atlas database user privileges.
//
// > **IMPORTANT**  You define custom roles at the project level for all clusters in the project. The `CustomDbRole` resource supports a subset of MongoDB privilege actions. For a complete list of [privilege actions](https://docs.mongodb.com/manual/reference/privilege-actions/) available for this resource, see [Custom Role actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions/). Custom roles must include actions that all project's clusters support, and that are compatible with each MongoDB version used by your project's clusters. For example, if your project has MongoDB 4.2 clusters, you can't create custom roles that use actions introduced in MongoDB 4.4.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
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
//			_, err := mongodbatlas.NewCustomDbRole(ctx, "test_role", &mongodbatlas.CustomDbRoleArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				RoleName:  pulumi.String("myCustomRole"),
//				Actions: mongodbatlas.CustomDbRoleActionArray{
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("UPDATE"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								CollectionName: pulumi.String(""),
//								DatabaseName:   pulumi.String("anyDatabase"),
//							},
//						},
//					},
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("INSERT"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								CollectionName: pulumi.String(""),
//								DatabaseName:   pulumi.String("anyDatabase"),
//							},
//						},
//					},
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("REMOVE"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								CollectionName: pulumi.String(""),
//								DatabaseName:   pulumi.String("anyDatabase"),
//							},
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
// ### With Inherited Roles
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
//			inheritedRoleOne, err := mongodbatlas.NewCustomDbRole(ctx, "inherited_role_one", &mongodbatlas.CustomDbRoleArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				RoleName:  pulumi.String("insertRole"),
//				Actions: mongodbatlas.CustomDbRoleActionArray{
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("INSERT"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								CollectionName: pulumi.String(""),
//								DatabaseName:   pulumi.String("anyDatabase"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			inheritedRoleTwo, err := mongodbatlas.NewCustomDbRole(ctx, "inherited_role_two", &mongodbatlas.CustomDbRoleArgs{
//				ProjectId: inheritedRoleOne.ProjectId,
//				RoleName:  pulumi.String("statusServerRole"),
//				Actions: mongodbatlas.CustomDbRoleActionArray{
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("SERVER_STATUS"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								Cluster: pulumi.Bool(true),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewCustomDbRole(ctx, "test_role", &mongodbatlas.CustomDbRoleArgs{
//				ProjectId: inheritedRoleOne.ProjectId,
//				RoleName:  pulumi.String("myCustomRole"),
//				Actions: mongodbatlas.CustomDbRoleActionArray{
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("UPDATE"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								CollectionName: pulumi.String(""),
//								DatabaseName:   pulumi.String("anyDatabase"),
//							},
//						},
//					},
//					&mongodbatlas.CustomDbRoleActionArgs{
//						Action: pulumi.String("REMOVE"),
//						Resources: mongodbatlas.CustomDbRoleActionResourceArray{
//							&mongodbatlas.CustomDbRoleActionResourceArgs{
//								CollectionName: pulumi.String(""),
//								DatabaseName:   pulumi.String("anyDatabase"),
//							},
//						},
//					},
//				},
//				InheritedRoles: mongodbatlas.CustomDbRoleInheritedRoleArray{
//					&mongodbatlas.CustomDbRoleInheritedRoleArgs{
//						RoleName:     inheritedRoleOne.RoleName,
//						DatabaseName: pulumi.String("admin"),
//					},
//					&mongodbatlas.CustomDbRoleInheritedRoleArgs{
//						RoleName:     inheritedRoleTwo.RoleName,
//						DatabaseName: pulumi.String("admin"),
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
// Database users can be imported using project ID and username, in the format `PROJECTID-ROLENAME`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/customDbRole:CustomDbRole my_role 1112222b3bf99403840e8934-MyCustomRole
// ```
// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/custom-roles/)
type CustomDbRole struct {
	pulumi.CustomResourceState

	Actions        CustomDbRoleActionArrayOutput        `pulumi:"actions"`
	InheritedRoles CustomDbRoleInheritedRoleArrayOutput `pulumi:"inheritedRoles"`
	// The unique ID for the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Name of the custom role.
	//
	// > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
	//
	// * Is a name already used by an existing custom role in the project
	// * Is a name of any of the built-in roles
	// * Is `atlasAdmin`
	// * Starts with `xgen-`
	RoleName pulumi.StringOutput `pulumi:"roleName"`
}

// NewCustomDbRole registers a new resource with the given unique name, arguments, and options.
func NewCustomDbRole(ctx *pulumi.Context,
	name string, args *CustomDbRoleArgs, opts ...pulumi.ResourceOption) (*CustomDbRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomDbRole
	err := ctx.RegisterResource("mongodbatlas:index/customDbRole:CustomDbRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomDbRole gets an existing CustomDbRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomDbRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomDbRoleState, opts ...pulumi.ResourceOption) (*CustomDbRole, error) {
	var resource CustomDbRole
	err := ctx.ReadResource("mongodbatlas:index/customDbRole:CustomDbRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomDbRole resources.
type customDbRoleState struct {
	Actions        []CustomDbRoleAction        `pulumi:"actions"`
	InheritedRoles []CustomDbRoleInheritedRole `pulumi:"inheritedRoles"`
	// The unique ID for the project.
	ProjectId *string `pulumi:"projectId"`
	// Name of the custom role.
	//
	// > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
	//
	// * Is a name already used by an existing custom role in the project
	// * Is a name of any of the built-in roles
	// * Is `atlasAdmin`
	// * Starts with `xgen-`
	RoleName *string `pulumi:"roleName"`
}

type CustomDbRoleState struct {
	Actions        CustomDbRoleActionArrayInput
	InheritedRoles CustomDbRoleInheritedRoleArrayInput
	// The unique ID for the project.
	ProjectId pulumi.StringPtrInput
	// Name of the custom role.
	//
	// > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
	//
	// * Is a name already used by an existing custom role in the project
	// * Is a name of any of the built-in roles
	// * Is `atlasAdmin`
	// * Starts with `xgen-`
	RoleName pulumi.StringPtrInput
}

func (CustomDbRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*customDbRoleState)(nil)).Elem()
}

type customDbRoleArgs struct {
	Actions        []CustomDbRoleAction        `pulumi:"actions"`
	InheritedRoles []CustomDbRoleInheritedRole `pulumi:"inheritedRoles"`
	// The unique ID for the project.
	ProjectId string `pulumi:"projectId"`
	// Name of the custom role.
	//
	// > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
	//
	// * Is a name already used by an existing custom role in the project
	// * Is a name of any of the built-in roles
	// * Is `atlasAdmin`
	// * Starts with `xgen-`
	RoleName string `pulumi:"roleName"`
}

// The set of arguments for constructing a CustomDbRole resource.
type CustomDbRoleArgs struct {
	Actions        CustomDbRoleActionArrayInput
	InheritedRoles CustomDbRoleInheritedRoleArrayInput
	// The unique ID for the project.
	ProjectId pulumi.StringInput
	// Name of the custom role.
	//
	// > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
	//
	// * Is a name already used by an existing custom role in the project
	// * Is a name of any of the built-in roles
	// * Is `atlasAdmin`
	// * Starts with `xgen-`
	RoleName pulumi.StringInput
}

func (CustomDbRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customDbRoleArgs)(nil)).Elem()
}

type CustomDbRoleInput interface {
	pulumi.Input

	ToCustomDbRoleOutput() CustomDbRoleOutput
	ToCustomDbRoleOutputWithContext(ctx context.Context) CustomDbRoleOutput
}

func (*CustomDbRole) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDbRole)(nil)).Elem()
}

func (i *CustomDbRole) ToCustomDbRoleOutput() CustomDbRoleOutput {
	return i.ToCustomDbRoleOutputWithContext(context.Background())
}

func (i *CustomDbRole) ToCustomDbRoleOutputWithContext(ctx context.Context) CustomDbRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDbRoleOutput)
}

// CustomDbRoleArrayInput is an input type that accepts CustomDbRoleArray and CustomDbRoleArrayOutput values.
// You can construct a concrete instance of `CustomDbRoleArrayInput` via:
//
//	CustomDbRoleArray{ CustomDbRoleArgs{...} }
type CustomDbRoleArrayInput interface {
	pulumi.Input

	ToCustomDbRoleArrayOutput() CustomDbRoleArrayOutput
	ToCustomDbRoleArrayOutputWithContext(context.Context) CustomDbRoleArrayOutput
}

type CustomDbRoleArray []CustomDbRoleInput

func (CustomDbRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDbRole)(nil)).Elem()
}

func (i CustomDbRoleArray) ToCustomDbRoleArrayOutput() CustomDbRoleArrayOutput {
	return i.ToCustomDbRoleArrayOutputWithContext(context.Background())
}

func (i CustomDbRoleArray) ToCustomDbRoleArrayOutputWithContext(ctx context.Context) CustomDbRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDbRoleArrayOutput)
}

// CustomDbRoleMapInput is an input type that accepts CustomDbRoleMap and CustomDbRoleMapOutput values.
// You can construct a concrete instance of `CustomDbRoleMapInput` via:
//
//	CustomDbRoleMap{ "key": CustomDbRoleArgs{...} }
type CustomDbRoleMapInput interface {
	pulumi.Input

	ToCustomDbRoleMapOutput() CustomDbRoleMapOutput
	ToCustomDbRoleMapOutputWithContext(context.Context) CustomDbRoleMapOutput
}

type CustomDbRoleMap map[string]CustomDbRoleInput

func (CustomDbRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDbRole)(nil)).Elem()
}

func (i CustomDbRoleMap) ToCustomDbRoleMapOutput() CustomDbRoleMapOutput {
	return i.ToCustomDbRoleMapOutputWithContext(context.Background())
}

func (i CustomDbRoleMap) ToCustomDbRoleMapOutputWithContext(ctx context.Context) CustomDbRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDbRoleMapOutput)
}

type CustomDbRoleOutput struct{ *pulumi.OutputState }

func (CustomDbRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDbRole)(nil)).Elem()
}

func (o CustomDbRoleOutput) ToCustomDbRoleOutput() CustomDbRoleOutput {
	return o
}

func (o CustomDbRoleOutput) ToCustomDbRoleOutputWithContext(ctx context.Context) CustomDbRoleOutput {
	return o
}

func (o CustomDbRoleOutput) Actions() CustomDbRoleActionArrayOutput {
	return o.ApplyT(func(v *CustomDbRole) CustomDbRoleActionArrayOutput { return v.Actions }).(CustomDbRoleActionArrayOutput)
}

func (o CustomDbRoleOutput) InheritedRoles() CustomDbRoleInheritedRoleArrayOutput {
	return o.ApplyT(func(v *CustomDbRole) CustomDbRoleInheritedRoleArrayOutput { return v.InheritedRoles }).(CustomDbRoleInheritedRoleArrayOutput)
}

// The unique ID for the project.
func (o CustomDbRoleOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDbRole) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Name of the custom role.
//
// > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
//
// * Is a name already used by an existing custom role in the project
// * Is a name of any of the built-in roles
// * Is `atlasAdmin`
// * Starts with `xgen-`
func (o CustomDbRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDbRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

type CustomDbRoleArrayOutput struct{ *pulumi.OutputState }

func (CustomDbRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDbRole)(nil)).Elem()
}

func (o CustomDbRoleArrayOutput) ToCustomDbRoleArrayOutput() CustomDbRoleArrayOutput {
	return o
}

func (o CustomDbRoleArrayOutput) ToCustomDbRoleArrayOutputWithContext(ctx context.Context) CustomDbRoleArrayOutput {
	return o
}

func (o CustomDbRoleArrayOutput) Index(i pulumi.IntInput) CustomDbRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomDbRole {
		return vs[0].([]*CustomDbRole)[vs[1].(int)]
	}).(CustomDbRoleOutput)
}

type CustomDbRoleMapOutput struct{ *pulumi.OutputState }

func (CustomDbRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDbRole)(nil)).Elem()
}

func (o CustomDbRoleMapOutput) ToCustomDbRoleMapOutput() CustomDbRoleMapOutput {
	return o
}

func (o CustomDbRoleMapOutput) ToCustomDbRoleMapOutputWithContext(ctx context.Context) CustomDbRoleMapOutput {
	return o
}

func (o CustomDbRoleMapOutput) MapIndex(k pulumi.StringInput) CustomDbRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomDbRole {
		return vs[0].(map[string]*CustomDbRole)[vs[1].(string)]
	}).(CustomDbRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDbRoleInput)(nil)).Elem(), &CustomDbRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDbRoleArrayInput)(nil)).Elem(), CustomDbRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDbRoleMapInput)(nil)).Elem(), CustomDbRoleMap{})
	pulumi.RegisterOutputType(CustomDbRoleOutput{})
	pulumi.RegisterOutputType(CustomDbRoleArrayOutput{})
	pulumi.RegisterOutputType(CustomDbRoleMapOutput{})
}
