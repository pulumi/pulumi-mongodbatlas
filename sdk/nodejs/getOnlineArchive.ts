// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.OnlineArchive` describes an Online Archive
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Attributes reference
 *
 * * `dbName`          -  Name of the database that contains the collection.
 * * `collName`        -  Name of the collection.
 * * `collectionType`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
 * * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
 *
 * ### Criteria
 * * `type`          - Type of criteria (DATE, CUSTOM)
 * * `dateField`   - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
 * * `dateFormat`   - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
 * * `expireAfterDays` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
 * * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
 *
 * ### Schedule
 *
 * * `type`          - Type of schedule. Valid values: `DEFAULT`, `DAILY`, `MONTHLY`, `WEEKLY`.
 * * `startHour`    - Hour of the day when the when the scheduled window to run one online archive starts.
 * * `endHour`      - Hour of the day when the scheduled window to run one online archive ends.
 * * `startMinute`   - Minute of the hour when the scheduled window to run one online archive starts.
 * * `endMinute`     - Minute of the hour when the scheduled window to run one online archive ends.
 * * `dayOfMonth`   - Day of the month when the scheduled archive starts. Set this parameter when `type` is `MONTHLY`.
 * * `dayOfWeek`     - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).Set this parameter when `type` is `WEEKLY`.
 *
 * ### Partition
 * * `fieldName` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
 * * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
 * * `fieldType` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
 *
 * See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-one/) Documentation for more information.
 */
export function getOnlineArchive(args: GetOnlineArchiveArgs, opts?: pulumi.InvokeOptions): Promise<GetOnlineArchiveResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getOnlineArchive:getOnlineArchive", {
        "archiveId": args.archiveId,
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOnlineArchive.
 */
export interface GetOnlineArchiveArgs {
    /**
     * ID of the online archive.
     */
    archiveId: string;
    /**
     * Name of the cluster that contains the collection.
     */
    clusterName: string;
    /**
     * The unique ID for the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getOnlineArchive.
 */
export interface GetOnlineArchiveResult {
    readonly archiveId: string;
    readonly clusterName: string;
    readonly collName: string;
    readonly collectionType: string;
    readonly criterias: outputs.GetOnlineArchiveCriteria[];
    readonly dbName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly partitionFields: outputs.GetOnlineArchivePartitionField[];
    readonly paused: boolean;
    readonly projectId: string;
    readonly schedules: outputs.GetOnlineArchiveSchedule[];
    readonly state: string;
}
/**
 * `mongodbatlas.OnlineArchive` describes an Online Archive
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Attributes reference
 *
 * * `dbName`          -  Name of the database that contains the collection.
 * * `collName`        -  Name of the collection.
 * * `collectionType`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
 * * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
 *
 * ### Criteria
 * * `type`          - Type of criteria (DATE, CUSTOM)
 * * `dateField`   - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
 * * `dateFormat`   - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
 * * `expireAfterDays` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
 * * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.
 *
 * ### Schedule
 *
 * * `type`          - Type of schedule. Valid values: `DEFAULT`, `DAILY`, `MONTHLY`, `WEEKLY`.
 * * `startHour`    - Hour of the day when the when the scheduled window to run one online archive starts.
 * * `endHour`      - Hour of the day when the scheduled window to run one online archive ends.
 * * `startMinute`   - Minute of the hour when the scheduled window to run one online archive starts.
 * * `endMinute`     - Minute of the hour when the scheduled window to run one online archive ends.
 * * `dayOfMonth`   - Day of the month when the scheduled archive starts. Set this parameter when `type` is `MONTHLY`.
 * * `dayOfWeek`     - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).Set this parameter when `type` is `WEEKLY`.
 *
 * ### Partition
 * * `fieldName` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
 * * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
 * * `fieldType` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
 *
 * See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-one/) Documentation for more information.
 */
export function getOnlineArchiveOutput(args: GetOnlineArchiveOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOnlineArchiveResult> {
    return pulumi.output(args).apply((a: any) => getOnlineArchive(a, opts))
}

/**
 * A collection of arguments for invoking getOnlineArchive.
 */
export interface GetOnlineArchiveOutputArgs {
    /**
     * ID of the online archive.
     */
    archiveId: pulumi.Input<string>;
    /**
     * Name of the cluster that contains the collection.
     */
    clusterName: pulumi.Input<string>;
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}
