// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.LdapConfiguration
 *
 * `mongodbatlas.LdapConfiguration` describes a LDAP Configuration.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testProject = new mongodbatlas.Project("test", {
 *     name: "NAME OF THE PROJECT",
 *     orgId: "ORG ID",
 * });
 * const testLdapConfiguration = new mongodbatlas.LdapConfiguration("test", {
 *     projectId: testProject.id,
 *     authenticationEnabled: true,
 *     hostname: "HOSTNAME",
 *     port: 636,
 *     bindUsername: "USERNAME",
 *     bindPassword: "PASSWORD",
 * });
 * const test = mongodbatlas.getLdapConfigurationOutput({
 *     projectId: testLdapConfiguration.id,
 * });
 * ```
 */
export function getLdapConfiguration(args: GetLdapConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetLdapConfigurationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getLdapConfiguration:getLdapConfiguration", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLdapConfiguration.
 */
export interface GetLdapConfigurationArgs {
    /**
     * Identifier for the Atlas project associated with the LDAP over TLS/SSL configuration.
     */
    projectId: string;
}

/**
 * A collection of values returned by getLdapConfiguration.
 */
export interface GetLdapConfigurationResult {
    /**
     * Specifies whether user authentication with LDAP is enabled.
     */
    readonly authenticationEnabled: boolean;
    /**
     * Specifies whether user authorization with LDAP is enabled.
     */
    readonly authorizationEnabled: boolean;
    /**
     * An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs.
     */
    readonly authzQueryTemplate: string;
    /**
     * The password used to authenticate the `bindUsername`.
     */
    readonly bindPassword: string;
    /**
     * The user DN that Atlas uses to connect to the LDAP server.
     */
    readonly bindUsername: string;
    /**
     * CA certificate used to verify the identify of the LDAP server.
     */
    readonly caCertificate: string;
    /**
     * (Required) The hostname or IP address of the LDAP server.
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The port to which the LDAP server listens for client connections.
     */
    readonly port: number;
    readonly projectId: string;
    /**
     * Maps an LDAP username for authentication to an LDAP Distinguished Name (DN).
     */
    readonly userToDnMappings: outputs.GetLdapConfigurationUserToDnMapping[];
}
/**
 * ## # Data Source: mongodbatlas.LdapConfiguration
 *
 * `mongodbatlas.LdapConfiguration` describes a LDAP Configuration.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testProject = new mongodbatlas.Project("test", {
 *     name: "NAME OF THE PROJECT",
 *     orgId: "ORG ID",
 * });
 * const testLdapConfiguration = new mongodbatlas.LdapConfiguration("test", {
 *     projectId: testProject.id,
 *     authenticationEnabled: true,
 *     hostname: "HOSTNAME",
 *     port: 636,
 *     bindUsername: "USERNAME",
 *     bindPassword: "PASSWORD",
 * });
 * const test = mongodbatlas.getLdapConfigurationOutput({
 *     projectId: testLdapConfiguration.id,
 * });
 * ```
 */
export function getLdapConfigurationOutput(args: GetLdapConfigurationOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLdapConfigurationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getLdapConfiguration:getLdapConfiguration", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLdapConfiguration.
 */
export interface GetLdapConfigurationOutputArgs {
    /**
     * Identifier for the Atlas project associated with the LDAP over TLS/SSL configuration.
     */
    projectId: pulumi.Input<string>;
}
