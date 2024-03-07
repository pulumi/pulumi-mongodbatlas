// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgConnections = new mongodbatlas.FederatedSettingsOrgConfig("orgConnections", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     orgId: "627a9683ea7ff7f74de306f14",
 *     domainRestrictionEnabled: false,
 *     domainAllowLists: ["mydomain.com"],
 *     postAuthRoleGrants: ["ORG_MEMBER"],
 * });
 * const orgConfigsDs = mongodbatlas.getFederatedSettingsOrgConfigOutput({
 *     federationSettingsId: orgConnections.id,
 *     orgId: "627a9683ea7ff7f74de306f14",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFederatedSettingsOrgConfig(args: GetFederatedSettingsOrgConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedSettingsOrgConfigResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedSettingsOrgConfig:getFederatedSettingsOrgConfig", {
        "federationSettingsId": args.federationSettingsId,
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedSettingsOrgConfig.
 */
export interface GetFederatedSettingsOrgConfigArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: string;
}

/**
 * A collection of values returned by getFederatedSettingsOrgConfig.
 */
export interface GetFederatedSettingsOrgConfigResult {
    /**
     * List that contains the approved domains from which organization users can log in.  Note: If the organization uses an identity provider,  `domainAllowList` includes: any SSO domains associated with organization's identity provider and any custom domains associated with the specific organization.
     */
    readonly domainAllowLists: string[];
    /**
     * Flag that indicates whether domain restriction is enabled for the connected organization.  User Conflicts returns null when `domainRestrictionEnabled` is false.
     */
    readonly domainRestrictionEnabled: boolean;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    readonly federationSettingsId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    readonly identityProviderId: string;
    readonly orgId: string;
    /**
     * List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     */
    readonly postAuthRoleGrants: string[];
    readonly roleMappings: outputs.GetFederatedSettingsOrgConfigRoleMapping[];
    readonly userConflicts: outputs.GetFederatedSettingsOrgConfigUserConflict[];
}
/**
 * `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgConnections = new mongodbatlas.FederatedSettingsOrgConfig("orgConnections", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     orgId: "627a9683ea7ff7f74de306f14",
 *     domainRestrictionEnabled: false,
 *     domainAllowLists: ["mydomain.com"],
 *     postAuthRoleGrants: ["ORG_MEMBER"],
 * });
 * const orgConfigsDs = mongodbatlas.getFederatedSettingsOrgConfigOutput({
 *     federationSettingsId: orgConnections.id,
 *     orgId: "627a9683ea7ff7f74de306f14",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFederatedSettingsOrgConfigOutput(args: GetFederatedSettingsOrgConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedSettingsOrgConfigResult> {
    return pulumi.output(args).apply((a: any) => getFederatedSettingsOrgConfig(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedSettingsOrgConfig.
 */
export interface GetFederatedSettingsOrgConfigOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: pulumi.Input<string>;
}
