// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.
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
 *     bucketName: "example_bucket",
 *     cloudProvider: "AWS",
 * });
 * const testCloudBackupSnapshotExportJob = new mongodbatlas.CloudBackupSnapshotExportJob("test", {
 *     projectId: "{PROJECT_ID}",
 *     clusterName: "{CLUSTER_NAME}",
 *     snapshotId: "{SNAPSHOT_ID}",
 *     exportBucketId: testCloudBackupSnapshotExportBucket.exportBucketId,
 *     customDatas: [{
 *         key: "exported by",
 *         value: "myName",
 *     }],
 * });
 * const test = mongodbatlas.getCloudBackupSnapshotExportJobOutput({
 *     projectId: "{PROJECT_ID}",
 *     clusterName: "{CLUSTER_NAME}",
 *     exportJobId: testCloudBackupSnapshotExportJob.exportJobId,
 * });
 * ```
 */
export function getCloudBackupSnapshotExportJob(args: GetCloudBackupSnapshotExportJobArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotExportJobResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob", {
        "clusterName": args.clusterName,
        "exportJobId": args.exportJobId,
        "id": args.id,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotExportJob.
 */
export interface GetCloudBackupSnapshotExportJobArgs {
    /**
     * Name of the Atlas cluster whose export job you want to retrieve.
     */
    clusterName: string;
    /**
     * Unique identifier of the export job to retrieve.
     */
    exportJobId: string;
    /**
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0. Will not be an input parameter, only computed.
     */
    id?: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
     */
    projectId: string;
}

/**
 * A collection of values returned by getCloudBackupSnapshotExportJob.
 */
export interface GetCloudBackupSnapshotExportJobResult {
    readonly clusterName: string;
    /**
     * _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     */
    readonly components: outputs.GetCloudBackupSnapshotExportJobComponent[];
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     */
    readonly createdAt: string;
    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     */
    readonly customDatas: outputs.GetCloudBackupSnapshotExportJobCustomData[];
    /**
     * Error message, only if the export job failed.
     */
    readonly errMsg: string;
    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
     */
    readonly exportBucketId: string;
    /**
     * Unique identifier of the export job.
     * * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     */
    readonly exportJobId: string;
    readonly exportStatusExportedCollections: number;
    readonly exportStatusTotalCollections: number;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     */
    readonly finishedAt: string;
    /**
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0. Will not be an input parameter, only computed.
     */
    readonly id: string;
    readonly prefix: string;
    readonly projectId: string;
    /**
     * Unique identifier of the Cloud Backup snapshot to export.
     */
    readonly snapshotId: string;
    /**
     * Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     */
    readonly state: string;
}
/**
 * `mongodbatlas.CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.
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
 *     bucketName: "example_bucket",
 *     cloudProvider: "AWS",
 * });
 * const testCloudBackupSnapshotExportJob = new mongodbatlas.CloudBackupSnapshotExportJob("test", {
 *     projectId: "{PROJECT_ID}",
 *     clusterName: "{CLUSTER_NAME}",
 *     snapshotId: "{SNAPSHOT_ID}",
 *     exportBucketId: testCloudBackupSnapshotExportBucket.exportBucketId,
 *     customDatas: [{
 *         key: "exported by",
 *         value: "myName",
 *     }],
 * });
 * const test = mongodbatlas.getCloudBackupSnapshotExportJobOutput({
 *     projectId: "{PROJECT_ID}",
 *     clusterName: "{CLUSTER_NAME}",
 *     exportJobId: testCloudBackupSnapshotExportJob.exportJobId,
 * });
 * ```
 */
export function getCloudBackupSnapshotExportJobOutput(args: GetCloudBackupSnapshotExportJobOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotExportJobResult> {
    return pulumi.output(args).apply((a: any) => getCloudBackupSnapshotExportJob(a, opts))
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotExportJob.
 */
export interface GetCloudBackupSnapshotExportJobOutputArgs {
    /**
     * Name of the Atlas cluster whose export job you want to retrieve.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Unique identifier of the export job to retrieve.
     */
    exportJobId: pulumi.Input<string>;
    /**
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0. Will not be an input parameter, only computed.
     */
    id?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
     */
    projectId: pulumi.Input<string>;
}