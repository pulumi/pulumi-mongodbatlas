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
// `getDataLakePipelineRun` describes a Data Lake Pipeline Run.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func GetDataLakePipelineRun(ctx *pulumi.Context, args *GetDataLakePipelineRunArgs, opts ...pulumi.InvokeOption) (*GetDataLakePipelineRunResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDataLakePipelineRunResult
	err := ctx.Invoke("mongodbatlas:index/getDataLakePipelineRun:getDataLakePipelineRun", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataLakePipelineRun.
type GetDataLakePipelineRunArgs struct {
	// Human-readable label that identifies the Data Lake Pipeline.
	PipelineName string `pulumi:"pipelineName"`
	// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
	PipelineRunId string `pulumi:"pipelineRunId"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getDataLakePipelineRun.
type GetDataLakePipelineRunResult struct {
	// Backup schedule interval of the Data Lake Pipeline.
	BackupFrequencyType string `pulumi:"backupFrequencyType"`
	// Timestamp that indicates when the pipeline run was created.
	CreatedDate string `pulumi:"createdDate"`
	// Human-readable label that identifies the dataset that Atlas generates during this pipeline run.
	DatasetName string `pulumi:"datasetName"`
	// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	// Processing phase of the Data Lake Pipeline.
	Phase string `pulumi:"phase"`
	// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline.
	PipelineId    string `pulumi:"pipelineId"`
	PipelineName  string `pulumi:"pipelineName"`
	PipelineRunId string `pulumi:"pipelineRunId"`
	ProjectId     string `pulumi:"projectId"`
	// Unique 24-hexadecimal character string that identifies the snapshot of a cluster.
	SnapshotId string `pulumi:"snapshotId"`
	// State of the pipeline run.
	State string `pulumi:"state"`
	// Runtime statistics for this Data Lake Pipeline run.
	Stats []GetDataLakePipelineRunStat `pulumi:"stats"`
}

func GetDataLakePipelineRunOutput(ctx *pulumi.Context, args GetDataLakePipelineRunOutputArgs, opts ...pulumi.InvokeOption) GetDataLakePipelineRunResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDataLakePipelineRunResultOutput, error) {
			args := v.(GetDataLakePipelineRunArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetDataLakePipelineRunResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getDataLakePipelineRun:getDataLakePipelineRun", args, &rv, "", opts...)
			if err != nil {
				return GetDataLakePipelineRunResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetDataLakePipelineRunResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetDataLakePipelineRunResultOutput), nil
			}
			return output, nil
		}).(GetDataLakePipelineRunResultOutput)
}

// A collection of arguments for invoking getDataLakePipelineRun.
type GetDataLakePipelineRunOutputArgs struct {
	// Human-readable label that identifies the Data Lake Pipeline.
	PipelineName pulumi.StringInput `pulumi:"pipelineName"`
	// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
	PipelineRunId pulumi.StringInput `pulumi:"pipelineRunId"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (GetDataLakePipelineRunOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDataLakePipelineRunArgs)(nil)).Elem()
}

// A collection of values returned by getDataLakePipelineRun.
type GetDataLakePipelineRunResultOutput struct{ *pulumi.OutputState }

func (GetDataLakePipelineRunResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDataLakePipelineRunResult)(nil)).Elem()
}

func (o GetDataLakePipelineRunResultOutput) ToGetDataLakePipelineRunResultOutput() GetDataLakePipelineRunResultOutput {
	return o
}

func (o GetDataLakePipelineRunResultOutput) ToGetDataLakePipelineRunResultOutputWithContext(ctx context.Context) GetDataLakePipelineRunResultOutput {
	return o
}

// Backup schedule interval of the Data Lake Pipeline.
func (o GetDataLakePipelineRunResultOutput) BackupFrequencyType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.BackupFrequencyType }).(pulumi.StringOutput)
}

// Timestamp that indicates when the pipeline run was created.
func (o GetDataLakePipelineRunResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// Human-readable label that identifies the dataset that Atlas generates during this pipeline run.
func (o GetDataLakePipelineRunResultOutput) DatasetName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.DatasetName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
func (o GetDataLakePipelineRunResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
func (o GetDataLakePipelineRunResultOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

// Processing phase of the Data Lake Pipeline.
func (o GetDataLakePipelineRunResultOutput) Phase() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.Phase }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies a Data Lake Pipeline.
func (o GetDataLakePipelineRunResultOutput) PipelineId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.PipelineId }).(pulumi.StringOutput)
}

func (o GetDataLakePipelineRunResultOutput) PipelineName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.PipelineName }).(pulumi.StringOutput)
}

func (o GetDataLakePipelineRunResultOutput) PipelineRunId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.PipelineRunId }).(pulumi.StringOutput)
}

func (o GetDataLakePipelineRunResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies the snapshot of a cluster.
func (o GetDataLakePipelineRunResultOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.SnapshotId }).(pulumi.StringOutput)
}

// State of the pipeline run.
func (o GetDataLakePipelineRunResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) string { return v.State }).(pulumi.StringOutput)
}

// Runtime statistics for this Data Lake Pipeline run.
func (o GetDataLakePipelineRunResultOutput) Stats() GetDataLakePipelineRunStatArrayOutput {
	return o.ApplyT(func(v GetDataLakePipelineRunResult) []GetDataLakePipelineRunStat { return v.Stats }).(GetDataLakePipelineRunStatArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDataLakePipelineRunResultOutput{})
}
