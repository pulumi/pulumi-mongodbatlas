// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.CloudBackupSnapshot
 *
 * `mongodbatlas.CloudBackupSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCloudBackupSnapshot = new mongodbatlas.CloudBackupSnapshot("test", {
 *     projectId: "5d0f1f73cf09a29120e173cf",
 *     clusterName: "MyClusterTest",
 *     description: "SomeDescription",
 *     retentionInDays: 1,
 * });
 * const test = mongodbatlas.getCloudBackupSnapshotOutput({
 *     snapshotId: "5d1285acd5ec13b6c2d1726a",
 *     projectId: testCloudBackupSnapshot.projectId,
 *     clusterName: testCloudBackupSnapshot.clusterName,
 * });
 * ```
 */
export function getCloudBackupSnapshot(args: GetCloudBackupSnapshotArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshot:getCloudBackupSnapshot", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
        "snapshotId": args.snapshotId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshot.
 */
export interface GetCloudBackupSnapshotArgs {
    /**
     * The name of the Atlas cluster that contains the snapshot you want to retrieve.
     */
    clusterName: string;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: string;
    /**
     * The unique identifier of the snapshot you want to retrieve.
     */
    snapshotId: string;
}

/**
 * A collection of values returned by getCloudBackupSnapshot.
 */
export interface GetCloudBackupSnapshotResult {
    /**
     * Cloud provider that stores this snapshot.
     */
    readonly cloudProvider: string;
    readonly clusterName: string;
    /**
     * UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     */
    readonly createdAt: string;
    /**
     * UDescription of the snapshot. Only present for on-demand snapshots.
     */
    readonly description: string;
    /**
     * UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     */
    readonly expiresAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     */
    readonly masterKeyUuid: string;
    /**
     * Block of List of snapshots and the cloud provider where the snapshots are stored. See below
     */
    readonly members: outputs.GetCloudBackupSnapshotMember[];
    /**
     * Version of the MongoDB server.
     */
    readonly mongodVersion: string;
    readonly projectId: string;
    /**
     * Label given to a shard or config server from which Atlas took this snapshot.
     */
    readonly replicaSetName: string;
    readonly snapshotId: string;
    /**
     * Unique identifiers of the snapshots created for the shards and config server for a sharded cluster.
     */
    readonly snapshotIds: string[];
    /**
     * Specified the type of snapshot. Valid values are onDemand and scheduled.
     */
    readonly snapshotType: string;
    /**
     * Current status of the snapshot. One of the following values: queued, inProgress, completed, failed.
     */
    readonly status: string;
    /**
     * Specifies the size of the snapshot in bytes.
     */
    readonly storageSizeBytes: number;
    /**
     * Specifies the type of cluster: replicaSet or shardedCluster.
     */
    readonly type: string;
}
/**
 * ## # Data Source: mongodbatlas.CloudBackupSnapshot
 *
 * `mongodbatlas.CloudBackupSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCloudBackupSnapshot = new mongodbatlas.CloudBackupSnapshot("test", {
 *     projectId: "5d0f1f73cf09a29120e173cf",
 *     clusterName: "MyClusterTest",
 *     description: "SomeDescription",
 *     retentionInDays: 1,
 * });
 * const test = mongodbatlas.getCloudBackupSnapshotOutput({
 *     snapshotId: "5d1285acd5ec13b6c2d1726a",
 *     projectId: testCloudBackupSnapshot.projectId,
 *     clusterName: testCloudBackupSnapshot.clusterName,
 * });
 * ```
 */
export function getCloudBackupSnapshotOutput(args: GetCloudBackupSnapshotOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCloudBackupSnapshotResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getCloudBackupSnapshot:getCloudBackupSnapshot", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
        "snapshotId": args.snapshotId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshot.
 */
export interface GetCloudBackupSnapshotOutputArgs {
    /**
     * The name of the Atlas cluster that contains the snapshot you want to retrieve.
     */
    clusterName: pulumi.Input<string>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
    /**
     * The unique identifier of the snapshot you want to retrieve.
     */
    snapshotId: pulumi.Input<string>;
}
