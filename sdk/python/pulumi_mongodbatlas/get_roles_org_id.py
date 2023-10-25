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
    'GetRolesOrgIdResult',
    'AwaitableGetRolesOrgIdResult',
    'get_roles_org_id',
    'get_roles_org_id_output',
]

@pulumi.output_type
class GetRolesOrgIdResult:
    """
    A collection of values returned by getRolesOrgId.
    """
    def __init__(__self__, id=None, org_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        The ID of the organization you want to retrieve associated to an API Key.
        """
        return pulumi.get(self, "org_id")


class AwaitableGetRolesOrgIdResult(GetRolesOrgIdResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRolesOrgIdResult(
            id=self.id,
            org_id=self.org_id)


def get_roles_org_id(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRolesOrgIdResult:
    """
    `Project` describes a MongoDB Atlas Roles Org ID. This represents a Roles Org ID.

    ## Example Usage
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getRolesOrgId:getRolesOrgId', __args__, opts=opts, typ=GetRolesOrgIdResult).value

    return AwaitableGetRolesOrgIdResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'))


@_utilities.lift_output_func(get_roles_org_id)
def get_roles_org_id_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRolesOrgIdResult]:
    """
    `Project` describes a MongoDB Atlas Roles Org ID. This represents a Roles Org ID.

    ## Example Usage
    """
    ...
