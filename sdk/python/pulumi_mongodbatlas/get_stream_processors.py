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
    'GetStreamProcessorsResult',
    'AwaitableGetStreamProcessorsResult',
    'get_stream_processors',
    'get_stream_processors_output',
]

@pulumi.output_type
class GetStreamProcessorsResult:
    """
    A collection of values returned by getStreamProcessors.
    """
    def __init__(__self__, id=None, instance_name=None, project_id=None, results=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_name and not isinstance(instance_name, str):
            raise TypeError("Expected argument 'instance_name' to be a str")
        pulumi.set(__self__, "instance_name", instance_name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        """
        Human-readable label that identifies the stream instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetStreamProcessorsResultResult']:
        return pulumi.get(self, "results")


class AwaitableGetStreamProcessorsResult(GetStreamProcessorsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamProcessorsResult(
            id=self.id,
            instance_name=self.instance_name,
            project_id=self.project_id,
            results=self.results)


def get_stream_processors(instance_name: Optional[str] = None,
                          project_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamProcessorsResult:
    """
    ## # Data Source: get_stream_processors

    `get_stream_processors` returns all stream processors in a stream instance.

    ## Example Usage


    :param str instance_name: Human-readable label that identifies the stream instance.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['instanceName'] = instance_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getStreamProcessors:getStreamProcessors', __args__, opts=opts, typ=GetStreamProcessorsResult).value

    return AwaitableGetStreamProcessorsResult(
        id=pulumi.get(__ret__, 'id'),
        instance_name=pulumi.get(__ret__, 'instance_name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))


@_utilities.lift_output_func(get_stream_processors)
def get_stream_processors_output(instance_name: Optional[pulumi.Input[str]] = None,
                                 project_id: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStreamProcessorsResult]:
    """
    ## # Data Source: get_stream_processors

    `get_stream_processors` returns all stream processors in a stream instance.

    ## Example Usage


    :param str instance_name: Human-readable label that identifies the stream instance.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    ...
