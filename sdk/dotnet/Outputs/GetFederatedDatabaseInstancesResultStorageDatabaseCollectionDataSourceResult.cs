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
    public sealed class GetFederatedDatabaseInstancesResultStorageDatabaseCollectionDataSourceResult
    {
        public readonly bool AllowInsecure;
        public readonly string Collection;
        public readonly string CollectionRegex;
        public readonly string Database;
        public readonly string DatabaseRegex;
        public readonly string DatasetName;
        public readonly string DefaultFormat;
        public readonly string Path;
        public readonly string ProvenanceFieldName;
        public readonly string StoreName;
        public readonly ImmutableArray<string> Urls;

        [OutputConstructor]
        private GetFederatedDatabaseInstancesResultStorageDatabaseCollectionDataSourceResult(
            bool allowInsecure,

            string collection,

            string collectionRegex,

            string database,

            string databaseRegex,

            string datasetName,

            string defaultFormat,

            string path,

            string provenanceFieldName,

            string storeName,

            ImmutableArray<string> urls)
        {
            AllowInsecure = allowInsecure;
            Collection = collection;
            CollectionRegex = collectionRegex;
            Database = database;
            DatabaseRegex = databaseRegex;
            DatasetName = datasetName;
            DefaultFormat = defaultFormat;
            Path = path;
            ProvenanceFieldName = provenanceFieldName;
            StoreName = storeName;
            Urls = urls;
        }
    }
}
