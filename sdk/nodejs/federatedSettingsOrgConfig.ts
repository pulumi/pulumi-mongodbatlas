// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
 *
 * ## Example Usage
 *
 * > **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const orgConnection = new mongodbatlas.FederatedSettingsOrgConfig("org_connection", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     orgId: "627a9683ea7ff7f74de306f14",
 *     domainRestrictionEnabled: false,
 *     domainAllowLists: ["mydomain.com"],
 *     postAuthRoleGrants: ["ORG_MEMBER"],
 *     identityProviderId: "0oad4fas87jL7f75Xnk1297",
 * });
 * const orgConfigsDs = mongodbatlas.getFederatedSettingsOrgConfigs({
 *     federationSettingsId: orgConnectionMongodbatlasFederatedSettingsOrgConfig.id,
 * });
 * ```
 *
 * ## Import
 *
 * FederatedSettingsOrgConfig must be imported using federation_settings_id-org_id, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig org_connection 627a9687f7f7f7f774de306f14-627a9683ea7ff7f74de306f14
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
 */
export class FederatedSettingsOrgConfig extends pulumi.CustomResource {
    /**
     * Get an existing FederatedSettingsOrgConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FederatedSettingsOrgConfigState, opts?: pulumi.CustomResourceOptions): FederatedSettingsOrgConfig {
        return new FederatedSettingsOrgConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig';

    /**
     * Returns true if the given object is an instance of FederatedSettingsOrgConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FederatedSettingsOrgConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FederatedSettingsOrgConfig.__pulumiType;
    }

    /**
     * List that contains the approved domains from which organization users can log in.
     */
    public readonly domainAllowLists!: pulumi.Output<string[] | undefined>;
    /**
     * Flag that indicates whether domain restriction is enabled for the connected organization.
     */
    public readonly domainRestrictionEnabled!: pulumi.Output<boolean>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    public readonly federationSettingsId!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    public readonly identityProviderId!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     */
    public readonly postAuthRoleGrants!: pulumi.Output<string[] | undefined>;

    /**
     * Create a FederatedSettingsOrgConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FederatedSettingsOrgConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FederatedSettingsOrgConfigArgs | FederatedSettingsOrgConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FederatedSettingsOrgConfigState | undefined;
            resourceInputs["domainAllowLists"] = state ? state.domainAllowLists : undefined;
            resourceInputs["domainRestrictionEnabled"] = state ? state.domainRestrictionEnabled : undefined;
            resourceInputs["federationSettingsId"] = state ? state.federationSettingsId : undefined;
            resourceInputs["identityProviderId"] = state ? state.identityProviderId : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["postAuthRoleGrants"] = state ? state.postAuthRoleGrants : undefined;
        } else {
            const args = argsOrState as FederatedSettingsOrgConfigArgs | undefined;
            if ((!args || args.domainRestrictionEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainRestrictionEnabled'");
            }
            if ((!args || args.federationSettingsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'federationSettingsId'");
            }
            if ((!args || args.identityProviderId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityProviderId'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["domainAllowLists"] = args ? args.domainAllowLists : undefined;
            resourceInputs["domainRestrictionEnabled"] = args ? args.domainRestrictionEnabled : undefined;
            resourceInputs["federationSettingsId"] = args ? args.federationSettingsId : undefined;
            resourceInputs["identityProviderId"] = args ? args.identityProviderId : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["postAuthRoleGrants"] = args ? args.postAuthRoleGrants : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FederatedSettingsOrgConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FederatedSettingsOrgConfig resources.
 */
export interface FederatedSettingsOrgConfigState {
    /**
     * List that contains the approved domains from which organization users can log in.
     */
    domainAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Flag that indicates whether domain restriction is enabled for the connected organization.
     */
    domainRestrictionEnabled?: pulumi.Input<boolean>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    identityProviderId?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId?: pulumi.Input<string>;
    /**
     * List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     */
    postAuthRoleGrants?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a FederatedSettingsOrgConfig resource.
 */
export interface FederatedSettingsOrgConfigArgs {
    /**
     * List that contains the approved domains from which organization users can log in.
     */
    domainAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Flag that indicates whether domain restriction is enabled for the connected organization.
     */
    domainRestrictionEnabled: pulumi.Input<boolean>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    identityProviderId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: pulumi.Input<string>;
    /**
     * List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     */
    postAuthRoleGrants?: pulumi.Input<pulumi.Input<string>[]>;
}
