// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.OnlineArchive
 *
 * `mongodbatlas.OnlineArchive` Describes the list of all the online archives for a cluster
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOnlineArchives({
 *     projectId: projectId,
 *     clusterName: clusterName,
 * });
 * ```
 *
 * ## Attributes reference
 *
 * * `dbName` - Name of the database that contains the collection.
 * * `collName` -  Name of the collection.
 * * `collectionType` - Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
 * * `criteria` - Criteria to use for archiving data. See criteria.
 * * `dataExpirationRule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
 * * `dataProcessRegion` - Settings to configure the region where you wish to store your archived data. See data process region.
 * * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
 * * `partitionFields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
 * * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
 * * `state` - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
 *
 * ### Criteria
 * * `type` - Type of criteria (DATE, CUSTOM)
 * * `dateField` - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
 * * `dateFormat` - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
 * * `expireAfterDays` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
 * * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
 *
 * ### Data Expiration Rule
 * * `expireAfterDays` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.
 *
 * ### Data Process Region
 * * `cloudProvider` - Human-readable label that identifies the Cloud service provider where you wish to store your archived data.
 * * `region` - Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
 *
 * ### Schedule
 *
 * * `type` - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
 * * `startHour` - Hour of the day when the when the scheduled window to run one online archive starts.
 * * `endHour` - Hour of the day when the scheduled window to run one online archive ends.
 * * `startMinute` - Minute of the hour when the scheduled window to run one online archive starts.
 * * `endMinute` - Minute of the hour when the scheduled window to run one online archive ends.
 * * `dayOfMonth` - Day of the month when the scheduled archive starts.
 * * `dayOfWeek` - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).
 *
 * ### Partition
 * * `fieldName` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
 * * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
 * * `fieldType` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
 */
export function getOnlineArchives(args: GetOnlineArchivesArgs, opts?: pulumi.InvokeOptions): Promise<GetOnlineArchivesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getOnlineArchives:getOnlineArchives", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOnlineArchives.
 */
export interface GetOnlineArchivesArgs {
    /**
     * Name of the cluster that contains the collection.
     *
     * # Attributes Reference
     *
     * In addition to all arguments above, the following attributes are exported:
     */
    clusterName: string;
    /**
     * The unique ID for the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getOnlineArchives.
 */
export interface GetOnlineArchivesResult {
    readonly clusterName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    readonly results: outputs.GetOnlineArchivesResult[];
    readonly totalCount: number;
}
/**
 * ## # Data Source: mongodbatlas.OnlineArchive
 *
 * `mongodbatlas.OnlineArchive` Describes the list of all the online archives for a cluster
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOnlineArchives({
 *     projectId: projectId,
 *     clusterName: clusterName,
 * });
 * ```
 *
 * ## Attributes reference
 *
 * * `dbName` - Name of the database that contains the collection.
 * * `collName` -  Name of the collection.
 * * `collectionType` - Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
 * * `criteria` - Criteria to use for archiving data. See criteria.
 * * `dataExpirationRule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
 * * `dataProcessRegion` - Settings to configure the region where you wish to store your archived data. See data process region.
 * * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
 * * `partitionFields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
 * * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
 * * `state` - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
 *
 * ### Criteria
 * * `type` - Type of criteria (DATE, CUSTOM)
 * * `dateField` - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
 * * `dateFormat` - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
 * * `expireAfterDays` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
 * * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
 *
 * ### Data Expiration Rule
 * * `expireAfterDays` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.
 *
 * ### Data Process Region
 * * `cloudProvider` - Human-readable label that identifies the Cloud service provider where you wish to store your archived data.
 * * `region` - Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
 *
 * ### Schedule
 *
 * * `type` - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
 * * `startHour` - Hour of the day when the when the scheduled window to run one online archive starts.
 * * `endHour` - Hour of the day when the scheduled window to run one online archive ends.
 * * `startMinute` - Minute of the hour when the scheduled window to run one online archive starts.
 * * `endMinute` - Minute of the hour when the scheduled window to run one online archive ends.
 * * `dayOfMonth` - Day of the month when the scheduled archive starts.
 * * `dayOfWeek` - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).
 *
 * ### Partition
 * * `fieldName` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
 * * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
 * * `fieldType` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
 */
export function getOnlineArchivesOutput(args: GetOnlineArchivesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOnlineArchivesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getOnlineArchives:getOnlineArchives", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOnlineArchives.
 */
export interface GetOnlineArchivesOutputArgs {
    /**
     * Name of the cluster that contains the collection.
     *
     * # Attributes Reference
     *
     * In addition to all arguments above, the following attributes are exported:
     */
    clusterName: pulumi.Input<string>;
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}
