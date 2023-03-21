// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export function getAccessListApiKeys(args: GetAccessListApiKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessListApiKeysResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys", {
        "apiKeyId": args.apiKeyId,
        "itemsPerPage": args.itemsPerPage,
        "orgId": args.orgId,
        "pageNum": args.pageNum,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessListApiKeys.
 */
export interface GetAccessListApiKeysArgs {
    /**
     * Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
     * *
     * > **NOTE:** One of the following attributes must set: `cidrBlock`  or `ipAddress`.
     */
    apiKeyId: string;
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    /**
     * Unique identifier for the Organization to which you want to retrieve one or more access list entries.
     */
    orgId: string;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: number;
}

/**
 * A collection of values returned by getAccessListApiKeys.
 */
export interface GetAccessListApiKeysResult {
    readonly apiKeyId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly orgId: string;
    readonly pageNum?: number;
    readonly results: outputs.GetAccessListApiKeysResult[];
}
/**
 * ## Example Usage
 */
export function getAccessListApiKeysOutput(args: GetAccessListApiKeysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccessListApiKeysResult> {
    return pulumi.output(args).apply((a: any) => getAccessListApiKeys(a, opts))
}

/**
 * A collection of arguments for invoking getAccessListApiKeys.
 */
export interface GetAccessListApiKeysOutputArgs {
    /**
     * Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
     * *
     * > **NOTE:** One of the following attributes must set: `cidrBlock`  or `ipAddress`.
     */
    apiKeyId: pulumi.Input<string>;
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * Unique identifier for the Organization to which you want to retrieve one or more access list entries.
     */
    orgId: pulumi.Input<string>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
}