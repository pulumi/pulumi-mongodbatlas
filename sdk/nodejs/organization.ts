// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Resource: mongodbatlas.Organization
 *
 * `mongodbatlas.Organization` provides programmatic management (including creation) of a MongoDB Atlas Organization resource.
 *
 * > **IMPORTANT NOTE:**  When you establish an Atlas organization using this resource, it automatically generates a set of initial public and private Programmatic API Keys. These key values are vital to store because you'll need to use them to grant access to the newly created Atlas organization. To use this resource, `roleNames` for new API Key must have the ORG_OWNER role specified.
 *
 * > **IMPORTANT NOTE:** To use this resource, the requesting API Key must have the Organization Owner role. The requesting API Key's organization must be a paying organization. To learn more, see Configure a Paying Organization in the MongoDB Atlas documentation.
 *
 * > **NOTE** Import command is currently not supported for this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.Organization("test", {
 *     orgOwnerId: "6205e5fffff79cde6f",
 *     name: "testCreateORG",
 *     description: "test API key from Org Creation Test",
 *     roleNames: ["ORG_OWNER"],
 * });
 * ```
 */
export class Organization extends pulumi.CustomResource {
    /**
     * Get an existing Organization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationState, opts?: pulumi.CustomResourceOptions): Organization {
        return new Organization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/organization:Organization';

    /**
     * Returns true if the given object is an instance of Organization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Organization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Organization.__pulumiType;
    }

    /**
     * Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
     */
    public readonly apiAccessListRequired!: pulumi.Output<boolean>;
    public readonly description!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
     */
    public readonly federationSettingsId!: pulumi.Output<string | undefined>;
    /**
     * Flag that indicates whether this organization has access to generative AI features. This setting only applies to Atlas Commercial and defaults to `true`. With this setting on, Project Owners may be able to enable or disable individual AI features at the project level. To learn more, see https://www.mongodb.com/docs/generative-ai-faq/.
     */
    public readonly genAiFeaturesEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
     */
    public readonly multiFactorAuthRequired!: pulumi.Output<boolean>;
    /**
     * The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The organization id.
     */
    public /*out*/ readonly orgId!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
     */
    public readonly orgOwnerId!: pulumi.Output<string>;
    public /*out*/ readonly privateKey!: pulumi.Output<string>;
    /**
     * Public API key value set for the specified organization API key.
     */
    public /*out*/ readonly publicKey!: pulumi.Output<string>;
    /**
     * Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
     */
    public readonly restrictEmployeeAccess!: pulumi.Output<boolean>;
    /**
     * List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
     */
    public readonly roleNames!: pulumi.Output<string[]>;
    /**
     * String that specifies a single email address for the specified organization to receive security-related notifications. Specifying a security contact does not grant them authorization or access to Atlas for security decisions or approvals.
     */
    public readonly securityContact!: pulumi.Output<string | undefined>;
    public readonly skipDefaultAlertsSettings!: pulumi.Output<boolean>;

    /**
     * Create a Organization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationArgs | OrganizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationState | undefined;
            resourceInputs["apiAccessListRequired"] = state ? state.apiAccessListRequired : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["federationSettingsId"] = state ? state.federationSettingsId : undefined;
            resourceInputs["genAiFeaturesEnabled"] = state ? state.genAiFeaturesEnabled : undefined;
            resourceInputs["multiFactorAuthRequired"] = state ? state.multiFactorAuthRequired : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["orgOwnerId"] = state ? state.orgOwnerId : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["restrictEmployeeAccess"] = state ? state.restrictEmployeeAccess : undefined;
            resourceInputs["roleNames"] = state ? state.roleNames : undefined;
            resourceInputs["securityContact"] = state ? state.securityContact : undefined;
            resourceInputs["skipDefaultAlertsSettings"] = state ? state.skipDefaultAlertsSettings : undefined;
        } else {
            const args = argsOrState as OrganizationArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.orgOwnerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgOwnerId'");
            }
            if ((!args || args.roleNames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleNames'");
            }
            resourceInputs["apiAccessListRequired"] = args ? args.apiAccessListRequired : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["federationSettingsId"] = args ? args.federationSettingsId : undefined;
            resourceInputs["genAiFeaturesEnabled"] = args ? args.genAiFeaturesEnabled : undefined;
            resourceInputs["multiFactorAuthRequired"] = args ? args.multiFactorAuthRequired : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgOwnerId"] = args ? args.orgOwnerId : undefined;
            resourceInputs["restrictEmployeeAccess"] = args ? args.restrictEmployeeAccess : undefined;
            resourceInputs["roleNames"] = args ? args.roleNames : undefined;
            resourceInputs["securityContact"] = args ? args.securityContact : undefined;
            resourceInputs["skipDefaultAlertsSettings"] = args ? args.skipDefaultAlertsSettings : undefined;
            resourceInputs["orgId"] = undefined /*out*/;
            resourceInputs["privateKey"] = undefined /*out*/;
            resourceInputs["publicKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["privateKey", "publicKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Organization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Organization resources.
 */
export interface OrganizationState {
    /**
     * Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
     */
    apiAccessListRequired?: pulumi.Input<boolean>;
    description?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
     */
    federationSettingsId?: pulumi.Input<string>;
    /**
     * Flag that indicates whether this organization has access to generative AI features. This setting only applies to Atlas Commercial and defaults to `true`. With this setting on, Project Owners may be able to enable or disable individual AI features at the project level. To learn more, see https://www.mongodb.com/docs/generative-ai-faq/.
     */
    genAiFeaturesEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
     */
    multiFactorAuthRequired?: pulumi.Input<boolean>;
    /**
     * The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
     */
    name?: pulumi.Input<string>;
    /**
     * The organization id.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
     */
    orgOwnerId?: pulumi.Input<string>;
    privateKey?: pulumi.Input<string>;
    /**
     * Public API key value set for the specified organization API key.
     */
    publicKey?: pulumi.Input<string>;
    /**
     * Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
     */
    restrictEmployeeAccess?: pulumi.Input<boolean>;
    /**
     * List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
     */
    roleNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * String that specifies a single email address for the specified organization to receive security-related notifications. Specifying a security contact does not grant them authorization or access to Atlas for security decisions or approvals.
     */
    securityContact?: pulumi.Input<string>;
    skipDefaultAlertsSettings?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Organization resource.
 */
export interface OrganizationArgs {
    /**
     * Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
     */
    apiAccessListRequired?: pulumi.Input<boolean>;
    description: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
     */
    federationSettingsId?: pulumi.Input<string>;
    /**
     * Flag that indicates whether this organization has access to generative AI features. This setting only applies to Atlas Commercial and defaults to `true`. With this setting on, Project Owners may be able to enable or disable individual AI features at the project level. To learn more, see https://www.mongodb.com/docs/generative-ai-faq/.
     */
    genAiFeaturesEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
     */
    multiFactorAuthRequired?: pulumi.Input<boolean>;
    /**
     * The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
     */
    name?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
     */
    orgOwnerId: pulumi.Input<string>;
    /**
     * Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
     */
    restrictEmployeeAccess?: pulumi.Input<boolean>;
    /**
     * List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
     */
    roleNames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * String that specifies a single email address for the specified organization to receive security-related notifications. Specifying a security contact does not grant them authorization or access to Atlas for security decisions or approvals.
     */
    securityContact?: pulumi.Input<string>;
    skipDefaultAlertsSettings?: pulumi.Input<boolean>;
}
