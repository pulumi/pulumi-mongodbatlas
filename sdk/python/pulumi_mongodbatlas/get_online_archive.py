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
    'GetOnlineArchiveResult',
    'AwaitableGetOnlineArchiveResult',
    'get_online_archive',
    'get_online_archive_output',
]

@pulumi.output_type
class GetOnlineArchiveResult:
    """
    A collection of values returned by getOnlineArchive.
    """
    def __init__(__self__, archive_id=None, cluster_name=None, coll_name=None, collection_type=None, criterias=None, db_name=None, id=None, partition_fields=None, paused=None, project_id=None, schedules=None, state=None):
        if archive_id and not isinstance(archive_id, str):
            raise TypeError("Expected argument 'archive_id' to be a str")
        pulumi.set(__self__, "archive_id", archive_id)
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if coll_name and not isinstance(coll_name, str):
            raise TypeError("Expected argument 'coll_name' to be a str")
        pulumi.set(__self__, "coll_name", coll_name)
        if collection_type and not isinstance(collection_type, str):
            raise TypeError("Expected argument 'collection_type' to be a str")
        pulumi.set(__self__, "collection_type", collection_type)
        if criterias and not isinstance(criterias, list):
            raise TypeError("Expected argument 'criterias' to be a list")
        pulumi.set(__self__, "criterias", criterias)
        if db_name and not isinstance(db_name, str):
            raise TypeError("Expected argument 'db_name' to be a str")
        pulumi.set(__self__, "db_name", db_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if partition_fields and not isinstance(partition_fields, list):
            raise TypeError("Expected argument 'partition_fields' to be a list")
        pulumi.set(__self__, "partition_fields", partition_fields)
        if paused and not isinstance(paused, bool):
            raise TypeError("Expected argument 'paused' to be a bool")
        pulumi.set(__self__, "paused", paused)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if schedules and not isinstance(schedules, list):
            raise TypeError("Expected argument 'schedules' to be a list")
        pulumi.set(__self__, "schedules", schedules)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="archiveId")
    def archive_id(self) -> str:
        return pulumi.get(self, "archive_id")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="collName")
    def coll_name(self) -> str:
        return pulumi.get(self, "coll_name")

    @property
    @pulumi.getter(name="collectionType")
    def collection_type(self) -> str:
        return pulumi.get(self, "collection_type")

    @property
    @pulumi.getter
    def criterias(self) -> Sequence['outputs.GetOnlineArchiveCriteriaResult']:
        return pulumi.get(self, "criterias")

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> str:
        return pulumi.get(self, "db_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="partitionFields")
    def partition_fields(self) -> Sequence['outputs.GetOnlineArchivePartitionFieldResult']:
        return pulumi.get(self, "partition_fields")

    @property
    @pulumi.getter
    def paused(self) -> bool:
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def schedules(self) -> Sequence['outputs.GetOnlineArchiveScheduleResult']:
        return pulumi.get(self, "schedules")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")


class AwaitableGetOnlineArchiveResult(GetOnlineArchiveResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOnlineArchiveResult(
            archive_id=self.archive_id,
            cluster_name=self.cluster_name,
            coll_name=self.coll_name,
            collection_type=self.collection_type,
            criterias=self.criterias,
            db_name=self.db_name,
            id=self.id,
            partition_fields=self.partition_fields,
            paused=self.paused,
            project_id=self.project_id,
            schedules=self.schedules,
            state=self.state)


def get_online_archive(archive_id: Optional[str] = None,
                       cluster_name: Optional[str] = None,
                       project_id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOnlineArchiveResult:
    """
    `OnlineArchive` describes an Online Archive

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_online_archive(project_id=var["project_id"],
        cluster_name=var["cluster_name"],
        archive_id="5ebad3c1fe9c0ab8d37d61e1")
    ```
    ## Attributes reference

    * `db_name`          -  Name of the database that contains the collection.
    * `coll_name`        -  Name of the collection.
    * `collection_type`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
    * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted

    ### Criteria
    * `type`          - Type of criteria (DATE, CUSTOM)
    * `date_field`   - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
    * `date_format`   - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
    * `expire_after_days` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
    * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.

    ### Schedule

    * `type`          - Type of schedule. Valid values: `DEFAULT`, `DAILY`, `MONTHLY`, `WEEKLY`.
    * `start_hour`    - Hour of the day when the when the scheduled window to run one online archive starts.
    * `end_hour`      - Hour of the day when the scheduled window to run one online archive ends.
    * `start_minute`   - Minute of the hour when the scheduled window to run one online archive starts.
    * `end_minute`     - Minute of the hour when the scheduled window to run one online archive ends.
    * `day_of_month`   - Day of the month when the scheduled archive starts. Set this parameter when `type` is `MONTHLY`.
    * `day_of_week`     - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).Set this parameter when `type` is `WEEKLY`.

    ### Partition
    * `field_name` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
    * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
    * `field_type` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.

    See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-one/) Documentation for more information.


    :param str archive_id: ID of the online archive.
    :param str cluster_name: Name of the cluster that contains the collection.
    :param str project_id: The unique ID for the project.
    """
    __args__ = dict()
    __args__['archiveId'] = archive_id
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getOnlineArchive:getOnlineArchive', __args__, opts=opts, typ=GetOnlineArchiveResult).value

    return AwaitableGetOnlineArchiveResult(
        archive_id=pulumi.get(__ret__, 'archive_id'),
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        coll_name=pulumi.get(__ret__, 'coll_name'),
        collection_type=pulumi.get(__ret__, 'collection_type'),
        criterias=pulumi.get(__ret__, 'criterias'),
        db_name=pulumi.get(__ret__, 'db_name'),
        id=pulumi.get(__ret__, 'id'),
        partition_fields=pulumi.get(__ret__, 'partition_fields'),
        paused=pulumi.get(__ret__, 'paused'),
        project_id=pulumi.get(__ret__, 'project_id'),
        schedules=pulumi.get(__ret__, 'schedules'),
        state=pulumi.get(__ret__, 'state'))


@_utilities.lift_output_func(get_online_archive)
def get_online_archive_output(archive_id: Optional[pulumi.Input[str]] = None,
                              cluster_name: Optional[pulumi.Input[str]] = None,
                              project_id: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOnlineArchiveResult]:
    """
    `OnlineArchive` describes an Online Archive

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_online_archive(project_id=var["project_id"],
        cluster_name=var["cluster_name"],
        archive_id="5ebad3c1fe9c0ab8d37d61e1")
    ```
    ## Attributes reference

    * `db_name`          -  Name of the database that contains the collection.
    * `coll_name`        -  Name of the collection.
    * `collection_type`  -  Classification of MongoDB database collection that you want to return, "TIMESERIES" or "STANDARD". Default is "STANDARD".
    * `state`    - Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted

    ### Criteria
    * `type`          - Type of criteria (DATE, CUSTOM)
    * `date_field`   - Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter. Set this parameter when `type` is `DATE`.
    * `date_format`   - Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. Set this parameter when `type` is `DATE`. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
    * `expire_after_days` - Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster. Set this parameter when `type` is `DATE`.
    * `query` - JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported. Set this parameter when `type` is `CUSTOM`.

    ### Schedule

    * `type`          - Type of schedule. Valid values: `DEFAULT`, `DAILY`, `MONTHLY`, `WEEKLY`.
    * `start_hour`    - Hour of the day when the when the scheduled window to run one online archive starts.
    * `end_hour`      - Hour of the day when the scheduled window to run one online archive ends.
    * `start_minute`   - Minute of the hour when the scheduled window to run one online archive starts.
    * `end_minute`     - Minute of the hour when the scheduled window to run one online archive ends.
    * `day_of_month`   - Day of the month when the scheduled archive starts. Set this parameter when `type` is `MONTHLY`.
    * `day_of_week`     - Day of the week when the scheduled archive starts. The week starts with Monday (1) and ends with Sunday (7).Set this parameter when `type` is `WEEKLY`.

    ### Partition
    * `field_name` - Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
    * `order` - Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
    * `field_type` - Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.

    See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/online-archive-get-one/) Documentation for more information.


    :param str archive_id: ID of the online archive.
    :param str cluster_name: Name of the cluster that contains the collection.
    :param str project_id: The unique ID for the project.
    """
    ...
