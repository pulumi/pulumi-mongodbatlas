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
    'GetOrganizationsResult',
    'AwaitableGetOrganizationsResult',
    'get_organizations',
    'get_organizations_output',
]

@pulumi.output_type
class GetOrganizationsResult:
    """
    A collection of values returned by getOrganizations.
    """
    def __init__(__self__, id=None, include_deleted_orgs=None, items_per_page=None, name=None, page_num=None, results=None, total_count=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_deleted_orgs and not isinstance(include_deleted_orgs, bool):
            raise TypeError("Expected argument 'include_deleted_orgs' to be a bool")
        pulumi.set(__self__, "include_deleted_orgs", include_deleted_orgs)
        if items_per_page and not isinstance(items_per_page, int):
            raise TypeError("Expected argument 'items_per_page' to be a int")
        pulumi.set(__self__, "items_per_page", items_per_page)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if page_num and not isinstance(page_num, int):
            raise TypeError("Expected argument 'page_num' to be a int")
        pulumi.set(__self__, "page_num", page_num)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)
        if total_count and not isinstance(total_count, int):
            raise TypeError("Expected argument 'total_count' to be a int")
        pulumi.set(__self__, "total_count", total_count)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="includeDeletedOrgs")
    def include_deleted_orgs(self) -> Optional[bool]:
        return pulumi.get(self, "include_deleted_orgs")

    @property
    @pulumi.getter(name="itemsPerPage")
    def items_per_page(self) -> Optional[int]:
        return pulumi.get(self, "items_per_page")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pageNum")
    def page_num(self) -> Optional[int]:
        return pulumi.get(self, "page_num")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetOrganizationsResultResult']:
        return pulumi.get(self, "results")

    @property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> int:
        return pulumi.get(self, "total_count")


class AwaitableGetOrganizationsResult(GetOrganizationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationsResult(
            id=self.id,
            include_deleted_orgs=self.include_deleted_orgs,
            items_per_page=self.items_per_page,
            name=self.name,
            page_num=self.page_num,
            results=self.results,
            total_count=self.total_count)


def get_organizations(include_deleted_orgs: Optional[bool] = None,
                      items_per_page: Optional[int] = None,
                      name: Optional[str] = None,
                      page_num: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationsResult:
    """
    `get_organizations` describe all MongoDB Atlas Organizations. This represents organizations that have been created.


    :param int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param str name: Human-readable label that identifies the organization.
    :param int page_num: The page to return. Defaults to `1`.
    """
    __args__ = dict()
    __args__['includeDeletedOrgs'] = include_deleted_orgs
    __args__['itemsPerPage'] = items_per_page
    __args__['name'] = name
    __args__['pageNum'] = page_num
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getOrganizations:getOrganizations', __args__, opts=opts, typ=GetOrganizationsResult).value

    return AwaitableGetOrganizationsResult(
        id=pulumi.get(__ret__, 'id'),
        include_deleted_orgs=pulumi.get(__ret__, 'include_deleted_orgs'),
        items_per_page=pulumi.get(__ret__, 'items_per_page'),
        name=pulumi.get(__ret__, 'name'),
        page_num=pulumi.get(__ret__, 'page_num'),
        results=pulumi.get(__ret__, 'results'),
        total_count=pulumi.get(__ret__, 'total_count'))


@_utilities.lift_output_func(get_organizations)
def get_organizations_output(include_deleted_orgs: Optional[pulumi.Input[Optional[bool]]] = None,
                             items_per_page: Optional[pulumi.Input[Optional[int]]] = None,
                             name: Optional[pulumi.Input[Optional[str]]] = None,
                             page_num: Optional[pulumi.Input[Optional[int]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOrganizationsResult]:
    """
    `get_organizations` describe all MongoDB Atlas Organizations. This represents organizations that have been created.


    :param int items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param str name: Human-readable label that identifies the organization.
    :param int page_num: The page to return. Defaults to `1`.
    """
    ...
