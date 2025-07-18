// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.FederatedSettingsOrgRoleMapping
 *
 * `mongodbatlas.FederatedSettingsOrgRoleMapping` provides an Federated Settings Org Role Mapping datasource. Atlas Cloud Federated Settings Org Role Mapping provides federated settings outputs for the configured Org Role Mapping.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgGroupRoleMappingImport = new mongodbatlas.FederatedSettingsOrgRoleMapping("org_group_role_mapping_import", {
 *     federationSettingsId: federatedSettings.id,
 *     orgId: "627a9683e7f7f7ff7fe306f14",
 *     externalGroupName: "myGrouptest",
 *     roleAssignments: [
 *         {
 *             orgId: "627a9683e7f7f7ff7fe306f14",
 *             roles: [
 *                 "ORG_MEMBER",
 *                 "ORG_GROUP_CREATOR",
 *                 "ORG_BILLING_ADMIN",
 *             ],
 *         },
 *         {
 *             groupId: "628aa20db7f7f7f98b81b8",
 *             roles: [
 *                 "GROUP_OWNER",
 *                 "GROUP_DATA_ACCESS_ADMIN",
 *                 "GROUP_SEARCH_INDEX_EDITOR",
 *                 "GROUP_DATA_ACCESS_READ_ONLY",
 *             ],
 *         },
 *         {
 *             groupId: "62b477f7f7f7f5e741489c",
 *             roles: [
 *                 "GROUP_OWNER",
 *                 "GROUP_DATA_ACCESS_ADMIN",
 *                 "GROUP_SEARCH_INDEX_EDITOR",
 *                 "GROUP_DATA_ACCESS_READ_ONLY",
 *                 "GROUP_DATA_ACCESS_READ_WRITE",
 *             ],
 *         },
 *     ],
 * });
 * const roleMapping = mongodbatlas.getFederatedSettingsOrgRoleMappingOutput({
 *     federationSettingsId: orgGroupRoleMappingImport.id,
 *     orgId: "627a9683e7f7f7ff7fe306f14",
 *     roleMappingId: "627a9673e7f7f7ff7fe306f14",
 * });
 * ```
 */
export function getFederatedSettingsOrgRoleMapping(args: GetFederatedSettingsOrgRoleMappingArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedSettingsOrgRoleMappingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedSettingsOrgRoleMapping:getFederatedSettingsOrgRoleMapping", {
        "federationSettingsId": args.federationSettingsId,
        "orgId": args.orgId,
        "roleMappingId": args.roleMappingId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedSettingsOrgRoleMapping.
 */
export interface GetFederatedSettingsOrgRoleMappingArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: string;
    roleMappingId: string;
}

/**
 * A collection of values returned by getFederatedSettingsOrgRoleMapping.
 */
export interface GetFederatedSettingsOrgRoleMappingResult {
    /**
     * Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     */
    readonly externalGroupName: string;
    readonly federationSettingsId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies this role mapping.
     */
    readonly id: string;
    readonly orgId: string;
    /**
     * Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     */
    readonly roleAssignments: outputs.GetFederatedSettingsOrgRoleMappingRoleAssignment[];
    readonly roleMappingId: string;
}
/**
 * ## # Data Source: mongodbatlas.FederatedSettingsOrgRoleMapping
 *
 * `mongodbatlas.FederatedSettingsOrgRoleMapping` provides an Federated Settings Org Role Mapping datasource. Atlas Cloud Federated Settings Org Role Mapping provides federated settings outputs for the configured Org Role Mapping.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgGroupRoleMappingImport = new mongodbatlas.FederatedSettingsOrgRoleMapping("org_group_role_mapping_import", {
 *     federationSettingsId: federatedSettings.id,
 *     orgId: "627a9683e7f7f7ff7fe306f14",
 *     externalGroupName: "myGrouptest",
 *     roleAssignments: [
 *         {
 *             orgId: "627a9683e7f7f7ff7fe306f14",
 *             roles: [
 *                 "ORG_MEMBER",
 *                 "ORG_GROUP_CREATOR",
 *                 "ORG_BILLING_ADMIN",
 *             ],
 *         },
 *         {
 *             groupId: "628aa20db7f7f7f98b81b8",
 *             roles: [
 *                 "GROUP_OWNER",
 *                 "GROUP_DATA_ACCESS_ADMIN",
 *                 "GROUP_SEARCH_INDEX_EDITOR",
 *                 "GROUP_DATA_ACCESS_READ_ONLY",
 *             ],
 *         },
 *         {
 *             groupId: "62b477f7f7f7f5e741489c",
 *             roles: [
 *                 "GROUP_OWNER",
 *                 "GROUP_DATA_ACCESS_ADMIN",
 *                 "GROUP_SEARCH_INDEX_EDITOR",
 *                 "GROUP_DATA_ACCESS_READ_ONLY",
 *                 "GROUP_DATA_ACCESS_READ_WRITE",
 *             ],
 *         },
 *     ],
 * });
 * const roleMapping = mongodbatlas.getFederatedSettingsOrgRoleMappingOutput({
 *     federationSettingsId: orgGroupRoleMappingImport.id,
 *     orgId: "627a9683e7f7f7ff7fe306f14",
 *     roleMappingId: "627a9673e7f7f7ff7fe306f14",
 * });
 * ```
 */
export function getFederatedSettingsOrgRoleMappingOutput(args: GetFederatedSettingsOrgRoleMappingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFederatedSettingsOrgRoleMappingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getFederatedSettingsOrgRoleMapping:getFederatedSettingsOrgRoleMapping", {
        "federationSettingsId": args.federationSettingsId,
        "orgId": args.orgId,
        "roleMappingId": args.roleMappingId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedSettingsOrgRoleMapping.
 */
export interface GetFederatedSettingsOrgRoleMappingOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: pulumi.Input<string>;
    roleMappingId: pulumi.Input<string>;
}
