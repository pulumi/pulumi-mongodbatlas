// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupSharedTierRestoreJobs(ctx *pulumi.Context, args *LookupSharedTierRestoreJobsArgs, opts ...pulumi.InvokeOption) (*LookupSharedTierRestoreJobsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSharedTierRestoreJobsResult
	err := ctx.Invoke("mongodbatlas:index/getSharedTierRestoreJobs:getSharedTierRestoreJobs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSharedTierRestoreJobs.
type LookupSharedTierRestoreJobsArgs struct {
	ClusterName string `pulumi:"clusterName"`
	ProjectId   string `pulumi:"projectId"`
}

// A collection of values returned by getSharedTierRestoreJobs.
type LookupSharedTierRestoreJobsResult struct {
	ClusterName string `pulumi:"clusterName"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                           `pulumi:"id"`
	ProjectId  string                           `pulumi:"projectId"`
	Results    []GetSharedTierRestoreJobsResult `pulumi:"results"`
	TotalCount int                              `pulumi:"totalCount"`
}

func LookupSharedTierRestoreJobsOutput(ctx *pulumi.Context, args LookupSharedTierRestoreJobsOutputArgs, opts ...pulumi.InvokeOption) LookupSharedTierRestoreJobsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSharedTierRestoreJobsResultOutput, error) {
			args := v.(LookupSharedTierRestoreJobsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getSharedTierRestoreJobs:getSharedTierRestoreJobs", args, LookupSharedTierRestoreJobsResultOutput{}, options).(LookupSharedTierRestoreJobsResultOutput), nil
		}).(LookupSharedTierRestoreJobsResultOutput)
}

// A collection of arguments for invoking getSharedTierRestoreJobs.
type LookupSharedTierRestoreJobsOutputArgs struct {
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	ProjectId   pulumi.StringInput `pulumi:"projectId"`
}

func (LookupSharedTierRestoreJobsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSharedTierRestoreJobsArgs)(nil)).Elem()
}

// A collection of values returned by getSharedTierRestoreJobs.
type LookupSharedTierRestoreJobsResultOutput struct{ *pulumi.OutputState }

func (LookupSharedTierRestoreJobsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSharedTierRestoreJobsResult)(nil)).Elem()
}

func (o LookupSharedTierRestoreJobsResultOutput) ToLookupSharedTierRestoreJobsResultOutput() LookupSharedTierRestoreJobsResultOutput {
	return o
}

func (o LookupSharedTierRestoreJobsResultOutput) ToLookupSharedTierRestoreJobsResultOutputWithContext(ctx context.Context) LookupSharedTierRestoreJobsResultOutput {
	return o
}

func (o LookupSharedTierRestoreJobsResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedTierRestoreJobsResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSharedTierRestoreJobsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedTierRestoreJobsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSharedTierRestoreJobsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedTierRestoreJobsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupSharedTierRestoreJobsResultOutput) Results() GetSharedTierRestoreJobsResultArrayOutput {
	return o.ApplyT(func(v LookupSharedTierRestoreJobsResult) []GetSharedTierRestoreJobsResult { return v.Results }).(GetSharedTierRestoreJobsResultArrayOutput)
}

func (o LookupSharedTierRestoreJobsResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSharedTierRestoreJobsResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSharedTierRestoreJobsResultOutput{})
}
