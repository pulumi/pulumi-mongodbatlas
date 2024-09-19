// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getStreamConnections
//
// `getStreamConnections` describes all connections of a stream instance for the specified project.
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
//			_, err := mongodbatlas.LookupStreamConnections(ctx, &mongodbatlas.LookupStreamConnectionsArgs{
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
func LookupStreamConnections(ctx *pulumi.Context, args *LookupStreamConnectionsArgs, opts ...pulumi.InvokeOption) (*LookupStreamConnectionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStreamConnectionsResult
	err := ctx.Invoke("mongodbatlas:index/getStreamConnections:getStreamConnections", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamConnections.
type LookupStreamConnectionsArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getStreamConnections.
type LookupStreamConnectionsResult struct {
	Id string `pulumi:"id"`
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// A list where each element contains a stream connection.
	Results []GetStreamConnectionsResult `pulumi:"results"`
	// Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
	TotalCount int `pulumi:"totalCount"`
}

func LookupStreamConnectionsOutput(ctx *pulumi.Context, args LookupStreamConnectionsOutputArgs, opts ...pulumi.InvokeOption) LookupStreamConnectionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupStreamConnectionsResultOutput, error) {
			args := v.(LookupStreamConnectionsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupStreamConnectionsResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getStreamConnections:getStreamConnections", args, &rv, "", opts...)
			if err != nil {
				return LookupStreamConnectionsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupStreamConnectionsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupStreamConnectionsResultOutput), nil
			}
			return output, nil
		}).(LookupStreamConnectionsResultOutput)
}

// A collection of arguments for invoking getStreamConnections.
type LookupStreamConnectionsOutputArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupStreamConnectionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamConnectionsArgs)(nil)).Elem()
}

// A collection of values returned by getStreamConnections.
type LookupStreamConnectionsResultOutput struct{ *pulumi.OutputState }

func (LookupStreamConnectionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamConnectionsResult)(nil)).Elem()
}

func (o LookupStreamConnectionsResultOutput) ToLookupStreamConnectionsResultOutput() LookupStreamConnectionsResultOutput {
	return o
}

func (o LookupStreamConnectionsResultOutput) ToLookupStreamConnectionsResultOutputWithContext(ctx context.Context) LookupStreamConnectionsResultOutput {
	return o
}

func (o LookupStreamConnectionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Human-readable label that identifies the stream instance.
func (o LookupStreamConnectionsResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o LookupStreamConnectionsResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupStreamConnectionsResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupStreamConnectionsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each element contains a stream connection.
func (o LookupStreamConnectionsResultOutput) Results() GetStreamConnectionsResultArrayOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) []GetStreamConnectionsResult { return v.Results }).(GetStreamConnectionsResultArrayOutput)
}

// Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
func (o LookupStreamConnectionsResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStreamConnectionsResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamConnectionsResultOutput{})
}
