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
    'GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult',
    'AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult',
    'get_privatelink_endpoint_service_data_federation_online_archives',
    'get_privatelink_endpoint_service_data_federation_online_archives_output',
]

@pulumi.output_type
class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult:
    """
    A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchives.
    """
    def __init__(__self__, id=None, project_id=None, results=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
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
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultResult']:
        """
        A list where each represents a Private Endpoint Service
        """
        return pulumi.get(self, "results")


class AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_privatelink_endpoint_service_data_federation_online_archives(project_id: Optional[str] = None,
                                                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult:
    """
    `get_privatelink_endpoint_service_data_federation_online_archives` describes Private Endpoint Service resources for Data Federation and Online Archive.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    atlas_project = mongodbatlas.Project("atlas-project", org_id=var["atlas_org_id"])
    test = mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test",
        project_id=atlas_project.id,
        endpoint_id="<PRIVATE-ENDPOINT-SERVICE-ID>",
        provider_name="AWS",
        comment="Test")
    test_data_source = mongodbatlas.get_privatelink_endpoint_service_data_federation_online_archives_output(project_id=atlas_project.id)
    ```
    <!--End PulumiCodeChooser -->


    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives', __args__, opts=opts, typ=GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult).value

    return AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))


@_utilities.lift_output_func(get_privatelink_endpoint_service_data_federation_online_archives)
def get_privatelink_endpoint_service_data_federation_online_archives_output(project_id: Optional[pulumi.Input[str]] = None,
                                                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult]:
    """
    `get_privatelink_endpoint_service_data_federation_online_archives` describes Private Endpoint Service resources for Data Federation and Online Archive.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    atlas_project = mongodbatlas.Project("atlas-project", org_id=var["atlas_org_id"])
    test = mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test",
        project_id=atlas_project.id,
        endpoint_id="<PRIVATE-ENDPOINT-SERVICE-ID>",
        provider_name="AWS",
        comment="Test")
    test_data_source = mongodbatlas.get_privatelink_endpoint_service_data_federation_online_archives_output(project_id=atlas_project.id)
    ```
    <!--End PulumiCodeChooser -->


    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    ...
