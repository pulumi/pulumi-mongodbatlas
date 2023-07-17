// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceStorageDatabaseGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("collections")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionGetArgs>? _collections;
        public InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionGetArgs> Collections
        {
            get => _collections ?? (_collections = new InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionGetArgs>());
            set => _collections = value;
        }

        [Input("maxWildcardCollections")]
        public Input<int>? MaxWildcardCollections { get; set; }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
        /// #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("views")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseViewGetArgs>? _views;
        public InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseViewGetArgs> Views
        {
            get => _views ?? (_views = new InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseViewGetArgs>());
            set => _views = value;
        }

        public FederatedDatabaseInstanceStorageDatabaseGetArgs()
        {
        }
        public static new FederatedDatabaseInstanceStorageDatabaseGetArgs Empty => new FederatedDatabaseInstanceStorageDatabaseGetArgs();
    }
}