// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getCustomDbRoles
 *
 * `mongodbatlas.getCustomDbRoles` describes all Custom DB Roles. This represents a custom db roles.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getCustomDbRoles(args: GetCustomDbRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomDbRolesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCustomDbRoles:getCustomDbRoles", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomDbRoles.
 */
export interface GetCustomDbRolesArgs {
    /**
     * The unique ID for the project to get all custom db roles.
     */
    projectId: string;
}

/**
 * A collection of values returned by getCustomDbRoles.
 */
export interface GetCustomDbRolesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a custom db roles.
     */
    readonly results: outputs.GetCustomDbRolesResult[];
}
/**
 * ## # Data Source: mongodbatlas.getCustomDbRoles
 *
 * `mongodbatlas.getCustomDbRoles` describes all Custom DB Roles. This represents a custom db roles.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getCustomDbRolesOutput(args: GetCustomDbRolesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCustomDbRolesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getCustomDbRoles:getCustomDbRoles", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomDbRoles.
 */
export interface GetCustomDbRolesOutputArgs {
    /**
     * The unique ID for the project to get all custom db roles.
     */
    projectId: pulumi.Input<string>;
}
