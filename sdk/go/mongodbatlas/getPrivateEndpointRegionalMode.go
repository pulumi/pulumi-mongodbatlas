// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: privateEndpointRegionalMode
//
// `privateEndpointRegionalMode` describes a Private Endpoint Regional Mode. This represents a Private Endpoint Regional Mode Connection that wants to retrieve settings of an Atlas project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
func LookupPrivateEndpointRegionalMode(ctx *pulumi.Context, args *LookupPrivateEndpointRegionalModeArgs, opts ...pulumi.InvokeOption) (*LookupPrivateEndpointRegionalModeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivateEndpointRegionalModeResult
	err := ctx.Invoke("mongodbatlas:index/getPrivateEndpointRegionalMode:getPrivateEndpointRegionalMode", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateEndpointRegionalMode.
type LookupPrivateEndpointRegionalModeArgs struct {
	// Flag that indicates whether the regionalized private endpoitn setting is enabled for the project.
	Enabled *bool `pulumi:"enabled"`
	// Unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPrivateEndpointRegionalMode.
type LookupPrivateEndpointRegionalModeResult struct {
	Enabled *bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
}

func LookupPrivateEndpointRegionalModeOutput(ctx *pulumi.Context, args LookupPrivateEndpointRegionalModeOutputArgs, opts ...pulumi.InvokeOption) LookupPrivateEndpointRegionalModeResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPrivateEndpointRegionalModeResultOutput, error) {
			args := v.(LookupPrivateEndpointRegionalModeArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getPrivateEndpointRegionalMode:getPrivateEndpointRegionalMode", args, LookupPrivateEndpointRegionalModeResultOutput{}, options).(LookupPrivateEndpointRegionalModeResultOutput), nil
		}).(LookupPrivateEndpointRegionalModeResultOutput)
}

// A collection of arguments for invoking getPrivateEndpointRegionalMode.
type LookupPrivateEndpointRegionalModeOutputArgs struct {
	// Flag that indicates whether the regionalized private endpoitn setting is enabled for the project.
	Enabled pulumi.BoolPtrInput `pulumi:"enabled"`
	// Unique identifier for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupPrivateEndpointRegionalModeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateEndpointRegionalModeArgs)(nil)).Elem()
}

// A collection of values returned by getPrivateEndpointRegionalMode.
type LookupPrivateEndpointRegionalModeResultOutput struct{ *pulumi.OutputState }

func (LookupPrivateEndpointRegionalModeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateEndpointRegionalModeResult)(nil)).Elem()
}

func (o LookupPrivateEndpointRegionalModeResultOutput) ToLookupPrivateEndpointRegionalModeResultOutput() LookupPrivateEndpointRegionalModeResultOutput {
	return o
}

func (o LookupPrivateEndpointRegionalModeResultOutput) ToLookupPrivateEndpointRegionalModeResultOutputWithContext(ctx context.Context) LookupPrivateEndpointRegionalModeResultOutput {
	return o
}

func (o LookupPrivateEndpointRegionalModeResultOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupPrivateEndpointRegionalModeResult) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivateEndpointRegionalModeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateEndpointRegionalModeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivateEndpointRegionalModeResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateEndpointRegionalModeResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivateEndpointRegionalModeResultOutput{})
}
