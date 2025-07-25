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

__all__ = [
    'GetSharedTierRestoreJobResult',
    'AwaitableGetSharedTierRestoreJobResult',
    'get_shared_tier_restore_job',
    'get_shared_tier_restore_job_output',
]

@pulumi.output_type
class GetSharedTierRestoreJobResult:
    """
    A collection of values returned by getSharedTierRestoreJob.
    """
    def __init__(__self__, cluster_name=None, delivery_type=None, expiration_date=None, id=None, job_id=None, project_id=None, restore_finished_date=None, restore_scheduled_date=None, snapshot_finished_date=None, snapshot_id=None, snapshot_url=None, status=None, target_deployment_item_name=None, target_project_id=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if delivery_type and not isinstance(delivery_type, str):
            raise TypeError("Expected argument 'delivery_type' to be a str")
        pulumi.set(__self__, "delivery_type", delivery_type)
        if expiration_date and not isinstance(expiration_date, str):
            raise TypeError("Expected argument 'expiration_date' to be a str")
        pulumi.set(__self__, "expiration_date", expiration_date)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if job_id and not isinstance(job_id, str):
            raise TypeError("Expected argument 'job_id' to be a str")
        pulumi.set(__self__, "job_id", job_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if restore_finished_date and not isinstance(restore_finished_date, str):
            raise TypeError("Expected argument 'restore_finished_date' to be a str")
        pulumi.set(__self__, "restore_finished_date", restore_finished_date)
        if restore_scheduled_date and not isinstance(restore_scheduled_date, str):
            raise TypeError("Expected argument 'restore_scheduled_date' to be a str")
        pulumi.set(__self__, "restore_scheduled_date", restore_scheduled_date)
        if snapshot_finished_date and not isinstance(snapshot_finished_date, str):
            raise TypeError("Expected argument 'snapshot_finished_date' to be a str")
        pulumi.set(__self__, "snapshot_finished_date", snapshot_finished_date)
        if snapshot_id and not isinstance(snapshot_id, str):
            raise TypeError("Expected argument 'snapshot_id' to be a str")
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        if snapshot_url and not isinstance(snapshot_url, str):
            raise TypeError("Expected argument 'snapshot_url' to be a str")
        pulumi.set(__self__, "snapshot_url", snapshot_url)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if target_deployment_item_name and not isinstance(target_deployment_item_name, str):
            raise TypeError("Expected argument 'target_deployment_item_name' to be a str")
        pulumi.set(__self__, "target_deployment_item_name", target_deployment_item_name)
        if target_project_id and not isinstance(target_project_id, str):
            raise TypeError("Expected argument 'target_project_id' to be a str")
        pulumi.set(__self__, "target_project_id", target_project_id)

    @_builtins.property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> _builtins.str:
        return pulumi.get(self, "cluster_name")

    @_builtins.property
    @pulumi.getter(name="deliveryType")
    def delivery_type(self) -> _builtins.str:
        return pulumi.get(self, "delivery_type")

    @_builtins.property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> _builtins.str:
        return pulumi.get(self, "expiration_date")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="jobId")
    def job_id(self) -> _builtins.str:
        return pulumi.get(self, "job_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter(name="restoreFinishedDate")
    def restore_finished_date(self) -> _builtins.str:
        return pulumi.get(self, "restore_finished_date")

    @_builtins.property
    @pulumi.getter(name="restoreScheduledDate")
    def restore_scheduled_date(self) -> _builtins.str:
        return pulumi.get(self, "restore_scheduled_date")

    @_builtins.property
    @pulumi.getter(name="snapshotFinishedDate")
    def snapshot_finished_date(self) -> _builtins.str:
        return pulumi.get(self, "snapshot_finished_date")

    @_builtins.property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> _builtins.str:
        return pulumi.get(self, "snapshot_id")

    @_builtins.property
    @pulumi.getter(name="snapshotUrl")
    def snapshot_url(self) -> _builtins.str:
        return pulumi.get(self, "snapshot_url")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="targetDeploymentItemName")
    def target_deployment_item_name(self) -> _builtins.str:
        return pulumi.get(self, "target_deployment_item_name")

    @_builtins.property
    @pulumi.getter(name="targetProjectId")
    def target_project_id(self) -> _builtins.str:
        return pulumi.get(self, "target_project_id")


class AwaitableGetSharedTierRestoreJobResult(GetSharedTierRestoreJobResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSharedTierRestoreJobResult(
            cluster_name=self.cluster_name,
            delivery_type=self.delivery_type,
            expiration_date=self.expiration_date,
            id=self.id,
            job_id=self.job_id,
            project_id=self.project_id,
            restore_finished_date=self.restore_finished_date,
            restore_scheduled_date=self.restore_scheduled_date,
            snapshot_finished_date=self.snapshot_finished_date,
            snapshot_id=self.snapshot_id,
            snapshot_url=self.snapshot_url,
            status=self.status,
            target_deployment_item_name=self.target_deployment_item_name,
            target_project_id=self.target_project_id)


def get_shared_tier_restore_job(cluster_name: Optional[_builtins.str] = None,
                                job_id: Optional[_builtins.str] = None,
                                project_id: Optional[_builtins.str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSharedTierRestoreJobResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['jobId'] = job_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getSharedTierRestoreJob:getSharedTierRestoreJob', __args__, opts=opts, typ=GetSharedTierRestoreJobResult).value

    return AwaitableGetSharedTierRestoreJobResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        delivery_type=pulumi.get(__ret__, 'delivery_type'),
        expiration_date=pulumi.get(__ret__, 'expiration_date'),
        id=pulumi.get(__ret__, 'id'),
        job_id=pulumi.get(__ret__, 'job_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        restore_finished_date=pulumi.get(__ret__, 'restore_finished_date'),
        restore_scheduled_date=pulumi.get(__ret__, 'restore_scheduled_date'),
        snapshot_finished_date=pulumi.get(__ret__, 'snapshot_finished_date'),
        snapshot_id=pulumi.get(__ret__, 'snapshot_id'),
        snapshot_url=pulumi.get(__ret__, 'snapshot_url'),
        status=pulumi.get(__ret__, 'status'),
        target_deployment_item_name=pulumi.get(__ret__, 'target_deployment_item_name'),
        target_project_id=pulumi.get(__ret__, 'target_project_id'))
def get_shared_tier_restore_job_output(cluster_name: Optional[pulumi.Input[_builtins.str]] = None,
                                       job_id: Optional[pulumi.Input[_builtins.str]] = None,
                                       project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSharedTierRestoreJobResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['jobId'] = job_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getSharedTierRestoreJob:getSharedTierRestoreJob', __args__, opts=opts, typ=GetSharedTierRestoreJobResult)
    return __ret__.apply(lambda __response__: GetSharedTierRestoreJobResult(
        cluster_name=pulumi.get(__response__, 'cluster_name'),
        delivery_type=pulumi.get(__response__, 'delivery_type'),
        expiration_date=pulumi.get(__response__, 'expiration_date'),
        id=pulumi.get(__response__, 'id'),
        job_id=pulumi.get(__response__, 'job_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        restore_finished_date=pulumi.get(__response__, 'restore_finished_date'),
        restore_scheduled_date=pulumi.get(__response__, 'restore_scheduled_date'),
        snapshot_finished_date=pulumi.get(__response__, 'snapshot_finished_date'),
        snapshot_id=pulumi.get(__response__, 'snapshot_id'),
        snapshot_url=pulumi.get(__response__, 'snapshot_url'),
        status=pulumi.get(__response__, 'status'),
        target_deployment_item_name=pulumi.get(__response__, 'target_deployment_item_name'),
        target_project_id=pulumi.get(__response__, 'target_project_id')))
