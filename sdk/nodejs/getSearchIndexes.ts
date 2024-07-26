// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getSearchIndexes
 *
 * `mongodbatlas.getSearchIndexes` describes all search indexes. This represents search indexes that have been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getSearchIndexes(args: GetSearchIndexesArgs, opts?: pulumi.InvokeOptions): Promise<GetSearchIndexesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getSearchIndexes:getSearchIndexes", {
        "clusterName": args.clusterName,
        "collectionName": args.collectionName,
        "database": args.database,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSearchIndexes.
 */
export interface GetSearchIndexesArgs {
    /**
     * Name of the cluster containing the collection with one or more Atlas Search indexes.
     */
    clusterName: string;
    /**
     * Name of the collection with one or more Atlas Search indexes.
     */
    collectionName: string;
    /**
     * (Required) Name of the database the collection is in.
     */
    database: string;
    /**
     * Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     */
    projectId: string;
}

/**
 * A collection of values returned by getSearchIndexes.
 */
export interface GetSearchIndexesResult {
    readonly clusterName: string;
    /**
     * (Required) Name of the collection the index is on.
     */
    readonly collectionName: string;
    /**
     * (Required) Name of the database the collection is in.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a search index.
     */
    readonly results: outputs.GetSearchIndexesResult[];
    /**
     * Represents the total of the search indexes
     */
    readonly totalCount: number;
}
/**
 * ## # Data Source: mongodbatlas.getSearchIndexes
 *
 * `mongodbatlas.getSearchIndexes` describes all search indexes. This represents search indexes that have been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getSearchIndexesOutput(args: GetSearchIndexesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSearchIndexesResult> {
    return pulumi.output(args).apply((a: any) => getSearchIndexes(a, opts))
}

/**
 * A collection of arguments for invoking getSearchIndexes.
 */
export interface GetSearchIndexesOutputArgs {
    /**
     * Name of the cluster containing the collection with one or more Atlas Search indexes.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Name of the collection with one or more Atlas Search indexes.
     */
    collectionName: pulumi.Input<string>;
    /**
     * (Required) Name of the database the collection is in.
     */
    database: pulumi.Input<string>;
    /**
     * Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     */
    projectId: pulumi.Input<string>;
}
