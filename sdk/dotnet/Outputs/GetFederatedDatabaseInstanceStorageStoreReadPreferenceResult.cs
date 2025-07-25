// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetFederatedDatabaseInstanceStorageStoreReadPreferenceResult
    {
        public readonly int MaxStalenessSeconds;
        public readonly string Mode;
        public readonly ImmutableArray<Outputs.GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetResult> TagSets;

        [OutputConstructor]
        private GetFederatedDatabaseInstanceStorageStoreReadPreferenceResult(
            int maxStalenessSeconds,

            string mode,

            ImmutableArray<Outputs.GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetResult> tagSets)
        {
            MaxStalenessSeconds = maxStalenessSeconds;
            Mode = mode;
            TagSets = tagSets;
        }
    }
}
