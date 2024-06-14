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
    public sealed class FederatedDatabaseInstanceStorageStoreReadPreference
    {
        public readonly int? MaxStalenessSeconds;
        public readonly string? Mode;
        public readonly ImmutableArray<Outputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> TagSets;

        [OutputConstructor]
        private FederatedDatabaseInstanceStorageStoreReadPreference(
            int? maxStalenessSeconds,

            string? mode,

            ImmutableArray<Outputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets)
        {
            MaxStalenessSeconds = maxStalenessSeconds;
            Mode = mode;
            TagSets = tagSets;
        }
    }
}