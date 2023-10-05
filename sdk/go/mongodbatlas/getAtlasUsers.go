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

// `atlasUsers` provides Atlas Users associated with a specified Organization, Project, or Team.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
// ### Using orgId attribute to query Organization Atlas Users
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
//			_, err := mongodbatlas.LookupAtlasUsers(ctx, &mongodbatlas.LookupAtlasUsersArgs{
//				OrgId: pulumi.StringRef("<ORG_ID>"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Using projectId attribute to query Project Atlas Users
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
//			_, err := mongodbatlas.LookupAtlasUsers(ctx, &mongodbatlas.LookupAtlasUsersArgs{
//				ProjectId: pulumi.StringRef("<PROJECT_ID>"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Using teamId and orgId attribute to query Team Atlas Users
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
//			_, err := mongodbatlas.LookupAtlasUsers(ctx, &mongodbatlas.LookupAtlasUsersArgs{
//				OrgId:  pulumi.StringRef("<ORG_ID>"),
//				TeamId: pulumi.StringRef("<TEAM_ID>"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAtlasUsers(ctx *pulumi.Context, args *LookupAtlasUsersArgs, opts ...pulumi.InvokeOption) (*LookupAtlasUsersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAtlasUsersResult
	err := ctx.Invoke("mongodbatlas:index/getAtlasUsers:getAtlasUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAtlasUsers.
type LookupAtlasUsersArgs struct {
	// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
	//
	// > **IMPORTANT:** Either `orgId`, `projectId`, or `teamId` with `orgId` must be configurated.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `teamId` attributes is defined.
	OrgId *string `pulumi:"orgId"`
	// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
	ProjectId *string `pulumi:"projectId"`
	// Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
	TeamId *string `pulumi:"teamId"`
}

// A collection of values returned by getAtlasUsers.
type LookupAtlasUsersResult struct {
	// Deprecated: Please use each user's id attribute instead
	Id           string  `pulumi:"id"`
	ItemsPerPage *int    `pulumi:"itemsPerPage"`
	OrgId        *string `pulumi:"orgId"`
	PageNum      *int    `pulumi:"pageNum"`
	ProjectId    *string `pulumi:"projectId"`
	// A list where each element contains a Atlas User.
	Results []GetAtlasUsersResult `pulumi:"results"`
	TeamId  *string               `pulumi:"teamId"`
	// Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
	TotalCount int `pulumi:"totalCount"`
}

func LookupAtlasUsersOutput(ctx *pulumi.Context, args LookupAtlasUsersOutputArgs, opts ...pulumi.InvokeOption) LookupAtlasUsersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAtlasUsersResult, error) {
			args := v.(LookupAtlasUsersArgs)
			r, err := LookupAtlasUsers(ctx, &args, opts...)
			var s LookupAtlasUsersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAtlasUsersResultOutput)
}

// A collection of arguments for invoking getAtlasUsers.
type LookupAtlasUsersOutputArgs struct {
	// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
	//
	// > **IMPORTANT:** Either `orgId`, `projectId`, or `teamId` with `orgId` must be configurated.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `teamId` attributes is defined.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
	TeamId pulumi.StringPtrInput `pulumi:"teamId"`
}

func (LookupAtlasUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAtlasUsersArgs)(nil)).Elem()
}

// A collection of values returned by getAtlasUsers.
type LookupAtlasUsersResultOutput struct{ *pulumi.OutputState }

func (LookupAtlasUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAtlasUsersResult)(nil)).Elem()
}

func (o LookupAtlasUsersResultOutput) ToLookupAtlasUsersResultOutput() LookupAtlasUsersResultOutput {
	return o
}

func (o LookupAtlasUsersResultOutput) ToLookupAtlasUsersResultOutputWithContext(ctx context.Context) LookupAtlasUsersResultOutput {
	return o
}

func (o LookupAtlasUsersResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAtlasUsersResult] {
	return pulumix.Output[LookupAtlasUsersResult]{
		OutputState: o.OutputState,
	}
}

// Deprecated: Please use each user's id attribute instead
func (o LookupAtlasUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAtlasUsersResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupAtlasUsersResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o LookupAtlasUsersResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

func (o LookupAtlasUsersResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// A list where each element contains a Atlas User.
func (o LookupAtlasUsersResultOutput) Results() GetAtlasUsersResultArrayOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) []GetAtlasUsersResult { return v.Results }).(GetAtlasUsersResultArrayOutput)
}

func (o LookupAtlasUsersResultOutput) TeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) *string { return v.TeamId }).(pulumi.StringPtrOutput)
}

// Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
func (o LookupAtlasUsersResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAtlasUsersResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAtlasUsersResultOutput{})
}
