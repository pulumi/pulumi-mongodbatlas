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

__all__ = [
    'GetApiKeyResult',
    'AwaitableGetApiKeyResult',
    'get_api_key',
    'get_api_key_output',
]

@pulumi.output_type
class GetApiKeyResult:
    """
    A collection of values returned by getApiKey.
    """
    def __init__(__self__, api_key_id=None, description=None, id=None, org_id=None, public_key=None, role_names=None):
        if api_key_id and not isinstance(api_key_id, str):
            raise TypeError("Expected argument 'api_key_id' to be a str")
        pulumi.set(__self__, "api_key_id", api_key_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if public_key and not isinstance(public_key, str):
            raise TypeError("Expected argument 'public_key' to be a str")
        pulumi.set(__self__, "public_key", public_key)
        if role_names and not isinstance(role_names, list):
            raise TypeError("Expected argument 'role_names' to be a list")
        pulumi.set(__self__, "role_names", role_names)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> str:
        return pulumi.get(self, "api_key_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of this Organization API key.
        """
        return pulumi.get(self, "description")

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
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> str:
        """
        Public key for this Organization API key.
        """
        return pulumi.get(self, "public_key")

    @property
    @pulumi.getter(name="roleNames")
    def role_names(self) -> Sequence[str]:
        """
        Name of the role. This resource returns all the roles the user has in Atlas.
        The following are valid roles:
        * `ORG_OWNER`
        * `ORG_GROUP_CREATOR`
        * `ORG_BILLING_ADMIN`
        * `ORG_READ_ONLY`
        * `ORG_MEMBER`
        """
        return pulumi.get(self, "role_names")


class AwaitableGetApiKeyResult(GetApiKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApiKeyResult(
            api_key_id=self.api_key_id,
            description=self.description,
            id=self.id,
            org_id=self.org_id,
            public_key=self.public_key,
            role_names=self.role_names)


def get_api_key(api_key_id: Optional[str] = None,
                org_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApiKeyResult:
    """
    ## Example Usage


    :param str api_key_id: Unique identifier for the organization API key.
    :param str org_id: Unique identifier for the organization.
    """
    __args__ = dict()
    __args__['apiKeyId'] = api_key_id
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getApiKey:getApiKey', __args__, opts=opts, typ=GetApiKeyResult).value

    return AwaitableGetApiKeyResult(
        api_key_id=pulumi.get(__ret__, 'api_key_id'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        public_key=pulumi.get(__ret__, 'public_key'),
        role_names=pulumi.get(__ret__, 'role_names'))
def get_api_key_output(api_key_id: Optional[pulumi.Input[str]] = None,
                       org_id: Optional[pulumi.Input[str]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetApiKeyResult]:
    """
    ## Example Usage


    :param str api_key_id: Unique identifier for the organization API key.
    :param str org_id: Unique identifier for the organization.
    """
    __args__ = dict()
    __args__['apiKeyId'] = api_key_id
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getApiKey:getApiKey', __args__, opts=opts, typ=GetApiKeyResult)
    return __ret__.apply(lambda __response__: GetApiKeyResult(
        api_key_id=pulumi.get(__response__, 'api_key_id'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        public_key=pulumi.get(__response__, 'public_key'),
        role_names=pulumi.get(__response__, 'role_names')))
