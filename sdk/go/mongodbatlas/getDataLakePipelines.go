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
// `getDataLakePipelines` describes Data Lake Pipelines.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
func LookupDataLakePipelines(ctx *pulumi.Context, args *LookupDataLakePipelinesArgs, opts ...pulumi.InvokeOption) (*LookupDataLakePipelinesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDataLakePipelinesResult
	err := ctx.Invoke("mongodbatlas:index/getDataLakePipelines:getDataLakePipelines", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataLakePipelines.
type LookupDataLakePipelinesArgs struct {
	// The unique ID for the project to create a data lake pipeline.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getDataLakePipelines.
type LookupDataLakePipelinesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal character string that identifies the project.
	// * `policyItemId` - Unique 24-hexadecimal character string that identifies a policy item.
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Data Lake Pipeline.
	Results []GetDataLakePipelinesResult `pulumi:"results"`
}

func LookupDataLakePipelinesOutput(ctx *pulumi.Context, args LookupDataLakePipelinesOutputArgs, opts ...pulumi.InvokeOption) LookupDataLakePipelinesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDataLakePipelinesResultOutput, error) {
			args := v.(LookupDataLakePipelinesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getDataLakePipelines:getDataLakePipelines", args, LookupDataLakePipelinesResultOutput{}, options).(LookupDataLakePipelinesResultOutput), nil
		}).(LookupDataLakePipelinesResultOutput)
}

// A collection of arguments for invoking getDataLakePipelines.
type LookupDataLakePipelinesOutputArgs struct {
	// The unique ID for the project to create a data lake pipeline.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupDataLakePipelinesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataLakePipelinesArgs)(nil)).Elem()
}

// A collection of values returned by getDataLakePipelines.
type LookupDataLakePipelinesResultOutput struct{ *pulumi.OutputState }

func (LookupDataLakePipelinesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataLakePipelinesResult)(nil)).Elem()
}

func (o LookupDataLakePipelinesResultOutput) ToLookupDataLakePipelinesResultOutput() LookupDataLakePipelinesResultOutput {
	return o
}

func (o LookupDataLakePipelinesResultOutput) ToLookupDataLakePipelinesResultOutputWithContext(ctx context.Context) LookupDataLakePipelinesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDataLakePipelinesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelinesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies the project.
// * `policyItemId` - Unique 24-hexadecimal character string that identifies a policy item.
func (o LookupDataLakePipelinesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelinesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Data Lake Pipeline.
func (o LookupDataLakePipelinesResultOutput) Results() GetDataLakePipelinesResultArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelinesResult) []GetDataLakePipelinesResult { return v.Results }).(GetDataLakePipelinesResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDataLakePipelinesResultOutput{})
}
