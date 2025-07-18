// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Resource: mongodbatlas.SearchIndex
 *
 * `mongodbatlas.SearchIndex` provides a Search Index resource. This allows indexes to be created.
 *
 * ## Example Usage
 *
 * ### Basic search index
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test_basic_search_index = new mongodbatlas.SearchIndex("test-basic-search-index", {
 *     name: "test-basic-search-index",
 *     projectId: "<PROJECT_ID>",
 *     clusterName: "<CLUSTER_NAME>",
 *     analyzer: "lucene.standard",
 *     collectionName: "collection_test",
 *     database: "database_test",
 *     mappingsDynamic: true,
 *     searchAnalyzer: "lucene.standard",
 * });
 * ```
 *
 * ### Basic vector index
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test_basic_search_vector = new mongodbatlas.SearchIndex("test-basic-search-vector", {
 *     projectId: "<PROJECT_ID>",
 *     clusterName: "<CLUSTER_NAME>",
 *     collectionName: "collection_test",
 *     database: "database_test",
 *     type: "vectorSearch",
 *     fields: `[{
 *       "type": "vector",
 *       "path": "plot_embedding",
 *       "numDimensions": 1536,
 *       "similarity": "euclidean"
 * }]
 * `,
 * });
 * ```
 *
 * ### Advanced search index (with custom analyzers)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test_advanced_search_index = new mongodbatlas.SearchIndex("test-advanced-search-index", {
 *     projectId: "<PROJECT_ID>",
 *     clusterName: "<CLUSTER_NAME>",
 *     analyzer: "lucene.standard",
 *     collectionName: "collection_test",
 *     database: "database_test",
 *     mappingsDynamic: false,
 *     mappingsFields: `{
 *       "address": {
 *         "type": "document",
 *         "fields": {
 *           "city": {
 *             "type": "string",
 *             "analyzer": "lucene.simple",
 *             "ignoreAbove": 255
 *           },
 *           "state": {
 *             "type": "string",
 *             "analyzer": "lucene.english"
 *           }
 *         }
 *       },
 *       "company": {
 *         "type": "string",
 *         "analyzer": "lucene.whitespace",
 *         "multi": {
 *           "mySecondaryAnalyzer": {
 *             "type": "string",
 *             "analyzer": "lucene.french"
 *           }
 *         }
 *       },
 *       "employees": {
 *         "type": "string",
 *         "analyzer": "lucene.standard"
 *       }
 * }
 * `,
 *     name: "test-advanced-search-index",
 *     searchAnalyzer: "lucene.standard",
 *     analyzers: ` [{
 *  "name": "index_analyzer_test_name",
 *  "charFilters": [{
 * "type": "mapping",
 * "mappings": {"\\\\" : "/"}
 *    \x09}],
 *  "tokenizer": {
 *  "type": "nGram",
 *  "minGram": 2,
 *  "maxGram": 5
 * \x09},
 *  "tokenFilters": [{
 * "type": "length",
 * "min": 20,
 * "max": 33
 *    \x09}]
 *  }]
 * `,
 *     synonyms: [{
 *         analyzer: "lucene.simple",
 *         name: "synonym_test",
 *         sourceCollection: "collection_test",
 *     }],
 * });
 * ```
 */
export class SearchIndex extends pulumi.CustomResource {
    /**
     * Get an existing SearchIndex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SearchIndexState, opts?: pulumi.CustomResourceOptions): SearchIndex {
        return new SearchIndex(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/searchIndex:SearchIndex';

    /**
     * Returns true if the given object is an instance of SearchIndex.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SearchIndex {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SearchIndex.__pulumiType;
    }

    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     */
    public readonly analyzer!: pulumi.Output<string | undefined>;
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * ```
     * analyzers = <<-EOF
     * [{
     * "name": "index_analyzer_test_name",
     * "charFilters": [{
     * "type": "mapping",
     * "mappings": {"\\" : "/"}
     * }],
     * "tokenizer": {
     * "type": "nGram",
     * "minGram": 2,
     * "maxGram": 5
     * },
     * "tokenFilters": [{
     * "type": "length",
     * "min": 20,
     * "max": 33
     * }]
     * }]
     * EOF
     * ```
     */
    public readonly analyzers!: pulumi.Output<string | undefined>;
    /**
     * The name of the cluster where you want to create the search index within.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Name of the collection the index is on. **NOTE:** The collection must exist before creating the index.
     */
    public readonly collectionName!: pulumi.Output<string>;
    /**
     * Name of the database the collection is in.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
     */
    public readonly fields!: pulumi.Output<string | undefined>;
    /**
     * The unique identifier of the Atlas Search index.
     */
    public /*out*/ readonly indexId!: pulumi.Output<string>;
    /**
     * Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
     */
    public readonly mappingsDynamic!: pulumi.Output<boolean | undefined>;
    /**
     * attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     */
    public readonly mappingsFields!: pulumi.Output<string | undefined>;
    /**
     * The name of the search index you want to create.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the organization or project you want to create the search index within.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     */
    public readonly searchAnalyzer!: pulumi.Output<string | undefined>;
    /**
     * Current status of the index.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * String that can be "true" (store all fields), "false" (default, don't store any field), or a JSON string that contains the list of fields to store (include) or not store (exclude) on Atlas Search. To learn more, see [Stored Source Fields](https://www.mongodb.com/docs/atlas/atlas-search/stored-source-definition/).
     */
    public readonly storedSource!: pulumi.Output<string | undefined>;
    /**
     * Synonyms mapping definition to use in this index.
     */
    public readonly synonyms!: pulumi.Output<outputs.SearchIndexSynonym[] | undefined>;
    /**
     * Type of index: `search` or `vectorSearch`. Default type is `search`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    public readonly waitForIndexBuildCompletion!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SearchIndex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SearchIndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SearchIndexArgs | SearchIndexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SearchIndexState | undefined;
            resourceInputs["analyzer"] = state ? state.analyzer : undefined;
            resourceInputs["analyzers"] = state ? state.analyzers : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["collectionName"] = state ? state.collectionName : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["fields"] = state ? state.fields : undefined;
            resourceInputs["indexId"] = state ? state.indexId : undefined;
            resourceInputs["mappingsDynamic"] = state ? state.mappingsDynamic : undefined;
            resourceInputs["mappingsFields"] = state ? state.mappingsFields : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["searchAnalyzer"] = state ? state.searchAnalyzer : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storedSource"] = state ? state.storedSource : undefined;
            resourceInputs["synonyms"] = state ? state.synonyms : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["waitForIndexBuildCompletion"] = state ? state.waitForIndexBuildCompletion : undefined;
        } else {
            const args = argsOrState as SearchIndexArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.collectionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collectionName'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["analyzer"] = args ? args.analyzer : undefined;
            resourceInputs["analyzers"] = args ? args.analyzers : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["collectionName"] = args ? args.collectionName : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["fields"] = args ? args.fields : undefined;
            resourceInputs["mappingsDynamic"] = args ? args.mappingsDynamic : undefined;
            resourceInputs["mappingsFields"] = args ? args.mappingsFields : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["searchAnalyzer"] = args ? args.searchAnalyzer : undefined;
            resourceInputs["storedSource"] = args ? args.storedSource : undefined;
            resourceInputs["synonyms"] = args ? args.synonyms : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["waitForIndexBuildCompletion"] = args ? args.waitForIndexBuildCompletion : undefined;
            resourceInputs["indexId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SearchIndex.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SearchIndex resources.
 */
export interface SearchIndexState {
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     */
    analyzer?: pulumi.Input<string>;
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * ```
     * analyzers = <<-EOF
     * [{
     * "name": "index_analyzer_test_name",
     * "charFilters": [{
     * "type": "mapping",
     * "mappings": {"\\" : "/"}
     * }],
     * "tokenizer": {
     * "type": "nGram",
     * "minGram": 2,
     * "maxGram": 5
     * },
     * "tokenFilters": [{
     * "type": "length",
     * "min": 20,
     * "max": 33
     * }]
     * }]
     * EOF
     * ```
     */
    analyzers?: pulumi.Input<string>;
    /**
     * The name of the cluster where you want to create the search index within.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Name of the collection the index is on. **NOTE:** The collection must exist before creating the index.
     */
    collectionName?: pulumi.Input<string>;
    /**
     * Name of the database the collection is in.
     */
    database?: pulumi.Input<string>;
    /**
     * Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
     */
    fields?: pulumi.Input<string>;
    /**
     * The unique identifier of the Atlas Search index.
     */
    indexId?: pulumi.Input<string>;
    /**
     * Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
     */
    mappingsDynamic?: pulumi.Input<boolean>;
    /**
     * attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     */
    mappingsFields?: pulumi.Input<string>;
    /**
     * The name of the search index you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization or project you want to create the search index within.
     */
    projectId?: pulumi.Input<string>;
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     */
    searchAnalyzer?: pulumi.Input<string>;
    /**
     * Current status of the index.
     */
    status?: pulumi.Input<string>;
    /**
     * String that can be "true" (store all fields), "false" (default, don't store any field), or a JSON string that contains the list of fields to store (include) or not store (exclude) on Atlas Search. To learn more, see [Stored Source Fields](https://www.mongodb.com/docs/atlas/atlas-search/stored-source-definition/).
     */
    storedSource?: pulumi.Input<string>;
    /**
     * Synonyms mapping definition to use in this index.
     */
    synonyms?: pulumi.Input<pulumi.Input<inputs.SearchIndexSynonym>[]>;
    /**
     * Type of index: `search` or `vectorSearch`. Default type is `search`.
     */
    type?: pulumi.Input<string>;
    waitForIndexBuildCompletion?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SearchIndex resource.
 */
export interface SearchIndexArgs {
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     */
    analyzer?: pulumi.Input<string>;
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * ```
     * analyzers = <<-EOF
     * [{
     * "name": "index_analyzer_test_name",
     * "charFilters": [{
     * "type": "mapping",
     * "mappings": {"\\" : "/"}
     * }],
     * "tokenizer": {
     * "type": "nGram",
     * "minGram": 2,
     * "maxGram": 5
     * },
     * "tokenFilters": [{
     * "type": "length",
     * "min": 20,
     * "max": 33
     * }]
     * }]
     * EOF
     * ```
     */
    analyzers?: pulumi.Input<string>;
    /**
     * The name of the cluster where you want to create the search index within.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Name of the collection the index is on. **NOTE:** The collection must exist before creating the index.
     */
    collectionName: pulumi.Input<string>;
    /**
     * Name of the database the collection is in.
     */
    database: pulumi.Input<string>;
    /**
     * Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
     */
    fields?: pulumi.Input<string>;
    /**
     * Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
     */
    mappingsDynamic?: pulumi.Input<boolean>;
    /**
     * attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     */
    mappingsFields?: pulumi.Input<string>;
    /**
     * The name of the search index you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization or project you want to create the search index within.
     */
    projectId: pulumi.Input<string>;
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     */
    searchAnalyzer?: pulumi.Input<string>;
    /**
     * String that can be "true" (store all fields), "false" (default, don't store any field), or a JSON string that contains the list of fields to store (include) or not store (exclude) on Atlas Search. To learn more, see [Stored Source Fields](https://www.mongodb.com/docs/atlas/atlas-search/stored-source-definition/).
     */
    storedSource?: pulumi.Input<string>;
    /**
     * Synonyms mapping definition to use in this index.
     */
    synonyms?: pulumi.Input<pulumi.Input<inputs.SearchIndexSynonym>[]>;
    /**
     * Type of index: `search` or `vectorSearch`. Default type is `search`.
     */
    type?: pulumi.Input<string>;
    waitForIndexBuildCompletion?: pulumi.Input<boolean>;
}
