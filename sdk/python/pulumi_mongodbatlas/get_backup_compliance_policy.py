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
    'GetBackupCompliancePolicyResult',
    'AwaitableGetBackupCompliancePolicyResult',
    'get_backup_compliance_policy',
    'get_backup_compliance_policy_output',
]

@pulumi.output_type
class GetBackupCompliancePolicyResult:
    """
    A collection of values returned by getBackupCompliancePolicy.
    """
    def __init__(__self__, authorized_email=None, authorized_user_first_name=None, authorized_user_last_name=None, copy_protection_enabled=None, encryption_at_rest_enabled=None, id=None, on_demand_policy_item=None, pit_enabled=None, policy_item_daily=None, policy_item_hourly=None, policy_item_monthlies=None, policy_item_weeklies=None, policy_item_yearlies=None, project_id=None, restore_window_days=None, state=None, updated_date=None, updated_user=None):
        if authorized_email and not isinstance(authorized_email, str):
            raise TypeError("Expected argument 'authorized_email' to be a str")
        pulumi.set(__self__, "authorized_email", authorized_email)
        if authorized_user_first_name and not isinstance(authorized_user_first_name, str):
            raise TypeError("Expected argument 'authorized_user_first_name' to be a str")
        pulumi.set(__self__, "authorized_user_first_name", authorized_user_first_name)
        if authorized_user_last_name and not isinstance(authorized_user_last_name, str):
            raise TypeError("Expected argument 'authorized_user_last_name' to be a str")
        pulumi.set(__self__, "authorized_user_last_name", authorized_user_last_name)
        if copy_protection_enabled and not isinstance(copy_protection_enabled, bool):
            raise TypeError("Expected argument 'copy_protection_enabled' to be a bool")
        pulumi.set(__self__, "copy_protection_enabled", copy_protection_enabled)
        if encryption_at_rest_enabled and not isinstance(encryption_at_rest_enabled, bool):
            raise TypeError("Expected argument 'encryption_at_rest_enabled' to be a bool")
        pulumi.set(__self__, "encryption_at_rest_enabled", encryption_at_rest_enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if on_demand_policy_item and not isinstance(on_demand_policy_item, dict):
            raise TypeError("Expected argument 'on_demand_policy_item' to be a dict")
        pulumi.set(__self__, "on_demand_policy_item", on_demand_policy_item)
        if pit_enabled and not isinstance(pit_enabled, bool):
            raise TypeError("Expected argument 'pit_enabled' to be a bool")
        pulumi.set(__self__, "pit_enabled", pit_enabled)
        if policy_item_daily and not isinstance(policy_item_daily, dict):
            raise TypeError("Expected argument 'policy_item_daily' to be a dict")
        pulumi.set(__self__, "policy_item_daily", policy_item_daily)
        if policy_item_hourly and not isinstance(policy_item_hourly, dict):
            raise TypeError("Expected argument 'policy_item_hourly' to be a dict")
        pulumi.set(__self__, "policy_item_hourly", policy_item_hourly)
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
        if restore_window_days and not isinstance(restore_window_days, int):
            raise TypeError("Expected argument 'restore_window_days' to be a int")
        pulumi.set(__self__, "restore_window_days", restore_window_days)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if updated_date and not isinstance(updated_date, str):
            raise TypeError("Expected argument 'updated_date' to be a str")
        pulumi.set(__self__, "updated_date", updated_date)
        if updated_user and not isinstance(updated_user, str):
            raise TypeError("Expected argument 'updated_user' to be a str")
        pulumi.set(__self__, "updated_user", updated_user)

    @property
    @pulumi.getter(name="authorizedEmail")
    def authorized_email(self) -> str:
        """
        Email address of the user who is authorized to update the Backup Compliance Policy settings.
        """
        return pulumi.get(self, "authorized_email")

    @property
    @pulumi.getter(name="authorizedUserFirstName")
    def authorized_user_first_name(self) -> str:
        """
        First name of the user who authorized to update the Backup Compliance Policy settings.
        """
        return pulumi.get(self, "authorized_user_first_name")

    @property
    @pulumi.getter(name="authorizedUserLastName")
    def authorized_user_last_name(self) -> str:
        """
        Last name of the user who authorized to update the Backup Compliance Policy settings.
        """
        return pulumi.get(self, "authorized_user_last_name")

    @property
    @pulumi.getter(name="copyProtectionEnabled")
    def copy_protection_enabled(self) -> bool:
        """
        Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
        """
        return pulumi.get(self, "copy_protection_enabled")

    @property
    @pulumi.getter(name="encryptionAtRestEnabled")
    def encryption_at_rest_enabled(self) -> bool:
        """
        Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
        """
        return pulumi.get(self, "encryption_at_rest_enabled")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="onDemandPolicyItem")
    def on_demand_policy_item(self) -> 'outputs.GetBackupCompliancePolicyOnDemandPolicyItemResult':
        """
        Specifications for on-demand policy.
        """
        return pulumi.get(self, "on_demand_policy_item")

    @property
    @pulumi.getter(name="pitEnabled")
    def pit_enabled(self) -> bool:
        """
        Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
        """
        return pulumi.get(self, "pit_enabled")

    @property
    @pulumi.getter(name="policyItemDaily")
    def policy_item_daily(self) -> 'outputs.GetBackupCompliancePolicyPolicyItemDailyResult':
        """
        Scheduled policy using a daily frequency type, see block fields.
        """
        return pulumi.get(self, "policy_item_daily")

    @property
    @pulumi.getter(name="policyItemHourly")
    def policy_item_hourly(self) -> 'outputs.GetBackupCompliancePolicyPolicyItemHourlyResult':
        """
        Scheduled policy using an hourly frequency type, see block fields.
        """
        return pulumi.get(self, "policy_item_hourly")

    @property
    @pulumi.getter(name="policyItemMonthlies")
    def policy_item_monthlies(self) -> Sequence['outputs.GetBackupCompliancePolicyPolicyItemMonthlyResult']:
        """
        Scheduled policy using a monthly frequency type, see block fields.
        """
        return pulumi.get(self, "policy_item_monthlies")

    @property
    @pulumi.getter(name="policyItemWeeklies")
    def policy_item_weeklies(self) -> Sequence['outputs.GetBackupCompliancePolicyPolicyItemWeeklyResult']:
        """
        Scheduled policy using a weekly frequency type, see block fields.
        """
        return pulumi.get(self, "policy_item_weeklies")

    @property
    @pulumi.getter(name="policyItemYearlies")
    def policy_item_yearlies(self) -> Sequence['outputs.GetBackupCompliancePolicyPolicyItemYearlyResult']:
        """
        Scheduled policy using a yearly frequency type, see block fields.
        """
        return pulumi.get(self, "policy_item_yearlies")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="restoreWindowDays")
    def restore_window_days(self) -> int:
        """
        Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
        """
        return pulumi.get(self, "restore_window_days")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="updatedDate")
    def updated_date(self) -> str:
        """
        ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
        """
        return pulumi.get(self, "updated_date")

    @property
    @pulumi.getter(name="updatedUser")
    def updated_user(self) -> str:
        """
        Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
        """
        return pulumi.get(self, "updated_user")


class AwaitableGetBackupCompliancePolicyResult(GetBackupCompliancePolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBackupCompliancePolicyResult(
            authorized_email=self.authorized_email,
            authorized_user_first_name=self.authorized_user_first_name,
            authorized_user_last_name=self.authorized_user_last_name,
            copy_protection_enabled=self.copy_protection_enabled,
            encryption_at_rest_enabled=self.encryption_at_rest_enabled,
            id=self.id,
            on_demand_policy_item=self.on_demand_policy_item,
            pit_enabled=self.pit_enabled,
            policy_item_daily=self.policy_item_daily,
            policy_item_hourly=self.policy_item_hourly,
            policy_item_monthlies=self.policy_item_monthlies,
            policy_item_weeklies=self.policy_item_weeklies,
            policy_item_yearlies=self.policy_item_yearlies,
            project_id=self.project_id,
            restore_window_days=self.restore_window_days,
            state=self.state,
            updated_date=self.updated_date,
            updated_user=self.updated_user)


def get_backup_compliance_policy(project_id: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBackupCompliancePolicyResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    my_cluster = mongodbatlas.AdvancedCluster("my_cluster",
        project_id="<PROJECT-ID>",
        name="clusterTest",
        cluster_type="REPLICASET",
        backup_enabled=True,
        replication_specs=[{
            "region_configs": [{
                "priority": 7,
                "provider_name": "AWS",
                "region_name": "EU_CENTRAL_1",
                "electable_specs": {
                    "instance_size": "M10",
                    "node_count": 3,
                },
            }],
        }])
    test_cloud_backup_schedule = mongodbatlas.CloudBackupSchedule("test",
        project_id=my_cluster.project_id,
        cluster_name=my_cluster.name,
        reference_hour_of_day=3,
        reference_minute_of_hour=45,
        restore_window_days=4,
        policy_item_hourly={
            "frequency_interval": 1,
            "retention_unit": "days",
            "retention_value": 1,
        },
        policy_item_daily={
            "frequency_interval": 1,
            "retention_unit": "days",
            "retention_value": 2,
        },
        policy_item_weeklies=[{
            "frequency_interval": 4,
            "retention_unit": "weeks",
            "retention_value": 3,
        }],
        policy_item_monthlies=[{
            "frequency_interval": 5,
            "retention_unit": "months",
            "retention_value": 4,
        }],
        policy_item_yearlies=[{
            "frequency_interval": 1,
            "retention_unit": "years",
            "retention_value": 1,
        }])
    test = mongodbatlas.get_cloud_backup_schedule_output(project_id=test_cloud_backup_schedule.project_id,
        cluster_name=test_cloud_backup_schedule.cluster_name)
    backup_policy = mongodbatlas.get_backup_compliance_policy_output(project_id=test_cloud_backup_schedule.id)
    backup_policy_backup_compliance_policy = mongodbatlas.BackupCompliancePolicy("backup_policy",
        project_id="<PROJECT-ID>",
        authorized_email="user@email.com",
        authorized_user_first_name="First",
        authorized_user_last_name="Last",
        copy_protection_enabled=False,
        pit_enabled=False,
        encryption_at_rest_enabled=False,
        restore_window_days=7,
        on_demand_policy_item={
            "frequency_interval": 0,
            "retention_unit": "days",
            "retention_value": 3,
        },
        policy_item_hourly={
            "frequency_interval": 6,
            "retention_unit": "days",
            "retention_value": 7,
        },
        policy_item_daily={
            "frequency_interval": 0,
            "retention_unit": "days",
            "retention_value": 7,
        },
        policy_item_weeklies=[{
            "frequency_interval": 0,
            "retention_unit": "weeks",
            "retention_value": 4,
        }],
        policy_item_monthlies=[{
            "frequency_interval": 0,
            "retention_unit": "months",
            "retention_value": 12,
        }],
        policy_item_yearlies=[{
            "frequency_interval": 1,
            "retention_unit": "years",
            "retention_value": 1,
        }])
    ```


    :param str project_id: Unique 24-hexadecimal digit string that identifies your project
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy', __args__, opts=opts, typ=GetBackupCompliancePolicyResult).value

    return AwaitableGetBackupCompliancePolicyResult(
        authorized_email=pulumi.get(__ret__, 'authorized_email'),
        authorized_user_first_name=pulumi.get(__ret__, 'authorized_user_first_name'),
        authorized_user_last_name=pulumi.get(__ret__, 'authorized_user_last_name'),
        copy_protection_enabled=pulumi.get(__ret__, 'copy_protection_enabled'),
        encryption_at_rest_enabled=pulumi.get(__ret__, 'encryption_at_rest_enabled'),
        id=pulumi.get(__ret__, 'id'),
        on_demand_policy_item=pulumi.get(__ret__, 'on_demand_policy_item'),
        pit_enabled=pulumi.get(__ret__, 'pit_enabled'),
        policy_item_daily=pulumi.get(__ret__, 'policy_item_daily'),
        policy_item_hourly=pulumi.get(__ret__, 'policy_item_hourly'),
        policy_item_monthlies=pulumi.get(__ret__, 'policy_item_monthlies'),
        policy_item_weeklies=pulumi.get(__ret__, 'policy_item_weeklies'),
        policy_item_yearlies=pulumi.get(__ret__, 'policy_item_yearlies'),
        project_id=pulumi.get(__ret__, 'project_id'),
        restore_window_days=pulumi.get(__ret__, 'restore_window_days'),
        state=pulumi.get(__ret__, 'state'),
        updated_date=pulumi.get(__ret__, 'updated_date'),
        updated_user=pulumi.get(__ret__, 'updated_user'))
def get_backup_compliance_policy_output(project_id: Optional[pulumi.Input[str]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBackupCompliancePolicyResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    my_cluster = mongodbatlas.AdvancedCluster("my_cluster",
        project_id="<PROJECT-ID>",
        name="clusterTest",
        cluster_type="REPLICASET",
        backup_enabled=True,
        replication_specs=[{
            "region_configs": [{
                "priority": 7,
                "provider_name": "AWS",
                "region_name": "EU_CENTRAL_1",
                "electable_specs": {
                    "instance_size": "M10",
                    "node_count": 3,
                },
            }],
        }])
    test_cloud_backup_schedule = mongodbatlas.CloudBackupSchedule("test",
        project_id=my_cluster.project_id,
        cluster_name=my_cluster.name,
        reference_hour_of_day=3,
        reference_minute_of_hour=45,
        restore_window_days=4,
        policy_item_hourly={
            "frequency_interval": 1,
            "retention_unit": "days",
            "retention_value": 1,
        },
        policy_item_daily={
            "frequency_interval": 1,
            "retention_unit": "days",
            "retention_value": 2,
        },
        policy_item_weeklies=[{
            "frequency_interval": 4,
            "retention_unit": "weeks",
            "retention_value": 3,
        }],
        policy_item_monthlies=[{
            "frequency_interval": 5,
            "retention_unit": "months",
            "retention_value": 4,
        }],
        policy_item_yearlies=[{
            "frequency_interval": 1,
            "retention_unit": "years",
            "retention_value": 1,
        }])
    test = mongodbatlas.get_cloud_backup_schedule_output(project_id=test_cloud_backup_schedule.project_id,
        cluster_name=test_cloud_backup_schedule.cluster_name)
    backup_policy = mongodbatlas.get_backup_compliance_policy_output(project_id=test_cloud_backup_schedule.id)
    backup_policy_backup_compliance_policy = mongodbatlas.BackupCompliancePolicy("backup_policy",
        project_id="<PROJECT-ID>",
        authorized_email="user@email.com",
        authorized_user_first_name="First",
        authorized_user_last_name="Last",
        copy_protection_enabled=False,
        pit_enabled=False,
        encryption_at_rest_enabled=False,
        restore_window_days=7,
        on_demand_policy_item={
            "frequency_interval": 0,
            "retention_unit": "days",
            "retention_value": 3,
        },
        policy_item_hourly={
            "frequency_interval": 6,
            "retention_unit": "days",
            "retention_value": 7,
        },
        policy_item_daily={
            "frequency_interval": 0,
            "retention_unit": "days",
            "retention_value": 7,
        },
        policy_item_weeklies=[{
            "frequency_interval": 0,
            "retention_unit": "weeks",
            "retention_value": 4,
        }],
        policy_item_monthlies=[{
            "frequency_interval": 0,
            "retention_unit": "months",
            "retention_value": 12,
        }],
        policy_item_yearlies=[{
            "frequency_interval": 1,
            "retention_unit": "years",
            "retention_value": 1,
        }])
    ```


    :param str project_id: Unique 24-hexadecimal digit string that identifies your project
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy', __args__, opts=opts, typ=GetBackupCompliancePolicyResult)
    return __ret__.apply(lambda __response__: GetBackupCompliancePolicyResult(
        authorized_email=pulumi.get(__response__, 'authorized_email'),
        authorized_user_first_name=pulumi.get(__response__, 'authorized_user_first_name'),
        authorized_user_last_name=pulumi.get(__response__, 'authorized_user_last_name'),
        copy_protection_enabled=pulumi.get(__response__, 'copy_protection_enabled'),
        encryption_at_rest_enabled=pulumi.get(__response__, 'encryption_at_rest_enabled'),
        id=pulumi.get(__response__, 'id'),
        on_demand_policy_item=pulumi.get(__response__, 'on_demand_policy_item'),
        pit_enabled=pulumi.get(__response__, 'pit_enabled'),
        policy_item_daily=pulumi.get(__response__, 'policy_item_daily'),
        policy_item_hourly=pulumi.get(__response__, 'policy_item_hourly'),
        policy_item_monthlies=pulumi.get(__response__, 'policy_item_monthlies'),
        policy_item_weeklies=pulumi.get(__response__, 'policy_item_weeklies'),
        policy_item_yearlies=pulumi.get(__response__, 'policy_item_yearlies'),
        project_id=pulumi.get(__response__, 'project_id'),
        restore_window_days=pulumi.get(__response__, 'restore_window_days'),
        state=pulumi.get(__response__, 'state'),
        updated_date=pulumi.get(__response__, 'updated_date'),
        updated_user=pulumi.get(__response__, 'updated_user')))
