// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **WARNING:** Data Lake is deprecated. To learn more, see <https://dochub.mongodb.org/core/data-lake-deprecation>
//
// `getDataLakePipelineRun` describes Data Lake Pipeline Runs.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func LookupDataLakePipelineRuns(ctx *pulumi.Context, args *LookupDataLakePipelineRunsArgs, opts ...pulumi.InvokeOption) (*LookupDataLakePipelineRunsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDataLakePipelineRunsResult
	err := ctx.Invoke("mongodbatlas:index/getDataLakePipelineRuns:getDataLakePipelineRuns", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataLakePipelineRuns.
type LookupDataLakePipelineRunsArgs struct {
	// Human-readable label that identifies the Data Lake Pipeline.
	PipelineName string `pulumi:"pipelineName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getDataLakePipelineRuns.
type LookupDataLakePipelineRunsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	PipelineName string `pulumi:"pipelineName"`
	ProjectId    string `pulumi:"projectId"`
	// A list where each represents a Data Lake Pipeline Run.
	Results []GetDataLakePipelineRunsResult `pulumi:"results"`
}

func LookupDataLakePipelineRunsOutput(ctx *pulumi.Context, args LookupDataLakePipelineRunsOutputArgs, opts ...pulumi.InvokeOption) LookupDataLakePipelineRunsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDataLakePipelineRunsResultOutput, error) {
			args := v.(LookupDataLakePipelineRunsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupDataLakePipelineRunsResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getDataLakePipelineRuns:getDataLakePipelineRuns", args, &rv, "", opts...)
			if err != nil {
				return LookupDataLakePipelineRunsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupDataLakePipelineRunsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupDataLakePipelineRunsResultOutput), nil
			}
			return output, nil
		}).(LookupDataLakePipelineRunsResultOutput)
}

// A collection of arguments for invoking getDataLakePipelineRuns.
type LookupDataLakePipelineRunsOutputArgs struct {
	// Human-readable label that identifies the Data Lake Pipeline.
	PipelineName pulumi.StringInput `pulumi:"pipelineName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupDataLakePipelineRunsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataLakePipelineRunsArgs)(nil)).Elem()
}

// A collection of values returned by getDataLakePipelineRuns.
type LookupDataLakePipelineRunsResultOutput struct{ *pulumi.OutputState }

func (LookupDataLakePipelineRunsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataLakePipelineRunsResult)(nil)).Elem()
}

func (o LookupDataLakePipelineRunsResultOutput) ToLookupDataLakePipelineRunsResultOutput() LookupDataLakePipelineRunsResultOutput {
	return o
}

func (o LookupDataLakePipelineRunsResultOutput) ToLookupDataLakePipelineRunsResultOutputWithContext(ctx context.Context) LookupDataLakePipelineRunsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDataLakePipelineRunsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineRunsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDataLakePipelineRunsResultOutput) PipelineName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineRunsResult) string { return v.PipelineName }).(pulumi.StringOutput)
}

func (o LookupDataLakePipelineRunsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineRunsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Data Lake Pipeline Run.
func (o LookupDataLakePipelineRunsResultOutput) Results() GetDataLakePipelineRunsResultArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelineRunsResult) []GetDataLakePipelineRunsResult { return v.Results }).(GetDataLakePipelineRunsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDataLakePipelineRunsResultOutput{})
}
