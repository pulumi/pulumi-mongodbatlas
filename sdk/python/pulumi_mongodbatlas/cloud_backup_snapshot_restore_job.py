# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CloudBackupSnapshotRestoreJobArgs', 'CloudBackupSnapshotRestoreJob']

@pulumi.input_type
class CloudBackupSnapshotRestoreJobArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 snapshot_id: pulumi.Input[str],
                 delivery_type_config: Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']] = None):
        """
        The set of arguments for constructing a CloudBackupSnapshotRestoreJob resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot to restore.
        :param pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs'] delivery_type_config: Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
               * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
               * `delivery_type_config.download` - Set to `true` to use the download configuration.
               * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
               * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
               * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
               * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        """
        CloudBackupSnapshotRestoreJobArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_name=cluster_name,
            project_id=project_id,
            snapshot_id=snapshot_id,
            delivery_type_config=delivery_type_config,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_name: pulumi.Input[str],
             project_id: pulumi.Input[str],
             snapshot_id: pulumi.Input[str],
             delivery_type_config: Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cluster_name", cluster_name)
        _setter("project_id", project_id)
        _setter("snapshot_id", snapshot_id)
        if delivery_type_config is not None:
            _setter("delivery_type_config", delivery_type_config)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        The name of the Atlas cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the snapshot to restore.
        """
        return pulumi.get(self, "snapshot_id")

    @snapshot_id.setter
    def snapshot_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "snapshot_id", value)

    @property
    @pulumi.getter(name="deliveryTypeConfig")
    def delivery_type_config(self) -> Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]:
        """
        Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
        * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
        * `delivery_type_config.download` - Set to `true` to use the download configuration.
        * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
        * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        """
        return pulumi.get(self, "delivery_type_config")

    @delivery_type_config.setter
    def delivery_type_config(self, value: Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]):
        pulumi.set(self, "delivery_type_config", value)


@pulumi.input_type
class _CloudBackupSnapshotRestoreJobState:
    def __init__(__self__, *,
                 cancelled: Optional[pulumi.Input[bool]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 delivery_type_config: Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']] = None,
                 delivery_urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 expired: Optional[pulumi.Input[bool]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 finished_at: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 snapshot_restore_job_id: Optional[pulumi.Input[str]] = None,
                 timestamp: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CloudBackupSnapshotRestoreJob resources.
        :param pulumi.Input[bool] cancelled: Indicates whether the restore job was canceled.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] created_at: UTC ISO 8601 formatted point in time when Atlas created the restore job.
        :param pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs'] delivery_type_config: Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
               * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
               * `delivery_type_config.download` - Set to `true` to use the download configuration.
               * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
               * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
               * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
               * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delivery_urls: One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        :param pulumi.Input[bool] expired: Indicates whether the restore job expired.
        :param pulumi.Input[str] expires_at: UTC ISO 8601 formatted point in time when the restore job expires.
        :param pulumi.Input[str] finished_at: UTC ISO 8601 formatted point in time when the restore job completed.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot to restore.
        :param pulumi.Input[str] snapshot_restore_job_id: The unique identifier of the restore job.
        :param pulumi.Input[str] timestamp: Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        """
        _CloudBackupSnapshotRestoreJobState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cancelled=cancelled,
            cluster_name=cluster_name,
            created_at=created_at,
            delivery_type_config=delivery_type_config,
            delivery_urls=delivery_urls,
            expired=expired,
            expires_at=expires_at,
            finished_at=finished_at,
            project_id=project_id,
            snapshot_id=snapshot_id,
            snapshot_restore_job_id=snapshot_restore_job_id,
            timestamp=timestamp,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cancelled: Optional[pulumi.Input[bool]] = None,
             cluster_name: Optional[pulumi.Input[str]] = None,
             created_at: Optional[pulumi.Input[str]] = None,
             delivery_type_config: Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']] = None,
             delivery_urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             expired: Optional[pulumi.Input[bool]] = None,
             expires_at: Optional[pulumi.Input[str]] = None,
             finished_at: Optional[pulumi.Input[str]] = None,
             project_id: Optional[pulumi.Input[str]] = None,
             snapshot_id: Optional[pulumi.Input[str]] = None,
             snapshot_restore_job_id: Optional[pulumi.Input[str]] = None,
             timestamp: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if cancelled is not None:
            _setter("cancelled", cancelled)
        if cluster_name is not None:
            _setter("cluster_name", cluster_name)
        if created_at is not None:
            _setter("created_at", created_at)
        if delivery_type_config is not None:
            _setter("delivery_type_config", delivery_type_config)
        if delivery_urls is not None:
            _setter("delivery_urls", delivery_urls)
        if expired is not None:
            _setter("expired", expired)
        if expires_at is not None:
            _setter("expires_at", expires_at)
        if finished_at is not None:
            _setter("finished_at", finished_at)
        if project_id is not None:
            _setter("project_id", project_id)
        if snapshot_id is not None:
            _setter("snapshot_id", snapshot_id)
        if snapshot_restore_job_id is not None:
            _setter("snapshot_restore_job_id", snapshot_restore_job_id)
        if timestamp is not None:
            _setter("timestamp", timestamp)

    @property
    @pulumi.getter
    def cancelled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the restore job was canceled.
        """
        return pulumi.get(self, "cancelled")

    @cancelled.setter
    def cancelled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cancelled", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Atlas cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        UTC ISO 8601 formatted point in time when Atlas created the restore job.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="deliveryTypeConfig")
    def delivery_type_config(self) -> Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]:
        """
        Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
        * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
        * `delivery_type_config.download` - Set to `true` to use the download configuration.
        * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
        * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        """
        return pulumi.get(self, "delivery_type_config")

    @delivery_type_config.setter
    def delivery_type_config(self, value: Optional[pulumi.Input['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]):
        pulumi.set(self, "delivery_type_config", value)

    @property
    @pulumi.getter(name="deliveryUrls")
    def delivery_urls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        """
        return pulumi.get(self, "delivery_urls")

    @delivery_urls.setter
    def delivery_urls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "delivery_urls", value)

    @property
    @pulumi.getter
    def expired(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the restore job expired.
        """
        return pulumi.get(self, "expired")

    @expired.setter
    def expired(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "expired", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        UTC ISO 8601 formatted point in time when the restore job expires.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter(name="finishedAt")
    def finished_at(self) -> Optional[pulumi.Input[str]]:
        """
        UTC ISO 8601 formatted point in time when the restore job completed.
        """
        return pulumi.get(self, "finished_at")

    @finished_at.setter
    def finished_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "finished_at", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the snapshot to restore.
        """
        return pulumi.get(self, "snapshot_id")

    @snapshot_id.setter
    def snapshot_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_id", value)

    @property
    @pulumi.getter(name="snapshotRestoreJobId")
    def snapshot_restore_job_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the restore job.
        """
        return pulumi.get(self, "snapshot_restore_job_id")

    @snapshot_restore_job_id.setter
    def snapshot_restore_job_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_restore_job_id", value)

    @property
    @pulumi.getter
    def timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        """
        return pulumi.get(self, "timestamp")

    @timestamp.setter
    def timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timestamp", value)


class CloudBackupSnapshotRestoreJob(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 delivery_type_config: Optional[pulumi.Input[pulumi.InputType['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
        ```
         For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[pulumi.InputType['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']] delivery_type_config: Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
               * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
               * `delivery_type_config.download` - Set to `true` to use the download configuration.
               * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
               * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
               * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
               * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot to restore.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudBackupSnapshotRestoreJobArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
        ```
         For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)

        :param str resource_name: The name of the resource.
        :param CloudBackupSnapshotRestoreJobArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudBackupSnapshotRestoreJobArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CloudBackupSnapshotRestoreJobArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 delivery_type_config: Optional[pulumi.Input[pulumi.InputType['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CloudBackupSnapshotRestoreJobArgs.__new__(CloudBackupSnapshotRestoreJobArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            if delivery_type_config is not None and not isinstance(delivery_type_config, CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs):
                delivery_type_config = delivery_type_config or {}
                def _setter(key, value):
                    delivery_type_config[key] = value
                CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs._configure(_setter, **delivery_type_config)
            __props__.__dict__["delivery_type_config"] = delivery_type_config
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if snapshot_id is None and not opts.urn:
                raise TypeError("Missing required property 'snapshot_id'")
            __props__.__dict__["snapshot_id"] = snapshot_id
            __props__.__dict__["cancelled"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["delivery_urls"] = None
            __props__.__dict__["expired"] = None
            __props__.__dict__["expires_at"] = None
            __props__.__dict__["finished_at"] = None
            __props__.__dict__["snapshot_restore_job_id"] = None
            __props__.__dict__["timestamp"] = None
        super(CloudBackupSnapshotRestoreJob, __self__).__init__(
            'mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cancelled: Optional[pulumi.Input[bool]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            delivery_type_config: Optional[pulumi.Input[pulumi.InputType['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']]] = None,
            delivery_urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            expired: Optional[pulumi.Input[bool]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            finished_at: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            snapshot_id: Optional[pulumi.Input[str]] = None,
            snapshot_restore_job_id: Optional[pulumi.Input[str]] = None,
            timestamp: Optional[pulumi.Input[str]] = None) -> 'CloudBackupSnapshotRestoreJob':
        """
        Get an existing CloudBackupSnapshotRestoreJob resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] cancelled: Indicates whether the restore job was canceled.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] created_at: UTC ISO 8601 formatted point in time when Atlas created the restore job.
        :param pulumi.Input[pulumi.InputType['CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs']] delivery_type_config: Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
               * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
               * `delivery_type_config.download` - Set to `true` to use the download configuration.
               * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
               * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
               * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
               * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
               * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delivery_urls: One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        :param pulumi.Input[bool] expired: Indicates whether the restore job expired.
        :param pulumi.Input[str] expires_at: UTC ISO 8601 formatted point in time when the restore job expires.
        :param pulumi.Input[str] finished_at: UTC ISO 8601 formatted point in time when the restore job completed.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        :param pulumi.Input[str] snapshot_id: Unique identifier of the snapshot to restore.
        :param pulumi.Input[str] snapshot_restore_job_id: The unique identifier of the restore job.
        :param pulumi.Input[str] timestamp: Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudBackupSnapshotRestoreJobState.__new__(_CloudBackupSnapshotRestoreJobState)

        __props__.__dict__["cancelled"] = cancelled
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["delivery_type_config"] = delivery_type_config
        __props__.__dict__["delivery_urls"] = delivery_urls
        __props__.__dict__["expired"] = expired
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["finished_at"] = finished_at
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["snapshot_id"] = snapshot_id
        __props__.__dict__["snapshot_restore_job_id"] = snapshot_restore_job_id
        __props__.__dict__["timestamp"] = timestamp
        return CloudBackupSnapshotRestoreJob(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cancelled(self) -> pulumi.Output[bool]:
        """
        Indicates whether the restore job was canceled.
        """
        return pulumi.get(self, "cancelled")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        The name of the Atlas cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        UTC ISO 8601 formatted point in time when Atlas created the restore job.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="deliveryTypeConfig")
    def delivery_type_config(self) -> pulumi.Output[Optional['outputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfig']]:
        """
        Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
        * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
        * `delivery_type_config.download` - Set to `true` to use the download configuration.
        * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
        * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
        * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
        * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
        * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
        """
        return pulumi.get(self, "delivery_type_config")

    @property
    @pulumi.getter(name="deliveryUrls")
    def delivery_urls(self) -> pulumi.Output[Sequence[str]]:
        """
        One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
        """
        return pulumi.get(self, "delivery_urls")

    @property
    @pulumi.getter
    def expired(self) -> pulumi.Output[bool]:
        """
        Indicates whether the restore job expired.
        """
        return pulumi.get(self, "expired")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[str]:
        """
        UTC ISO 8601 formatted point in time when the restore job expires.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter(name="finishedAt")
    def finished_at(self) -> pulumi.Output[str]:
        """
        UTC ISO 8601 formatted point in time when the restore job completed.
        """
        return pulumi.get(self, "finished_at")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the snapshot to restore.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter(name="snapshotRestoreJobId")
    def snapshot_restore_job_id(self) -> pulumi.Output[str]:
        """
        The unique identifier of the restore job.
        """
        return pulumi.get(self, "snapshot_restore_job_id")

    @property
    @pulumi.getter
    def timestamp(self) -> pulumi.Output[str]:
        """
        Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
        """
        return pulumi.get(self, "timestamp")

