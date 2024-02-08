# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccessListApiKeyArgs', 'AccessListApiKey']

@pulumi.input_type
class AccessListApiKeyArgs:
    def __init__(__self__, *,
                 api_key_id: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessListApiKey resource.
        :param pulumi.Input[str] api_key_id: Unique identifier for the Organization API Key for which you want to create a new access list entry.
               
               > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        :param pulumi.Input[str] cidr_block: Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        :param pulumi.Input[str] ip_address: Single IP address to be added to the access list.
        """
        pulumi.set(__self__, "api_key_id", api_key_id)
        pulumi.set(__self__, "org_id", org_id)
        if cidr_block is not None:
            pulumi.set(__self__, "cidr_block", cidr_block)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> pulumi.Input[str]:
        """
        Unique identifier for the Organization API Key for which you want to create a new access list entry.

        > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        """
        return pulumi.get(self, "api_key_id")

    @api_key_id.setter
    def api_key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_key_id", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        Single IP address to be added to the access list.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)


@pulumi.input_type
class _AccessListApiKeyState:
    def __init__(__self__, *,
                 api_key_id: Optional[pulumi.Input[str]] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessListApiKey resources.
        :param pulumi.Input[str] api_key_id: Unique identifier for the Organization API Key for which you want to create a new access list entry.
               
               > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        :param pulumi.Input[str] cidr_block: Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        :param pulumi.Input[str] ip_address: Single IP address to be added to the access list.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        """
        if api_key_id is not None:
            pulumi.set(__self__, "api_key_id", api_key_id)
        if cidr_block is not None:
            pulumi.set(__self__, "cidr_block", cidr_block)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the Organization API Key for which you want to create a new access list entry.

        > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        """
        return pulumi.get(self, "api_key_id")

    @api_key_id.setter
    def api_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key_id", value)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        Single IP address to be added to the access list.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)


class AccessListApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key_id: Optional[pulumi.Input[str]] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Using CIDR Block
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AccessListApiKey("test",
            api_key_id="a29120e123cd",
            cidr_block="1.2.3.4/32",
            org_id="<ORG-ID>")
        ```
        ### Using IP Address
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AccessListApiKey("test",
            api_key_id="a29120e123cd",
            ip_address="2.3.4.5",
            org_id="<ORG-ID>")
        ```

        ## Import

        IP Access List entries can be imported using the `org_id` , `api_key_id` and `cidr_block` or `ip_address`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/accessListApiKey:AccessListApiKey test 5d0f1f74cf09a29120e123cd-a29120e123cd-10.242.88.0/21
        ```
         For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createApiKeyAccessList)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_key_id: Unique identifier for the Organization API Key for which you want to create a new access list entry.
               
               > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        :param pulumi.Input[str] cidr_block: Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        :param pulumi.Input[str] ip_address: Single IP address to be added to the access list.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessListApiKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Using CIDR Block
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AccessListApiKey("test",
            api_key_id="a29120e123cd",
            cidr_block="1.2.3.4/32",
            org_id="<ORG-ID>")
        ```
        ### Using IP Address
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AccessListApiKey("test",
            api_key_id="a29120e123cd",
            ip_address="2.3.4.5",
            org_id="<ORG-ID>")
        ```

        ## Import

        IP Access List entries can be imported using the `org_id` , `api_key_id` and `cidr_block` or `ip_address`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/accessListApiKey:AccessListApiKey test 5d0f1f74cf09a29120e123cd-a29120e123cd-10.242.88.0/21
        ```
         For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createApiKeyAccessList)

        :param str resource_name: The name of the resource.
        :param AccessListApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessListApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key_id: Optional[pulumi.Input[str]] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessListApiKeyArgs.__new__(AccessListApiKeyArgs)

            if api_key_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_key_id'")
            __props__.__dict__["api_key_id"] = api_key_id
            __props__.__dict__["cidr_block"] = cidr_block
            __props__.__dict__["ip_address"] = ip_address
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
        super(AccessListApiKey, __self__).__init__(
            'mongodbatlas:index/accessListApiKey:AccessListApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_key_id: Optional[pulumi.Input[str]] = None,
            cidr_block: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None) -> 'AccessListApiKey':
        """
        Get an existing AccessListApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_key_id: Unique identifier for the Organization API Key for which you want to create a new access list entry.
               
               > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        :param pulumi.Input[str] cidr_block: Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        :param pulumi.Input[str] ip_address: Single IP address to be added to the access list.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessListApiKeyState.__new__(_AccessListApiKeyState)

        __props__.__dict__["api_key_id"] = api_key_id
        __props__.__dict__["cidr_block"] = cidr_block
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["org_id"] = org_id
        return AccessListApiKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for the Organization API Key for which you want to create a new access list entry.

        > **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
        """
        return pulumi.get(self, "api_key_id")

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Output[str]:
        """
        Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
        """
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        Single IP address to be added to the access list.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        """
        return pulumi.get(self, "org_id")

