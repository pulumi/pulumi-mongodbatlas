// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class SearchIndexSynonymArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
        /// </summary>
        [Input("analyzer", required: true)]
        public Input<string> Analyzer { get; set; } = null!;

        /// <summary>
        /// The name of the search index you want to create.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (Required) Name of the source MongoDB collection for the synonyms. Documents in this collection must be in the format described in the [Synonyms Source Collection Documents](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-coll-spec).
        /// </summary>
        [Input("sourceCollection", required: true)]
        public Input<string> SourceCollection { get; set; } = null!;

        public SearchIndexSynonymArgs()
        {
        }
        public static new SearchIndexSynonymArgs Empty => new SearchIndexSynonymArgs();
    }
}
