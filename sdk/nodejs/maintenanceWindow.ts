// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.MaintenanceWindow` provides a resource to schedule a maintenance window for your MongoDB Atlas Project and/or set to defer a scheduled maintenance up to two times.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Maintenance Window Considerations:
 *
 * - Urgent Maintenance Activities Cannot Wait: Urgent maintenance activities such as security patches cannot wait for your chosen window. Atlas will start those maintenance activities when needed.
 *
 * Once maintenance is scheduled for your cluster, you cannot change your maintenance window until the current maintenance efforts have completed.
 * - Maintenance Requires Replica Set Elections: Atlas performs maintenance the same way as the manual maintenance procedure. This requires at least one replica set election during the maintenance window per replica set.
 * - Maintenance Starts As Close to the Hour As Possible: Maintenance always begins as close to the scheduled hour as possible, but in-progress cluster updates or expected system issues could delay the start time.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.MaintenanceWindow("test", {
 *     dayOfWeek: 3,
 *     hourOfDay: 4,
 *     projectId: "<your-project-id>",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.MaintenanceWindow("test", {
 *     defer: true,
 *     projectId: "<your-project-id>",
 * });
 * ```
 *
 * ## Import
 *
 * Maintenance Window entries can be imported using project project_id, in the format `PROJECTID`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/maintenanceWindow:MaintenanceWindow test 5d0f1f73cf09a29120e173cf
 * ```
 *  For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)
 */
export class MaintenanceWindow extends pulumi.CustomResource {
    /**
     * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MaintenanceWindowState, opts?: pulumi.CustomResourceOptions): MaintenanceWindow {
        return new MaintenanceWindow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/maintenanceWindow:MaintenanceWindow';

    /**
     * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MaintenanceWindow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MaintenanceWindow.__pulumiType;
    }

    /**
     * Defer any scheduled maintenance for the given project for one week.
     */
    public readonly autoDefer!: pulumi.Output<boolean>;
    public readonly autoDeferOnceEnabled!: pulumi.Output<boolean>;
    /**
     * Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
     */
    public readonly dayOfWeek!: pulumi.Output<number>;
    /**
     * Defer the next scheduled maintenance for the given project for one week.
     */
    public readonly defer!: pulumi.Output<boolean>;
    /**
     * Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
     */
    public readonly hourOfDay!: pulumi.Output<number>;
    /**
     * Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
     */
    public readonly numberOfDeferrals!: pulumi.Output<number>;
    /**
     * The unique identifier of the project for the Maintenance Window.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     */
    public /*out*/ readonly startAsap!: pulumi.Output<boolean>;

    /**
     * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MaintenanceWindowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MaintenanceWindowArgs | MaintenanceWindowState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MaintenanceWindowState | undefined;
            resourceInputs["autoDefer"] = state ? state.autoDefer : undefined;
            resourceInputs["autoDeferOnceEnabled"] = state ? state.autoDeferOnceEnabled : undefined;
            resourceInputs["dayOfWeek"] = state ? state.dayOfWeek : undefined;
            resourceInputs["defer"] = state ? state.defer : undefined;
            resourceInputs["hourOfDay"] = state ? state.hourOfDay : undefined;
            resourceInputs["numberOfDeferrals"] = state ? state.numberOfDeferrals : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["startAsap"] = state ? state.startAsap : undefined;
        } else {
            const args = argsOrState as MaintenanceWindowArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["autoDefer"] = args ? args.autoDefer : undefined;
            resourceInputs["autoDeferOnceEnabled"] = args ? args.autoDeferOnceEnabled : undefined;
            resourceInputs["dayOfWeek"] = args ? args.dayOfWeek : undefined;
            resourceInputs["defer"] = args ? args.defer : undefined;
            resourceInputs["hourOfDay"] = args ? args.hourOfDay : undefined;
            resourceInputs["numberOfDeferrals"] = args ? args.numberOfDeferrals : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["startAsap"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MaintenanceWindow.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MaintenanceWindow resources.
 */
export interface MaintenanceWindowState {
    /**
     * Defer any scheduled maintenance for the given project for one week.
     */
    autoDefer?: pulumi.Input<boolean>;
    autoDeferOnceEnabled?: pulumi.Input<boolean>;
    /**
     * Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
     */
    dayOfWeek?: pulumi.Input<number>;
    /**
     * Defer the next scheduled maintenance for the given project for one week.
     */
    defer?: pulumi.Input<boolean>;
    /**
     * Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
     */
    hourOfDay?: pulumi.Input<number>;
    /**
     * Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
     */
    numberOfDeferrals?: pulumi.Input<number>;
    /**
     * The unique identifier of the project for the Maintenance Window.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     */
    startAsap?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a MaintenanceWindow resource.
 */
export interface MaintenanceWindowArgs {
    /**
     * Defer any scheduled maintenance for the given project for one week.
     */
    autoDefer?: pulumi.Input<boolean>;
    autoDeferOnceEnabled?: pulumi.Input<boolean>;
    /**
     * Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
     */
    dayOfWeek?: pulumi.Input<number>;
    /**
     * Defer the next scheduled maintenance for the given project for one week.
     */
    defer?: pulumi.Input<boolean>;
    /**
     * Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
     */
    hourOfDay?: pulumi.Input<number>;
    /**
     * Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
     */
    numberOfDeferrals?: pulumi.Input<number>;
    /**
     * The unique identifier of the project for the Maintenance Window.
     */
    projectId: pulumi.Input<string>;
}
