# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DataLakeArgs', 'DataLake']

@pulumi.input_type
class DataLakeArgs:
    def __init__(__self__, *,
                 aws: pulumi.Input['DataLakeAwsArgs'],
                 project_id: pulumi.Input[str],
                 data_process_region: Optional[pulumi.Input['DataLakeDataProcessRegionArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DataLake resource.
        :param pulumi.Input['DataLakeAwsArgs'] aws: AWS provider of the cloud service where Data Lake can access the S3 Bucket.
               * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
               * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake.
        :param pulumi.Input['DataLakeDataProcessRegionArgs'] data_process_region: The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
               * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
               * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        :param pulumi.Input[str] name: Name of the Atlas Data Lake.
        """
        pulumi.set(__self__, "aws", aws)
        pulumi.set(__self__, "project_id", project_id)
        if data_process_region is not None:
            pulumi.set(__self__, "data_process_region", data_process_region)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Input['DataLakeAwsArgs']:
        """
        AWS provider of the cloud service where Data Lake can access the S3 Bucket.
        * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
        * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: pulumi.Input['DataLakeAwsArgs']):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique ID for the project to create a data lake.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="dataProcessRegion")
    def data_process_region(self) -> Optional[pulumi.Input['DataLakeDataProcessRegionArgs']]:
        """
        The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
        * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
        * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        """
        return pulumi.get(self, "data_process_region")

    @data_process_region.setter
    def data_process_region(self, value: Optional[pulumi.Input['DataLakeDataProcessRegionArgs']]):
        pulumi.set(self, "data_process_region", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Atlas Data Lake.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DataLakeState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input['DataLakeAwsArgs']] = None,
                 data_process_region: Optional[pulumi.Input['DataLakeDataProcessRegionArgs']] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 storage_databases: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakeStorageDatabaseArgs']]]] = None,
                 storage_stores: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakeStorageStoreArgs']]]] = None):
        """
        Input properties used for looking up and filtering DataLake resources.
        :param pulumi.Input['DataLakeAwsArgs'] aws: AWS provider of the cloud service where Data Lake can access the S3 Bucket.
               * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
               * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        :param pulumi.Input['DataLakeDataProcessRegionArgs'] data_process_region: The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
               * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
               * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
        :param pulumi.Input[str] name: Name of the Atlas Data Lake.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake.
        :param pulumi.Input[str] state: Current state of the Atlas Data Lake:
        :param pulumi.Input[Sequence[pulumi.Input['DataLakeStorageDatabaseArgs']]] storage_databases: Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
               * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
               * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
               * `storage_databases.#.collections.#.name` - Name of the collection.
               * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
               * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
               * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
               * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
               * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
               * `storage_databases.#.views.#.name` - Name of the view.
               * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
               * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        :param pulumi.Input[Sequence[pulumi.Input['DataLakeStorageStoreArgs']]] storage_stores: Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
               * `storage_stores.#.name` - Name of the data store.
               * `storage_stores.#.provider` - Defines where the data is stored.
               * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
               * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
               * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
               * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
               * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if data_process_region is not None:
            pulumi.set(__self__, "data_process_region", data_process_region)
        if hostnames is not None:
            pulumi.set(__self__, "hostnames", hostnames)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if storage_databases is not None:
            pulumi.set(__self__, "storage_databases", storage_databases)
        if storage_stores is not None:
            pulumi.set(__self__, "storage_stores", storage_stores)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['DataLakeAwsArgs']]:
        """
        AWS provider of the cloud service where Data Lake can access the S3 Bucket.
        * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
        * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['DataLakeAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter(name="dataProcessRegion")
    def data_process_region(self) -> Optional[pulumi.Input['DataLakeDataProcessRegionArgs']]:
        """
        The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
        * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
        * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        """
        return pulumi.get(self, "data_process_region")

    @data_process_region.setter
    def data_process_region(self, value: Optional[pulumi.Input['DataLakeDataProcessRegionArgs']]):
        pulumi.set(self, "data_process_region", value)

    @property
    @pulumi.getter
    def hostnames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Atlas Data Lake.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID for the project to create a data lake.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Current state of the Atlas Data Lake:
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="storageDatabases")
    def storage_databases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DataLakeStorageDatabaseArgs']]]]:
        """
        Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
        * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
        * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        * `storage_databases.#.collections.#.name` - Name of the collection.
        * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
        * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
        * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        * `storage_databases.#.views.#.name` - Name of the view.
        * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        """
        return pulumi.get(self, "storage_databases")

    @storage_databases.setter
    def storage_databases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakeStorageDatabaseArgs']]]]):
        pulumi.set(self, "storage_databases", value)

    @property
    @pulumi.getter(name="storageStores")
    def storage_stores(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DataLakeStorageStoreArgs']]]]:
        """
        Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
        * `storage_stores.#.name` - Name of the data store.
        * `storage_stores.#.provider` - Defines where the data is stored.
        * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
        * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        """
        return pulumi.get(self, "storage_stores")

    @storage_stores.setter
    def storage_stores(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakeStorageStoreArgs']]]]):
        pulumi.set(self, "storage_stores", value)


class DataLake(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['DataLakeAwsArgs']]] = None,
                 data_process_region: Optional[pulumi.Input[pulumi.InputType['DataLakeDataProcessRegionArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Data Lake can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`--`aws_test_s3_bucket`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/dataLake:DataLake example 1112222b3bf99403840e8934--test-data-lake--s3-test
        ```

         See [MongoDB Atlas API](https://docs.mongodb.com/datalake/reference/api/dataLakes-create-one-tenant) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DataLakeAwsArgs']] aws: AWS provider of the cloud service where Data Lake can access the S3 Bucket.
               * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
               * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        :param pulumi.Input[pulumi.InputType['DataLakeDataProcessRegionArgs']] data_process_region: The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
               * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
               * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        :param pulumi.Input[str] name: Name of the Atlas Data Lake.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataLakeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Data Lake can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`--`aws_test_s3_bucket`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/dataLake:DataLake example 1112222b3bf99403840e8934--test-data-lake--s3-test
        ```

         See [MongoDB Atlas API](https://docs.mongodb.com/datalake/reference/api/dataLakes-create-one-tenant) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param DataLakeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataLakeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['DataLakeAwsArgs']]] = None,
                 data_process_region: Optional[pulumi.Input[pulumi.InputType['DataLakeDataProcessRegionArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataLakeArgs.__new__(DataLakeArgs)

            if aws is None and not opts.urn:
                raise TypeError("Missing required property 'aws'")
            __props__.__dict__["aws"] = aws
            __props__.__dict__["data_process_region"] = data_process_region
            __props__.__dict__["name"] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["hostnames"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["storage_databases"] = None
            __props__.__dict__["storage_stores"] = None
        super(DataLake, __self__).__init__(
            'mongodbatlas:index/dataLake:DataLake',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[pulumi.InputType['DataLakeAwsArgs']]] = None,
            data_process_region: Optional[pulumi.Input[pulumi.InputType['DataLakeDataProcessRegionArgs']]] = None,
            hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            storage_databases: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakeStorageDatabaseArgs']]]]] = None,
            storage_stores: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakeStorageStoreArgs']]]]] = None) -> 'DataLake':
        """
        Get an existing DataLake resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DataLakeAwsArgs']] aws: AWS provider of the cloud service where Data Lake can access the S3 Bucket.
               * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
               * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        :param pulumi.Input[pulumi.InputType['DataLakeDataProcessRegionArgs']] data_process_region: The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
               * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
               * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
        :param pulumi.Input[str] name: Name of the Atlas Data Lake.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake.
        :param pulumi.Input[str] state: Current state of the Atlas Data Lake:
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakeStorageDatabaseArgs']]]] storage_databases: Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
               * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
               * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
               * `storage_databases.#.collections.#.name` - Name of the collection.
               * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
               * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
               * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
               * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
               * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
               * `storage_databases.#.views.#.name` - Name of the view.
               * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
               * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakeStorageStoreArgs']]]] storage_stores: Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
               * `storage_stores.#.name` - Name of the data store.
               * `storage_stores.#.provider` - Defines where the data is stored.
               * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
               * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
               * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
               * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
               * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataLakeState.__new__(_DataLakeState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["data_process_region"] = data_process_region
        __props__.__dict__["hostnames"] = hostnames
        __props__.__dict__["name"] = name
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["state"] = state
        __props__.__dict__["storage_databases"] = storage_databases
        __props__.__dict__["storage_stores"] = storage_stores
        return DataLake(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output['outputs.DataLakeAws']:
        """
        AWS provider of the cloud service where Data Lake can access the S3 Bucket.
        * `aws.0.role_id` - (Required) Unique identifier of the role that Data Lake can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `aws.0.test_s3_bucket`.
        * `aws.0.test_s3_bucket` - (Required) Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `aws.0.role_id`.
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter(name="dataProcessRegion")
    def data_process_region(self) -> pulumi.Output['outputs.DataLakeDataProcessRegion']:
        """
        The cloud provider region to which Atlas Data Lake routes client connections for data processing. Set to `null` to direct Atlas Data Lake to route client connections to the region nearest to the client based on DNS resolution.
        * `data_process_region.0.cloud_provider` - (Required) Name of the cloud service provider. Atlas Data Lake only supports AWS.
        * `data_process_region.0.region` - (Required). Name of the region to which Data Lake routes client connections for data processing. Atlas Data Lake only supports the following regions:
        """
        return pulumi.get(self, "data_process_region")

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of hostnames assigned to the Atlas Data Lake. Each string in the array is a hostname assigned to the Atlas Data Lake.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Atlas Data Lake.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project to create a data lake.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Current state of the Atlas Data Lake:
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="storageDatabases")
    def storage_databases(self) -> pulumi.Output[Sequence['outputs.DataLakeStorageDatabase']]:
        """
        Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Data Lake has no mapping configuration for any data store.
        * `storage_databases.#.name` - Name of the database to which Data Lake maps the data contained in the data store.
        * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        * `storage_databases.#.collections.#.name` - Name of the collection.
        * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
        * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        * `storage_databases.#.collections.#.data_sources.#.path` - Controls how Atlas Data Lake searches for and parses files in the storeName before mapping them to the `<collection>`.
        * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        * `storage_databases.#.views.#.name` - Name of the view.
        * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        """
        return pulumi.get(self, "storage_databases")

    @property
    @pulumi.getter(name="storageStores")
    def storage_stores(self) -> pulumi.Output[Sequence['outputs.DataLakeStorageStore']]:
        """
        Each object in the array represents a data store. Data Lake uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Data Lake has no configured data stores.
        * `storage_stores.#.name` - Name of the data store.
        * `storage_stores.#.provider` - Defines where the data is stored.
        * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        * `storage_stores.#.prefix` - Prefix Data Lake applies when searching for files in the S3 bucket .
        * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        """
        return pulumi.get(self, "storage_stores")
