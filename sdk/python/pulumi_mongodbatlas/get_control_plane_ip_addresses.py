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
    'GetControlPlaneIpAddressesResult',
    'AwaitableGetControlPlaneIpAddressesResult',
    'get_control_plane_ip_addresses',
    'get_control_plane_ip_addresses_output',
]

@pulumi.output_type
class GetControlPlaneIpAddressesResult:
    """
    A collection of values returned by getControlPlaneIpAddresses.
    """
    def __init__(__self__, id=None, inbound=None, outbound=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if inbound and not isinstance(inbound, dict):
            raise TypeError("Expected argument 'inbound' to be a dict")
        pulumi.set(__self__, "inbound", inbound)
        if outbound and not isinstance(outbound, dict):
            raise TypeError("Expected argument 'outbound' to be a dict")
        pulumi.set(__self__, "outbound", outbound)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def inbound(self) -> 'outputs.GetControlPlaneIpAddressesInboundResult':
        """
        List of inbound IP addresses to the Atlas control plane, categorized by cloud provider. If your application allows outbound HTTP requests only to specific IP addresses, you must allow access to the following IP addresses so that your API requests can reach the Atlas control plane.
        """
        return pulumi.get(self, "inbound")

    @property
    @pulumi.getter
    def outbound(self) -> 'outputs.GetControlPlaneIpAddressesOutboundResult':
        """
        List of outbound IP addresses from the Atlas control plane, categorized by cloud provider. If your network allows inbound HTTP requests only from specific IP addresses, you must allow access from the following IP addresses so that Atlas can communicate with your webhooks and KMS.
        """
        return pulumi.get(self, "outbound")


class AwaitableGetControlPlaneIpAddressesResult(GetControlPlaneIpAddressesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetControlPlaneIpAddressesResult(
            id=self.id,
            inbound=self.inbound,
            outbound=self.outbound)


def get_control_plane_ip_addresses(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetControlPlaneIpAddressesResult:
    """
    ## # Data Source: get_control_plane_ip_addresses

    `get_control_plane_ip_addresses` returns all control plane IP addresses.

    ## Example Usage

    ### S
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_control_plane_ip_addresses()
    pulumi.export("outbound-aws-ip-addresses", test.outbound.aws)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getControlPlaneIpAddresses:getControlPlaneIpAddresses', __args__, opts=opts, typ=GetControlPlaneIpAddressesResult).value

    return AwaitableGetControlPlaneIpAddressesResult(
        id=pulumi.get(__ret__, 'id'),
        inbound=pulumi.get(__ret__, 'inbound'),
        outbound=pulumi.get(__ret__, 'outbound'))
def get_control_plane_ip_addresses_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetControlPlaneIpAddressesResult]:
    """
    ## # Data Source: get_control_plane_ip_addresses

    `get_control_plane_ip_addresses` returns all control plane IP addresses.

    ## Example Usage

    ### S
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_control_plane_ip_addresses()
    pulumi.export("outbound-aws-ip-addresses", test.outbound.aws)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getControlPlaneIpAddresses:getControlPlaneIpAddresses', __args__, opts=opts, typ=GetControlPlaneIpAddressesResult)
    return __ret__.apply(lambda __response__: GetControlPlaneIpAddressesResult(
        id=pulumi.get(__response__, 'id'),
        inbound=pulumi.get(__response__, 'inbound'),
        outbound=pulumi.get(__response__, 'outbound')))
