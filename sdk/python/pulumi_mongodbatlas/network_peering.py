# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['NetworkPeering']


class NetworkPeering(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accepter_region_name: Optional[pulumi.Input[str]] = None,
                 atlas_cidr_block: Optional[pulumi.Input[str]] = None,
                 atlas_gcp_project_id: Optional[pulumi.Input[str]] = None,
                 atlas_vpc_name: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 azure_directory_id: Optional[pulumi.Input[str]] = None,
                 azure_subscription_id: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[str]] = None,
                 gcp_project_id: Optional[pulumi.Input[str]] = None,
                 network_name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 route_table_cidr_block: Optional[pulumi.Input[str]] = None,
                 vnet_name: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        Clusters can be imported using project ID and network peering peering id, in the format `PROJECTID-PEERID-PROVIDERNAME`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/networkPeering:NetworkPeering my_peering 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a-AWS
        ```

         See detailed information for arguments and attributes[MongoDB API Network Peering Connection](https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accepter_region_name: Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        :param pulumi.Input[str] atlas_gcp_project_id: The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
        :param pulumi.Input[str] aws_account_id: AWS Account ID of the owner of the peer VPC.
        :param pulumi.Input[str] azure_directory_id: Unique identifier for an Azure AD directory.
        :param pulumi.Input[str] azure_subscription_id: Unique identifier of the Azure subscription in which the VNet resides.
        :param pulumi.Input[str] container_id: Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
        :param pulumi.Input[str] gcp_project_id: GCP project ID of the owner of the network peer.
        :param pulumi.Input[str] network_name: Name of the network peer to which Atlas connects.
        :param pulumi.Input[str] project_id: The unique ID for the MongoDB Atlas project to create the database user.
        :param pulumi.Input[str] provider_name: Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
        :param pulumi.Input[str] resource_group_name: Name of your Azure resource group.
        :param pulumi.Input[str] route_table_cidr_block: AWS VPC CIDR block or subnet.
        :param pulumi.Input[str] vnet_name: Name of your Azure VNet.
        :param pulumi.Input[str] vpc_id: Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['accepter_region_name'] = accepter_region_name
            __props__['atlas_cidr_block'] = atlas_cidr_block
            __props__['atlas_gcp_project_id'] = atlas_gcp_project_id
            __props__['atlas_vpc_name'] = atlas_vpc_name
            __props__['aws_account_id'] = aws_account_id
            __props__['azure_directory_id'] = azure_directory_id
            __props__['azure_subscription_id'] = azure_subscription_id
            if container_id is None:
                raise TypeError("Missing required property 'container_id'")
            __props__['container_id'] = container_id
            __props__['gcp_project_id'] = gcp_project_id
            __props__['network_name'] = network_name
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            if provider_name is None:
                raise TypeError("Missing required property 'provider_name'")
            __props__['provider_name'] = provider_name
            __props__['resource_group_name'] = resource_group_name
            __props__['route_table_cidr_block'] = route_table_cidr_block
            __props__['vnet_name'] = vnet_name
            __props__['vpc_id'] = vpc_id
            __props__['atlas_id'] = None
            __props__['connection_id'] = None
            __props__['error_message'] = None
            __props__['error_state'] = None
            __props__['error_state_name'] = None
            __props__['peer_id'] = None
            __props__['status'] = None
            __props__['status_name'] = None
        super(NetworkPeering, __self__).__init__(
            'mongodbatlas:index/networkPeering:NetworkPeering',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accepter_region_name: Optional[pulumi.Input[str]] = None,
            atlas_cidr_block: Optional[pulumi.Input[str]] = None,
            atlas_gcp_project_id: Optional[pulumi.Input[str]] = None,
            atlas_id: Optional[pulumi.Input[str]] = None,
            atlas_vpc_name: Optional[pulumi.Input[str]] = None,
            aws_account_id: Optional[pulumi.Input[str]] = None,
            azure_directory_id: Optional[pulumi.Input[str]] = None,
            azure_subscription_id: Optional[pulumi.Input[str]] = None,
            connection_id: Optional[pulumi.Input[str]] = None,
            container_id: Optional[pulumi.Input[str]] = None,
            error_message: Optional[pulumi.Input[str]] = None,
            error_state: Optional[pulumi.Input[str]] = None,
            error_state_name: Optional[pulumi.Input[str]] = None,
            gcp_project_id: Optional[pulumi.Input[str]] = None,
            network_name: Optional[pulumi.Input[str]] = None,
            peer_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            route_table_cidr_block: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            status_name: Optional[pulumi.Input[str]] = None,
            vnet_name: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'NetworkPeering':
        """
        Get an existing NetworkPeering resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accepter_region_name: Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        :param pulumi.Input[str] atlas_gcp_project_id: The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
        :param pulumi.Input[str] aws_account_id: AWS Account ID of the owner of the peer VPC.
        :param pulumi.Input[str] azure_directory_id: Unique identifier for an Azure AD directory.
        :param pulumi.Input[str] azure_subscription_id: Unique identifier of the Azure subscription in which the VNet resides.
        :param pulumi.Input[str] connection_id: Unique identifier of the Atlas network peering container.
        :param pulumi.Input[str] container_id: Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
        :param pulumi.Input[str] error_message: When `"status" : "FAILED"`, Atlas provides a description of the error.
        :param pulumi.Input[str] error_state: Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
        :param pulumi.Input[str] error_state_name: Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
        :param pulumi.Input[str] gcp_project_id: GCP project ID of the owner of the network peer.
        :param pulumi.Input[str] network_name: Name of the network peer to which Atlas connects.
        :param pulumi.Input[str] peer_id: Unique identifier of the Atlas network peer.
        :param pulumi.Input[str] project_id: The unique ID for the MongoDB Atlas project to create the database user.
        :param pulumi.Input[str] provider_name: Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
        :param pulumi.Input[str] resource_group_name: Name of your Azure resource group.
        :param pulumi.Input[str] route_table_cidr_block: AWS VPC CIDR block or subnet.
        :param pulumi.Input[str] status: Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
        :param pulumi.Input[str] status_name: (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
        :param pulumi.Input[str] vnet_name: Name of your Azure VNet.
        :param pulumi.Input[str] vpc_id: Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["accepter_region_name"] = accepter_region_name
        __props__["atlas_cidr_block"] = atlas_cidr_block
        __props__["atlas_gcp_project_id"] = atlas_gcp_project_id
        __props__["atlas_id"] = atlas_id
        __props__["atlas_vpc_name"] = atlas_vpc_name
        __props__["aws_account_id"] = aws_account_id
        __props__["azure_directory_id"] = azure_directory_id
        __props__["azure_subscription_id"] = azure_subscription_id
        __props__["connection_id"] = connection_id
        __props__["container_id"] = container_id
        __props__["error_message"] = error_message
        __props__["error_state"] = error_state
        __props__["error_state_name"] = error_state_name
        __props__["gcp_project_id"] = gcp_project_id
        __props__["network_name"] = network_name
        __props__["peer_id"] = peer_id
        __props__["project_id"] = project_id
        __props__["provider_name"] = provider_name
        __props__["resource_group_name"] = resource_group_name
        __props__["route_table_cidr_block"] = route_table_cidr_block
        __props__["status"] = status
        __props__["status_name"] = status_name
        __props__["vnet_name"] = vnet_name
        __props__["vpc_id"] = vpc_id
        return NetworkPeering(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accepterRegionName")
    def accepter_region_name(self) -> pulumi.Output[str]:
        """
        Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        """
        return pulumi.get(self, "accepter_region_name")

    @property
    @pulumi.getter(name="atlasCidrBlock")
    def atlas_cidr_block(self) -> pulumi.Output[str]:
        return pulumi.get(self, "atlas_cidr_block")

    @property
    @pulumi.getter(name="atlasGcpProjectId")
    def atlas_gcp_project_id(self) -> pulumi.Output[str]:
        """
        The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
        """
        return pulumi.get(self, "atlas_gcp_project_id")

    @property
    @pulumi.getter(name="atlasId")
    def atlas_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "atlas_id")

    @property
    @pulumi.getter(name="atlasVpcName")
    def atlas_vpc_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "atlas_vpc_name")

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Output[str]:
        """
        AWS Account ID of the owner of the peer VPC.
        """
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="azureDirectoryId")
    def azure_directory_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for an Azure AD directory.
        """
        return pulumi.get(self, "azure_directory_id")

    @property
    @pulumi.getter(name="azureSubscriptionId")
    def azure_subscription_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the Azure subscription in which the VNet resides.
        """
        return pulumi.get(self, "azure_subscription_id")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the Atlas network peering container.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
        """
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> pulumi.Output[str]:
        """
        When `"status" : "FAILED"`, Atlas provides a description of the error.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="errorState")
    def error_state(self) -> pulumi.Output[str]:
        """
        Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
        """
        return pulumi.get(self, "error_state")

    @property
    @pulumi.getter(name="errorStateName")
    def error_state_name(self) -> pulumi.Output[str]:
        """
        Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
        """
        return pulumi.get(self, "error_state_name")

    @property
    @pulumi.getter(name="gcpProjectId")
    def gcp_project_id(self) -> pulumi.Output[str]:
        """
        GCP project ID of the owner of the network peer.
        """
        return pulumi.get(self, "gcp_project_id")

    @property
    @pulumi.getter(name="networkName")
    def network_name(self) -> pulumi.Output[str]:
        """
        Name of the network peer to which Atlas connects.
        """
        return pulumi.get(self, "network_name")

    @property
    @pulumi.getter(name="peerId")
    def peer_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the Atlas network peer.
        """
        return pulumi.get(self, "peer_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the MongoDB Atlas project to create the database user.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        """
        Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Name of your Azure resource group.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="routeTableCidrBlock")
    def route_table_cidr_block(self) -> pulumi.Output[str]:
        """
        AWS VPC CIDR block or subnet.
        """
        return pulumi.get(self, "route_table_cidr_block")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusName")
    def status_name(self) -> pulumi.Output[str]:
        """
        (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
        """
        return pulumi.get(self, "status_name")

    @property
    @pulumi.getter(name="vnetName")
    def vnet_name(self) -> pulumi.Output[str]:
        """
        Name of your Azure VNet.
        """
        return pulumi.get(self, "vnet_name")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
        """
        return pulumi.get(self, "vpc_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

