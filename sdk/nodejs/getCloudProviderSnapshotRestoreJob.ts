// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CloudProviderSnapshotRestoreJob` provides a Cloud Backup Snapshot Restore Job datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
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
 * const testCloudProviderSnapshot = new mongodbatlas.CloudProviderSnapshot("test", {
 *     clusterName: "MyCluster",
 *     description: "MyDescription",
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     retentionInDays: 1,
 * });
 * const testMongodbatlasCloudProviderSnapshotRestoreJob = new mongodbatlas.CloudProviderSnapshotRestoreJob("test", {
 *     clusterName: "MyCluster",
 *     deliveryType: {
 *         automated: true,
 *         target_cluster_name: "MyCluster",
 *         target_project_id: "5cf5a45a9ccf6400e60981b6",
 *     },
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     snapshotId: testCloudProviderSnapshot.id,
 * });
 * const testCloudProviderSnapshotRestoreJob = pulumi.all([testMongodbatlasCloudProviderSnapshotRestoreJob.clusterName, testMongodbatlasCloudProviderSnapshotRestoreJob.id, testMongodbatlasCloudProviderSnapshotRestoreJob.projectId]).apply(([clusterName, id, projectId]) => mongodbatlas.getCloudProviderSnapshotRestoreJob({
 *     clusterName: clusterName,
 *     jobId: id,
 *     projectId: projectId,
 * }, { async: true }));
 * ```
 */
export function getCloudProviderSnapshotRestoreJob(args: GetCloudProviderSnapshotRestoreJobArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudProviderSnapshotRestoreJobResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudProviderSnapshotRestoreJob:getCloudProviderSnapshotRestoreJob", {
        "clusterName": args.clusterName,
        "jobId": args.jobId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudProviderSnapshotRestoreJob.
 */
export interface GetCloudProviderSnapshotRestoreJobArgs {
    /**
     * The name of the Atlas cluster for which you want to retrieve the restore job.
     */
    readonly clusterName: string;
    /**
     * The unique identifier of the restore job to retrieve.
     */
    readonly jobId: string;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getCloudProviderSnapshotRestoreJob.
 */
export interface GetCloudProviderSnapshotRestoreJobResult {
    /**
     * Indicates whether the restore job was canceled.
     */
    readonly cancelled: boolean;
    readonly clusterName: string;
    /**
     * UTC ISO 8601 formatted point in time when Atlas created the restore job.
     */
    readonly createdAt: string;
    /**
     * Type of restore job to create. Possible values are: automated and download.
     */
    readonly deliveryType: string;
    /**
     * One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     */
    readonly deliveryUrls: string[];
    /**
     * Indicates whether the restore job expired.
     */
    readonly expired: boolean;
    /**
     * UTC ISO 8601 formatted point in time when the restore job expires.
     */
    readonly expiresAt: string;
    /**
     * UTC ISO 8601 formatted point in time when the restore job completed.
     */
    readonly finishedAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly jobId: string;
    readonly oplogInc: number;
    readonly oplogTs: number;
    readonly pointInTimeUtcSeconds: number;
    readonly projectId: string;
    /**
     * Unique identifier of the source snapshot ID of the restore job.
     */
    readonly snapshotId: string;
    /**
     * Name of the target Atlas cluster to which the restore job restores the snapshot. Only visible if deliveryType is automated.
     */
    readonly targetClusterName: string;
    readonly targetProjectId: string;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     */
    readonly timestamp: string;
}
