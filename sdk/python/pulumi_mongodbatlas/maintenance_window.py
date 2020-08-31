# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['MaintenanceWindow']


class MaintenanceWindow(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 day_of_week: Optional[pulumi.Input[float]] = None,
                 defer: Optional[pulumi.Input[bool]] = None,
                 hour_of_day: Optional[pulumi.Input[float]] = None,
                 number_of_deferrals: Optional[pulumi.Input[float]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            day_of_week=3,
            hour_of_day=4,
            project_id="<your-project-id>")
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.MaintenanceWindow("test",
            defer=True,
            project_id="<your-project-id>")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] day_of_week: Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
        :param pulumi.Input[bool] defer: Defer maintenance for the given project for one week.
        :param pulumi.Input[float] hour_of_day: Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        :param pulumi.Input[float] number_of_deferrals: Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Maintenance Window.
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

            __props__['day_of_week'] = day_of_week
            __props__['defer'] = defer
            __props__['hour_of_day'] = hour_of_day
            __props__['number_of_deferrals'] = number_of_deferrals
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            __props__['start_asap'] = None
        super(MaintenanceWindow, __self__).__init__(
            'mongodbatlas:index/maintenanceWindow:MaintenanceWindow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            day_of_week: Optional[pulumi.Input[float]] = None,
            defer: Optional[pulumi.Input[bool]] = None,
            hour_of_day: Optional[pulumi.Input[float]] = None,
            number_of_deferrals: Optional[pulumi.Input[float]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            start_asap: Optional[pulumi.Input[bool]] = None) -> 'MaintenanceWindow':
        """
        Get an existing MaintenanceWindow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] day_of_week: Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
        :param pulumi.Input[bool] defer: Defer maintenance for the given project for one week.
        :param pulumi.Input[float] hour_of_day: Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        :param pulumi.Input[float] number_of_deferrals: Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
        :param pulumi.Input[str] project_id: The unique identifier of the project for the Maintenance Window.
        :param pulumi.Input[bool] start_asap: Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["day_of_week"] = day_of_week
        __props__["defer"] = defer
        __props__["hour_of_day"] = hour_of_day
        __props__["number_of_deferrals"] = number_of_deferrals
        __props__["project_id"] = project_id
        __props__["start_asap"] = start_asap
        return MaintenanceWindow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dayOfWeek")
    def day_of_week(self) -> pulumi.Output[float]:
        """
        Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
        """
        return pulumi.get(self, "day_of_week")

    @property
    @pulumi.getter
    def defer(self) -> pulumi.Output[bool]:
        """
        Defer maintenance for the given project for one week.
        """
        return pulumi.get(self, "defer")

    @property
    @pulumi.getter(name="hourOfDay")
    def hour_of_day(self) -> pulumi.Output[float]:
        """
        Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        """
        return pulumi.get(self, "hour_of_day")

    @property
    @pulumi.getter(name="numberOfDeferrals")
    def number_of_deferrals(self) -> pulumi.Output[float]:
        """
        Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

