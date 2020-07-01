# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetProjectsResult:
    """
    A collection of values returned by getProjects.
    """
    def __init__(__self__, id=None, items_per_page=None, page_num=None, results=None, total_count=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if items_per_page and not isinstance(items_per_page, float):
            raise TypeError("Expected argument 'items_per_page' to be a float")
        __self__.items_per_page = items_per_page
        if page_num and not isinstance(page_num, float):
            raise TypeError("Expected argument 'page_num' to be a float")
        __self__.page_num = page_num
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        __self__.results = results
        if total_count and not isinstance(total_count, float):
            raise TypeError("Expected argument 'total_count' to be a float")
        __self__.total_count = total_count
class AwaitableGetProjectsResult(GetProjectsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectsResult(
            id=self.id,
            items_per_page=self.items_per_page,
            page_num=self.page_num,
            results=self.results,
            total_count=self.total_count)

def get_projects(items_per_page=None,page_num=None,opts=None):
    """
    `getProjects` describe all Projects. This represents projects that have been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param float items_per_page: Number of items to return per page, up to a maximum of 500. Defaults to `100`.
    :param float page_num: The page to return. Defaults to `1`.
    """
    __args__ = dict()


    __args__['itemsPerPage'] = items_per_page
    __args__['pageNum'] = page_num
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getProjects:getProjects', __args__, opts=opts).value

    return AwaitableGetProjectsResult(
        id=__ret__.get('id'),
        items_per_page=__ret__.get('itemsPerPage'),
        page_num=__ret__.get('pageNum'),
        results=__ret__.get('results'),
        total_count=__ret__.get('totalCount'))
