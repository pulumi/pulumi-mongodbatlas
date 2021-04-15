# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PrivateLinkEndpointServiceArgs', 'PrivateLinkEndpointService']

@pulumi.input_type
class PrivateLinkEndpointServiceArgs:
    def __init__(__self__, *,
                 endpoint_service_id: pulumi.Input[str],
                 private_link_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 provider_name: pulumi.Input[str],
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PrivateLinkEndpointService resource.
        :param pulumi.Input[str] endpoint_service_id: Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        :param pulumi.Input[str] private_link_id: Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        :param pulumi.Input[str] project_id: Unique identifier for the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        :param pulumi.Input[str] private_endpoint_ip_address: Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        """
        pulumi.set(__self__, "endpoint_service_id", endpoint_service_id)
        pulumi.set(__self__, "private_link_id", private_link_id)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "provider_name", provider_name)
        if private_endpoint_ip_address is not None:
            pulumi.set(__self__, "private_endpoint_ip_address", private_endpoint_ip_address)

    @property
    @pulumi.getter(name="endpointServiceId")
    def endpoint_service_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        """
        return pulumi.get(self, "endpoint_service_id")

    @endpoint_service_id.setter
    def endpoint_service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_service_id", value)

    @property
    @pulumi.getter(name="privateLinkId")
    def private_link_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        """
        return pulumi.get(self, "private_link_id")

    @private_link_id.setter
    def private_link_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_link_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Input[str]:
        """
        Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @private_endpoint_ip_address.setter
    def private_endpoint_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_endpoint_ip_address", value)


@pulumi.input_type
class _PrivateLinkEndpointServiceState:
    def __init__(__self__, *,
                 aws_connection_status: Optional[pulumi.Input[str]] = None,
                 azure_status: Optional[pulumi.Input[str]] = None,
                 delete_requested: Optional[pulumi.Input[bool]] = None,
                 endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 error_message: Optional[pulumi.Input[str]] = None,
                 interface_endpoint_id: Optional[pulumi.Input[str]] = None,
                 private_endpoint_connection_name: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
                 private_endpoint_resource_id: Optional[pulumi.Input[str]] = None,
                 private_link_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrivateLinkEndpointService resources.
        :param pulumi.Input[str] aws_connection_status: Status of the interface endpoint for AWS.
               Returns one of the following values:
        :param pulumi.Input[str] azure_status: Status of the interface endpoint for AZURE.
               Returns one of the following values:
        :param pulumi.Input[bool] delete_requested: Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        :param pulumi.Input[str] endpoint_service_id: Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        :param pulumi.Input[str] error_message: Error message pertaining to the interface endpoint. Returns null if there are no errors.
        :param pulumi.Input[str] interface_endpoint_id: Unique identifier of the interface endpoint.
        :param pulumi.Input[str] private_endpoint_connection_name: Name of the connection for this private endpoint that Atlas generates.
        :param pulumi.Input[str] private_endpoint_ip_address: Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        :param pulumi.Input[str] private_endpoint_resource_id: Unique identifier of the private endpoint.
        :param pulumi.Input[str] private_link_id: Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        :param pulumi.Input[str] project_id: Unique identifier for the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        """
        if aws_connection_status is not None:
            pulumi.set(__self__, "aws_connection_status", aws_connection_status)
        if azure_status is not None:
            pulumi.set(__self__, "azure_status", azure_status)
        if delete_requested is not None:
            pulumi.set(__self__, "delete_requested", delete_requested)
        if endpoint_service_id is not None:
            pulumi.set(__self__, "endpoint_service_id", endpoint_service_id)
        if error_message is not None:
            pulumi.set(__self__, "error_message", error_message)
        if interface_endpoint_id is not None:
            pulumi.set(__self__, "interface_endpoint_id", interface_endpoint_id)
        if private_endpoint_connection_name is not None:
            pulumi.set(__self__, "private_endpoint_connection_name", private_endpoint_connection_name)
        if private_endpoint_ip_address is not None:
            pulumi.set(__self__, "private_endpoint_ip_address", private_endpoint_ip_address)
        if private_endpoint_resource_id is not None:
            pulumi.set(__self__, "private_endpoint_resource_id", private_endpoint_resource_id)
        if private_link_id is not None:
            pulumi.set(__self__, "private_link_id", private_link_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if provider_name is not None:
            pulumi.set(__self__, "provider_name", provider_name)

    @property
    @pulumi.getter(name="awsConnectionStatus")
    def aws_connection_status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the interface endpoint for AWS.
        Returns one of the following values:
        """
        return pulumi.get(self, "aws_connection_status")

    @aws_connection_status.setter
    def aws_connection_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_connection_status", value)

    @property
    @pulumi.getter(name="azureStatus")
    def azure_status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the interface endpoint for AZURE.
        Returns one of the following values:
        """
        return pulumi.get(self, "azure_status")

    @azure_status.setter
    def azure_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "azure_status", value)

    @property
    @pulumi.getter(name="deleteRequested")
    def delete_requested(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        """
        return pulumi.get(self, "delete_requested")

    @delete_requested.setter
    def delete_requested(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_requested", value)

    @property
    @pulumi.getter(name="endpointServiceId")
    def endpoint_service_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        """
        return pulumi.get(self, "endpoint_service_id")

    @endpoint_service_id.setter
    def endpoint_service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_service_id", value)

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> Optional[pulumi.Input[str]]:
        """
        Error message pertaining to the interface endpoint. Returns null if there are no errors.
        """
        return pulumi.get(self, "error_message")

    @error_message.setter
    def error_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "error_message", value)

    @property
    @pulumi.getter(name="interfaceEndpointId")
    def interface_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the interface endpoint.
        """
        return pulumi.get(self, "interface_endpoint_id")

    @interface_endpoint_id.setter
    def interface_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface_endpoint_id", value)

    @property
    @pulumi.getter(name="privateEndpointConnectionName")
    def private_endpoint_connection_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the connection for this private endpoint that Atlas generates.
        """
        return pulumi.get(self, "private_endpoint_connection_name")

    @private_endpoint_connection_name.setter
    def private_endpoint_connection_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_endpoint_connection_name", value)

    @property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @private_endpoint_ip_address.setter
    def private_endpoint_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_endpoint_ip_address", value)

    @property
    @pulumi.getter(name="privateEndpointResourceId")
    def private_endpoint_resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the private endpoint.
        """
        return pulumi.get(self, "private_endpoint_resource_id")

    @private_endpoint_resource_id.setter
    def private_endpoint_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_endpoint_resource_id", value)

    @property
    @pulumi.getter(name="privateLinkId")
    def private_link_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        """
        return pulumi.get(self, "private_link_id")

    @private_link_id.setter
    def private_link_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> Optional[pulumi.Input[str]]:
        """
        Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_name", value)


class PrivateLinkEndpointService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
                 private_link_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        `PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one interface endpoint to a private endpoint connection in an Atlas project.

        > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
          * Organization Owner
          * Project Owner

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_mongodbatlas as mongodbatlas

        test_private_link_endpoint = mongodbatlas.PrivateLinkEndpoint("testPrivateLinkEndpoint",
            project_id="<PROJECT_ID>",
            provider_name="AWS",
            region="us-east-1")
        ptfe_service = aws.ec2.VpcEndpoint("ptfeService",
            security_group_ids=["sg-3f238186"],
            service_name=test_private_link_endpoint.endpoint_service_name,
            subnet_ids=["subnet-de0406d2"],
            vpc_endpoint_type="Interface",
            vpc_id="vpc-7fc0a543")
        test_private_link_endpoint_service = mongodbatlas.PrivateLinkEndpointService("testPrivateLinkEndpointService",
            endpoint_service_id=ptfe_service.id,
            private_link_id=test_private_link_endpoint.private_link_id,
            project_id=test_private_link_endpoint.project_id,
            provider_name="AWS")
        ```

        ## Import

        Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
        ```

         See detailed information for arguments and attributes[MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint_service_id: Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        :param pulumi.Input[str] private_endpoint_ip_address: Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        :param pulumi.Input[str] private_link_id: Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        :param pulumi.Input[str] project_id: Unique identifier for the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateLinkEndpointServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one interface endpoint to a private endpoint connection in an Atlas project.

        > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
          * Organization Owner
          * Project Owner

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_mongodbatlas as mongodbatlas

        test_private_link_endpoint = mongodbatlas.PrivateLinkEndpoint("testPrivateLinkEndpoint",
            project_id="<PROJECT_ID>",
            provider_name="AWS",
            region="us-east-1")
        ptfe_service = aws.ec2.VpcEndpoint("ptfeService",
            security_group_ids=["sg-3f238186"],
            service_name=test_private_link_endpoint.endpoint_service_name,
            subnet_ids=["subnet-de0406d2"],
            vpc_endpoint_type="Interface",
            vpc_id="vpc-7fc0a543")
        test_private_link_endpoint_service = mongodbatlas.PrivateLinkEndpointService("testPrivateLinkEndpointService",
            endpoint_service_id=ptfe_service.id,
            private_link_id=test_private_link_endpoint.private_link_id,
            project_id=test_private_link_endpoint.project_id,
            provider_name="AWS")
        ```

        ## Import

        Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
        ```

         See detailed information for arguments and attributes[MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)

        :param str resource_name: The name of the resource.
        :param PrivateLinkEndpointServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateLinkEndpointServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint_service_id: Optional[pulumi.Input[str]] = None,
                 private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
                 private_link_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            __props__ = PrivateLinkEndpointServiceArgs.__new__(PrivateLinkEndpointServiceArgs)

            if endpoint_service_id is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_service_id'")
            __props__.__dict__["endpoint_service_id"] = endpoint_service_id
            __props__.__dict__["private_endpoint_ip_address"] = private_endpoint_ip_address
            if private_link_id is None and not opts.urn:
                raise TypeError("Missing required property 'private_link_id'")
            __props__.__dict__["private_link_id"] = private_link_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["aws_connection_status"] = None
            __props__.__dict__["azure_status"] = None
            __props__.__dict__["delete_requested"] = None
            __props__.__dict__["error_message"] = None
            __props__.__dict__["interface_endpoint_id"] = None
            __props__.__dict__["private_endpoint_connection_name"] = None
            __props__.__dict__["private_endpoint_resource_id"] = None
        super(PrivateLinkEndpointService, __self__).__init__(
            'mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_connection_status: Optional[pulumi.Input[str]] = None,
            azure_status: Optional[pulumi.Input[str]] = None,
            delete_requested: Optional[pulumi.Input[bool]] = None,
            endpoint_service_id: Optional[pulumi.Input[str]] = None,
            error_message: Optional[pulumi.Input[str]] = None,
            interface_endpoint_id: Optional[pulumi.Input[str]] = None,
            private_endpoint_connection_name: Optional[pulumi.Input[str]] = None,
            private_endpoint_ip_address: Optional[pulumi.Input[str]] = None,
            private_endpoint_resource_id: Optional[pulumi.Input[str]] = None,
            private_link_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None) -> 'PrivateLinkEndpointService':
        """
        Get an existing PrivateLinkEndpointService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aws_connection_status: Status of the interface endpoint for AWS.
               Returns one of the following values:
        :param pulumi.Input[str] azure_status: Status of the interface endpoint for AZURE.
               Returns one of the following values:
        :param pulumi.Input[bool] delete_requested: Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        :param pulumi.Input[str] endpoint_service_id: Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        :param pulumi.Input[str] error_message: Error message pertaining to the interface endpoint. Returns null if there are no errors.
        :param pulumi.Input[str] interface_endpoint_id: Unique identifier of the interface endpoint.
        :param pulumi.Input[str] private_endpoint_connection_name: Name of the connection for this private endpoint that Atlas generates.
        :param pulumi.Input[str] private_endpoint_ip_address: Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        :param pulumi.Input[str] private_endpoint_resource_id: Unique identifier of the private endpoint.
        :param pulumi.Input[str] private_link_id: Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        :param pulumi.Input[str] project_id: Unique identifier for the project.
        :param pulumi.Input[str] provider_name: Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateLinkEndpointServiceState.__new__(_PrivateLinkEndpointServiceState)

        __props__.__dict__["aws_connection_status"] = aws_connection_status
        __props__.__dict__["azure_status"] = azure_status
        __props__.__dict__["delete_requested"] = delete_requested
        __props__.__dict__["endpoint_service_id"] = endpoint_service_id
        __props__.__dict__["error_message"] = error_message
        __props__.__dict__["interface_endpoint_id"] = interface_endpoint_id
        __props__.__dict__["private_endpoint_connection_name"] = private_endpoint_connection_name
        __props__.__dict__["private_endpoint_ip_address"] = private_endpoint_ip_address
        __props__.__dict__["private_endpoint_resource_id"] = private_endpoint_resource_id
        __props__.__dict__["private_link_id"] = private_link_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["provider_name"] = provider_name
        return PrivateLinkEndpointService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsConnectionStatus")
    def aws_connection_status(self) -> pulumi.Output[str]:
        """
        Status of the interface endpoint for AWS.
        Returns one of the following values:
        """
        return pulumi.get(self, "aws_connection_status")

    @property
    @pulumi.getter(name="azureStatus")
    def azure_status(self) -> pulumi.Output[str]:
        """
        Status of the interface endpoint for AZURE.
        Returns one of the following values:
        """
        return pulumi.get(self, "azure_status")

    @property
    @pulumi.getter(name="deleteRequested")
    def delete_requested(self) -> pulumi.Output[bool]:
        """
        Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        """
        return pulumi.get(self, "delete_requested")

    @property
    @pulumi.getter(name="endpointServiceId")
    def endpoint_service_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the interface endpoint you created in your VPC with the `AWS` or `AZURE` resource.
        """
        return pulumi.get(self, "endpoint_service_id")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> pulumi.Output[str]:
        """
        Error message pertaining to the interface endpoint. Returns null if there are no errors.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="interfaceEndpointId")
    def interface_endpoint_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the interface endpoint.
        """
        return pulumi.get(self, "interface_endpoint_id")

    @property
    @pulumi.getter(name="privateEndpointConnectionName")
    def private_endpoint_connection_name(self) -> pulumi.Output[str]:
        """
        Name of the connection for this private endpoint that Atlas generates.
        """
        return pulumi.get(self, "private_endpoint_connection_name")

    @property
    @pulumi.getter(name="privateEndpointIpAddress")
    def private_endpoint_ip_address(self) -> pulumi.Output[str]:
        """
        Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        """
        return pulumi.get(self, "private_endpoint_ip_address")

    @property
    @pulumi.getter(name="privateEndpointResourceId")
    def private_endpoint_resource_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the private endpoint.
        """
        return pulumi.get(self, "private_endpoint_resource_id")

    @property
    @pulumi.getter(name="privateLinkId")
    def private_link_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `PrivateLinkEndpoint` resource.
        """
        return pulumi.get(self, "private_link_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        """
        Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        """
        return pulumi.get(self, "provider_name")

