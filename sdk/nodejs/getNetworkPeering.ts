// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.NetworkPeering` describes a Network Peering Connection.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * > **NOTE:** If you need to get an existing container ID see the How-To Guide.
 *
 * ## Example Usage
 *
 * ### Basic Example (AWS).
 *
 * <!--Start PulumiCodeChooser -->
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
 * const test = mongodbatlas.getNetworkPeeringOutput({
 *     projectId: testNetworkPeering.projectId,
 *     peeringId: testNetworkPeering.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNetworkPeering(args: GetNetworkPeeringArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkPeeringResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getNetworkPeering:getNetworkPeering", {
        "peeringId": args.peeringId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkPeering.
 */
export interface GetNetworkPeeringArgs {
    /**
     * Atlas assigned unique ID for the peering connection.
     */
    peeringId: string;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: string;
}

/**
 * A collection of values returned by getNetworkPeering.
 */
export interface GetNetworkPeeringResult {
    /**
     * Specifies the region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    readonly accepterRegionName: string;
    readonly atlasCidrBlock: string;
    readonly atlasId: string;
    /**
     * Account ID of the owner of the peer VPC.
     */
    readonly awsAccountId: string;
    /**
     * Unique identifier for an Azure AD directory.
     */
    readonly azureDirectoryId: string;
    /**
     * Unique identifer of the Azure subscription in which the VNet resides.
     */
    readonly azureSubscriptionId: string;
    /**
     * Unique identifier for the peering connection.
     */
    readonly connectionId: string;
    readonly containerId: string;
    /**
     * When `"status" : "FAILED"`, Atlas provides a description of the error.
     */
    readonly errorMessage: string;
    /**
     * Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
     */
    readonly errorState: string;
    /**
     * Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
     */
    readonly errorStateName: string;
    /**
     * GCP project ID of the owner of the network peer.
     */
    readonly gcpProjectId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the network peer to which Atlas connects.
     */
    readonly networkName: string;
    readonly peeringId: string;
    readonly projectId: string;
    /**
     * Cloud provider for this VPC peering connection. If omitted, Atlas sets this parameter to AWS. (Possible Values `AWS`, `AZURE`, `GCP`).
     */
    readonly providerName: string;
    /**
     * Name of your Azure resource group.
     */
    readonly resourceGroupName: string;
    /**
     * Peer VPC CIDR block or subnet.
     */
    readonly routeTableCidrBlock: string;
    /**
     * Status of the Atlas network peering connection: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING`, `WAITING_FOR_USER`.
     */
    readonly status: string;
    /**
     * The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
     */
    readonly statusName: string;
    /**
     * Name of your Azure VNet.
     */
    readonly vnetName: string;
    /**
     * Unique identifier of the peer VPC.
     */
    readonly vpcId: string;
}
/**
 * `mongodbatlas.NetworkPeering` describes a Network Peering Connection.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * > **NOTE:** If you need to get an existing container ID see the How-To Guide.
 *
 * ## Example Usage
 *
 * ### Basic Example (AWS).
 *
 * <!--Start PulumiCodeChooser -->
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
 * const test = mongodbatlas.getNetworkPeeringOutput({
 *     projectId: testNetworkPeering.projectId,
 *     peeringId: testNetworkPeering.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNetworkPeeringOutput(args: GetNetworkPeeringOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkPeeringResult> {
    return pulumi.output(args).apply((a: any) => getNetworkPeering(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkPeering.
 */
export interface GetNetworkPeeringOutputArgs {
    /**
     * Atlas assigned unique ID for the peering connection.
     */
    peeringId: pulumi.Input<string>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
}
