// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
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
 *     projectId: _var.project_id,
 *     clusterName: _var.cluster_name,
 * });
 * ```
 * ## Attributes reference
 *
 * Each object in the results array represents an online archive with the following attributes:
 *
 * * `archiveId`         - ID of the online archive.
 * * `dbName`          -  Name of the database that contains the collection.
 * * `collName`        -  Name of the collection.
 * * `criteria`         -  Criteria to use for archiving data.
 * * `criteria.type`          - Type of criteria (DATE, CUSTOM)
 * * `criteria.date_field`    - Name of an already indexed date field from the documents. Data is archived when the current date is greater than the value of the date field specified here plus the number of days specified via the `expireAfterDays` parameter.
 * * `criteria.date_format`   - the date format. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS
 * * `criteria.expire_after_days` - Number of days that specifies the age limit for the data in the live Atlas cluster.
 * * `criteria.query` - JSON query to use to select documents for archiving. Only for `CUSTOM` type
 * * `partitionFields` -  Fields to use to partition data.
 * * `partition_fields.field_name` - Name of the field. To specify a nested field, use the dot notation.
 * * `partition_fields.order` - Position of the field in the partition. Value can be: 0,1,2
 *   By default, the date field specified in the criteria.dateField parameter is in the first position of the partition.
 * * `partitio_fields.field_type` - Type of the partition field
 * * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
 *
 * See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-all-for-cluster/) Documentation for more information.
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
 *     projectId: _var.project_id,
 *     clusterName: _var.cluster_name,
 * });
 * ```
 * ## Attributes reference
 *
 * Each object in the results array represents an online archive with the following attributes:
 *
 * * `archiveId`         - ID of the online archive.
 * * `dbName`          -  Name of the database that contains the collection.
 * * `collName`        -  Name of the collection.
 * * `criteria`         -  Criteria to use for archiving data.
 * * `criteria.type`          - Type of criteria (DATE, CUSTOM)
 * * `criteria.date_field`    - Name of an already indexed date field from the documents. Data is archived when the current date is greater than the value of the date field specified here plus the number of days specified via the `expireAfterDays` parameter.
 * * `criteria.date_format`   - the date format. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS
 * * `criteria.expire_after_days` - Number of days that specifies the age limit for the data in the live Atlas cluster.
 * * `criteria.query` - JSON query to use to select documents for archiving. Only for `CUSTOM` type
 * * `partitionFields` -  Fields to use to partition data.
 * * `partition_fields.field_name` - Name of the field. To specify a nested field, use the dot notation.
 * * `partition_fields.order` - Position of the field in the partition. Value can be: 0,1,2
 *   By default, the date field specified in the criteria.dateField parameter is in the first position of the partition.
 * * `partitio_fields.field_type` - Type of the partition field
 * * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
 *
 * See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-all-for-cluster/) Documentation for more information.
 */
export function getOnlineArchivesOutput(args: GetOnlineArchivesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOnlineArchivesResult> {
    return pulumi.output(args).apply((a: any) => getOnlineArchives(a, opts))
}

/**
 * A collection of arguments for invoking getOnlineArchives.
 */
export interface GetOnlineArchivesOutputArgs {
    /**
     * Name of the cluster that contains the collection.
     */
    clusterName: pulumi.Input<string>;
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}
