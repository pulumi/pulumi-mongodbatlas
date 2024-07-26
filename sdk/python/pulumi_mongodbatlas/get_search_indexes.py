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

__all__ = [
    'GetSearchIndexesResult',
    'AwaitableGetSearchIndexesResult',
    'get_search_indexes',
    'get_search_indexes_output',
]

@pulumi.output_type
class GetSearchIndexesResult:
    """
    A collection of values returned by getSearchIndexes.
    """
    def __init__(__self__, cluster_name=None, collection_name=None, database=None, id=None, project_id=None, results=None, total_count=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if collection_name and not isinstance(collection_name, str):
            raise TypeError("Expected argument 'collection_name' to be a str")
        pulumi.set(__self__, "collection_name", collection_name)
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)
        if total_count and not isinstance(total_count, int):
            raise TypeError("Expected argument 'total_count' to be a int")
        pulumi.set(__self__, "total_count", total_count)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="collectionName")
    def collection_name(self) -> str:
        """
        (Required) Name of the collection the index is on.
        """
        return pulumi.get(self, "collection_name")

    @property
    @pulumi.getter
    def database(self) -> str:
        """
        (Required) Name of the database the collection is in.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetSearchIndexesResultResult']:
        """
        A list where each represents a search index.
        """
        return pulumi.get(self, "results")

    @property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> int:
        """
        Represents the total of the search indexes
        """
        return pulumi.get(self, "total_count")


class AwaitableGetSearchIndexesResult(GetSearchIndexesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSearchIndexesResult(
            cluster_name=self.cluster_name,
            collection_name=self.collection_name,
            database=self.database,
            id=self.id,
            project_id=self.project_id,
            results=self.results,
            total_count=self.total_count)


def get_search_indexes(cluster_name: Optional[str] = None,
                       collection_name: Optional[str] = None,
                       database: Optional[str] = None,
                       project_id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSearchIndexesResult:
    """
    ## # Data Source: get_search_indexes

    `get_search_indexes` describes all search indexes. This represents search indexes that have been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str cluster_name: Name of the cluster containing the collection with one or more Atlas Search indexes.
    :param str collection_name: Name of the collection with one or more Atlas Search indexes.
    :param str database: (Required) Name of the database the collection is in.
    :param str project_id: Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['collectionName'] = collection_name
    __args__['database'] = database
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getSearchIndexes:getSearchIndexes', __args__, opts=opts, typ=GetSearchIndexesResult).value

    return AwaitableGetSearchIndexesResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        collection_name=pulumi.get(__ret__, 'collection_name'),
        database=pulumi.get(__ret__, 'database'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'),
        total_count=pulumi.get(__ret__, 'total_count'))


@_utilities.lift_output_func(get_search_indexes)
def get_search_indexes_output(cluster_name: Optional[pulumi.Input[str]] = None,
                              collection_name: Optional[pulumi.Input[str]] = None,
                              database: Optional[pulumi.Input[str]] = None,
                              project_id: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSearchIndexesResult]:
    """
    ## # Data Source: get_search_indexes

    `get_search_indexes` describes all search indexes. This represents search indexes that have been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str cluster_name: Name of the cluster containing the collection with one or more Atlas Search indexes.
    :param str collection_name: Name of the collection with one or more Atlas Search indexes.
    :param str database: (Required) Name of the database the collection is in.
    :param str project_id: Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
    """
    ...
