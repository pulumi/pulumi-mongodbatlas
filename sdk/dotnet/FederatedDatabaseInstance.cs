// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance resource.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ### S With MongoDB Atlas Cluster As Storage Database
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.FederatedDatabaseInstance("test", new()
    ///     {
    ///         ProjectId = "PROJECT ID",
    ///         Name = "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
    ///         StorageDatabases = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseArgs
    ///             {
    ///                 Name = "VirtualDatabase0",
    ///                 Collections = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionArgs
    ///                     {
    ///                         Name = "NAME OF THE COLLECTION",
    ///                         DataSources = new[]
    ///                         {
    ///                             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs
    ///                             {
    ///                                 Collection = "COLLECTION IN THE CLUSTER",
    ///                                 Database = "DB IN THE CLUSTER",
    ///                                 StoreName = "CLUSTER NAME",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         StorageStores = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageStoreArgs
    ///             {
    ///                 Name = "STORE 1 NAME",
    ///                 ClusterName = "CLUSTER NAME",
    ///                 ProjectId = "PROJECT ID",
    ///                 Provider = "atlas",
    ///                 ReadPreference = new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceArgs
    ///                 {
    ///                     Mode = "secondary",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### S With Amazon S3 Bucket As Storage Database
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.FederatedDatabaseInstance("test", new()
    ///     {
    ///         ProjectId = "PROJECT ID",
    ///         Name = "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
    ///         CloudProviderConfig = new Mongodbatlas.Inputs.FederatedDatabaseInstanceCloudProviderConfigArgs
    ///         {
    ///             Aws = new Mongodbatlas.Inputs.FederatedDatabaseInstanceCloudProviderConfigAwsArgs
    ///             {
    ///                 RoleId = "AWS ROLE ID",
    ///                 TestS3Bucket = "S3 BUCKET NAME",
    ///             },
    ///         },
    ///         StorageDatabases = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseArgs
    ///             {
    ///                 Name = "VirtualDatabase0",
    ///                 Collections = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionArgs
    ///                     {
    ///                         Name = "NAME OF THE COLLECTION",
    ///                         DataSources = new[]
    ///                         {
    ///                             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs
    ///                             {
    ///                                 Collection = "COLLECTION IN THE CLUSTER",
    ///                                 Database = "DB IN THE CLUSTER",
    ///                                 StoreName = "CLUSTER NAME",
    ///                             },
    ///                             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs
    ///                             {
    ///                                 StoreName = "S3 BUCKET NAME",
    ///                                 Path = "S3 BUCKET PATH",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         StorageStores = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageStoreArgs
    ///             {
    ///                 Name = "STORE 1 NAME",
    ///                 ClusterName = "CLUSTER NAME",
    ///                 ProjectId = "PROJECT ID",
    ///                 Provider = "atlas",
    ///                 ReadPreference = new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceArgs
    ///                 {
    ///                     Mode = "secondary",
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.FederatedDatabaseInstanceStorageStoreArgs
    ///             {
    ///                 Bucket = "STORE 2 NAME",
    ///                 Delimiter = "/",
    ///                 Name = "S3 BUCKET NAME",
    ///                 Prefix = "S3 BUCKET PREFIX",
    ///                 Provider = "s3",
    ///                 Region = "AWS REGION",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// - The Federated Database Instance can be imported using project ID, name of the instance, in the format `project_id`--`name`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance mongodbatlas_federated_database_instance.example 1112222b3bf99403840e8934--test
    /// ```
    /// 
    /// - The Federated Database Instance can be imported using project ID, name of the instance and name of the AWS S3 bucket, in the format `project_id`--`name`--`aws_test_s3_bucket`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance mongodbatlas_federated_database_instance.example 1112222b3bf99403840e8934--test--s3-test
    /// ```
    /// 
    /// See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance")]
    public partial class FederatedDatabaseInstance : global::Pulumi.CustomResource
    {
        [Output("cloudProviderConfig")]
        public Output<Outputs.FederatedDatabaseInstanceCloudProviderConfig> CloudProviderConfig { get; private set; } = null!;

        [Output("dataProcessRegion")]
        public Output<Outputs.FederatedDatabaseInstanceDataProcessRegion> DataProcessRegion { get; private set; } = null!;

        /// <summary>
        /// The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
        /// </summary>
        [Output("hostnames")]
        public Output<ImmutableArray<string>> Hostnames { get; private set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
        /// #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Current state of the Federated Database Instance:
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
        /// * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
        /// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        /// * `storage_databases.#.collections.#.name` - Name of the collection.
        /// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
        /// * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
        /// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
        /// * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
        /// * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
        /// * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
        /// * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
        /// * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
        /// * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
        /// * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
        /// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        /// * `storage_databases.#.views.#.name` - Name of the view.
        /// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        /// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        /// </summary>
        [Output("storageDatabases")]
        public Output<ImmutableArray<Outputs.FederatedDatabaseInstanceStorageDatabase>> StorageDatabases { get; private set; } = null!;

        /// <summary>
        /// Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
        /// * `storage_stores.#.name` - Name of the data store.
        /// * `storage_stores.#.provider` - Defines where the data is stored.
        /// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        /// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        /// * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
        /// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        /// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        /// * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
        /// * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
        /// * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
        /// * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
        /// * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
        /// * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
        /// * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
        /// * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
        /// * `storage_stores.#.read_preference.tag_sets` - List that contains tag sets or tag specification documents.
        /// * `storage_stores.#.read_preference.tags` - List of all tags within a tag set
        /// * `storage_stores.#.read_preference.tags.name` - Human-readable label of the tag.
        /// * `storage_stores.#.read_preference.tags.value` - Value of the tag.
        /// </summary>
        [Output("storageStores")]
        public Output<ImmutableArray<Outputs.FederatedDatabaseInstanceStorageStore>> StorageStores { get; private set; } = null!;


        /// <summary>
        /// Create a FederatedDatabaseInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FederatedDatabaseInstance(string name, FederatedDatabaseInstanceArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance", name, args ?? new FederatedDatabaseInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FederatedDatabaseInstance(string name, Input<string> id, FederatedDatabaseInstanceState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FederatedDatabaseInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FederatedDatabaseInstance Get(string name, Input<string> id, FederatedDatabaseInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new FederatedDatabaseInstance(name, id, state, options);
        }
    }

    public sealed class FederatedDatabaseInstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudProviderConfig")]
        public Input<Inputs.FederatedDatabaseInstanceCloudProviderConfigArgs>? CloudProviderConfig { get; set; }

        [Input("dataProcessRegion")]
        public Input<Inputs.FederatedDatabaseInstanceDataProcessRegionArgs>? DataProcessRegion { get; set; }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
        /// #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("storageDatabases")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseArgs>? _storageDatabases;

        /// <summary>
        /// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
        /// * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
        /// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        /// * `storage_databases.#.collections.#.name` - Name of the collection.
        /// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
        /// * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
        /// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
        /// * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
        /// * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
        /// * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
        /// * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
        /// * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
        /// * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
        /// * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
        /// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        /// * `storage_databases.#.views.#.name` - Name of the view.
        /// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        /// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        /// </summary>
        public InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseArgs> StorageDatabases
        {
            get => _storageDatabases ?? (_storageDatabases = new InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseArgs>());
            set => _storageDatabases = value;
        }

        [Input("storageStores")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageStoreArgs>? _storageStores;

        /// <summary>
        /// Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
        /// * `storage_stores.#.name` - Name of the data store.
        /// * `storage_stores.#.provider` - Defines where the data is stored.
        /// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        /// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        /// * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
        /// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        /// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        /// * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
        /// * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
        /// * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
        /// * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
        /// * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
        /// * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
        /// * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
        /// * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
        /// * `storage_stores.#.read_preference.tag_sets` - List that contains tag sets or tag specification documents.
        /// * `storage_stores.#.read_preference.tags` - List of all tags within a tag set
        /// * `storage_stores.#.read_preference.tags.name` - Human-readable label of the tag.
        /// * `storage_stores.#.read_preference.tags.value` - Value of the tag.
        /// </summary>
        public InputList<Inputs.FederatedDatabaseInstanceStorageStoreArgs> StorageStores
        {
            get => _storageStores ?? (_storageStores = new InputList<Inputs.FederatedDatabaseInstanceStorageStoreArgs>());
            set => _storageStores = value;
        }

        public FederatedDatabaseInstanceArgs()
        {
        }
        public static new FederatedDatabaseInstanceArgs Empty => new FederatedDatabaseInstanceArgs();
    }

    public sealed class FederatedDatabaseInstanceState : global::Pulumi.ResourceArgs
    {
        [Input("cloudProviderConfig")]
        public Input<Inputs.FederatedDatabaseInstanceCloudProviderConfigGetArgs>? CloudProviderConfig { get; set; }

        [Input("dataProcessRegion")]
        public Input<Inputs.FederatedDatabaseInstanceDataProcessRegionGetArgs>? DataProcessRegion { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
        /// #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Current state of the Federated Database Instance:
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("storageDatabases")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseGetArgs>? _storageDatabases;

        /// <summary>
        /// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
        /// * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
        /// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        /// * `storage_databases.#.collections.#.name` - Name of the collection.
        /// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
        /// * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
        /// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
        /// * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
        /// * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
        /// * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
        /// * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
        /// * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
        /// * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
        /// * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
        /// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        /// * `storage_databases.#.views.#.name` - Name of the view.
        /// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        /// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        /// </summary>
        public InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseGetArgs> StorageDatabases
        {
            get => _storageDatabases ?? (_storageDatabases = new InputList<Inputs.FederatedDatabaseInstanceStorageDatabaseGetArgs>());
            set => _storageDatabases = value;
        }

        [Input("storageStores")]
        private InputList<Inputs.FederatedDatabaseInstanceStorageStoreGetArgs>? _storageStores;

        /// <summary>
        /// Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
        /// * `storage_stores.#.name` - Name of the data store.
        /// * `storage_stores.#.provider` - Defines where the data is stored.
        /// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        /// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        /// * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
        /// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        /// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        /// * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
        /// * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
        /// * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
        /// * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
        /// * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
        /// * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
        /// * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
        /// * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
        /// * `storage_stores.#.read_preference.tag_sets` - List that contains tag sets or tag specification documents.
        /// * `storage_stores.#.read_preference.tags` - List of all tags within a tag set
        /// * `storage_stores.#.read_preference.tags.name` - Human-readable label of the tag.
        /// * `storage_stores.#.read_preference.tags.value` - Value of the tag.
        /// </summary>
        public InputList<Inputs.FederatedDatabaseInstanceStorageStoreGetArgs> StorageStores
        {
            get => _storageStores ?? (_storageStores = new InputList<Inputs.FederatedDatabaseInstanceStorageStoreGetArgs>());
            set => _storageStores = value;
        }

        public FederatedDatabaseInstanceState()
        {
        }
        public static new FederatedDatabaseInstanceState Empty => new FederatedDatabaseInstanceState();
    }
}
