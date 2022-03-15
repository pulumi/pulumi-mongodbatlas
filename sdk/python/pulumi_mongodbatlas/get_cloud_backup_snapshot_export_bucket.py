# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCloudBackupSnapshotExportBucketResult',
    'AwaitableGetCloudBackupSnapshotExportBucketResult',
    'get_cloud_backup_snapshot_export_bucket',
    'get_cloud_backup_snapshot_export_bucket_output',
]

@pulumi.output_type
class GetCloudBackupSnapshotExportBucketResult:
    """
    A collection of values returned by getCloudBackupSnapshotExportBucket.
    """
    def __init__(__self__, bucket_name=None, cloud_provider=None, export_bucket_id=None, iam_role_id=None, id=None, project_id=None):
        if bucket_name and not isinstance(bucket_name, str):
            raise TypeError("Expected argument 'bucket_name' to be a str")
        pulumi.set(__self__, "bucket_name", bucket_name)
        if cloud_provider and not isinstance(cloud_provider, str):
            raise TypeError("Expected argument 'cloud_provider' to be a str")
        pulumi.set(__self__, "cloud_provider", cloud_provider)
        if export_bucket_id and not isinstance(export_bucket_id, str):
            raise TypeError("Expected argument 'export_bucket_id' to be a str")
        pulumi.set(__self__, "export_bucket_id", export_bucket_id)
        if iam_role_id and not isinstance(iam_role_id, str):
            raise TypeError("Expected argument 'iam_role_id' to be a str")
        pulumi.set(__self__, "iam_role_id", iam_role_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> str:
        """
        Name of the bucket that the provided role ID is authorized to access. You must also specify the `iam_role_id`.
        """
        return pulumi.get(self, "bucket_name")

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> str:
        """
        Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter(name="exportBucketId")
    def export_bucket_id(self) -> str:
        return pulumi.get(self, "export_bucket_id")

    @property
    @pulumi.getter(name="iamRoleId")
    def iam_role_id(self) -> str:
        """
        Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucket_name`.
        """
        return pulumi.get(self, "iam_role_id")

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


class AwaitableGetCloudBackupSnapshotExportBucketResult(GetCloudBackupSnapshotExportBucketResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudBackupSnapshotExportBucketResult(
            bucket_name=self.bucket_name,
            cloud_provider=self.cloud_provider,
            export_bucket_id=self.export_bucket_id,
            iam_role_id=self.iam_role_id,
            id=self.id,
            project_id=self.project_id)


def get_cloud_backup_snapshot_export_bucket(export_bucket_id: Optional[str] = None,
                                            project_id: Optional[str] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudBackupSnapshotExportBucketResult:
    """
    `CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str export_bucket_id: Unique identifier of the snapshot export bucket.
    :param str project_id: The unique identifier of the project for the Atlas cluster.
    """
    __args__ = dict()
    __args__['exportBucketId'] = export_bucket_id
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudBackupSnapshotExportBucket:getCloudBackupSnapshotExportBucket', __args__, opts=opts, typ=GetCloudBackupSnapshotExportBucketResult).value

    return AwaitableGetCloudBackupSnapshotExportBucketResult(
        bucket_name=__ret__.bucket_name,
        cloud_provider=__ret__.cloud_provider,
        export_bucket_id=__ret__.export_bucket_id,
        iam_role_id=__ret__.iam_role_id,
        id=__ret__.id,
        project_id=__ret__.project_id)


@_utilities.lift_output_func(get_cloud_backup_snapshot_export_bucket)
def get_cloud_backup_snapshot_export_bucket_output(export_bucket_id: Optional[pulumi.Input[str]] = None,
                                                   project_id: Optional[pulumi.Input[str]] = None,
                                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCloudBackupSnapshotExportBucketResult]:
    """
    `CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str export_bucket_id: Unique identifier of the snapshot export bucket.
    :param str project_id: The unique identifier of the project for the Atlas cluster.
    """
    ...
