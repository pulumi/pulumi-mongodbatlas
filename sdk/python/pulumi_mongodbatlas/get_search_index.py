# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetSearchIndexResult',
    'AwaitableGetSearchIndexResult',
    'get_search_index',
    'get_search_index_output',
]

@pulumi.output_type
class GetSearchIndexResult:
    """
    A collection of values returned by getSearchIndex.
    """
    def __init__(__self__, analyzer=None, analyzers=None, cluster_name=None, collection_name=None, database=None, fields=None, id=None, index_id=None, mappings_dynamic=None, mappings_fields=None, name=None, project_id=None, search_analyzer=None, status=None, stored_source=None, synonyms=None, type=None):
        if analyzer and not isinstance(analyzer, str):
            raise TypeError("Expected argument 'analyzer' to be a str")
        pulumi.set(__self__, "analyzer", analyzer)
        if analyzers and not isinstance(analyzers, str):
            raise TypeError("Expected argument 'analyzers' to be a str")
        pulumi.set(__self__, "analyzers", analyzers)
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if collection_name and not isinstance(collection_name, str):
            raise TypeError("Expected argument 'collection_name' to be a str")
        pulumi.set(__self__, "collection_name", collection_name)
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if fields and not isinstance(fields, str):
            raise TypeError("Expected argument 'fields' to be a str")
        pulumi.set(__self__, "fields", fields)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if index_id and not isinstance(index_id, str):
            raise TypeError("Expected argument 'index_id' to be a str")
        pulumi.set(__self__, "index_id", index_id)
        if mappings_dynamic and not isinstance(mappings_dynamic, bool):
            raise TypeError("Expected argument 'mappings_dynamic' to be a bool")
        pulumi.set(__self__, "mappings_dynamic", mappings_dynamic)
        if mappings_fields and not isinstance(mappings_fields, str):
            raise TypeError("Expected argument 'mappings_fields' to be a str")
        pulumi.set(__self__, "mappings_fields", mappings_fields)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if search_analyzer and not isinstance(search_analyzer, str):
            raise TypeError("Expected argument 'search_analyzer' to be a str")
        pulumi.set(__self__, "search_analyzer", search_analyzer)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if stored_source and not isinstance(stored_source, str):
            raise TypeError("Expected argument 'stored_source' to be a str")
        pulumi.set(__self__, "stored_source", stored_source)
        if synonyms and not isinstance(synonyms, list):
            raise TypeError("Expected argument 'synonyms' to be a list")
        pulumi.set(__self__, "synonyms", synonyms)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def analyzer(self) -> str:
        """
        [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
        """
        return pulumi.get(self, "analyzer")

    @property
    @pulumi.getter
    def analyzers(self) -> str:
        """
        [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
        """
        return pulumi.get(self, "analyzers")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="collectionName")
    def collection_name(self) -> str:
        """
        Name of the collection the index is on.
        """
        return pulumi.get(self, "collection_name")

    @property
    @pulumi.getter
    def database(self) -> str:
        """
        Name of the database the collection is in.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def fields(self) -> str:
        return pulumi.get(self, "fields")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> str:
        return pulumi.get(self, "index_id")

    @property
    @pulumi.getter(name="mappingsDynamic")
    def mappings_dynamic(self) -> bool:
        """
        Flag indicating whether the index uses dynamic or static mappings.
        """
        return pulumi.get(self, "mappings_dynamic")

    @property
    @pulumi.getter(name="mappingsFields")
    def mappings_fields(self) -> str:
        """
        Object containing one or more field specifications.
        """
        return pulumi.get(self, "mappings_fields")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the index.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="searchAnalyzer")
    def search_analyzer(self) -> str:
        """
        [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
        """
        return pulumi.get(self, "search_analyzer")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Current status of the index.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="storedSource")
    def stored_source(self) -> str:
        """
        String that can be "true" (store all fields), "false" (default, don't store any field), or a JSON string that contains the list of fields to store (include) or not store (exclude) on Atlas Search. To learn more, see [Stored Source Fields](https://www.mongodb.com/docs/atlas/atlas-search/stored-source-definition/).
        """
        return pulumi.get(self, "stored_source")

    @property
    @pulumi.getter
    def synonyms(self) -> Sequence['outputs.GetSearchIndexSynonymResult']:
        """
        Synonyms mapping definition to use in this index.
        * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
        * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
        * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
        """
        return pulumi.get(self, "synonyms")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetSearchIndexResult(GetSearchIndexResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSearchIndexResult(
            analyzer=self.analyzer,
            analyzers=self.analyzers,
            cluster_name=self.cluster_name,
            collection_name=self.collection_name,
            database=self.database,
            fields=self.fields,
            id=self.id,
            index_id=self.index_id,
            mappings_dynamic=self.mappings_dynamic,
            mappings_fields=self.mappings_fields,
            name=self.name,
            project_id=self.project_id,
            search_analyzer=self.search_analyzer,
            status=self.status,
            stored_source=self.stored_source,
            synonyms=self.synonyms,
            type=self.type)


def get_search_index(cluster_name: Optional[str] = None,
                     index_id: Optional[str] = None,
                     project_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSearchIndexResult:
    """
    ## # Data Source: SearchIndex

    `SearchIndex` describes a single search indexes. This represents a single search index that have been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_search_index(index_id="<INDEX_ID",
        project_id="<PROJECT_ID>",
        cluster_name="<CLUSTER_NAME>")
    ```


    :param str cluster_name: The name of the cluster containing the collection with one or more Atlas Search indexes.
    :param str index_id: The unique identifier of the Atlas Search index. Use the `get_search_indexes`datasource to find the IDs of all Atlas Search indexes.
    :param str project_id: The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['indexId'] = index_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getSearchIndex:getSearchIndex', __args__, opts=opts, typ=GetSearchIndexResult).value

    return AwaitableGetSearchIndexResult(
        analyzer=pulumi.get(__ret__, 'analyzer'),
        analyzers=pulumi.get(__ret__, 'analyzers'),
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        collection_name=pulumi.get(__ret__, 'collection_name'),
        database=pulumi.get(__ret__, 'database'),
        fields=pulumi.get(__ret__, 'fields'),
        id=pulumi.get(__ret__, 'id'),
        index_id=pulumi.get(__ret__, 'index_id'),
        mappings_dynamic=pulumi.get(__ret__, 'mappings_dynamic'),
        mappings_fields=pulumi.get(__ret__, 'mappings_fields'),
        name=pulumi.get(__ret__, 'name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        search_analyzer=pulumi.get(__ret__, 'search_analyzer'),
        status=pulumi.get(__ret__, 'status'),
        stored_source=pulumi.get(__ret__, 'stored_source'),
        synonyms=pulumi.get(__ret__, 'synonyms'),
        type=pulumi.get(__ret__, 'type'))
def get_search_index_output(cluster_name: Optional[pulumi.Input[str]] = None,
                            index_id: Optional[pulumi.Input[str]] = None,
                            project_id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSearchIndexResult]:
    """
    ## # Data Source: SearchIndex

    `SearchIndex` describes a single search indexes. This represents a single search index that have been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_search_index(index_id="<INDEX_ID",
        project_id="<PROJECT_ID>",
        cluster_name="<CLUSTER_NAME>")
    ```


    :param str cluster_name: The name of the cluster containing the collection with one or more Atlas Search indexes.
    :param str index_id: The unique identifier of the Atlas Search index. Use the `get_search_indexes`datasource to find the IDs of all Atlas Search indexes.
    :param str project_id: The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['indexId'] = index_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getSearchIndex:getSearchIndex', __args__, opts=opts, typ=GetSearchIndexResult)
    return __ret__.apply(lambda __response__: GetSearchIndexResult(
        analyzer=pulumi.get(__response__, 'analyzer'),
        analyzers=pulumi.get(__response__, 'analyzers'),
        cluster_name=pulumi.get(__response__, 'cluster_name'),
        collection_name=pulumi.get(__response__, 'collection_name'),
        database=pulumi.get(__response__, 'database'),
        fields=pulumi.get(__response__, 'fields'),
        id=pulumi.get(__response__, 'id'),
        index_id=pulumi.get(__response__, 'index_id'),
        mappings_dynamic=pulumi.get(__response__, 'mappings_dynamic'),
        mappings_fields=pulumi.get(__response__, 'mappings_fields'),
        name=pulumi.get(__response__, 'name'),
        project_id=pulumi.get(__response__, 'project_id'),
        search_analyzer=pulumi.get(__response__, 'search_analyzer'),
        status=pulumi.get(__response__, 'status'),
        stored_source=pulumi.get(__response__, 'stored_source'),
        synonyms=pulumi.get(__response__, 'synonyms'),
        type=pulumi.get(__response__, 'type')))
