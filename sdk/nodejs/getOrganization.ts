// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.Organization
 *
 * `mongodbatlas.Organization` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
 *
 * ## Example Usage
 *
 * ### Using projectId attribute to query
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOrganization({
 *     orgId: "<org_id>",
 * });
 * ```
 */
export function getOrganization(args: GetOrganizationArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getOrganization:getOrganization", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganization.
 */
export interface GetOrganizationArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the organization.
     */
    orgId: string;
}

/**
 * A collection of values returned by getOrganization.
 */
export interface GetOrganizationResult {
    /**
     * (Optional) Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
     */
    readonly apiAccessListRequired: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Flag that indicates whether this organization has been deleted.
     */
    readonly isDeleted: boolean;
    readonly links: outputs.GetOrganizationLink[];
    /**
     * (Optional) Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
     */
    readonly multiFactorAuthRequired: boolean;
    /**
     * Human-readable label that identifies the organization.
     */
    readonly name: string;
    readonly orgId: string;
    /**
     * (Optional) Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
     */
    readonly restrictEmployeeAccess: boolean;
}
/**
 * ## # Data Source: mongodbatlas.Organization
 *
 * `mongodbatlas.Organization` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
 *
 * ## Example Usage
 *
 * ### Using projectId attribute to query
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getOrganization({
 *     orgId: "<org_id>",
 * });
 * ```
 */
export function getOrganizationOutput(args: GetOrganizationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOrganizationResult> {
    return pulumi.output(args).apply((a: any) => getOrganization(a, opts))
}

/**
 * A collection of arguments for invoking getOrganization.
 */
export interface GetOrganizationOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the organization.
     */
    orgId: pulumi.Input<string>;
}
