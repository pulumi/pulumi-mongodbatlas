// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ProjectIpAccessList` describes an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * > **IMPORTANT:**
 * When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.
 *
 * ## Example Usage
 */
export function getProjectIpAccessList(args: GetProjectIpAccessListArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectIpAccessListResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/getProjectIpAccessList:getProjectIpAccessList", {
        "awsSecurityGroup": args.awsSecurityGroup,
        "cidrBlock": args.cidrBlock,
        "ipAddress": args.ipAddress,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectIpAccessList.
 */
export interface GetProjectIpAccessListArgs {
    /**
     * Unique identifier of the AWS security group to add to the access list.
     */
    readonly awsSecurityGroup?: string;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list.
     */
    readonly cidrBlock?: string;
    /**
     * Single IP address to be added to the access list.
     */
    readonly ipAddress?: string;
    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getProjectIpAccessList.
 */
export interface GetProjectIpAccessListResult {
    readonly awsSecurityGroup: string;
    readonly cidrBlock: string;
    /**
     * Comment to add to the access list entry.
     */
    readonly comment: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipAddress: string;
    readonly projectId: string;
}
