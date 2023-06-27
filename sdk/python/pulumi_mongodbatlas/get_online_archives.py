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
    'GetOnlineArchivesResult',
    'AwaitableGetOnlineArchivesResult',
    'get_online_archives',
    'get_online_archives_output',
]

@pulumi.output_type
class GetOnlineArchivesResult:
    """
    A collection of values returned by getOnlineArchives.
    """
    def __init__(__self__, cluster_name=None, id=None, project_id=None, results=None, total_count=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
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
    def results(self) -> Sequence['outputs.GetOnlineArchivesResultResult']:
        return pulumi.get(self, "results")

    @property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> int:
        return pulumi.get(self, "total_count")


class AwaitableGetOnlineArchivesResult(GetOnlineArchivesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOnlineArchivesResult(
            cluster_name=self.cluster_name,
            id=self.id,
            project_id=self.project_id,
            results=self.results,
            total_count=self.total_count)


def get_online_archives(cluster_name: Optional[str] = None,
                        project_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOnlineArchivesResult:
    """
    `OnlineArchive` Describes the list of all the online archives for a cluster

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_online_archives(project_id=var["project_id"],
        cluster_name=var["cluster_name"])
    ```
    ## Attributes reference

    Each object in the results array represents an online archive with the following attributes:

    * `archive_id`         - ID of the online archive.
    * `db_name`          -  Name of the database that contains the collection.
    * `coll_name`        -  Name of the collection.
    * `collection_type`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
    * `criteria`         -  Criteria to use for archiving data.
    * `criteria.type`          - Type of criteria (DATE, CUSTOM)
    * `criteria.date_field`    - Name of an already indexed date field from the documents. Data is archived when the current date is greater than the value of the date field specified here plus the number of days specified via the `expire_after_days` parameter.
    * `criteria.date_format`   - the date format. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS
    * `criteria.expire_after_days` - Number of days that specifies the age limit for the data in the live Atlas cluster.
    * `criteria.query` - JSON query to use to select documents for archiving. Only for `CUSTOM` type
    * `partition_fields` -  Fields to use to partition data.
    * `partition_fields.field_name` - Name of the field. To specify a nested field, use the dot notation.
    * `partition_fields.order` - Position of the field in the partition. Value can be: 0,1,2
      By default, the date field specified in the criteria.dateField parameter is in the first position of the partition.
    * `partitio_fields.field_type` - Type of the partition field
    * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted

    See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-all-for-cluster/) Documentation for more information.


    :param str cluster_name: Name of the cluster that contains the collection.
           
           # Attributes Reference
           
           In addition to all arguments above, the following attributes are exported:
    :param str project_id: The unique ID for the project.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getOnlineArchives:getOnlineArchives', __args__, opts=opts, typ=GetOnlineArchivesResult).value

    return AwaitableGetOnlineArchivesResult(
        cluster_name=__ret__.cluster_name,
        id=__ret__.id,
        project_id=__ret__.project_id,
        results=__ret__.results,
        total_count=__ret__.total_count)


@_utilities.lift_output_func(get_online_archives)
def get_online_archives_output(cluster_name: Optional[pulumi.Input[str]] = None,
                               project_id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOnlineArchivesResult]:
    """
    `OnlineArchive` Describes the list of all the online archives for a cluster

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_online_archives(project_id=var["project_id"],
        cluster_name=var["cluster_name"])
    ```
    ## Attributes reference

    Each object in the results array represents an online archive with the following attributes:

    * `archive_id`         - ID of the online archive.
    * `db_name`          -  Name of the database that contains the collection.
    * `coll_name`        -  Name of the collection.
    * `collection_type`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
    * `criteria`         -  Criteria to use for archiving data.
    * `criteria.type`          - Type of criteria (DATE, CUSTOM)
    * `criteria.date_field`    - Name of an already indexed date field from the documents. Data is archived when the current date is greater than the value of the date field specified here plus the number of days specified via the `expire_after_days` parameter.
    * `criteria.date_format`   - the date format. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS
    * `criteria.expire_after_days` - Number of days that specifies the age limit for the data in the live Atlas cluster.
    * `criteria.query` - JSON query to use to select documents for archiving. Only for `CUSTOM` type
    * `partition_fields` -  Fields to use to partition data.
    * `partition_fields.field_name` - Name of the field. To specify a nested field, use the dot notation.
    * `partition_fields.order` - Position of the field in the partition. Value can be: 0,1,2
      By default, the date field specified in the criteria.dateField parameter is in the first position of the partition.
    * `partitio_fields.field_type` - Type of the partition field
    * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted

    See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-all-for-cluster/) Documentation for more information.


    :param str cluster_name: Name of the cluster that contains the collection.
           
           # Attributes Reference
           
           In addition to all arguments above, the following attributes are exported:
    :param str project_id: The unique ID for the project.
    """
    ...
