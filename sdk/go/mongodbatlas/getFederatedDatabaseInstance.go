// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `FederatedDatabaseInstance` provides a Federated Database Instance data source.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
//
// ## Example Usage
// ### S With MongoDB Atlas Cluster As Storage Database
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.LookupFederatedDatabaseInstance(ctx, &mongodbatlas.LookupFederatedDatabaseInstanceArgs{
//				Name:      "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
//				ProjectId: "PROJECT ID",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### S With Amazon S3 Bucket As Storage Database
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.LookupFederatedDatabaseInstance(ctx, &mongodbatlas.LookupFederatedDatabaseInstanceArgs{
//				CloudProviderConfig: mongodbatlas.GetFederatedDatabaseInstanceCloudProviderConfig{
//					Aws: mongodbatlas.GetFederatedDatabaseInstanceCloudProviderConfigAws{
//						TestS3Bucket: "Amazon S3 Bucket Name",
//					},
//				},
//				Name:      "TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
//				ProjectId: "PROJECT ID",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFederatedDatabaseInstance(ctx *pulumi.Context, args *LookupFederatedDatabaseInstanceArgs, opts ...pulumi.InvokeOption) (*LookupFederatedDatabaseInstanceResult, error) {
	var rv LookupFederatedDatabaseInstanceResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedDatabaseInstance:getFederatedDatabaseInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedDatabaseInstance.
type LookupFederatedDatabaseInstanceArgs struct {
	CloudProviderConfig *GetFederatedDatabaseInstanceCloudProviderConfig `pulumi:"cloudProviderConfig"`
	// Name of the Atlas Federated Database Instance.
	Name string `pulumi:"name"`
	// The unique ID for the project to create a Federated Database Instance.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getFederatedDatabaseInstance.
type LookupFederatedDatabaseInstanceResult struct {
	CloudProviderConfig GetFederatedDatabaseInstanceCloudProviderConfig `pulumi:"cloudProviderConfig"`
	DataProcessRegions  []GetFederatedDatabaseInstanceDataProcessRegion `pulumi:"dataProcessRegions"`
	// The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
	Hostnames []string `pulumi:"hostnames"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	Name      string `pulumi:"name"`
	ProjectId string `pulumi:"projectId"`
	// Current state of the Federated Database Instance:
	State string `pulumi:"state"`
	// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
	// * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
	// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
	// * `storage_databases.#.collections.#.name` - Name of the collection.
	// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
	// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
	// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
	// * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
	// * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
	// * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
	// * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
	// * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
	// * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
	// * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
	// * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
	// * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
	// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
	// * `storage_databases.#.views.#.name` - Name of the view.
	// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
	// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
	StorageDatabases []GetFederatedDatabaseInstanceStorageDatabase `pulumi:"storageDatabases"`
	// Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
	// * `storage_stores.#.name` - Name of the data store.
	// * `storage_stores.#.provider` - Defines where the data is stored.
	// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
	// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
	// * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
	// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
	// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
	// * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
	// * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
	// * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
	// * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
	// * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
	// * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
	// * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
	// * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
	// * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
	// * `storage_stores.#.read_preference.tagSets` - List that contains tag sets or tag specification documents.
	// * `storage_stores.#.read_preference.tagSets.name` - Human-readable label of the tag.
	// * `storage_stores.#.read_preference.tagSets.value` - Value of the tag.
	StorageStores []GetFederatedDatabaseInstanceStorageStore `pulumi:"storageStores"`
}

func LookupFederatedDatabaseInstanceOutput(ctx *pulumi.Context, args LookupFederatedDatabaseInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupFederatedDatabaseInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFederatedDatabaseInstanceResult, error) {
			args := v.(LookupFederatedDatabaseInstanceArgs)
			r, err := LookupFederatedDatabaseInstance(ctx, &args, opts...)
			var s LookupFederatedDatabaseInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFederatedDatabaseInstanceResultOutput)
}

// A collection of arguments for invoking getFederatedDatabaseInstance.
type LookupFederatedDatabaseInstanceOutputArgs struct {
	CloudProviderConfig GetFederatedDatabaseInstanceCloudProviderConfigPtrInput `pulumi:"cloudProviderConfig"`
	// Name of the Atlas Federated Database Instance.
	Name pulumi.StringInput `pulumi:"name"`
	// The unique ID for the project to create a Federated Database Instance.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupFederatedDatabaseInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedDatabaseInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedDatabaseInstance.
type LookupFederatedDatabaseInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupFederatedDatabaseInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedDatabaseInstanceResult)(nil)).Elem()
}

func (o LookupFederatedDatabaseInstanceResultOutput) ToLookupFederatedDatabaseInstanceResultOutput() LookupFederatedDatabaseInstanceResultOutput {
	return o
}

func (o LookupFederatedDatabaseInstanceResultOutput) ToLookupFederatedDatabaseInstanceResultOutputWithContext(ctx context.Context) LookupFederatedDatabaseInstanceResultOutput {
	return o
}

func (o LookupFederatedDatabaseInstanceResultOutput) CloudProviderConfig() GetFederatedDatabaseInstanceCloudProviderConfigOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) GetFederatedDatabaseInstanceCloudProviderConfig {
		return v.CloudProviderConfig
	}).(GetFederatedDatabaseInstanceCloudProviderConfigOutput)
}

func (o LookupFederatedDatabaseInstanceResultOutput) DataProcessRegions() GetFederatedDatabaseInstanceDataProcessRegionArrayOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) []GetFederatedDatabaseInstanceDataProcessRegion {
		return v.DataProcessRegions
	}).(GetFederatedDatabaseInstanceDataProcessRegionArrayOutput)
}

// The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
func (o LookupFederatedDatabaseInstanceResultOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) []string { return v.Hostnames }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFederatedDatabaseInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFederatedDatabaseInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupFederatedDatabaseInstanceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Current state of the Federated Database Instance:
func (o LookupFederatedDatabaseInstanceResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) string { return v.State }).(pulumi.StringOutput)
}

// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
// * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
// * `storage_databases.#.collections.#.name` - Name of the collection.
// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
// * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
// * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
// * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
// * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
// * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
// * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
// * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
// * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
// * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
// * `storage_databases.#.views.#.name` - Name of the view.
// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
func (o LookupFederatedDatabaseInstanceResultOutput) StorageDatabases() GetFederatedDatabaseInstanceStorageDatabaseArrayOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) []GetFederatedDatabaseInstanceStorageDatabase {
		return v.StorageDatabases
	}).(GetFederatedDatabaseInstanceStorageDatabaseArrayOutput)
}

// Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
// * `storage_stores.#.name` - Name of the data store.
// * `storage_stores.#.provider` - Defines where the data is stored.
// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
// * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
// * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
// * `storage_stores.#.cluster_id` - ID of the Cluster the Online Archive belongs to.
// * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
// * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
// * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
// * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
// * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
// * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
// * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
// * `storage_stores.#.read_preference.tagSets` - List that contains tag sets or tag specification documents.
// * `storage_stores.#.read_preference.tagSets.name` - Human-readable label of the tag.
// * `storage_stores.#.read_preference.tagSets.value` - Value of the tag.
func (o LookupFederatedDatabaseInstanceResultOutput) StorageStores() GetFederatedDatabaseInstanceStorageStoreArrayOutput {
	return o.ApplyT(func(v LookupFederatedDatabaseInstanceResult) []GetFederatedDatabaseInstanceStorageStore {
		return v.StorageStores
	}).(GetFederatedDatabaseInstanceStorageStoreArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFederatedDatabaseInstanceResultOutput{})
}
