// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `OnlineArchive` describes an Online Archive
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
//			_, err := mongodbatlas.LookupOnlineArchive(ctx, &mongodbatlas.LookupOnlineArchiveArgs{
//				ProjectId:   _var.Project_id,
//				ClusterName: _var.Cluster_name,
//				ArchiveId:   "5ebad3c1fe9c0ab8d37d61e1",
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
// * `collectionType`  -  Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
// * `criteria` - Criteria to use for archiving data. See criteria.
// * `dataExpirationRule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
// * `dataProcessRegion` - Settings to configure the region where you wish to store your archived data. See data process region.
// * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
// * `partitionFields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
// * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
// * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
//
// ### Criteria
// * `type`          - Type of criteria (DATE, CUSTOM)
// * `dateField`   - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
// * `dateFormat`   - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
// * `expireAfterDays` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
// * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
//
// ### Data Expiration Rule
// * `expireAfterDays` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.
//
// ### Data Process Region
// * `cloudProvider` - Human-readable label that identifies the Cloud service provider where you wish to store your archived data.
// * `region` - Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
//
// ### Schedule
//
// * `type`          - Type of schedule. Valid values: `DEFAULT`, `DAILY`, `MONTHLY`, `WEEKLY`.
// * `startHour`    - Hour of the day when the when the scheduled window to run one online archive starts.
// * `endHour`      - Hour of the day when the scheduled window to run one online archive ends.
// * `startMinute`   - Minute of the hour when the scheduled window to run one online archive starts.
// * `endMinute`     - Minute of the hour when the scheduled window to run one online archive ends.
// * `dayOfMonth`   - Day of the month when the scheduled archive starts. Set this parameter when `type` is `MONTHLY`.
// * `dayOfWeek`     - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).Set this parameter when `type` is `WEEKLY`.
//
// ### Partition
// * `fieldName` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
// * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
// * `fieldType` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
//
// See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-one/) Documentation for more information.
func LookupOnlineArchive(ctx *pulumi.Context, args *LookupOnlineArchiveArgs, opts ...pulumi.InvokeOption) (*LookupOnlineArchiveResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOnlineArchiveResult
	err := ctx.Invoke("mongodbatlas:index/getOnlineArchive:getOnlineArchive", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOnlineArchive.
type LookupOnlineArchiveArgs struct {
	// ID of the online archive.
	ArchiveId string `pulumi:"archiveId"`
	// Name of the cluster that contains the collection.
	ClusterName string `pulumi:"clusterName"`
	// The unique ID for the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getOnlineArchive.
type LookupOnlineArchiveResult struct {
	ArchiveId           string                               `pulumi:"archiveId"`
	ClusterName         string                               `pulumi:"clusterName"`
	CollName            string                               `pulumi:"collName"`
	CollectionType      string                               `pulumi:"collectionType"`
	Criterias           []GetOnlineArchiveCriteria           `pulumi:"criterias"`
	DataExpirationRules []GetOnlineArchiveDataExpirationRule `pulumi:"dataExpirationRules"`
	DataProcessRegions  []GetOnlineArchiveDataProcessRegion  `pulumi:"dataProcessRegions"`
	DbName              string                               `pulumi:"dbName"`
	// The provider-assigned unique ID for this managed resource.
	Id              string                           `pulumi:"id"`
	PartitionFields []GetOnlineArchivePartitionField `pulumi:"partitionFields"`
	Paused          bool                             `pulumi:"paused"`
	ProjectId       string                           `pulumi:"projectId"`
	Schedules       []GetOnlineArchiveSchedule       `pulumi:"schedules"`
	State           string                           `pulumi:"state"`
}

func LookupOnlineArchiveOutput(ctx *pulumi.Context, args LookupOnlineArchiveOutputArgs, opts ...pulumi.InvokeOption) LookupOnlineArchiveResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOnlineArchiveResult, error) {
			args := v.(LookupOnlineArchiveArgs)
			r, err := LookupOnlineArchive(ctx, &args, opts...)
			var s LookupOnlineArchiveResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOnlineArchiveResultOutput)
}

// A collection of arguments for invoking getOnlineArchive.
type LookupOnlineArchiveOutputArgs struct {
	// ID of the online archive.
	ArchiveId pulumi.StringInput `pulumi:"archiveId"`
	// Name of the cluster that contains the collection.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// The unique ID for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupOnlineArchiveOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOnlineArchiveArgs)(nil)).Elem()
}

// A collection of values returned by getOnlineArchive.
type LookupOnlineArchiveResultOutput struct{ *pulumi.OutputState }

func (LookupOnlineArchiveResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOnlineArchiveResult)(nil)).Elem()
}

func (o LookupOnlineArchiveResultOutput) ToLookupOnlineArchiveResultOutput() LookupOnlineArchiveResultOutput {
	return o
}

func (o LookupOnlineArchiveResultOutput) ToLookupOnlineArchiveResultOutputWithContext(ctx context.Context) LookupOnlineArchiveResultOutput {
	return o
}

func (o LookupOnlineArchiveResultOutput) ArchiveId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.ArchiveId }).(pulumi.StringOutput)
}

func (o LookupOnlineArchiveResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

func (o LookupOnlineArchiveResultOutput) CollName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.CollName }).(pulumi.StringOutput)
}

func (o LookupOnlineArchiveResultOutput) CollectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.CollectionType }).(pulumi.StringOutput)
}

func (o LookupOnlineArchiveResultOutput) Criterias() GetOnlineArchiveCriteriaArrayOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) []GetOnlineArchiveCriteria { return v.Criterias }).(GetOnlineArchiveCriteriaArrayOutput)
}

func (o LookupOnlineArchiveResultOutput) DataExpirationRules() GetOnlineArchiveDataExpirationRuleArrayOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) []GetOnlineArchiveDataExpirationRule { return v.DataExpirationRules }).(GetOnlineArchiveDataExpirationRuleArrayOutput)
}

func (o LookupOnlineArchiveResultOutput) DataProcessRegions() GetOnlineArchiveDataProcessRegionArrayOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) []GetOnlineArchiveDataProcessRegion { return v.DataProcessRegions }).(GetOnlineArchiveDataProcessRegionArrayOutput)
}

func (o LookupOnlineArchiveResultOutput) DbName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.DbName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOnlineArchiveResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupOnlineArchiveResultOutput) PartitionFields() GetOnlineArchivePartitionFieldArrayOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) []GetOnlineArchivePartitionField { return v.PartitionFields }).(GetOnlineArchivePartitionFieldArrayOutput)
}

func (o LookupOnlineArchiveResultOutput) Paused() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) bool { return v.Paused }).(pulumi.BoolOutput)
}

func (o LookupOnlineArchiveResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupOnlineArchiveResultOutput) Schedules() GetOnlineArchiveScheduleArrayOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) []GetOnlineArchiveSchedule { return v.Schedules }).(GetOnlineArchiveScheduleArrayOutput)
}

func (o LookupOnlineArchiveResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOnlineArchiveResult) string { return v.State }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOnlineArchiveResultOutput{})
}
