// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CloudBackupSnapshotRestoreJob` provides a Cloud Backup Snapshot Restore Job datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getCloudBackupSnapshotRestoreJob(args: GetCloudBackupSnapshotRestoreJobArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotRestoreJobResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshotRestoreJob:getCloudBackupSnapshotRestoreJob", {
        "clusterName": args.clusterName,
        "jobId": args.jobId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotRestoreJob.
 */
export interface GetCloudBackupSnapshotRestoreJobArgs {
    /**
     * The name of the Atlas cluster for which you want to retrieve the restore job.
     */
    clusterName: string;
    /**
     * The unique identifier of the restore job to retrieve.
     */
    jobId: string;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: string;
}

/**
 * A collection of values returned by getCloudBackupSnapshotRestoreJob.
 */
export interface GetCloudBackupSnapshotRestoreJobResult {
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

export function getCloudBackupSnapshotRestoreJobOutput(args: GetCloudBackupSnapshotRestoreJobOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotRestoreJobResult> {
    return pulumi.output(args).apply(a => getCloudBackupSnapshotRestoreJob(a, opts))
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshotRestoreJob.
 */
export interface GetCloudBackupSnapshotRestoreJobOutputArgs {
    /**
     * The name of the Atlas cluster for which you want to retrieve the restore job.
     */
    clusterName: pulumi.Input<string>;
    /**
     * The unique identifier of the restore job to retrieve.
     */
    jobId: pulumi.Input<string>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
}