// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getCloudBackupSnapshotRestoreJobs
//
// `getCloudBackupSnapshotRestoreJobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// First create a snapshot of the desired cluster. Then request that snapshot be restored in an automated fashion to the designated cluster and project.
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
//			testCloudBackupSnapshot, err := mongodbatlas.NewCloudBackupSnapshot(ctx, "test", &mongodbatlas.CloudBackupSnapshotArgs{
//				ProjectId:       pulumi.String("5cf5a45a9ccf6400e60981b6"),
//				ClusterName:     pulumi.String("MyCluster"),
//				Description:     pulumi.String("MyDescription"),
//				RetentionInDays: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			testCloudBackupSnapshotRestoreJob, err := mongodbatlas.NewCloudBackupSnapshotRestoreJob(ctx, "test", &mongodbatlas.CloudBackupSnapshotRestoreJobArgs{
//				ProjectId:   pulumi.String("5cf5a45a9ccf6400e60981b6"),
//				ClusterName: pulumi.String("MyCluster"),
//				SnapshotId:  testCloudBackupSnapshot.ID(),
//				DeliveryTypeConfig: &mongodbatlas.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs{
//					Automated:         pulumi.Bool(true),
//					TargetClusterName: pulumi.String("MyCluster"),
//					TargetProjectId:   pulumi.String("5cf5a45a9ccf6400e60981b6"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = pulumi.All(testCloudBackupSnapshotRestoreJob.ProjectId, testCloudBackupSnapshotRestoreJob.ClusterName).ApplyT(func(_args []interface{}) (mongodbatlas.GetCloudBackupSnapshotRestoreJobsResult, error) {
//				projectId := _args[0].(string)
//				clusterName := _args[1].(string)
//				return mongodbatlas.GetCloudBackupSnapshotRestoreJobsResult(interface{}(mongodbatlas.LookupCloudBackupSnapshotRestoreJobsOutput(ctx, mongodbatlas.GetCloudBackupSnapshotRestoreJobsOutputArgs{
//					ProjectId:    projectId,
//					ClusterName:  clusterName,
//					PageNum:      1,
//					ItemsPerPage: 5,
//				}, nil))), nil
//			}).(mongodbatlas.GetCloudBackupSnapshotRestoreJobsResultOutput)
//			return nil
//		})
//	}
//
// ```
func LookupCloudBackupSnapshotRestoreJobs(ctx *pulumi.Context, args *LookupCloudBackupSnapshotRestoreJobsArgs, opts ...pulumi.InvokeOption) (*LookupCloudBackupSnapshotRestoreJobsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudBackupSnapshotRestoreJobsResult
	err := ctx.Invoke("mongodbatlas:index/getCloudBackupSnapshotRestoreJobs:getCloudBackupSnapshotRestoreJobs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudBackupSnapshotRestoreJobs.
type LookupCloudBackupSnapshotRestoreJobsArgs struct {
	// The name of the Atlas cluster for which you want to retrieve restore jobs.
	ClusterName string `pulumi:"clusterName"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCloudBackupSnapshotRestoreJobs.
type LookupCloudBackupSnapshotRestoreJobsResult struct {
	ClusterName string `pulumi:"clusterName"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	ProjectId    string `pulumi:"projectId"`
	// Includes cloudProviderSnapshotRestoreJob object for each item detailed in the results array section.
	// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
	Results    []GetCloudBackupSnapshotRestoreJobsResult `pulumi:"results"`
	TotalCount int                                       `pulumi:"totalCount"`
}

func LookupCloudBackupSnapshotRestoreJobsOutput(ctx *pulumi.Context, args LookupCloudBackupSnapshotRestoreJobsOutputArgs, opts ...pulumi.InvokeOption) LookupCloudBackupSnapshotRestoreJobsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCloudBackupSnapshotRestoreJobsResultOutput, error) {
			args := v.(LookupCloudBackupSnapshotRestoreJobsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getCloudBackupSnapshotRestoreJobs:getCloudBackupSnapshotRestoreJobs", args, LookupCloudBackupSnapshotRestoreJobsResultOutput{}, options).(LookupCloudBackupSnapshotRestoreJobsResultOutput), nil
		}).(LookupCloudBackupSnapshotRestoreJobsResultOutput)
}

// A collection of arguments for invoking getCloudBackupSnapshotRestoreJobs.
type LookupCloudBackupSnapshotRestoreJobsOutputArgs struct {
	// The name of the Atlas cluster for which you want to retrieve restore jobs.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupCloudBackupSnapshotRestoreJobsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudBackupSnapshotRestoreJobsArgs)(nil)).Elem()
}

// A collection of values returned by getCloudBackupSnapshotRestoreJobs.
type LookupCloudBackupSnapshotRestoreJobsResultOutput struct{ *pulumi.OutputState }

func (LookupCloudBackupSnapshotRestoreJobsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudBackupSnapshotRestoreJobsResult)(nil)).Elem()
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) ToLookupCloudBackupSnapshotRestoreJobsResultOutput() LookupCloudBackupSnapshotRestoreJobsResultOutput {
	return o
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) ToLookupCloudBackupSnapshotRestoreJobsResultOutputWithContext(ctx context.Context) LookupCloudBackupSnapshotRestoreJobsResultOutput {
	return o
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Includes cloudProviderSnapshotRestoreJob object for each item detailed in the results array section.
// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) Results() GetCloudBackupSnapshotRestoreJobsResultArrayOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) []GetCloudBackupSnapshotRestoreJobsResult {
		return v.Results
	}).(GetCloudBackupSnapshotRestoreJobsResultArrayOutput)
}

func (o LookupCloudBackupSnapshotRestoreJobsResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotRestoreJobsResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudBackupSnapshotRestoreJobsResultOutput{})
}
