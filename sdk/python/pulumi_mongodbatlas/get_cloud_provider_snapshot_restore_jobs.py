# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetCloudProviderSnapshotRestoreJobsResult',
    'AwaitableGetCloudProviderSnapshotRestoreJobsResult',
    'get_cloud_provider_snapshot_restore_jobs',
]

@pulumi.output_type
class GetCloudProviderSnapshotRestoreJobsResult:
    """
    A collection of values returned by getCloudProviderSnapshotRestoreJobs.
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
    @pulumi.getter(name="itemsPerPage")
    def items_per_page(self) -> Optional[int]:
        return pulumi.get(self, "items_per_page")

    @property
    @pulumi.getter(name="pageNum")
    def page_num(self) -> Optional[int]:
        return pulumi.get(self, "page_num")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetCloudProviderSnapshotRestoreJobsResultResult']:
        """
        Includes cloudProviderSnapshotRestoreJob object for each item detailed in the results array section.
        """
        return pulumi.get(self, "results")

    @property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> int:
        return pulumi.get(self, "total_count")


class AwaitableGetCloudProviderSnapshotRestoreJobsResult(GetCloudProviderSnapshotRestoreJobsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudProviderSnapshotRestoreJobsResult(
            cluster_name=self.cluster_name,
            id=self.id,
            items_per_page=self.items_per_page,
            page_num=self.page_num,
            project_id=self.project_id,
            results=self.results,
            total_count=self.total_count)


def get_cloud_provider_snapshot_restore_jobs(cluster_name: Optional[str] = None,
                                             items_per_page: Optional[int] = None,
                                             page_num: Optional[int] = None,
                                             project_id: Optional[str] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudProviderSnapshotRestoreJobsResult:
    """
    `getCloudProviderSnapshotRestoreJobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    First create a snapshot of the desired cluster. Then request that snapshot be restored in an automated fashion to the designated cluster and project.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_cloud_provider_snapshot = mongodbatlas.CloudProviderSnapshot("testCloudProviderSnapshot",
        project_id="5cf5a45a9ccf6400e60981b6",
        cluster_name="MyCluster",
        description="MyDescription",
        retention_in_days=1)
    test_cloud_provider_snapshot_restore_job = mongodbatlas.CloudProviderSnapshotRestoreJob("testCloudProviderSnapshotRestoreJob",
        project_id="5cf5a45a9ccf6400e60981b6",
        cluster_name="MyCluster",
        snapshot_id=test_cloud_provider_snapshot.id,
        delivery_type=mongodbatlas.CloudProviderSnapshotRestoreJobDeliveryTypeArgs(
            automated=True,
            target_cluster_name="MyCluster",
            target_project_id="5cf5a45a9ccf6400e60981b6",
        ))
    test_cloud_provider_snapshot_restore_jobs = pulumi.Output.all(test_cloud_provider_snapshot_restore_job.project_id, test_cloud_provider_snapshot_restore_job.cluster_name).apply(lambda project_id, cluster_name: mongodbatlas.get_cloud_provider_snapshot_restore_jobs(project_id=project_id,
        cluster_name=cluster_name,
        page_num=1,
        items_per_page=5))
    ```


    :param str cluster_name: The name of the Atlas cluster for which you want to retrieve restore jobs.
    :param int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param int page_num: The page to return. Defaults to `1`.
    :param str project_id: The unique identifier of the project for the Atlas cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['itemsPerPage'] = items_per_page
    __args__['pageNum'] = page_num
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudProviderSnapshotRestoreJobs:getCloudProviderSnapshotRestoreJobs', __args__, opts=opts, typ=GetCloudProviderSnapshotRestoreJobsResult).value

    return AwaitableGetCloudProviderSnapshotRestoreJobsResult(
        cluster_name=__ret__.cluster_name,
        id=__ret__.id,
        items_per_page=__ret__.items_per_page,
        page_num=__ret__.page_num,
        project_id=__ret__.project_id,
        results=__ret__.results,
        total_count=__ret__.total_count)
