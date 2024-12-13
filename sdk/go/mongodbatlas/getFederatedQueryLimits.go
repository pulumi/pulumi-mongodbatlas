// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getFederatedQueryLimits
//
// `getFederatedQueryLimits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example Usage
//
// ### S
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
//			_, err := mongodbatlas.LookupFederatedQueryLimits(ctx, &mongodbatlas.LookupFederatedQueryLimitsArgs{
//				ProjectId:  "PROJECT_ID",
//				TenantName: "FEDERATED_DATABASE_INSTANCE_NAME",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFederatedQueryLimits(ctx *pulumi.Context, args *LookupFederatedQueryLimitsArgs, opts ...pulumi.InvokeOption) (*LookupFederatedQueryLimitsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFederatedQueryLimitsResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedQueryLimits.
type LookupFederatedQueryLimitsArgs struct {
	// The unique ID for the project to create a Federated Database Instance.
	ProjectId string `pulumi:"projectId"`
	// Name of the Atlas Federated Database Instance.
	TenantName string `pulumi:"tenantName"`
}

// A collection of values returned by getFederatedQueryLimits.
type LookupFederatedQueryLimitsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// Includes Federated Database instance query limits for each item detailed in the results array section.
	Results    []GetFederatedQueryLimitsResult `pulumi:"results"`
	TenantName string                          `pulumi:"tenantName"`
}

func LookupFederatedQueryLimitsOutput(ctx *pulumi.Context, args LookupFederatedQueryLimitsOutputArgs, opts ...pulumi.InvokeOption) LookupFederatedQueryLimitsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFederatedQueryLimitsResultOutput, error) {
			args := v.(LookupFederatedQueryLimitsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits", args, LookupFederatedQueryLimitsResultOutput{}, options).(LookupFederatedQueryLimitsResultOutput), nil
		}).(LookupFederatedQueryLimitsResultOutput)
}

// A collection of arguments for invoking getFederatedQueryLimits.
type LookupFederatedQueryLimitsOutputArgs struct {
	// The unique ID for the project to create a Federated Database Instance.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Name of the Atlas Federated Database Instance.
	TenantName pulumi.StringInput `pulumi:"tenantName"`
}

func (LookupFederatedQueryLimitsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedQueryLimitsArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedQueryLimits.
type LookupFederatedQueryLimitsResultOutput struct{ *pulumi.OutputState }

func (LookupFederatedQueryLimitsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedQueryLimitsResult)(nil)).Elem()
}

func (o LookupFederatedQueryLimitsResultOutput) ToLookupFederatedQueryLimitsResultOutput() LookupFederatedQueryLimitsResultOutput {
	return o
}

func (o LookupFederatedQueryLimitsResultOutput) ToLookupFederatedQueryLimitsResultOutputWithContext(ctx context.Context) LookupFederatedQueryLimitsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFederatedQueryLimitsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFederatedQueryLimitsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Includes Federated Database instance query limits for each item detailed in the results array section.
func (o LookupFederatedQueryLimitsResultOutput) Results() GetFederatedQueryLimitsResultArrayOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitsResult) []GetFederatedQueryLimitsResult { return v.Results }).(GetFederatedQueryLimitsResultArrayOutput)
}

func (o LookupFederatedQueryLimitsResultOutput) TenantName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedQueryLimitsResult) string { return v.TenantName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFederatedQueryLimitsResultOutput{})
}
