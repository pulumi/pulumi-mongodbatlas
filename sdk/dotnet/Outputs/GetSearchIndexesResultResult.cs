// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetSearchIndexesResultResult
    {
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
        /// </summary>
        public readonly string Analyzer;
        /// <summary>
        /// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
        /// </summary>
        public readonly string? Analyzers;
        /// <summary>
        /// Name of the cluster containing the collection with one or more Atlas Search indexes.
        /// </summary>
        public readonly string ClusterName;
        /// <summary>
        /// Name of the collection with one or more Atlas Search indexes.
        /// </summary>
        public readonly string CollectionName;
        /// <summary>
        /// (Required) Name of the database the collection is in.
        /// </summary>
        public readonly string Database;
        public readonly string IndexId;
        /// <summary>
        /// Flag indicating whether the index uses dynamic or static mappings.
        /// </summary>
        public readonly bool? MappingsDynamic;
        /// <summary>
        /// Object containing one or more field specifications.
        /// </summary>
        public readonly string? MappingsFields;
        /// <summary>
        /// Name of the index.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
        /// </summary>
        public readonly string? SearchAnalyzer;
        public readonly string Status;
        /// <summary>
        /// Synonyms mapping definition to use in this index.
        /// * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
        /// * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
        /// * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSearchIndexesResultSynonymResult> Synonyms;
        public readonly bool? WaitForIndexBuildCompletion;

        [OutputConstructor]
        private GetSearchIndexesResultResult(
            string analyzer,

            string? analyzers,

            string clusterName,

            string collectionName,

            string database,

            string indexId,

            bool? mappingsDynamic,

            string? mappingsFields,

            string name,

            string projectId,

            string? searchAnalyzer,

            string status,

            ImmutableArray<Outputs.GetSearchIndexesResultSynonymResult> synonyms,

            bool? waitForIndexBuildCompletion)
        {
            Analyzer = analyzer;
            Analyzers = analyzers;
            ClusterName = clusterName;
            CollectionName = collectionName;
            Database = database;
            IndexId = indexId;
            MappingsDynamic = mappingsDynamic;
            MappingsFields = mappingsFields;
            Name = name;
            ProjectId = projectId;
            SearchAnalyzer = searchAnalyzer;
            Status = status;
            Synonyms = synonyms;
            WaitForIndexBuildCompletion = waitForIndexBuildCompletion;
        }
    }
}
