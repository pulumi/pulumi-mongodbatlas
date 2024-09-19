// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getCloudBackupSnapshots
 *
 * `mongodbatlas.getCloudBackupSnapshots` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getCloudBackupSnapshots(args: GetCloudBackupSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudBackupSnapshotsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudBackupSnapshots:getCloudBackupSnapshots", {
        "clusterName": args.clusterName,
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshots.
 */
export interface GetCloudBackupSnapshotsArgs {
    /**
     * The name of the Atlas cluster that contains the snapshot you want to retrieve.
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
    projectId: string;
}

/**
 * A collection of values returned by getCloudBackupSnapshots.
 */
export interface GetCloudBackupSnapshotsResult {
    readonly clusterName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly pageNum?: number;
    readonly projectId: string;
    /**
     * Includes cloudProviderSnapshot object for each item detailed in the results array section.
     * * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
     */
    readonly results: outputs.GetCloudBackupSnapshotsResult[];
    readonly totalCount: number;
}
/**
 * ## # Data Source: mongodbatlas.getCloudBackupSnapshots
 *
 * `mongodbatlas.getCloudBackupSnapshots` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getCloudBackupSnapshotsOutput(args: GetCloudBackupSnapshotsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudBackupSnapshotsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getCloudBackupSnapshots:getCloudBackupSnapshots", {
        "clusterName": args.clusterName,
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudBackupSnapshots.
 */
export interface GetCloudBackupSnapshotsOutputArgs {
    /**
     * The name of the Atlas cluster that contains the snapshot you want to retrieve.
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
    projectId: pulumi.Input<string>;
}
