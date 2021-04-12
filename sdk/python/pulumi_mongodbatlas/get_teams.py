# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = [
    'GetTeamsResult',
    'AwaitableGetTeamsResult',
    'get_teams',
]

@pulumi.output_type
class GetTeamsResult:
    """
    A collection of values returned by getTeams.
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


class AwaitableGetTeamsResult(GetTeamsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamsResult(
            id=self.id,
            name=self.name,
            org_id=self.org_id,
            team_id=self.team_id,
            usernames=self.usernames)


def get_teams(name: Optional[str] = None,
              org_id: Optional[str] = None,
              team_id: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['teamId'] = team_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getTeams:getTeams', __args__, opts=opts, typ=GetTeamsResult).value

    return AwaitableGetTeamsResult(
        id=__ret__.id,
        name=__ret__.name,
        org_id=__ret__.org_id,
        team_id=__ret__.team_id,
        usernames=__ret__.usernames)
