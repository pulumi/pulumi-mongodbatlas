// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getStreamInstances
//
// `getStreamInstances` describes the stream instances defined in a project.
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
//			_, err := mongodbatlas.LookupStreamInstances(ctx, &mongodbatlas.LookupStreamInstancesArgs{
//				ProjectId: "<PROJECT_ID>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupStreamInstances(ctx *pulumi.Context, args *LookupStreamInstancesArgs, opts ...pulumi.InvokeOption) (*LookupStreamInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStreamInstancesResult
	err := ctx.Invoke("mongodbatlas:index/getStreamInstances:getStreamInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamInstances.
type LookupStreamInstancesArgs struct {
	// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getStreamInstances.
type LookupStreamInstancesResult struct {
	Id           string `pulumi:"id"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// A list where each element contains a Stream Instance.
	Results []GetStreamInstancesResult `pulumi:"results"`
	// Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
	TotalCount int `pulumi:"totalCount"`
}

func LookupStreamInstancesOutput(ctx *pulumi.Context, args LookupStreamInstancesOutputArgs, opts ...pulumi.InvokeOption) LookupStreamInstancesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupStreamInstancesResultOutput, error) {
			args := v.(LookupStreamInstancesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupStreamInstancesResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getStreamInstances:getStreamInstances", args, &rv, "", opts...)
			if err != nil {
				return LookupStreamInstancesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupStreamInstancesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupStreamInstancesResultOutput), nil
			}
			return output, nil
		}).(LookupStreamInstancesResultOutput)
}

// A collection of arguments for invoking getStreamInstances.
type LookupStreamInstancesOutputArgs struct {
	// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupStreamInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getStreamInstances.
type LookupStreamInstancesResultOutput struct{ *pulumi.OutputState }

func (LookupStreamInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamInstancesResult)(nil)).Elem()
}

func (o LookupStreamInstancesResultOutput) ToLookupStreamInstancesResultOutput() LookupStreamInstancesResultOutput {
	return o
}

func (o LookupStreamInstancesResultOutput) ToLookupStreamInstancesResultOutputWithContext(ctx context.Context) LookupStreamInstancesResultOutput {
	return o
}

func (o LookupStreamInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupStreamInstancesResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupStreamInstancesResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupStreamInstancesResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupStreamInstancesResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupStreamInstancesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamInstancesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each element contains a Stream Instance.
func (o LookupStreamInstancesResultOutput) Results() GetStreamInstancesResultArrayOutput {
	return o.ApplyT(func(v LookupStreamInstancesResult) []GetStreamInstancesResult { return v.Results }).(GetStreamInstancesResultArrayOutput)
}

// Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
func (o LookupStreamInstancesResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStreamInstancesResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamInstancesResultOutput{})
}
