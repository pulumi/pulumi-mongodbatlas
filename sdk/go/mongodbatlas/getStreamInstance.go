// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: StreamInstance
//
// `StreamInstance` describes a stream instance.
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
//			_, err := mongodbatlas.LookupStreamInstance(ctx, &mongodbatlas.LookupStreamInstanceArgs{
//				ProjectId:    "<PROJECT_ID>",
//				InstanceName: "<INSTANCE_NAME>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupStreamInstance(ctx *pulumi.Context, args *LookupStreamInstanceArgs, opts ...pulumi.InvokeOption) (*LookupStreamInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStreamInstanceResult
	err := ctx.Invoke("mongodbatlas:index/getStreamInstance:getStreamInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamInstance.
type LookupStreamInstanceArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getStreamInstance.
type LookupStreamInstanceResult struct {
	// Defines the cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
	DataProcessRegion GetStreamInstanceDataProcessRegion `pulumi:"dataProcessRegion"`
	// List that contains the hostnames assigned to the stream instance.
	Hostnames    []string `pulumi:"hostnames"`
	Id           string   `pulumi:"id"`
	InstanceName string   `pulumi:"instanceName"`
	ProjectId    string   `pulumi:"projectId"`
	// Defines the configuration options for an Atlas Stream Processing Instance. See stream config
	StreamConfig GetStreamInstanceStreamConfig `pulumi:"streamConfig"`
}

func LookupStreamInstanceOutput(ctx *pulumi.Context, args LookupStreamInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupStreamInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupStreamInstanceResult, error) {
			args := v.(LookupStreamInstanceArgs)
			r, err := LookupStreamInstance(ctx, &args, opts...)
			var s LookupStreamInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupStreamInstanceResultOutput)
}

// A collection of arguments for invoking getStreamInstance.
type LookupStreamInstanceOutputArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupStreamInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getStreamInstance.
type LookupStreamInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupStreamInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamInstanceResult)(nil)).Elem()
}

func (o LookupStreamInstanceResultOutput) ToLookupStreamInstanceResultOutput() LookupStreamInstanceResultOutput {
	return o
}

func (o LookupStreamInstanceResultOutput) ToLookupStreamInstanceResultOutputWithContext(ctx context.Context) LookupStreamInstanceResultOutput {
	return o
}

// Defines the cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
func (o LookupStreamInstanceResultOutput) DataProcessRegion() GetStreamInstanceDataProcessRegionOutput {
	return o.ApplyT(func(v LookupStreamInstanceResult) GetStreamInstanceDataProcessRegion { return v.DataProcessRegion }).(GetStreamInstanceDataProcessRegionOutput)
}

// List that contains the hostnames assigned to the stream instance.
func (o LookupStreamInstanceResultOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupStreamInstanceResult) []string { return v.Hostnames }).(pulumi.StringArrayOutput)
}

func (o LookupStreamInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupStreamInstanceResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamInstanceResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o LookupStreamInstanceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamInstanceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Defines the configuration options for an Atlas Stream Processing Instance. See stream config
func (o LookupStreamInstanceResultOutput) StreamConfig() GetStreamInstanceStreamConfigOutput {
	return o.ApplyT(func(v LookupStreamInstanceResult) GetStreamInstanceStreamConfig { return v.StreamConfig }).(GetStreamInstanceStreamConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamInstanceResultOutput{})
}
