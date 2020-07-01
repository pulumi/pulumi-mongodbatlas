// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 * ### Example Usage: Generate an Atlas-managed X.509 certificate for a MongoDB user
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const user = new mongodbatlas.DatabaseUser("user", {
 *     databaseName: "$external",
 *     labels: [{
 *         key: "My Key",
 *         value: "My Value",
 *     }],
 *     projectId: "<PROJECT-ID>",
 *     roles: [{
 *         databaseName: "admin",
 *         roleName: "atlasAdmin",
 *     }],
 *     username: "myUsername",
 *     x509Type: "MANAGED",
 * });
 * const testX509AuthenticationDatabaseUser = new mongodbatlas.X509AuthenticationDatabaseUser("test", {
 *     monthsUntilExpiration: 2,
 *     projectId: user.projectId,
 *     username: user.username,
 * });
 * const test509AuthenticationDatabaseUser = pulumi.all([testX509AuthenticationDatabaseUser.projectId, testX509AuthenticationDatabaseUser.username]).apply(([projectId, username]) => mongodbatlas.get509AuthenticationDatabaseUser({
 *     projectId: projectId,
 *     username: username,
 * }, { async: true }));
 * ```
 * ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testX509AuthenticationDatabaseUser = new mongodbatlas.X509AuthenticationDatabaseUser("test", {
 *     customerX509Cas: `  -----BEGIN CERTIFICATE-----
 *   MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
 *   VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
 *   c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
 *   SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
 *   MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
 *   VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
 *   BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
 *   c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
 *   iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
 *   cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
 *   Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
 *   SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
 *   7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
 *   iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
 *   -----END CERTIFICATE-----"
 * `,
 *     projectId: "<PROJECT-ID>",
 * });
 * const test509AuthenticationDatabaseUser = testX509AuthenticationDatabaseUser.projectId.apply(projectId => mongodbatlas.get509AuthenticationDatabaseUser({
 *     projectId: projectId,
 * }, { async: true }));
 * ```
 */
export function get509AuthenticationDatabaseUser(args: Get509AuthenticationDatabaseUserArgs, opts?: pulumi.InvokeOptions): Promise<Get509AuthenticationDatabaseUserResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/get509AuthenticationDatabaseUser:get509AuthenticationDatabaseUser", {
        "projectId": args.projectId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking get509AuthenticationDatabaseUser.
 */
export interface Get509AuthenticationDatabaseUserArgs {
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     */
    readonly projectId: string;
    /**
     * Username of the database user to create a certificate for.
     */
    readonly username?: string;
}

/**
 * A collection of values returned by get509AuthenticationDatabaseUser.
 */
export interface Get509AuthenticationDatabaseUserResult {
    /**
     * Array of objects where each details one unexpired database user certificate.
     */
    readonly certificates: outputs.Get509AuthenticationDatabaseUserCertificate[];
    readonly customerX509Cas: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    readonly username?: string;
}
