// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceStorageStoreReadPreferenceArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxStalenessSeconds")]
        public Input<int>? MaxStalenessSeconds { get; set; }

        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("tagSets")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs>? _tagSets;
        public InputList<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs> TagSets
        {
            get => _tagSets ?? (_tagSets = new InputList<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs>());
            set => _tagSets = value;
        }

        public FederatedDatabaseInstanceStorageStoreReadPreferenceArgs()
        {
        }
        public static new FederatedDatabaseInstanceStorageStoreReadPreferenceArgs Empty => new FederatedDatabaseInstanceStorageStoreReadPreferenceArgs();
    }
}
