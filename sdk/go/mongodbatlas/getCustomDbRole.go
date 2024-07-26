// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: CustomDbRole
//
// `CustomDbRole` describes a Custom DB Role. This represents a custom db role.
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
//			testRole, err := mongodbatlas.NewCustomDbRole(ctx, "test_role", &mongodbatlas.CustomDbRoleArgs{
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
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupCustomDbRoleOutput(ctx, mongodbatlas.GetCustomDbRoleOutputArgs{
//				ProjectId: testRole.ProjectId,
//				RoleName:  testRole.RoleName,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupCustomDbRole(ctx *pulumi.Context, args *LookupCustomDbRoleArgs, opts ...pulumi.InvokeOption) (*LookupCustomDbRoleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCustomDbRoleResult
	err := ctx.Invoke("mongodbatlas:index/getCustomDbRole:getCustomDbRole", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomDbRole.
type LookupCustomDbRoleArgs struct {
	InheritedRoles []GetCustomDbRoleInheritedRole `pulumi:"inheritedRoles"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
	// Name of the custom role.
	RoleName string `pulumi:"roleName"`
}

// A collection of values returned by getCustomDbRole.
type LookupCustomDbRoleResult struct {
	Actions []GetCustomDbRoleAction `pulumi:"actions"`
	// The provider-assigned unique ID for this managed resource.
	Id             string                         `pulumi:"id"`
	InheritedRoles []GetCustomDbRoleInheritedRole `pulumi:"inheritedRoles"`
	ProjectId      string                         `pulumi:"projectId"`
	// (Required) Name of the inherited role. This can either be another custom role or a built-in role.
	RoleName string `pulumi:"roleName"`
}

func LookupCustomDbRoleOutput(ctx *pulumi.Context, args LookupCustomDbRoleOutputArgs, opts ...pulumi.InvokeOption) LookupCustomDbRoleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCustomDbRoleResult, error) {
			args := v.(LookupCustomDbRoleArgs)
			r, err := LookupCustomDbRole(ctx, &args, opts...)
			var s LookupCustomDbRoleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCustomDbRoleResultOutput)
}

// A collection of arguments for invoking getCustomDbRole.
type LookupCustomDbRoleOutputArgs struct {
	InheritedRoles GetCustomDbRoleInheritedRoleArrayInput `pulumi:"inheritedRoles"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Name of the custom role.
	RoleName pulumi.StringInput `pulumi:"roleName"`
}

func (LookupCustomDbRoleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomDbRoleArgs)(nil)).Elem()
}

// A collection of values returned by getCustomDbRole.
type LookupCustomDbRoleResultOutput struct{ *pulumi.OutputState }

func (LookupCustomDbRoleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomDbRoleResult)(nil)).Elem()
}

func (o LookupCustomDbRoleResultOutput) ToLookupCustomDbRoleResultOutput() LookupCustomDbRoleResultOutput {
	return o
}

func (o LookupCustomDbRoleResultOutput) ToLookupCustomDbRoleResultOutputWithContext(ctx context.Context) LookupCustomDbRoleResultOutput {
	return o
}

func (o LookupCustomDbRoleResultOutput) Actions() GetCustomDbRoleActionArrayOutput {
	return o.ApplyT(func(v LookupCustomDbRoleResult) []GetCustomDbRoleAction { return v.Actions }).(GetCustomDbRoleActionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCustomDbRoleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomDbRoleResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCustomDbRoleResultOutput) InheritedRoles() GetCustomDbRoleInheritedRoleArrayOutput {
	return o.ApplyT(func(v LookupCustomDbRoleResult) []GetCustomDbRoleInheritedRole { return v.InheritedRoles }).(GetCustomDbRoleInheritedRoleArrayOutput)
}

func (o LookupCustomDbRoleResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomDbRoleResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// (Required) Name of the inherited role. This can either be another custom role or a built-in role.
func (o LookupCustomDbRoleResultOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomDbRoleResult) string { return v.RoleName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCustomDbRoleResultOutput{})
}
