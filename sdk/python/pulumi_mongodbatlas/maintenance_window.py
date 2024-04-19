# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MaintenanceWindowArgs', 'MaintenanceWindow']

@pulumi.input_type
class MaintenanceWindowArgs:
    def __init__(__self__, *,
                 day_of_week: pulumi.Input[int],
                 project_id: pulumi.Input[str],
                 auto_defer: Optional[pulumi.Input[bool]] = None,
                 auto_defer_once_enabled: Optional[pulumi.Input[bool]] = None,
                 defer: Optional[pulumi.Input[bool]] = None,
                 hour_of_day: Optional[pulumi.Input[int]] = None,
                 start_asap: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a MaintenanceWindow resource.
        :param pulumi.Input[int] day_of_week: Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Maintenance Window.
        :param pulumi.Input[bool] auto_defer: Defer any scheduled maintenance for the given project for one week.
        :param pulumi.Input[bool] defer: Defer the next scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] hour_of_day: Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        :param pulumi.Input[bool] start_asap: Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        pulumi.set(__self__, "day_of_week", day_of_week)
        pulumi.set(__self__, "project_id", project_id)
        if auto_defer is not None:
            pulumi.set(__self__, "auto_defer", auto_defer)
        if auto_defer_once_enabled is not None:
            pulumi.set(__self__, "auto_defer_once_enabled", auto_defer_once_enabled)
        if defer is not None:
            pulumi.set(__self__, "defer", defer)
        if hour_of_day is not None:
            pulumi.set(__self__, "hour_of_day", hour_of_day)
        if start_asap is not None:
            pulumi.set(__self__, "start_asap", start_asap)

    @property
    @pulumi.getter(name="dayOfWeek")
    def day_of_week(self) -> pulumi.Input[int]:
        """
        Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        """
        return pulumi.get(self, "day_of_week")

    @day_of_week.setter
    def day_of_week(self, value: pulumi.Input[int]):
        pulumi.set(self, "day_of_week", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique identifier of the project for the Maintenance Window.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="autoDefer")
    def auto_defer(self) -> Optional[pulumi.Input[bool]]:
        """
        Defer any scheduled maintenance for the given project for one week.
        """
        return pulumi.get(self, "auto_defer")

    @auto_defer.setter
    def auto_defer(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_defer", value)

    @property
    @pulumi.getter(name="autoDeferOnceEnabled")
    def auto_defer_once_enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "auto_defer_once_enabled")

    @auto_defer_once_enabled.setter
    def auto_defer_once_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_defer_once_enabled", value)

    @property
    @pulumi.getter
    def defer(self) -> Optional[pulumi.Input[bool]]:
        """
        Defer the next scheduled maintenance for the given project for one week.
        """
        return pulumi.get(self, "defer")

    @defer.setter
    def defer(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "defer", value)

    @property
    @pulumi.getter(name="hourOfDay")
    def hour_of_day(self) -> Optional[pulumi.Input[int]]:
        """
        Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        """
        return pulumi.get(self, "hour_of_day")

    @hour_of_day.setter
    def hour_of_day(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "hour_of_day", value)

    @property
    @pulumi.getter(name="startAsap")
    def start_asap(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        return pulumi.get(self, "start_asap")

    @start_asap.setter
    def start_asap(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "start_asap", value)


@pulumi.input_type
class _MaintenanceWindowState:
    def __init__(__self__, *,
                 auto_defer: Optional[pulumi.Input[bool]] = None,
                 auto_defer_once_enabled: Optional[pulumi.Input[bool]] = None,
                 day_of_week: Optional[pulumi.Input[int]] = None,
                 defer: Optional[pulumi.Input[bool]] = None,
                 hour_of_day: Optional[pulumi.Input[int]] = None,
                 number_of_deferrals: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 start_asap: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering MaintenanceWindow resources.
        :param pulumi.Input[bool] auto_defer: Defer any scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] day_of_week: Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        :param pulumi.Input[bool] defer: Defer the next scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] hour_of_day: Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        :param pulumi.Input[int] number_of_deferrals: Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Maintenance Window.
        :param pulumi.Input[bool] start_asap: Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        if auto_defer is not None:
            pulumi.set(__self__, "auto_defer", auto_defer)
        if auto_defer_once_enabled is not None:
            pulumi.set(__self__, "auto_defer_once_enabled", auto_defer_once_enabled)
        if day_of_week is not None:
            pulumi.set(__self__, "day_of_week", day_of_week)
        if defer is not None:
            pulumi.set(__self__, "defer", defer)
        if hour_of_day is not None:
            pulumi.set(__self__, "hour_of_day", hour_of_day)
        if number_of_deferrals is not None:
            pulumi.set(__self__, "number_of_deferrals", number_of_deferrals)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if start_asap is not None:
            pulumi.set(__self__, "start_asap", start_asap)

    @property
    @pulumi.getter(name="autoDefer")
    def auto_defer(self) -> Optional[pulumi.Input[bool]]:
        """
        Defer any scheduled maintenance for the given project for one week.
        """
        return pulumi.get(self, "auto_defer")

    @auto_defer.setter
    def auto_defer(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_defer", value)

    @property
    @pulumi.getter(name="autoDeferOnceEnabled")
    def auto_defer_once_enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "auto_defer_once_enabled")

    @auto_defer_once_enabled.setter
    def auto_defer_once_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_defer_once_enabled", value)

    @property
    @pulumi.getter(name="dayOfWeek")
    def day_of_week(self) -> Optional[pulumi.Input[int]]:
        """
        Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        """
        return pulumi.get(self, "day_of_week")

    @day_of_week.setter
    def day_of_week(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "day_of_week", value)

    @property
    @pulumi.getter
    def defer(self) -> Optional[pulumi.Input[bool]]:
        """
        Defer the next scheduled maintenance for the given project for one week.
        """
        return pulumi.get(self, "defer")

    @defer.setter
    def defer(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "defer", value)

    @property
    @pulumi.getter(name="hourOfDay")
    def hour_of_day(self) -> Optional[pulumi.Input[int]]:
        """
        Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        """
        return pulumi.get(self, "hour_of_day")

    @hour_of_day.setter
    def hour_of_day(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "hour_of_day", value)

    @property
    @pulumi.getter(name="numberOfDeferrals")
    def number_of_deferrals(self) -> Optional[pulumi.Input[int]]:
        """
        Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        """
        return pulumi.get(self, "number_of_deferrals")

    @number_of_deferrals.setter
    def number_of_deferrals(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "number_of_deferrals", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the project for the Maintenance Window.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="startAsap")
    def start_asap(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        return pulumi.get(self, "start_asap")

    @start_asap.setter
    def start_asap(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "start_asap", value)


class MaintenanceWindow(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_defer: Optional[pulumi.Input[bool]] = None,
                 auto_defer_once_enabled: Optional[pulumi.Input[bool]] = None,
                 day_of_week: Optional[pulumi.Input[int]] = None,
                 defer: Optional[pulumi.Input[bool]] = None,
                 hour_of_day: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 start_asap: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        `MaintenanceWindow` provides a resource to schedule a maintenance window for your MongoDB Atlas Project and/or set to defer a scheduled maintenance up to two times.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        ## Maintenance Window Considerations:

        - Urgent Maintenance Activities Cannot Wait: Urgent maintenance activities such as security patches cannot wait for your chosen window. Atlas will start those maintenance activities when needed.

        Once maintenance is scheduled for your cluster, you cannot change your maintenance window until the current maintenance efforts have completed.
        - Maintenance Requires Replica Set Elections: Atlas performs maintenance the same way as the manual maintenance procedure. This requires at least one replica set election during the maintenance window per replica set.
        - Maintenance Starts As Close to the Hour As Possible: Maintenance always begins as close to the scheduled hour as possible, but in-progress cluster updates or expected system issues could delay the start time.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.MaintenanceWindow("test",
            project_id="<your-project-id>",
            day_of_week=3,
            hour_of_day=4)
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.MaintenanceWindow("test",
            project_id="<your-project-id>",
            defer=True)
        ```

        ## Import

        Maintenance Window entries can be imported using project project_id, in the format `PROJECTID`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/maintenanceWindow:MaintenanceWindow test 5d0f1f73cf09a29120e173cf
        ```
        For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_defer: Defer any scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] day_of_week: Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        :param pulumi.Input[bool] defer: Defer the next scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] hour_of_day: Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Maintenance Window.
        :param pulumi.Input[bool] start_asap: Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaintenanceWindowArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `MaintenanceWindow` provides a resource to schedule a maintenance window for your MongoDB Atlas Project and/or set to defer a scheduled maintenance up to two times.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        ## Maintenance Window Considerations:

        - Urgent Maintenance Activities Cannot Wait: Urgent maintenance activities such as security patches cannot wait for your chosen window. Atlas will start those maintenance activities when needed.

        Once maintenance is scheduled for your cluster, you cannot change your maintenance window until the current maintenance efforts have completed.
        - Maintenance Requires Replica Set Elections: Atlas performs maintenance the same way as the manual maintenance procedure. This requires at least one replica set election during the maintenance window per replica set.
        - Maintenance Starts As Close to the Hour As Possible: Maintenance always begins as close to the scheduled hour as possible, but in-progress cluster updates or expected system issues could delay the start time.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.MaintenanceWindow("test",
            project_id="<your-project-id>",
            day_of_week=3,
            hour_of_day=4)
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.MaintenanceWindow("test",
            project_id="<your-project-id>",
            defer=True)
        ```

        ## Import

        Maintenance Window entries can be imported using project project_id, in the format `PROJECTID`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/maintenanceWindow:MaintenanceWindow test 5d0f1f73cf09a29120e173cf
        ```
        For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)

        :param str resource_name: The name of the resource.
        :param MaintenanceWindowArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaintenanceWindowArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_defer: Optional[pulumi.Input[bool]] = None,
                 auto_defer_once_enabled: Optional[pulumi.Input[bool]] = None,
                 day_of_week: Optional[pulumi.Input[int]] = None,
                 defer: Optional[pulumi.Input[bool]] = None,
                 hour_of_day: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 start_asap: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MaintenanceWindowArgs.__new__(MaintenanceWindowArgs)

            __props__.__dict__["auto_defer"] = auto_defer
            __props__.__dict__["auto_defer_once_enabled"] = auto_defer_once_enabled
            if day_of_week is None and not opts.urn:
                raise TypeError("Missing required property 'day_of_week'")
            __props__.__dict__["day_of_week"] = day_of_week
            __props__.__dict__["defer"] = defer
            __props__.__dict__["hour_of_day"] = hour_of_day
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["start_asap"] = start_asap
            __props__.__dict__["number_of_deferrals"] = None
        super(MaintenanceWindow, __self__).__init__(
            'mongodbatlas:index/maintenanceWindow:MaintenanceWindow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_defer: Optional[pulumi.Input[bool]] = None,
            auto_defer_once_enabled: Optional[pulumi.Input[bool]] = None,
            day_of_week: Optional[pulumi.Input[int]] = None,
            defer: Optional[pulumi.Input[bool]] = None,
            hour_of_day: Optional[pulumi.Input[int]] = None,
            number_of_deferrals: Optional[pulumi.Input[int]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            start_asap: Optional[pulumi.Input[bool]] = None) -> 'MaintenanceWindow':
        """
        Get an existing MaintenanceWindow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_defer: Defer any scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] day_of_week: Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        :param pulumi.Input[bool] defer: Defer the next scheduled maintenance for the given project for one week.
        :param pulumi.Input[int] hour_of_day: Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        :param pulumi.Input[int] number_of_deferrals: Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Maintenance Window.
        :param pulumi.Input[bool] start_asap: Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaintenanceWindowState.__new__(_MaintenanceWindowState)

        __props__.__dict__["auto_defer"] = auto_defer
        __props__.__dict__["auto_defer_once_enabled"] = auto_defer_once_enabled
        __props__.__dict__["day_of_week"] = day_of_week
        __props__.__dict__["defer"] = defer
        __props__.__dict__["hour_of_day"] = hour_of_day
        __props__.__dict__["number_of_deferrals"] = number_of_deferrals
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["start_asap"] = start_asap
        return MaintenanceWindow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoDefer")
    def auto_defer(self) -> pulumi.Output[bool]:
        """
        Defer any scheduled maintenance for the given project for one week.
        """
        return pulumi.get(self, "auto_defer")

    @property
    @pulumi.getter(name="autoDeferOnceEnabled")
    def auto_defer_once_enabled(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "auto_defer_once_enabled")

    @property
    @pulumi.getter(name="dayOfWeek")
    def day_of_week(self) -> pulumi.Output[int]:
        """
        Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        """
        return pulumi.get(self, "day_of_week")

    @property
    @pulumi.getter
    def defer(self) -> pulumi.Output[bool]:
        """
        Defer the next scheduled maintenance for the given project for one week.
        """
        return pulumi.get(self, "defer")

    @property
    @pulumi.getter(name="hourOfDay")
    def hour_of_day(self) -> pulumi.Output[int]:
        """
        Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        """
        return pulumi.get(self, "hour_of_day")

    @property
    @pulumi.getter(name="numberOfDeferrals")
    def number_of_deferrals(self) -> pulumi.Output[int]:
        """
        Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        """
        return pulumi.get(self, "number_of_deferrals")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique identifier of the project for the Maintenance Window.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="startAsap")
    def start_asap(self) -> pulumi.Output[bool]:
        """
        Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        return pulumi.get(self, "start_asap")

