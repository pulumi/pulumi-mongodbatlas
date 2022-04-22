// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.OnlineArchive` resource provides access to create, edit, pause and resume an online archive for a collection.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** The collection must exists before performing an online archive.
 *
 * > **IMPORTANT:** There are fields that are immutable after creation, i.e if `dateField` value does not exist in the collection, the online archive state will be pending forever, and this field cannot be updated, that means a destroy is required, known error `ONLINE_ARCHIVE_CANNOT_MODIFY_FIELD`
 *
 * ## Example Usage
 */
export class OnlineArchive extends pulumi.CustomResource {
    /**
     * Get an existing OnlineArchive resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OnlineArchiveState, opts?: pulumi.CustomResourceOptions): OnlineArchive {
        return new OnlineArchive(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/onlineArchive:OnlineArchive';

    /**
     * Returns true if the given object is an instance of OnlineArchive.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OnlineArchive {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OnlineArchive.__pulumiType;
    }

    /**
     * ID of the online archive.
     */
    public /*out*/ readonly archiveId!: pulumi.Output<string>;
    /**
     * Name of the cluster that contains the collection.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Name of the collection.
     */
    public readonly collName!: pulumi.Output<string>;
    /**
     * Criteria to use for archiving data.
     */
    public readonly criteria!: pulumi.Output<outputs.OnlineArchiveCriteria>;
    /**
     * Name of the database that contains the collection.
     */
    public readonly dbName!: pulumi.Output<string>;
    /**
     * Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Note that queries that don’t contain the specified fields will require a full collection scan of all archived documents, which will take longer and increase your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived.
     */
    public readonly partitionFields!: pulumi.Output<outputs.OnlineArchivePartitionField[]>;
    /**
     * State of the online archive. This is required for pausing an active or resume a paused online archive. The resume request will fail if the collection has another active online archive.
     */
    public readonly paused!: pulumi.Output<boolean>;
    /**
     * The unique ID for the project
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    public readonly syncCreation!: pulumi.Output<boolean | undefined>;

    /**
     * Create a OnlineArchive resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OnlineArchiveArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OnlineArchiveArgs | OnlineArchiveState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OnlineArchiveState | undefined;
            resourceInputs["archiveId"] = state ? state.archiveId : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["collName"] = state ? state.collName : undefined;
            resourceInputs["criteria"] = state ? state.criteria : undefined;
            resourceInputs["dbName"] = state ? state.dbName : undefined;
            resourceInputs["partitionFields"] = state ? state.partitionFields : undefined;
            resourceInputs["paused"] = state ? state.paused : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["syncCreation"] = state ? state.syncCreation : undefined;
        } else {
            const args = argsOrState as OnlineArchiveArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.collName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collName'");
            }
            if ((!args || args.criteria === undefined) && !opts.urn) {
                throw new Error("Missing required property 'criteria'");
            }
            if ((!args || args.dbName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["collName"] = args ? args.collName : undefined;
            resourceInputs["criteria"] = args ? args.criteria : undefined;
            resourceInputs["dbName"] = args ? args.dbName : undefined;
            resourceInputs["partitionFields"] = args ? args.partitionFields : undefined;
            resourceInputs["paused"] = args ? args.paused : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["syncCreation"] = args ? args.syncCreation : undefined;
            resourceInputs["archiveId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OnlineArchive.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OnlineArchive resources.
 */
export interface OnlineArchiveState {
    /**
     * ID of the online archive.
     */
    archiveId?: pulumi.Input<string>;
    /**
     * Name of the cluster that contains the collection.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Name of the collection.
     */
    collName?: pulumi.Input<string>;
    /**
     * Criteria to use for archiving data.
     */
    criteria?: pulumi.Input<inputs.OnlineArchiveCriteria>;
    /**
     * Name of the database that contains the collection.
     */
    dbName?: pulumi.Input<string>;
    /**
     * Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Note that queries that don’t contain the specified fields will require a full collection scan of all archived documents, which will take longer and increase your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived.
     */
    partitionFields?: pulumi.Input<pulumi.Input<inputs.OnlineArchivePartitionField>[]>;
    /**
     * State of the online archive. This is required for pausing an active or resume a paused online archive. The resume request will fail if the collection has another active online archive.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * The unique ID for the project
     */
    projectId?: pulumi.Input<string>;
    /**
     * Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
     */
    state?: pulumi.Input<string>;
    syncCreation?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a OnlineArchive resource.
 */
export interface OnlineArchiveArgs {
    /**
     * Name of the cluster that contains the collection.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Name of the collection.
     */
    collName: pulumi.Input<string>;
    /**
     * Criteria to use for archiving data.
     */
    criteria: pulumi.Input<inputs.OnlineArchiveCriteria>;
    /**
     * Name of the database that contains the collection.
     */
    dbName: pulumi.Input<string>;
    /**
     * Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Note that queries that don’t contain the specified fields will require a full collection scan of all archived documents, which will take longer and increase your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived.
     */
    partitionFields?: pulumi.Input<pulumi.Input<inputs.OnlineArchivePartitionField>[]>;
    /**
     * State of the online archive. This is required for pausing an active or resume a paused online archive. The resume request will fail if the collection has another active online archive.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * The unique ID for the project
     */
    projectId: pulumi.Input<string>;
    syncCreation?: pulumi.Input<boolean>;
}
