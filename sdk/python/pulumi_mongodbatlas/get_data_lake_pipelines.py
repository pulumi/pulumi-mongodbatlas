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
    'GetDataLakePipelinesResult',
    'AwaitableGetDataLakePipelinesResult',
    'get_data_lake_pipelines',
    'get_data_lake_pipelines_output',
]

@pulumi.output_type
class GetDataLakePipelinesResult:
    """
    A collection of values returned by getDataLakePipelines.
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
        Unique 24-hexadecimal character string that identifies the project.
        * `policyItemId` - Unique 24-hexadecimal character string that identifies a policy item.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetDataLakePipelinesResultResult']:
        """
        A list where each represents a Data Lake Pipeline.
        """
        return pulumi.get(self, "results")


class AwaitableGetDataLakePipelinesResult(GetDataLakePipelinesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDataLakePipelinesResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_data_lake_pipelines(project_id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDataLakePipelinesResult:
    """
    **WARNING:** Data Lake is deprecated. To learn more, see <https://dochub.mongodb.org/core/data-lake-deprecation>

    `get_data_lake_pipelines` describes Data Lake Pipelines.

    > **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.

    ## Example Usage


    :param str project_id: The unique ID for the project to create a data lake pipeline.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getDataLakePipelines:getDataLakePipelines', __args__, opts=opts, typ=GetDataLakePipelinesResult).value

    return AwaitableGetDataLakePipelinesResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))
def get_data_lake_pipelines_output(project_id: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDataLakePipelinesResult]:
    """
    **WARNING:** Data Lake is deprecated. To learn more, see <https://dochub.mongodb.org/core/data-lake-deprecation>

    `get_data_lake_pipelines` describes Data Lake Pipelines.

    > **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.

    ## Example Usage


    :param str project_id: The unique ID for the project to create a data lake pipeline.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getDataLakePipelines:getDataLakePipelines', __args__, opts=opts, typ=GetDataLakePipelinesResult)
    return __ret__.apply(lambda __response__: GetDataLakePipelinesResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results')))
