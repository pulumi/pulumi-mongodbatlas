// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getCustomDbRoles` describe all Custom DB Roles. This represents a custom db roles.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatabaseUser = new mongodbatlas.DatabaseUser("testDatabaseUser", {
 *     username: "test-acc-username",
 *     password: "test-acc-password",
 *     projectId: "<PROJECT-ID>",
 *     databaseName: "admin",
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
 * });
 * const testCustomDbRoles = mongodbatlas.getCustomDbRoles({
 *     projectId: mongodbatlas_custom_db_role.test.project_id,
 * });
 * ```
 */
export function getCustomDbRoles(args: GetCustomDbRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomDbRolesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/getCustomDbRoles:getCustomDbRoles", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomDbRoles.
 */
export interface GetCustomDbRolesArgs {
    /**
     * The unique ID for the project to get all custom db roles.
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getCustomDbRoles.
 */
export interface GetCustomDbRolesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a custom db roles.
     */
    readonly results: outputs.GetCustomDbRolesResult[];
}
