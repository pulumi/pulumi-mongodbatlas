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
    'GetCloudBackupScheduleResult',
    'AwaitableGetCloudBackupScheduleResult',
    'get_cloud_backup_schedule',
    'get_cloud_backup_schedule_output',
]

@pulumi.output_type
class GetCloudBackupScheduleResult:
    """
    A collection of values returned by getCloudBackupSchedule.
    """
    def __init__(__self__, auto_export_enabled=None, cluster_id=None, cluster_name=None, copy_settings=None, exports=None, id=None, id_policy=None, next_snapshot=None, policy_item_dailies=None, policy_item_hourlies=None, policy_item_monthlies=None, policy_item_weeklies=None, policy_item_yearlies=None, project_id=None, reference_hour_of_day=None, reference_minute_of_hour=None, restore_window_days=None, use_org_and_group_names_in_export_prefix=None, use_zone_id_for_copy_settings=None):
        if auto_export_enabled and not isinstance(auto_export_enabled, bool):
            raise TypeError("Expected argument 'auto_export_enabled' to be a bool")
        pulumi.set(__self__, "auto_export_enabled", auto_export_enabled)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if copy_settings and not isinstance(copy_settings, list):
            raise TypeError("Expected argument 'copy_settings' to be a list")
        pulumi.set(__self__, "copy_settings", copy_settings)
        if exports and not isinstance(exports, list):
            raise TypeError("Expected argument 'exports' to be a list")
        pulumi.set(__self__, "exports", exports)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if id_policy and not isinstance(id_policy, str):
            raise TypeError("Expected argument 'id_policy' to be a str")
        pulumi.set(__self__, "id_policy", id_policy)
        if next_snapshot and not isinstance(next_snapshot, str):
            raise TypeError("Expected argument 'next_snapshot' to be a str")
        pulumi.set(__self__, "next_snapshot", next_snapshot)
        if policy_item_dailies and not isinstance(policy_item_dailies, list):
            raise TypeError("Expected argument 'policy_item_dailies' to be a list")
        pulumi.set(__self__, "policy_item_dailies", policy_item_dailies)
        if policy_item_hourlies and not isinstance(policy_item_hourlies, list):
            raise TypeError("Expected argument 'policy_item_hourlies' to be a list")
        pulumi.set(__self__, "policy_item_hourlies", policy_item_hourlies)
        if policy_item_monthlies and not isinstance(policy_item_monthlies, list):
            raise TypeError("Expected argument 'policy_item_monthlies' to be a list")
        pulumi.set(__self__, "policy_item_monthlies", policy_item_monthlies)
        if policy_item_weeklies and not isinstance(policy_item_weeklies, list):
            raise TypeError("Expected argument 'policy_item_weeklies' to be a list")
        pulumi.set(__self__, "policy_item_weeklies", policy_item_weeklies)
        if policy_item_yearlies and not isinstance(policy_item_yearlies, list):
            raise TypeError("Expected argument 'policy_item_yearlies' to be a list")
        pulumi.set(__self__, "policy_item_yearlies", policy_item_yearlies)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if reference_hour_of_day and not isinstance(reference_hour_of_day, int):
            raise TypeError("Expected argument 'reference_hour_of_day' to be a int")
        pulumi.set(__self__, "reference_hour_of_day", reference_hour_of_day)
        if reference_minute_of_hour and not isinstance(reference_minute_of_hour, int):
            raise TypeError("Expected argument 'reference_minute_of_hour' to be a int")
        pulumi.set(__self__, "reference_minute_of_hour", reference_minute_of_hour)
        if restore_window_days and not isinstance(restore_window_days, int):
            raise TypeError("Expected argument 'restore_window_days' to be a int")
        pulumi.set(__self__, "restore_window_days", restore_window_days)
        if use_org_and_group_names_in_export_prefix and not isinstance(use_org_and_group_names_in_export_prefix, bool):
            raise TypeError("Expected argument 'use_org_and_group_names_in_export_prefix' to be a bool")
        pulumi.set(__self__, "use_org_and_group_names_in_export_prefix", use_org_and_group_names_in_export_prefix)
        if use_zone_id_for_copy_settings and not isinstance(use_zone_id_for_copy_settings, bool):
            raise TypeError("Expected argument 'use_zone_id_for_copy_settings' to be a bool")
        pulumi.set(__self__, "use_zone_id_for_copy_settings", use_zone_id_for_copy_settings)

    @property
    @pulumi.getter(name="autoExportEnabled")
    def auto_export_enabled(self) -> bool:
        """
        Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
        * true - enables automatic export of cloud backup snapshots to the AWS bucket
        * false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
        """
        return pulumi.get(self, "auto_export_enabled")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        Unique identifier of the Atlas cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="copySettings")
    def copy_settings(self) -> Sequence['outputs.GetCloudBackupScheduleCopySettingResult']:
        """
        List that contains a document for each copy setting item in the desired backup policy. See below
        """
        return pulumi.get(self, "copy_settings")

    @property
    @pulumi.getter
    def exports(self) -> Sequence['outputs.GetCloudBackupScheduleExportResult']:
        """
        Policy for automatically exporting Cloud Backup Snapshots. See below
        """
        return pulumi.get(self, "exports")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="idPolicy")
    def id_policy(self) -> str:
        """
        Unique identifier of the backup policy.
        """
        return pulumi.get(self, "id_policy")

    @property
    @pulumi.getter(name="nextSnapshot")
    def next_snapshot(self) -> str:
        """
        UTC ISO 8601 formatted point in time when Atlas will take the next snapshot.
        """
        return pulumi.get(self, "next_snapshot")

    @property
    @pulumi.getter(name="policyItemDailies")
    def policy_item_dailies(self) -> Sequence['outputs.GetCloudBackupSchedulePolicyItemDailyResult']:
        """
        (Optional) Daily policy item. See below
        """
        return pulumi.get(self, "policy_item_dailies")

    @property
    @pulumi.getter(name="policyItemHourlies")
    def policy_item_hourlies(self) -> Sequence['outputs.GetCloudBackupSchedulePolicyItemHourlyResult']:
        """
        (Optional) Hourly policy item. See below
        """
        return pulumi.get(self, "policy_item_hourlies")

    @property
    @pulumi.getter(name="policyItemMonthlies")
    def policy_item_monthlies(self) -> Sequence['outputs.GetCloudBackupSchedulePolicyItemMonthlyResult']:
        """
        (Optional) Monthly policy item. See below
        """
        return pulumi.get(self, "policy_item_monthlies")

    @property
    @pulumi.getter(name="policyItemWeeklies")
    def policy_item_weeklies(self) -> Sequence['outputs.GetCloudBackupSchedulePolicyItemWeeklyResult']:
        """
        (Optional) Weekly policy item. See below
        """
        return pulumi.get(self, "policy_item_weeklies")

    @property
    @pulumi.getter(name="policyItemYearlies")
    def policy_item_yearlies(self) -> Sequence['outputs.GetCloudBackupSchedulePolicyItemYearlyResult']:
        """
        (Optional) Yearly policy item. See below
        """
        return pulumi.get(self, "policy_item_yearlies")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="referenceHourOfDay")
    def reference_hour_of_day(self) -> int:
        """
        UTC Hour of day between 0 and 23 representing which hour of the day that Atlas takes a snapshot.
        """
        return pulumi.get(self, "reference_hour_of_day")

    @property
    @pulumi.getter(name="referenceMinuteOfHour")
    def reference_minute_of_hour(self) -> int:
        """
        UTC Minute of day between 0 and 59 representing which minute of the `reference_hour_of_day` that Atlas takes the snapshot.
        """
        return pulumi.get(self, "reference_minute_of_hour")

    @property
    @pulumi.getter(name="restoreWindowDays")
    def restore_window_days(self) -> int:
        """
        Specifies a restore window in days for cloud backup to maintain.
        """
        return pulumi.get(self, "restore_window_days")

    @property
    @pulumi.getter(name="useOrgAndGroupNamesInExportPrefix")
    def use_org_and_group_names_in_export_prefix(self) -> bool:
        """
        Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
        """
        return pulumi.get(self, "use_org_and_group_names_in_export_prefix")

    @property
    @pulumi.getter(name="useZoneIdForCopySettings")
    def use_zone_id_for_copy_settings(self) -> Optional[bool]:
        return pulumi.get(self, "use_zone_id_for_copy_settings")


class AwaitableGetCloudBackupScheduleResult(GetCloudBackupScheduleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudBackupScheduleResult(
            auto_export_enabled=self.auto_export_enabled,
            cluster_id=self.cluster_id,
            cluster_name=self.cluster_name,
            copy_settings=self.copy_settings,
            exports=self.exports,
            id=self.id,
            id_policy=self.id_policy,
            next_snapshot=self.next_snapshot,
            policy_item_dailies=self.policy_item_dailies,
            policy_item_hourlies=self.policy_item_hourlies,
            policy_item_monthlies=self.policy_item_monthlies,
            policy_item_weeklies=self.policy_item_weeklies,
            policy_item_yearlies=self.policy_item_yearlies,
            project_id=self.project_id,
            reference_hour_of_day=self.reference_hour_of_day,
            reference_minute_of_hour=self.reference_minute_of_hour,
            restore_window_days=self.restore_window_days,
            use_org_and_group_names_in_export_prefix=self.use_org_and_group_names_in_export_prefix,
            use_zone_id_for_copy_settings=self.use_zone_id_for_copy_settings)


def get_cloud_backup_schedule(cluster_name: Optional[str] = None,
                              project_id: Optional[str] = None,
                              use_zone_id_for_copy_settings: Optional[bool] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudBackupScheduleResult:
    """
    ## # Data Source: CloudBackupSchedule

    `CloudBackupSchedule` provides a Cloud Backup Schedule datasource. An Atlas Cloud Backup Schedule provides the current cloud backup schedule for the cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str cluster_name: The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
    :param str project_id: The unique identifier of the project for the Atlas cluster.
    :param bool use_zone_id_for_copy_settings: Set this field to `true` to allow the data source to use the latest schema that populates `copy_settings.#.zone_id` instead of the deprecated `copy_settings.#.replication_spec_id`. These fields also enable you to reference cluster zones using independent shard scaling, which no longer supports `replication_spec.*.id`. To learn more, see the 1.18.0 upgrade guide.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    __args__['useZoneIdForCopySettings'] = use_zone_id_for_copy_settings
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudBackupSchedule:getCloudBackupSchedule', __args__, opts=opts, typ=GetCloudBackupScheduleResult).value

    return AwaitableGetCloudBackupScheduleResult(
        auto_export_enabled=pulumi.get(__ret__, 'auto_export_enabled'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        copy_settings=pulumi.get(__ret__, 'copy_settings'),
        exports=pulumi.get(__ret__, 'exports'),
        id=pulumi.get(__ret__, 'id'),
        id_policy=pulumi.get(__ret__, 'id_policy'),
        next_snapshot=pulumi.get(__ret__, 'next_snapshot'),
        policy_item_dailies=pulumi.get(__ret__, 'policy_item_dailies'),
        policy_item_hourlies=pulumi.get(__ret__, 'policy_item_hourlies'),
        policy_item_monthlies=pulumi.get(__ret__, 'policy_item_monthlies'),
        policy_item_weeklies=pulumi.get(__ret__, 'policy_item_weeklies'),
        policy_item_yearlies=pulumi.get(__ret__, 'policy_item_yearlies'),
        project_id=pulumi.get(__ret__, 'project_id'),
        reference_hour_of_day=pulumi.get(__ret__, 'reference_hour_of_day'),
        reference_minute_of_hour=pulumi.get(__ret__, 'reference_minute_of_hour'),
        restore_window_days=pulumi.get(__ret__, 'restore_window_days'),
        use_org_and_group_names_in_export_prefix=pulumi.get(__ret__, 'use_org_and_group_names_in_export_prefix'),
        use_zone_id_for_copy_settings=pulumi.get(__ret__, 'use_zone_id_for_copy_settings'))
def get_cloud_backup_schedule_output(cluster_name: Optional[pulumi.Input[str]] = None,
                                     project_id: Optional[pulumi.Input[str]] = None,
                                     use_zone_id_for_copy_settings: Optional[pulumi.Input[Optional[bool]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCloudBackupScheduleResult]:
    """
    ## # Data Source: CloudBackupSchedule

    `CloudBackupSchedule` provides a Cloud Backup Schedule datasource. An Atlas Cloud Backup Schedule provides the current cloud backup schedule for the cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str cluster_name: The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
    :param str project_id: The unique identifier of the project for the Atlas cluster.
    :param bool use_zone_id_for_copy_settings: Set this field to `true` to allow the data source to use the latest schema that populates `copy_settings.#.zone_id` instead of the deprecated `copy_settings.#.replication_spec_id`. These fields also enable you to reference cluster zones using independent shard scaling, which no longer supports `replication_spec.*.id`. To learn more, see the 1.18.0 upgrade guide.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    __args__['useZoneIdForCopySettings'] = use_zone_id_for_copy_settings
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getCloudBackupSchedule:getCloudBackupSchedule', __args__, opts=opts, typ=GetCloudBackupScheduleResult)
    return __ret__.apply(lambda __response__: GetCloudBackupScheduleResult(
        auto_export_enabled=pulumi.get(__response__, 'auto_export_enabled'),
        cluster_id=pulumi.get(__response__, 'cluster_id'),
        cluster_name=pulumi.get(__response__, 'cluster_name'),
        copy_settings=pulumi.get(__response__, 'copy_settings'),
        exports=pulumi.get(__response__, 'exports'),
        id=pulumi.get(__response__, 'id'),
        id_policy=pulumi.get(__response__, 'id_policy'),
        next_snapshot=pulumi.get(__response__, 'next_snapshot'),
        policy_item_dailies=pulumi.get(__response__, 'policy_item_dailies'),
        policy_item_hourlies=pulumi.get(__response__, 'policy_item_hourlies'),
        policy_item_monthlies=pulumi.get(__response__, 'policy_item_monthlies'),
        policy_item_weeklies=pulumi.get(__response__, 'policy_item_weeklies'),
        policy_item_yearlies=pulumi.get(__response__, 'policy_item_yearlies'),
        project_id=pulumi.get(__response__, 'project_id'),
        reference_hour_of_day=pulumi.get(__response__, 'reference_hour_of_day'),
        reference_minute_of_hour=pulumi.get(__response__, 'reference_minute_of_hour'),
        restore_window_days=pulumi.get(__response__, 'restore_window_days'),
        use_org_and_group_names_in_export_prefix=pulumi.get(__response__, 'use_org_and_group_names_in_export_prefix'),
        use_zone_id_for_copy_settings=pulumi.get(__response__, 'use_zone_id_for_copy_settings')))
