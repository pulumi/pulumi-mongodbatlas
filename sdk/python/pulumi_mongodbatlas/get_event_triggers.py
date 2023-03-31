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

__all__ = [
    'GetEventTriggersResult',
    'AwaitableGetEventTriggersResult',
    'get_event_triggers',
    'get_event_triggers_output',
]

@pulumi.output_type
class GetEventTriggersResult:
    """
    A collection of values returned by getEventTriggers.
    """
    def __init__(__self__, app_id=None, id=None, project_id=None, results=None):
        if app_id and not isinstance(app_id, str):
            raise TypeError("Expected argument 'app_id' to be a str")
        pulumi.set(__self__, "app_id", app_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> str:
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetEventTriggersResultResult']:
        """
        A list where each represents a Event Trigger.
        """
        return pulumi.get(self, "results")


class AwaitableGetEventTriggersResult(GetEventTriggersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEventTriggersResult(
            app_id=self.app_id,
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_event_triggers(app_id: Optional[str] = None,
                       project_id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEventTriggersResult:
    """
    `get_event_triggers` describe all Event Triggers.


    :param str app_id: The ObjectID of your application.
           * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
    :param str project_id: The unique ID for the project to get all event triggers.
    """
    __args__ = dict()
    __args__['appId'] = app_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getEventTriggers:getEventTriggers', __args__, opts=opts, typ=GetEventTriggersResult).value

    return AwaitableGetEventTriggersResult(
        app_id=__ret__.app_id,
        id=__ret__.id,
        project_id=__ret__.project_id,
        results=__ret__.results)


@_utilities.lift_output_func(get_event_triggers)
def get_event_triggers_output(app_id: Optional[pulumi.Input[str]] = None,
                              project_id: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEventTriggersResult]:
    """
    `get_event_triggers` describe all Event Triggers.


    :param str app_id: The ObjectID of your application.
           * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
    :param str project_id: The unique ID for the project to get all event triggers.
    """
    ...
