// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getProjectIpAddresses
 *
 * `mongodbatlas.getProjectIpAddresses` returns the IP addresses in a project categorized by services.
 *
 * ## Example Usage
 *
 * ### S
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getProjectIpAddresses({
 *     projectId: projectId,
 * });
 * export const projectServices = test.then(test => test.services);
 * ```
 */
export function getProjectIpAddresses(args: GetProjectIpAddressesArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectIpAddressesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getProjectIpAddresses:getProjectIpAddresses", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectIpAddresses.
 */
export interface GetProjectIpAddressesArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getProjectIpAddresses.
 */
export interface GetProjectIpAddressesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    readonly projectId: string;
    /**
     * List of IP addresses in a project categorized by services.
     */
    readonly services: outputs.GetProjectIpAddressesServices;
}
/**
 * ## # Data Source: mongodbatlas.getProjectIpAddresses
 *
 * `mongodbatlas.getProjectIpAddresses` returns the IP addresses in a project categorized by services.
 *
 * ## Example Usage
 *
 * ### S
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getProjectIpAddresses({
 *     projectId: projectId,
 * });
 * export const projectServices = test.then(test => test.services);
 * ```
 */
export function getProjectIpAddressesOutput(args: GetProjectIpAddressesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectIpAddressesResult> {
    return pulumi.output(args).apply((a: any) => getProjectIpAddresses(a, opts))
}

/**
 * A collection of arguments for invoking getProjectIpAddresses.
 */
export interface GetProjectIpAddressesOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: pulumi.Input<string>;
}