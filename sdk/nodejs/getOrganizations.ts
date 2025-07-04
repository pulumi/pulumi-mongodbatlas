// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getOrganizations
 *
 * `mongodbatlas.getOrganizations` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOrganizations({
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * });
 * ```
 */
export function getOrganizations(args?: GetOrganizationsArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getOrganizations:getOrganizations", {
        "itemsPerPage": args.itemsPerPage,
        "name": args.name,
        "pageNum": args.pageNum,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizations.
 */
export interface GetOrganizationsArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    name?: string;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: number;
}

/**
 * A collection of values returned by getOrganizations.
 */
export interface GetOrganizationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly name?: string;
    readonly pageNum?: number;
    readonly results: outputs.GetOrganizationsResult[];
    readonly totalCount: number;
}
/**
 * ## # Data Source: mongodbatlas.getOrganizations
 *
 * `mongodbatlas.getOrganizations` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOrganizations({
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * });
 * ```
 */
export function getOrganizationsOutput(args?: GetOrganizationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOrganizationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getOrganizations:getOrganizations", {
        "itemsPerPage": args.itemsPerPage,
        "name": args.name,
        "pageNum": args.pageNum,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizations.
 */
export interface GetOrganizationsOutputArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
}
