# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetFederatedDatabaseInstanceResult',
    'AwaitableGetFederatedDatabaseInstanceResult',
    'get_federated_database_instance',
    'get_federated_database_instance_output',
]

@pulumi.output_type
class GetFederatedDatabaseInstanceResult:
    """
    A collection of values returned by getFederatedDatabaseInstance.
    """
    def __init__(__self__, cloud_provider_config=None, data_process_regions=None, hostnames=None, id=None, name=None, project_id=None, state=None, storage_databases=None, storage_stores=None):
        if cloud_provider_config and not isinstance(cloud_provider_config, dict):
            raise TypeError("Expected argument 'cloud_provider_config' to be a dict")
        pulumi.set(__self__, "cloud_provider_config", cloud_provider_config)
        if data_process_regions and not isinstance(data_process_regions, list):
            raise TypeError("Expected argument 'data_process_regions' to be a list")
        pulumi.set(__self__, "data_process_regions", data_process_regions)
        if hostnames and not isinstance(hostnames, list):
            raise TypeError("Expected argument 'hostnames' to be a list")
        pulumi.set(__self__, "hostnames", hostnames)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if storage_databases and not isinstance(storage_databases, list):
            raise TypeError("Expected argument 'storage_databases' to be a list")
        pulumi.set(__self__, "storage_databases", storage_databases)
        if storage_stores and not isinstance(storage_stores, list):
            raise TypeError("Expected argument 'storage_stores' to be a list")
        pulumi.set(__self__, "storage_stores", storage_stores)

    @property
    @pulumi.getter(name="cloudProviderConfig")
    def cloud_provider_config(self) -> 'outputs.GetFederatedDatabaseInstanceCloudProviderConfigResult':
        return pulumi.get(self, "cloud_provider_config")

    @property
    @pulumi.getter(name="dataProcessRegions")
    def data_process_regions(self) -> Sequence['outputs.GetFederatedDatabaseInstanceDataProcessRegionResult']:
        return pulumi.get(self, "data_process_regions")

    @property
    @pulumi.getter
    def hostnames(self) -> Sequence[str]:
        """
        The list of hostnames assigned to the Federated Database Instance. Each string in the array is a hostname assigned to the Federated Database Instance.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Current state of the Federated Database Instance:
        * `ACTIVE` - The Federated Database Instance is active and verified. You can query the data stores associated with the Federated Database Instance.
        * `DELETED` - The Federated Database Instance was deleted.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="storageDatabases")
    def storage_databases(self) -> Sequence['outputs.GetFederatedDatabaseInstanceStorageDatabaseResult']:
        """
        Configuration details for mapping each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [databases](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-databases-reference). An empty object indicates that the Federated Database Instance has no mapping configuration for any data store.
        * `storage_databases.#.name` - Name of the database to which the Federated Database Instance maps the data contained in the data store.
        * `storage_databases.#.collections` -     Array of objects where each object represents a collection and data sources that map to a [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#mongodb-datalakeconf-datalakeconf.stores) data store.
        * `storage_databases.#.collections.#.name` - Name of the collection.
        * `storage_databases.#.collections.#.data_sources` -     Array of objects where each object represents a stores data store to map with the collection.
        * `storage_databases.#.collections.#.data_sources.#.store_name` -     Name of a data store to map to the `<collection>`. Must match the name of an object in the stores array.
        * `storage_databases.#.collections.#.data_sources.#.dataset_name` -     Human-readable label that identifies the dataset that Atlas generates for an ingestion pipeline run or Online Archive.
        * `storage_databases.#.collections.#.data_sources.#.default_format` - Default format that Federated Database assumes if it encounters a file without an extension while searching the storeName.
        * `storage_databases.#.collections.#.data_sources.#.path` - File path that controls how MongoDB Cloud searches for and parses files in the storeName before mapping them to a collection. Specify / to capture all files and folders from the prefix path.
        * `storage_databases.#.collections.#.data_sources.#.database` - Human-readable label that identifies the database, which contains the collection in the cluster.
        * `storage_databases.#.collections.#.data_sources.#.allow_insecure` - Flag that validates the scheme in the specified URLs. If true, allows insecure HTTP scheme, doesn't verify the server's certificate chain and hostname, and accepts any certificate with any hostname presented by the server. If false, allows secure HTTPS scheme only.
        * `storage_databases.#.collections.#.data_sources.#.database_regex` - Regex pattern to use for creating the wildcard database.
        * `storage_databases.#.collections.#.data_sources.#.collection` - Human-readable label that identifies the collection in the database.
        * `storage_databases.#.collections.#.data_sources.#.collection_regex` - Regex pattern to use for creating the wildcard (*) collection.
        * `storage_databases.#.collections.#.data_sources.#.provenance_field_name` - Name for the field that includes the provenance of the documents in the results.
        * `storage_databases.#.collections.#.data_sources.#.storeName` - Human-readable label that identifies the data store that MongoDB Cloud maps to the collection.
        * `storage_databases.#.collections.#.data_sources.#.urls` - URLs of the publicly accessible data files. You can't specify URLs that require authentication.
        * `storage_databases.#.views` -     Array of objects where each object represents an [aggregation pipeline](https://docs.mongodb.com/manual/core/aggregation-pipeline/#id1) on a collection. To learn more about views, see [Views](https://docs.mongodb.com/manual/core/views/).
        * `storage_databases.#.views.#.name` - Name of the view.
        * `storage_databases.#.views.#.source` -  Name of the source collection for the view.
        * `storage_databases.#.views.#.pipeline`- Aggregation pipeline stage(s) to apply to the source collection.
        """
        return pulumi.get(self, "storage_databases")

    @property
    @pulumi.getter(name="storageStores")
    def storage_stores(self) -> Sequence['outputs.GetFederatedDatabaseInstanceStorageStoreResult']:
        """
        Each object in the array represents a data store. Federated Database uses the storage.databases configuration details to map data in each data store to queryable databases and collections. For complete documentation on this object and its nested fields, see [stores](https://docs.mongodb.com/datalake/reference/format/data-lake-configuration#std-label-datalake-stores-reference). An empty object indicates that the Federated Database Instance has no configured data stores.
        * `storage_stores.#.name` - Name of the data store.
        * `storage_stores.#.provider` - Defines where the data is stored.
        * `storage_stores.#.region` - Name of the AWS region in which the S3 bucket is hosted.
        * `storage_stores.#.bucket` - Name of the AWS S3 bucket.
        * `storage_stores.#.prefix` - Prefix the Federated Database Instance applies when searching for files in the S3 bucket.
        * `storage_stores.#.delimiter` - The delimiter that separates `storage_databases.#.collections.#.data_sources.#.path` segments in the data store.
        * `storage_stores.#.include_tags` - Determines whether or not to use S3 tags on the files in the given path as additional partition attributes.
        * `storage_stores.#.cluster_name` - Human-readable label of the MongoDB Cloud cluster on which the store is based.
        * `storage_stores.#.allow_insecure` - Flag that validates the scheme in the specified URLs.
        * `storage_stores.#.public` - Flag that indicates whether the bucket is public.
        * `storage_stores.#.default_format` - Default format that Data Lake assumes if it encounters a file without an extension while searching the storeName.
        * `storage_stores.#.urls` - Comma-separated list of publicly accessible HTTP URLs where data is stored.
        * `storage_stores.#.read_preference` - MongoDB Cloud cluster read preference, which describes how to route read requests to the cluster.
        * `storage_stores.#.read_preference.maxStalenessSeconds` - Maximum replication lag, or staleness, for reads from secondaries.
        * `storage_stores.#.read_preference.mode` - Read preference mode that specifies to which replica set member to route the read requests.
        * `storage_stores.#.read_preference.tag_sets` - List that contains tag sets or tag specification documents.
        * `storage_stores.#.read_preference.tags` - List of all tags within a tag set
        * `storage_stores.#.read_preference.tags.name` - Human-readable label of the tag.
        * `storage_stores.#.read_preference.tags.value` - Value of the tag.
        """
        return pulumi.get(self, "storage_stores")


class AwaitableGetFederatedDatabaseInstanceResult(GetFederatedDatabaseInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFederatedDatabaseInstanceResult(
            cloud_provider_config=self.cloud_provider_config,
            data_process_regions=self.data_process_regions,
            hostnames=self.hostnames,
            id=self.id,
            name=self.name,
            project_id=self.project_id,
            state=self.state,
            storage_databases=self.storage_databases,
            storage_stores=self.storage_stores)


def get_federated_database_instance(cloud_provider_config: Optional[Union['GetFederatedDatabaseInstanceCloudProviderConfigArgs', 'GetFederatedDatabaseInstanceCloudProviderConfigArgsDict']] = None,
                                    name: Optional[str] = None,
                                    project_id: Optional[str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedDatabaseInstanceResult:
    """
    ## # Data Source: FederatedDatabaseInstance

    `FederatedDatabaseInstance` provides a Federated Database Instance data source.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.

    ## Example Usage

    ### S With MongoDB Atlas Cluster As Storage Database

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_federated_database_instance(project_id="PROJECT ID",
        name="TENANT NAME OF THE FEDERATED DATABASE INSTANCE")
    ```

    ### S With Amazon S3 Bucket As Storage Database

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_federated_database_instance(project_id="PROJECT ID",
        name="TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
        cloud_provider_config={
            "aws": {
                "test_s3_bucket": "Amazon S3 Bucket Name",
            },
        })
    ```


    :param str name: Name of the Atlas Federated Database Instance.
    :param str project_id: The unique ID for the project to create a Federated Database Instance.
    """
    __args__ = dict()
    __args__['cloudProviderConfig'] = cloud_provider_config
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFederatedDatabaseInstance:getFederatedDatabaseInstance', __args__, opts=opts, typ=GetFederatedDatabaseInstanceResult).value

    return AwaitableGetFederatedDatabaseInstanceResult(
        cloud_provider_config=pulumi.get(__ret__, 'cloud_provider_config'),
        data_process_regions=pulumi.get(__ret__, 'data_process_regions'),
        hostnames=pulumi.get(__ret__, 'hostnames'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        state=pulumi.get(__ret__, 'state'),
        storage_databases=pulumi.get(__ret__, 'storage_databases'),
        storage_stores=pulumi.get(__ret__, 'storage_stores'))


@_utilities.lift_output_func(get_federated_database_instance)
def get_federated_database_instance_output(cloud_provider_config: Optional[pulumi.Input[Optional[Union['GetFederatedDatabaseInstanceCloudProviderConfigArgs', 'GetFederatedDatabaseInstanceCloudProviderConfigArgsDict']]]] = None,
                                           name: Optional[pulumi.Input[str]] = None,
                                           project_id: Optional[pulumi.Input[str]] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFederatedDatabaseInstanceResult]:
    """
    ## # Data Source: FederatedDatabaseInstance

    `FederatedDatabaseInstance` provides a Federated Database Instance data source.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.

    ## Example Usage

    ### S With MongoDB Atlas Cluster As Storage Database

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_federated_database_instance(project_id="PROJECT ID",
        name="TENANT NAME OF THE FEDERATED DATABASE INSTANCE")
    ```

    ### S With Amazon S3 Bucket As Storage Database

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_federated_database_instance(project_id="PROJECT ID",
        name="TENANT NAME OF THE FEDERATED DATABASE INSTANCE",
        cloud_provider_config={
            "aws": {
                "test_s3_bucket": "Amazon S3 Bucket Name",
            },
        })
    ```


    :param str name: Name of the Atlas Federated Database Instance.
    :param str project_id: The unique ID for the project to create a Federated Database Instance.
    """
    ...
