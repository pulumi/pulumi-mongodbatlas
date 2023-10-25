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
// * `dbName`          -  Name of the database that contains the collection.
// * `collName`        -  Name of the collection.
// * `collectionType`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
// * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
//
// ### Criteria
// * `type`          - Type of criteria (DATE, CUSTOM)
// * `dateField`   - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
// * `dateFormat`   - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
// * `expireAfterDays` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
// * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
//
// ### Schedule
//
// * `type`          - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
// * `startHour`    - Hour of the day when the when the scheduled window to run one online archive starts.
// * `endHour`      - Hour of the day when the scheduled window to run one online archive ends.
// * `startMinute`   - Minute of the hour when the scheduled window to run one online archive starts.
// * `endMinute`     - Minute of the hour when the scheduled window to run one online archive ends.
// * `dayOfMonth`   - Day of the month when the scheduled archive starts.
// * `dayOfWeek`     - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).
//
// ### Partition
// * `fieldName` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
// * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
// * `fieldType` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
func LookupOnlineArchives(ctx *pulumi.Context, args *LookupOnlineArchivesArgs, opts ...pulumi.InvokeOption) (*LookupOnlineArchivesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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
	//
	// # Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
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
	//
	// # Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
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

func (o LookupOnlineArchivesResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupOnlineArchivesResult] {
	return pulumix.Output[LookupOnlineArchivesResult]{
		OutputState: o.OutputState,
	}
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
