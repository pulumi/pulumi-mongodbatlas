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
from ._inputs import *

__all__ = ['CloudBackupSnapshotArgs', 'CloudBackupSnapshot']

@pulumi.input_type
class CloudBackupSnapshotArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 description: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 retention_in_days: pulumi.Input[int]):
        """
        The set of arguments for constructing a CloudBackupSnapshot resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshots you want to retrieve.
        :param pulumi.Input[str] description: Description of the on-demand snapshot.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] retention_in_days: The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "retention_in_days", retention_in_days)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        The name of the Atlas cluster that contains the snapshots you want to retrieve.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description of the on-demand snapshot.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique identifier of the project for the Atlas cluster.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> pulumi.Input[int]:
        """
        The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        """
        return pulumi.get(self, "retention_in_days")

    @retention_in_days.setter
    def retention_in_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "retention_in_days", value)


@pulumi.input_type
class _CloudBackupSnapshotState:
    def __init__(__self__, *,
                 cloud_provider: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 master_key_uuid: Optional[pulumi.Input[str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input['CloudBackupSnapshotMemberArgs']]]] = None,
                 mongod_version: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 replica_set_name: Optional[pulumi.Input[str]] = None,
                 retention_in_days: Optional[pulumi.Input[int]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 snapshot_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 snapshot_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 storage_size_bytes: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CloudBackupSnapshot resources.
        :param pulumi.Input[str] cloud_provider: Cloud provider that stores this snapshot.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshots you want to retrieve.
        :param pulumi.Input[str] created_at: UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        :param pulumi.Input[str] description: Description of the on-demand snapshot.
        :param pulumi.Input[str] expires_at: UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        :param pulumi.Input[str] master_key_uuid: Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        :param pulumi.Input[Sequence[pulumi.Input['CloudBackupSnapshotMemberArgs']]] members: Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
        :param pulumi.Input[str] mongod_version: Version of the MongoDB server.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[str] replica_set_name: Label given to a shard or config server from which Atlas took this snapshot.
        :param pulumi.Input[int] retention_in_days: The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] snapshot_ids: Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
        :param pulumi.Input[str] snapshot_type: Specified the type of snapshot. Valid values are onDemand and scheduled.
        :param pulumi.Input[str] status: Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        :param pulumi.Input[int] storage_size_bytes: Specifies the size of the snapshot in bytes.
        :param pulumi.Input[str] type: Specifies the type of cluster: replicaSet or shardedCluster.
        """
        if cloud_provider is not None:
            pulumi.set(__self__, "cloud_provider", cloud_provider)
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if master_key_uuid is not None:
            pulumi.set(__self__, "master_key_uuid", master_key_uuid)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if mongod_version is not None:
            pulumi.set(__self__, "mongod_version", mongod_version)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if replica_set_name is not None:
            pulumi.set(__self__, "replica_set_name", replica_set_name)
        if retention_in_days is not None:
            pulumi.set(__self__, "retention_in_days", retention_in_days)
        if snapshot_id is not None:
            pulumi.set(__self__, "snapshot_id", snapshot_id)
        if snapshot_ids is not None:
            pulumi.set(__self__, "snapshot_ids", snapshot_ids)
        if snapshot_type is not None:
            pulumi.set(__self__, "snapshot_type", snapshot_type)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if storage_size_bytes is not None:
            pulumi.set(__self__, "storage_size_bytes", storage_size_bytes)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> Optional[pulumi.Input[str]]:
        """
        Cloud provider that stores this snapshot.
        """
        return pulumi.get(self, "cloud_provider")

    @cloud_provider.setter
    def cloud_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_provider", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Atlas cluster that contains the snapshots you want to retrieve.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the on-demand snapshot.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter(name="masterKeyUuid")
    def master_key_uuid(self) -> Optional[pulumi.Input[str]]:
        """
        Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        """
        return pulumi.get(self, "master_key_uuid")

    @master_key_uuid.setter
    def master_key_uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "master_key_uuid", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CloudBackupSnapshotMemberArgs']]]]:
        """
        Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CloudBackupSnapshotMemberArgs']]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter(name="mongodVersion")
    def mongod_version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the MongoDB server.
        """
        return pulumi.get(self, "mongod_version")

    @mongod_version.setter
    def mongod_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mongod_version", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the project for the Atlas cluster.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="replicaSetName")
    def replica_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        Label given to a shard or config server from which Atlas took this snapshot.
        """
        return pulumi.get(self, "replica_set_name")

    @replica_set_name.setter
    def replica_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "replica_set_name", value)

    @property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        """
        return pulumi.get(self, "retention_in_days")

    @retention_in_days.setter
    def retention_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_in_days", value)

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the snapshot.
        """
        return pulumi.get(self, "snapshot_id")

    @snapshot_id.setter
    def snapshot_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_id", value)

    @property
    @pulumi.getter(name="snapshotIds")
    def snapshot_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
        """
        return pulumi.get(self, "snapshot_ids")

    @snapshot_ids.setter
    def snapshot_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "snapshot_ids", value)

    @property
    @pulumi.getter(name="snapshotType")
    def snapshot_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specified the type of snapshot. Valid values are onDemand and scheduled.
        """
        return pulumi.get(self, "snapshot_type")

    @snapshot_type.setter
    def snapshot_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="storageSizeBytes")
    def storage_size_bytes(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the size of the snapshot in bytes.
        """
        return pulumi.get(self, "storage_size_bytes")

    @storage_size_bytes.setter
    def storage_size_bytes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "storage_size_bytes", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the type of cluster: replicaSet or shardedCluster.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class CloudBackupSnapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 retention_in_days: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        `CloudBackupSnapshot` provides a resource to take a cloud backup snapshot on demand.
        On-demand snapshots happen immediately, unlike scheduled snapshots which occur at regular intervals. If there is already an on-demand snapshot with a status of queued or inProgress, you must wait until Atlas has completed the on-demand snapshot before taking another.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        > **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete a backup snapshot or decrease the retention time for a snapshot after it's taken.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        my_cluster = mongodbatlas.Cluster("myCluster",
            project_id="5cf5a45a9ccf6400e60981b6",
            provider_name="AWS",
            provider_region_name="EU_WEST_2",
            provider_instance_size_name="M10",
            cloud_backup=True)
        # enable cloud backup snapshots
        test_cloud_backup_snapshot = mongodbatlas.CloudBackupSnapshot("testCloudBackupSnapshot",
            project_id=my_cluster.project_id,
            cluster_name=my_cluster.name,
            description="myDescription",
            retention_in_days=1)
        test_cloud_backup_snapshot_restore_job = mongodbatlas.CloudBackupSnapshotRestoreJob("testCloudBackupSnapshotRestoreJob",
            project_id=test_cloud_backup_snapshot.project_id,
            cluster_name=test_cloud_backup_snapshot.cluster_name,
            snapshot_id=test_cloud_backup_snapshot.snapshot_id,
            delivery_type_config=mongodbatlas.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs(
                download=True,
            ))
        ```

        ## Import

        Cloud Backup Snapshot entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-SNAPSHOTID`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot test 5d0f1f73cf09a29120e173cf-MyClusterTest-5d116d82014b764445b2f9b5
        ```
         For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/backups/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshots you want to retrieve.
        :param pulumi.Input[str] description: Description of the on-demand snapshot.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] retention_in_days: The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudBackupSnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `CloudBackupSnapshot` provides a resource to take a cloud backup snapshot on demand.
        On-demand snapshots happen immediately, unlike scheduled snapshots which occur at regular intervals. If there is already an on-demand snapshot with a status of queued or inProgress, you must wait until Atlas has completed the on-demand snapshot before taking another.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        > **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete a backup snapshot or decrease the retention time for a snapshot after it's taken.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        my_cluster = mongodbatlas.Cluster("myCluster",
            project_id="5cf5a45a9ccf6400e60981b6",
            provider_name="AWS",
            provider_region_name="EU_WEST_2",
            provider_instance_size_name="M10",
            cloud_backup=True)
        # enable cloud backup snapshots
        test_cloud_backup_snapshot = mongodbatlas.CloudBackupSnapshot("testCloudBackupSnapshot",
            project_id=my_cluster.project_id,
            cluster_name=my_cluster.name,
            description="myDescription",
            retention_in_days=1)
        test_cloud_backup_snapshot_restore_job = mongodbatlas.CloudBackupSnapshotRestoreJob("testCloudBackupSnapshotRestoreJob",
            project_id=test_cloud_backup_snapshot.project_id,
            cluster_name=test_cloud_backup_snapshot.cluster_name,
            snapshot_id=test_cloud_backup_snapshot.snapshot_id,
            delivery_type_config=mongodbatlas.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs(
                download=True,
            ))
        ```

        ## Import

        Cloud Backup Snapshot entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-SNAPSHOTID`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot test 5d0f1f73cf09a29120e173cf-MyClusterTest-5d116d82014b764445b2f9b5
        ```
         For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/backups/)

        :param str resource_name: The name of the resource.
        :param CloudBackupSnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudBackupSnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 retention_in_days: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CloudBackupSnapshotArgs.__new__(CloudBackupSnapshotArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if retention_in_days is None and not opts.urn:
                raise TypeError("Missing required property 'retention_in_days'")
            __props__.__dict__["retention_in_days"] = retention_in_days
            __props__.__dict__["cloud_provider"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["expires_at"] = None
            __props__.__dict__["master_key_uuid"] = None
            __props__.__dict__["members"] = None
            __props__.__dict__["mongod_version"] = None
            __props__.__dict__["replica_set_name"] = None
            __props__.__dict__["snapshot_id"] = None
            __props__.__dict__["snapshot_ids"] = None
            __props__.__dict__["snapshot_type"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["storage_size_bytes"] = None
            __props__.__dict__["type"] = None
        super(CloudBackupSnapshot, __self__).__init__(
            'mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloud_provider: Optional[pulumi.Input[str]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            master_key_uuid: Optional[pulumi.Input[str]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudBackupSnapshotMemberArgs']]]]] = None,
            mongod_version: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            replica_set_name: Optional[pulumi.Input[str]] = None,
            retention_in_days: Optional[pulumi.Input[int]] = None,
            snapshot_id: Optional[pulumi.Input[str]] = None,
            snapshot_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            snapshot_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            storage_size_bytes: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'CloudBackupSnapshot':
        """
        Get an existing CloudBackupSnapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloud_provider: Cloud provider that stores this snapshot.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshots you want to retrieve.
        :param pulumi.Input[str] created_at: UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        :param pulumi.Input[str] description: Description of the on-demand snapshot.
        :param pulumi.Input[str] expires_at: UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        :param pulumi.Input[str] master_key_uuid: Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudBackupSnapshotMemberArgs']]]] members: Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
        :param pulumi.Input[str] mongod_version: Version of the MongoDB server.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[str] replica_set_name: Label given to a shard or config server from which Atlas took this snapshot.
        :param pulumi.Input[int] retention_in_days: The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] snapshot_ids: Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
        :param pulumi.Input[str] snapshot_type: Specified the type of snapshot. Valid values are onDemand and scheduled.
        :param pulumi.Input[str] status: Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        :param pulumi.Input[int] storage_size_bytes: Specifies the size of the snapshot in bytes.
        :param pulumi.Input[str] type: Specifies the type of cluster: replicaSet or shardedCluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudBackupSnapshotState.__new__(_CloudBackupSnapshotState)

        __props__.__dict__["cloud_provider"] = cloud_provider
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["description"] = description
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["master_key_uuid"] = master_key_uuid
        __props__.__dict__["members"] = members
        __props__.__dict__["mongod_version"] = mongod_version
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["replica_set_name"] = replica_set_name
        __props__.__dict__["retention_in_days"] = retention_in_days
        __props__.__dict__["snapshot_id"] = snapshot_id
        __props__.__dict__["snapshot_ids"] = snapshot_ids
        __props__.__dict__["snapshot_type"] = snapshot_type
        __props__.__dict__["status"] = status
        __props__.__dict__["storage_size_bytes"] = storage_size_bytes
        __props__.__dict__["type"] = type
        return CloudBackupSnapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> pulumi.Output[str]:
        """
        Cloud provider that stores this snapshot.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        The name of the Atlas cluster that contains the snapshots you want to retrieve.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the on-demand snapshot.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[str]:
        """
        UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter(name="masterKeyUuid")
    def master_key_uuid(self) -> pulumi.Output[str]:
        """
        Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        """
        return pulumi.get(self, "master_key_uuid")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Sequence['outputs.CloudBackupSnapshotMember']]:
        """
        Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="mongodVersion")
    def mongod_version(self) -> pulumi.Output[str]:
        """
        Version of the MongoDB server.
        """
        return pulumi.get(self, "mongod_version")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique identifier of the project for the Atlas cluster.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="replicaSetName")
    def replica_set_name(self) -> pulumi.Output[str]:
        """
        Label given to a shard or config server from which Atlas took this snapshot.
        """
        return pulumi.get(self, "replica_set_name")

    @property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> pulumi.Output[int]:
        """
        The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        """
        return pulumi.get(self, "retention_in_days")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the snapshot.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter(name="snapshotIds")
    def snapshot_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
        """
        return pulumi.get(self, "snapshot_ids")

    @property
    @pulumi.getter(name="snapshotType")
    def snapshot_type(self) -> pulumi.Output[str]:
        """
        Specified the type of snapshot. Valid values are onDemand and scheduled.
        """
        return pulumi.get(self, "snapshot_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="storageSizeBytes")
    def storage_size_bytes(self) -> pulumi.Output[int]:
        """
        Specifies the size of the snapshot in bytes.
        """
        return pulumi.get(self, "storage_size_bytes")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Specifies the type of cluster: replicaSet or shardedCluster.
        """
        return pulumi.get(self, "type")

