// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getFederatedSettingsOrgConfigs` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgConnections = new mongodbatlas.FederatedSettingsOrgConfig("org_connections", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     orgId: "627a9683ea7ff7f74de306f14",
 *     domainRestrictionEnabled: false,
 *     domainAllowLists: ["mydomain.com"],
 *     postAuthRoleGrants: ["ORG_MEMBER"],
 * });
 * const orgConfigsDs = mongodbatlas.getFederatedSettingsOrgConfigs({
 *     federationSettingsId: orgConnectionsMongodbatlasFederatedSettingsOrgConfig.id,
 * });
 * ```
 */
export function getFederatedSettingsOrgConfigs(args: GetFederatedSettingsOrgConfigsArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedSettingsOrgConfigsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedSettingsOrgConfigs:getFederatedSettingsOrgConfigs", {
        "federationSettingsId": args.federationSettingsId,
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedSettingsOrgConfigs.
 */
export interface GetFederatedSettingsOrgConfigsArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: string;
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: number;
}

/**
 * A collection of values returned by getFederatedSettingsOrgConfigs.
 */
export interface GetFederatedSettingsOrgConfigsResult {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    readonly federationSettingsId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly pageNum?: number;
    /**
     * Includes cloudProviderSnapshot object for each item detailed in the results array section.
     * * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
     */
    readonly results: outputs.GetFederatedSettingsOrgConfigsResult[];
}
/**
 * `mongodbatlas.getFederatedSettingsOrgConfigs` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgConnections = new mongodbatlas.FederatedSettingsOrgConfig("org_connections", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     orgId: "627a9683ea7ff7f74de306f14",
 *     domainRestrictionEnabled: false,
 *     domainAllowLists: ["mydomain.com"],
 *     postAuthRoleGrants: ["ORG_MEMBER"],
 * });
 * const orgConfigsDs = mongodbatlas.getFederatedSettingsOrgConfigs({
 *     federationSettingsId: orgConnectionsMongodbatlasFederatedSettingsOrgConfig.id,
 * });
 * ```
 */
export function getFederatedSettingsOrgConfigsOutput(args: GetFederatedSettingsOrgConfigsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedSettingsOrgConfigsResult> {
    return pulumi.output(args).apply((a: any) => getFederatedSettingsOrgConfigs(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedSettingsOrgConfigs.
 */
export interface GetFederatedSettingsOrgConfigsOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: pulumi.Input<string>;
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
}
