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

    * `db_name` - Name of the database that contains the collection.
    * `coll_name` -  Name of the collection.
    * `collection_type` - Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
    * `criteria` - Criteria to use for archiving data. See criteria.
    * `data_expiration_rule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
    * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
    * `partition_fields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
    * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
    * `state` - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted

    ### Criteria
    * `type` - Type of criteria (DATE, CUSTOM)
    * `date_field` - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
    * `date_format` - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
    * `expire_after_days` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
    * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.

    ### Data Expiration Rule
    * `expire_after_days` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.

    ### Schedule

    * `type` - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
    * `start_hour` - Hour of the day when the when the scheduled window to run one online archive starts.
    * `end_hour` - Hour of the day when the scheduled window to run one online archive ends.
    * `start_minute` - Minute of the hour when the scheduled window to run one online archive starts.
    * `end_minute` - Minute of the hour when the scheduled window to run one online archive ends.
    * `day_of_month` - Day of the month when the scheduled archive starts.
    * `day_of_week` - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).

    ### Partition
    * `field_name` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
    * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
    * `field_type` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.


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
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'),
        total_count=pulumi.get(__ret__, 'total_count'))


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

    * `db_name` - Name of the database that contains the collection.
    * `coll_name` -  Name of the collection.
    * `collection_type` - Type of MongoDB collection that you want to return. This value can be "TIMESERIES" or "STANDARD". Default is "STANDARD".
    * `criteria` - Criteria to use for archiving data. See criteria.
    * `data_expiration_rule` - Rule for specifying when data should be deleted from the archive. See data expiration rule.
    * `schedule` - Regular frequency and duration when archiving process occurs. See schedule.
    * `partition_fields` - Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
    * `paused` - State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
    * `state` - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted

    ### Criteria
    * `type` - Type of criteria (DATE, CUSTOM)
    * `date_field` - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
    * `date_format` - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
    * `expire_after_days` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
    * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.

    ### Data Expiration Rule
    * `expire_after_days` - Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.

    ### Schedule

    * `type` - Type of schedule (`DAILY`, `MONTHLY`, `WEEKLY`).
    * `start_hour` - Hour of the day when the when the scheduled window to run one online archive starts.
    * `end_hour` - Hour of the day when the scheduled window to run one online archive ends.
    * `start_minute` - Minute of the hour when the scheduled window to run one online archive starts.
    * `end_minute` - Minute of the hour when the scheduled window to run one online archive ends.
    * `day_of_month` - Day of the month when the scheduled archive starts.
    * `day_of_week` - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).

    ### Partition
    * `field_name` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
    * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
    * `field_type` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.


    :param str cluster_name: Name of the cluster that contains the collection.
           
           # Attributes Reference
           
           In addition to all arguments above, the following attributes are exported:
    :param str project_id: The unique ID for the project.
    """
    ...
