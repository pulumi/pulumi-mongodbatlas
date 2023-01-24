// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getCloudBackupSnapshotRestoreJobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * First create a snapshot of the desired cluster. Then request that snapshot be restored in an automated fashion to the designated cluster and project.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCloudBackupSnapshot = new mongodbatlas.CloudBackupSnapshot("testCloudBackupSnapshot", {
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     clusterName: "MyCluster",
 *     description: "MyDescription",
 *     retentionInDays: 1,
 * });
 * const testCloudBackupSnapshotRestoreJob = new mongodbatlas.CloudBackupSnapshotRestoreJob("testCloudBackupSnapshotRestoreJob", {
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     clusterName: "MyCluster",
 *     snapshotId: testCloudBackupSnapshot.id,
 *     deliveryTypeConfig: {
 *         automated: true,
 *         targetClusterName: "MyCluster",
 *         targetProjectId: "5cf5a45a9ccf6400e60981b6",
 *     },
 * });
 * const testCloudBackupSnapshotRestoreJobs = pulumi.all([testCloudBackupSnapshotRestoreJob.projectId, testCloudBackupSnapshotRestoreJob.clusterName]).apply(([projectId, clusterName]) => mongodbatlas.getCloudBackupSnapshotRestoreJobsOutput({
 *     projectId: projectId,
 *     clusterName: clusterName,
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * }));
 * ```
 */
export function getCloudBackupSnapshotRestoreJobs(args: GetCloudBackupSnapshotRestoreJobsArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotRestoreJobsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshotRestoreJobs:getCloudBackupSnapshotRestoreJobs", {
        "clusterName": args.clusterName,
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotRestoreJobs.
 */
export interface GetCloudBackupSnapshotRestoreJobsArgs {
    /**
     * The name of the Atlas cluster for which you want to retrieve restore jobs.
     */
    clusterName: string;
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
 * A collection of values returned by getCloudBackupSnapshotRestoreJobs.
 */
export interface GetCloudBackupSnapshotRestoreJobsResult {
    readonly clusterName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly pageNum?: number;
    readonly projectId: string;
    /**
     * Includes cloudProviderSnapshotRestoreJob object for each item detailed in the results array section.
     */
    readonly results: outputs.GetCloudBackupSnapshotRestoreJobsResult[];
    readonly totalCount: number;
}
/**
 * `mongodbatlas.getCloudBackupSnapshotRestoreJobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * First create a snapshot of the desired cluster. Then request that snapshot be restored in an automated fashion to the designated cluster and project.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCloudBackupSnapshot = new mongodbatlas.CloudBackupSnapshot("testCloudBackupSnapshot", {
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     clusterName: "MyCluster",
 *     description: "MyDescription",
 *     retentionInDays: 1,
 * });
 * const testCloudBackupSnapshotRestoreJob = new mongodbatlas.CloudBackupSnapshotRestoreJob("testCloudBackupSnapshotRestoreJob", {
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     clusterName: "MyCluster",
 *     snapshotId: testCloudBackupSnapshot.id,
 *     deliveryTypeConfig: {
 *         automated: true,
 *         targetClusterName: "MyCluster",
 *         targetProjectId: "5cf5a45a9ccf6400e60981b6",
 *     },
 * });
 * const testCloudBackupSnapshotRestoreJobs = pulumi.all([testCloudBackupSnapshotRestoreJob.projectId, testCloudBackupSnapshotRestoreJob.clusterName]).apply(([projectId, clusterName]) => mongodbatlas.getCloudBackupSnapshotRestoreJobsOutput({
 *     projectId: projectId,
 *     clusterName: clusterName,
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * }));
 * ```
 */
export function getCloudBackupSnapshotRestoreJobsOutput(args: GetCloudBackupSnapshotRestoreJobsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotRestoreJobsResult> {
    return pulumi.output(args).apply((a: any) => getCloudBackupSnapshotRestoreJobs(a, opts))
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotRestoreJobs.
 */
export interface GetCloudBackupSnapshotRestoreJobsOutputArgs {
    /**
     * The name of the Atlas cluster for which you want to retrieve restore jobs.
     */
    clusterName: pulumi.Input<string>;
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
