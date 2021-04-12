# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs

__all__ = [
    'GetAlertConfigurationResult',
    'AwaitableGetAlertConfigurationResult',
    'get_alert_configuration',
]

@pulumi.output_type
class GetAlertConfigurationResult:
    """
    A collection of values returned by getAlertConfiguration.
    """
    def __init__(__self__, alert_configuration_id=None, created=None, enabled=None, event_type=None, id=None, matchers=None, metric_threshold=None, notifications=None, project_id=None, threshold=None, updated=None):
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
        if metric_threshold and not isinstance(metric_threshold, dict):
            raise TypeError("Expected argument 'metric_threshold' to be a dict")
        pulumi.set(__self__, "metric_threshold", metric_threshold)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if threshold and not isinstance(threshold, dict):
            raise TypeError("Expected argument 'threshold' to be a dict")
        pulumi.set(__self__, "threshold", threshold)
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
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def matchers(self) -> Sequence['outputs.GetAlertConfigurationMatcherResult']:
        return pulumi.get(self, "matchers")

    @property
    @pulumi.getter(name="metricThreshold")
    def metric_threshold(self) -> 'outputs.GetAlertConfigurationMetricThresholdResult':
        return pulumi.get(self, "metric_threshold")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetAlertConfigurationNotificationResult']:
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def threshold(self) -> 'outputs.GetAlertConfigurationThresholdResult':
        """
        Threshold value outside of which an alert will be triggered.
        """
        return pulumi.get(self, "threshold")

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
            metric_threshold=self.metric_threshold,
            notifications=self.notifications,
            project_id=self.project_id,
            threshold=self.threshold,
            updated=self.updated)


def get_alert_configuration(alert_configuration_id: Optional[str] = None,
                            project_id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAlertConfigurationResult:
    """
    `AlertConfiguration` describes an Alert Configuration.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.


    :param str alert_configuration_id: Unique identifier for the alert configuration.
    :param str project_id: The ID of the project where the alert configuration will create.
    """
    __args__ = dict()
    __args__['alertConfigurationId'] = alert_configuration_id
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getAlertConfiguration:getAlertConfiguration', __args__, opts=opts, typ=GetAlertConfigurationResult).value

    return AwaitableGetAlertConfigurationResult(
        alert_configuration_id=__ret__.alert_configuration_id,
        created=__ret__.created,
        enabled=__ret__.enabled,
        event_type=__ret__.event_type,
        id=__ret__.id,
        matchers=__ret__.matchers,
        metric_threshold=__ret__.metric_threshold,
        notifications=__ret__.notifications,
        project_id=__ret__.project_id,
        threshold=__ret__.threshold,
        updated=__ret__.updated)
