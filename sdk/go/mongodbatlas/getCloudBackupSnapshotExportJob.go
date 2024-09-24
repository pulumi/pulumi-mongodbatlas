// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: mongodbatlas_cloud_backup_snapshot_export_Job
//
// `CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
//			testCloudBackupSnapshotExportBucket, err := mongodbatlas.NewCloudBackupSnapshotExportBucket(ctx, "test", &mongodbatlas.CloudBackupSnapshotExportBucketArgs{
//				ProjectId:     pulumi.String("{PROJECT_ID}"),
//				IamRoleId:     pulumi.String("{IAM_ROLE_ID}"),
//				BucketName:    pulumi.String("example_bucket"),
//				CloudProvider: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			testCloudBackupSnapshotExportJob, err := mongodbatlas.NewCloudBackupSnapshotExportJob(ctx, "test", &mongodbatlas.CloudBackupSnapshotExportJobArgs{
//				ProjectId:      pulumi.String("{PROJECT_ID}"),
//				ClusterName:    pulumi.String("{CLUSTER_NAME}"),
//				SnapshotId:     pulumi.String("{SNAPSHOT_ID}"),
//				ExportBucketId: testCloudBackupSnapshotExportBucket.ExportBucketId,
//				CustomDatas: mongodbatlas.CloudBackupSnapshotExportJobCustomDataArray{
//					&mongodbatlas.CloudBackupSnapshotExportJobCustomDataArgs{
//						Key:   pulumi.String("exported by"),
//						Value: pulumi.String("myName"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupCloudBackupSnapshotExportJobOutput(ctx, mongodbatlas.GetCloudBackupSnapshotExportJobOutputArgs{
//				ProjectId:   pulumi.String("{PROJECT_ID}"),
//				ClusterName: pulumi.String("{CLUSTER_NAME}"),
//				ExportJobId: testCloudBackupSnapshotExportJob.ExportJobId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupCloudBackupSnapshotExportJob(ctx *pulumi.Context, args *LookupCloudBackupSnapshotExportJobArgs, opts ...pulumi.InvokeOption) (*LookupCloudBackupSnapshotExportJobResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudBackupSnapshotExportJobResult
	err := ctx.Invoke("mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudBackupSnapshotExportJob.
type LookupCloudBackupSnapshotExportJobArgs struct {
	// Name of the Atlas cluster whose export job you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	// Unique identifier of the export job to retrieve.
	ExportJobId string `pulumi:"exportJobId"`
	// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCloudBackupSnapshotExportJob.
type LookupCloudBackupSnapshotExportJobResult struct {
	ClusterName string `pulumi:"clusterName"`
	// _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
	Components []GetCloudBackupSnapshotExportJobComponent `pulumi:"components"`
	// Timestamp in ISO 8601 date and time format in UTC when the export job was created.
	CreatedAt string `pulumi:"createdAt"`
	// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
	CustomDatas []GetCloudBackupSnapshotExportJobCustomData `pulumi:"customDatas"`
	// Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
	ExportBucketId string `pulumi:"exportBucketId"`
	// Unique identifier of the export job.
	// * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
	ExportJobId                     string `pulumi:"exportJobId"`
	ExportStatusExportedCollections int    `pulumi:"exportStatusExportedCollections"`
	ExportStatusTotalCollections    int    `pulumi:"exportStatusTotalCollections"`
	// Timestamp in ISO 8601 date and time format in UTC when the export job completes.
	FinishedAt string `pulumi:"finishedAt"`
	Id         string `pulumi:"id"`
	Prefix     string `pulumi:"prefix"`
	ProjectId  string `pulumi:"projectId"`
	// Unique identifier of the Cloud Backup snapshot to export.
	SnapshotId string `pulumi:"snapshotId"`
	// Status of the export job. Value can be one of the following:
	// * `Queued` - indicates that the export job is queued
	// * `InProgress` - indicates that the snapshot is being exported
	// * `Successful` - indicates that the export job has completed successfully
	// * `Failed` - indicates that the export job has failed
	State string `pulumi:"state"`
}

func LookupCloudBackupSnapshotExportJobOutput(ctx *pulumi.Context, args LookupCloudBackupSnapshotExportJobOutputArgs, opts ...pulumi.InvokeOption) LookupCloudBackupSnapshotExportJobResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCloudBackupSnapshotExportJobResultOutput, error) {
			args := v.(LookupCloudBackupSnapshotExportJobArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupCloudBackupSnapshotExportJobResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob", args, &rv, "", opts...)
			if err != nil {
				return LookupCloudBackupSnapshotExportJobResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupCloudBackupSnapshotExportJobResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupCloudBackupSnapshotExportJobResultOutput), nil
			}
			return output, nil
		}).(LookupCloudBackupSnapshotExportJobResultOutput)
}

// A collection of arguments for invoking getCloudBackupSnapshotExportJob.
type LookupCloudBackupSnapshotExportJobOutputArgs struct {
	// Name of the Atlas cluster whose export job you want to retrieve.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Unique identifier of the export job to retrieve.
	ExportJobId pulumi.StringInput `pulumi:"exportJobId"`
	// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupCloudBackupSnapshotExportJobOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudBackupSnapshotExportJobArgs)(nil)).Elem()
}

// A collection of values returned by getCloudBackupSnapshotExportJob.
type LookupCloudBackupSnapshotExportJobResultOutput struct{ *pulumi.OutputState }

func (LookupCloudBackupSnapshotExportJobResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudBackupSnapshotExportJobResult)(nil)).Elem()
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) ToLookupCloudBackupSnapshotExportJobResultOutput() LookupCloudBackupSnapshotExportJobResultOutput {
	return o
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) ToLookupCloudBackupSnapshotExportJobResultOutputWithContext(ctx context.Context) LookupCloudBackupSnapshotExportJobResultOutput {
	return o
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
func (o LookupCloudBackupSnapshotExportJobResultOutput) Components() GetCloudBackupSnapshotExportJobComponentArrayOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) []GetCloudBackupSnapshotExportJobComponent {
		return v.Components
	}).(GetCloudBackupSnapshotExportJobComponentArrayOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the export job was created.
func (o LookupCloudBackupSnapshotExportJobResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
func (o LookupCloudBackupSnapshotExportJobResultOutput) CustomDatas() GetCloudBackupSnapshotExportJobCustomDataArrayOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) []GetCloudBackupSnapshotExportJobCustomData {
		return v.CustomDatas
	}).(GetCloudBackupSnapshotExportJobCustomDataArrayOutput)
}

// Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
func (o LookupCloudBackupSnapshotExportJobResultOutput) ExportBucketId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.ExportBucketId }).(pulumi.StringOutput)
}

// Unique identifier of the export job.
// * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
func (o LookupCloudBackupSnapshotExportJobResultOutput) ExportJobId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.ExportJobId }).(pulumi.StringOutput)
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) ExportStatusExportedCollections() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) int { return v.ExportStatusExportedCollections }).(pulumi.IntOutput)
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) ExportStatusTotalCollections() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) int { return v.ExportStatusTotalCollections }).(pulumi.IntOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the export job completes.
func (o LookupCloudBackupSnapshotExportJobResultOutput) FinishedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.FinishedAt }).(pulumi.StringOutput)
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) Prefix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.Prefix }).(pulumi.StringOutput)
}

func (o LookupCloudBackupSnapshotExportJobResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Unique identifier of the Cloud Backup snapshot to export.
func (o LookupCloudBackupSnapshotExportJobResultOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.SnapshotId }).(pulumi.StringOutput)
}

// Status of the export job. Value can be one of the following:
// * `Queued` - indicates that the export job is queued
// * `InProgress` - indicates that the snapshot is being exported
// * `Successful` - indicates that the export job has completed successfully
// * `Failed` - indicates that the export job has failed
func (o LookupCloudBackupSnapshotExportJobResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobResult) string { return v.State }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudBackupSnapshotExportJobResultOutput{})
}
