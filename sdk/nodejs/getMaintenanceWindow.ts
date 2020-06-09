// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas..MaintenanceWindow` provides a Maintenance Window entry datasource. Gets information regarding the configured maintenance window for a MongoDB Atlas project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Examples Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testMongodbatlasMaintenanceWindow = new mongodbatlas.MaintenanceWindow("test", {
 *     dayOfWeek: 3,
 *     hourOfDay: 4,
 *     projectId: "<your-project-id>",
 * });
 * const testMaintenanceWindow = testMongodbatlasMaintenanceWindow.id.apply(id => mongodbatlas.getMaintenanceWindow({
 *     projectId: id,
 * }, { async: true }));
 * ```
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testMongodbatlasMaintenanceWindow = new mongodbatlas.MaintenanceWindow("test", {
 *     projectId: "<your-project-id>",
 *     startAsap: true,
 * });
 * const testMaintenanceWindow = testMongodbatlasMaintenanceWindow.id.apply(id => mongodbatlas.getMaintenanceWindow({
 *     projectId: id,
 * }, { async: true }));
 * ```
 */
export function getMaintenanceWindow(args: GetMaintenanceWindowArgs, opts?: pulumi.InvokeOptions): Promise<GetMaintenanceWindowResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/getMaintenanceWindow:getMaintenanceWindow", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getMaintenanceWindow.
 */
export interface GetMaintenanceWindowArgs {
    /**
     * The unique identifier of the project for the Maintenance Window.
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getMaintenanceWindow.
 */
export interface GetMaintenanceWindowResult {
    /**
     * Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
     */
    readonly dayOfWeek: number;
    /**
     * Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12  (Time zone is UTC).
     */
    readonly hourOfDay: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
     */
    readonly numberOfDeferrals: number;
    readonly projectId: string;
    /**
     * Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     */
    readonly startAsap: boolean;
}
