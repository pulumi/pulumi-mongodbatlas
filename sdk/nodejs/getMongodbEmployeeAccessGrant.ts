// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.MongodbEmployeeAccessGrant
 *
 * `mongodbatlas.MongodbEmployeeAccessGrant` describes a MongoDB employee access grant.
 *
 * ## Example Usage
 *
 * ### S
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const example = new mongodbatlas.MongodbEmployeeAccessGrant("example", {
 *     projectId: projectId,
 *     clusterName: clusterName,
 *     grantType: "CLUSTER_INFRASTRUCTURE_AND_APP_SERVICES_SYNC_DATA",
 *     expirationTime: "2025-01-01T12:00:00Z",
 * });
 * const dsExample = mongodbatlas.getMongodbEmployeeAccessGrant({
 *     projectId: projectId,
 *     clusterName: clusterName,
 * });
 * export const grantType = dsExample.then(dsExample => dsExample.grantType);
 * export const expirationTime = dsExample.then(dsExample => dsExample.expirationTime);
 * ```
 */
export function getMongodbEmployeeAccessGrant(args: GetMongodbEmployeeAccessGrantArgs, opts?: pulumi.InvokeOptions): Promise<GetMongodbEmployeeAccessGrantResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getMongodbEmployeeAccessGrant:getMongodbEmployeeAccessGrant", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getMongodbEmployeeAccessGrant.
 */
export interface GetMongodbEmployeeAccessGrantArgs {
    /**
     * Human-readable label that identifies this cluster.
     */
    clusterName: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: string;
}

/**
 * A collection of values returned by getMongodbEmployeeAccessGrant.
 */
export interface GetMongodbEmployeeAccessGrantResult {
    /**
     * Human-readable label that identifies this cluster.
     */
    readonly clusterName: string;
    readonly expirationTime: string;
    readonly grantType: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    readonly projectId: string;
}
/**
 * ## # Data Source: mongodbatlas.MongodbEmployeeAccessGrant
 *
 * `mongodbatlas.MongodbEmployeeAccessGrant` describes a MongoDB employee access grant.
 *
 * ## Example Usage
 *
 * ### S
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const example = new mongodbatlas.MongodbEmployeeAccessGrant("example", {
 *     projectId: projectId,
 *     clusterName: clusterName,
 *     grantType: "CLUSTER_INFRASTRUCTURE_AND_APP_SERVICES_SYNC_DATA",
 *     expirationTime: "2025-01-01T12:00:00Z",
 * });
 * const dsExample = mongodbatlas.getMongodbEmployeeAccessGrant({
 *     projectId: projectId,
 *     clusterName: clusterName,
 * });
 * export const grantType = dsExample.then(dsExample => dsExample.grantType);
 * export const expirationTime = dsExample.then(dsExample => dsExample.expirationTime);
 * ```
 */
export function getMongodbEmployeeAccessGrantOutput(args: GetMongodbEmployeeAccessGrantOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMongodbEmployeeAccessGrantResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getMongodbEmployeeAccessGrant:getMongodbEmployeeAccessGrant", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getMongodbEmployeeAccessGrant.
 */
export interface GetMongodbEmployeeAccessGrantOutputArgs {
    /**
     * Human-readable label that identifies this cluster.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: pulumi.Input<string>;
}
