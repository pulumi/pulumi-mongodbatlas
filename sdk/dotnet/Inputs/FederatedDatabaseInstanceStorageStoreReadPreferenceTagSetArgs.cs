// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags", required: true)]
        private InputList<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs>? _tags;
        public InputList<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs>());
            set => _tags = value;
        }

        public FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs()
        {
        }
        public static new FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs Empty => new FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs();
    }
}
