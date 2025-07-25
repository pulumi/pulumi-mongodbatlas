# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetCloudBackupSnapshotRestoreJobsResult',
    'AwaitableGetCloudBackupSnapshotRestoreJobsResult',
    'get_cloud_backup_snapshot_restore_jobs',
    'get_cloud_backup_snapshot_restore_jobs_output',
]

@pulumi.output_type
class GetCloudBackupSnapshotRestoreJobsResult:
    """
    A collection of values returned by getCloudBackupSnapshotRestoreJobs.
    """
    def __init__(__self__, cluster_name=None, id=None, items_per_page=None, page_num=None, project_id=None, results=None, total_count=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items_per_page and not isinstance(items_per_page, int):
            raise TypeError("Expected argument 'items_per_page' to be a int")
        pulumi.set(__self__, "items_per_page", items_per_page)
        if page_num and not isinstance(page_num, int):
            raise TypeError("Expected argument 'page_num' to be a int")
        pulumi.set(__self__, "page_num", page_num)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)
        if total_count and not isinstance(total_count, int):
            raise TypeError("Expected argument 'total_count' to be a int")
        pulumi.set(__self__, "total_count", total_count)

    @_builtins.property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> _builtins.str:
        return pulumi.get(self, "cluster_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="itemsPerPage")
    def items_per_page(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "items_per_page")

    @_builtins.property
    @pulumi.getter(name="pageNum")
    def page_num(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "page_num")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetCloudBackupSnapshotRestoreJobsResultResult']:
        """
        Includes cloudProviderSnapshotRestoreJob object for each item detailed in the results array section.
        * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
        """
        return pulumi.get(self, "results")

    @_builtins.property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> _builtins.int:
        return pulumi.get(self, "total_count")


class AwaitableGetCloudBackupSnapshotRestoreJobsResult(GetCloudBackupSnapshotRestoreJobsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudBackupSnapshotRestoreJobsResult(
            cluster_name=self.cluster_name,
            id=self.id,
            items_per_page=self.items_per_page,
            page_num=self.page_num,
            project_id=self.project_id,
            results=self.results,
            total_count=self.total_count)


def get_cloud_backup_snapshot_restore_jobs(cluster_name: Optional[_builtins.str] = None,
                                           items_per_page: Optional[_builtins.int] = None,
                                           page_num: Optional[_builtins.int] = None,
                                           project_id: Optional[_builtins.str] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudBackupSnapshotRestoreJobsResult:
    """
    ## # Data Source: get_cloud_backup_snapshot_restore_jobs

    `get_cloud_backup_snapshot_restore_jobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    First create a snapshot of the desired cluster. Then request that snapshot be restored in an automated fashion to the designated cluster and project.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_cloud_backup_snapshot = mongodbatlas.CloudBackupSnapshot("test",
        project_id="5cf5a45a9ccf6400e60981b6",
        cluster_name="MyCluster",
        description="MyDescription",
        retention_in_days=1)
    test_cloud_backup_snapshot_restore_job = mongodbatlas.CloudBackupSnapshotRestoreJob("test",
        project_id="5cf5a45a9ccf6400e60981b6",
        cluster_name="MyCluster",
        snapshot_id=test_cloud_backup_snapshot.id,
        delivery_type_config={
            "automated": True,
            "target_cluster_name": "MyCluster",
            "target_project_id": "5cf5a45a9ccf6400e60981b6",
        })
    test = pulumi.Output.all(
        project_id=test_cloud_backup_snapshot_restore_job.project_id,
        cluster_name=test_cloud_backup_snapshot_restore_job.cluster_name
    ).apply(lambda resolved_outputs: mongodbatlas.get_cloud_backup_snapshot_restore_jobs_output(project_id=resolved_outputs['project_id'],
        cluster_name=resolved_outputs['cluster_name'],
        page_num=1,
        items_per_page=5))
    ```


    :param _builtins.str cluster_name: The name of the Atlas cluster for which you want to retrieve restore jobs.
    :param _builtins.int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param _builtins.int page_num: The page to return. Defaults to `1`.
    :param _builtins.str project_id: The unique identifier of the project for the Atlas cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['itemsPerPage'] = items_per_page
    __args__['pageNum'] = page_num
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudBackupSnapshotRestoreJobs:getCloudBackupSnapshotRestoreJobs', __args__, opts=opts, typ=GetCloudBackupSnapshotRestoreJobsResult).value

    return AwaitableGetCloudBackupSnapshotRestoreJobsResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        id=pulumi.get(__ret__, 'id'),
        items_per_page=pulumi.get(__ret__, 'items_per_page'),
        page_num=pulumi.get(__ret__, 'page_num'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'),
        total_count=pulumi.get(__ret__, 'total_count'))
def get_cloud_backup_snapshot_restore_jobs_output(cluster_name: Optional[pulumi.Input[_builtins.str]] = None,
                                                  items_per_page: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                                  page_num: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                                  project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCloudBackupSnapshotRestoreJobsResult]:
    """
    ## # Data Source: get_cloud_backup_snapshot_restore_jobs

    `get_cloud_backup_snapshot_restore_jobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    First create a snapshot of the desired cluster. Then request that snapshot be restored in an automated fashion to the designated cluster and project.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_cloud_backup_snapshot = mongodbatlas.CloudBackupSnapshot("test",
        project_id="5cf5a45a9ccf6400e60981b6",
        cluster_name="MyCluster",
        description="MyDescription",
        retention_in_days=1)
    test_cloud_backup_snapshot_restore_job = mongodbatlas.CloudBackupSnapshotRestoreJob("test",
        project_id="5cf5a45a9ccf6400e60981b6",
        cluster_name="MyCluster",
        snapshot_id=test_cloud_backup_snapshot.id,
        delivery_type_config={
            "automated": True,
            "target_cluster_name": "MyCluster",
            "target_project_id": "5cf5a45a9ccf6400e60981b6",
        })
    test = pulumi.Output.all(
        project_id=test_cloud_backup_snapshot_restore_job.project_id,
        cluster_name=test_cloud_backup_snapshot_restore_job.cluster_name
    ).apply(lambda resolved_outputs: mongodbatlas.get_cloud_backup_snapshot_restore_jobs_output(project_id=resolved_outputs['project_id'],
        cluster_name=resolved_outputs['cluster_name'],
        page_num=1,
        items_per_page=5))
    ```


    :param _builtins.str cluster_name: The name of the Atlas cluster for which you want to retrieve restore jobs.
    :param _builtins.int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param _builtins.int page_num: The page to return. Defaults to `1`.
    :param _builtins.str project_id: The unique identifier of the project for the Atlas cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['itemsPerPage'] = items_per_page
    __args__['pageNum'] = page_num
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getCloudBackupSnapshotRestoreJobs:getCloudBackupSnapshotRestoreJobs', __args__, opts=opts, typ=GetCloudBackupSnapshotRestoreJobsResult)
    return __ret__.apply(lambda __response__: GetCloudBackupSnapshotRestoreJobsResult(
        cluster_name=pulumi.get(__response__, 'cluster_name'),
        id=pulumi.get(__response__, 'id'),
        items_per_page=pulumi.get(__response__, 'items_per_page'),
        page_num=pulumi.get(__response__, 'page_num'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results'),
        total_count=pulumi.get(__response__, 'total_count')))
