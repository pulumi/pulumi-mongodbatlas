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
    'GetAccessListApiKeysResult',
    'AwaitableGetAccessListApiKeysResult',
    'get_access_list_api_keys',
    'get_access_list_api_keys_output',
]

@pulumi.output_type
class GetAccessListApiKeysResult:
    """
    A collection of values returned by getAccessListApiKeys.
    """
    def __init__(__self__, api_key_id=None, id=None, items_per_page=None, org_id=None, page_num=None, results=None):
        if api_key_id and not isinstance(api_key_id, str):
            raise TypeError("Expected argument 'api_key_id' to be a str")
        pulumi.set(__self__, "api_key_id", api_key_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items_per_page and not isinstance(items_per_page, int):
            raise TypeError("Expected argument 'items_per_page' to be a int")
        pulumi.set(__self__, "items_per_page", items_per_page)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if page_num and not isinstance(page_num, int):
            raise TypeError("Expected argument 'page_num' to be a int")
        pulumi.set(__self__, "page_num", page_num)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> str:
        return pulumi.get(self, "api_key_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="itemsPerPage")
    def items_per_page(self) -> Optional[int]:
        return pulumi.get(self, "items_per_page")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="pageNum")
    def page_num(self) -> Optional[int]:
        return pulumi.get(self, "page_num")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetAccessListApiKeysResultResult']:
        return pulumi.get(self, "results")


class AwaitableGetAccessListApiKeysResult(GetAccessListApiKeysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessListApiKeysResult(
            api_key_id=self.api_key_id,
            id=self.id,
            items_per_page=self.items_per_page,
            org_id=self.org_id,
            page_num=self.page_num,
            results=self.results)


def get_access_list_api_keys(api_key_id: Optional[str] = None,
                             items_per_page: Optional[int] = None,
                             org_id: Optional[str] = None,
                             page_num: Optional[int] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessListApiKeysResult:
    """
    ## Example Usage


    :param int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param int page_num: The page to return. Defaults to `1`.
    """
    __args__ = dict()
    __args__['apiKeyId'] = api_key_id
    __args__['itemsPerPage'] = items_per_page
    __args__['orgId'] = org_id
    __args__['pageNum'] = page_num
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys', __args__, opts=opts, typ=GetAccessListApiKeysResult).value

    return AwaitableGetAccessListApiKeysResult(
        api_key_id=pulumi.get(__ret__, 'api_key_id'),
        id=pulumi.get(__ret__, 'id'),
        items_per_page=pulumi.get(__ret__, 'items_per_page'),
        org_id=pulumi.get(__ret__, 'org_id'),
        page_num=pulumi.get(__ret__, 'page_num'),
        results=pulumi.get(__ret__, 'results'))
def get_access_list_api_keys_output(api_key_id: Optional[pulumi.Input[str]] = None,
                                    items_per_page: Optional[pulumi.Input[Optional[int]]] = None,
                                    org_id: Optional[pulumi.Input[str]] = None,
                                    page_num: Optional[pulumi.Input[Optional[int]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessListApiKeysResult]:
    """
    ## Example Usage


    :param int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param int page_num: The page to return. Defaults to `1`.
    """
    __args__ = dict()
    __args__['apiKeyId'] = api_key_id
    __args__['itemsPerPage'] = items_per_page
    __args__['orgId'] = org_id
    __args__['pageNum'] = page_num
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys', __args__, opts=opts, typ=GetAccessListApiKeysResult)
    return __ret__.apply(lambda __response__: GetAccessListApiKeysResult(
        api_key_id=pulumi.get(__response__, 'api_key_id'),
        id=pulumi.get(__response__, 'id'),
        items_per_page=pulumi.get(__response__, 'items_per_page'),
        org_id=pulumi.get(__response__, 'org_id'),
        page_num=pulumi.get(__response__, 'page_num'),
        results=pulumi.get(__response__, 'results')))
