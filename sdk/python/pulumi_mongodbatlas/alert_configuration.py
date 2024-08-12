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

__all__ = ['AlertConfigurationArgs', 'AlertConfiguration']

@pulumi.input_type
class AlertConfigurationArgs:
    def __init__(__self__, *,
                 event_type: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationMatcherArgs']]]] = None,
                 metric_threshold_config: Optional[pulumi.Input['AlertConfigurationMetricThresholdConfigArgs']] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationNotificationArgs']]]] = None,
                 threshold_config: Optional[pulumi.Input['AlertConfigurationThresholdConfigArgs']] = None):
        """
        The set of arguments for constructing a AlertConfiguration resource.
        :param pulumi.Input[str] event_type: The type of event that will trigger an alert.
               
               > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
               
               
               > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        :param pulumi.Input[str] project_id: The ID of the project where the alert configuration will create.
        :param pulumi.Input[bool] enabled: It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        """
        pulumi.set(__self__, "event_type", event_type)
        pulumi.set(__self__, "project_id", project_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if matchers is not None:
            pulumi.set(__self__, "matchers", matchers)
        if metric_threshold_config is not None:
            pulumi.set(__self__, "metric_threshold_config", metric_threshold_config)
        if notifications is not None:
            pulumi.set(__self__, "notifications", notifications)
        if threshold_config is not None:
            pulumi.set(__self__, "threshold_config", threshold_config)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Input[str]:
        """
        The type of event that will trigger an alert.

        > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.


        > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_type", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The ID of the project where the alert configuration will create.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def matchers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationMatcherArgs']]]]:
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationMatcherArgs']]]]):
        pulumi.set(self, "matchers", value)

    @property
    @pulumi.getter(name="metricThresholdConfig")
    def metric_threshold_config(self) -> Optional[pulumi.Input['AlertConfigurationMetricThresholdConfigArgs']]:
        return pulumi.get(self, "metric_threshold_config")

    @metric_threshold_config.setter
    def metric_threshold_config(self, value: Optional[pulumi.Input['AlertConfigurationMetricThresholdConfigArgs']]):
        pulumi.set(self, "metric_threshold_config", value)

    @property
    @pulumi.getter
    def notifications(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationNotificationArgs']]]]:
        return pulumi.get(self, "notifications")

    @notifications.setter
    def notifications(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationNotificationArgs']]]]):
        pulumi.set(self, "notifications", value)

    @property
    @pulumi.getter(name="thresholdConfig")
    def threshold_config(self) -> Optional[pulumi.Input['AlertConfigurationThresholdConfigArgs']]:
        return pulumi.get(self, "threshold_config")

    @threshold_config.setter
    def threshold_config(self, value: Optional[pulumi.Input['AlertConfigurationThresholdConfigArgs']]):
        pulumi.set(self, "threshold_config", value)


@pulumi.input_type
class _AlertConfigurationState:
    def __init__(__self__, *,
                 alert_configuration_id: Optional[pulumi.Input[str]] = None,
                 created: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationMatcherArgs']]]] = None,
                 metric_threshold_config: Optional[pulumi.Input['AlertConfigurationMetricThresholdConfigArgs']] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationNotificationArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 threshold_config: Optional[pulumi.Input['AlertConfigurationThresholdConfigArgs']] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertConfiguration resources.
        :param pulumi.Input[str] alert_configuration_id: Unique identifier for the alert configuration.
        :param pulumi.Input[str] created: Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
        :param pulumi.Input[bool] enabled: It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        :param pulumi.Input[str] event_type: The type of event that will trigger an alert.
               
               > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
               
               
               > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        :param pulumi.Input[str] project_id: The ID of the project where the alert configuration will create.
        :param pulumi.Input[str] updated: Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
        """
        if alert_configuration_id is not None:
            pulumi.set(__self__, "alert_configuration_id", alert_configuration_id)
        if created is not None:
            pulumi.set(__self__, "created", created)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if event_type is not None:
            pulumi.set(__self__, "event_type", event_type)
        if matchers is not None:
            pulumi.set(__self__, "matchers", matchers)
        if metric_threshold_config is not None:
            pulumi.set(__self__, "metric_threshold_config", metric_threshold_config)
        if notifications is not None:
            pulumi.set(__self__, "notifications", notifications)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if threshold_config is not None:
            pulumi.set(__self__, "threshold_config", threshold_config)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="alertConfigurationId")
    def alert_configuration_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the alert configuration.
        """
        return pulumi.get(self, "alert_configuration_id")

    @alert_configuration_id.setter
    def alert_configuration_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_configuration_id", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of event that will trigger an alert.

        > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.


        > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_type", value)

    @property
    @pulumi.getter
    def matchers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationMatcherArgs']]]]:
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationMatcherArgs']]]]):
        pulumi.set(self, "matchers", value)

    @property
    @pulumi.getter(name="metricThresholdConfig")
    def metric_threshold_config(self) -> Optional[pulumi.Input['AlertConfigurationMetricThresholdConfigArgs']]:
        return pulumi.get(self, "metric_threshold_config")

    @metric_threshold_config.setter
    def metric_threshold_config(self, value: Optional[pulumi.Input['AlertConfigurationMetricThresholdConfigArgs']]):
        pulumi.set(self, "metric_threshold_config", value)

    @property
    @pulumi.getter
    def notifications(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationNotificationArgs']]]]:
        return pulumi.get(self, "notifications")

    @notifications.setter
    def notifications(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConfigurationNotificationArgs']]]]):
        pulumi.set(self, "notifications", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project where the alert configuration will create.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="thresholdConfig")
    def threshold_config(self) -> Optional[pulumi.Input['AlertConfigurationThresholdConfigArgs']]:
        return pulumi.get(self, "threshold_config")

    @threshold_config.setter
    def threshold_config(self, value: Optional[pulumi.Input['AlertConfigurationThresholdConfigArgs']]):
        pulumi.set(self, "threshold_config", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class AlertConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AlertConfigurationMatcherArgs', 'AlertConfigurationMatcherArgsDict']]]]] = None,
                 metric_threshold_config: Optional[pulumi.Input[Union['AlertConfigurationMetricThresholdConfigArgs', 'AlertConfigurationMetricThresholdConfigArgsDict']]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AlertConfigurationNotificationArgs', 'AlertConfigurationNotificationArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 threshold_config: Optional[pulumi.Input[Union['AlertConfigurationThresholdConfigArgs', 'AlertConfigurationThresholdConfigArgsDict']]] = None,
                 __props__=None):
        """
        ## # Resource: AlertConfiguration

        `AlertConfiguration` provides an Alert Configuration resource to define the conditions that trigger an alert and the methods of notification within a MongoDB Atlas project.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AlertConfiguration("test",
            project_id="<PROJECT-ID>",
            event_type="OUTSIDE_METRIC_THRESHOLD",
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
            metric_threshold_config={
                "metric_name": "ASSERT_REGULAR",
                "operator": "LESS_THAN",
                "threshold": 99,
                "units": "RAW",
                "mode": "AVERAGE",
            })
        ```

        > **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AlertConfiguration("test",
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
                "field_name": "CLUSTER_NAME",
                "operator": "EQUALS",
                "value": "my-cluster",
            }],
            threshold_config={
                "operator": "LESS_THAN",
                "threshold": 1,
                "units": "HOURS",
            })
        ```

        ### Create an alert with two notifications using Email and SMS

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AlertConfiguration("test",
            project_id="PROJECT ID",
            event_type="OUTSIDE_METRIC_THRESHOLD",
            enabled=True,
            notifications=[
                {
                    "type_name": "GROUP",
                    "interval_min": 5,
                    "delay_min": 0,
                    "sms_enabled": False,
                    "email_enabled": True,
                    "roles": [
                        "GROUP_DATA_ACCESS_READ_ONLY",
                        "GROUP_CLUSTER_MANAGER",
                        "GROUP_DATA_ACCESS_ADMIN",
                    ],
                },
                {
                    "type_name": "ORG",
                    "interval_min": 5,
                    "delay_min": 0,
                    "sms_enabled": True,
                    "email_enabled": False,
                },
            ],
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
        ```

        ### Create third party notification using credentials from existing third party integration

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.get_third_party_integration(project_id="PROJECT ID",
            type="PAGER_DUTY")
        test_alert_configuration = mongodbatlas.AlertConfiguration("test",
            project_id="PROJECT ID",
            enabled=True,
            event_type="USERS_WITHOUT_MULTI_FACTOR_AUTH",
            notifications=[{
                "type_name": "PAGER_DUTY",
                "integration_id": test.id,
            }])
        ```

        ## Import

        Alert Configuration can be imported using the `project_id-alert_configuration_id`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/alertConfiguration:AlertConfiguration test 5d0f1f74cf09a29120e123cd-5d0f1f74cf09a29120e1fscg
        ```

        **NOTE**: Third-party notifications will not contain their respective credentials as these are sensitive attributes. If you wish to perform updates on these notifications without providing the original credentials, the corresponding `notifier_id` attribute must be provided instead.

        For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/alert-configurations/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        :param pulumi.Input[str] event_type: The type of event that will trigger an alert.
               
               > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
               
               
               > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        :param pulumi.Input[str] project_id: The ID of the project where the alert configuration will create.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Resource: AlertConfiguration

        `AlertConfiguration` provides an Alert Configuration resource to define the conditions that trigger an alert and the methods of notification within a MongoDB Atlas project.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AlertConfiguration("test",
            project_id="<PROJECT-ID>",
            event_type="OUTSIDE_METRIC_THRESHOLD",
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
            metric_threshold_config={
                "metric_name": "ASSERT_REGULAR",
                "operator": "LESS_THAN",
                "threshold": 99,
                "units": "RAW",
                "mode": "AVERAGE",
            })
        ```

        > **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AlertConfiguration("test",
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
                "field_name": "CLUSTER_NAME",
                "operator": "EQUALS",
                "value": "my-cluster",
            }],
            threshold_config={
                "operator": "LESS_THAN",
                "threshold": 1,
                "units": "HOURS",
            })
        ```

        ### Create an alert with two notifications using Email and SMS

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AlertConfiguration("test",
            project_id="PROJECT ID",
            event_type="OUTSIDE_METRIC_THRESHOLD",
            enabled=True,
            notifications=[
                {
                    "type_name": "GROUP",
                    "interval_min": 5,
                    "delay_min": 0,
                    "sms_enabled": False,
                    "email_enabled": True,
                    "roles": [
                        "GROUP_DATA_ACCESS_READ_ONLY",
                        "GROUP_CLUSTER_MANAGER",
                        "GROUP_DATA_ACCESS_ADMIN",
                    ],
                },
                {
                    "type_name": "ORG",
                    "interval_min": 5,
                    "delay_min": 0,
                    "sms_enabled": True,
                    "email_enabled": False,
                },
            ],
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
        ```

        ### Create third party notification using credentials from existing third party integration

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.get_third_party_integration(project_id="PROJECT ID",
            type="PAGER_DUTY")
        test_alert_configuration = mongodbatlas.AlertConfiguration("test",
            project_id="PROJECT ID",
            enabled=True,
            event_type="USERS_WITHOUT_MULTI_FACTOR_AUTH",
            notifications=[{
                "type_name": "PAGER_DUTY",
                "integration_id": test.id,
            }])
        ```

        ## Import

        Alert Configuration can be imported using the `project_id-alert_configuration_id`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/alertConfiguration:AlertConfiguration test 5d0f1f74cf09a29120e123cd-5d0f1f74cf09a29120e1fscg
        ```

        **NOTE**: Third-party notifications will not contain their respective credentials as these are sensitive attributes. If you wish to perform updates on these notifications without providing the original credentials, the corresponding `notifier_id` attribute must be provided instead.

        For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/alert-configurations/)

        :param str resource_name: The name of the resource.
        :param AlertConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AlertConfigurationMatcherArgs', 'AlertConfigurationMatcherArgsDict']]]]] = None,
                 metric_threshold_config: Optional[pulumi.Input[Union['AlertConfigurationMetricThresholdConfigArgs', 'AlertConfigurationMetricThresholdConfigArgsDict']]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AlertConfigurationNotificationArgs', 'AlertConfigurationNotificationArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 threshold_config: Optional[pulumi.Input[Union['AlertConfigurationThresholdConfigArgs', 'AlertConfigurationThresholdConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertConfigurationArgs.__new__(AlertConfigurationArgs)

            __props__.__dict__["enabled"] = enabled
            if event_type is None and not opts.urn:
                raise TypeError("Missing required property 'event_type'")
            __props__.__dict__["event_type"] = event_type
            __props__.__dict__["matchers"] = matchers
            __props__.__dict__["metric_threshold_config"] = metric_threshold_config
            __props__.__dict__["notifications"] = notifications
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["threshold_config"] = threshold_config
            __props__.__dict__["alert_configuration_id"] = None
            __props__.__dict__["created"] = None
            __props__.__dict__["updated"] = None
        super(AlertConfiguration, __self__).__init__(
            'mongodbatlas:index/alertConfiguration:AlertConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_configuration_id: Optional[pulumi.Input[str]] = None,
            created: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            event_type: Optional[pulumi.Input[str]] = None,
            matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AlertConfigurationMatcherArgs', 'AlertConfigurationMatcherArgsDict']]]]] = None,
            metric_threshold_config: Optional[pulumi.Input[Union['AlertConfigurationMetricThresholdConfigArgs', 'AlertConfigurationMetricThresholdConfigArgsDict']]] = None,
            notifications: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AlertConfigurationNotificationArgs', 'AlertConfigurationNotificationArgsDict']]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            threshold_config: Optional[pulumi.Input[Union['AlertConfigurationThresholdConfigArgs', 'AlertConfigurationThresholdConfigArgsDict']]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'AlertConfiguration':
        """
        Get an existing AlertConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_configuration_id: Unique identifier for the alert configuration.
        :param pulumi.Input[str] created: Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
        :param pulumi.Input[bool] enabled: It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        :param pulumi.Input[str] event_type: The type of event that will trigger an alert.
               
               > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
               
               
               > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        :param pulumi.Input[str] project_id: The ID of the project where the alert configuration will create.
        :param pulumi.Input[str] updated: Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertConfigurationState.__new__(_AlertConfigurationState)

        __props__.__dict__["alert_configuration_id"] = alert_configuration_id
        __props__.__dict__["created"] = created
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["event_type"] = event_type
        __props__.__dict__["matchers"] = matchers
        __props__.__dict__["metric_threshold_config"] = metric_threshold_config
        __props__.__dict__["notifications"] = notifications
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["threshold_config"] = threshold_config
        __props__.__dict__["updated"] = updated
        return AlertConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alertConfigurationId")
    def alert_configuration_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for the alert configuration.
        """
        return pulumi.get(self, "alert_configuration_id")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Output[str]:
        """
        The type of event that will trigger an alert.

        > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.


        > **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter
    def matchers(self) -> pulumi.Output[Optional[Sequence['outputs.AlertConfigurationMatcher']]]:
        return pulumi.get(self, "matchers")

    @property
    @pulumi.getter(name="metricThresholdConfig")
    def metric_threshold_config(self) -> pulumi.Output[Optional['outputs.AlertConfigurationMetricThresholdConfig']]:
        return pulumi.get(self, "metric_threshold_config")

    @property
    @pulumi.getter
    def notifications(self) -> pulumi.Output[Optional[Sequence['outputs.AlertConfigurationNotification']]]:
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The ID of the project where the alert configuration will create.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="thresholdConfig")
    def threshold_config(self) -> pulumi.Output[Optional['outputs.AlertConfigurationThresholdConfig']]:
        return pulumi.get(self, "threshold_config")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
        """
        return pulumi.get(self, "updated")

