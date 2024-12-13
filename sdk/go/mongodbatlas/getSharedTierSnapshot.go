// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetSharedTierSnapshot(ctx *pulumi.Context, args *GetSharedTierSnapshotArgs, opts ...pulumi.InvokeOption) (*GetSharedTierSnapshotResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSharedTierSnapshotResult
	err := ctx.Invoke("mongodbatlas:index/getSharedTierSnapshot:getSharedTierSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSharedTierSnapshot.
type GetSharedTierSnapshotArgs struct {
	ClusterName string `pulumi:"clusterName"`
	ProjectId   string `pulumi:"projectId"`
	SnapshotId  string `pulumi:"snapshotId"`
}

// A collection of values returned by getSharedTierSnapshot.
type GetSharedTierSnapshotResult struct {
	ClusterName string `pulumi:"clusterName"`
	Expiration  string `pulumi:"expiration"`
	FinishTime  string `pulumi:"finishTime"`
	// The provider-assigned unique ID for this managed resource.
	Id             string `pulumi:"id"`
	MongoDbVersion string `pulumi:"mongoDbVersion"`
	ProjectId      string `pulumi:"projectId"`
	ScheduledTime  string `pulumi:"scheduledTime"`
	SnapshotId     string `pulumi:"snapshotId"`
	StartTime      string `pulumi:"startTime"`
	Status         string `pulumi:"status"`
}

func GetSharedTierSnapshotOutput(ctx *pulumi.Context, args GetSharedTierSnapshotOutputArgs, opts ...pulumi.InvokeOption) GetSharedTierSnapshotResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSharedTierSnapshotResultOutput, error) {
			args := v.(GetSharedTierSnapshotArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getSharedTierSnapshot:getSharedTierSnapshot", args, GetSharedTierSnapshotResultOutput{}, options).(GetSharedTierSnapshotResultOutput), nil
		}).(GetSharedTierSnapshotResultOutput)
}

// A collection of arguments for invoking getSharedTierSnapshot.
type GetSharedTierSnapshotOutputArgs struct {
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	ProjectId   pulumi.StringInput `pulumi:"projectId"`
	SnapshotId  pulumi.StringInput `pulumi:"snapshotId"`
}

func (GetSharedTierSnapshotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharedTierSnapshotArgs)(nil)).Elem()
}

// A collection of values returned by getSharedTierSnapshot.
type GetSharedTierSnapshotResultOutput struct{ *pulumi.OutputState }

func (GetSharedTierSnapshotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharedTierSnapshotResult)(nil)).Elem()
}

func (o GetSharedTierSnapshotResultOutput) ToGetSharedTierSnapshotResultOutput() GetSharedTierSnapshotResultOutput {
	return o
}

func (o GetSharedTierSnapshotResultOutput) ToGetSharedTierSnapshotResultOutputWithContext(ctx context.Context) GetSharedTierSnapshotResultOutput {
	return o
}

func (o GetSharedTierSnapshotResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) Expiration() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.Expiration }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) FinishTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.FinishTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSharedTierSnapshotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) MongoDbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.MongoDbVersion }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) ScheduledTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.ScheduledTime }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.SnapshotId }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) StartTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.StartTime }).(pulumi.StringOutput)
}

func (o GetSharedTierSnapshotResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTierSnapshotResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSharedTierSnapshotResultOutput{})
}
