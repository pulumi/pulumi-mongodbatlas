// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ### S With MongoDB Atlas Cluster As Storage Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.FederatedDatabaseInstance("test", {
 *     projectId: "PROJECT ID",
 *     name: "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
 *     storageDatabases: [{
 *         name: "VirtualDatabase0",
 *         collections: [{
 *             name: "NAME OF THE COLLECTION",
 *             dataSources: [{
 *                 collection: "COLLECTION IN THE CLUSTER",
 *                 database: "DB IN THE CLUSTER",
 *                 storeName: "CLUSTER NAME",
 *             }],
 *         }],
 *     }],
 *     storageStores: [{
 *         name: "STORE 1 NAME",
 *         clusterName: "CLUSTER NAME",
 *         projectId: "PROJECT ID",
 *         provider: "atlas",
 *         readPreference: {
 *             mode: "secondary",
 *         },
 *     }],
 * });
 * ```
 *
 * ### S With Amazon S3 Bucket As Storage Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.FederatedDatabaseInstance("test", {
 *     projectId: "PROJECT ID",
 *     name: "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
 *     cloudProviderConfig: {
 *         aws: {
 *             roleId: "AWS ROLE ID",
 *             testS3Bucket: "S3 BUCKET NAME",
 *         },
 *     },
 *     storageDatabases: [{
 *         name: "VirtualDatabase0",
 *         collections: [{
 *             name: "NAME OF THE COLLECTION",
 *             dataSources: [
 *                 {
 *                     collection: "COLLECTION IN THE CLUSTER",
 *                     database: "DB IN THE CLUSTER",
 *                     storeName: "CLUSTER NAME",
 *                 },
 *                 {
 *                     storeName: "S3 BUCKET NAME",
 *                     path: "S3 BUCKET PATH",
 *                 },
 *             ],
 *         }],
 *     }],
 *     storageStores: [
 *         {
 *             name: "STORE 1 NAME",
 *             clusterName: "CLUSTER NAME",
 *             projectId: "PROJECT ID",
 *             provider: "atlas",
 *             readPreference: {
 *                 mode: "secondary",
 *             },
 *         },
 *         {
 *             bucket: "STORE 2 NAME",
 *             delimiter: "/",
 *             name: "S3 BUCKET NAME",
 *             prefix: "S3 BUCKET PREFIX",
 *             provider: "s3",
 *             region: "AWS REGION",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Example specifying data process region and provider
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.FederatedDatabaseInstance("test", {
 *     projectId: "PROJECT ID",
 *     name: "NAME OF THE FEDERATED DATABASE INSTANCE",
 *     dataProcessRegion: {
 *         cloudProvider: "AWS",
 *         region: "OREGON_USA",
 *     },
 * });
 * ```
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
 */
export class FederatedDatabaseInstance extends pulumi.CustomResource {
    /**
     * Get an existing FederatedDatabaseInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FederatedDatabaseInstanceState, opts?: pulumi.CustomResourceOptions): FederatedDatabaseInstance {
        return new FederatedDatabaseInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance';

    /**
     * Returns true if the given object is an instance of FederatedDatabaseInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FederatedDatabaseInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FederatedDatabaseInstance.__pulumiType;
    }

    /**
     * Cloud provider linked to this data federated instance.
     * * `cloud_provider_config.aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloudProviderConfig` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * * `cloud_provider_config.aws.role_id` - (Required) Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `testS3Bucket`.
     * * `cloud_provider_config.aws.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `roleId`.
     */
    public readonly cloudProviderConfig!: pulumi.Output<outputs.FederatedDatabaseInstanceCloudProviderConfig>;
    /**
     * The cloud provider region to which the Federated Instance routes client connections for data processing.
     * * `data_process_region.cloud_provider` - (Required) Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * * `data_process_region.region` - (Required) Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     */
    public readonly dataProcessRegion!: pulumi.Output<outputs.FederatedDatabaseInstanceDataProcessRegion>;
    /**
     * The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
     */
    public /*out*/ readonly hostnames!: pulumi.Output<string[]>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Current state of the Federated Database Instance:
     * * `ACTIVE` - The Federated Database Instance is active and verified. You can query the data stores associated with the Federated Database Instance.
     * * `DELETED` - The Federated Database Instance was deleted.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
     * * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
     * * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
     * * `storage_databases.#.collections.#.name` - Name of the collection.
     * * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
     * * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
     * * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
     * * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
     * * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
     * * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
     * * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
     * * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
     * * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
     * * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
     * * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
     * * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
     * * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
     * * `storage_databases.#.views.#.name` - Name of the view.
     * * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
     * * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
     */
    public readonly storageDatabases!: pulumi.Output<outputs.FederatedDatabaseInstanceStorageDatabase[]>;
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
     */
    public readonly storageStores!: pulumi.Output<outputs.FederatedDatabaseInstanceStorageStore[]>;

    /**
     * Create a FederatedDatabaseInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FederatedDatabaseInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FederatedDatabaseInstanceArgs | FederatedDatabaseInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FederatedDatabaseInstanceState | undefined;
            resourceInputs["cloudProviderConfig"] = state ? state.cloudProviderConfig : undefined;
            resourceInputs["dataProcessRegion"] = state ? state.dataProcessRegion : undefined;
            resourceInputs["hostnames"] = state ? state.hostnames : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["storageDatabases"] = state ? state.storageDatabases : undefined;
            resourceInputs["storageStores"] = state ? state.storageStores : undefined;
        } else {
            const args = argsOrState as FederatedDatabaseInstanceArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["cloudProviderConfig"] = args ? args.cloudProviderConfig : undefined;
            resourceInputs["dataProcessRegion"] = args ? args.dataProcessRegion : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["storageDatabases"] = args ? args.storageDatabases : undefined;
            resourceInputs["storageStores"] = args ? args.storageStores : undefined;
            resourceInputs["hostnames"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FederatedDatabaseInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FederatedDatabaseInstance resources.
 */
export interface FederatedDatabaseInstanceState {
    /**
     * Cloud provider linked to this data federated instance.
     * * `cloud_provider_config.aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloudProviderConfig` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * * `cloud_provider_config.aws.role_id` - (Required) Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `testS3Bucket`.
     * * `cloud_provider_config.aws.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `roleId`.
     */
    cloudProviderConfig?: pulumi.Input<inputs.FederatedDatabaseInstanceCloudProviderConfig>;
    /**
     * The cloud provider region to which the Federated Instance routes client connections for data processing.
     * * `data_process_region.cloud_provider` - (Required) Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * * `data_process_region.region` - (Required) Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     */
    dataProcessRegion?: pulumi.Input<inputs.FederatedDatabaseInstanceDataProcessRegion>;
    /**
     * The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
     */
    hostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Current state of the Federated Database Instance:
     * * `ACTIVE` - The Federated Database Instance is active and verified. You can query the data stores associated with the Federated Database Instance.
     * * `DELETED` - The Federated Database Instance was deleted.
     */
    state?: pulumi.Input<string>;
    /**
     * Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
     * * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
     * * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
     * * `storage_databases.#.collections.#.name` - Name of the collection.
     * * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
     * * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
     * * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
     * * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
     * * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
     * * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
     * * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
     * * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
     * * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
     * * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
     * * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
     * * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
     * * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
     * * `storage_databases.#.views.#.name` - Name of the view.
     * * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
     * * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
     */
    storageDatabases?: pulumi.Input<pulumi.Input<inputs.FederatedDatabaseInstanceStorageDatabase>[]>;
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
     */
    storageStores?: pulumi.Input<pulumi.Input<inputs.FederatedDatabaseInstanceStorageStore>[]>;
}

/**
 * The set of arguments for constructing a FederatedDatabaseInstance resource.
 */
export interface FederatedDatabaseInstanceArgs {
    /**
     * Cloud provider linked to this data federated instance.
     * * `cloud_provider_config.aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloudProviderConfig` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * * `cloud_provider_config.aws.role_id` - (Required) Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `testS3Bucket`.
     * * `cloud_provider_config.aws.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `roleId`.
     */
    cloudProviderConfig?: pulumi.Input<inputs.FederatedDatabaseInstanceCloudProviderConfig>;
    /**
     * The cloud provider region to which the Federated Instance routes client connections for data processing.
     * * `data_process_region.cloud_provider` - (Required) Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * * `data_process_region.region` - (Required) Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     */
    dataProcessRegion?: pulumi.Input<inputs.FederatedDatabaseInstanceDataProcessRegion>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: pulumi.Input<string>;
    /**
     * Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
     * * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
     * * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
     * * `storage_databases.#.collections.#.name` - Name of the collection.
     * * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
     * * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
     * * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
     * * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
     * * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
     * * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
     * * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
     * * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
     * * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
     * * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
     * * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
     * * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
     * * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
     * * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
     * * `storage_databases.#.views.#.name` - Name of the view.
     * * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
     * * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
     */
    storageDatabases?: pulumi.Input<pulumi.Input<inputs.FederatedDatabaseInstanceStorageDatabase>[]>;
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
     */
    storageStores?: pulumi.Input<pulumi.Input<inputs.FederatedDatabaseInstanceStorageStore>[]>;
}
