// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `DataLake` provides a Data Lake resource.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text. Read more about sensitive data in state.
//
// ## Example Usage
//
// ## Import
//
// Data Lake can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`--`aws_test_s3_bucket`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/dataLake:DataLake example 1112222b3bf99403840e8934--test-data-lake--s3-test
//
// ```
//
//	See [MongoDB Atlas API](https://docs.mongodb.com/datalake/reference/api/dataLakes-create-one-tenant) Documentation for more information.
type DataLake struct {
	pulumi.CustomResourceState

	// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
	// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
	// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
	Aws DataLakeAwsOutput `pulumi:"aws"`
	// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
	// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
	// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
	DataProcessRegion DataLakeDataProcessRegionOutput `pulumi:"dataProcessRegion"`
	// The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
	Hostnames pulumi.StringArrayOutput `pulumi:"hostnames"`
	// Name of the Atlas Data Lake.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique ID for the project to create a data lake.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Current state of the Atlas Data Lake:
	State pulumi.StringOutput `pulumi:"state"`
	// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
	// * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
	// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
	// * `storage_databases.#.collections.#.name` - Name of the collection.
	// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
	// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
	// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
	// * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
	// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
	// * `storage_databases.#.views.#.name` - Name of the view.
	// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
	// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
	StorageDatabases DataLakeStorageDatabaseArrayOutput `pulumi:"storageDatabases"`
	// Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
	// * `storage_stores.#.name` - Name of the data store.
	// * `storage_stores.#.provider` - Defines where the data is stored.
	// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
	// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
	// * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
	// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
	// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
	StorageStores DataLakeStorageStoreArrayOutput `pulumi:"storageStores"`
}

// NewDataLake registers a new resource with the given unique name, arguments, and options.
func NewDataLake(ctx *pulumi.Context,
	name string, args *DataLakeArgs, opts ...pulumi.ResourceOption) (*DataLake, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Aws == nil {
		return nil, errors.New("invalid value for required argument 'Aws'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataLake
	err := ctx.RegisterResource("mongodbatlas:index/dataLake:DataLake", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataLake gets an existing DataLake resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataLake(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataLakeState, opts ...pulumi.ResourceOption) (*DataLake, error) {
	var resource DataLake
	err := ctx.ReadResource("mongodbatlas:index/dataLake:DataLake", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataLake resources.
type dataLakeState struct {
	// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
	// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
	// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
	Aws *DataLakeAws `pulumi:"aws"`
	// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
	// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
	// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
	DataProcessRegion *DataLakeDataProcessRegion `pulumi:"dataProcessRegion"`
	// The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
	Hostnames []string `pulumi:"hostnames"`
	// Name of the Atlas Data Lake.
	Name *string `pulumi:"name"`
	// The unique ID for the project to create a data lake.
	ProjectId *string `pulumi:"projectId"`
	// Current state of the Atlas Data Lake:
	State *string `pulumi:"state"`
	// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
	// * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
	// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
	// * `storage_databases.#.collections.#.name` - Name of the collection.
	// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
	// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
	// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
	// * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
	// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
	// * `storage_databases.#.views.#.name` - Name of the view.
	// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
	// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
	StorageDatabases []DataLakeStorageDatabase `pulumi:"storageDatabases"`
	// Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
	// * `storage_stores.#.name` - Name of the data store.
	// * `storage_stores.#.provider` - Defines where the data is stored.
	// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
	// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
	// * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
	// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
	// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
	StorageStores []DataLakeStorageStore `pulumi:"storageStores"`
}

type DataLakeState struct {
	// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
	// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
	// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
	Aws DataLakeAwsPtrInput
	// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
	// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
	// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
	DataProcessRegion DataLakeDataProcessRegionPtrInput
	// The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
	Hostnames pulumi.StringArrayInput
	// Name of the Atlas Data Lake.
	Name pulumi.StringPtrInput
	// The unique ID for the project to create a data lake.
	ProjectId pulumi.StringPtrInput
	// Current state of the Atlas Data Lake:
	State pulumi.StringPtrInput
	// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
	// * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
	// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
	// * `storage_databases.#.collections.#.name` - Name of the collection.
	// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
	// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
	// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
	// * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
	// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
	// * `storage_databases.#.views.#.name` - Name of the view.
	// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
	// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
	StorageDatabases DataLakeStorageDatabaseArrayInput
	// Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
	// * `storage_stores.#.name` - Name of the data store.
	// * `storage_stores.#.provider` - Defines where the data is stored.
	// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
	// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
	// * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
	// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
	// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
	StorageStores DataLakeStorageStoreArrayInput
}

func (DataLakeState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataLakeState)(nil)).Elem()
}

type dataLakeArgs struct {
	// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
	// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
	// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
	Aws DataLakeAws `pulumi:"aws"`
	// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
	// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
	// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
	DataProcessRegion *DataLakeDataProcessRegion `pulumi:"dataProcessRegion"`
	// Name of the Atlas Data Lake.
	Name *string `pulumi:"name"`
	// The unique ID for the project to create a data lake.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a DataLake resource.
type DataLakeArgs struct {
	// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
	// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
	// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
	Aws DataLakeAwsInput
	// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
	// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
	// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
	DataProcessRegion DataLakeDataProcessRegionPtrInput
	// Name of the Atlas Data Lake.
	Name pulumi.StringPtrInput
	// The unique ID for the project to create a data lake.
	ProjectId pulumi.StringInput
}

func (DataLakeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataLakeArgs)(nil)).Elem()
}

type DataLakeInput interface {
	pulumi.Input

	ToDataLakeOutput() DataLakeOutput
	ToDataLakeOutputWithContext(ctx context.Context) DataLakeOutput
}

func (*DataLake) ElementType() reflect.Type {
	return reflect.TypeOf((**DataLake)(nil)).Elem()
}

func (i *DataLake) ToDataLakeOutput() DataLakeOutput {
	return i.ToDataLakeOutputWithContext(context.Background())
}

func (i *DataLake) ToDataLakeOutputWithContext(ctx context.Context) DataLakeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataLakeOutput)
}

func (i *DataLake) ToOutput(ctx context.Context) pulumix.Output[*DataLake] {
	return pulumix.Output[*DataLake]{
		OutputState: i.ToDataLakeOutputWithContext(ctx).OutputState,
	}
}

// DataLakeArrayInput is an input type that accepts DataLakeArray and DataLakeArrayOutput values.
// You can construct a concrete instance of `DataLakeArrayInput` via:
//
//	DataLakeArray{ DataLakeArgs{...} }
type DataLakeArrayInput interface {
	pulumi.Input

	ToDataLakeArrayOutput() DataLakeArrayOutput
	ToDataLakeArrayOutputWithContext(context.Context) DataLakeArrayOutput
}

type DataLakeArray []DataLakeInput

func (DataLakeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataLake)(nil)).Elem()
}

func (i DataLakeArray) ToDataLakeArrayOutput() DataLakeArrayOutput {
	return i.ToDataLakeArrayOutputWithContext(context.Background())
}

func (i DataLakeArray) ToDataLakeArrayOutputWithContext(ctx context.Context) DataLakeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataLakeArrayOutput)
}

func (i DataLakeArray) ToOutput(ctx context.Context) pulumix.Output[[]*DataLake] {
	return pulumix.Output[[]*DataLake]{
		OutputState: i.ToDataLakeArrayOutputWithContext(ctx).OutputState,
	}
}

// DataLakeMapInput is an input type that accepts DataLakeMap and DataLakeMapOutput values.
// You can construct a concrete instance of `DataLakeMapInput` via:
//
//	DataLakeMap{ "key": DataLakeArgs{...} }
type DataLakeMapInput interface {
	pulumi.Input

	ToDataLakeMapOutput() DataLakeMapOutput
	ToDataLakeMapOutputWithContext(context.Context) DataLakeMapOutput
}

type DataLakeMap map[string]DataLakeInput

func (DataLakeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataLake)(nil)).Elem()
}

func (i DataLakeMap) ToDataLakeMapOutput() DataLakeMapOutput {
	return i.ToDataLakeMapOutputWithContext(context.Background())
}

func (i DataLakeMap) ToDataLakeMapOutputWithContext(ctx context.Context) DataLakeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataLakeMapOutput)
}

func (i DataLakeMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*DataLake] {
	return pulumix.Output[map[string]*DataLake]{
		OutputState: i.ToDataLakeMapOutputWithContext(ctx).OutputState,
	}
}

type DataLakeOutput struct{ *pulumi.OutputState }

func (DataLakeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataLake)(nil)).Elem()
}

func (o DataLakeOutput) ToDataLakeOutput() DataLakeOutput {
	return o
}

func (o DataLakeOutput) ToDataLakeOutputWithContext(ctx context.Context) DataLakeOutput {
	return o
}

func (o DataLakeOutput) ToOutput(ctx context.Context) pulumix.Output[*DataLake] {
	return pulumix.Output[*DataLake]{
		OutputState: o.OutputState,
	}
}

// AWS provider of the cloud service where Data Lake can access the S3 Bucket.
// * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
// * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
func (o DataLakeOutput) Aws() DataLakeAwsOutput {
	return o.ApplyT(func(v *DataLake) DataLakeAwsOutput { return v.Aws }).(DataLakeAwsOutput)
}

// The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
// * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
// * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
func (o DataLakeOutput) DataProcessRegion() DataLakeDataProcessRegionOutput {
	return o.ApplyT(func(v *DataLake) DataLakeDataProcessRegionOutput { return v.DataProcessRegion }).(DataLakeDataProcessRegionOutput)
}

// The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
func (o DataLakeOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DataLake) pulumi.StringArrayOutput { return v.Hostnames }).(pulumi.StringArrayOutput)
}

// Name of the Atlas Data Lake.
func (o DataLakeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataLake) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique ID for the project to create a data lake.
func (o DataLakeOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataLake) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Current state of the Atlas Data Lake:
func (o DataLakeOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *DataLake) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
// * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
// * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
// * `storage_databases.#.collections.#.name` - Name of the collection.
// * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
// * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
// * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
// * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
// * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
// * `storage_databases.#.views.#.name` - Name of the view.
// * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
// * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
func (o DataLakeOutput) StorageDatabases() DataLakeStorageDatabaseArrayOutput {
	return o.ApplyT(func(v *DataLake) DataLakeStorageDatabaseArrayOutput { return v.StorageDatabases }).(DataLakeStorageDatabaseArrayOutput)
}

// Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
// * `storage_stores.#.name` - Name of the data store.
// * `storage_stores.#.provider` - Defines where the data is stored.
// * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
// * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
// * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
// * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
// * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
func (o DataLakeOutput) StorageStores() DataLakeStorageStoreArrayOutput {
	return o.ApplyT(func(v *DataLake) DataLakeStorageStoreArrayOutput { return v.StorageStores }).(DataLakeStorageStoreArrayOutput)
}

type DataLakeArrayOutput struct{ *pulumi.OutputState }

func (DataLakeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataLake)(nil)).Elem()
}

func (o DataLakeArrayOutput) ToDataLakeArrayOutput() DataLakeArrayOutput {
	return o
}

func (o DataLakeArrayOutput) ToDataLakeArrayOutputWithContext(ctx context.Context) DataLakeArrayOutput {
	return o
}

func (o DataLakeArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*DataLake] {
	return pulumix.Output[[]*DataLake]{
		OutputState: o.OutputState,
	}
}

func (o DataLakeArrayOutput) Index(i pulumi.IntInput) DataLakeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataLake {
		return vs[0].([]*DataLake)[vs[1].(int)]
	}).(DataLakeOutput)
}

type DataLakeMapOutput struct{ *pulumi.OutputState }

func (DataLakeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataLake)(nil)).Elem()
}

func (o DataLakeMapOutput) ToDataLakeMapOutput() DataLakeMapOutput {
	return o
}

func (o DataLakeMapOutput) ToDataLakeMapOutputWithContext(ctx context.Context) DataLakeMapOutput {
	return o
}

func (o DataLakeMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*DataLake] {
	return pulumix.Output[map[string]*DataLake]{
		OutputState: o.OutputState,
	}
}

func (o DataLakeMapOutput) MapIndex(k pulumi.StringInput) DataLakeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataLake {
		return vs[0].(map[string]*DataLake)[vs[1].(string)]
	}).(DataLakeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataLakeInput)(nil)).Elem(), &DataLake{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataLakeArrayInput)(nil)).Elem(), DataLakeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataLakeMapInput)(nil)).Elem(), DataLakeMap{})
	pulumi.RegisterOutputType(DataLakeOutput{})
	pulumi.RegisterOutputType(DataLakeArrayOutput{})
	pulumi.RegisterOutputType(DataLakeMapOutput{})
}
