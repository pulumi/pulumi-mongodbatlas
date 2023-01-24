# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetTeamResult',
    'AwaitableGetTeamResult',
    'get_team',
    'get_team_output',
]

@pulumi.output_type
class GetTeamResult:
    """
    A collection of values returned by getTeam.
    """
    def __init__(__self__, id=None, name=None, org_id=None, team_id=None, usernames=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if team_id and not isinstance(team_id, str):
            raise TypeError("Expected argument 'team_id' to be a str")
        pulumi.set(__self__, "team_id", team_id)
        if usernames and not isinstance(usernames, list):
            raise TypeError("Expected argument 'usernames' to be a list")
        pulumi.set(__self__, "usernames", usernames)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> str:
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter
    def usernames(self) -> Sequence[str]:
        return pulumi.get(self, "usernames")


class AwaitableGetTeamResult(GetTeamResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamResult(
            id=self.id,
            name=self.name,
            org_id=self.org_id,
            team_id=self.team_id,
            usernames=self.usernames)


def get_team(name: Optional[str] = None,
             org_id: Optional[str] = None,
             team_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['teamId'] = team_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getTeam:getTeam', __args__, opts=opts, typ=GetTeamResult).value

    return AwaitableGetTeamResult(
        id=__ret__.id,
        name=__ret__.name,
        org_id=__ret__.org_id,
        team_id=__ret__.team_id,
        usernames=__ret__.usernames)


@_utilities.lift_output_func(get_team)
def get_team_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                    org_id: Optional[pulumi.Input[str]] = None,
                    team_id: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTeamResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
