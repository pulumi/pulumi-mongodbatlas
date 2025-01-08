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
    'GetCloudBackupSnapshotExportJobResult',
    'AwaitableGetCloudBackupSnapshotExportJobResult',
    'get_cloud_backup_snapshot_export_job',
    'get_cloud_backup_snapshot_export_job_output',
]

@pulumi.output_type
class GetCloudBackupSnapshotExportJobResult:
    """
    A collection of values returned by getCloudBackupSnapshotExportJob.
    """
    def __init__(__self__, cluster_name=None, components=None, created_at=None, custom_datas=None, export_bucket_id=None, export_job_id=None, export_status_exported_collections=None, export_status_total_collections=None, finished_at=None, id=None, prefix=None, project_id=None, snapshot_id=None, state=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if components and not isinstance(components, list):
            raise TypeError("Expected argument 'components' to be a list")
        pulumi.set(__self__, "components", components)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if custom_datas and not isinstance(custom_datas, list):
            raise TypeError("Expected argument 'custom_datas' to be a list")
        pulumi.set(__self__, "custom_datas", custom_datas)
        if export_bucket_id and not isinstance(export_bucket_id, str):
            raise TypeError("Expected argument 'export_bucket_id' to be a str")
        pulumi.set(__self__, "export_bucket_id", export_bucket_id)
        if export_job_id and not isinstance(export_job_id, str):
            raise TypeError("Expected argument 'export_job_id' to be a str")
        pulumi.set(__self__, "export_job_id", export_job_id)
        if export_status_exported_collections and not isinstance(export_status_exported_collections, int):
            raise TypeError("Expected argument 'export_status_exported_collections' to be a int")
        pulumi.set(__self__, "export_status_exported_collections", export_status_exported_collections)
        if export_status_total_collections and not isinstance(export_status_total_collections, int):
            raise TypeError("Expected argument 'export_status_total_collections' to be a int")
        pulumi.set(__self__, "export_status_total_collections", export_status_total_collections)
        if finished_at and not isinstance(finished_at, str):
            raise TypeError("Expected argument 'finished_at' to be a str")
        pulumi.set(__self__, "finished_at", finished_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if snapshot_id and not isinstance(snapshot_id, str):
            raise TypeError("Expected argument 'snapshot_id' to be a str")
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter
    def components(self) -> Sequence['outputs.GetCloudBackupSnapshotExportJobComponentResult']:
        """
        _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
        """
        return pulumi.get(self, "components")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        Timestamp in ISO 8601 date and time format in UTC when the export job was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="customDatas")
    def custom_datas(self) -> Sequence['outputs.GetCloudBackupSnapshotExportJobCustomDataResult']:
        """
        Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
        """
        return pulumi.get(self, "custom_datas")

    @property
    @pulumi.getter(name="exportBucketId")
    def export_bucket_id(self) -> str:
        """
        Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
        """
        return pulumi.get(self, "export_bucket_id")

    @property
    @pulumi.getter(name="exportJobId")
    def export_job_id(self) -> str:
        """
        Unique identifier of the export job.
        * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
        """
        return pulumi.get(self, "export_job_id")

    @property
    @pulumi.getter(name="exportStatusExportedCollections")
    def export_status_exported_collections(self) -> int:
        return pulumi.get(self, "export_status_exported_collections")

    @property
    @pulumi.getter(name="exportStatusTotalCollections")
    def export_status_total_collections(self) -> int:
        return pulumi.get(self, "export_status_total_collections")

    @property
    @pulumi.getter(name="finishedAt")
    def finished_at(self) -> str:
        """
        Timestamp in ISO 8601 date and time format in UTC when the export job completes.
        """
        return pulumi.get(self, "finished_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def prefix(self) -> str:
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> str:
        """
        Unique identifier of the Cloud Backup snapshot to export.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Status of the export job. Value can be one of the following:
        * `Queued` - indicates that the export job is queued
        * `InProgress` - indicates that the snapshot is being exported
        * `Successful` - indicates that the export job has completed successfully
        * `Failed` - indicates that the export job has failed
        * `Cancelled` - indicates that the export job has cancelled
        """
        return pulumi.get(self, "state")


class AwaitableGetCloudBackupSnapshotExportJobResult(GetCloudBackupSnapshotExportJobResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudBackupSnapshotExportJobResult(
            cluster_name=self.cluster_name,
            components=self.components,
            created_at=self.created_at,
            custom_datas=self.custom_datas,
            export_bucket_id=self.export_bucket_id,
            export_job_id=self.export_job_id,
            export_status_exported_collections=self.export_status_exported_collections,
            export_status_total_collections=self.export_status_total_collections,
            finished_at=self.finished_at,
            id=self.id,
            prefix=self.prefix,
            project_id=self.project_id,
            snapshot_id=self.snapshot_id,
            state=self.state)


def get_cloud_backup_snapshot_export_job(cluster_name: Optional[str] = None,
                                         export_job_id: Optional[str] = None,
                                         project_id: Optional[str] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudBackupSnapshotExportJobResult:
    """
    ## # Data Source: mongodbatlas_cloud_backup_snapshot_export_Job

    `CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_cloud_backup_snapshot_export_bucket = mongodbatlas.CloudBackupSnapshotExportBucket("test",
        project_id="{PROJECT_ID}",
        iam_role_id="{IAM_ROLE_ID}",
        bucket_name="example_bucket",
        cloud_provider="AWS")
    test_cloud_backup_snapshot_export_job = mongodbatlas.CloudBackupSnapshotExportJob("test",
        project_id="{PROJECT_ID}",
        cluster_name="{CLUSTER_NAME}",
        snapshot_id="{SNAPSHOT_ID}",
        export_bucket_id=test_cloud_backup_snapshot_export_bucket.export_bucket_id,
        custom_datas=[{
            "key": "exported by",
            "value": "myName",
        }])
    test = mongodbatlas.get_cloud_backup_snapshot_export_job_output(project_id="{PROJECT_ID}",
        cluster_name="{CLUSTER_NAME}",
        export_job_id=test_cloud_backup_snapshot_export_job.export_job_id)
    ```


    :param str cluster_name: Name of the Atlas cluster whose export job you want to retrieve.
    :param str export_job_id: Unique identifier of the export job to retrieve.
    :param str project_id: Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['exportJobId'] = export_job_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob', __args__, opts=opts, typ=GetCloudBackupSnapshotExportJobResult).value

    return AwaitableGetCloudBackupSnapshotExportJobResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        components=pulumi.get(__ret__, 'components'),
        created_at=pulumi.get(__ret__, 'created_at'),
        custom_datas=pulumi.get(__ret__, 'custom_datas'),
        export_bucket_id=pulumi.get(__ret__, 'export_bucket_id'),
        export_job_id=pulumi.get(__ret__, 'export_job_id'),
        export_status_exported_collections=pulumi.get(__ret__, 'export_status_exported_collections'),
        export_status_total_collections=pulumi.get(__ret__, 'export_status_total_collections'),
        finished_at=pulumi.get(__ret__, 'finished_at'),
        id=pulumi.get(__ret__, 'id'),
        prefix=pulumi.get(__ret__, 'prefix'),
        project_id=pulumi.get(__ret__, 'project_id'),
        snapshot_id=pulumi.get(__ret__, 'snapshot_id'),
        state=pulumi.get(__ret__, 'state'))
def get_cloud_backup_snapshot_export_job_output(cluster_name: Optional[pulumi.Input[str]] = None,
                                                export_job_id: Optional[pulumi.Input[str]] = None,
                                                project_id: Optional[pulumi.Input[str]] = None,
                                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCloudBackupSnapshotExportJobResult]:
    """
    ## # Data Source: mongodbatlas_cloud_backup_snapshot_export_Job

    `CloudBackupSnapshotExportJob` datasource allows you to retrieve a snapshot export job for the specified project and cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_cloud_backup_snapshot_export_bucket = mongodbatlas.CloudBackupSnapshotExportBucket("test",
        project_id="{PROJECT_ID}",
        iam_role_id="{IAM_ROLE_ID}",
        bucket_name="example_bucket",
        cloud_provider="AWS")
    test_cloud_backup_snapshot_export_job = mongodbatlas.CloudBackupSnapshotExportJob("test",
        project_id="{PROJECT_ID}",
        cluster_name="{CLUSTER_NAME}",
        snapshot_id="{SNAPSHOT_ID}",
        export_bucket_id=test_cloud_backup_snapshot_export_bucket.export_bucket_id,
        custom_datas=[{
            "key": "exported by",
            "value": "myName",
        }])
    test = mongodbatlas.get_cloud_backup_snapshot_export_job_output(project_id="{PROJECT_ID}",
        cluster_name="{CLUSTER_NAME}",
        export_job_id=test_cloud_backup_snapshot_export_job.export_job_id)
    ```


    :param str cluster_name: Name of the Atlas cluster whose export job you want to retrieve.
    :param str export_job_id: Unique identifier of the export job to retrieve.
    :param str project_id: Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['exportJobId'] = export_job_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getCloudBackupSnapshotExportJob:getCloudBackupSnapshotExportJob', __args__, opts=opts, typ=GetCloudBackupSnapshotExportJobResult)
    return __ret__.apply(lambda __response__: GetCloudBackupSnapshotExportJobResult(
        cluster_name=pulumi.get(__response__, 'cluster_name'),
        components=pulumi.get(__response__, 'components'),
        created_at=pulumi.get(__response__, 'created_at'),
        custom_datas=pulumi.get(__response__, 'custom_datas'),
        export_bucket_id=pulumi.get(__response__, 'export_bucket_id'),
        export_job_id=pulumi.get(__response__, 'export_job_id'),
        export_status_exported_collections=pulumi.get(__response__, 'export_status_exported_collections'),
        export_status_total_collections=pulumi.get(__response__, 'export_status_total_collections'),
        finished_at=pulumi.get(__response__, 'finished_at'),
        id=pulumi.get(__response__, 'id'),
        prefix=pulumi.get(__response__, 'prefix'),
        project_id=pulumi.get(__response__, 'project_id'),
        snapshot_id=pulumi.get(__response__, 'snapshot_id'),
        state=pulumi.get(__response__, 'state')))
