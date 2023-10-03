# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FederatedSettingsOrgConfigArgs', 'FederatedSettingsOrgConfig']

@pulumi.input_type
class FederatedSettingsOrgConfigArgs:
    def __init__(__self__, *,
                 domain_restriction_enabled: pulumi.Input[bool],
                 federation_settings_id: pulumi.Input[str],
                 identity_provider_id: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a FederatedSettingsOrgConfig resource.
        """
        FederatedSettingsOrgConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_restriction_enabled=domain_restriction_enabled,
            federation_settings_id=federation_settings_id,
            identity_provider_id=identity_provider_id,
            org_id=org_id,
            domain_allow_lists=domain_allow_lists,
            post_auth_role_grants=post_auth_role_grants,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_restriction_enabled: pulumi.Input[bool],
             federation_settings_id: pulumi.Input[str],
             identity_provider_id: pulumi.Input[str],
             org_id: pulumi.Input[str],
             domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("domain_restriction_enabled", domain_restriction_enabled)
        _setter("federation_settings_id", federation_settings_id)
        _setter("identity_provider_id", identity_provider_id)
        _setter("org_id", org_id)
        if domain_allow_lists is not None:
            _setter("domain_allow_lists", domain_allow_lists)
        if post_auth_role_grants is not None:
            _setter("post_auth_role_grants", post_auth_role_grants)

    @property
    @pulumi.getter(name="domainRestrictionEnabled")
    def domain_restriction_enabled(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "domain_restriction_enabled")

    @domain_restriction_enabled.setter
    def domain_restriction_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "domain_restriction_enabled", value)

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "federation_settings_id")

    @federation_settings_id.setter
    def federation_settings_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "federation_settings_id", value)

    @property
    @pulumi.getter(name="identityProviderId")
    def identity_provider_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "identity_provider_id")

    @identity_provider_id.setter
    def identity_provider_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "identity_provider_id", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="domainAllowLists")
    def domain_allow_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "domain_allow_lists")

    @domain_allow_lists.setter
    def domain_allow_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domain_allow_lists", value)

    @property
    @pulumi.getter(name="postAuthRoleGrants")
    def post_auth_role_grants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "post_auth_role_grants")

    @post_auth_role_grants.setter
    def post_auth_role_grants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "post_auth_role_grants", value)


@pulumi.input_type
class _FederatedSettingsOrgConfigState:
    def __init__(__self__, *,
                 domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 domain_restriction_enabled: Optional[pulumi.Input[bool]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 identity_provider_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering FederatedSettingsOrgConfig resources.
        """
        _FederatedSettingsOrgConfigState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_allow_lists=domain_allow_lists,
            domain_restriction_enabled=domain_restriction_enabled,
            federation_settings_id=federation_settings_id,
            identity_provider_id=identity_provider_id,
            org_id=org_id,
            post_auth_role_grants=post_auth_role_grants,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             domain_restriction_enabled: Optional[pulumi.Input[bool]] = None,
             federation_settings_id: Optional[pulumi.Input[str]] = None,
             identity_provider_id: Optional[pulumi.Input[str]] = None,
             org_id: Optional[pulumi.Input[str]] = None,
             post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if domain_allow_lists is not None:
            _setter("domain_allow_lists", domain_allow_lists)
        if domain_restriction_enabled is not None:
            _setter("domain_restriction_enabled", domain_restriction_enabled)
        if federation_settings_id is not None:
            _setter("federation_settings_id", federation_settings_id)
        if identity_provider_id is not None:
            _setter("identity_provider_id", identity_provider_id)
        if org_id is not None:
            _setter("org_id", org_id)
        if post_auth_role_grants is not None:
            _setter("post_auth_role_grants", post_auth_role_grants)

    @property
    @pulumi.getter(name="domainAllowLists")
    def domain_allow_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "domain_allow_lists")

    @domain_allow_lists.setter
    def domain_allow_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domain_allow_lists", value)

    @property
    @pulumi.getter(name="domainRestrictionEnabled")
    def domain_restriction_enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "domain_restriction_enabled")

    @domain_restriction_enabled.setter
    def domain_restriction_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "domain_restriction_enabled", value)

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "federation_settings_id")

    @federation_settings_id.setter
    def federation_settings_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "federation_settings_id", value)

    @property
    @pulumi.getter(name="identityProviderId")
    def identity_provider_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "identity_provider_id")

    @identity_provider_id.setter
    def identity_provider_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity_provider_id", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="postAuthRoleGrants")
    def post_auth_role_grants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "post_auth_role_grants")

    @post_auth_role_grants.setter
    def post_auth_role_grants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "post_auth_role_grants", value)


class FederatedSettingsOrgConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 domain_restriction_enabled: Optional[pulumi.Input[bool]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 identity_provider_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Create a FederatedSettingsOrgConfig resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FederatedSettingsOrgConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a FederatedSettingsOrgConfig resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param FederatedSettingsOrgConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FederatedSettingsOrgConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FederatedSettingsOrgConfigArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 domain_restriction_enabled: Optional[pulumi.Input[bool]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 identity_provider_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FederatedSettingsOrgConfigArgs.__new__(FederatedSettingsOrgConfigArgs)

            __props__.__dict__["domain_allow_lists"] = domain_allow_lists
            if domain_restriction_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'domain_restriction_enabled'")
            __props__.__dict__["domain_restriction_enabled"] = domain_restriction_enabled
            if federation_settings_id is None and not opts.urn:
                raise TypeError("Missing required property 'federation_settings_id'")
            __props__.__dict__["federation_settings_id"] = federation_settings_id
            if identity_provider_id is None and not opts.urn:
                raise TypeError("Missing required property 'identity_provider_id'")
            __props__.__dict__["identity_provider_id"] = identity_provider_id
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["post_auth_role_grants"] = post_auth_role_grants
        super(FederatedSettingsOrgConfig, __self__).__init__(
            'mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            domain_restriction_enabled: Optional[pulumi.Input[bool]] = None,
            federation_settings_id: Optional[pulumi.Input[str]] = None,
            identity_provider_id: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            post_auth_role_grants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'FederatedSettingsOrgConfig':
        """
        Get an existing FederatedSettingsOrgConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FederatedSettingsOrgConfigState.__new__(_FederatedSettingsOrgConfigState)

        __props__.__dict__["domain_allow_lists"] = domain_allow_lists
        __props__.__dict__["domain_restriction_enabled"] = domain_restriction_enabled
        __props__.__dict__["federation_settings_id"] = federation_settings_id
        __props__.__dict__["identity_provider_id"] = identity_provider_id
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["post_auth_role_grants"] = post_auth_role_grants
        return FederatedSettingsOrgConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainAllowLists")
    def domain_allow_lists(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "domain_allow_lists")

    @property
    @pulumi.getter(name="domainRestrictionEnabled")
    def domain_restriction_enabled(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "domain_restriction_enabled")

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "federation_settings_id")

    @property
    @pulumi.getter(name="identityProviderId")
    def identity_provider_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "identity_provider_id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="postAuthRoleGrants")
    def post_auth_role_grants(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "post_auth_role_grants")

