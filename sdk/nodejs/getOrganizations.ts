// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getOrganizations` describe all MongoDB Atlas Organizations. This represents organizations that have been created.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOrganizations({
 *     itemsPerPage: 5,
 *     pageNum: 1,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getOrganizations(args?: GetOrganizationsArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getOrganizations:getOrganizations", {
        "includeDeletedOrgs": args.includeDeletedOrgs,
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
     * @deprecated this parameter is deprecated and will be removed in version 1.16.0
     */
    includeDeletedOrgs?: boolean;
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    /**
     * Human-readable label that identifies the organization.
     */
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
    /**
     * @deprecated this parameter is deprecated and will be removed in version 1.16.0
     */
    readonly includeDeletedOrgs?: boolean;
    readonly itemsPerPage?: number;
    readonly name?: string;
    readonly pageNum?: number;
    readonly results: outputs.GetOrganizationsResult[];
    readonly totalCount: number;
}
/**
 * `mongodbatlas.getOrganizations` describe all MongoDB Atlas Organizations. This represents organizations that have been created.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOrganizations({
 *     itemsPerPage: 5,
 *     pageNum: 1,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getOrganizationsOutput(args?: GetOrganizationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOrganizationsResult> {
    return pulumi.output(args).apply((a: any) => getOrganizations(a, opts))
}

/**
 * A collection of arguments for invoking getOrganizations.
 */
export interface GetOrganizationsOutputArgs {
    /**
     * @deprecated this parameter is deprecated and will be removed in version 1.16.0
     */
    includeDeletedOrgs?: pulumi.Input<boolean>;
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * Human-readable label that identifies the organization.
     */
    name?: pulumi.Input<string>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
}
