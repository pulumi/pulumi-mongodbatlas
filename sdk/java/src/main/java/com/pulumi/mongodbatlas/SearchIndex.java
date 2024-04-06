// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.SearchIndexArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.SearchIndexState;
import com.pulumi.mongodbatlas.outputs.SearchIndexSynonym;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.SearchIndex` provides a Search Index resource. This allows indexes to be created.
 * 
 * ## Example Usage
 * 
 * ### Basic search index
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.SearchIndex;
 * import com.pulumi.mongodbatlas.SearchIndexArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test_basic_search_index = new SearchIndex(&#34;test-basic-search-index&#34;, SearchIndexArgs.builder()        
 *             .analyzer(&#34;lucene.standard&#34;)
 *             .clusterName(&#34;&lt;CLUSTER_NAME&gt;&#34;)
 *             .collectionName(&#34;collection_test&#34;)
 *             .database(&#34;database_test&#34;)
 *             .mappingsDynamic(true)
 *             .projectId(&#34;&lt;PROJECT_ID&gt;&#34;)
 *             .searchAnalyzer(&#34;lucene.standard&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Basic vector index
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.SearchIndex;
 * import com.pulumi.mongodbatlas.SearchIndexArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test_basic_search_vector = new SearchIndex(&#34;test-basic-search-vector&#34;, SearchIndexArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT_ID&gt;&#34;)
 *             .clusterName(&#34;&lt;CLUSTER_NAME&gt;&#34;)
 *             .collectionName(&#34;collection_test&#34;)
 *             .database(&#34;database_test&#34;)
 *             .type(&#34;vectorSearch&#34;)
 *             .fields(&#34;&#34;&#34;
 * [{
 *       &#34;type&#34;: &#34;vector&#34;,
 *       &#34;path&#34;: &#34;plot_embedding&#34;,
 *       &#34;numDimensions&#34;: 1536,
 *       &#34;similarity&#34;: &#34;euclidean&#34;
 * }]
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Advanced search index (with custom analyzers)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.SearchIndex;
 * import com.pulumi.mongodbatlas.SearchIndexArgs;
 * import com.pulumi.mongodbatlas.inputs.SearchIndexSynonymArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test_advanced_search_index = new SearchIndex(&#34;test-advanced-search-index&#34;, SearchIndexArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT_ID&gt;&#34;)
 *             .clusterName(&#34;&lt;CLUSTER_NAME&gt;&#34;)
 *             .analyzer(&#34;lucene.standard&#34;)
 *             .collectionName(&#34;collection_test&#34;)
 *             .database(&#34;database_test&#34;)
 *             .mappingsDynamic(false)
 *             .mappingsFields(&#34;&#34;&#34;
 * {
 *       &#34;address&#34;: {
 *         &#34;type&#34;: &#34;document&#34;,
 *         &#34;fields&#34;: {
 *           &#34;city&#34;: {
 *             &#34;type&#34;: &#34;string&#34;,
 *             &#34;analyzer&#34;: &#34;lucene.simple&#34;,
 *             &#34;ignoreAbove&#34;: 255
 *           },
 *           &#34;state&#34;: {
 *             &#34;type&#34;: &#34;string&#34;,
 *             &#34;analyzer&#34;: &#34;lucene.english&#34;
 *           }
 *         }
 *       },
 *       &#34;company&#34;: {
 *         &#34;type&#34;: &#34;string&#34;,
 *         &#34;analyzer&#34;: &#34;lucene.whitespace&#34;,
 *         &#34;multi&#34;: {
 *           &#34;mySecondaryAnalyzer&#34;: {
 *             &#34;type&#34;: &#34;string&#34;,
 *             &#34;analyzer&#34;: &#34;lucene.french&#34;
 *           }
 *         }
 *       },
 *       &#34;employees&#34;: {
 *         &#34;type&#34;: &#34;string&#34;,
 *         &#34;analyzer&#34;: &#34;lucene.standard&#34;
 *       }
 * }
 *             &#34;&#34;&#34;)
 *             .searchAnalyzer(&#34;lucene.standard&#34;)
 *             .analyzers(&#34;&#34;&#34;
 *  [{
 *  &#34;name&#34;: &#34;index_analyzer_test_name&#34;,
 *  &#34;charFilters&#34;: [{
 * &#34;type&#34;: &#34;mapping&#34;,
 * &#34;mappings&#34;: {&#34;\\&#34; : &#34;/&#34;}
 *    	}],
 *  &#34;tokenizer&#34;: {
 *  &#34;type&#34;: &#34;nGram&#34;,
 *  &#34;minGram&#34;: 2,
 *  &#34;maxGram&#34;: 5
 * 	},
 *  &#34;tokenFilters&#34;: [{
 * &#34;type&#34;: &#34;length&#34;,
 * &#34;min&#34;: 20,
 * &#34;max&#34;: 33
 *    	}]
 *  }]
 *             &#34;&#34;&#34;)
 *             .synonyms(SearchIndexSynonymArgs.builder()
 *                 .analyzer(&#34;lucene.simple&#34;)
 *                 .name(&#34;synonym_test&#34;)
 *                 .sourceCollection(&#34;collection_test&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="mongodbatlas:index/searchIndex:SearchIndex")
public class SearchIndex extends com.pulumi.resources.CustomResource {
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    @Export(name="analyzer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> analyzer;

    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    public Output<Optional<String>> analyzer() {
        return Codegen.optional(this.analyzer);
    }
    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * 
     */
    @Export(name="analyzers", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> analyzers;

    /**
     * @return [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * 
     */
    public Output<Optional<String>> analyzers() {
        return Codegen.optional(this.analyzers);
    }
    /**
     * The name of the cluster where you want to create the search index within.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return The name of the cluster where you want to create the search index within.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Name of the collection the index is on.
     * 
     */
    @Export(name="collectionName", refs={String.class}, tree="[0]")
    private Output<String> collectionName;

    /**
     * @return Name of the collection the index is on.
     * 
     */
    public Output<String> collectionName() {
        return this.collectionName;
    }
    /**
     * Name of the database the collection is in.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return Name of the database the collection is in.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
     * 
     */
    @Export(name="fields", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fields;

    /**
     * @return Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
     * 
     */
    public Output<Optional<String>> fields() {
        return Codegen.optional(this.fields);
    }
    @Export(name="indexId", refs={String.class}, tree="[0]")
    private Output<String> indexId;

    public Output<String> indexId() {
        return this.indexId;
    }
    /**
     * Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
     * 
     */
    @Export(name="mappingsDynamic", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> mappingsDynamic;

    /**
     * @return Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
     * 
     */
    public Output<Optional<Boolean>> mappingsDynamic() {
        return Codegen.optional(this.mappingsDynamic);
    }
    /**
     * attribute is required in search indexes when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     * 
     */
    @Export(name="mappingsFields", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mappingsFields;

    /**
     * @return attribute is required in search indexes when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     * 
     */
    public Output<Optional<String>> mappingsFields() {
        return Codegen.optional(this.mappingsFields);
    }
    /**
     * The name of the search index you want to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the search index you want to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the organization or project you want to create the search index within.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of the organization or project you want to create the search index within.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    @Export(name="searchAnalyzer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> searchAnalyzer;

    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    public Output<Optional<String>> searchAnalyzer() {
        return Codegen.optional(this.searchAnalyzer);
    }
    /**
     * Current status of the index.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Current status of the index.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Synonyms mapping definition to use in this index.
     * 
     */
    @Export(name="synonyms", refs={List.class,SearchIndexSynonym.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SearchIndexSynonym>> synonyms;

    /**
     * @return Synonyms mapping definition to use in this index.
     * 
     */
    public Output<Optional<List<SearchIndexSynonym>>> synonyms() {
        return Codegen.optional(this.synonyms);
    }
    /**
     * Type of index: `search` or `vectorSearch`. Default type is `search`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of index: `search` or `vectorSearch`. Default type is `search`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    @Export(name="waitForIndexBuildCompletion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForIndexBuildCompletion;

    public Output<Optional<Boolean>> waitForIndexBuildCompletion() {
        return Codegen.optional(this.waitForIndexBuildCompletion);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SearchIndex(String name) {
        this(name, SearchIndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SearchIndex(String name, SearchIndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SearchIndex(String name, SearchIndexArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/searchIndex:SearchIndex", name, args == null ? SearchIndexArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SearchIndex(String name, Output<String> id, @Nullable SearchIndexState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/searchIndex:SearchIndex", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SearchIndex get(String name, Output<String> id, @Nullable SearchIndexState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SearchIndex(name, id, state, options);
    }
}
