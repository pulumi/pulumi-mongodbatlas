# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetPrivateLinkEndpointServiceResult',
    'AwaitableGetPrivateLinkEndpointServiceResult',
    'get_private_link_endpoint_service',
    'get_private_link_endpoint_service_output',
]

@pulumi.output_type
class GetPrivateLinkEndpointServiceResult:
    """
    A collection of values returned by getPrivateLinkEndpointService.
    """
    def __init__(__self__, aws_connection_status=None, azure_status=None, delete_requested=None, endpoint_service_id=None, endpoints=None, error_message=None, gcp_status=None, id=None, interface_endpoint_id=None, private_endpoint_connection_name=None, private_endpoint_ip_address=None, private_endpoint_resource_id=None, private_link_id=None, project_id=None, provider_name=None):
        if aws_connection_status and not isinstance(aws_connection_status, str):
            raise TypeError("Expected argument 'aws_connection_status' to be a str")
        pulumi.set(__self__, "aws_connection_status", aws_connection_status)
        if azure_status and not isinstance(azure_status, str):
            raise TypeError("Expected argument 'azure_status' to be a str")
        pulumi.set(__self__, "azure_status", azure_status)
        if delete_requested and not isinstance(delete_requested, bool):
            raise TypeError("Expected argument 'delete_requested' to be a bool")
        pulumi.set(__self__, "delete_requested", delete_requested)
        if endpoint_service_id and not isinstance(endpoint_service_id, str):
            raise TypeError("Expected argument 'endpoint_service_id' to be a str")
        pulumi.set(__self__, "endpoint_service_id", endpoint_service_id)
        if endpoints and not isinstance(endpoints, list):
            raise TypeError("Expected argument 'endpoints' to be a list")
        pulumi.set(__self__, "endpoints", endpoints)
        if error_message and not isinstance(error_message, str):
            raise TypeError("Expected argument 'error_message' to be a str")
        pulumi.set(__self__, "error_message", error_message)
        if gcp_status and not isinstance(gcp_status, str):
            raise TypeError("Expected argument 'gcp_status' to be a str")
        pulumi.set(__self__, "gcp_status", gcp_status)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interface_endpoint_id and not isinstance(interface_endpoint_id, str):
            raise TypeError("Expected argument 'interface_endpoint_id' to be a str")
        pulumi.set(__self__, "interface_endpoint_id", interface_endpoint_id)
        if private_endpoint_connection_name and not isinstance(private_endpoint_connection_name, str):
            raise TypeError("Expected argument 'private_endpoint_connection_name' to be a str")
        pulumi.set(__self__, "private_endpoint_connection_name", private_endpoint_connection_name)
        if private_endpoint_ip_address and not isinstance(private_endpoint_ip_address, str):
            raise TypeError("Expected argument 'private_endpoint_ip_address' to be a str")
        pulumi.set(__self__, "private_endpoint_ip_address", private_endpoint_ip_address)
        if private_endpoint_resource_id and not isinstance(private_endpoint_resource_id, str):
            raise TypeError("Expected argument 'private_endpoint_resource_id' to be a str")
        pulumi.set(__self__, "private_endpoint_resource_id", private_endpoint_resource_id)
        if private_link_id and not isinstance(private_link_id, str):
            raise TypeError("Expected argument 'private_link_id' to be a str")
        pulumi.set(__self__, "private_link_id", private_link_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)

    @_builtins.property
    @pulumi.getter(name="awsConnectionStatus")
    def aws_connection_status(self) -> _builtins.str:
        """
        Status of the interface endpoint for AWS.
        Returns one of the following values:
        * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
        * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
        * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
        * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
        * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
        * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
        """
        return pulumi.get(self, "aws_connection_status")

    @_builtins.property
    @pulumi.getter(name="azureStatus")
    def azure_status(self) -> _builtins.str:
        """
        Status of the interface endpoint for AZURE.
        Returns one of the following values:
        * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
        * `AVAILABLE` - Atlas approved the connection to your private endpoint.
        * `FAILED` - Atlas failed to accept the connection your private endpoint.
        * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
        """
        return pulumi.get(self, "azure_status")

    @_builtins.property
    @pulumi.getter(name="deleteRequested")
    def delete_requested(self) -> _builtins.bool:
        """
        Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        """
        return pulumi.get(self, "delete_requested")

    @_builtins.property
    @pulumi.getter(name="endpointServiceId")
    def endpoint_service_id(self) -> _builtins.str:
        return pulumi.get(self, "endpoint_service_id")

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> Sequence['outputs.GetPrivateLinkEndpointServiceEndpointResult']:
        """
        Collection of individual private endpoints that comprise your network endpoint group.
        """
        return pulumi.get(self, "endpoints")

    @_builtins.property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> _builtins.str:
        """
        Error message pertaining to the interface endpoint. Returns null if there are no errors.
        """
        return pulumi.get(self, "error_message")

    @_builtins.property
    @pulumi.getter(name="gcpStatus")
    def gcp_status(self) -> _builtins.str:
        """
        Status of the interface endpoint for GCP.
        Returns one of the following values:
        * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
        * `AVAILABLE` - Atlas approved the connection to your private endpoint.
        * `FAILED` - Atlas failed to accept the connection your private endpoint.
        * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
        """
        return pulumi.get(self, "gcp_status")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="interfaceEndpointId")
    def interface_endpoint_id(self) -> _builtins.str:
        """
        Unique identifier of the interface endpoint.
        """
        return pulumi.get(self, "interface_endpoint_id")

    @_builtins.property
    @pulumi.getter(name="privateEndpointConnectionName")
    def private_endpoint_connection_name(self) -> _builtins.str:
        """
        Name of the connection for this private endpoint that Atlas generates.
        """
        return pulumi.get(self, "private_endpoint_connection_name")

    @_builtins.property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> _builtins.str:
        """
        Private IP address of the private endpoint network interface.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @_builtins.property
    @pulumi.getter(name="privateEndpointResourceId")
    def private_endpoint_resource_id(self) -> _builtins.str:
        """
        Unique identifier of the private endpoint.
        """
        return pulumi.get(self, "private_endpoint_resource_id")

    @_builtins.property
    @pulumi.getter(name="privateLinkId")
    def private_link_id(self) -> _builtins.str:
        return pulumi.get(self, "private_link_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> _builtins.str:
        return pulumi.get(self, "provider_name")


class AwaitableGetPrivateLinkEndpointServiceResult(GetPrivateLinkEndpointServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateLinkEndpointServiceResult(
            aws_connection_status=self.aws_connection_status,
            azure_status=self.azure_status,
            delete_requested=self.delete_requested,
            endpoint_service_id=self.endpoint_service_id,
            endpoints=self.endpoints,
            error_message=self.error_message,
            gcp_status=self.gcp_status,
            id=self.id,
            interface_endpoint_id=self.interface_endpoint_id,
            private_endpoint_connection_name=self.private_endpoint_connection_name,
            private_endpoint_ip_address=self.private_endpoint_ip_address,
            private_endpoint_resource_id=self.private_endpoint_resource_id,
            private_link_id=self.private_link_id,
            project_id=self.project_id,
            provider_name=self.provider_name)


def get_private_link_endpoint_service(endpoint_service_id: Optional[_builtins.str] = None,
                                      private_link_id: Optional[_builtins.str] = None,
                                      project_id: Optional[_builtins.str] = None,
                                      provider_name: Optional[_builtins.str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivateLinkEndpointServiceResult:
    """
    ## # Data Source: PrivateLinkEndpointService

    `PrivateLinkEndpointService` describes a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.


    :param _builtins.str endpoint_service_id: Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
    :param _builtins.str private_link_id: Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
    :param _builtins.str project_id: Unique identifier for the project.
    :param _builtins.str provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
    """
    __args__ = dict()
    __args__['endpointServiceId'] = endpoint_service_id
    __args__['privateLinkId'] = private_link_id
    __args__['projectId'] = project_id
    __args__['providerName'] = provider_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getPrivateLinkEndpointService:getPrivateLinkEndpointService', __args__, opts=opts, typ=GetPrivateLinkEndpointServiceResult).value

    return AwaitableGetPrivateLinkEndpointServiceResult(
        aws_connection_status=pulumi.get(__ret__, 'aws_connection_status'),
        azure_status=pulumi.get(__ret__, 'azure_status'),
        delete_requested=pulumi.get(__ret__, 'delete_requested'),
        endpoint_service_id=pulumi.get(__ret__, 'endpoint_service_id'),
        endpoints=pulumi.get(__ret__, 'endpoints'),
        error_message=pulumi.get(__ret__, 'error_message'),
        gcp_status=pulumi.get(__ret__, 'gcp_status'),
        id=pulumi.get(__ret__, 'id'),
        interface_endpoint_id=pulumi.get(__ret__, 'interface_endpoint_id'),
        private_endpoint_connection_name=pulumi.get(__ret__, 'private_endpoint_connection_name'),
        private_endpoint_ip_address=pulumi.get(__ret__, 'private_endpoint_ip_address'),
        private_endpoint_resource_id=pulumi.get(__ret__, 'private_endpoint_resource_id'),
        private_link_id=pulumi.get(__ret__, 'private_link_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_name=pulumi.get(__ret__, 'provider_name'))
def get_private_link_endpoint_service_output(endpoint_service_id: Optional[pulumi.Input[_builtins.str]] = None,
                                             private_link_id: Optional[pulumi.Input[_builtins.str]] = None,
                                             project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                             provider_name: Optional[pulumi.Input[_builtins.str]] = None,
                                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPrivateLinkEndpointServiceResult]:
    """
    ## # Data Source: PrivateLinkEndpointService

    `PrivateLinkEndpointService` describes a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.


    :param _builtins.str endpoint_service_id: Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
    :param _builtins.str private_link_id: Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
    :param _builtins.str project_id: Unique identifier for the project.
    :param _builtins.str provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
    """
    __args__ = dict()
    __args__['endpointServiceId'] = endpoint_service_id
    __args__['privateLinkId'] = private_link_id
    __args__['projectId'] = project_id
    __args__['providerName'] = provider_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getPrivateLinkEndpointService:getPrivateLinkEndpointService', __args__, opts=opts, typ=GetPrivateLinkEndpointServiceResult)
    return __ret__.apply(lambda __response__: GetPrivateLinkEndpointServiceResult(
        aws_connection_status=pulumi.get(__response__, 'aws_connection_status'),
        azure_status=pulumi.get(__response__, 'azure_status'),
        delete_requested=pulumi.get(__response__, 'delete_requested'),
        endpoint_service_id=pulumi.get(__response__, 'endpoint_service_id'),
        endpoints=pulumi.get(__response__, 'endpoints'),
        error_message=pulumi.get(__response__, 'error_message'),
        gcp_status=pulumi.get(__response__, 'gcp_status'),
        id=pulumi.get(__response__, 'id'),
        interface_endpoint_id=pulumi.get(__response__, 'interface_endpoint_id'),
        private_endpoint_connection_name=pulumi.get(__response__, 'private_endpoint_connection_name'),
        private_endpoint_ip_address=pulumi.get(__response__, 'private_endpoint_ip_address'),
        private_endpoint_resource_id=pulumi.get(__response__, 'private_endpoint_resource_id'),
        private_link_id=pulumi.get(__response__, 'private_link_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        provider_name=pulumi.get(__response__, 'provider_name')))
