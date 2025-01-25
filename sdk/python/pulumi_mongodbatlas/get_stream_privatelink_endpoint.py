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
    'GetStreamPrivatelinkEndpointResult',
    'AwaitableGetStreamPrivatelinkEndpointResult',
    'get_stream_privatelink_endpoint',
    'get_stream_privatelink_endpoint_output',
]

@pulumi.output_type
class GetStreamPrivatelinkEndpointResult:
    """
    A collection of values returned by getStreamPrivatelinkEndpoint.
    """
    def __init__(__self__, dns_domain=None, dns_sub_domains=None, id=None, interface_endpoint_id=None, project_id=None, provider_name=None, region=None, service_endpoint_id=None, state=None, vendor=None):
        if dns_domain and not isinstance(dns_domain, str):
            raise TypeError("Expected argument 'dns_domain' to be a str")
        pulumi.set(__self__, "dns_domain", dns_domain)
        if dns_sub_domains and not isinstance(dns_sub_domains, list):
            raise TypeError("Expected argument 'dns_sub_domains' to be a list")
        pulumi.set(__self__, "dns_sub_domains", dns_sub_domains)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interface_endpoint_id and not isinstance(interface_endpoint_id, str):
            raise TypeError("Expected argument 'interface_endpoint_id' to be a str")
        pulumi.set(__self__, "interface_endpoint_id", interface_endpoint_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if service_endpoint_id and not isinstance(service_endpoint_id, str):
            raise TypeError("Expected argument 'service_endpoint_id' to be a str")
        pulumi.set(__self__, "service_endpoint_id", service_endpoint_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if vendor and not isinstance(vendor, str):
            raise TypeError("Expected argument 'vendor' to be a str")
        pulumi.set(__self__, "vendor", vendor)

    @property
    @pulumi.getter(name="dnsDomain")
    def dns_domain(self) -> str:
        return pulumi.get(self, "dns_domain")

    @property
    @pulumi.getter(name="dnsSubDomains")
    def dns_sub_domains(self) -> Sequence[str]:
        return pulumi.get(self, "dns_sub_domains")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Private Link connection.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="interfaceEndpointId")
    def interface_endpoint_id(self) -> str:
        return pulumi.get(self, "interface_endpoint_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> str:
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceEndpointId")
    def service_endpoint_id(self) -> str:
        return pulumi.get(self, "service_endpoint_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def vendor(self) -> str:
        return pulumi.get(self, "vendor")


class AwaitableGetStreamPrivatelinkEndpointResult(GetStreamPrivatelinkEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamPrivatelinkEndpointResult(
            dns_domain=self.dns_domain,
            dns_sub_domains=self.dns_sub_domains,
            id=self.id,
            interface_endpoint_id=self.interface_endpoint_id,
            project_id=self.project_id,
            provider_name=self.provider_name,
            region=self.region,
            service_endpoint_id=self.service_endpoint_id,
            state=self.state,
            vendor=self.vendor)


def get_stream_privatelink_endpoint(id: Optional[str] = None,
                                    project_id: Optional[str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamPrivatelinkEndpointResult:
    """
    ## # Data Source: StreamPrivatelinkEndpoint

    `StreamPrivatelinkEndpoint` describes a Privatelink Endpoint for Streams.

    ## Example Usage


    :param str id: The ID of the Private Link connection.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getStreamPrivatelinkEndpoint:getStreamPrivatelinkEndpoint', __args__, opts=opts, typ=GetStreamPrivatelinkEndpointResult).value

    return AwaitableGetStreamPrivatelinkEndpointResult(
        dns_domain=pulumi.get(__ret__, 'dns_domain'),
        dns_sub_domains=pulumi.get(__ret__, 'dns_sub_domains'),
        id=pulumi.get(__ret__, 'id'),
        interface_endpoint_id=pulumi.get(__ret__, 'interface_endpoint_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_name=pulumi.get(__ret__, 'provider_name'),
        region=pulumi.get(__ret__, 'region'),
        service_endpoint_id=pulumi.get(__ret__, 'service_endpoint_id'),
        state=pulumi.get(__ret__, 'state'),
        vendor=pulumi.get(__ret__, 'vendor'))
def get_stream_privatelink_endpoint_output(id: Optional[pulumi.Input[str]] = None,
                                           project_id: Optional[pulumi.Input[str]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStreamPrivatelinkEndpointResult]:
    """
    ## # Data Source: StreamPrivatelinkEndpoint

    `StreamPrivatelinkEndpoint` describes a Privatelink Endpoint for Streams.

    ## Example Usage


    :param str id: The ID of the Private Link connection.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getStreamPrivatelinkEndpoint:getStreamPrivatelinkEndpoint', __args__, opts=opts, typ=GetStreamPrivatelinkEndpointResult)
    return __ret__.apply(lambda __response__: GetStreamPrivatelinkEndpointResult(
        dns_domain=pulumi.get(__response__, 'dns_domain'),
        dns_sub_domains=pulumi.get(__response__, 'dns_sub_domains'),
        id=pulumi.get(__response__, 'id'),
        interface_endpoint_id=pulumi.get(__response__, 'interface_endpoint_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        provider_name=pulumi.get(__response__, 'provider_name'),
        region=pulumi.get(__response__, 'region'),
        service_endpoint_id=pulumi.get(__response__, 'service_endpoint_id'),
        state=pulumi.get(__response__, 'state'),
        vendor=pulumi.get(__response__, 'vendor')))
