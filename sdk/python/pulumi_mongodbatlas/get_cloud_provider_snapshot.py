# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCloudProviderSnapshotResult',
    'AwaitableGetCloudProviderSnapshotResult',
    'get_cloud_provider_snapshot',
    'get_cloud_provider_snapshot_output',
]

@pulumi.output_type
class GetCloudProviderSnapshotResult:
    """
    A collection of values returned by getCloudProviderSnapshot.
    """
    def __init__(__self__, cluster_name=None, created_at=None, description=None, expires_at=None, id=None, master_key_uuid=None, mongod_version=None, project_id=None, snapshot_id=None, snapshot_type=None, status=None, storage_size_bytes=None, type=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if expires_at and not isinstance(expires_at, str):
            raise TypeError("Expected argument 'expires_at' to be a str")
        pulumi.set(__self__, "expires_at", expires_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if master_key_uuid and not isinstance(master_key_uuid, str):
            raise TypeError("Expected argument 'master_key_uuid' to be a str")
        pulumi.set(__self__, "master_key_uuid", master_key_uuid)
        if mongod_version and not isinstance(mongod_version, str):
            raise TypeError("Expected argument 'mongod_version' to be a str")
        pulumi.set(__self__, "mongod_version", mongod_version)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if snapshot_id and not isinstance(snapshot_id, str):
            raise TypeError("Expected argument 'snapshot_id' to be a str")
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        if snapshot_type and not isinstance(snapshot_type, str):
            raise TypeError("Expected argument 'snapshot_type' to be a str")
        pulumi.set(__self__, "snapshot_type", snapshot_type)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if storage_size_bytes and not isinstance(storage_size_bytes, int):
            raise TypeError("Expected argument 'storage_size_bytes' to be a int")
        pulumi.set(__self__, "storage_size_bytes", storage_size_bytes)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        UDescription of the snapshot. Only present for on-demand snapshots.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> str:
        """
        UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="masterKeyUuid")
    def master_key_uuid(self) -> str:
        """
        Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        """
        return pulumi.get(self, "master_key_uuid")

    @property
    @pulumi.getter(name="mongodVersion")
    def mongod_version(self) -> str:
        """
        Version of the MongoDB server.
        """
        return pulumi.get(self, "mongod_version")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> str:
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter(name="snapshotType")
    def snapshot_type(self) -> str:
        """
        Specified the type of snapshot. Valid values are onDemand and scheduled.
        """
        return pulumi.get(self, "snapshot_type")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Current status of the snapshot. One of the following values: queued, inProgress, completed, failed.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="storageSizeBytes")
    def storage_size_bytes(self) -> int:
        """
        Specifies the size of the snapshot in bytes.
        """
        return pulumi.get(self, "storage_size_bytes")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Specifies the type of cluster: replicaSet or shardedCluster.
        """
        return pulumi.get(self, "type")


class AwaitableGetCloudProviderSnapshotResult(GetCloudProviderSnapshotResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudProviderSnapshotResult(
            cluster_name=self.cluster_name,
            created_at=self.created_at,
            description=self.description,
            expires_at=self.expires_at,
            id=self.id,
            master_key_uuid=self.master_key_uuid,
            mongod_version=self.mongod_version,
            project_id=self.project_id,
            snapshot_id=self.snapshot_id,
            snapshot_type=self.snapshot_type,
            status=self.status,
            storage_size_bytes=self.storage_size_bytes,
            type=self.type)


def get_cloud_provider_snapshot(cluster_name: Optional[str] = None,
                                project_id: Optional[str] = None,
                                snapshot_id: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudProviderSnapshotResult:
    """
    **WARNING:** This datasource is deprecated, use `CloudBackupSnapshot`

    `CloudProviderSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str cluster_name: The name of the Atlas cluster that contains the snapshot you want to retrieve.
    :param str snapshot_id: The unique identifier of the snapshot you want to retrieve.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    __args__['snapshotId'] = snapshot_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudProviderSnapshot:getCloudProviderSnapshot', __args__, opts=opts, typ=GetCloudProviderSnapshotResult).value

    return AwaitableGetCloudProviderSnapshotResult(
        cluster_name=__ret__.cluster_name,
        created_at=__ret__.created_at,
        description=__ret__.description,
        expires_at=__ret__.expires_at,
        id=__ret__.id,
        master_key_uuid=__ret__.master_key_uuid,
        mongod_version=__ret__.mongod_version,
        project_id=__ret__.project_id,
        snapshot_id=__ret__.snapshot_id,
        snapshot_type=__ret__.snapshot_type,
        status=__ret__.status,
        storage_size_bytes=__ret__.storage_size_bytes,
        type=__ret__.type)


@_utilities.lift_output_func(get_cloud_provider_snapshot)
def get_cloud_provider_snapshot_output(cluster_name: Optional[pulumi.Input[str]] = None,
                                       project_id: Optional[pulumi.Input[str]] = None,
                                       snapshot_id: Optional[pulumi.Input[str]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCloudProviderSnapshotResult]:
    """
    **WARNING:** This datasource is deprecated, use `CloudBackupSnapshot`

    `CloudProviderSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str cluster_name: The name of the Atlas cluster that contains the snapshot you want to retrieve.
    :param str snapshot_id: The unique identifier of the snapshot you want to retrieve.
    """
    ...
