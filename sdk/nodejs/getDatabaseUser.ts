// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.DatabaseUser` describe a Database User. This represents a database user which will be applied to all clusters within the project.
 *
 * Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 */
export function getDatabaseUser(args: GetDatabaseUserArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseUserResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/getDatabaseUser:getDatabaseUser", {
        "authDatabaseName": args.authDatabaseName,
        "databaseName": args.databaseName,
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
    readonly authDatabaseName?: string;
    /**
     * Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     *
     * @deprecated use auth_database_name instead
     */
    readonly databaseName?: string;
    /**
     * The unique ID for the project to create the database user.
     */
    readonly projectId: string;
    /**
     * Username for authenticating to MongoDB.
     */
    readonly username: string;
}

/**
 * A collection of values returned by getDatabaseUser.
 */
export interface GetDatabaseUserResult {
    readonly authDatabaseName?: string;
    /**
     * The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
     */
    readonly awsIamType: string;
    /**
     * Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     *
     * @deprecated use auth_database_name instead
     */
    readonly databaseName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: outputs.GetDatabaseUserLabel[];
    readonly projectId: string;
    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     */
    readonly roles: outputs.GetDatabaseUserRole[];
    readonly username: string;
    /**
     * X.509 method by which the provided username is authenticated.
     */
    readonly x509Type: string;
}
