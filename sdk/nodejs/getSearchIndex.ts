// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.SearchIndex` describe a single search indexes. This represents a single search index that have been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getSearchIndex(args: GetSearchIndexArgs, opts?: pulumi.InvokeOptions): Promise<GetSearchIndexResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getSearchIndex:getSearchIndex", {
        "analyzer": args.analyzer,
        "analyzers": args.analyzers,
        "clusterName": args.clusterName,
        "collectionName": args.collectionName,
        "database": args.database,
        "indexId": args.indexId,
        "mappingsDynamic": args.mappingsDynamic,
        "mappingsFields": args.mappingsFields,
        "name": args.name,
        "projectId": args.projectId,
        "searchAnalyzer": args.searchAnalyzer,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSearchIndex.
 */
export interface GetSearchIndexArgs {
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     */
    analyzer?: string;
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     */
    analyzers?: string;
    /**
     * The name of the cluster containing the collection with one or more Atlas Search indexes.
     */
    clusterName: string;
    /**
     * Name of the collection the index is on.
     */
    collectionName?: string;
    /**
     * Name of the database the collection is in.
     */
    database?: string;
    /**
     * The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
     */
    indexId: string;
    /**
     * Flag indicating whether the index uses dynamic or static mappings.
     */
    mappingsDynamic?: boolean;
    /**
     * Object containing one or more field specifications.
     */
    mappingsFields?: string;
    /**
     * Name of the index.
     */
    name?: string;
    /**
     * The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     */
    projectId: string;
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     */
    searchAnalyzer?: string;
    status?: string;
}

/**
 * A collection of values returned by getSearchIndex.
 */
export interface GetSearchIndexResult {
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     */
    readonly analyzer?: string;
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     */
    readonly analyzers?: string;
    readonly clusterName: string;
    /**
     * Name of the collection the index is on.
     */
    readonly collectionName?: string;
    /**
     * Name of the database the collection is in.
     */
    readonly database?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly indexId: string;
    /**
     * Flag indicating whether the index uses dynamic or static mappings.
     */
    readonly mappingsDynamic?: boolean;
    /**
     * Object containing one or more field specifications.
     */
    readonly mappingsFields?: string;
    /**
     * Name of the index.
     */
    readonly name?: string;
    readonly projectId: string;
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     */
    readonly searchAnalyzer?: string;
    readonly status: string;
    /**
     * Synonyms mapping definition to use in this index.
     * * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
     * * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
     * * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
     */
    readonly synonyms: outputs.GetSearchIndexSynonym[];
}
/**
 * `mongodbatlas.SearchIndex` describe a single search indexes. This represents a single search index that have been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 */
export function getSearchIndexOutput(args: GetSearchIndexOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSearchIndexResult> {
    return pulumi.output(args).apply((a: any) => getSearchIndex(a, opts))
}

/**
 * A collection of arguments for invoking getSearchIndex.
 */
export interface GetSearchIndexOutputArgs {
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     */
    analyzer?: pulumi.Input<string>;
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     */
    analyzers?: pulumi.Input<string>;
    /**
     * The name of the cluster containing the collection with one or more Atlas Search indexes.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Name of the collection the index is on.
     */
    collectionName?: pulumi.Input<string>;
    /**
     * Name of the database the collection is in.
     */
    database?: pulumi.Input<string>;
    /**
     * The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
     */
    indexId: pulumi.Input<string>;
    /**
     * Flag indicating whether the index uses dynamic or static mappings.
     */
    mappingsDynamic?: pulumi.Input<boolean>;
    /**
     * Object containing one or more field specifications.
     */
    mappingsFields?: pulumi.Input<string>;
    /**
     * Name of the index.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     */
    projectId: pulumi.Input<string>;
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     */
    searchAnalyzer?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
}
