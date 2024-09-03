// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * # Data Source: mongodbatlas.getCloudBackupSnapshotExportBuckets
 *
 * `mongodbatlas.getCloudBackupSnapshotExportBuckets` datasource allows you to retrieve all the buckets for the specified project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCloudBackupSnapshotExportBucket = new mongodbatlas.CloudBackupSnapshotExportBucket("test", {
 *     projectId: "{PROJECT_ID}",
 *     iamRoleId: "{IAM_ROLE_ID}",
 *     bucketName: "example-bucket",
 *     cloudProvider: "AWS",
 * });
 * const test = mongodbatlas.getCloudBackupSnapshotExportBuckets({
 *     projectId: "{PROJECT_ID}",
 * });
 * ```
 */
export function getCloudBackupSnapshotExportBuckets(args: GetCloudBackupSnapshotExportBucketsArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotExportBucketsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshotExportBuckets:getCloudBackupSnapshotExportBuckets", {
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotExportBuckets.
 */
export interface GetCloudBackupSnapshotExportBucketsArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: number;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: string;
}

/**
 * A collection of values returned by getCloudBackupSnapshotExportBuckets.
 */
export interface GetCloudBackupSnapshotExportBucketsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly pageNum?: number;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    readonly projectId: string;
    /**
     * Includes CloudProviderSnapshotExportBucket object for each item detailed in the results array section.
     * * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
     */
    readonly results: outputs.GetCloudBackupSnapshotExportBucketsResult[];
    readonly totalCount: number;
}
/**
 * # Data Source: mongodbatlas.getCloudBackupSnapshotExportBuckets
 *
 * `mongodbatlas.getCloudBackupSnapshotExportBuckets` datasource allows you to retrieve all the buckets for the specified project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCloudBackupSnapshotExportBucket = new mongodbatlas.CloudBackupSnapshotExportBucket("test", {
 *     projectId: "{PROJECT_ID}",
 *     iamRoleId: "{IAM_ROLE_ID}",
 *     bucketName: "example-bucket",
 *     cloudProvider: "AWS",
 * });
 * const test = mongodbatlas.getCloudBackupSnapshotExportBuckets({
 *     projectId: "{PROJECT_ID}",
 * });
 * ```
 */
export function getCloudBackupSnapshotExportBucketsOutput(args: GetCloudBackupSnapshotExportBucketsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotExportBucketsResult> {
    return pulumi.output(args).apply((a: any) => getCloudBackupSnapshotExportBuckets(a, opts))
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotExportBuckets.
 */
export interface GetCloudBackupSnapshotExportBucketsOutputArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
}
