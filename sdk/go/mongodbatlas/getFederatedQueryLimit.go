// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: FederatedQueryLimit
//
// `FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
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
//			_, err := mongodbatlas.LookupFederatedQueryLimit(ctx, &mongodbatlas.LookupFederatedQueryLimitArgs{
//				ProjectId:  "PROJECT_ID",
//				TenantName: "FEDERATED_DATABASE_INSTANCE_NAME",
//				LimitName:  "LIMIT_NAME",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFederatedQueryLimit(ctx *pulumi.Context, args *LookupFederatedQueryLimitArgs, opts ...pulumi.InvokeOption) (*LookupFederatedQueryLimitResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFederatedQueryLimitResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedQueryLimit:getFederatedQueryLimit", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedQueryLimit.
type LookupFederatedQueryLimitArgs struct {
	// String enum that indicates whether the identity provider is active or not. Accepted values are:
	// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
	// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
	// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
	// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
	LimitName string `pulumi:"limitName"`
	// The unique ID for the project to create a Federated Database Instance.
	ProjectId string `pulumi:"projectId"`
	// Name of the Atlas Federated Database Instance.
	TenantName string `pulumi:"tenantName"`
}

// A collection of values returned by getFederatedQueryLimit.
type LookupFederatedQueryLimitResult struct {
	// Amount that indicates the current usage of the limit.
	CurrentUsage int `pulumi:"currentUsage"`
	// Default value of the limit.
	// * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
	// * `maximumLimit` - Maximum value of the limit.
	DefaultLimit int `pulumi:"defaultLimit"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	LastModifiedDate string `pulumi:"lastModifiedDate"`
	LimitName        string `pulumi:"limitName"`
	MaximumLimit     int    `pulumi:"maximumLimit"`
	OverrunPolicy    string `pulumi:"overrunPolicy"`
	ProjectId        string `pulumi:"projectId"`
	TenantName       string `pulumi:"tenantName"`
	Value            int    `pulumi:"value"`
}

func LookupFederatedQueryLimitOutput(ctx *pulumi.Context, args LookupFederatedQueryLimitOutputArgs, opts ...pulumi.InvokeOption) LookupFederatedQueryLimitResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFederatedQueryLimitResult, error) {
			args := v.(LookupFederatedQueryLimitArgs)
			r, err := LookupFederatedQueryLimit(ctx, &args, opts...)
			var s LookupFederatedQueryLimitResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFederatedQueryLimitResultOutput)
}

// A collection of arguments for invoking getFederatedQueryLimit.
type LookupFederatedQueryLimitOutputArgs struct {
	// String enum that indicates whether the identity provider is active or not. Accepted values are:
	// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
	// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
	// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
	// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
	LimitName pulumi.StringInput `pulumi:"limitName"`
	// The unique ID for the project to create a Federated Database Instance.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Name of the Atlas Federated Database Instance.
	TenantName pulumi.StringInput `pulumi:"tenantName"`
}

func (LookupFederatedQueryLimitOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedQueryLimitArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedQueryLimit.
type LookupFederatedQueryLimitResultOutput struct{ *pulumi.OutputState }

func (LookupFederatedQueryLimitResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedQueryLimitResult)(nil)).Elem()
}

func (o LookupFederatedQueryLimitResultOutput) ToLookupFederatedQueryLimitResultOutput() LookupFederatedQueryLimitResultOutput {
	return o
}

func (o LookupFederatedQueryLimitResultOutput) ToLookupFederatedQueryLimitResultOutputWithContext(ctx context.Context) LookupFederatedQueryLimitResultOutput {
	return o
}

// Amount that indicates the current usage of the limit.
func (o LookupFederatedQueryLimitResultOutput) CurrentUsage() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) int { return v.CurrentUsage }).(pulumi.IntOutput)
}

// Default value of the limit.
// * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
// * `maximumLimit` - Maximum value of the limit.
func (o LookupFederatedQueryLimitResultOutput) DefaultLimit() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) int { return v.DefaultLimit }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFederatedQueryLimitResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitResultOutput) LastModifiedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) string { return v.LastModifiedDate }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitResultOutput) LimitName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) string { return v.LimitName }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitResultOutput) MaximumLimit() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) int { return v.MaximumLimit }).(pulumi.IntOutput)
}

func (o LookupFederatedQueryLimitResultOutput) OverrunPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) string { return v.OverrunPolicy }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitResultOutput) TenantName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) string { return v.TenantName }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitResultOutput) Value() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitResult) int { return v.Value }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFederatedQueryLimitResultOutput{})
}
