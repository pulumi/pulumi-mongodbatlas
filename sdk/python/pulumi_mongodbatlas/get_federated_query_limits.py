# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
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
    def results(self) -> Sequence['outputs.GetFederatedQueryLimitsResultResult']:
        """
        Includes Federated Database instance query limits for each item detailed in the results array section.
        """
        return pulumi.get(self, "results")

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> str:
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


def get_federated_query_limits(project_id: Optional[str] = None,
                               tenant_name: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedQueryLimitsResult:
    """
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


    :param str project_id: The unique ID for the project to create a Federated Database Instance.
    :param str tenant_name: Name of the Atlas Federated Database Instance.
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


@_utilities.lift_output_func(get_federated_query_limits)
def get_federated_query_limits_output(project_id: Optional[pulumi.Input[str]] = None,
                                      tenant_name: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFederatedQueryLimitsResult]:
    """
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


    :param str project_id: The unique ID for the project to create a Federated Database Instance.
    :param str tenant_name: Name of the Atlas Federated Database Instance.
    """
    ...
