// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas..NetworkPeering` describes a Network Peering Connection.
 * 
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 * 
 * 
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-mongodbatlas/blob/master/website/docs/d/network_peering.html.markdown.
 */
export function getNetworkPeering(args: GetNetworkPeeringArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkPeeringResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly peeringId: string;
    /**
     * The unique ID for the project to create the database user.
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getNetworkPeering.
 */
export interface GetNetworkPeeringResult {
    /**
     * Specifies the region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    readonly accepterRegionName: string;
    /**
     * Unique identifier for an Azure AD directory.
     */
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
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
