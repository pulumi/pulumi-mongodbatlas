// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DataLakeStorageDatabaseArgs : global::Pulumi.ResourceArgs
    {
        [Input("collections")]
        private InputList<Inputs.DataLakeStorageDatabaseCollectionArgs>? _collections;
        public InputList<Inputs.DataLakeStorageDatabaseCollectionArgs> Collections
        {
            get => _collections ?? (_collections = new InputList<Inputs.DataLakeStorageDatabaseCollectionArgs>());
            set => _collections = value;
        }

        [Input("maxWildcardCollections")]
        public Input<int>? MaxWildcardCollections { get; set; }

        /// <summary>
        /// Name of the Atlas Data Lake.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("views")]
        private InputList<Inputs.DataLakeStorageDatabaseViewArgs>? _views;
        public InputList<Inputs.DataLakeStorageDatabaseViewArgs> Views
        {
            get => _views ?? (_views = new InputList<Inputs.DataLakeStorageDatabaseViewArgs>());
            set => _views = value;
        }

        public DataLakeStorageDatabaseArgs()
        {
        }
        public static new DataLakeStorageDatabaseArgs Empty => new DataLakeStorageDatabaseArgs();
    }
}
