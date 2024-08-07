// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.CloudBackupSnapshotExportBucket
 *
 * `mongodbatlas.CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.
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
 * const test = mongodbatlas.getCloudBackupSnapshotExportBucketOutput({
 *     projectId: "{PROJECT_ID}",
 *     exportBucketId: testCloudBackupSnapshotExportBucket.exportBucketId,
 * });
 * ```
 */
export function getCloudBackupSnapshotExportBucket(args: GetCloudBackupSnapshotExportBucketArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotExportBucketResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshotExportBucket:getCloudBackupSnapshotExportBucket", {
        "exportBucketId": args.exportBucketId,
        "id": args.id,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotExportBucket.
 */
export interface GetCloudBackupSnapshotExportBucketArgs {
    /**
     * Unique identifier of the snapshot export bucket.
     */
    exportBucketId: string;
    /**
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0. Will not be an input parameter, only computed.
     */
    id?: string;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: string;
}

/**
 * A collection of values returned by getCloudBackupSnapshotExportBucket.
 */
export interface GetCloudBackupSnapshotExportBucketResult {
    /**
     * Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
     */
    readonly bucketName: string;
    /**
     * Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
     */
    readonly cloudProvider: string;
    readonly exportBucketId: string;
    /**
     * Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
     */
    readonly iamRoleId: string;
    /**
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0. Will not be an input parameter, only computed.
     */
    readonly id: string;
    readonly projectId: string;
}
/**
 * ## # Data Source: mongodbatlas.CloudBackupSnapshotExportBucket
 *
 * `mongodbatlas.CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.
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
 * const test = mongodbatlas.getCloudBackupSnapshotExportBucketOutput({
 *     projectId: "{PROJECT_ID}",
 *     exportBucketId: testCloudBackupSnapshotExportBucket.exportBucketId,
 * });
 * ```
 */
export function getCloudBackupSnapshotExportBucketOutput(args: GetCloudBackupSnapshotExportBucketOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotExportBucketResult> {
    return pulumi.output(args).apply((a: any) => getCloudBackupSnapshotExportBucket(a, opts))
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotExportBucket.
 */
export interface GetCloudBackupSnapshotExportBucketOutputArgs {
    /**
     * Unique identifier of the snapshot export bucket.
     */
    exportBucketId: pulumi.Input<string>;
    /**
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0. Will not be an input parameter, only computed.
     */
    id?: pulumi.Input<string>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
}
