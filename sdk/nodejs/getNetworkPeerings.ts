// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * # Data Source: mongodbatlas.getNetworkPeerings
 *
 * `mongodbatlas.getNetworkPeerings` describes all Network Peering Connections.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * ### Basic Example (AWS).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testNetworkPeering = new mongodbatlas.NetworkPeering("test", {
 *     accepterRegionName: "us-east-1",
 *     projectId: "<YOUR-PROJEC-ID>",
 *     containerId: "507f1f77bcf86cd799439011",
 *     providerName: "AWS",
 *     routeTableCidrBlock: "192.168.0.0/24",
 *     vpcId: "vpc-abc123abc123",
 *     awsAccountId: "abc123abc123",
 * });
 * const test = mongodbatlas.getNetworkPeeringsOutput({
 *     projectId: testNetworkPeering.projectId,
 * });
 * ```
 */
export function getNetworkPeerings(args: GetNetworkPeeringsArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkPeeringsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getNetworkPeerings:getNetworkPeerings", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkPeerings.
 */
export interface GetNetworkPeeringsArgs {
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: string;
}

/**
 * A collection of values returned by getNetworkPeerings.
 */
export interface GetNetworkPeeringsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a Network Peering Connection.
     */
    readonly results: outputs.GetNetworkPeeringsResult[];
}
/**
 * # Data Source: mongodbatlas.getNetworkPeerings
 *
 * `mongodbatlas.getNetworkPeerings` describes all Network Peering Connections.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * ### Basic Example (AWS).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testNetworkPeering = new mongodbatlas.NetworkPeering("test", {
 *     accepterRegionName: "us-east-1",
 *     projectId: "<YOUR-PROJEC-ID>",
 *     containerId: "507f1f77bcf86cd799439011",
 *     providerName: "AWS",
 *     routeTableCidrBlock: "192.168.0.0/24",
 *     vpcId: "vpc-abc123abc123",
 *     awsAccountId: "abc123abc123",
 * });
 * const test = mongodbatlas.getNetworkPeeringsOutput({
 *     projectId: testNetworkPeering.projectId,
 * });
 * ```
 */
export function getNetworkPeeringsOutput(args: GetNetworkPeeringsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkPeeringsResult> {
    return pulumi.output(args).apply((a: any) => getNetworkPeerings(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkPeerings.
 */
export interface GetNetworkPeeringsOutputArgs {
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
}
