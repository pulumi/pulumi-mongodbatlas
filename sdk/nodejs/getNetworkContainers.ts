// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas..getNetworkContainers` describes all Network Peering Containers. The data source requires your Project ID.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 *
 * ## Example Usage
 *
 * ### Basic Example.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testNetworkContainer = new mongodbatlas.NetworkContainer("testNetworkContainer", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     atlasCidrBlock: "10.8.0.0/21",
 *     providerName: "AWS",
 *     regionName: "US_EAST_1",
 * });
 * const testNetworkContainers = pulumi.all([testNetworkContainer.projectId, testNetworkContainer.providerName]).apply(([projectId, providerName]) => mongodbatlas.getNetworkContainers({
 *     projectId: projectId,
 *     providerName: providerName,
 * }));
 * ```
 */
export function getNetworkContainers(args: GetNetworkContainersArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkContainersResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/getNetworkContainers:getNetworkContainers", {
        "projectId": args.projectId,
        "providerName": args.providerName,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkContainers.
 */
export interface GetNetworkContainersArgs {
    /**
     * The unique ID for the project to create the database user.
     */
    readonly projectId: string;
    /**
     * Cloud provider for this Network peering container. Accepted values are AWS, GCP, and Azure.
     */
    readonly providerName: string;
}

/**
 * A collection of values returned by getNetworkContainers.
 */
export interface GetNetworkContainersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * Cloud provider for this Network Peering connection. If omitted, Atlas sets this parameter to AWS.
     */
    readonly providerName: string;
    /**
     * A list where each represents a Network Peering Container.
     */
    readonly results: outputs.GetNetworkContainersResult[];
}
