// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testProject = new mongodbatlas.Project("testProject", {orgId: "ORG ID"});
 * const testLdapConfiguration = new mongodbatlas.LdapConfiguration("testLdapConfiguration", {
 *     projectId: testProject.id,
 *     authenticationEnabled: true,
 *     hostname: "HOSTNAME",
 *     port: 636,
 *     bindUsername: "USERNAME",
 *     bindPassword: "PASSWORD",
 * });
 * ```
 * ### LDAP With User To DN Mapping
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testProject = new mongodbatlas.Project("testProject", {orgId: "ORG ID"});
 * const testLdapConfiguration = new mongodbatlas.LdapConfiguration("testLdapConfiguration", {
 *     projectId: testProject.id,
 *     authenticationEnabled: true,
 *     hostname: "HOSTNAME",
 *     port: 636,
 *     bindUsername: "USERNAME",
 *     bindPassword: "PASSWORD",
 *     caCertificate: "CA CERTIFICATE",
 *     authzQueryTemplate: "{USER}?memberOf?base",
 *     userToDnMappings: [{
 *         match: "(.+)",
 *         ldapQuery: "DC=example,DC=com??sub?(userPrincipalName={0})",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * LDAP Configuration must be imported using project ID, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/ldapConfiguration:LdapConfiguration test 5d09d6a59ccf6445652a444a
 * ```
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save)
 */
export class LdapConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing LdapConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LdapConfigurationState, opts?: pulumi.CustomResourceOptions): LdapConfiguration {
        return new LdapConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/ldapConfiguration:LdapConfiguration';

    /**
     * Returns true if the given object is an instance of LdapConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LdapConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LdapConfiguration.__pulumiType;
    }

    /**
     * Specifies whether user authentication with LDAP is enabled.
     */
    public readonly authenticationEnabled!: pulumi.Output<boolean>;
    /**
     * Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
     */
    public readonly authorizationEnabled!: pulumi.Output<boolean>;
    /**
     * An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
     */
    public readonly authzQueryTemplate!: pulumi.Output<string>;
    /**
     * The password used to authenticate the `bindUsername`.
     */
    public readonly bindPassword!: pulumi.Output<string>;
    /**
     * The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
     */
    public readonly bindUsername!: pulumi.Output<string>;
    /**
     * CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
     */
    public readonly caCertificate!: pulumi.Output<string>;
    /**
     * The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * The port to which the LDAP server listens for client connections. Default: `636`
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The unique ID for the project to configure LDAP.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldapQuery` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
     * * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldapQuery` template.
     * * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     */
    public readonly userToDnMappings!: pulumi.Output<outputs.LdapConfigurationUserToDnMapping[]>;

    /**
     * Create a LdapConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LdapConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LdapConfigurationArgs | LdapConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LdapConfigurationState | undefined;
            resourceInputs["authenticationEnabled"] = state ? state.authenticationEnabled : undefined;
            resourceInputs["authorizationEnabled"] = state ? state.authorizationEnabled : undefined;
            resourceInputs["authzQueryTemplate"] = state ? state.authzQueryTemplate : undefined;
            resourceInputs["bindPassword"] = state ? state.bindPassword : undefined;
            resourceInputs["bindUsername"] = state ? state.bindUsername : undefined;
            resourceInputs["caCertificate"] = state ? state.caCertificate : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["userToDnMappings"] = state ? state.userToDnMappings : undefined;
        } else {
            const args = argsOrState as LdapConfigurationArgs | undefined;
            if ((!args || args.authenticationEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authenticationEnabled'");
            }
            if ((!args || args.bindPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindPassword'");
            }
            if ((!args || args.bindUsername === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bindUsername'");
            }
            if ((!args || args.hostname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostname'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["authenticationEnabled"] = args ? args.authenticationEnabled : undefined;
            resourceInputs["authorizationEnabled"] = args ? args.authorizationEnabled : undefined;
            resourceInputs["authzQueryTemplate"] = args ? args.authzQueryTemplate : undefined;
            resourceInputs["bindPassword"] = args?.bindPassword ? pulumi.secret(args.bindPassword) : undefined;
            resourceInputs["bindUsername"] = args ? args.bindUsername : undefined;
            resourceInputs["caCertificate"] = args ? args.caCertificate : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["userToDnMappings"] = args ? args.userToDnMappings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["bindPassword"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(LdapConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LdapConfiguration resources.
 */
export interface LdapConfigurationState {
    /**
     * Specifies whether user authentication with LDAP is enabled.
     */
    authenticationEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
     */
    authorizationEnabled?: pulumi.Input<boolean>;
    /**
     * An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
     */
    authzQueryTemplate?: pulumi.Input<string>;
    /**
     * The password used to authenticate the `bindUsername`.
     */
    bindPassword?: pulumi.Input<string>;
    /**
     * The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
     */
    bindUsername?: pulumi.Input<string>;
    /**
     * CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
     */
    caCertificate?: pulumi.Input<string>;
    /**
     * The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The port to which the LDAP server listens for client connections. Default: `636`
     */
    port?: pulumi.Input<number>;
    /**
     * The unique ID for the project to configure LDAP.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldapQuery` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
     * * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldapQuery` template.
     * * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     */
    userToDnMappings?: pulumi.Input<pulumi.Input<inputs.LdapConfigurationUserToDnMapping>[]>;
}

/**
 * The set of arguments for constructing a LdapConfiguration resource.
 */
export interface LdapConfigurationArgs {
    /**
     * Specifies whether user authentication with LDAP is enabled.
     */
    authenticationEnabled: pulumi.Input<boolean>;
    /**
     * Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
     */
    authorizationEnabled?: pulumi.Input<boolean>;
    /**
     * An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
     */
    authzQueryTemplate?: pulumi.Input<string>;
    /**
     * The password used to authenticate the `bindUsername`.
     */
    bindPassword: pulumi.Input<string>;
    /**
     * The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
     */
    bindUsername: pulumi.Input<string>;
    /**
     * CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
     */
    caCertificate?: pulumi.Input<string>;
    /**
     * The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
     */
    hostname: pulumi.Input<string>;
    /**
     * The port to which the LDAP server listens for client connections. Default: `636`
     */
    port?: pulumi.Input<number>;
    /**
     * The unique ID for the project to configure LDAP.
     */
    projectId: pulumi.Input<string>;
    /**
     * Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldapQuery` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
     * * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldapQuery` template.
     * * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     */
    userToDnMappings?: pulumi.Input<pulumi.Input<inputs.LdapConfigurationUserToDnMapping>[]>;
}
