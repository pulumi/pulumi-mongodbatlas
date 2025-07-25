// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getFederatedDatabaseInstances
 *
 * `mongodbatlasFederatedDatabaseInstancess` provides a Federated Database Instance data source.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
 *
 * ## Example Usage
 */
export function getFederatedDatabaseInstances(args: GetFederatedDatabaseInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedDatabaseInstancesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedDatabaseInstances:getFederatedDatabaseInstances", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedDatabaseInstances.
 */
export interface GetFederatedDatabaseInstancesArgs {
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: string;
}

/**
 * A collection of values returned by getFederatedDatabaseInstances.
 */
export interface GetFederatedDatabaseInstancesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * Includes Federated Database instance for each item detailed in the results array section.
     */
    readonly results: outputs.GetFederatedDatabaseInstancesResult[];
}
/**
 * ## # Data Source: mongodbatlas.getFederatedDatabaseInstances
 *
 * `mongodbatlasFederatedDatabaseInstancess` provides a Federated Database Instance data source.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
 *
 * ## Example Usage
 */
export function getFederatedDatabaseInstancesOutput(args: GetFederatedDatabaseInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFederatedDatabaseInstancesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getFederatedDatabaseInstances:getFederatedDatabaseInstances", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedDatabaseInstances.
 */
export interface GetFederatedDatabaseInstancesOutputArgs {
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: pulumi.Input<string>;
}
