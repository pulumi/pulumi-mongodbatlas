# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetFederatedQueryLimitsResult',
    'AwaitableGetFederatedQueryLimitsResult',
    'get_federated_query_limits',
    'get_federated_query_limits_output',
]

@pulumi.output_type
class GetFederatedQueryLimitsResult:
    """
    A collection of values returned by getFederatedQueryLimits.
    """
    def __init__(__self__, id=None, project_id=None, results=None, tenant_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)
        if tenant_name and not isinstance(tenant_name, str):
            raise TypeError("Expected argument 'tenant_name' to be a str")
        pulumi.set(__self__, "tenant_name", tenant_name)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetFederatedQueryLimitsResultResult']:
        """
        Includes Federated Database instance query limits for each item detailed in the results array section.
        """
        return pulumi.get(self, "results")

    @_builtins.property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> _builtins.str:
        return pulumi.get(self, "tenant_name")


class AwaitableGetFederatedQueryLimitsResult(GetFederatedQueryLimitsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFederatedQueryLimitsResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results,
            tenant_name=self.tenant_name)


def get_federated_query_limits(project_id: Optional[_builtins.str] = None,
                               tenant_name: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedQueryLimitsResult:
    """
    ## # Data Source: get_federated_query_limits

    `get_federated_query_limits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ### S

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_federated_query_limits(project_id="PROJECT_ID",
        tenant_name="FEDERATED_DATABASE_INSTANCE_NAME")
    ```


    :param _builtins.str project_id: The unique ID for the project to create a Federated Database Instance.
    :param _builtins.str tenant_name: Name of the Atlas Federated Database Instance.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    __args__['tenantName'] = tenant_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits', __args__, opts=opts, typ=GetFederatedQueryLimitsResult).value

    return AwaitableGetFederatedQueryLimitsResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'),
        tenant_name=pulumi.get(__ret__, 'tenant_name'))
def get_federated_query_limits_output(project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      tenant_name: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFederatedQueryLimitsResult]:
    """
    ## # Data Source: get_federated_query_limits

    `get_federated_query_limits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ### S

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_federated_query_limits(project_id="PROJECT_ID",
        tenant_name="FEDERATED_DATABASE_INSTANCE_NAME")
    ```


    :param _builtins.str project_id: The unique ID for the project to create a Federated Database Instance.
    :param _builtins.str tenant_name: Name of the Atlas Federated Database Instance.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    __args__['tenantName'] = tenant_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits', __args__, opts=opts, typ=GetFederatedQueryLimitsResult)
    return __ret__.apply(lambda __response__: GetFederatedQueryLimitsResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results'),
        tenant_name=pulumi.get(__response__, 'tenant_name')))
