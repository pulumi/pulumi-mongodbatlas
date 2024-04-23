// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.FederatedSettingsOrgRoleMapping` provides an Role Mapping resource. This allows organization role mapping to be created.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgGroupRoleMappingImport = new mongodbatlas.FederatedSettingsOrgRoleMapping("org_group_role_mapping_import", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
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
 *             groupId: "628aa20d7f7f7f7f7098b81b8",
 *             roles: [
 *                 "GROUP_OWNER",
 *                 "GROUP_DATA_ACCESS_ADMIN",
 *                 "GROUP_SEARCH_INDEX_EDITOR",
 *                 "GROUP_DATA_ACCESS_READ_ONLY",
 *             ],
 *         },
 *         {
 *             groupId: "628aa20d7f7f7f7f7078b81b8",
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
 * ```
 *
 * ## Import
 *
 * FederatedSettingsOrgRoleMapping can be imported using federation_settings_id-org_id-role_mapping_id, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedSettingsOrgRoleMapping:FederatedSettingsOrgRoleMapping org_group_role_mapping_import 6287a663c7f7f7f71c441c6c-627a96837f7f7f7e306f14-628ae97f7f7468ea3727
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
 */
export class FederatedSettingsOrgRoleMapping extends pulumi.CustomResource {
    /**
     * Get an existing FederatedSettingsOrgRoleMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FederatedSettingsOrgRoleMappingState, opts?: pulumi.CustomResourceOptions): FederatedSettingsOrgRoleMapping {
        return new FederatedSettingsOrgRoleMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/federatedSettingsOrgRoleMapping:FederatedSettingsOrgRoleMapping';

    /**
     * Returns true if the given object is an instance of FederatedSettingsOrgRoleMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FederatedSettingsOrgRoleMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FederatedSettingsOrgRoleMapping.__pulumiType;
    }

    /**
     * Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     */
    public readonly externalGroupName!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    public readonly federationSettingsId!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     */
    public readonly roleAssignments!: pulumi.Output<outputs.FederatedSettingsOrgRoleMappingRoleAssignment[]>;

    /**
     * Create a FederatedSettingsOrgRoleMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FederatedSettingsOrgRoleMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FederatedSettingsOrgRoleMappingArgs | FederatedSettingsOrgRoleMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FederatedSettingsOrgRoleMappingState | undefined;
            resourceInputs["externalGroupName"] = state ? state.externalGroupName : undefined;
            resourceInputs["federationSettingsId"] = state ? state.federationSettingsId : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["roleAssignments"] = state ? state.roleAssignments : undefined;
        } else {
            const args = argsOrState as FederatedSettingsOrgRoleMappingArgs | undefined;
            if ((!args || args.externalGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'externalGroupName'");
            }
            if ((!args || args.federationSettingsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'federationSettingsId'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.roleAssignments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleAssignments'");
            }
            resourceInputs["externalGroupName"] = args ? args.externalGroupName : undefined;
            resourceInputs["federationSettingsId"] = args ? args.federationSettingsId : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["roleAssignments"] = args ? args.roleAssignments : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FederatedSettingsOrgRoleMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FederatedSettingsOrgRoleMapping resources.
 */
export interface FederatedSettingsOrgRoleMappingState {
    /**
     * Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     */
    externalGroupName?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     */
    roleAssignments?: pulumi.Input<pulumi.Input<inputs.FederatedSettingsOrgRoleMappingRoleAssignment>[]>;
}

/**
 * The set of arguments for constructing a FederatedSettingsOrgRoleMapping resource.
 */
export interface FederatedSettingsOrgRoleMappingArgs {
    /**
     * Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     */
    externalGroupName: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: pulumi.Input<string>;
    /**
     * Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     */
    roleAssignments: pulumi.Input<pulumi.Input<inputs.FederatedSettingsOrgRoleMappingRoleAssignment>[]>;
}
