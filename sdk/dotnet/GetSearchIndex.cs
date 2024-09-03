// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetSearchIndex
    {
        /// <summary>
        /// # Data Source: mongodbatlas.SearchIndex
        /// 
        /// `mongodbatlas.SearchIndex` describes a single search indexes. This represents a single search index that have been created.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetSearchIndex.Invoke(new()
        ///     {
        ///         IndexId = "&lt;INDEX_ID",
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         ClusterName = "&lt;CLUSTER_NAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSearchIndexResult> InvokeAsync(GetSearchIndexArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSearchIndexResult>("mongodbatlas:index/getSearchIndex:getSearchIndex", args ?? new GetSearchIndexArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.SearchIndex
        /// 
        /// `mongodbatlas.SearchIndex` describes a single search indexes. This represents a single search index that have been created.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetSearchIndex.Invoke(new()
        ///     {
        ///         IndexId = "&lt;INDEX_ID",
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         ClusterName = "&lt;CLUSTER_NAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSearchIndexResult> Invoke(GetSearchIndexInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSearchIndexResult>("mongodbatlas:index/getSearchIndex:getSearchIndex", args ?? new GetSearchIndexInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSearchIndexArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the cluster containing the collection with one or more Atlas Search indexes.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
        /// </summary>
        [Input("indexId", required: true)]
        public string IndexId { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetSearchIndexArgs()
        {
        }
        public static new GetSearchIndexArgs Empty => new GetSearchIndexArgs();
    }

    public sealed class GetSearchIndexInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the cluster containing the collection with one or more Atlas Search indexes.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
        /// </summary>
        [Input("indexId", required: true)]
        public Input<string> IndexId { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetSearchIndexInvokeArgs()
        {
        }
        public static new GetSearchIndexInvokeArgs Empty => new GetSearchIndexInvokeArgs();
    }


    [OutputType]
    public sealed class GetSearchIndexResult
    {
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
        /// </summary>
        public readonly string Analyzer;
        /// <summary>
        /// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
        /// </summary>
        public readonly string Analyzers;
        public readonly string ClusterName;
        /// <summary>
        /// Name of the collection the index is on.
        /// </summary>
        public readonly string CollectionName;
        /// <summary>
        /// Name of the database the collection is in.
        /// </summary>
        public readonly string Database;
        public readonly string Fields;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IndexId;
        /// <summary>
        /// Flag indicating whether the index uses dynamic or static mappings.
        /// </summary>
        public readonly bool MappingsDynamic;
        /// <summary>
        /// Object containing one or more field specifications.
        /// </summary>
        public readonly string MappingsFields;
        /// <summary>
        /// Name of the index.
        /// </summary>
        public readonly string Name;
        public readonly string ProjectId;
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
        /// </summary>
        public readonly string SearchAnalyzer;
        /// <summary>
        /// Current status of the index.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// String that can be "true" (store all fields), "false" (default, don't store any field), or a JSON string that contains the list of fields to store (include) or not store (exclude) on Atlas Search. To learn more, see [Stored Source Fields](https://www.mongodb.com/docs/atlas/atlas-search/stored-source-definition/).
        /// </summary>
        public readonly string StoredSource;
        /// <summary>
        /// Synonyms mapping definition to use in this index.
        /// * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
        /// * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
        /// * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSearchIndexSynonymResult> Synonyms;
        public readonly string Type;

        [OutputConstructor]
        private GetSearchIndexResult(
            string analyzer,

            string analyzers,

            string clusterName,

            string collectionName,

            string database,

            string fields,

            string id,

            string indexId,

            bool mappingsDynamic,

            string mappingsFields,

            string name,

            string projectId,

            string searchAnalyzer,

            string status,

            string storedSource,

            ImmutableArray<Outputs.GetSearchIndexSynonymResult> synonyms,

            string type)
        {
            Analyzer = analyzer;
            Analyzers = analyzers;
            ClusterName = clusterName;
            CollectionName = collectionName;
            Database = database;
            Fields = fields;
            Id = id;
            IndexId = indexId;
            MappingsDynamic = mappingsDynamic;
            MappingsFields = mappingsFields;
            Name = name;
            ProjectId = projectId;
            SearchAnalyzer = searchAnalyzer;
            Status = status;
            StoredSource = storedSource;
            Synonyms = synonyms;
            Type = type;
        }
    }
}
