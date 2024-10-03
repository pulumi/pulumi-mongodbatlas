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
    'GetStreamProcessorResult',
    'AwaitableGetStreamProcessorResult',
    'get_stream_processor',
    'get_stream_processor_output',
]

@pulumi.output_type
class GetStreamProcessorResult:
    """
    A collection of values returned by getStreamProcessor.
    """
    def __init__(__self__, id=None, instance_name=None, options=None, pipeline=None, processor_name=None, project_id=None, state=None, stats=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_name and not isinstance(instance_name, str):
            raise TypeError("Expected argument 'instance_name' to be a str")
        pulumi.set(__self__, "instance_name", instance_name)
        if options and not isinstance(options, dict):
            raise TypeError("Expected argument 'options' to be a dict")
        pulumi.set(__self__, "options", options)
        if pipeline and not isinstance(pipeline, str):
            raise TypeError("Expected argument 'pipeline' to be a str")
        pulumi.set(__self__, "pipeline", pipeline)
        if processor_name and not isinstance(processor_name, str):
            raise TypeError("Expected argument 'processor_name' to be a str")
        pulumi.set(__self__, "processor_name", processor_name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if stats and not isinstance(stats, str):
            raise TypeError("Expected argument 'stats' to be a str")
        pulumi.set(__self__, "stats", stats)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        """
        Human-readable label that identifies the stream instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter
    def options(self) -> 'outputs.GetStreamProcessorOptionsResult':
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def pipeline(self) -> str:
        return pulumi.get(self, "pipeline")

    @property
    @pulumi.getter(name="processorName")
    def processor_name(self) -> str:
        """
        Human-readable label that identifies the stream processor.
        """
        return pulumi.get(self, "processor_name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def stats(self) -> str:
        return pulumi.get(self, "stats")


class AwaitableGetStreamProcessorResult(GetStreamProcessorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamProcessorResult(
            id=self.id,
            instance_name=self.instance_name,
            options=self.options,
            pipeline=self.pipeline,
            processor_name=self.processor_name,
            project_id=self.project_id,
            state=self.state,
            stats=self.stats)


def get_stream_processor(instance_name: Optional[str] = None,
                         processor_name: Optional[str] = None,
                         project_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamProcessorResult:
    """
    ## # Data Source: StreamProcessor

    `StreamProcessor` describes a stream processor.

    ## Example Usage


    :param str instance_name: Human-readable label that identifies the stream instance.
    :param str processor_name: Human-readable label that identifies the stream processor.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['instanceName'] = instance_name
    __args__['processorName'] = processor_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getStreamProcessor:getStreamProcessor', __args__, opts=opts, typ=GetStreamProcessorResult).value

    return AwaitableGetStreamProcessorResult(
        id=pulumi.get(__ret__, 'id'),
        instance_name=pulumi.get(__ret__, 'instance_name'),
        options=pulumi.get(__ret__, 'options'),
        pipeline=pulumi.get(__ret__, 'pipeline'),
        processor_name=pulumi.get(__ret__, 'processor_name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        state=pulumi.get(__ret__, 'state'),
        stats=pulumi.get(__ret__, 'stats'))
def get_stream_processor_output(instance_name: Optional[pulumi.Input[str]] = None,
                                processor_name: Optional[pulumi.Input[str]] = None,
                                project_id: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStreamProcessorResult]:
    """
    ## # Data Source: StreamProcessor

    `StreamProcessor` describes a stream processor.

    ## Example Usage


    :param str instance_name: Human-readable label that identifies the stream instance.
    :param str processor_name: Human-readable label that identifies the stream processor.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['instanceName'] = instance_name
    __args__['processorName'] = processor_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getStreamProcessor:getStreamProcessor', __args__, opts=opts, typ=GetStreamProcessorResult)
    return __ret__.apply(lambda __response__: GetStreamProcessorResult(
        id=pulumi.get(__response__, 'id'),
        instance_name=pulumi.get(__response__, 'instance_name'),
        options=pulumi.get(__response__, 'options'),
        pipeline=pulumi.get(__response__, 'pipeline'),
        processor_name=pulumi.get(__response__, 'processor_name'),
        project_id=pulumi.get(__response__, 'project_id'),
        state=pulumi.get(__response__, 'state'),
        stats=pulumi.get(__response__, 'stats')))
