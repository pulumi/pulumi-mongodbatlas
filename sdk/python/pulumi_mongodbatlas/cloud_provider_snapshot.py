# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['CloudProviderSnapshot']


class CloudProviderSnapshot(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 retention_in_days: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        `CloudProviderSnapshot` provides a resource to take a cloud backup snapshot on demand.
        On-demand snapshots happen immediately, unlike scheduled snapshots which occur at regular intervals. If there is already an on-demand snapshot with a status of queued or inProgress, you must wait until Atlas has completed the on-demand snapshot before taking another.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        my_cluster = mongodbatlas.Cluster("myCluster",
            project_id="5cf5a45a9ccf6400e60981b6",
            disk_size_gb=5,
            provider_name="AWS",
            provider_region_name="EU_WEST_2",
            provider_instance_size_name="M10",
            provider_backup_enabled=True,
            provider_disk_iops=100,
            provider_encrypt_ebs_volume=False)
        test_cloud_provider_snapshot = mongodbatlas.CloudProviderSnapshot("testCloudProviderSnapshot",
            project_id=my_cluster.project_id,
            cluster_name=my_cluster.name,
            description="myDescription",
            retention_in_days=1)
        test_cloud_provider_snapshot_restore_job = mongodbatlas.CloudProviderSnapshotRestoreJob("testCloudProviderSnapshotRestoreJob",
            project_id=test_cloud_provider_snapshot.project_id,
            cluster_name=test_cloud_provider_snapshot.cluster_name,
            snapshot_id=test_cloud_provider_snapshot.snapshot_id,
            delivery_type=mongodbatlas.CloudProviderSnapshotRestoreJobDeliveryTypeArgs(
                download=True,
            ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshots you want to retrieve.
        :param pulumi.Input[str] description: Description of the on-demand snapshot.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] retention_in_days: The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if cluster_name is None:
                raise TypeError("Missing required property 'cluster_name'")
            __props__['cluster_name'] = cluster_name
            if description is None:
                raise TypeError("Missing required property 'description'")
            __props__['description'] = description
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            if retention_in_days is None:
                raise TypeError("Missing required property 'retention_in_days'")
            __props__['retention_in_days'] = retention_in_days
            __props__['created_at'] = None
            __props__['expires_at'] = None
            __props__['master_key_uuid'] = None
            __props__['mongod_version'] = None
            __props__['snapshot_id'] = None
            __props__['snapshot_type'] = None
            __props__['status'] = None
            __props__['storage_size_bytes'] = None
            __props__['type'] = None
        super(CloudProviderSnapshot, __self__).__init__(
            'mongodbatlas:index/cloudProviderSnapshot:CloudProviderSnapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            master_key_uuid: Optional[pulumi.Input[str]] = None,
            mongod_version: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            retention_in_days: Optional[pulumi.Input[int]] = None,
            snapshot_id: Optional[pulumi.Input[str]] = None,
            snapshot_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            storage_size_bytes: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'CloudProviderSnapshot':
        """
        Get an existing CloudProviderSnapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshots you want to retrieve.
        :param pulumi.Input[str] created_at: UTC ISO 8601 formatted point in time when Atlas took the snapshot.
        :param pulumi.Input[str] description: Description of the on-demand snapshot.
        :param pulumi.Input[str] expires_at: UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
        :param pulumi.Input[str] master_key_uuid: Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
        :param pulumi.Input[str] mongod_version: Version of the MongoDB server.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] retention_in_days: The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot.
        :param pulumi.Input[str] snapshot_type: Specified the type of snapshot. Valid values are onDemand and scheduled.
        :param pulumi.Input[str] status: Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
        :param pulumi.Input[int] storage_size_bytes: Specifies the size of the snapshot in bytes.
        :param pulumi.Input[str] type: Specifies the type of cluster: replicaSet or shardedCluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_name"] = cluster_name
        __props__["created_at"] = created_at
        __props__["description"] = description
        __props__["expires_at"] = expires_at
        __props__["master_key_uuid"] = master_key_uuid
        __props__["mongod_version"] = mongod_version
        __props__["project_id"] = project_id
        __props__["retention_in_days"] = retention_in_days
        __props__["snapshot_id"] = snapshot_id
        __props__["snapshot_type"] = snapshot_type
        __props__["status"] = status
        __props__["storage_size_bytes"] = storage_size_bytes
        __props__["type"] = type
        return CloudProviderSnapshot(resource_name, opts=opts, __props__=__props__)

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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

