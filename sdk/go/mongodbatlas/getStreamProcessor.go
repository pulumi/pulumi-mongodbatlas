// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: StreamProcessor
//
// `StreamProcessor` describes a stream processor.
//
// ## Example Usage
func LookupStreamProcessor(ctx *pulumi.Context, args *LookupStreamProcessorArgs, opts ...pulumi.InvokeOption) (*LookupStreamProcessorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStreamProcessorResult
	err := ctx.Invoke("mongodbatlas:index/getStreamProcessor:getStreamProcessor", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamProcessor.
type LookupStreamProcessorArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Human-readable label that identifies the stream processor.
	ProcessorName string `pulumi:"processorName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getStreamProcessor.
type LookupStreamProcessorResult struct {
	Id string `pulumi:"id"`
	// Human-readable label that identifies the stream instance.
	InstanceName string                    `pulumi:"instanceName"`
	Options      GetStreamProcessorOptions `pulumi:"options"`
	Pipeline     string                    `pulumi:"pipeline"`
	// Human-readable label that identifies the stream processor.
	ProcessorName string `pulumi:"processorName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
	State     string `pulumi:"state"`
	Stats     string `pulumi:"stats"`
}

func LookupStreamProcessorOutput(ctx *pulumi.Context, args LookupStreamProcessorOutputArgs, opts ...pulumi.InvokeOption) LookupStreamProcessorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupStreamProcessorResultOutput, error) {
			args := v.(LookupStreamProcessorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getStreamProcessor:getStreamProcessor", args, LookupStreamProcessorResultOutput{}, options).(LookupStreamProcessorResultOutput), nil
		}).(LookupStreamProcessorResultOutput)
}

// A collection of arguments for invoking getStreamProcessor.
type LookupStreamProcessorOutputArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// Human-readable label that identifies the stream processor.
	ProcessorName pulumi.StringInput `pulumi:"processorName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupStreamProcessorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamProcessorArgs)(nil)).Elem()
}

// A collection of values returned by getStreamProcessor.
type LookupStreamProcessorResultOutput struct{ *pulumi.OutputState }

func (LookupStreamProcessorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamProcessorResult)(nil)).Elem()
}

func (o LookupStreamProcessorResultOutput) ToLookupStreamProcessorResultOutput() LookupStreamProcessorResultOutput {
	return o
}

func (o LookupStreamProcessorResultOutput) ToLookupStreamProcessorResultOutputWithContext(ctx context.Context) LookupStreamProcessorResultOutput {
	return o
}

func (o LookupStreamProcessorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Human-readable label that identifies the stream instance.
func (o LookupStreamProcessorResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o LookupStreamProcessorResultOutput) Options() GetStreamProcessorOptionsOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) GetStreamProcessorOptions { return v.Options }).(GetStreamProcessorOptionsOutput)
}

func (o LookupStreamProcessorResultOutput) Pipeline() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.Pipeline }).(pulumi.StringOutput)
}

// Human-readable label that identifies the stream processor.
func (o LookupStreamProcessorResultOutput) ProcessorName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.ProcessorName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o LookupStreamProcessorResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupStreamProcessorResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.State }).(pulumi.StringOutput)
}

func (o LookupStreamProcessorResultOutput) Stats() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorResult) string { return v.Stats }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamProcessorResultOutput{})
}
