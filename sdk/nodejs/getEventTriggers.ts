// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getEventTriggers` describe all Event Triggers.
 */
export function getEventTriggers(args: GetEventTriggersArgs, opts?: pulumi.InvokeOptions): Promise<GetEventTriggersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getEventTriggers:getEventTriggers", {
        "appId": args.appId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEventTriggers.
 */
export interface GetEventTriggersArgs {
    /**
     * The ObjectID of your application.
     * * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     */
    appId: string;
    /**
     * The unique ID for the project to get all event triggers.
     */
    projectId: string;
}

/**
 * A collection of values returned by getEventTriggers.
 */
export interface GetEventTriggersResult {
    readonly appId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a Event Trigger.
     */
    readonly results: outputs.GetEventTriggersResult[];
}
/**
 * `mongodbatlas.getEventTriggers` describe all Event Triggers.
 */
export function getEventTriggersOutput(args: GetEventTriggersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEventTriggersResult> {
    return pulumi.output(args).apply((a: any) => getEventTriggers(a, opts))
}

/**
 * A collection of arguments for invoking getEventTriggers.
 */
export interface GetEventTriggersOutputArgs {
    /**
     * The ObjectID of your application.
     * * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     */
    appId: pulumi.Input<string>;
    /**
     * The unique ID for the project to get all event triggers.
     */
    projectId: pulumi.Input<string>;
}
