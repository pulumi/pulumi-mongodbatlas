// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedDatabaseInstance
    {
        /// <summary>
        /// `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance data source.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### S With MongoDB Atlas Cluster As Storage Database
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetFederatedDatabaseInstance.Invoke(new()
        ///     {
        ///         Name = "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
        ///         ProjectId = "PROJECT ID",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% example %}}
        /// ### S With Amazon S3 Bucket As Storage Database
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetFederatedDatabaseInstance.Invoke(new()
        ///     {
        ///         CloudProviderConfig = new Mongodbatlas.Inputs.GetFederatedDatabaseInstanceCloudProviderConfigInputArgs
        ///         {
        ///             Aws = new Mongodbatlas.Inputs.GetFederatedDatabaseInstanceCloudProviderConfigAwsInputArgs
        ///             {
        ///                 TestS3Bucket = "Amazon S3 Bucket Name",
        ///             },
        ///         },
        ///         Name = "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
        ///         ProjectId = "PROJECT ID",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFederatedDatabaseInstanceResult> InvokeAsync(GetFederatedDatabaseInstanceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedDatabaseInstanceResult>("mongodbatlas:index/getFederatedDatabaseInstance:getFederatedDatabaseInstance", args ?? new GetFederatedDatabaseInstanceArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance data source.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### S With MongoDB Atlas Cluster As Storage Database
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetFederatedDatabaseInstance.Invoke(new()
        ///     {
        ///         Name = "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
        ///         ProjectId = "PROJECT ID",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% example %}}
        /// ### S With Amazon S3 Bucket As Storage Database
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetFederatedDatabaseInstance.Invoke(new()
        ///     {
        ///         CloudProviderConfig = new Mongodbatlas.Inputs.GetFederatedDatabaseInstanceCloudProviderConfigInputArgs
        ///         {
        ///             Aws = new Mongodbatlas.Inputs.GetFederatedDatabaseInstanceCloudProviderConfigAwsInputArgs
        ///             {
        ///                 TestS3Bucket = "Amazon S3 Bucket Name",
        ///             },
        ///         },
        ///         Name = "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
        ///         ProjectId = "PROJECT ID",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFederatedDatabaseInstanceResult> Invoke(GetFederatedDatabaseInstanceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedDatabaseInstanceResult>("mongodbatlas:index/getFederatedDatabaseInstance:getFederatedDatabaseInstance", args ?? new GetFederatedDatabaseInstanceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedDatabaseInstanceArgs : global::Pulumi.InvokeArgs
    {
        [Input("cloudProviderConfig")]
        public Inputs.GetFederatedDatabaseInstanceCloudProviderConfigArgs? CloudProviderConfig { get; set; }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetFederatedDatabaseInstanceArgs()
        {
        }
        public static new GetFederatedDatabaseInstanceArgs Empty => new GetFederatedDatabaseInstanceArgs();
    }

    public sealed class GetFederatedDatabaseInstanceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("cloudProviderConfig")]
        public Input<Inputs.GetFederatedDatabaseInstanceCloudProviderConfigInputArgs>? CloudProviderConfig { get; set; }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetFederatedDatabaseInstanceInvokeArgs()
        {
        }
        public static new GetFederatedDatabaseInstanceInvokeArgs Empty => new GetFederatedDatabaseInstanceInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedDatabaseInstanceResult
    {
        public readonly Outputs.GetFederatedDatabaseInstanceCloudProviderConfigResult CloudProviderConfig;
        public readonly ImmutableArray<Outputs.GetFederatedDatabaseInstanceDataProcessRegionResult> DataProcessRegions;
        /// <summary>
        /// The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
        /// </summary>
        public readonly ImmutableArray<string> Hostnames;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string ProjectId;
        /// <summary>
        /// Current state of the Federated Database Instance:
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
        /// * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
        /// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        /// * `storage_databases.#.collections.#.name` - Name of the collection.
        /// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        /// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
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
        public readonly ImmutableArray<Outputs.GetFederatedDatabaseInstanceStorageDatabaseResult> StorageDatabases;
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
        /// * `storage_stores.#.read_preference.tagSets` - List that contains tag sets or tag specification documents.
        /// * `storage_stores.#.read_preference.tagSets.name` - Human-readable label of the tag.
        /// * `storage_stores.#.read_preference.tagSets.value` - Value of the tag.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedDatabaseInstanceStorageStoreResult> StorageStores;

        [OutputConstructor]
        private GetFederatedDatabaseInstanceResult(
            Outputs.GetFederatedDatabaseInstanceCloudProviderConfigResult cloudProviderConfig,

            ImmutableArray<Outputs.GetFederatedDatabaseInstanceDataProcessRegionResult> dataProcessRegions,

            ImmutableArray<string> hostnames,

            string id,

            string name,

            string projectId,

            string state,

            ImmutableArray<Outputs.GetFederatedDatabaseInstanceStorageDatabaseResult> storageDatabases,

            ImmutableArray<Outputs.GetFederatedDatabaseInstanceStorageStoreResult> storageStores)
        {
            CloudProviderConfig = cloudProviderConfig;
            DataProcessRegions = dataProcessRegions;
            Hostnames = hostnames;
            Id = id;
            Name = name;
            ProjectId = projectId;
            State = state;
            StorageDatabases = storageDatabases;
            StorageStores = storageStores;
        }
    }
}
