// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `DataLakePipeline` describes a Data Lake Pipeline.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
func LookupDataLakePipeline(ctx *pulumi.Context, args *LookupDataLakePipelineArgs, opts ...pulumi.InvokeOption) (*LookupDataLakePipelineResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDataLakePipelineResult
	err := ctx.Invoke("mongodbatlas:index/getDataLakePipeline:getDataLakePipeline", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataLakePipeline.
type LookupDataLakePipelineArgs struct {
	// Name of the Atlas Data Lake Pipeline.
	Name string `pulumi:"name"`
	// The unique ID for the project to create a Data Lake Pipeline.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getDataLakePipeline.
type LookupDataLakePipelineResult struct {
	// Timestamp that indicates when the Data Lake Pipeline was created.
	CreatedDate string `pulumi:"createdDate"`
	// Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
	Id string `pulumi:"id"`
	// List of backup schedule policy items that you can use as a Data Lake Pipeline source.
	// * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
	// * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
	// * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
	// * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
	// * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
	IngestionSchedules []GetDataLakePipelineIngestionSchedule `pulumi:"ingestionSchedules"`
	// Timestamp that indicates the last time that the Data Lake Pipeline was updated.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	Name            string `pulumi:"name"`
	// Unique 24-hexadecimal character string that identifies the project.
	ProjectId string                    `pulumi:"projectId"`
	Sinks     []GetDataLakePipelineSink `pulumi:"sinks"`
	// List of backup snapshots that you can use to trigger an on demand pipeline run.
	// * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
	// * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
	// * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
	// * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
	// * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
	// * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
	// * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
	// * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
	// * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
	// * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
	// * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
	// * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
	// * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
	// * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
	Snapshots []GetDataLakePipelineSnapshot `pulumi:"snapshots"`
	Sources   []GetDataLakePipelineSource   `pulumi:"sources"`
	// State of this Data Lake Pipeline.
	State string `pulumi:"state"`
	// Fields to be excluded for this Data Lake Pipeline.
	// * `transformations.#.field` - Key in the document.
	// * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
	Transformations []GetDataLakePipelineTransformation `pulumi:"transformations"`
}

func LookupDataLakePipelineOutput(ctx *pulumi.Context, args LookupDataLakePipelineOutputArgs, opts ...pulumi.InvokeOption) LookupDataLakePipelineResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDataLakePipelineResult, error) {
			args := v.(LookupDataLakePipelineArgs)
			r, err := LookupDataLakePipeline(ctx, &args, opts...)
			var s LookupDataLakePipelineResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDataLakePipelineResultOutput)
}

// A collection of arguments for invoking getDataLakePipeline.
type LookupDataLakePipelineOutputArgs struct {
	// Name of the Atlas Data Lake Pipeline.
	Name pulumi.StringInput `pulumi:"name"`
	// The unique ID for the project to create a Data Lake Pipeline.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupDataLakePipelineOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataLakePipelineArgs)(nil)).Elem()
}

// A collection of values returned by getDataLakePipeline.
type LookupDataLakePipelineResultOutput struct{ *pulumi.OutputState }

func (LookupDataLakePipelineResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataLakePipelineResult)(nil)).Elem()
}

func (o LookupDataLakePipelineResultOutput) ToLookupDataLakePipelineResultOutput() LookupDataLakePipelineResultOutput {
	return o
}

func (o LookupDataLakePipelineResultOutput) ToLookupDataLakePipelineResultOutputWithContext(ctx context.Context) LookupDataLakePipelineResultOutput {
	return o
}

func (o LookupDataLakePipelineResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupDataLakePipelineResult] {
	return pulumix.Output[LookupDataLakePipelineResult]{
		OutputState: o.OutputState,
	}
}

// Timestamp that indicates when the Data Lake Pipeline was created.
func (o LookupDataLakePipelineResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
func (o LookupDataLakePipelineResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of backup schedule policy items that you can use as a Data Lake Pipeline source.
// * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
// * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
// * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
// * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
// * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
func (o LookupDataLakePipelineResultOutput) IngestionSchedules() GetDataLakePipelineIngestionScheduleArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) []GetDataLakePipelineIngestionSchedule {
		return v.IngestionSchedules
	}).(GetDataLakePipelineIngestionScheduleArrayOutput)
}

// Timestamp that indicates the last time that the Data Lake Pipeline was updated.
func (o LookupDataLakePipelineResultOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) string { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

func (o LookupDataLakePipelineResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) string { return v.Name }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies the project.
func (o LookupDataLakePipelineResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupDataLakePipelineResultOutput) Sinks() GetDataLakePipelineSinkArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) []GetDataLakePipelineSink { return v.Sinks }).(GetDataLakePipelineSinkArrayOutput)
}

// List of backup snapshots that you can use to trigger an on demand pipeline run.
// * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
// * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
// * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
// * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
// * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
// * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
// * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
// * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
// * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
// * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
// * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
// * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
// * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
// * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
func (o LookupDataLakePipelineResultOutput) Snapshots() GetDataLakePipelineSnapshotArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) []GetDataLakePipelineSnapshot { return v.Snapshots }).(GetDataLakePipelineSnapshotArrayOutput)
}

func (o LookupDataLakePipelineResultOutput) Sources() GetDataLakePipelineSourceArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) []GetDataLakePipelineSource { return v.Sources }).(GetDataLakePipelineSourceArrayOutput)
}

// State of this Data Lake Pipeline.
func (o LookupDataLakePipelineResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) string { return v.State }).(pulumi.StringOutput)
}

// Fields to be excluded for this Data Lake Pipeline.
// * `transformations.#.field` - Key in the document.
// * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
func (o LookupDataLakePipelineResultOutput) Transformations() GetDataLakePipelineTransformationArrayOutput {
	return o.ApplyT(func(v LookupDataLakePipelineResult) []GetDataLakePipelineTransformation { return v.Transformations }).(GetDataLakePipelineTransformationArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDataLakePipelineResultOutput{})
}
