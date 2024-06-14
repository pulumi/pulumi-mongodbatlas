// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getProjectApiKeys({
 *     pageNum: 1,
 *     itemsPerPage: 5,
 *     projectId: "32b6e34b3d91647abb20e7b8",
 * });
 * ```
 */
export function getProjectApiKeys(args: GetProjectApiKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectApiKeysResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getProjectApiKeys:getProjectApiKeys", {
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectApiKeys.
 */
export interface GetProjectApiKeysArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: number;
    /**
     * The unique ID for the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getProjectApiKeys.
 */
export interface GetProjectApiKeysResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly pageNum?: number;
    /**
     * Project ID to assign to Access Key
     */
    readonly projectId: string;
    /**
     * A list where each element represents a API Key assigned to the project.
     */
    readonly results: outputs.GetProjectApiKeysResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getProjectApiKeys({
 *     pageNum: 1,
 *     itemsPerPage: 5,
 *     projectId: "32b6e34b3d91647abb20e7b8",
 * });
 * ```
 */
export function getProjectApiKeysOutput(args: GetProjectApiKeysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectApiKeysResult> {
    return pulumi.output(args).apply((a: any) => getProjectApiKeys(a, opts))
}

/**
 * A collection of arguments for invoking getProjectApiKeys.
 */
export interface GetProjectApiKeysOutputArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}