// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getFlexSnapshots
//
// `getFlexSnapshots` returns all snapshots of a flex cluster.
//
// ## Example Usage
func LookupFlexSnapshots(ctx *pulumi.Context, args *LookupFlexSnapshotsArgs, opts ...pulumi.InvokeOption) (*LookupFlexSnapshotsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFlexSnapshotsResult
	err := ctx.Invoke("mongodbatlas:index/getFlexSnapshots:getFlexSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlexSnapshots.
type LookupFlexSnapshotsArgs struct {
	// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
	Name string `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getFlexSnapshots.
type LookupFlexSnapshotsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
	Name string `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string                   `pulumi:"projectId"`
	Results   []GetFlexSnapshotsResult `pulumi:"results"`
}

func LookupFlexSnapshotsOutput(ctx *pulumi.Context, args LookupFlexSnapshotsOutputArgs, opts ...pulumi.InvokeOption) LookupFlexSnapshotsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFlexSnapshotsResultOutput, error) {
			args := v.(LookupFlexSnapshotsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getFlexSnapshots:getFlexSnapshots", args, LookupFlexSnapshotsResultOutput{}, options).(LookupFlexSnapshotsResultOutput), nil
		}).(LookupFlexSnapshotsResultOutput)
}

// A collection of arguments for invoking getFlexSnapshots.
type LookupFlexSnapshotsOutputArgs struct {
	// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
	Name pulumi.StringInput `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupFlexSnapshotsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlexSnapshotsArgs)(nil)).Elem()
}

// A collection of values returned by getFlexSnapshots.
type LookupFlexSnapshotsResultOutput struct{ *pulumi.OutputState }

func (LookupFlexSnapshotsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlexSnapshotsResult)(nil)).Elem()
}

func (o LookupFlexSnapshotsResultOutput) ToLookupFlexSnapshotsResultOutput() LookupFlexSnapshotsResultOutput {
	return o
}

func (o LookupFlexSnapshotsResultOutput) ToLookupFlexSnapshotsResultOutputWithContext(ctx context.Context) LookupFlexSnapshotsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFlexSnapshotsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexSnapshotsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
func (o LookupFlexSnapshotsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexSnapshotsResult) string { return v.Name }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o LookupFlexSnapshotsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexSnapshotsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupFlexSnapshotsResultOutput) Results() GetFlexSnapshotsResultArrayOutput {
	return o.ApplyT(func(v LookupFlexSnapshotsResult) []GetFlexSnapshotsResult { return v.Results }).(GetFlexSnapshotsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFlexSnapshotsResultOutput{})
}
