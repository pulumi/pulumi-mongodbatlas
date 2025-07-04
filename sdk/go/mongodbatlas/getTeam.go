// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: Team
//
// `Team` describes a Team. The resource requires your Organization ID, Project ID and Team ID.
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
//			testTeam, err := mongodbatlas.NewTeam(ctx, "test", &mongodbatlas.TeamArgs{
//				OrgId: pulumi.String("<ORGANIZATION-ID>"),
//				Name:  pulumi.String("myNewTeam"),
//				Usernames: pulumi.StringArray{
//					pulumi.String("user1"),
//					pulumi.String("user2"),
//					pulumi.String("user3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupTeamOutput(ctx, mongodbatlas.GetTeamOutputArgs{
//				OrgId:  testTeam.OrgId,
//				TeamId: testTeam.TeamId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
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
//			test, err := mongodbatlas.NewTeam(ctx, "test", &mongodbatlas.TeamArgs{
//				OrgId: pulumi.String("<ORGANIZATION-ID>"),
//				Name:  pulumi.String("myNewTeam"),
//				Usernames: pulumi.StringArray{
//					pulumi.String("user1"),
//					pulumi.String("user2"),
//					pulumi.String("user3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupTeamOutput(ctx, mongodbatlas.GetTeamOutputArgs{
//				OrgId: test.OrgId,
//				Name:  test.Name,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupTeam(ctx *pulumi.Context, args *LookupTeamArgs, opts ...pulumi.InvokeOption) (*LookupTeamResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTeamResult
	err := ctx.Invoke("mongodbatlas:index/getTeam:getTeam", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTeam.
type LookupTeamArgs struct {
	// The team name.
	//
	// > **IMPORTANT:** Either `teamId` or `name` must be configured.
	Name *string `pulumi:"name"`
	// The unique identifier for the organization you want to associate the team with.
	OrgId string `pulumi:"orgId"`
	// The unique identifier for the team.
	TeamId *string `pulumi:"teamId"`
}

// A collection of values returned by getTeam.
type LookupTeamResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the team you want to create.
	Name  string `pulumi:"name"`
	OrgId string `pulumi:"orgId"`
	// The unique identifier for the team.
	TeamId string `pulumi:"teamId"`
	// The users who are part of the organization.
	Usernames []string `pulumi:"usernames"`
}

func LookupTeamOutput(ctx *pulumi.Context, args LookupTeamOutputArgs, opts ...pulumi.InvokeOption) LookupTeamResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTeamResultOutput, error) {
			args := v.(LookupTeamArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getTeam:getTeam", args, LookupTeamResultOutput{}, options).(LookupTeamResultOutput), nil
		}).(LookupTeamResultOutput)
}

// A collection of arguments for invoking getTeam.
type LookupTeamOutputArgs struct {
	// The team name.
	//
	// > **IMPORTANT:** Either `teamId` or `name` must be configured.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The unique identifier for the organization you want to associate the team with.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// The unique identifier for the team.
	TeamId pulumi.StringPtrInput `pulumi:"teamId"`
}

func (LookupTeamOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTeamArgs)(nil)).Elem()
}

// A collection of values returned by getTeam.
type LookupTeamResultOutput struct{ *pulumi.OutputState }

func (LookupTeamResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTeamResult)(nil)).Elem()
}

func (o LookupTeamResultOutput) ToLookupTeamResultOutput() LookupTeamResultOutput {
	return o
}

func (o LookupTeamResultOutput) ToLookupTeamResultOutputWithContext(ctx context.Context) LookupTeamResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTeamResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the team you want to create.
func (o LookupTeamResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupTeamResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// The unique identifier for the team.
func (o LookupTeamResultOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.TeamId }).(pulumi.StringOutput)
}

// The users who are part of the organization.
func (o LookupTeamResultOutput) Usernames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTeamResult) []string { return v.Usernames }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTeamResultOutput{})
}
