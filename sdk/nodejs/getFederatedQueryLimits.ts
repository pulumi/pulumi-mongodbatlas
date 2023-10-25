// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getFederatedQueryLimits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 */
export function getFederatedQueryLimits(args: GetFederatedQueryLimitsArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedQueryLimitsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits", {
        "projectId": args.projectId,
        "tenantName": args.tenantName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedQueryLimits.
 */
export interface GetFederatedQueryLimitsArgs {
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: string;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    tenantName: string;
}

/**
 * A collection of values returned by getFederatedQueryLimits.
 */
export interface GetFederatedQueryLimitsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * Includes Federated Database instance query limits for each item detailed in the results array section.
     */
    readonly results: outputs.GetFederatedQueryLimitsResult[];
    readonly tenantName: string;
}
/**
 * `mongodbatlas.getFederatedQueryLimits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 */
export function getFederatedQueryLimitsOutput(args: GetFederatedQueryLimitsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedQueryLimitsResult> {
    return pulumi.output(args).apply((a: any) => getFederatedQueryLimits(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedQueryLimits.
 */
export interface GetFederatedQueryLimitsOutputArgs {
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: pulumi.Input<string>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    tenantName: pulumi.Input<string>;
}
