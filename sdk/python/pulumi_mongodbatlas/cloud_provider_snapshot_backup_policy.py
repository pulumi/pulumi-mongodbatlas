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

__all__ = ['CloudProviderSnapshotBackupPolicyArgs', 'CloudProviderSnapshotBackupPolicy']

@pulumi.input_type
class CloudProviderSnapshotBackupPolicyArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 policies: pulumi.Input[Sequence[pulumi.Input['CloudProviderSnapshotBackupPolicyPolicyArgs']]],
                 project_id: pulumi.Input[str],
                 reference_hour_of_day: Optional[pulumi.Input[int]] = None,
                 reference_minute_of_hour: Optional[pulumi.Input[int]] = None,
                 restore_window_days: Optional[pulumi.Input[int]] = None,
                 update_snapshots: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a CloudProviderSnapshotBackupPolicy resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] reference_hour_of_day: UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        :param pulumi.Input[int] reference_minute_of_hour: UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        :param pulumi.Input[int] restore_window_days: Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        :param pulumi.Input[bool] update_snapshots: Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "policies", policies)
        pulumi.set(__self__, "project_id", project_id)
        if reference_hour_of_day is not None:
            pulumi.set(__self__, "reference_hour_of_day", reference_hour_of_day)
        if reference_minute_of_hour is not None:
            pulumi.set(__self__, "reference_minute_of_hour", reference_minute_of_hour)
        if restore_window_days is not None:
            pulumi.set(__self__, "restore_window_days", restore_window_days)
        if update_snapshots is not None:
            pulumi.set(__self__, "update_snapshots", update_snapshots)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Input[Sequence[pulumi.Input['CloudProviderSnapshotBackupPolicyPolicyArgs']]]:
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: pulumi.Input[Sequence[pulumi.Input['CloudProviderSnapshotBackupPolicyPolicyArgs']]]):
        pulumi.set(self, "policies", value)

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
    @pulumi.getter(name="referenceHourOfDay")
    def reference_hour_of_day(self) -> Optional[pulumi.Input[int]]:
        """
        UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        """
        return pulumi.get(self, "reference_hour_of_day")

    @reference_hour_of_day.setter
    def reference_hour_of_day(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "reference_hour_of_day", value)

    @property
    @pulumi.getter(name="referenceMinuteOfHour")
    def reference_minute_of_hour(self) -> Optional[pulumi.Input[int]]:
        """
        UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        """
        return pulumi.get(self, "reference_minute_of_hour")

    @reference_minute_of_hour.setter
    def reference_minute_of_hour(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "reference_minute_of_hour", value)

    @property
    @pulumi.getter(name="restoreWindowDays")
    def restore_window_days(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        """
        return pulumi.get(self, "restore_window_days")

    @restore_window_days.setter
    def restore_window_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "restore_window_days", value)

    @property
    @pulumi.getter(name="updateSnapshots")
    def update_snapshots(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        return pulumi.get(self, "update_snapshots")

    @update_snapshots.setter
    def update_snapshots(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "update_snapshots", value)


@pulumi.input_type
class _CloudProviderSnapshotBackupPolicyState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 next_snapshot: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderSnapshotBackupPolicyPolicyArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 reference_hour_of_day: Optional[pulumi.Input[int]] = None,
                 reference_minute_of_hour: Optional[pulumi.Input[int]] = None,
                 restore_window_days: Optional[pulumi.Input[int]] = None,
                 update_snapshots: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering CloudProviderSnapshotBackupPolicy resources.
        :param pulumi.Input[str] cluster_id: Unique identifier of the Atlas cluster.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        :param pulumi.Input[str] next_snapshot: Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] reference_hour_of_day: UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        :param pulumi.Input[int] reference_minute_of_hour: UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        :param pulumi.Input[int] restore_window_days: Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        :param pulumi.Input[bool] update_snapshots: Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if next_snapshot is not None:
            pulumi.set(__self__, "next_snapshot", next_snapshot)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if reference_hour_of_day is not None:
            pulumi.set(__self__, "reference_hour_of_day", reference_hour_of_day)
        if reference_minute_of_hour is not None:
            pulumi.set(__self__, "reference_minute_of_hour", reference_minute_of_hour)
        if restore_window_days is not None:
            pulumi.set(__self__, "restore_window_days", restore_window_days)
        if update_snapshots is not None:
            pulumi.set(__self__, "update_snapshots", update_snapshots)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the Atlas cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="nextSnapshot")
    def next_snapshot(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
        """
        return pulumi.get(self, "next_snapshot")

    @next_snapshot.setter
    def next_snapshot(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_snapshot", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderSnapshotBackupPolicyPolicyArgs']]]]:
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderSnapshotBackupPolicyPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

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
    @pulumi.getter(name="referenceHourOfDay")
    def reference_hour_of_day(self) -> Optional[pulumi.Input[int]]:
        """
        UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        """
        return pulumi.get(self, "reference_hour_of_day")

    @reference_hour_of_day.setter
    def reference_hour_of_day(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "reference_hour_of_day", value)

    @property
    @pulumi.getter(name="referenceMinuteOfHour")
    def reference_minute_of_hour(self) -> Optional[pulumi.Input[int]]:
        """
        UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        """
        return pulumi.get(self, "reference_minute_of_hour")

    @reference_minute_of_hour.setter
    def reference_minute_of_hour(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "reference_minute_of_hour", value)

    @property
    @pulumi.getter(name="restoreWindowDays")
    def restore_window_days(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        """
        return pulumi.get(self, "restore_window_days")

    @restore_window_days.setter
    def restore_window_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "restore_window_days", value)

    @property
    @pulumi.getter(name="updateSnapshots")
    def update_snapshots(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        return pulumi.get(self, "update_snapshots")

    @update_snapshots.setter
    def update_snapshots(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "update_snapshots", value)


class CloudProviderSnapshotBackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderSnapshotBackupPolicyPolicyArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 reference_hour_of_day: Optional[pulumi.Input[int]] = None,
                 reference_minute_of_hour: Optional[pulumi.Input[int]] = None,
                 restore_window_days: Optional[pulumi.Input[int]] = None,
                 update_snapshots: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Import

        Cloud Backup Snapshot Policy entries can be imported using project project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy test 5d0f1f73cf09a29120e173cf-MyClusterTest
        ```

         For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] reference_hour_of_day: UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        :param pulumi.Input[int] reference_minute_of_hour: UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        :param pulumi.Input[int] restore_window_days: Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        :param pulumi.Input[bool] update_snapshots: Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudProviderSnapshotBackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Cloud Backup Snapshot Policy entries can be imported using project project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy test 5d0f1f73cf09a29120e173cf-MyClusterTest
        ```

         For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)

        :param str resource_name: The name of the resource.
        :param CloudProviderSnapshotBackupPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudProviderSnapshotBackupPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderSnapshotBackupPolicyPolicyArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 reference_hour_of_day: Optional[pulumi.Input[int]] = None,
                 reference_minute_of_hour: Optional[pulumi.Input[int]] = None,
                 restore_window_days: Optional[pulumi.Input[int]] = None,
                 update_snapshots: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CloudProviderSnapshotBackupPolicyArgs.__new__(CloudProviderSnapshotBackupPolicyArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            if policies is None and not opts.urn:
                raise TypeError("Missing required property 'policies'")
            __props__.__dict__["policies"] = policies
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["reference_hour_of_day"] = reference_hour_of_day
            __props__.__dict__["reference_minute_of_hour"] = reference_minute_of_hour
            __props__.__dict__["restore_window_days"] = restore_window_days
            __props__.__dict__["update_snapshots"] = update_snapshots
            __props__.__dict__["cluster_id"] = None
            __props__.__dict__["next_snapshot"] = None
        super(CloudProviderSnapshotBackupPolicy, __self__).__init__(
            'mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            next_snapshot: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderSnapshotBackupPolicyPolicyArgs']]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            reference_hour_of_day: Optional[pulumi.Input[int]] = None,
            reference_minute_of_hour: Optional[pulumi.Input[int]] = None,
            restore_window_days: Optional[pulumi.Input[int]] = None,
            update_snapshots: Optional[pulumi.Input[bool]] = None) -> 'CloudProviderSnapshotBackupPolicy':
        """
        Get an existing CloudProviderSnapshotBackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: Unique identifier of the Atlas cluster.
        :param pulumi.Input[str] cluster_name: The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        :param pulumi.Input[str] next_snapshot: Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Atlas cluster.
        :param pulumi.Input[int] reference_hour_of_day: UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        :param pulumi.Input[int] reference_minute_of_hour: UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        :param pulumi.Input[int] restore_window_days: Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        :param pulumi.Input[bool] update_snapshots: Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudProviderSnapshotBackupPolicyState.__new__(_CloudProviderSnapshotBackupPolicyState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["next_snapshot"] = next_snapshot
        __props__.__dict__["policies"] = policies
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["reference_hour_of_day"] = reference_hour_of_day
        __props__.__dict__["reference_minute_of_hour"] = reference_minute_of_hour
        __props__.__dict__["restore_window_days"] = restore_window_days
        __props__.__dict__["update_snapshots"] = update_snapshots
        return CloudProviderSnapshotBackupPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the Atlas cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="nextSnapshot")
    def next_snapshot(self) -> pulumi.Output[str]:
        """
        Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
        """
        return pulumi.get(self, "next_snapshot")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Sequence['outputs.CloudProviderSnapshotBackupPolicyPolicy']]:
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique identifier of the project for the Atlas cluster.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="referenceHourOfDay")
    def reference_hour_of_day(self) -> pulumi.Output[int]:
        """
        UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
        """
        return pulumi.get(self, "reference_hour_of_day")

    @property
    @pulumi.getter(name="referenceMinuteOfHour")
    def reference_minute_of_hour(self) -> pulumi.Output[int]:
        """
        UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
        """
        return pulumi.get(self, "reference_minute_of_hour")

    @property
    @pulumi.getter(name="restoreWindowDays")
    def restore_window_days(self) -> pulumi.Output[int]:
        """
        Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
        """
        return pulumi.get(self, "restore_window_days")

    @property
    @pulumi.getter(name="updateSnapshots")
    def update_snapshots(self) -> pulumi.Output[bool]:
        """
        Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
        """
        return pulumi.get(self, "update_snapshots")

