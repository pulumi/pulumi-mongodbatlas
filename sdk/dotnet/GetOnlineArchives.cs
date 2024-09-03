// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetOnlineArchives
    {
        /// <summary>
        /// # Data Source: mongodbatlas.OnlineArchive
        /// 
        /// `mongodbatlas.OnlineArchive` Describes the list of all the online archives for a cluster
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetOnlineArchives.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         ClusterName = clusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// * `db_name` - Name of the database that contains the collection.
        /// * `coll_name` -  Name of the collection.
        /// * `collection_type` - Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
        /// * `criteria` - Criteria to use for archiving data. See criteria.
        /// * `data_expiration_rule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
        /// * `data_process_region` - Settings to configure the region where you wish to store your archived data. See data process region.
        /// * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
        /// * `partition_fields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
        /// * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
        /// * `state` - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
        /// 
        /// ### Criteria
        /// * `type` - Type of criteria (DATE, CUSTOM)
        /// * `date_field` - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
        /// * `date_format` - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
        /// * `expire_after_days` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
        /// * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
        /// 
        /// ### Data Expiration Rule
        /// * `expire_after_days` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.
        /// 
        /// ### Data Process Region
        /// * `cloud_provider` - Human-readable label that identifies the Cloud service provider where you wish to store your archived data.
        /// * `region` - Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
        /// 
        /// ### Schedule
        /// 
        /// * `type` - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
        /// * `start_hour` - Hour of the day when the when the scheduled window to run one online archive starts.
        /// * `end_hour` - Hour of the day when the scheduled window to run one online archive ends.
        /// * `start_minute` - Minute of the hour when the scheduled window to run one online archive starts.
        /// * `end_minute` - Minute of the hour when the scheduled window to run one online archive ends.
        /// * `day_of_month` - Day of the month when the scheduled archive starts.
        /// * `day_of_week` - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).
        /// 
        /// ### Partition
        /// * `field_name` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
        /// * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
        /// * `field_type` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
        /// </summary>
        public static Task<GetOnlineArchivesResult> InvokeAsync(GetOnlineArchivesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOnlineArchivesResult>("mongodbatlas:index/getOnlineArchives:getOnlineArchives", args ?? new GetOnlineArchivesArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.OnlineArchive
        /// 
        /// `mongodbatlas.OnlineArchive` Describes the list of all the online archives for a cluster
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetOnlineArchives.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         ClusterName = clusterName,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// * `db_name` - Name of the database that contains the collection.
        /// * `coll_name` -  Name of the collection.
        /// * `collection_type` - Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
        /// * `criteria` - Criteria to use for archiving data. See criteria.
        /// * `data_expiration_rule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
        /// * `data_process_region` - Settings to configure the region where you wish to store your archived data. See data process region.
        /// * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
        /// * `partition_fields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
        /// * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
        /// * `state` - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
        /// 
        /// ### Criteria
        /// * `type` - Type of criteria (DATE, CUSTOM)
        /// * `date_field` - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
        /// * `date_format` - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
        /// * `expire_after_days` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
        /// * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
        /// 
        /// ### Data Expiration Rule
        /// * `expire_after_days` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.
        /// 
        /// ### Data Process Region
        /// * `cloud_provider` - Human-readable label that identifies the Cloud service provider where you wish to store your archived data.
        /// * `region` - Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
        /// 
        /// ### Schedule
        /// 
        /// * `type` - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
        /// * `start_hour` - Hour of the day when the when the scheduled window to run one online archive starts.
        /// * `end_hour` - Hour of the day when the scheduled window to run one online archive ends.
        /// * `start_minute` - Minute of the hour when the scheduled window to run one online archive starts.
        /// * `end_minute` - Minute of the hour when the scheduled window to run one online archive ends.
        /// * `day_of_month` - Day of the month when the scheduled archive starts.
        /// * `day_of_week` - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).
        /// 
        /// ### Partition
        /// * `field_name` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
        /// * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
        /// * `field_type` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
        /// </summary>
        public static Output<GetOnlineArchivesResult> Invoke(GetOnlineArchivesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOnlineArchivesResult>("mongodbatlas:index/getOnlineArchives:getOnlineArchives", args ?? new GetOnlineArchivesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOnlineArchivesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster that contains the collection.
        /// 
        /// # Attributes Reference
        /// 
        /// In addition to all arguments above, the following attributes are exported:
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetOnlineArchivesArgs()
        {
        }
        public static new GetOnlineArchivesArgs Empty => new GetOnlineArchivesArgs();
    }

    public sealed class GetOnlineArchivesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster that contains the collection.
        /// 
        /// # Attributes Reference
        /// 
        /// In addition to all arguments above, the following attributes are exported:
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetOnlineArchivesInvokeArgs()
        {
        }
        public static new GetOnlineArchivesInvokeArgs Empty => new GetOnlineArchivesInvokeArgs();
    }


    [OutputType]
    public sealed class GetOnlineArchivesResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        public readonly ImmutableArray<Outputs.GetOnlineArchivesResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetOnlineArchivesResult(
            string clusterName,

            string id,

            string projectId,

            ImmutableArray<Outputs.GetOnlineArchivesResultResult> results,

            int totalCount)
        {
            ClusterName = clusterName;
            Id = id;
            ProjectId = projectId;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
