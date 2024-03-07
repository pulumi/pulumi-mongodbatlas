# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetPrivatelinkEndpointsServiceServerlessResult',
    'AwaitableGetPrivatelinkEndpointsServiceServerlessResult',
    'get_privatelink_endpoints_service_serverless',
    'get_privatelink_endpoints_service_serverless_output',
]

@pulumi.output_type
class GetPrivatelinkEndpointsServiceServerlessResult:
    """
    A collection of values returned by getPrivatelinkEndpointsServiceServerless.
    """
    def __init__(__self__, id=None, instance_name=None, items_per_page=None, page_num=None, project_id=None, results=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_name and not isinstance(instance_name, str):
            raise TypeError("Expected argument 'instance_name' to be a str")
        pulumi.set(__self__, "instance_name", instance_name)
        if items_per_page and not isinstance(items_per_page, int):
            raise TypeError("Expected argument 'items_per_page' to be a int")
        pulumi.set(__self__, "items_per_page", items_per_page)
        if page_num and not isinstance(page_num, int):
            raise TypeError("Expected argument 'page_num' to be a int")
        pulumi.set(__self__, "page_num", page_num)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="itemsPerPage")
    def items_per_page(self) -> Optional[int]:
        return pulumi.get(self, "items_per_page")

    @property
    @pulumi.getter(name="pageNum")
    def page_num(self) -> Optional[int]:
        return pulumi.get(self, "page_num")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetPrivatelinkEndpointsServiceServerlessResultResult']:
        """
        Each element in the `result` array is one private serverless endpoint.
        """
        return pulumi.get(self, "results")


class AwaitableGetPrivatelinkEndpointsServiceServerlessResult(GetPrivatelinkEndpointsServiceServerlessResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivatelinkEndpointsServiceServerlessResult(
            id=self.id,
            instance_name=self.instance_name,
            items_per_page=self.items_per_page,
            page_num=self.page_num,
            project_id=self.project_id,
            results=self.results)


def get_privatelink_endpoints_service_serverless(instance_name: Optional[str] = None,
                                                 items_per_page: Optional[int] = None,
                                                 page_num: Optional[int] = None,
                                                 project_id: Optional[str] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivatelinkEndpointsServiceServerlessResult:
    """
    `privatelink_endpoints_service_serverless` Describes the list of all Serverless PrivateLink Endpoint Service resource.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example with AWS

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_serverless_instance = mongodbatlas.ServerlessInstance("testServerlessInstance",
        project_id="<PROJECT_ID>",
        provider_settings_backing_provider_name="AWS",
        provider_settings_provider_name="SERVERLESS",
        provider_settings_region_name="US_EAST_1",
        continuous_backup_enabled=True)
    test_privatelink_endpoints_service_serverless = mongodbatlas.get_privatelink_endpoints_service_serverless_output(project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name)
    test_privatelink_endpoint_serverless = mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless",
        project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name,
        provider_name="AWS")
    test_privatelink_endpoint_service_serverless = mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless",
        project_id="<PROJECT_ID>",
        instance_name="test-db",
        endpoint_id=test_privatelink_endpoint_serverless.endpoint_id,
        provider_name="AWS",
        comment="New serverless endpoint")
    ```
    <!--End PulumiCodeChooser -->

    ## Example with AZURE

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_serverless_instance = mongodbatlas.ServerlessInstance("testServerlessInstance",
        project_id="<PROJECT_ID>",
        provider_settings_backing_provider_name="AZURE",
        provider_settings_provider_name="SERVERLESS",
        provider_settings_region_name="US_EAST",
        continuous_backup_enabled=True)
    test_privatelink_endpoints_service_serverless = mongodbatlas.get_privatelink_endpoints_service_serverless_output(project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name)
    test_privatelink_endpoint_serverless = mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless",
        project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name,
        provider_name="AZURE")
    test_privatelink_endpoint_service_serverless = mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless",
        project_id="<PROJECT_ID>",
        instance_name="test-db",
        endpoint_id=test_privatelink_endpoint_serverless.endpoint_id,
        provider_name="AZURE",
        comment="New serverless endpoint")
    ```
    <!--End PulumiCodeChooser -->


    :param str instance_name: Human-readable label that identifies the serverless instance
    :param str project_id: Unique 24-digit hexadecimal string that identifies the project.
    """
    __args__ = dict()
    __args__['instanceName'] = instance_name
    __args__['itemsPerPage'] = items_per_page
    __args__['pageNum'] = page_num
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless', __args__, opts=opts, typ=GetPrivatelinkEndpointsServiceServerlessResult).value

    return AwaitableGetPrivatelinkEndpointsServiceServerlessResult(
        id=pulumi.get(__ret__, 'id'),
        instance_name=pulumi.get(__ret__, 'instance_name'),
        items_per_page=pulumi.get(__ret__, 'items_per_page'),
        page_num=pulumi.get(__ret__, 'page_num'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))


@_utilities.lift_output_func(get_privatelink_endpoints_service_serverless)
def get_privatelink_endpoints_service_serverless_output(instance_name: Optional[pulumi.Input[str]] = None,
                                                        items_per_page: Optional[pulumi.Input[Optional[int]]] = None,
                                                        page_num: Optional[pulumi.Input[Optional[int]]] = None,
                                                        project_id: Optional[pulumi.Input[str]] = None,
                                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivatelinkEndpointsServiceServerlessResult]:
    """
    `privatelink_endpoints_service_serverless` Describes the list of all Serverless PrivateLink Endpoint Service resource.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example with AWS

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_serverless_instance = mongodbatlas.ServerlessInstance("testServerlessInstance",
        project_id="<PROJECT_ID>",
        provider_settings_backing_provider_name="AWS",
        provider_settings_provider_name="SERVERLESS",
        provider_settings_region_name="US_EAST_1",
        continuous_backup_enabled=True)
    test_privatelink_endpoints_service_serverless = mongodbatlas.get_privatelink_endpoints_service_serverless_output(project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name)
    test_privatelink_endpoint_serverless = mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless",
        project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name,
        provider_name="AWS")
    test_privatelink_endpoint_service_serverless = mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless",
        project_id="<PROJECT_ID>",
        instance_name="test-db",
        endpoint_id=test_privatelink_endpoint_serverless.endpoint_id,
        provider_name="AWS",
        comment="New serverless endpoint")
    ```
    <!--End PulumiCodeChooser -->

    ## Example with AZURE

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_serverless_instance = mongodbatlas.ServerlessInstance("testServerlessInstance",
        project_id="<PROJECT_ID>",
        provider_settings_backing_provider_name="AZURE",
        provider_settings_provider_name="SERVERLESS",
        provider_settings_region_name="US_EAST",
        continuous_backup_enabled=True)
    test_privatelink_endpoints_service_serverless = mongodbatlas.get_privatelink_endpoints_service_serverless_output(project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name)
    test_privatelink_endpoint_serverless = mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless",
        project_id="<PROJECT_ID>",
        instance_name=test_serverless_instance.name,
        provider_name="AZURE")
    test_privatelink_endpoint_service_serverless = mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless",
        project_id="<PROJECT_ID>",
        instance_name="test-db",
        endpoint_id=test_privatelink_endpoint_serverless.endpoint_id,
        provider_name="AZURE",
        comment="New serverless endpoint")
    ```
    <!--End PulumiCodeChooser -->


    :param str instance_name: Human-readable label that identifies the serverless instance
    :param str project_id: Unique 24-digit hexadecimal string that identifies the project.
    """
    ...
