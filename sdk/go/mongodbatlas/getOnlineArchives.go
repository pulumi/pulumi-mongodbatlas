// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `OnlineArchive` Describes the list of all the online archives for a cluster
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
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
//			_, err := mongodbatlas.LookupOnlineArchives(ctx, &mongodbatlas.LookupOnlineArchivesArgs{
//				ProjectId:   _var.Project_id,
//				ClusterName: _var.Cluster_name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Attributes reference
//
// Each object in the results array represents an online archive with the following attributes:
//
//   - `archiveId`         - ID of the online archive.
//   - `dbName`          -  Name of the database that contains the collection.
//   - `collName`        -  Name of the collection.
//   - `criteria`         -  Criteria to use for archiving data.
//   - `criteria.type`          - Type of criteria (DATE, CUSTOM)
//   - `criteria.date_field`    - Name of an already indexed date field from the documents. Data is archived when the current date is greater than the value of the date field specified here plus the number of days specified via the `expireAfterDays` parameter.
//   - `criteria.date_format`   - the date format. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS
//   - `criteria.expire_after_days` - Number of days that specifies the age limit for the data in the live Atlas cluster.
//   - `criteria.query` - JSON query to use to select documents for archiving. Only for `CUSTOM` type
//   - `partitionFields` -  Fields to use to partition data.
//   - `partition_fields.field_name` - Name of the field. To specify a nested field, use the dot notation.
//   - `partition_fields.order` - Position of the field in the partition. Value can be: 0,1,2
//     By default, the date field specified in the criteria.dateField parameter is in the first position of the partition.
//   - `partitio_fields.field_type` - Type of the partition field
//   - `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
//
// See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-all-for-cluster/) Documentation for more information.
func LookupOnlineArchives(ctx *pulumi.Context, args *LookupOnlineArchivesArgs, opts ...pulumi.InvokeOption) (*LookupOnlineArchivesResult, error) {
	var rv LookupOnlineArchivesResult
	err := ctx.Invoke("mongodbatlas:index/getOnlineArchives:getOnlineArchives", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOnlineArchives.
type LookupOnlineArchivesArgs struct {
	// Name of the cluster that contains the collection.
	ClusterName string `pulumi:"clusterName"`
	// The unique ID for the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getOnlineArchives.
type LookupOnlineArchivesResult struct {
	ClusterName string `pulumi:"clusterName"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	ProjectId  string                    `pulumi:"projectId"`
	Results    []GetOnlineArchivesResult `pulumi:"results"`
	TotalCount int                       `pulumi:"totalCount"`
}

func LookupOnlineArchivesOutput(ctx *pulumi.Context, args LookupOnlineArchivesOutputArgs, opts ...pulumi.InvokeOption) LookupOnlineArchivesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOnlineArchivesResult, error) {
			args := v.(LookupOnlineArchivesArgs)
			r, err := LookupOnlineArchives(ctx, &args, opts...)
			var s LookupOnlineArchivesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOnlineArchivesResultOutput)
}

// A collection of arguments for invoking getOnlineArchives.
type LookupOnlineArchivesOutputArgs struct {
	// Name of the cluster that contains the collection.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// The unique ID for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupOnlineArchivesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOnlineArchivesArgs)(nil)).Elem()
}

// A collection of values returned by getOnlineArchives.
type LookupOnlineArchivesResultOutput struct{ *pulumi.OutputState }

func (LookupOnlineArchivesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOnlineArchivesResult)(nil)).Elem()
}

func (o LookupOnlineArchivesResultOutput) ToLookupOnlineArchivesResultOutput() LookupOnlineArchivesResultOutput {
	return o
}

func (o LookupOnlineArchivesResultOutput) ToLookupOnlineArchivesResultOutputWithContext(ctx context.Context) LookupOnlineArchivesResultOutput {
	return o
}

func (o LookupOnlineArchivesResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchivesResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOnlineArchivesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchivesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupOnlineArchivesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchivesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupOnlineArchivesResultOutput) Results() GetOnlineArchivesResultArrayOutput {
	return o.ApplyT(func(v LookupOnlineArchivesResult) []GetOnlineArchivesResult { return v.Results }).(GetOnlineArchivesResultArrayOutput)
}

func (o LookupOnlineArchivesResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupOnlineArchivesResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOnlineArchivesResultOutput{})
}
