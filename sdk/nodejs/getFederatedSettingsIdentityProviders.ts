// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const identityProvider = new mongodbatlas.FederatedSettingsIdentityProvider("identityProvider", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     associatedDomains: ["yourdomain.com"],
 *     ssoDebugEnabled: true,
 *     status: "ACTIVE",
 * });
 * const identittyProvider = identityProvider.id.apply(id => mongodbatlas.getFederatedSettingsIdentityProvidersOutput({
 *     federationSettingsId: id,
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * }));
 * ```
 */
export function getFederatedSettingsIdentityProviders(args: GetFederatedSettingsIdentityProvidersArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedSettingsIdentityProvidersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedSettingsIdentityProviders:getFederatedSettingsIdentityProviders", {
        "federationSettingsId": args.federationSettingsId,
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedSettingsIdentityProviders.
 */
export interface GetFederatedSettingsIdentityProvidersArgs {
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
 * A collection of values returned by getFederatedSettingsIdentityProviders.
 */
export interface GetFederatedSettingsIdentityProvidersResult {
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
     */
    readonly results: outputs.GetFederatedSettingsIdentityProvidersResult[];
}
/**
 * `mongodbatlas.getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const identityProvider = new mongodbatlas.FederatedSettingsIdentityProvider("identityProvider", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     associatedDomains: ["yourdomain.com"],
 *     ssoDebugEnabled: true,
 *     status: "ACTIVE",
 * });
 * const identittyProvider = identityProvider.id.apply(id => mongodbatlas.getFederatedSettingsIdentityProvidersOutput({
 *     federationSettingsId: id,
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * }));
 * ```
 */
export function getFederatedSettingsIdentityProvidersOutput(args: GetFederatedSettingsIdentityProvidersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedSettingsIdentityProvidersResult> {
    return pulumi.output(args).apply((a: any) => getFederatedSettingsIdentityProviders(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedSettingsIdentityProviders.
 */
export interface GetFederatedSettingsIdentityProvidersOutputArgs {
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
