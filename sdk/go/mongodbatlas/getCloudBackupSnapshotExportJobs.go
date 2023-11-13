// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getCloudBackupSnapshotExportJobs` datasource allows you to retrieve all the buckets for the specified project.
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
//			testCloudBackupSnapshotExportBucket, err := mongodbatlas.NewCloudBackupSnapshotExportBucket(ctx, "testCloudBackupSnapshotExportBucket", &mongodbatlas.CloudBackupSnapshotExportBucketArgs{
//				ProjectId:     pulumi.String("{PROJECT_ID}"),
//				IamRoleId:     pulumi.String("{IAM_ROLE_ID}"),
//				BucketName:    pulumi.String("example_bucket"),
//				CloudProvider: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewCloudBackupSnapshotExportJob(ctx, "testCloudBackupSnapshotExportJob", &mongodbatlas.CloudBackupSnapshotExportJobArgs{
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
//			_, err = mongodbatlas.LookupCloudBackupSnapshotExportJobs(ctx, &mongodbatlas.LookupCloudBackupSnapshotExportJobsArgs{
//				ProjectId:   "{PROJECT_ID}",
//				ClusterName: "{CLUSTER_NAME}",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCloudBackupSnapshotExportJobs(ctx *pulumi.Context, args *LookupCloudBackupSnapshotExportJobsArgs, opts ...pulumi.InvokeOption) (*LookupCloudBackupSnapshotExportJobsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudBackupSnapshotExportJobsResult
	err := ctx.Invoke("mongodbatlas:index/getCloudBackupSnapshotExportJobs:getCloudBackupSnapshotExportJobs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudBackupSnapshotExportJobs.
type LookupCloudBackupSnapshotExportJobsArgs struct {
	// Name of the Atlas cluster whose export job you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCloudBackupSnapshotExportJobs.
type LookupCloudBackupSnapshotExportJobsResult struct {
	ClusterName string `pulumi:"clusterName"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
	// Includes CloudProviderSnapshotExportJob object for each item detailed in the results array section.
	Results    []GetCloudBackupSnapshotExportJobsResult `pulumi:"results"`
	TotalCount int                                      `pulumi:"totalCount"`
}

func LookupCloudBackupSnapshotExportJobsOutput(ctx *pulumi.Context, args LookupCloudBackupSnapshotExportJobsOutputArgs, opts ...pulumi.InvokeOption) LookupCloudBackupSnapshotExportJobsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCloudBackupSnapshotExportJobsResult, error) {
			args := v.(LookupCloudBackupSnapshotExportJobsArgs)
			r, err := LookupCloudBackupSnapshotExportJobs(ctx, &args, opts...)
			var s LookupCloudBackupSnapshotExportJobsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCloudBackupSnapshotExportJobsResultOutput)
}

// A collection of arguments for invoking getCloudBackupSnapshotExportJobs.
type LookupCloudBackupSnapshotExportJobsOutputArgs struct {
	// Name of the Atlas cluster whose export job you want to retrieve.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupCloudBackupSnapshotExportJobsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudBackupSnapshotExportJobsArgs)(nil)).Elem()
}

// A collection of values returned by getCloudBackupSnapshotExportJobs.
type LookupCloudBackupSnapshotExportJobsResultOutput struct{ *pulumi.OutputState }

func (LookupCloudBackupSnapshotExportJobsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudBackupSnapshotExportJobsResult)(nil)).Elem()
}

func (o LookupCloudBackupSnapshotExportJobsResultOutput) ToLookupCloudBackupSnapshotExportJobsResultOutput() LookupCloudBackupSnapshotExportJobsResultOutput {
	return o
}

func (o LookupCloudBackupSnapshotExportJobsResultOutput) ToLookupCloudBackupSnapshotExportJobsResultOutputWithContext(ctx context.Context) LookupCloudBackupSnapshotExportJobsResultOutput {
	return o
}

func (o LookupCloudBackupSnapshotExportJobsResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCloudBackupSnapshotExportJobsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCloudBackupSnapshotExportJobsResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupCloudBackupSnapshotExportJobsResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

// The unique identifier of the project for the Atlas cluster.
func (o LookupCloudBackupSnapshotExportJobsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Includes CloudProviderSnapshotExportJob object for each item detailed in the results array section.
func (o LookupCloudBackupSnapshotExportJobsResultOutput) Results() GetCloudBackupSnapshotExportJobsResultArrayOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) []GetCloudBackupSnapshotExportJobsResult {
		return v.Results
	}).(GetCloudBackupSnapshotExportJobsResultArrayOutput)
}

func (o LookupCloudBackupSnapshotExportJobsResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudBackupSnapshotExportJobsResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudBackupSnapshotExportJobsResultOutput{})
}
