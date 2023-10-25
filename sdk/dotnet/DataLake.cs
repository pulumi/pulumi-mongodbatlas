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
    /// `mongodbatlas.DataLake` provides a Data Lake resource.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text. Read more about sensitive data in state.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Data Lake can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`--`aws_test_s3_bucket`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/dataLake:DataLake example 1112222b3bf99403840e8934--test-data-lake--s3-test
    /// ```
    ///  See [MongoDB Atlas API](https://docs.mongodb.com/datalake/reference/api/dataLakes-create-one-tenant) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/dataLake:DataLake")]
    public partial class DataLake : global::Pulumi.CustomResource
    {
        /// <summary>
        /// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
        /// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
        /// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        /// </summary>
        [Output("aws")]
        public Output<Outputs.DataLakeAws> Aws { get; private set; } = null!;

        /// <summary>
        /// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
        /// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
        /// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        /// </summary>
        [Output("dataProcessRegion")]
        public Output<Outputs.DataLakeDataProcessRegion> DataProcessRegion { get; private set; } = null!;

        /// <summary>
        /// The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
        /// </summary>
        [Output("hostnames")]
        public Output<ImmutableArray<string>> Hostnames { get; private set; } = null!;

        /// <summary>
        /// Name of the Atlas Data Lake.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a data lake.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Current state of the Atlas Data Lake:
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
        /// * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
        /// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        /// * `storage_databases.#.collections.#.name` - Name of the collection.
        /// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
        /// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `&lt;collection&gt;`.
        /// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        /// * `storage_databases.#.views.#.name` - Name of the view.
        /// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        /// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        /// </summary>
        [Output("storageDatabases")]
        public Output<ImmutableArray<Outputs.DataLakeStorageDatabase>> StorageDatabases { get; private set; } = null!;

        /// <summary>
        /// Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
        /// * `storage_stores.#.name` - Name of the data store.
        /// * `storage_stores.#.provider` - Defines where the data is stored.
        /// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        /// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        /// * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
        /// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        /// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        /// </summary>
        [Output("storageStores")]
        public Output<ImmutableArray<Outputs.DataLakeStorageStore>> StorageStores { get; private set; } = null!;


        /// <summary>
        /// Create a DataLake resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataLake(string name, DataLakeArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/dataLake:DataLake", name, args ?? new DataLakeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataLake(string name, Input<string> id, DataLakeState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/dataLake:DataLake", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataLake resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataLake Get(string name, Input<string> id, DataLakeState? state = null, CustomResourceOptions? options = null)
        {
            return new DataLake(name, id, state, options);
        }
    }

    public sealed class DataLakeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
        /// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
        /// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        /// </summary>
        [Input("aws", required: true)]
        public Input<Inputs.DataLakeAwsArgs> Aws { get; set; } = null!;

        /// <summary>
        /// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
        /// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
        /// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        /// </summary>
        [Input("dataProcessRegion")]
        public Input<Inputs.DataLakeDataProcessRegionArgs>? DataProcessRegion { get; set; }

        /// <summary>
        /// Name of the Atlas Data Lake.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create a data lake.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public DataLakeArgs()
        {
        }
        public static new DataLakeArgs Empty => new DataLakeArgs();
    }

    public sealed class DataLakeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
        /// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
        /// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        /// </summary>
        [Input("aws")]
        public Input<Inputs.DataLakeAwsGetArgs>? Aws { get; set; }

        /// <summary>
        /// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
        /// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
        /// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        /// </summary>
        [Input("dataProcessRegion")]
        public Input<Inputs.DataLakeDataProcessRegionGetArgs>? DataProcessRegion { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// Name of the Atlas Data Lake.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create a data lake.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Current state of the Atlas Data Lake:
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("storageDatabases")]
        private InputList<Inputs.DataLakeStorageDatabaseGetArgs>? _storageDatabases;

        /// <summary>
        /// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
        /// * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
        /// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        /// * `storage_databases.#.collections.#.name` - Name of the collection.
        /// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
        /// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        /// * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `&lt;collection&gt;`.
        /// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        /// * `storage_databases.#.views.#.name` - Name of the view.
        /// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        /// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        /// </summary>
        public InputList<Inputs.DataLakeStorageDatabaseGetArgs> StorageDatabases
        {
            get => _storageDatabases ?? (_storageDatabases = new InputList<Inputs.DataLakeStorageDatabaseGetArgs>());
            set => _storageDatabases = value;
        }

        [Input("storageStores")]
        private InputList<Inputs.DataLakeStorageStoreGetArgs>? _storageStores;

        /// <summary>
        /// Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
        /// * `storage_stores.#.name` - Name of the data store.
        /// * `storage_stores.#.provider` - Defines where the data is stored.
        /// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        /// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        /// * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
        /// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        /// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        /// </summary>
        public InputList<Inputs.DataLakeStorageStoreGetArgs> StorageStores
        {
            get => _storageStores ?? (_storageStores = new InputList<Inputs.DataLakeStorageStoreGetArgs>());
            set => _storageStores = value;
        }

        public DataLakeState()
        {
        }
        public static new DataLakeState Empty => new DataLakeState();
    }
}
