// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.FederatedDatabaseInstance
 *
 * `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance data source.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * ### S With MongoDB Atlas Cluster As Storage Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getFederatedDatabaseInstance({
 *     projectId: "PROJECT ID",
 *     name: "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
 * });
 * ```
 *
 * ### S With Amazon S3 Bucket As Storage Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getFederatedDatabaseInstance({
 *     projectId: "PROJECT ID",
 *     name: "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
 *     cloudProviderConfig: {
 *         aws: {
 *             testS3Bucket: "Amazon S3 Bucket Name",
 *         },
 *     },
 * });
 * ```
 */
export function getFederatedDatabaseInstance(args: GetFederatedDatabaseInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedDatabaseInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedDatabaseInstance:getFederatedDatabaseInstance", {
        "cloudProviderConfig": args.cloudProviderConfig,
        "name": args.name,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedDatabaseInstance.
 */
export interface GetFederatedDatabaseInstanceArgs {
    cloudProviderConfig?: inputs.GetFederatedDatabaseInstanceCloudProviderConfig;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    name: string;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: string;
}

/**
 * A collection of values returned by getFederatedDatabaseInstance.
 */
export interface GetFederatedDatabaseInstanceResult {
    readonly cloudProviderConfig: outputs.GetFederatedDatabaseInstanceCloudProviderConfig;
    readonly dataProcessRegions: outputs.GetFederatedDatabaseInstanceDataProcessRegion[];
    /**
     * The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
     */
    readonly hostnames: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly projectId: string;
    /**
     * Current state of the Federated Database Instance:
     * * `ACTIVE` - The Federated Database Instance is active and verified. You can query the data stores associated with the Federated Database Instance.
     * * `DELETED` - The Federated Database Instance was deleted.
     */
    readonly state: string;
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
    readonly storageDatabases: outputs.GetFederatedDatabaseInstanceStorageDatabase[];
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
    readonly storageStores: outputs.GetFederatedDatabaseInstanceStorageStore[];
}
/**
 * ## # Data Source: mongodbatlas.FederatedDatabaseInstance
 *
 * `mongodbatlas.FederatedDatabaseInstance` provides a Federated Database Instance data source.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * ### S With MongoDB Atlas Cluster As Storage Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getFederatedDatabaseInstance({
 *     projectId: "PROJECT ID",
 *     name: "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
 * });
 * ```
 *
 * ### S With Amazon S3 Bucket As Storage Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getFederatedDatabaseInstance({
 *     projectId: "PROJECT ID",
 *     name: "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
 *     cloudProviderConfig: {
 *         aws: {
 *             testS3Bucket: "Amazon S3 Bucket Name",
 *         },
 *     },
 * });
 * ```
 */
export function getFederatedDatabaseInstanceOutput(args: GetFederatedDatabaseInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedDatabaseInstanceResult> {
    return pulumi.output(args).apply((a: any) => getFederatedDatabaseInstance(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedDatabaseInstance.
 */
export interface GetFederatedDatabaseInstanceOutputArgs {
    cloudProviderConfig?: pulumi.Input<inputs.GetFederatedDatabaseInstanceCloudProviderConfigArgs>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    name: pulumi.Input<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: pulumi.Input<string>;
}
