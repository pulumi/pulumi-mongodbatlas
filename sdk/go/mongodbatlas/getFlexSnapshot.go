// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getFlexSnapshot
//
// `getFlexSnapshot` describes a flex snapshot.
//
// ## Example Usage
func GetFlexSnapshot(ctx *pulumi.Context, args *GetFlexSnapshotArgs, opts ...pulumi.InvokeOption) (*GetFlexSnapshotResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFlexSnapshotResult
	err := ctx.Invoke("mongodbatlas:index/getFlexSnapshot:getFlexSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlexSnapshot.
type GetFlexSnapshotArgs struct {
	// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
	Name string `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId  string `pulumi:"projectId"`
	SnapshotId string `pulumi:"snapshotId"`
}

// A collection of values returned by getFlexSnapshot.
type GetFlexSnapshotResult struct {
	Expiration string `pulumi:"expiration"`
	FinishTime string `pulumi:"finishTime"`
	// The provider-assigned unique ID for this managed resource.
	Id             string `pulumi:"id"`
	MongoDbVersion string `pulumi:"mongoDbVersion"`
	// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
	Name string `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId     string `pulumi:"projectId"`
	ScheduledTime string `pulumi:"scheduledTime"`
	SnapshotId    string `pulumi:"snapshotId"`
	StartTime     string `pulumi:"startTime"`
	Status        string `pulumi:"status"`
}

func GetFlexSnapshotOutput(ctx *pulumi.Context, args GetFlexSnapshotOutputArgs, opts ...pulumi.InvokeOption) GetFlexSnapshotResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetFlexSnapshotResultOutput, error) {
			args := v.(GetFlexSnapshotArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getFlexSnapshot:getFlexSnapshot", args, GetFlexSnapshotResultOutput{}, options).(GetFlexSnapshotResultOutput), nil
		}).(GetFlexSnapshotResultOutput)
}

// A collection of arguments for invoking getFlexSnapshot.
type GetFlexSnapshotOutputArgs struct {
	// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
	Name pulumi.StringInput `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId  pulumi.StringInput `pulumi:"projectId"`
	SnapshotId pulumi.StringInput `pulumi:"snapshotId"`
}

func (GetFlexSnapshotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFlexSnapshotArgs)(nil)).Elem()
}

// A collection of values returned by getFlexSnapshot.
type GetFlexSnapshotResultOutput struct{ *pulumi.OutputState }

func (GetFlexSnapshotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFlexSnapshotResult)(nil)).Elem()
}

func (o GetFlexSnapshotResultOutput) ToGetFlexSnapshotResultOutput() GetFlexSnapshotResultOutput {
	return o
}

func (o GetFlexSnapshotResultOutput) ToGetFlexSnapshotResultOutputWithContext(ctx context.Context) GetFlexSnapshotResultOutput {
	return o
}

func (o GetFlexSnapshotResultOutput) Expiration() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.Expiration }).(pulumi.StringOutput)
}

func (o GetFlexSnapshotResultOutput) FinishTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.FinishTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFlexSnapshotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFlexSnapshotResultOutput) MongoDbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.MongoDbVersion }).(pulumi.StringOutput)
}

// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
func (o GetFlexSnapshotResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.Name }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o GetFlexSnapshotResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o GetFlexSnapshotResultOutput) ScheduledTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.ScheduledTime }).(pulumi.StringOutput)
}

func (o GetFlexSnapshotResultOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.SnapshotId }).(pulumi.StringOutput)
}

func (o GetFlexSnapshotResultOutput) StartTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.StartTime }).(pulumi.StringOutput)
}

func (o GetFlexSnapshotResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexSnapshotResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFlexSnapshotResultOutput{})
}
