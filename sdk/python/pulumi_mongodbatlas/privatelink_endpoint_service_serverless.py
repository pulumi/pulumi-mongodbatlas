# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PrivatelinkEndpointServiceServerlessArgs', 'PrivatelinkEndpointServiceServerless']

@pulumi.input_type
class PrivatelinkEndpointServiceServerlessArgs:
    def __init__(__self__, *,
                 endpoint_id: pulumi.Input[str],
                 instance_name: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 provider_name: pulumi.Input[str],
                 cloud_provider_endpoint_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PrivatelinkEndpointServiceServerless resource.
        :param pulumi.Input[str] endpoint_id: Unique 24-hexadecimal digit string that identifies the private endpoint.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        :param pulumi.Input[str] cloud_provider_endpoint_id: Unique string that identifies the private endpoint's network interface.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] private_endpoint_ip_address: IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        """
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "provider_name", provider_name)
        if cloud_provider_endpoint_id is not None:
            pulumi.set(__self__, "cloud_provider_endpoint_id", cloud_provider_endpoint_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if private_endpoint_ip_address is not None:
            pulumi.set(__self__, "private_endpoint_ip_address", private_endpoint_ip_address)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the private endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_id", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Input[str]:
        """
        Human-readable label that identifies the serverless instance.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique 24-digit hexadecimal string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Input[str]:
        """
        Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter(name="cloudProviderEndpointId")
    def cloud_provider_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique string that identifies the private endpoint's network interface.
        """
        return pulumi.get(self, "cloud_provider_endpoint_id")

    @cloud_provider_endpoint_id.setter
    def cloud_provider_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_provider_endpoint_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @private_endpoint_ip_address.setter
    def private_endpoint_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_endpoint_ip_address", value)


@pulumi.input_type
class _PrivatelinkEndpointServiceServerlessState:
    def __init__(__self__, *,
                 cloud_provider_endpoint_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
                 private_link_service_resource_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrivatelinkEndpointServiceServerless resources.
        :param pulumi.Input[str] cloud_provider_endpoint_id: Unique string that identifies the private endpoint's network interface.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] endpoint_id: Unique 24-hexadecimal digit string that identifies the private endpoint.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] private_endpoint_ip_address: IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        :param pulumi.Input[str] private_link_service_resource_id: Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        :param pulumi.Input[str] status: Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        if cloud_provider_endpoint_id is not None:
            pulumi.set(__self__, "cloud_provider_endpoint_id", cloud_provider_endpoint_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if endpoint_id is not None:
            pulumi.set(__self__, "endpoint_id", endpoint_id)
        if instance_name is not None:
            pulumi.set(__self__, "instance_name", instance_name)
        if private_endpoint_ip_address is not None:
            pulumi.set(__self__, "private_endpoint_ip_address", private_endpoint_ip_address)
        if private_link_service_resource_id is not None:
            pulumi.set(__self__, "private_link_service_resource_id", private_link_service_resource_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if provider_name is not None:
            pulumi.set(__self__, "provider_name", provider_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="cloudProviderEndpointId")
    def cloud_provider_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique string that identifies the private endpoint's network interface.
        """
        return pulumi.get(self, "cloud_provider_endpoint_id")

    @cloud_provider_endpoint_id.setter
    def cloud_provider_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_provider_endpoint_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the private endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_id", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that identifies the serverless instance.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @private_endpoint_ip_address.setter
    def private_endpoint_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_endpoint_ip_address", value)

    @property
    @pulumi.getter(name="privateLinkServiceResourceId")
    def private_link_service_resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        """
        return pulumi.get(self, "private_link_service_resource_id")

    @private_link_service_resource_id.setter
    def private_link_service_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_service_resource_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-digit hexadecimal string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> Optional[pulumi.Input[str]]:
        """
        Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class PrivatelinkEndpointServiceServerless(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_provider_endpoint_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `privatelink_endpoint_service_serverless` Provides a Serverless PrivateLink Endpoint Service resource.
        This is the second of two resources required to configure PrivateLink for Serverless, the first is mongodbatlas_privatelink_endpoint_serverless.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        **NOTE:** Create waits for all serverless instances on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation of this resource. Default timeout is 2hrs.

        ## Example with AWS

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_mongodbatlas as mongodbatlas

        test_serverless_instance = mongodbatlas.ServerlessInstance("testServerlessInstance",
            project_id="<PROJECT_ID>",
            provider_settings_backing_provider_name="AWS",
            provider_settings_provider_name="SERVERLESS",
            provider_settings_region_name="US_EAST_1",
            continuous_backup_enabled=True)
        test_privatelink_endpoint_serverless = mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless",
            project_id="<PROJECT_ID>",
            instance_name=test_serverless_instance.name,
            provider_name="AWS")
        ptfe_service = aws.ec2.VpcEndpoint("ptfeService",
            vpc_id="vpc-7fc0a543",
            service_name=test_privatelink_endpoint_serverless.endpoint_service_name,
            vpc_endpoint_type="Interface",
            subnet_ids=["subnet-de0406d2"],
            security_group_ids=["sg-3f238186"])
        test_privatelink_endpoint_service_serverless = mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless",
            project_id="<PROJECT_ID>",
            instance_name=test_serverless_instance.name,
            endpoint_id=test_privatelink_endpoint_serverless.endpoint_id,
            cloud_provider_endpoint_id=ptfe_service.id,
            provider_name="AWS",
            comment="New serverless endpoint")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
        ```
        For more information see: [MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloud_provider_endpoint_id: Unique string that identifies the private endpoint's network interface.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] endpoint_id: Unique 24-hexadecimal digit string that identifies the private endpoint.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] private_endpoint_ip_address: IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivatelinkEndpointServiceServerlessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `privatelink_endpoint_service_serverless` Provides a Serverless PrivateLink Endpoint Service resource.
        This is the second of two resources required to configure PrivateLink for Serverless, the first is mongodbatlas_privatelink_endpoint_serverless.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        **NOTE:** Create waits for all serverless instances on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation of this resource. Default timeout is 2hrs.

        ## Example with AWS

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_mongodbatlas as mongodbatlas

        test_serverless_instance = mongodbatlas.ServerlessInstance("testServerlessInstance",
            project_id="<PROJECT_ID>",
            provider_settings_backing_provider_name="AWS",
            provider_settings_provider_name="SERVERLESS",
            provider_settings_region_name="US_EAST_1",
            continuous_backup_enabled=True)
        test_privatelink_endpoint_serverless = mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless",
            project_id="<PROJECT_ID>",
            instance_name=test_serverless_instance.name,
            provider_name="AWS")
        ptfe_service = aws.ec2.VpcEndpoint("ptfeService",
            vpc_id="vpc-7fc0a543",
            service_name=test_privatelink_endpoint_serverless.endpoint_service_name,
            vpc_endpoint_type="Interface",
            subnet_ids=["subnet-de0406d2"],
            security_group_ids=["sg-3f238186"])
        test_privatelink_endpoint_service_serverless = mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless",
            project_id="<PROJECT_ID>",
            instance_name=test_serverless_instance.name,
            endpoint_id=test_privatelink_endpoint_serverless.endpoint_id,
            cloud_provider_endpoint_id=ptfe_service.id,
            provider_name="AWS",
            comment="New serverless endpoint")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
        ```
        For more information see: [MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).

        :param str resource_name: The name of the resource.
        :param PrivatelinkEndpointServiceServerlessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivatelinkEndpointServiceServerlessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_provider_endpoint_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivatelinkEndpointServiceServerlessArgs.__new__(PrivatelinkEndpointServiceServerlessArgs)

            __props__.__dict__["cloud_provider_endpoint_id"] = cloud_provider_endpoint_id
            __props__.__dict__["comment"] = comment
            if endpoint_id is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_id'")
            __props__.__dict__["endpoint_id"] = endpoint_id
            if instance_name is None and not opts.urn:
                raise TypeError("Missing required property 'instance_name'")
            __props__.__dict__["instance_name"] = instance_name
            __props__.__dict__["private_endpoint_ip_address"] = private_endpoint_ip_address
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["private_link_service_resource_id"] = None
            __props__.__dict__["status"] = None
        super(PrivatelinkEndpointServiceServerless, __self__).__init__(
            'mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloud_provider_endpoint_id: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            endpoint_id: Optional[pulumi.Input[str]] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
            private_link_service_resource_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'PrivatelinkEndpointServiceServerless':
        """
        Get an existing PrivatelinkEndpointServiceServerless resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloud_provider_endpoint_id: Unique string that identifies the private endpoint's network interface.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] endpoint_id: Unique 24-hexadecimal digit string that identifies the private endpoint.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] private_endpoint_ip_address: IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        :param pulumi.Input[str] private_link_service_resource_id: Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        :param pulumi.Input[str] status: Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivatelinkEndpointServiceServerlessState.__new__(_PrivatelinkEndpointServiceServerlessState)

        __props__.__dict__["cloud_provider_endpoint_id"] = cloud_provider_endpoint_id
        __props__.__dict__["comment"] = comment
        __props__.__dict__["endpoint_id"] = endpoint_id
        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["private_endpoint_ip_address"] = private_endpoint_ip_address
        __props__.__dict__["private_link_service_resource_id"] = private_link_service_resource_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["provider_name"] = provider_name
        __props__.__dict__["status"] = status
        return PrivatelinkEndpointServiceServerless(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cloudProviderEndpointId")
    def cloud_provider_endpoint_id(self) -> pulumi.Output[str]:
        """
        Unique string that identifies the private endpoint's network interface.
        """
        return pulumi.get(self, "cloud_provider_endpoint_id")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the private endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[str]:
        """
        Human-readable label that identifies the serverless instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> pulumi.Output[str]:
        """
        IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @property
    @pulumi.getter(name="privateLinkServiceResourceId")
    def private_link_service_resource_id(self) -> pulumi.Output[str]:
        """
        Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        """
        return pulumi.get(self, "private_link_service_resource_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique 24-digit hexadecimal string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        """
        Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        return pulumi.get(self, "status")

