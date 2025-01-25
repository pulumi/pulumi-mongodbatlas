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
    'GetStreamPrivatelinkEndpointsResult',
    'AwaitableGetStreamPrivatelinkEndpointsResult',
    'get_stream_privatelink_endpoints',
    'get_stream_privatelink_endpoints_output',
]

@pulumi.output_type
class GetStreamPrivatelinkEndpointsResult:
    """
    A collection of values returned by getStreamPrivatelinkEndpoints.
    """
    def __init__(__self__, id=None, project_id=None, results=None):
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
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetStreamPrivatelinkEndpointsResultResult']:
        return pulumi.get(self, "results")


class AwaitableGetStreamPrivatelinkEndpointsResult(GetStreamPrivatelinkEndpointsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamPrivatelinkEndpointsResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_stream_privatelink_endpoints(project_id: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamPrivatelinkEndpointsResult:
    """
    ## # Data Source: get_stream_privatelink_endpoints

    `get_stream_privatelink_endpoints` describes a Privatelink Endpoint for Streams.

    ## Example Usage


    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getStreamPrivatelinkEndpoints:getStreamPrivatelinkEndpoints', __args__, opts=opts, typ=GetStreamPrivatelinkEndpointsResult).value

    return AwaitableGetStreamPrivatelinkEndpointsResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))
def get_stream_privatelink_endpoints_output(project_id: Optional[pulumi.Input[str]] = None,
                                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStreamPrivatelinkEndpointsResult]:
    """
    ## # Data Source: get_stream_privatelink_endpoints

    `get_stream_privatelink_endpoints` describes a Privatelink Endpoint for Streams.

    ## Example Usage


    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getStreamPrivatelinkEndpoints:getStreamPrivatelinkEndpoints', __args__, opts=opts, typ=GetStreamPrivatelinkEndpointsResult)
    return __ret__.apply(lambda __response__: GetStreamPrivatelinkEndpointsResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results')))
