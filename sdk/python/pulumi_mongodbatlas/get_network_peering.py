# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetNetworkPeeringResult',
    'AwaitableGetNetworkPeeringResult',
    'get_network_peering',
    'get_network_peering_output',
]

@pulumi.output_type
class GetNetworkPeeringResult:
    """
    A collection of values returned by getNetworkPeering.
    """
    def __init__(__self__, accepter_region_name=None, atlas_cidr_block=None, atlas_id=None, aws_account_id=None, azure_directory_id=None, azure_subscription_id=None, connection_id=None, container_id=None, error_message=None, error_state=None, error_state_name=None, gcp_project_id=None, id=None, network_name=None, peering_id=None, project_id=None, provider_name=None, resource_group_name=None, route_table_cidr_block=None, status=None, status_name=None, vnet_name=None, vpc_id=None):
        if accepter_region_name and not isinstance(accepter_region_name, str):
            raise TypeError("Expected argument 'accepter_region_name' to be a str")
        pulumi.set(__self__, "accepter_region_name", accepter_region_name)
        if atlas_cidr_block and not isinstance(atlas_cidr_block, str):
            raise TypeError("Expected argument 'atlas_cidr_block' to be a str")
        pulumi.set(__self__, "atlas_cidr_block", atlas_cidr_block)
        if atlas_id and not isinstance(atlas_id, str):
            raise TypeError("Expected argument 'atlas_id' to be a str")
        pulumi.set(__self__, "atlas_id", atlas_id)
        if aws_account_id and not isinstance(aws_account_id, str):
            raise TypeError("Expected argument 'aws_account_id' to be a str")
        pulumi.set(__self__, "aws_account_id", aws_account_id)
        if azure_directory_id and not isinstance(azure_directory_id, str):
            raise TypeError("Expected argument 'azure_directory_id' to be a str")
        pulumi.set(__self__, "azure_directory_id", azure_directory_id)
        if azure_subscription_id and not isinstance(azure_subscription_id, str):
            raise TypeError("Expected argument 'azure_subscription_id' to be a str")
        pulumi.set(__self__, "azure_subscription_id", azure_subscription_id)
        if connection_id and not isinstance(connection_id, str):
            raise TypeError("Expected argument 'connection_id' to be a str")
        pulumi.set(__self__, "connection_id", connection_id)
        if container_id and not isinstance(container_id, str):
            raise TypeError("Expected argument 'container_id' to be a str")
        pulumi.set(__self__, "container_id", container_id)
        if error_message and not isinstance(error_message, str):
            raise TypeError("Expected argument 'error_message' to be a str")
        pulumi.set(__self__, "error_message", error_message)
        if error_state and not isinstance(error_state, str):
            raise TypeError("Expected argument 'error_state' to be a str")
        pulumi.set(__self__, "error_state", error_state)
        if error_state_name and not isinstance(error_state_name, str):
            raise TypeError("Expected argument 'error_state_name' to be a str")
        pulumi.set(__self__, "error_state_name", error_state_name)
        if gcp_project_id and not isinstance(gcp_project_id, str):
            raise TypeError("Expected argument 'gcp_project_id' to be a str")
        pulumi.set(__self__, "gcp_project_id", gcp_project_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if network_name and not isinstance(network_name, str):
            raise TypeError("Expected argument 'network_name' to be a str")
        pulumi.set(__self__, "network_name", network_name)
        if peering_id and not isinstance(peering_id, str):
            raise TypeError("Expected argument 'peering_id' to be a str")
        pulumi.set(__self__, "peering_id", peering_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if route_table_cidr_block and not isinstance(route_table_cidr_block, str):
            raise TypeError("Expected argument 'route_table_cidr_block' to be a str")
        pulumi.set(__self__, "route_table_cidr_block", route_table_cidr_block)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_name and not isinstance(status_name, str):
            raise TypeError("Expected argument 'status_name' to be a str")
        pulumi.set(__self__, "status_name", status_name)
        if vnet_name and not isinstance(vnet_name, str):
            raise TypeError("Expected argument 'vnet_name' to be a str")
        pulumi.set(__self__, "vnet_name", vnet_name)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="accepterRegionName")
    def accepter_region_name(self) -> str:
        """
        Specifies the region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        """
        return pulumi.get(self, "accepter_region_name")

    @property
    @pulumi.getter(name="atlasCidrBlock")
    def atlas_cidr_block(self) -> str:
        return pulumi.get(self, "atlas_cidr_block")

    @property
    @pulumi.getter(name="atlasId")
    def atlas_id(self) -> str:
        return pulumi.get(self, "atlas_id")

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> str:
        """
        Account ID of the owner of the peer VPC.
        """
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="azureDirectoryId")
    def azure_directory_id(self) -> str:
        """
        Unique identifier for an Azure AD directory.
        """
        return pulumi.get(self, "azure_directory_id")

    @property
    @pulumi.getter(name="azureSubscriptionId")
    def azure_subscription_id(self) -> str:
        """
        Unique identifer of the Azure subscription in which the VNet resides.
        """
        return pulumi.get(self, "azure_subscription_id")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> str:
        """
        Unique identifier for the peering connection.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> str:
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        When `"status" : "FAILED"`, Atlas provides a description of the error.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="errorState")
    def error_state(self) -> str:
        """
        Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
        """
        return pulumi.get(self, "error_state")

    @property
    @pulumi.getter(name="errorStateName")
    def error_state_name(self) -> str:
        """
        Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
        """
        return pulumi.get(self, "error_state_name")

    @property
    @pulumi.getter(name="gcpProjectId")
    def gcp_project_id(self) -> str:
        """
        GCP project ID of the owner of the network peer.
        """
        return pulumi.get(self, "gcp_project_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="networkName")
    def network_name(self) -> str:
        """
        Name of the network peer to which Atlas connects.
        """
        return pulumi.get(self, "network_name")

    @property
    @pulumi.getter(name="peeringId")
    def peering_id(self) -> str:
        return pulumi.get(self, "peering_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> str:
        """
        Cloud provider for this VPC peering connection. If omitted, Atlas sets this parameter to AWS. (Possible Values `AWS`, `AZURE`, `GCP`).
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        """
        Name of your Azure resource group.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="routeTableCidrBlock")
    def route_table_cidr_block(self) -> str:
        """
        Peer VPC CIDR block or subnet.
        """
        return pulumi.get(self, "route_table_cidr_block")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the Atlas network peering connection: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING`, `WAITING_FOR_USER`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusName")
    def status_name(self) -> str:
        """
        The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
        """
        return pulumi.get(self, "status_name")

    @property
    @pulumi.getter(name="vnetName")
    def vnet_name(self) -> str:
        """
        Name of your Azure VNet.
        """
        return pulumi.get(self, "vnet_name")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        Unique identifier of the peer VPC.
        """
        return pulumi.get(self, "vpc_id")


class AwaitableGetNetworkPeeringResult(GetNetworkPeeringResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkPeeringResult(
            accepter_region_name=self.accepter_region_name,
            atlas_cidr_block=self.atlas_cidr_block,
            atlas_id=self.atlas_id,
            aws_account_id=self.aws_account_id,
            azure_directory_id=self.azure_directory_id,
            azure_subscription_id=self.azure_subscription_id,
            connection_id=self.connection_id,
            container_id=self.container_id,
            error_message=self.error_message,
            error_state=self.error_state,
            error_state_name=self.error_state_name,
            gcp_project_id=self.gcp_project_id,
            id=self.id,
            network_name=self.network_name,
            peering_id=self.peering_id,
            project_id=self.project_id,
            provider_name=self.provider_name,
            resource_group_name=self.resource_group_name,
            route_table_cidr_block=self.route_table_cidr_block,
            status=self.status,
            status_name=self.status_name,
            vnet_name=self.vnet_name,
            vpc_id=self.vpc_id)


def get_network_peering(peering_id: Optional[str] = None,
                        project_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkPeeringResult:
    """
    `NetworkPeering` describes a Network Peering Connection.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.

    > **NOTE:** If you need to get an existing container ID see the How-To Guide.

    ## Example Usage


    :param str peering_id: Atlas assigned unique ID for the peering connection.
    :param str project_id: The unique ID for the project to create the database user.
    """
    __args__ = dict()
    __args__['peeringId'] = peering_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getNetworkPeering:getNetworkPeering', __args__, opts=opts, typ=GetNetworkPeeringResult).value

    return AwaitableGetNetworkPeeringResult(
        accepter_region_name=pulumi.get(__ret__, 'accepter_region_name'),
        atlas_cidr_block=pulumi.get(__ret__, 'atlas_cidr_block'),
        atlas_id=pulumi.get(__ret__, 'atlas_id'),
        aws_account_id=pulumi.get(__ret__, 'aws_account_id'),
        azure_directory_id=pulumi.get(__ret__, 'azure_directory_id'),
        azure_subscription_id=pulumi.get(__ret__, 'azure_subscription_id'),
        connection_id=pulumi.get(__ret__, 'connection_id'),
        container_id=pulumi.get(__ret__, 'container_id'),
        error_message=pulumi.get(__ret__, 'error_message'),
        error_state=pulumi.get(__ret__, 'error_state'),
        error_state_name=pulumi.get(__ret__, 'error_state_name'),
        gcp_project_id=pulumi.get(__ret__, 'gcp_project_id'),
        id=pulumi.get(__ret__, 'id'),
        network_name=pulumi.get(__ret__, 'network_name'),
        peering_id=pulumi.get(__ret__, 'peering_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_name=pulumi.get(__ret__, 'provider_name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        route_table_cidr_block=pulumi.get(__ret__, 'route_table_cidr_block'),
        status=pulumi.get(__ret__, 'status'),
        status_name=pulumi.get(__ret__, 'status_name'),
        vnet_name=pulumi.get(__ret__, 'vnet_name'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_network_peering)
def get_network_peering_output(peering_id: Optional[pulumi.Input[str]] = None,
                               project_id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetworkPeeringResult]:
    """
    `NetworkPeering` describes a Network Peering Connection.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.

    > **NOTE:** If you need to get an existing container ID see the How-To Guide.

    ## Example Usage


    :param str peering_id: Atlas assigned unique ID for the peering connection.
    :param str project_id: The unique ID for the project to create the database user.
    """
    ...
