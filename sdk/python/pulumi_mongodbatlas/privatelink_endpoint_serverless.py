# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PrivatelinkEndpointServerlessArgs', 'PrivatelinkEndpointServerless']

@pulumi.input_type
class PrivatelinkEndpointServerlessArgs:
    def __init__(__self__, *,
                 instance_name: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 provider_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a PrivatelinkEndpointServerless resource.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider name; AWS is currently supported
        """
        PrivatelinkEndpointServerlessArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_name=instance_name,
            project_id=project_id,
            provider_name=provider_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_name: Optional[pulumi.Input[str]] = None,
             project_id: Optional[pulumi.Input[str]] = None,
             provider_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if instance_name is None and 'instanceName' in kwargs:
            instance_name = kwargs['instanceName']
        if instance_name is None:
            raise TypeError("Missing 'instance_name' argument")
        if project_id is None and 'projectId' in kwargs:
            project_id = kwargs['projectId']
        if project_id is None:
            raise TypeError("Missing 'project_id' argument")
        if provider_name is None and 'providerName' in kwargs:
            provider_name = kwargs['providerName']
        if provider_name is None:
            raise TypeError("Missing 'provider_name' argument")

        _setter("instance_name", instance_name)
        _setter("project_id", project_id)
        _setter("provider_name", provider_name)

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
        Cloud provider name; AWS is currently supported
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)


@pulumi.input_type
class _PrivatelinkEndpointServerlessState:
    def __init__(__self__, *,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 endpoint_service_name: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 private_link_service_resource_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrivatelinkEndpointServerless resources.
        :param pulumi.Input[str] endpoint_id: Unique 24-hexadecimal digit string that identifies the private endpoint.
        :param pulumi.Input[str] endpoint_service_name: Unique string that identifies the PrivateLink endpoint service.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] private_link_service_resource_id: Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider name; AWS is currently supported
        :param pulumi.Input[str] status: Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        _PrivatelinkEndpointServerlessState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            endpoint_id=endpoint_id,
            endpoint_service_name=endpoint_service_name,
            instance_name=instance_name,
            private_link_service_resource_id=private_link_service_resource_id,
            project_id=project_id,
            provider_name=provider_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             endpoint_id: Optional[pulumi.Input[str]] = None,
             endpoint_service_name: Optional[pulumi.Input[str]] = None,
             instance_name: Optional[pulumi.Input[str]] = None,
             private_link_service_resource_id: Optional[pulumi.Input[str]] = None,
             project_id: Optional[pulumi.Input[str]] = None,
             provider_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if endpoint_id is None and 'endpointId' in kwargs:
            endpoint_id = kwargs['endpointId']
        if endpoint_service_name is None and 'endpointServiceName' in kwargs:
            endpoint_service_name = kwargs['endpointServiceName']
        if instance_name is None and 'instanceName' in kwargs:
            instance_name = kwargs['instanceName']
        if private_link_service_resource_id is None and 'privateLinkServiceResourceId' in kwargs:
            private_link_service_resource_id = kwargs['privateLinkServiceResourceId']
        if project_id is None and 'projectId' in kwargs:
            project_id = kwargs['projectId']
        if provider_name is None and 'providerName' in kwargs:
            provider_name = kwargs['providerName']

        if endpoint_id is not None:
            _setter("endpoint_id", endpoint_id)
        if endpoint_service_name is not None:
            _setter("endpoint_service_name", endpoint_service_name)
        if instance_name is not None:
            _setter("instance_name", instance_name)
        if private_link_service_resource_id is not None:
            _setter("private_link_service_resource_id", private_link_service_resource_id)
        if project_id is not None:
            _setter("project_id", project_id)
        if provider_name is not None:
            _setter("provider_name", provider_name)
        if status is not None:
            _setter("status", status)

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
    @pulumi.getter(name="endpointServiceName")
    def endpoint_service_name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique string that identifies the PrivateLink endpoint service.
        """
        return pulumi.get(self, "endpoint_service_name")

    @endpoint_service_name.setter
    def endpoint_service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_service_name", value)

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
        Cloud provider name; AWS is currently supported
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


class PrivatelinkEndpointServerless(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `privatelink_endpoint_serverless` Provides a Serverless PrivateLink Endpoint resource.
        This is the first of two resources required to configure PrivateLink for Serverless, the second is mongodbatlas_privatelink_endpoint_service_serverless.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage
        ### AWS Example
        ```python
        import pulumi
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
        ```

        ## Import

        Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
        ```
         For more information see[MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider name; AWS is currently supported
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivatelinkEndpointServerlessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `privatelink_endpoint_serverless` Provides a Serverless PrivateLink Endpoint resource.
        This is the first of two resources required to configure PrivateLink for Serverless, the second is mongodbatlas_privatelink_endpoint_service_serverless.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage
        ### AWS Example
        ```python
        import pulumi
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
        ```

        ## Import

        Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
        ```
         For more information see[MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).

        :param str resource_name: The name of the resource.
        :param PrivatelinkEndpointServerlessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivatelinkEndpointServerlessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PrivatelinkEndpointServerlessArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivatelinkEndpointServerlessArgs.__new__(PrivatelinkEndpointServerlessArgs)

            if instance_name is None and not opts.urn:
                raise TypeError("Missing required property 'instance_name'")
            __props__.__dict__["instance_name"] = instance_name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["endpoint_id"] = None
            __props__.__dict__["endpoint_service_name"] = None
            __props__.__dict__["private_link_service_resource_id"] = None
            __props__.__dict__["status"] = None
        super(PrivatelinkEndpointServerless, __self__).__init__(
            'mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            endpoint_id: Optional[pulumi.Input[str]] = None,
            endpoint_service_name: Optional[pulumi.Input[str]] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            private_link_service_resource_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'PrivatelinkEndpointServerless':
        """
        Get an existing PrivatelinkEndpointServerless resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint_id: Unique 24-hexadecimal digit string that identifies the private endpoint.
        :param pulumi.Input[str] endpoint_service_name: Unique string that identifies the PrivateLink endpoint service.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the serverless instance.
        :param pulumi.Input[str] private_link_service_resource_id: Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        :param pulumi.Input[str] project_id: Unique 24-digit hexadecimal string that identifies the project.
        :param pulumi.Input[str] provider_name: Cloud provider name; AWS is currently supported
        :param pulumi.Input[str] status: Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivatelinkEndpointServerlessState.__new__(_PrivatelinkEndpointServerlessState)

        __props__.__dict__["endpoint_id"] = endpoint_id
        __props__.__dict__["endpoint_service_name"] = endpoint_service_name
        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["private_link_service_resource_id"] = private_link_service_resource_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["provider_name"] = provider_name
        __props__.__dict__["status"] = status
        return PrivatelinkEndpointServerless(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the private endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @property
    @pulumi.getter(name="endpointServiceName")
    def endpoint_service_name(self) -> pulumi.Output[str]:
        """
        Unique string that identifies the PrivateLink endpoint service.
        """
        return pulumi.get(self, "endpoint_service_name")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[str]:
        """
        Human-readable label that identifies the serverless instance.
        """
        return pulumi.get(self, "instance_name")

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
        Cloud provider name; AWS is currently supported
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        """
        return pulumi.get(self, "status")

