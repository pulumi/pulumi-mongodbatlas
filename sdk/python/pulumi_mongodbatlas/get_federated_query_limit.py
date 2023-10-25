# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetFederatedQueryLimitResult',
    'AwaitableGetFederatedQueryLimitResult',
    'get_federated_query_limit',
    'get_federated_query_limit_output',
]

@pulumi.output_type
class GetFederatedQueryLimitResult:
    """
    A collection of values returned by getFederatedQueryLimit.
    """
    def __init__(__self__, current_usage=None, default_limit=None, id=None, last_modified_date=None, limit_name=None, maximum_limit=None, overrun_policy=None, project_id=None, tenant_name=None, value=None):
        if current_usage and not isinstance(current_usage, int):
            raise TypeError("Expected argument 'current_usage' to be a int")
        pulumi.set(__self__, "current_usage", current_usage)
        if default_limit and not isinstance(default_limit, int):
            raise TypeError("Expected argument 'default_limit' to be a int")
        pulumi.set(__self__, "default_limit", default_limit)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_modified_date and not isinstance(last_modified_date, str):
            raise TypeError("Expected argument 'last_modified_date' to be a str")
        pulumi.set(__self__, "last_modified_date", last_modified_date)
        if limit_name and not isinstance(limit_name, str):
            raise TypeError("Expected argument 'limit_name' to be a str")
        pulumi.set(__self__, "limit_name", limit_name)
        if maximum_limit and not isinstance(maximum_limit, int):
            raise TypeError("Expected argument 'maximum_limit' to be a int")
        pulumi.set(__self__, "maximum_limit", maximum_limit)
        if overrun_policy and not isinstance(overrun_policy, str):
            raise TypeError("Expected argument 'overrun_policy' to be a str")
        pulumi.set(__self__, "overrun_policy", overrun_policy)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if tenant_name and not isinstance(tenant_name, str):
            raise TypeError("Expected argument 'tenant_name' to be a str")
        pulumi.set(__self__, "tenant_name", tenant_name)
        if value and not isinstance(value, int):
            raise TypeError("Expected argument 'value' to be a int")
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="currentUsage")
    def current_usage(self) -> int:
        """
        Amount that indicates the current usage of the limit.
        """
        return pulumi.get(self, "current_usage")

    @property
    @pulumi.getter(name="defaultLimit")
    def default_limit(self) -> int:
        """
        Default value of the limit.
        """
        return pulumi.get(self, "default_limit")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModifiedDate")
    def last_modified_date(self) -> str:
        return pulumi.get(self, "last_modified_date")

    @property
    @pulumi.getter(name="limitName")
    def limit_name(self) -> str:
        return pulumi.get(self, "limit_name")

    @property
    @pulumi.getter(name="maximumLimit")
    def maximum_limit(self) -> int:
        return pulumi.get(self, "maximum_limit")

    @property
    @pulumi.getter(name="overrunPolicy")
    def overrun_policy(self) -> str:
        return pulumi.get(self, "overrun_policy")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> str:
        return pulumi.get(self, "tenant_name")

    @property
    @pulumi.getter
    def value(self) -> int:
        return pulumi.get(self, "value")


class AwaitableGetFederatedQueryLimitResult(GetFederatedQueryLimitResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFederatedQueryLimitResult(
            current_usage=self.current_usage,
            default_limit=self.default_limit,
            id=self.id,
            last_modified_date=self.last_modified_date,
            limit_name=self.limit_name,
            maximum_limit=self.maximum_limit,
            overrun_policy=self.overrun_policy,
            project_id=self.project_id,
            tenant_name=self.tenant_name,
            value=self.value)


def get_federated_query_limit(limit_name: Optional[str] = None,
                              project_id: Optional[str] = None,
                              tenant_name: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedQueryLimitResult:
    """
    ## Data Source: FederatedQueryLimit

    `FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.


    :param str limit_name: String enum that indicates whether the identity provider is active or not. Accepted values are:
           * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
           * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
           * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
           * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
    :param str project_id: The unique ID for the project to create a Federated Database Instance.
    :param str tenant_name: Name of the Atlas Federated Database Instance.
    """
    __args__ = dict()
    __args__['limitName'] = limit_name
    __args__['projectId'] = project_id
    __args__['tenantName'] = tenant_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFederatedQueryLimit:getFederatedQueryLimit', __args__, opts=opts, typ=GetFederatedQueryLimitResult).value

    return AwaitableGetFederatedQueryLimitResult(
        current_usage=pulumi.get(__ret__, 'current_usage'),
        default_limit=pulumi.get(__ret__, 'default_limit'),
        id=pulumi.get(__ret__, 'id'),
        last_modified_date=pulumi.get(__ret__, 'last_modified_date'),
        limit_name=pulumi.get(__ret__, 'limit_name'),
        maximum_limit=pulumi.get(__ret__, 'maximum_limit'),
        overrun_policy=pulumi.get(__ret__, 'overrun_policy'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tenant_name=pulumi.get(__ret__, 'tenant_name'),
        value=pulumi.get(__ret__, 'value'))


@_utilities.lift_output_func(get_federated_query_limit)
def get_federated_query_limit_output(limit_name: Optional[pulumi.Input[str]] = None,
                                     project_id: Optional[pulumi.Input[str]] = None,
                                     tenant_name: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFederatedQueryLimitResult]:
    """
    ## Data Source: FederatedQueryLimit

    `FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.


    :param str limit_name: String enum that indicates whether the identity provider is active or not. Accepted values are:
           * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
           * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
           * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
           * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
    :param str project_id: The unique ID for the project to create a Federated Database Instance.
    :param str tenant_name: Name of the Atlas Federated Database Instance.
    """
    ...
