// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getSharedTierSnapshots(args: GetSharedTierSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetSharedTierSnapshotsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getSharedTierSnapshots:getSharedTierSnapshots", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSharedTierSnapshots.
 */
export interface GetSharedTierSnapshotsArgs {
    clusterName: string;
    projectId: string;
}

/**
 * A collection of values returned by getSharedTierSnapshots.
 */
export interface GetSharedTierSnapshotsResult {
    readonly clusterName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    readonly results: outputs.GetSharedTierSnapshotsResult[];
    readonly totalCount: number;
}
export function getSharedTierSnapshotsOutput(args: GetSharedTierSnapshotsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSharedTierSnapshotsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getSharedTierSnapshots:getSharedTierSnapshots", {
        "clusterName": args.clusterName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSharedTierSnapshots.
 */
export interface GetSharedTierSnapshotsOutputArgs {
    clusterName: pulumi.Input<string>;
    projectId: pulumi.Input<string>;
}
