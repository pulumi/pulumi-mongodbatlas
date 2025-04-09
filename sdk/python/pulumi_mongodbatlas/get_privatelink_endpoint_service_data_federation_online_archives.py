# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> builtins.str:
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


def get_privatelink_endpoint_service_data_federation_online_archives(project_id: Optional[builtins.str] = None,
                                                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult:
    """
    ## # Data Source: get_privatelink_endpoint_service_data_federation_online_archives

    `get_privatelink_endpoint_service_data_federation_online_archives` describes Private Endpoint Service resources for Data Federation and Online Archive.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    atlas_project = mongodbatlas.Project("atlas-project",
        org_id=atlas_org_id,
        name=atlas_project_name)
    test = mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test",
        project_id=atlas_project.id,
        endpoint_id="vpce-046cf43c79424d4c9",
        provider_name="AWS",
        comment="Test",
        region="US_EAST_1",
        customer_endpoint_dns_name="vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com")
    test_data_source = mongodbatlas.get_privatelink_endpoint_service_data_federation_online_archives_output(project_id=atlas_project.id)
    ```


    :param builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives', __args__, opts=opts, typ=GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult).value

    return AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))
def get_privatelink_endpoint_service_data_federation_online_archives_output(project_id: Optional[pulumi.Input[builtins.str]] = None,
                                                                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult]:
    """
    ## # Data Source: get_privatelink_endpoint_service_data_federation_online_archives

    `get_privatelink_endpoint_service_data_federation_online_archives` describes Private Endpoint Service resources for Data Federation and Online Archive.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    atlas_project = mongodbatlas.Project("atlas-project",
        org_id=atlas_org_id,
        name=atlas_project_name)
    test = mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test",
        project_id=atlas_project.id,
        endpoint_id="vpce-046cf43c79424d4c9",
        provider_name="AWS",
        comment="Test",
        region="US_EAST_1",
        customer_endpoint_dns_name="vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com")
    test_data_source = mongodbatlas.get_privatelink_endpoint_service_data_federation_online_archives_output(project_id=atlas_project.id)
    ```


    :param builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives', __args__, opts=opts, typ=GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult)
    return __ret__.apply(lambda __response__: GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results')))
