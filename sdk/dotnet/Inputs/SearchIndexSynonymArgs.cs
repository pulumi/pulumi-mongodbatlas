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
        /// Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping. Atlas Search doesn't support these [custom analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) tokenizers and token filters in [analyzers used in synonym mappings](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#options):
        /// * [nGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-ngram-tokenizer-ref) Tokenizer
        /// * [edgeGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-edgegram-tokenizer-ref) Tokenizers
        /// * [daitchMokotoffSoundex](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-daitchmokotoffsoundex-tf-ref) token filter
        /// * [nGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-ngram-tf-ref) token filter
        /// * [edgeGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-edgegram-tf-ref) token filter
        /// * [shingle](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-shingle-tf-ref) token filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// 
        /// 
        /// 
        /// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/atlas-search/) - [and MongoDB Atlas API - Search](https://docs.atlas.mongodb.com/reference/api/atlas-search/) Documentation for more information.
        /// </summary>
        [Input("analyzer", required: true)]
        public Input<string> Analyzer { get; set; } = null!;

        /// <summary>
        /// Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref). Name must be unique in this index definition and it can't be an empty string.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Name of the source MongoDB collection for the synonyms. Documents in this collection must be in the format described in the [Synonyms Source Collection Documents](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-coll-spec).
        /// </summary>
        [Input("sourceCollection", required: true)]
        public Input<string> SourceCollection { get; set; } = null!;

        public SearchIndexSynonymArgs()
        {
        }
        public static new SearchIndexSynonymArgs Empty => new SearchIndexSynonymArgs();
    }
}
