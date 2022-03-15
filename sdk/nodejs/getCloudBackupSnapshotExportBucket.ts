// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getCloudBackupSnapshotExportBucket(args: GetCloudBackupSnapshotExportBucketArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotExportBucketResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshotExportBucket:getCloudBackupSnapshotExportBucket", {
        "exportBucketId": args.exportBucketId,
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
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
}

export function getCloudBackupSnapshotExportBucketOutput(args: GetCloudBackupSnapshotExportBucketOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotExportBucketResult> {
    return pulumi.output(args).apply(a => getCloudBackupSnapshotExportBucket(a, opts))
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
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
}
