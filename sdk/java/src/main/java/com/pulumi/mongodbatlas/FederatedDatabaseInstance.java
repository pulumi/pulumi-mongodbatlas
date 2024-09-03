// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.FederatedDatabaseInstanceArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceState;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceCloudProviderConfig;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceDataProcessRegion;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceStorageDatabase;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceStorageStore;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * # Resource: mongodbatlas.FederatedDatabaseInstance
 * 
 * `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance resource.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * ## Example specifying data process region and provider
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.FederatedDatabaseInstance;
 * import com.pulumi.mongodbatlas.FederatedDatabaseInstanceArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceDataProcessRegionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new FederatedDatabaseInstance("test", FederatedDatabaseInstanceArgs.builder()
 *             .projectId("PROJECT ID")
 *             .name("NAME OF THE FEDERATED DATABASE INSTANCE")
 *             .dataProcessRegion(FederatedDatabaseInstanceDataProcessRegionArgs.builder()
 *                 .cloudProvider("AWS")
 *                 .region("OREGON_USA")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Example Usage
 * 
 * ### s with MongoDB Atlas Cluster as storage database
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.FederatedDatabaseInstance;
 * import com.pulumi.mongodbatlas.FederatedDatabaseInstanceArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageDatabaseArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageStoreArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new FederatedDatabaseInstance("test", FederatedDatabaseInstanceArgs.builder()
 *             .projectId("PROJECT ID")
 *             .name("TENANT NAME OF THE FEDERATED DATABASE INSTANCE")
 *             .storageDatabases(FederatedDatabaseInstanceStorageDatabaseArgs.builder()
 *                 .name("VirtualDatabase0")
 *                 .collections(FederatedDatabaseInstanceStorageDatabaseCollectionArgs.builder()
 *                     .name("NAME OF THE COLLECTION")
 *                     .dataSources(FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs.builder()
 *                         .collection("COLLECTION IN THE CLUSTER")
 *                         .database("DB IN THE CLUSTER")
 *                         .storeName("CLUSTER NAME")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .storageStores(FederatedDatabaseInstanceStorageStoreArgs.builder()
 *                 .name("STORE 1 NAME")
 *                 .clusterName("CLUSTER NAME")
 *                 .projectId("PROJECT ID")
 *                 .provider("atlas")
 *                 .readPreference(FederatedDatabaseInstanceStorageStoreReadPreferenceArgs.builder()
 *                     .mode("secondary")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### s with Amazon S3 bucket as storage database
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.FederatedDatabaseInstance;
 * import com.pulumi.mongodbatlas.FederatedDatabaseInstanceArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceCloudProviderConfigArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceCloudProviderConfigAwsArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageDatabaseArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageStoreArgs;
 * import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new FederatedDatabaseInstance("test", FederatedDatabaseInstanceArgs.builder()
 *             .projectId("PROJECT ID")
 *             .name("TENANT NAME OF THE FEDERATED DATABASE INSTANCE")
 *             .cloudProviderConfig(FederatedDatabaseInstanceCloudProviderConfigArgs.builder()
 *                 .aws(FederatedDatabaseInstanceCloudProviderConfigAwsArgs.builder()
 *                     .roleId("AWS ROLE ID")
 *                     .testS3Bucket("S3 BUCKET NAME")
 *                     .build())
 *                 .build())
 *             .storageDatabases(FederatedDatabaseInstanceStorageDatabaseArgs.builder()
 *                 .name("VirtualDatabase0")
 *                 .collections(FederatedDatabaseInstanceStorageDatabaseCollectionArgs.builder()
 *                     .name("NAME OF THE COLLECTION")
 *                     .dataSources(                    
 *                         FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs.builder()
 *                             .collection("COLLECTION IN THE CLUSTER")
 *                             .database("DB IN THE CLUSTER")
 *                             .storeName("CLUSTER NAME")
 *                             .build(),
 *                         FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs.builder()
 *                             .storeName("S3 BUCKET NAME")
 *                             .path("S3 BUCKET PATH")
 *                             .build())
 *                     .build())
 *                 .build())
 *             .storageStores(            
 *                 FederatedDatabaseInstanceStorageStoreArgs.builder()
 *                     .name("STORE 1 NAME")
 *                     .clusterName("CLUSTER NAME")
 *                     .projectId("PROJECT ID")
 *                     .provider("atlas")
 *                     .readPreference(FederatedDatabaseInstanceStorageStoreReadPreferenceArgs.builder()
 *                         .mode("secondary")
 *                         .build())
 *                     .build(),
 *                 FederatedDatabaseInstanceStorageStoreArgs.builder()
 *                     .bucket("STORE 2 NAME")
 *                     .delimiter("/")
 *                     .name("S3 BUCKET NAME")
 *                     .prefix("S3 BUCKET PREFIX")
 *                     .provider("s3")
 *                     .region("AWS REGION")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * - The Federated Database Instance can be imported using project ID, name of the instance, in the format `project_id`--`name`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance mongodbatlas_federated_database_instance.example 1112222b3bf99403840e8934--test
 * ```
 * 
 * - The Federated Database Instance can be imported using project ID, name of the instance and name of the AWS S3 bucket, in the format `project_id`--`name`--`aws_test_s3_bucket`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance mongodbatlas_federated_database_instance.example 1112222b3bf99403840e8934--test--s3-test
 * ```
 * 
 * See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance")
public class FederatedDatabaseInstance extends com.pulumi.resources.CustomResource {
    /**
     * Cloud provider linked to this data federated instance.
     * * `cloud_provider_config.aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * * `cloud_provider_config.aws.role_id` - (Required) Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
     * * `cloud_provider_config.aws.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
     * 
     */
    @Export(name="cloudProviderConfig", refs={FederatedDatabaseInstanceCloudProviderConfig.class}, tree="[0]")
    private Output<FederatedDatabaseInstanceCloudProviderConfig> cloudProviderConfig;

    /**
     * @return Cloud provider linked to this data federated instance.
     * * `cloud_provider_config.aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * * `cloud_provider_config.aws.role_id` - (Required) Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
     * * `cloud_provider_config.aws.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
     * 
     */
    public Output<FederatedDatabaseInstanceCloudProviderConfig> cloudProviderConfig() {
        return this.cloudProviderConfig;
    }
    /**
     * The cloud provider region to which the Federated Instance routes client connections for data processing.
     * * `data_process_region.cloud_provider` - (Required) Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * * `data_process_region.region` - (Required) Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     * 
     */
    @Export(name="dataProcessRegion", refs={FederatedDatabaseInstanceDataProcessRegion.class}, tree="[0]")
    private Output<FederatedDatabaseInstanceDataProcessRegion> dataProcessRegion;

    /**
     * @return The cloud provider region to which the Federated Instance routes client connections for data processing.
     * * `data_process_region.cloud_provider` - (Required) Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * * `data_process_region.region` - (Required) Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     * 
     */
    public Output<FederatedDatabaseInstanceDataProcessRegion> dataProcessRegion() {
        return this.dataProcessRegion;
    }
    /**
     * The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hostnames;

    /**
     * @return The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * Name of the Atlas Federated Database Instance.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique ID for the project to create a Federated Database Instance.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Current state of the Federated Database Instance:
     * * `ACTIVE` - The Federated Database Instance is active and verified. You can query the data stores associated with the Federated Database Instance.
     * * `DELETED` - The Federated Database Instance was deleted.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Current state of the Federated Database Instance:
     * * `ACTIVE` - The Federated Database Instance is active and verified. You can query the data stores associated with the Federated Database Instance.
     * * `DELETED` - The Federated Database Instance was deleted.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
     * * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
     * * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
     * * `storage_databases.#.collections.#.name` - Name of the collection.
     * * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
     * * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
     * * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
     * * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
     * * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
     * * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn&#39;t verify the server&#39;s certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
     * * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
     * * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
     * * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
     * * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
     * * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
     * * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can&#39;t specify URLs that require authentication.
     * * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
     * * `storage_databases.#.views.#.name` - Name of the view.
     * * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
     * * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
     * 
     */
    @Export(name="storageDatabases", refs={List.class,FederatedDatabaseInstanceStorageDatabase.class}, tree="[0,1]")
    private Output<List<FederatedDatabaseInstanceStorageDatabase>> storageDatabases;

    /**
     * @return Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
     * * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
     * * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
     * * `storage_databases.#.collections.#.name` - Name of the collection.
     * * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
     * * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `&lt;collection&gt;`. Must match the name of an object in the stores array.
     * * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
     * * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
     * * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
     * * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn&#39;t verify the server&#39;s certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
     * * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
     * * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
     * * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
     * * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
     * * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
     * * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can&#39;t specify URLs that require authentication.
     * * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
     * * `storage_databases.#.views.#.name` - Name of the view.
     * * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
     * * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
     * 
     */
    public Output<List<FederatedDatabaseInstanceStorageDatabase>> storageDatabases() {
        return this.storageDatabases;
    }
    /**
     * Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
     * * `storage_stores.#.name` - Name of the data store.
     * * `storage_stores.#.provider` - Defines where the data is stored.
     * * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
     * * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
     * * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
     * * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
     * * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
     * * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
     * * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
     * * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
     * * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
     * * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
     * * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
     * * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
     * * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
     * * `storage_stores.#.read_preference.tag_sets` - List that contains tag sets or tag specification documents.
     * * `storage_stores.#.read_preference.tags` - List of all tags within a tag set
     * * `storage_stores.#.read_preference.tags.name` - Human-readable label of the tag.
     * * `storage_stores.#.read_preference.tags.value` - Value of the tag.
     * 
     */
    @Export(name="storageStores", refs={List.class,FederatedDatabaseInstanceStorageStore.class}, tree="[0,1]")
    private Output<List<FederatedDatabaseInstanceStorageStore>> storageStores;

    /**
     * @return Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
     * * `storage_stores.#.name` - Name of the data store.
     * * `storage_stores.#.provider` - Defines where the data is stored.
     * * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
     * * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
     * * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
     * * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
     * * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
     * * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
     * * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
     * * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
     * * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
     * * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
     * * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
     * * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
     * * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
     * * `storage_stores.#.read_preference.tag_sets` - List that contains tag sets or tag specification documents.
     * * `storage_stores.#.read_preference.tags` - List of all tags within a tag set
     * * `storage_stores.#.read_preference.tags.name` - Human-readable label of the tag.
     * * `storage_stores.#.read_preference.tags.value` - Value of the tag.
     * 
     */
    public Output<List<FederatedDatabaseInstanceStorageStore>> storageStores() {
        return this.storageStores;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FederatedDatabaseInstance(java.lang.String name) {
        this(name, FederatedDatabaseInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FederatedDatabaseInstance(java.lang.String name, FederatedDatabaseInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FederatedDatabaseInstance(java.lang.String name, FederatedDatabaseInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FederatedDatabaseInstance(java.lang.String name, Output<java.lang.String> id, @Nullable FederatedDatabaseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance", name, state, makeResourceOptions(options, id), false);
    }

    private static FederatedDatabaseInstanceArgs makeArgs(FederatedDatabaseInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FederatedDatabaseInstanceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FederatedDatabaseInstance get(java.lang.String name, Output<java.lang.String> id, @Nullable FederatedDatabaseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FederatedDatabaseInstance(name, id, state, options);
    }
}
