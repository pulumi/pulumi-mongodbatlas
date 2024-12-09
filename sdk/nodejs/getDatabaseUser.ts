// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.DatabaseUser
 *
 * `mongodbatlas.DatabaseUser` describes a Database User. This represents a database user which will be applied to all clusters within the project.
 *
 * Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatabaseUser = new mongodbatlas.DatabaseUser("test", {
 *     username: "test-acc-username",
 *     password: "test-acc-password",
 *     projectId: "<PROJECT-ID>",
 *     authDatabaseName: "admin",
 *     roles: [
 *         {
 *             roleName: "readWrite",
 *             databaseName: "admin",
 *         },
 *         {
 *             roleName: "atlasAdmin",
 *             databaseName: "admin",
 *         },
 *     ],
 *     labels: [
 *         {
 *             key: "key 1",
 *             value: "value 1",
 *         },
 *         {
 *             key: "key 2",
 *             value: "value 2",
 *         },
 *     ],
 * });
 * const test = mongodbatlas.getDatabaseUserOutput({
 *     projectId: testDatabaseUser.projectId,
 *     username: testDatabaseUser.username,
 * });
 * ```
 *
 * **Example of usage with a OIDC federated authentication user**
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatabaseUser = new mongodbatlas.DatabaseUser("test", {
 *     username: "64d613677e1ad50839cce4db/testUserOrGroup",
 *     projectId: "6414908c207f4d22f4d8f232",
 *     authDatabaseName: "admin",
 *     oidcAuthType: "IDP_GROUP",
 *     roles: [{
 *         roleName: "readWriteAnyDatabase",
 *         databaseName: "admin",
 *     }],
 * });
 * const test = mongodbatlas.getDatabaseUserOutput({
 *     username: testDatabaseUser.username,
 *     projectId: "6414908c207f4d22f4d8f232",
 *     authDatabaseName: "admin",
 * });
 * ```
 * Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
 */
export function getDatabaseUser(args: GetDatabaseUserArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getDatabaseUser:getDatabaseUser", {
        "authDatabaseName": args.authDatabaseName,
        "projectId": args.projectId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseUser.
 */
export interface GetDatabaseUserArgs {
    /**
     * The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is almost always the admin database, for X509 it is $external.
     */
    authDatabaseName: string;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: string;
    /**
     * Username for authenticating to MongoDB.
     */
    username: string;
}

/**
 * A collection of values returned by getDatabaseUser.
 */
export interface GetDatabaseUserResult {
    readonly authDatabaseName: string;
    /**
     * The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
     */
    readonly awsIamType: string;
    /**
     * Autogenerated Unique ID for this data source.
     */
    readonly id: string;
    readonly labels: outputs.GetDatabaseUserLabel[];
    /**
     * Method by which the provided username is authenticated. Default is `NONE`. Other valid values are: `USER`, `GROUP`.
     */
    readonly ldapAuthType: string;
    /**
     * (Optional) Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     * * `NONE` -	The user does not use OIDC federated authentication.
     * * `IDP_GROUP` - OIDC Workforce federated authentication group. To learn more about OIDC federated authentication, see [Set up Workforce Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
     * * `USER` - OIDC Workload federated authentication user. To learn more about OIDC federated authentication, see [Set up Workload Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
     */
    readonly oidcAuthType: string;
    readonly projectId: string;
    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     */
    readonly roles: outputs.GetDatabaseUserRole[];
    /**
     * Array of clusters and Atlas Data Lakes that this user has access to.
     */
    readonly scopes: outputs.GetDatabaseUserScope[];
    readonly username: string;
    /**
     * X.509 method by which the provided username is authenticated.
     */
    readonly x509Type: string;
}
/**
 * ## # Data Source: mongodbatlas.DatabaseUser
 *
 * `mongodbatlas.DatabaseUser` describes a Database User. This represents a database user which will be applied to all clusters within the project.
 *
 * Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatabaseUser = new mongodbatlas.DatabaseUser("test", {
 *     username: "test-acc-username",
 *     password: "test-acc-password",
 *     projectId: "<PROJECT-ID>",
 *     authDatabaseName: "admin",
 *     roles: [
 *         {
 *             roleName: "readWrite",
 *             databaseName: "admin",
 *         },
 *         {
 *             roleName: "atlasAdmin",
 *             databaseName: "admin",
 *         },
 *     ],
 *     labels: [
 *         {
 *             key: "key 1",
 *             value: "value 1",
 *         },
 *         {
 *             key: "key 2",
 *             value: "value 2",
 *         },
 *     ],
 * });
 * const test = mongodbatlas.getDatabaseUserOutput({
 *     projectId: testDatabaseUser.projectId,
 *     username: testDatabaseUser.username,
 * });
 * ```
 *
 * **Example of usage with a OIDC federated authentication user**
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatabaseUser = new mongodbatlas.DatabaseUser("test", {
 *     username: "64d613677e1ad50839cce4db/testUserOrGroup",
 *     projectId: "6414908c207f4d22f4d8f232",
 *     authDatabaseName: "admin",
 *     oidcAuthType: "IDP_GROUP",
 *     roles: [{
 *         roleName: "readWriteAnyDatabase",
 *         databaseName: "admin",
 *     }],
 * });
 * const test = mongodbatlas.getDatabaseUserOutput({
 *     username: testDatabaseUser.username,
 *     projectId: "6414908c207f4d22f4d8f232",
 *     authDatabaseName: "admin",
 * });
 * ```
 * Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
 */
export function getDatabaseUserOutput(args: GetDatabaseUserOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDatabaseUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getDatabaseUser:getDatabaseUser", {
        "authDatabaseName": args.authDatabaseName,
        "projectId": args.projectId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseUser.
 */
export interface GetDatabaseUserOutputArgs {
    /**
     * The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is almost always the admin database, for X509 it is $external.
     */
    authDatabaseName: pulumi.Input<string>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
    /**
     * Username for authenticating to MongoDB.
     */
    username: pulumi.Input<string>;
}
