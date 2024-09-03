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

__all__ = [
    'GetAlertConfigurationResult',
    'AwaitableGetAlertConfigurationResult',
    'get_alert_configuration',
    'get_alert_configuration_output',
]

@pulumi.output_type
class GetAlertConfigurationResult:
    """
    A collection of values returned by getAlertConfiguration.
    """
    def __init__(__self__, alert_configuration_id=None, created=None, enabled=None, event_type=None, id=None, matchers=None, metric_threshold_configs=None, notifications=None, outputs=None, project_id=None, threshold_configs=None, updated=None):
        if alert_configuration_id and not isinstance(alert_configuration_id, str):
            raise TypeError("Expected argument 'alert_configuration_id' to be a str")
        pulumi.set(__self__, "alert_configuration_id", alert_configuration_id)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if event_type and not isinstance(event_type, str):
            raise TypeError("Expected argument 'event_type' to be a str")
        pulumi.set(__self__, "event_type", event_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if matchers and not isinstance(matchers, list):
            raise TypeError("Expected argument 'matchers' to be a list")
        pulumi.set(__self__, "matchers", matchers)
        if metric_threshold_configs and not isinstance(metric_threshold_configs, list):
            raise TypeError("Expected argument 'metric_threshold_configs' to be a list")
        pulumi.set(__self__, "metric_threshold_configs", metric_threshold_configs)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if outputs and not isinstance(outputs, list):
            raise TypeError("Expected argument 'outputs' to be a list")
        pulumi.set(__self__, "outputs", outputs)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if threshold_configs and not isinstance(threshold_configs, list):
            raise TypeError("Expected argument 'threshold_configs' to be a list")
        pulumi.set(__self__, "threshold_configs", threshold_configs)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="alertConfigurationId")
    def alert_configuration_id(self) -> str:
        return pulumi.get(self, "alert_configuration_id")

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        If set to true, the alert configuration is enabled. If enabled is not exported it is set to false.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> str:
        """
        The type of event that will trigger an alert.
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def matchers(self) -> Sequence['outputs.GetAlertConfigurationMatcherResult']:
        """
        Rules to apply when matching an object against this alert configuration. See matchers.
        """
        return pulumi.get(self, "matchers")

    @property
    @pulumi.getter(name="metricThresholdConfigs")
    def metric_threshold_configs(self) -> Sequence['outputs.GetAlertConfigurationMetricThresholdConfigResult']:
        """
        The threshold that causes an alert to be triggered. Required if `event_type_name` : `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See metric threshold config.
        """
        return pulumi.get(self, "metric_threshold_configs")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetAlertConfigurationNotificationResult']:
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter
    def outputs(self) -> Optional[Sequence['outputs.GetAlertConfigurationOutputResult']]:
        return pulumi.get(self, "outputs")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="thresholdConfigs")
    def threshold_configs(self) -> Sequence['outputs.GetAlertConfigurationThresholdConfigResult']:
        """
        Threshold that triggers an alert. Required if `event_type_name` is any value other than `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See threshold config.
        """
        return pulumi.get(self, "threshold_configs")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetAlertConfigurationResult(GetAlertConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAlertConfigurationResult(
            alert_configuration_id=self.alert_configuration_id,
            created=self.created,
            enabled=self.enabled,
            event_type=self.event_type,
            id=self.id,
            matchers=self.matchers,
            metric_threshold_configs=self.metric_threshold_configs,
            notifications=self.notifications,
            outputs=self.outputs,
            project_id=self.project_id,
            threshold_configs=self.threshold_configs,
            updated=self.updated)


def get_alert_configuration(alert_configuration_id: Optional[str] = None,
                            outputs: Optional[Sequence[Union['GetAlertConfigurationOutputArgs', 'GetAlertConfigurationOutputArgsDict']]] = None,
                            project_id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAlertConfigurationResult:
    """
    # Data Source: AlertConfiguration

    `AlertConfiguration` describes an Alert Configuration.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_alert_configuration = mongodbatlas.AlertConfiguration("test",
        project_id="<PROJECT-ID>",
        event_type="OUTSIDE_METRIC_THRESHOLD",
        enabled=True,
        notifications=[{
            "type_name": "GROUP",
            "interval_min": 5,
            "delay_min": 0,
            "sms_enabled": False,
            "email_enabled": True,
        }],
        matchers=[{
            "field_name": "HOSTNAME_AND_PORT",
            "operator": "EQUALS",
            "value": "SECONDARY",
        }],
        metric_threshold_config={
            "metric_name": "ASSERT_REGULAR",
            "operator": "LESS_THAN",
            "threshold": 99,
            "units": "RAW",
            "mode": "AVERAGE",
        })
    test = mongodbatlas.get_alert_configuration_output(project_id=test_alert_configuration.project_id,
        alert_configuration_id=test_alert_configuration.alert_configuration_id)
    ```

    > **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: <https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/>

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_alert_configuration = mongodbatlas.AlertConfiguration("test",
        project_id="<PROJECT-ID>",
        event_type="REPLICATION_OPLOG_WINDOW_RUNNING_OUT",
        enabled=True,
        notifications=[{
            "type_name": "GROUP",
            "interval_min": 5,
            "delay_min": 0,
            "sms_enabled": False,
            "email_enabled": True,
            "roles": ["GROUP_CLUSTER_MANAGER"],
        }],
        matchers=[{
            "field_name": "HOSTNAME_AND_PORT",
            "operator": "EQUALS",
            "value": "SECONDARY",
        }],
        threshold_config={
            "operator": "LESS_THAN",
            "threshold": 1,
            "units": "HOURS",
        })
    test = mongodbatlas.get_alert_configuration_output(project_id=test_alert_configuration.project_id,
        alert_configuration_id=test_alert_configuration.alert_configuration_id)
    ```

    Utilize data_source to generate resource hcl and import statement. Useful if you have a specific alert_configuration_id and are looking to manage it as is in state. To import all alerts, refer to the documentation on data_source_mongodbatlas_alert_configurations
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_alert_configuration(project_id=project_id,
        alert_configuration_id=alert_configuration_id,
        outputs=[
            {
                "type": "resource_hcl",
                "label": "test",
            },
            {
                "type": "resource_import",
                "label": "test",
            },
        ])
    ```


    :param str alert_configuration_id: Unique identifier for the alert configuration.
    :param Sequence[Union['GetAlertConfigurationOutputArgs', 'GetAlertConfigurationOutputArgsDict']] outputs: List of formatted output requested for this alert configuration
           * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
    :param str project_id: The ID of the project where the alert configuration will create.
    """
    __args__ = dict()
    __args__['alertConfigurationId'] = alert_configuration_id
    __args__['outputs'] = outputs
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getAlertConfiguration:getAlertConfiguration', __args__, opts=opts, typ=GetAlertConfigurationResult).value

    return AwaitableGetAlertConfigurationResult(
        alert_configuration_id=pulumi.get(__ret__, 'alert_configuration_id'),
        created=pulumi.get(__ret__, 'created'),
        enabled=pulumi.get(__ret__, 'enabled'),
        event_type=pulumi.get(__ret__, 'event_type'),
        id=pulumi.get(__ret__, 'id'),
        matchers=pulumi.get(__ret__, 'matchers'),
        metric_threshold_configs=pulumi.get(__ret__, 'metric_threshold_configs'),
        notifications=pulumi.get(__ret__, 'notifications'),
        outputs=pulumi.get(__ret__, 'outputs'),
        project_id=pulumi.get(__ret__, 'project_id'),
        threshold_configs=pulumi.get(__ret__, 'threshold_configs'),
        updated=pulumi.get(__ret__, 'updated'))


@_utilities.lift_output_func(get_alert_configuration)
def get_alert_configuration_output(alert_configuration_id: Optional[pulumi.Input[str]] = None,
                                   outputs: Optional[pulumi.Input[Optional[Sequence[Union['GetAlertConfigurationOutputArgs', 'GetAlertConfigurationOutputArgsDict']]]]] = None,
                                   project_id: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAlertConfigurationResult]:
    """
    # Data Source: AlertConfiguration

    `AlertConfiguration` describes an Alert Configuration.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_alert_configuration = mongodbatlas.AlertConfiguration("test",
        project_id="<PROJECT-ID>",
        event_type="OUTSIDE_METRIC_THRESHOLD",
        enabled=True,
        notifications=[{
            "type_name": "GROUP",
            "interval_min": 5,
            "delay_min": 0,
            "sms_enabled": False,
            "email_enabled": True,
        }],
        matchers=[{
            "field_name": "HOSTNAME_AND_PORT",
            "operator": "EQUALS",
            "value": "SECONDARY",
        }],
        metric_threshold_config={
            "metric_name": "ASSERT_REGULAR",
            "operator": "LESS_THAN",
            "threshold": 99,
            "units": "RAW",
            "mode": "AVERAGE",
        })
    test = mongodbatlas.get_alert_configuration_output(project_id=test_alert_configuration.project_id,
        alert_configuration_id=test_alert_configuration.alert_configuration_id)
    ```

    > **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: <https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/>

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_alert_configuration = mongodbatlas.AlertConfiguration("test",
        project_id="<PROJECT-ID>",
        event_type="REPLICATION_OPLOG_WINDOW_RUNNING_OUT",
        enabled=True,
        notifications=[{
            "type_name": "GROUP",
            "interval_min": 5,
            "delay_min": 0,
            "sms_enabled": False,
            "email_enabled": True,
            "roles": ["GROUP_CLUSTER_MANAGER"],
        }],
        matchers=[{
            "field_name": "HOSTNAME_AND_PORT",
            "operator": "EQUALS",
            "value": "SECONDARY",
        }],
        threshold_config={
            "operator": "LESS_THAN",
            "threshold": 1,
            "units": "HOURS",
        })
    test = mongodbatlas.get_alert_configuration_output(project_id=test_alert_configuration.project_id,
        alert_configuration_id=test_alert_configuration.alert_configuration_id)
    ```

    Utilize data_source to generate resource hcl and import statement. Useful if you have a specific alert_configuration_id and are looking to manage it as is in state. To import all alerts, refer to the documentation on data_source_mongodbatlas_alert_configurations
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_alert_configuration(project_id=project_id,
        alert_configuration_id=alert_configuration_id,
        outputs=[
            {
                "type": "resource_hcl",
                "label": "test",
            },
            {
                "type": "resource_import",
                "label": "test",
            },
        ])
    ```


    :param str alert_configuration_id: Unique identifier for the alert configuration.
    :param Sequence[Union['GetAlertConfigurationOutputArgs', 'GetAlertConfigurationOutputArgsDict']] outputs: List of formatted output requested for this alert configuration
           * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
    :param str project_id: The ID of the project where the alert configuration will create.
    """
    ...
