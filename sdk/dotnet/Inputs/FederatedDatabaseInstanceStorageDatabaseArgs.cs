// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceStorageDatabaseArgs : global::Pulumi.ResourceArgs
    {
        [Input("collections")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionArgs>? _collections;
        public InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionArgs> Collections
        {
            get => _collections ?? (_collections = new InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionArgs>());
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
        private InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseViewArgs>? _views;
        public InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseViewArgs> Views
        {
            get => _views ?? (_views = new InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseViewArgs>());
            set => _views = value;
        }

        public FederatedDatabaseInstanceStorageDatabaseArgs()
        {
        }
        public static new FederatedDatabaseInstanceStorageDatabaseArgs Empty => new FederatedDatabaseInstanceStorageDatabaseArgs();
    }
}
