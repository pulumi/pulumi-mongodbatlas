// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `Project` describes a MongoDB Atlas Roles Org ID. This represents a Roles Org ID.
//
// ## Example Usage
// ### Using projectId attribute to query
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
//			test, err := mongodbatlas.GetRolesOrgId(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("orgId", test.OrgId)
//			return nil
//		})
//	}
//
// ```
func GetRolesOrgId(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRolesOrgIdResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRolesOrgIdResult
	err := ctx.Invoke("mongodbatlas:index/getRolesOrgId:getRolesOrgId", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRolesOrgId.
type GetRolesOrgIdResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the organization you want to retrieve associated to an API Key.
	OrgId string `pulumi:"orgId"`
}

func GetRolesOrgIdOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetRolesOrgIdResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetRolesOrgIdResult, error) {
		r, err := GetRolesOrgId(ctx, opts...)
		var s GetRolesOrgIdResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetRolesOrgIdResultOutput)
}

// A collection of values returned by getRolesOrgId.
type GetRolesOrgIdResultOutput struct{ *pulumi.OutputState }

func (GetRolesOrgIdResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRolesOrgIdResult)(nil)).Elem()
}

func (o GetRolesOrgIdResultOutput) ToGetRolesOrgIdResultOutput() GetRolesOrgIdResultOutput {
	return o
}

func (o GetRolesOrgIdResultOutput) ToGetRolesOrgIdResultOutputWithContext(ctx context.Context) GetRolesOrgIdResultOutput {
	return o
}

func (o GetRolesOrgIdResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetRolesOrgIdResult] {
	return pulumix.Output[GetRolesOrgIdResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetRolesOrgIdResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRolesOrgIdResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the organization you want to retrieve associated to an API Key.
func (o GetRolesOrgIdResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRolesOrgIdResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRolesOrgIdResultOutput{})
}
