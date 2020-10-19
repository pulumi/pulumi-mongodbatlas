# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs

__all__ = [
    'GetNetworkPeeringsResult',
    'AwaitableGetNetworkPeeringsResult',
    'get_network_peerings',
]

@pulumi.output_type
class GetNetworkPeeringsResult:
    """
    A collection of values returned by getNetworkPeerings.
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
    def results(self) -> Sequence['outputs.GetNetworkPeeringsResultResult']:
        """
        A list where each represents a Network Peering Connection.
        """
        return pulumi.get(self, "results")


class AwaitableGetNetworkPeeringsResult(GetNetworkPeeringsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkPeeringsResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_network_peerings(project_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkPeeringsResult:
    """
    `getNetworkPeerings` describes all Network Peering Connections.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.

    ## Example Usage
    ### Basic Example (AWS).

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_network_peering = mongodbatlas.NetworkPeering("testNetworkPeering",
        accepter_region_name="us-east-1",
        project_id="<YOUR-PROJEC-ID>",
        container_id="507f1f77bcf86cd799439011",
        provider_name="AWS",
        route_table_cidr_block="192.168.0.0/24",
        vpc_id="vpc-abc123abc123",
        aws_account_id="abc123abc123")
    test_network_peerings = test_network_peering.project_id.apply(lambda project_id: mongodbatlas.get_network_peerings(project_id=project_id))
    ```


    :param str project_id: The unique ID for the project to create the database user.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getNetworkPeerings:getNetworkPeerings', __args__, opts=opts, typ=GetNetworkPeeringsResult).value

    return AwaitableGetNetworkPeeringsResult(
        id=__ret__.id,
        project_id=__ret__.project_id,
        results=__ret__.results)
