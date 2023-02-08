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
    'GetAccessListApiKeyResult',
    'AwaitableGetAccessListApiKeyResult',
    'get_access_list_api_key',
    'get_access_list_api_key_output',
]

@pulumi.output_type
class GetAccessListApiKeyResult:
    """
    A collection of values returned by getAccessListApiKey.
    """
    def __init__(__self__, access_count=None, api_key_id=None, cidr_block=None, created=None, id=None, ip_address=None, last_used=None, last_used_address=None, org_id=None):
        if access_count and not isinstance(access_count, int):
            raise TypeError("Expected argument 'access_count' to be a int")
        pulumi.set(__self__, "access_count", access_count)
        if api_key_id and not isinstance(api_key_id, str):
            raise TypeError("Expected argument 'api_key_id' to be a str")
        pulumi.set(__self__, "api_key_id", api_key_id)
        if cidr_block and not isinstance(cidr_block, str):
            raise TypeError("Expected argument 'cidr_block' to be a str")
        pulumi.set(__self__, "cidr_block", cidr_block)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if last_used and not isinstance(last_used, str):
            raise TypeError("Expected argument 'last_used' to be a str")
        pulumi.set(__self__, "last_used", last_used)
        if last_used_address and not isinstance(last_used_address, str):
            raise TypeError("Expected argument 'last_used_address' to be a str")
        pulumi.set(__self__, "last_used_address", last_used_address)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter(name="accessCount")
    def access_count(self) -> int:
        return pulumi.get(self, "access_count")

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> str:
        return pulumi.get(self, "api_key_id")

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> str:
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter
    def created(self) -> str:
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> str:
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="lastUsed")
    def last_used(self) -> str:
        return pulumi.get(self, "last_used")

    @property
    @pulumi.getter(name="lastUsedAddress")
    def last_used_address(self) -> str:
        return pulumi.get(self, "last_used_address")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")


class AwaitableGetAccessListApiKeyResult(GetAccessListApiKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessListApiKeyResult(
            access_count=self.access_count,
            api_key_id=self.api_key_id,
            cidr_block=self.cidr_block,
            created=self.created,
            id=self.id,
            ip_address=self.ip_address,
            last_used=self.last_used,
            last_used_address=self.last_used_address,
            org_id=self.org_id)


def get_access_list_api_key(api_key_id: Optional[str] = None,
                            ip_address: Optional[str] = None,
                            org_id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessListApiKeyResult:
    """
    ## Example Usage


    :param str api_key_id: Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
           *
           > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address`.
    :param str ip_address: Single IP address to be added to the access list.
    :param str org_id: Unique identifier for the Organization to which you want to retrieve one or more access list entries.
    """
    __args__ = dict()
    __args__['apiKeyId'] = api_key_id
    __args__['ipAddress'] = ip_address
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getAccessListApiKey:getAccessListApiKey', __args__, opts=opts, typ=GetAccessListApiKeyResult).value

    return AwaitableGetAccessListApiKeyResult(
        access_count=__ret__.access_count,
        api_key_id=__ret__.api_key_id,
        cidr_block=__ret__.cidr_block,
        created=__ret__.created,
        id=__ret__.id,
        ip_address=__ret__.ip_address,
        last_used=__ret__.last_used,
        last_used_address=__ret__.last_used_address,
        org_id=__ret__.org_id)


@_utilities.lift_output_func(get_access_list_api_key)
def get_access_list_api_key_output(api_key_id: Optional[pulumi.Input[str]] = None,
                                   ip_address: Optional[pulumi.Input[str]] = None,
                                   org_id: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessListApiKeyResult]:
    """
    ## Example Usage


    :param str api_key_id: Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
           *
           > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address`.
    :param str ip_address: Single IP address to be added to the access list.
    :param str org_id: Unique identifier for the Organization to which you want to retrieve one or more access list entries.
    """
    ...
