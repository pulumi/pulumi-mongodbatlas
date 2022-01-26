// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Cloud Backup Schedule entries can be imported using project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule test 5d0f1f73cf09a29120e173cf-MyClusterTest
 * ```
 *
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)
 */
export class CloudBackupSchedule extends pulumi.CustomResource {
    /**
     * Get an existing CloudBackupSchedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudBackupScheduleState, opts?: pulumi.CustomResourceOptions): CloudBackupSchedule {
        return new CloudBackupSchedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule';

    /**
     * Returns true if the given object is an instance of CloudBackupSchedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudBackupSchedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudBackupSchedule.__pulumiType;
    }

    /**
     * Unique identifier of the Atlas cluster.
     */
    public /*out*/ readonly clusterId!: pulumi.Output<string>;
    /**
     * The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Unique identifier of the backup policy.
     */
    public /*out*/ readonly idPolicy!: pulumi.Output<string>;
    /**
     * Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
     */
    public /*out*/ readonly nextSnapshot!: pulumi.Output<string>;
    /**
     * Daily policy item
     */
    public readonly policyItemDaily!: pulumi.Output<outputs.CloudBackupSchedulePolicyItemDaily | undefined>;
    /**
     * Hourly policy item
     */
    public readonly policyItemHourly!: pulumi.Output<outputs.CloudBackupSchedulePolicyItemHourly | undefined>;
    /**
     * Monthly policy item
     */
    public readonly policyItemMonthly!: pulumi.Output<outputs.CloudBackupSchedulePolicyItemMonthly | undefined>;
    /**
     * Weekly policy item
     */
    public readonly policyItemWeekly!: pulumi.Output<outputs.CloudBackupSchedulePolicyItemWeekly | undefined>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
     */
    public readonly referenceHourOfDay!: pulumi.Output<number>;
    /**
     * UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
     */
    public readonly referenceMinuteOfHour!: pulumi.Output<number>;
    /**
     * Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
     */
    public readonly restoreWindowDays!: pulumi.Output<number>;
    /**
     * Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
     */
    public readonly updateSnapshots!: pulumi.Output<boolean>;

    /**
     * Create a CloudBackupSchedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudBackupScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudBackupScheduleArgs | CloudBackupScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudBackupScheduleState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["idPolicy"] = state ? state.idPolicy : undefined;
            resourceInputs["nextSnapshot"] = state ? state.nextSnapshot : undefined;
            resourceInputs["policyItemDaily"] = state ? state.policyItemDaily : undefined;
            resourceInputs["policyItemHourly"] = state ? state.policyItemHourly : undefined;
            resourceInputs["policyItemMonthly"] = state ? state.policyItemMonthly : undefined;
            resourceInputs["policyItemWeekly"] = state ? state.policyItemWeekly : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["referenceHourOfDay"] = state ? state.referenceHourOfDay : undefined;
            resourceInputs["referenceMinuteOfHour"] = state ? state.referenceMinuteOfHour : undefined;
            resourceInputs["restoreWindowDays"] = state ? state.restoreWindowDays : undefined;
            resourceInputs["updateSnapshots"] = state ? state.updateSnapshots : undefined;
        } else {
            const args = argsOrState as CloudBackupScheduleArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["policyItemDaily"] = args ? args.policyItemDaily : undefined;
            resourceInputs["policyItemHourly"] = args ? args.policyItemHourly : undefined;
            resourceInputs["policyItemMonthly"] = args ? args.policyItemMonthly : undefined;
            resourceInputs["policyItemWeekly"] = args ? args.policyItemWeekly : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["referenceHourOfDay"] = args ? args.referenceHourOfDay : undefined;
            resourceInputs["referenceMinuteOfHour"] = args ? args.referenceMinuteOfHour : undefined;
            resourceInputs["restoreWindowDays"] = args ? args.restoreWindowDays : undefined;
            resourceInputs["updateSnapshots"] = args ? args.updateSnapshots : undefined;
            resourceInputs["clusterId"] = undefined /*out*/;
            resourceInputs["idPolicy"] = undefined /*out*/;
            resourceInputs["nextSnapshot"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CloudBackupSchedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudBackupSchedule resources.
 */
export interface CloudBackupScheduleState {
    /**
     * Unique identifier of the Atlas cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Unique identifier of the backup policy.
     */
    idPolicy?: pulumi.Input<string>;
    /**
     * Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
     */
    nextSnapshot?: pulumi.Input<string>;
    /**
     * Daily policy item
     */
    policyItemDaily?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemDaily>;
    /**
     * Hourly policy item
     */
    policyItemHourly?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemHourly>;
    /**
     * Monthly policy item
     */
    policyItemMonthly?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemMonthly>;
    /**
     * Weekly policy item
     */
    policyItemWeekly?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemWeekly>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId?: pulumi.Input<string>;
    /**
     * UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
     */
    referenceHourOfDay?: pulumi.Input<number>;
    /**
     * UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
     */
    referenceMinuteOfHour?: pulumi.Input<number>;
    /**
     * Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
     */
    restoreWindowDays?: pulumi.Input<number>;
    /**
     * Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
     */
    updateSnapshots?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a CloudBackupSchedule resource.
 */
export interface CloudBackupScheduleArgs {
    /**
     * The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Daily policy item
     */
    policyItemDaily?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemDaily>;
    /**
     * Hourly policy item
     */
    policyItemHourly?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemHourly>;
    /**
     * Monthly policy item
     */
    policyItemMonthly?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemMonthly>;
    /**
     * Weekly policy item
     */
    policyItemWeekly?: pulumi.Input<inputs.CloudBackupSchedulePolicyItemWeekly>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
    /**
     * UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
     */
    referenceHourOfDay?: pulumi.Input<number>;
    /**
     * UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
     */
    referenceMinuteOfHour?: pulumi.Input<number>;
    /**
     * Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
     */
    restoreWindowDays?: pulumi.Input<number>;
    /**
     * Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
     */
    updateSnapshots?: pulumi.Input<boolean>;
}