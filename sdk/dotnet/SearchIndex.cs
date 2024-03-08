// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.SearchIndex` provides a Search Index resource. This allows indexes to be created.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic search index
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test_basic_search_index = new Mongodbatlas.SearchIndex("test-basic-search-index", new()
    ///     {
    ///         Analyzer = "lucene.standard",
    ///         ClusterName = "&lt;CLUSTER_NAME&gt;",
    ///         CollectionName = "collection_test",
    ///         Database = "database_test",
    ///         MappingsDynamic = true,
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         SearchAnalyzer = "lucene.standard",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Basic vector index
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test_basic_search_vector = new Mongodbatlas.SearchIndex("test-basic-search-vector", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         ClusterName = "&lt;CLUSTER_NAME&gt;",
    ///         CollectionName = "collection_test",
    ///         Database = "database_test",
    ///         Type = "vectorSearch",
    ///         Fields = @"[{
    ///       ""type"": ""vector"",
    ///       ""path"": ""plot_embedding"",
    ///       ""numDimensions"": 1536,
    ///       ""similarity"": ""euclidean""
    /// }]
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Advanced search index (with custom analyzers)
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test_advanced_search_index = new Mongodbatlas.SearchIndex("test-advanced-search-index", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         ClusterName = "&lt;CLUSTER_NAME&gt;",
    ///         Analyzer = "lucene.standard",
    ///         CollectionName = "collection_test",
    ///         Database = "database_test",
    ///         MappingsDynamic = false,
    ///         MappingsFields = @"{
    ///       ""address"": {
    ///         ""type"": ""document"",
    ///         ""fields"": {
    ///           ""city"": {
    ///             ""type"": ""string"",
    ///             ""analyzer"": ""lucene.simple"",
    ///             ""ignoreAbove"": 255
    ///           },
    ///           ""state"": {
    ///             ""type"": ""string"",
    ///             ""analyzer"": ""lucene.english""
    ///           }
    ///         }
    ///       },
    ///       ""company"": {
    ///         ""type"": ""string"",
    ///         ""analyzer"": ""lucene.whitespace"",
    ///         ""multi"": {
    ///           ""mySecondaryAnalyzer"": {
    ///             ""type"": ""string"",
    ///             ""analyzer"": ""lucene.french""
    ///           }
    ///         }
    ///       },
    ///       ""employees"": {
    ///         ""type"": ""string"",
    ///         ""analyzer"": ""lucene.standard""
    ///       }
    /// }
    /// ",
    ///         SearchAnalyzer = "lucene.standard",
    ///         Analyzers = @" [{
    ///  ""name"": ""index_analyzer_test_name"",
    ///  ""charFilters"": [{
    /// ""type"": ""mapping"",
    /// ""mappings"": {""\\"" : ""/""}
    ///    	}],
    ///  ""tokenizer"": {
    ///  ""type"": ""nGram"",
    ///  ""minGram"": 2,
    ///  ""maxGram"": 5
    /// 	},
    ///  ""tokenFilters"": [{
    /// ""type"": ""length"",
    /// ""min"": 20,
    /// ""max"": 33
    ///    	}]
    ///  }]
    /// ",
    ///         Synonyms = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.SearchIndexSynonymArgs
    ///             {
    ///                 Analyzer = "lucene.simple",
    ///                 Name = "synonym_test",
    ///                 SourceCollection = "collection_test",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/searchIndex:SearchIndex")]
    public partial class SearchIndex : global::Pulumi.CustomResource
    {
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Output("analyzer")]
        public Output<string?> Analyzer { get; private set; } = null!;

        /// <summary>
        /// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var analyzers = @"[{
        /// ""name"": ""index_analyzer_test_name"",
        /// ""charFilters"": [{
        /// ""type"": ""mapping"",
        /// ""mappings"": {""\\"" : ""/""}
        /// }],
        /// ""tokenizer"": {
        /// ""type"": ""nGram"",
        /// ""minGram"": 2,
        /// ""maxGram"": 5
        /// },
        /// ""tokenFilters"": [{
        /// ""type"": ""length"",
        /// ""min"": 20,
        /// ""max"": 33
        /// }]
        /// }]
        /// ";
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Output("analyzers")]
        public Output<string?> Analyzers { get; private set; } = null!;

        /// <summary>
        /// The name of the cluster where you want to create the search index within.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// Name of the collection the index is on.
        /// </summary>
        [Output("collectionName")]
        public Output<string> CollectionName { get; private set; } = null!;

        /// <summary>
        /// Name of the database the collection is in.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
        /// </summary>
        [Output("fields")]
        public Output<string?> Fields { get; private set; } = null!;

        [Output("indexId")]
        public Output<string> IndexId { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
        /// </summary>
        [Output("mappingsDynamic")]
        public Output<bool?> MappingsDynamic { get; private set; } = null!;

        /// <summary>
        /// attribute is required in search indexes when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
        /// </summary>
        [Output("mappingsFields")]
        public Output<string?> MappingsFields { get; private set; } = null!;

        /// <summary>
        /// The name of the search index you want to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the organization or project you want to create the search index within.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Output("searchAnalyzer")]
        public Output<string?> SearchAnalyzer { get; private set; } = null!;

        /// <summary>
        /// Current status of the index.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Synonyms mapping definition to use in this index.
        /// </summary>
        [Output("synonyms")]
        public Output<ImmutableArray<Outputs.SearchIndexSynonym>> Synonyms { get; private set; } = null!;

        /// <summary>
        /// Type of index: `search` or `vectorSearch`. Default type is `search`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        [Output("waitForIndexBuildCompletion")]
        public Output<bool?> WaitForIndexBuildCompletion { get; private set; } = null!;


        /// <summary>
        /// Create a SearchIndex resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SearchIndex(string name, SearchIndexArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/searchIndex:SearchIndex", name, args ?? new SearchIndexArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SearchIndex(string name, Input<string> id, SearchIndexState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/searchIndex:SearchIndex", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SearchIndex resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SearchIndex Get(string name, Input<string> id, SearchIndexState? state = null, CustomResourceOptions? options = null)
        {
            return new SearchIndex(name, id, state, options);
        }
    }

    public sealed class SearchIndexArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Input("analyzer")]
        public Input<string>? Analyzer { get; set; }

        /// <summary>
        /// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var analyzers = @"[{
        /// ""name"": ""index_analyzer_test_name"",
        /// ""charFilters"": [{
        /// ""type"": ""mapping"",
        /// ""mappings"": {""\\"" : ""/""}
        /// }],
        /// ""tokenizer"": {
        /// ""type"": ""nGram"",
        /// ""minGram"": 2,
        /// ""maxGram"": 5
        /// },
        /// ""tokenFilters"": [{
        /// ""type"": ""length"",
        /// ""min"": 20,
        /// ""max"": 33
        /// }]
        /// }]
        /// ";
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("analyzers")]
        public Input<string>? Analyzers { get; set; }

        /// <summary>
        /// The name of the cluster where you want to create the search index within.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// Name of the collection the index is on.
        /// </summary>
        [Input("collectionName", required: true)]
        public Input<string> CollectionName { get; set; } = null!;

        /// <summary>
        /// Name of the database the collection is in.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
        /// </summary>
        [Input("fields")]
        public Input<string>? Fields { get; set; }

        /// <summary>
        /// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
        /// </summary>
        [Input("mappingsDynamic")]
        public Input<bool>? MappingsDynamic { get; set; }

        /// <summary>
        /// attribute is required in search indexes when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
        /// </summary>
        [Input("mappingsFields")]
        public Input<string>? MappingsFields { get; set; }

        /// <summary>
        /// The name of the search index you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization or project you want to create the search index within.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Input("searchAnalyzer")]
        public Input<string>? SearchAnalyzer { get; set; }

        [Input("synonyms")]
        private InputList<Inputs.SearchIndexSynonymArgs>? _synonyms;

        /// <summary>
        /// Synonyms mapping definition to use in this index.
        /// </summary>
        public InputList<Inputs.SearchIndexSynonymArgs> Synonyms
        {
            get => _synonyms ?? (_synonyms = new InputList<Inputs.SearchIndexSynonymArgs>());
            set => _synonyms = value;
        }

        /// <summary>
        /// Type of index: `search` or `vectorSearch`. Default type is `search`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("waitForIndexBuildCompletion")]
        public Input<bool>? WaitForIndexBuildCompletion { get; set; }

        public SearchIndexArgs()
        {
        }
        public static new SearchIndexArgs Empty => new SearchIndexArgs();
    }

    public sealed class SearchIndexState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Input("analyzer")]
        public Input<string>? Analyzer { get; set; }

        /// <summary>
        /// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var analyzers = @"[{
        /// ""name"": ""index_analyzer_test_name"",
        /// ""charFilters"": [{
        /// ""type"": ""mapping"",
        /// ""mappings"": {""\\"" : ""/""}
        /// }],
        /// ""tokenizer"": {
        /// ""type"": ""nGram"",
        /// ""minGram"": 2,
        /// ""maxGram"": 5
        /// },
        /// ""tokenFilters"": [{
        /// ""type"": ""length"",
        /// ""min"": 20,
        /// ""max"": 33
        /// }]
        /// }]
        /// ";
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("analyzers")]
        public Input<string>? Analyzers { get; set; }

        /// <summary>
        /// The name of the cluster where you want to create the search index within.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// Name of the collection the index is on.
        /// </summary>
        [Input("collectionName")]
        public Input<string>? CollectionName { get; set; }

        /// <summary>
        /// Name of the database the collection is in.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
        /// </summary>
        [Input("fields")]
        public Input<string>? Fields { get; set; }

        [Input("indexId")]
        public Input<string>? IndexId { get; set; }

        /// <summary>
        /// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
        /// </summary>
        [Input("mappingsDynamic")]
        public Input<bool>? MappingsDynamic { get; set; }

        /// <summary>
        /// attribute is required in search indexes when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
        /// </summary>
        [Input("mappingsFields")]
        public Input<string>? MappingsFields { get; set; }

        /// <summary>
        /// The name of the search index you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization or project you want to create the search index within.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Input("searchAnalyzer")]
        public Input<string>? SearchAnalyzer { get; set; }

        /// <summary>
        /// Current status of the index.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("synonyms")]
        private InputList<Inputs.SearchIndexSynonymGetArgs>? _synonyms;

        /// <summary>
        /// Synonyms mapping definition to use in this index.
        /// </summary>
        public InputList<Inputs.SearchIndexSynonymGetArgs> Synonyms
        {
            get => _synonyms ?? (_synonyms = new InputList<Inputs.SearchIndexSynonymGetArgs>());
            set => _synonyms = value;
        }

        /// <summary>
        /// Type of index: `search` or `vectorSearch`. Default type is `search`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("waitForIndexBuildCompletion")]
        public Input<bool>? WaitForIndexBuildCompletion { get; set; }

        public SearchIndexState()
        {
        }
        public static new SearchIndexState Empty => new SearchIndexState();
    }
}
