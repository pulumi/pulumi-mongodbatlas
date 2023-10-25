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

// `getProjects` describe all Projects. This represents projects that have been created.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
//			testRolesOrgId, err := mongodbatlas.GetRolesOrgId(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewProject(ctx, "testProject", &mongodbatlas.ProjectArgs{
//				OrgId: *pulumi.String(testRolesOrgId.OrgId),
//				Teams: mongodbatlas.ProjectTeamArray{
//					&mongodbatlas.ProjectTeamArgs{
//						TeamId: pulumi.String("5e0fa8c99ccf641c722fe645"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_OWNER"),
//						},
//					},
//					&mongodbatlas.ProjectTeamArgs{
//						TeamId: pulumi.String("5e1dd7b4f2a30ba80a70cd4rw"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_READ_ONLY"),
//							pulumi.String("GROUP_DATA_ACCESS_READ_WRITE"),
//						},
//					},
//				},
//				Limits: mongodbatlas.ProjectLimitArray{
//					&mongodbatlas.ProjectLimitArgs{
//						Name:  pulumi.String("atlas.project.deployment.clusters"),
//						Value: pulumi.Int(26),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.LookupProjects(ctx, &mongodbatlas.LookupProjectsArgs{
//				PageNum:      pulumi.IntRef(1),
//				ItemsPerPage: pulumi.IntRef(5),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupProjects(ctx *pulumi.Context, args *LookupProjectsArgs, opts ...pulumi.InvokeOption) (*LookupProjectsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectsResult
	err := ctx.Invoke("mongodbatlas:index/getProjects:getProjects", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjects.
type LookupProjectsArgs struct {
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
}

// A collection of values returned by getProjects.
type LookupProjectsResult struct {
	// Deprecated: Please use each project's id attribute instead
	Id           string              `pulumi:"id"`
	ItemsPerPage *int                `pulumi:"itemsPerPage"`
	PageNum      *int                `pulumi:"pageNum"`
	Results      []GetProjectsResult `pulumi:"results"`
	TotalCount   int                 `pulumi:"totalCount"`
}

func LookupProjectsOutput(ctx *pulumi.Context, args LookupProjectsOutputArgs, opts ...pulumi.InvokeOption) LookupProjectsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectsResult, error) {
			args := v.(LookupProjectsArgs)
			r, err := LookupProjects(ctx, &args, opts...)
			var s LookupProjectsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectsResultOutput)
}

// A collection of arguments for invoking getProjects.
type LookupProjectsOutputArgs struct {
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
}

func (LookupProjectsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectsArgs)(nil)).Elem()
}

// A collection of values returned by getProjects.
type LookupProjectsResultOutput struct{ *pulumi.OutputState }

func (LookupProjectsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectsResult)(nil)).Elem()
}

func (o LookupProjectsResultOutput) ToLookupProjectsResultOutput() LookupProjectsResultOutput {
	return o
}

func (o LookupProjectsResultOutput) ToLookupProjectsResultOutputWithContext(ctx context.Context) LookupProjectsResultOutput {
	return o
}

func (o LookupProjectsResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupProjectsResult] {
	return pulumix.Output[LookupProjectsResult]{
		OutputState: o.OutputState,
	}
}

// Deprecated: Please use each project's id attribute instead
func (o LookupProjectsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupProjectsResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupProjectsResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupProjectsResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupProjectsResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

func (o LookupProjectsResultOutput) Results() GetProjectsResultArrayOutput {
	return o.ApplyT(func(v LookupProjectsResult) []GetProjectsResult { return v.Results }).(GetProjectsResultArrayOutput)
}

func (o LookupProjectsResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectsResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectsResultOutput{})
}
