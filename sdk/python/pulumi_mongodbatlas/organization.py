# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrganizationArgs', 'Organization']

@pulumi.input_type
class OrganizationArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 org_owner_id: pulumi.Input[str],
                 role_names: pulumi.Input[Sequence[pulumi.Input[str]]],
                 api_access_list_required: Optional[pulumi.Input[bool]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 multi_factor_auth_required: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 restrict_employee_access: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Organization resource.
        :param pulumi.Input[str] org_owner_id: Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        :param pulumi.Input[bool] api_access_list_required: Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        :param pulumi.Input[bool] multi_factor_auth_required: Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        :param pulumi.Input[str] name: The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        :param pulumi.Input[bool] restrict_employee_access: Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "org_owner_id", org_owner_id)
        pulumi.set(__self__, "role_names", role_names)
        if api_access_list_required is not None:
            pulumi.set(__self__, "api_access_list_required", api_access_list_required)
        if federation_settings_id is not None:
            pulumi.set(__self__, "federation_settings_id", federation_settings_id)
        if multi_factor_auth_required is not None:
            pulumi.set(__self__, "multi_factor_auth_required", multi_factor_auth_required)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if restrict_employee_access is not None:
            pulumi.set(__self__, "restrict_employee_access", restrict_employee_access)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="orgOwnerId")
    def org_owner_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        """
        return pulumi.get(self, "org_owner_id")

    @org_owner_id.setter
    def org_owner_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_owner_id", value)

    @property
    @pulumi.getter(name="roleNames")
    def role_names(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        """
        return pulumi.get(self, "role_names")

    @role_names.setter
    def role_names(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "role_names", value)

    @property
    @pulumi.getter(name="apiAccessListRequired")
    def api_access_list_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        """
        return pulumi.get(self, "api_access_list_required")

    @api_access_list_required.setter
    def api_access_list_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "api_access_list_required", value)

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        """
        return pulumi.get(self, "federation_settings_id")

    @federation_settings_id.setter
    def federation_settings_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "federation_settings_id", value)

    @property
    @pulumi.getter(name="multiFactorAuthRequired")
    def multi_factor_auth_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        """
        return pulumi.get(self, "multi_factor_auth_required")

    @multi_factor_auth_required.setter
    def multi_factor_auth_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_factor_auth_required", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="restrictEmployeeAccess")
    def restrict_employee_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        """
        return pulumi.get(self, "restrict_employee_access")

    @restrict_employee_access.setter
    def restrict_employee_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restrict_employee_access", value)


@pulumi.input_type
class _OrganizationState:
    def __init__(__self__, *,
                 api_access_list_required: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 multi_factor_auth_required: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 org_owner_id: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 restrict_employee_access: Optional[pulumi.Input[bool]] = None,
                 role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Organization resources.
        :param pulumi.Input[bool] api_access_list_required: Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        :param pulumi.Input[bool] multi_factor_auth_required: Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        :param pulumi.Input[str] name: The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        :param pulumi.Input[str] org_id: The organization id.
        :param pulumi.Input[str] org_owner_id: Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        :param pulumi.Input[str] public_key: Public API key value set for the specified organization API key.
        :param pulumi.Input[bool] restrict_employee_access: Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        """
        if api_access_list_required is not None:
            pulumi.set(__self__, "api_access_list_required", api_access_list_required)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if federation_settings_id is not None:
            pulumi.set(__self__, "federation_settings_id", federation_settings_id)
        if multi_factor_auth_required is not None:
            pulumi.set(__self__, "multi_factor_auth_required", multi_factor_auth_required)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if org_owner_id is not None:
            pulumi.set(__self__, "org_owner_id", org_owner_id)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if public_key is not None:
            pulumi.set(__self__, "public_key", public_key)
        if restrict_employee_access is not None:
            pulumi.set(__self__, "restrict_employee_access", restrict_employee_access)
        if role_names is not None:
            pulumi.set(__self__, "role_names", role_names)

    @property
    @pulumi.getter(name="apiAccessListRequired")
    def api_access_list_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        """
        return pulumi.get(self, "api_access_list_required")

    @api_access_list_required.setter
    def api_access_list_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "api_access_list_required", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        """
        return pulumi.get(self, "federation_settings_id")

    @federation_settings_id.setter
    def federation_settings_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "federation_settings_id", value)

    @property
    @pulumi.getter(name="multiFactorAuthRequired")
    def multi_factor_auth_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        """
        return pulumi.get(self, "multi_factor_auth_required")

    @multi_factor_auth_required.setter
    def multi_factor_auth_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_factor_auth_required", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        The organization id.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="orgOwnerId")
    def org_owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        """
        return pulumi.get(self, "org_owner_id")

    @org_owner_id.setter
    def org_owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_owner_id", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> Optional[pulumi.Input[str]]:
        """
        Public API key value set for the specified organization API key.
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter(name="restrictEmployeeAccess")
    def restrict_employee_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        """
        return pulumi.get(self, "restrict_employee_access")

    @restrict_employee_access.setter
    def restrict_employee_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restrict_employee_access", value)

    @property
    @pulumi.getter(name="roleNames")
    def role_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        """
        return pulumi.get(self, "role_names")

    @role_names.setter
    def role_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "role_names", value)


class Organization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_access_list_required: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 multi_factor_auth_required: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_owner_id: Optional[pulumi.Input[str]] = None,
                 restrict_employee_access: Optional[pulumi.Input[bool]] = None,
                 role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        # Resource: Organization

        `Organization` provides programmatic management (including creation) of a MongoDB Atlas Organization resource.

        > **IMPORTANT NOTE:**  When you establish an Atlas organization using this resource, it automatically generates a set of initial public and private Programmatic API Keys. These key values are vital to store because you'll need to use them to grant access to the newly created Atlas organization. To use this resource, `role_names` for new API Key must have the ORG_OWNER role specified.

        > **IMPORTANT NOTE:** To use this resource, the requesting API Key must have the Organization Owner role. The requesting API Key's organization must be a paying organization. To learn more, see Configure a Paying Organization in the MongoDB Atlas documentation.

        > **NOTE** Import command is currently not supported for this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.Organization("test",
            org_owner_id="6205e5fffff79cde6f",
            name="testCreateORG",
            description="test API key from Org Creation Test",
            role_names=["ORG_OWNER"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] api_access_list_required: Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        :param pulumi.Input[bool] multi_factor_auth_required: Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        :param pulumi.Input[str] name: The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        :param pulumi.Input[str] org_owner_id: Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        :param pulumi.Input[bool] restrict_employee_access: Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        # Resource: Organization

        `Organization` provides programmatic management (including creation) of a MongoDB Atlas Organization resource.

        > **IMPORTANT NOTE:**  When you establish an Atlas organization using this resource, it automatically generates a set of initial public and private Programmatic API Keys. These key values are vital to store because you'll need to use them to grant access to the newly created Atlas organization. To use this resource, `role_names` for new API Key must have the ORG_OWNER role specified.

        > **IMPORTANT NOTE:** To use this resource, the requesting API Key must have the Organization Owner role. The requesting API Key's organization must be a paying organization. To learn more, see Configure a Paying Organization in the MongoDB Atlas documentation.

        > **NOTE** Import command is currently not supported for this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.Organization("test",
            org_owner_id="6205e5fffff79cde6f",
            name="testCreateORG",
            description="test API key from Org Creation Test",
            role_names=["ORG_OWNER"])
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_access_list_required: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 multi_factor_auth_required: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_owner_id: Optional[pulumi.Input[str]] = None,
                 restrict_employee_access: Optional[pulumi.Input[bool]] = None,
                 role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationArgs.__new__(OrganizationArgs)

            __props__.__dict__["api_access_list_required"] = api_access_list_required
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["federation_settings_id"] = federation_settings_id
            __props__.__dict__["multi_factor_auth_required"] = multi_factor_auth_required
            __props__.__dict__["name"] = name
            if org_owner_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_owner_id'")
            __props__.__dict__["org_owner_id"] = org_owner_id
            __props__.__dict__["restrict_employee_access"] = restrict_employee_access
            if role_names is None and not opts.urn:
                raise TypeError("Missing required property 'role_names'")
            __props__.__dict__["role_names"] = role_names
            __props__.__dict__["org_id"] = None
            __props__.__dict__["private_key"] = None
            __props__.__dict__["public_key"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey", "publicKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Organization, __self__).__init__(
            'mongodbatlas:index/organization:Organization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_access_list_required: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            federation_settings_id: Optional[pulumi.Input[str]] = None,
            multi_factor_auth_required: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            org_owner_id: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            public_key: Optional[pulumi.Input[str]] = None,
            restrict_employee_access: Optional[pulumi.Input[bool]] = None,
            role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Organization':
        """
        Get an existing Organization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] api_access_list_required: Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        :param pulumi.Input[bool] multi_factor_auth_required: Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        :param pulumi.Input[str] name: The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        :param pulumi.Input[str] org_id: The organization id.
        :param pulumi.Input[str] org_owner_id: Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        :param pulumi.Input[str] public_key: Public API key value set for the specified organization API key.
        :param pulumi.Input[bool] restrict_employee_access: Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationState.__new__(_OrganizationState)

        __props__.__dict__["api_access_list_required"] = api_access_list_required
        __props__.__dict__["description"] = description
        __props__.__dict__["federation_settings_id"] = federation_settings_id
        __props__.__dict__["multi_factor_auth_required"] = multi_factor_auth_required
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["org_owner_id"] = org_owner_id
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["public_key"] = public_key
        __props__.__dict__["restrict_employee_access"] = restrict_employee_access
        __props__.__dict__["role_names"] = role_names
        return Organization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiAccessListRequired")
    def api_access_list_required(self) -> pulumi.Output[bool]:
        """
        Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        """
        return pulumi.get(self, "api_access_list_required")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
        """
        return pulumi.get(self, "federation_settings_id")

    @property
    @pulumi.getter(name="multiFactorAuthRequired")
    def multi_factor_auth_required(self) -> pulumi.Output[bool]:
        """
        Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: <https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/>.
        """
        return pulumi.get(self, "multi_factor_auth_required")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        The organization id.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="orgOwnerId")
    def org_owner_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
        """
        return pulumi.get(self, "org_owner_id")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Output[str]:
        """
        Public API key value set for the specified organization API key.
        """
        return pulumi.get(self, "public_key")

    @property
    @pulumi.getter(name="restrictEmployeeAccess")
    def restrict_employee_access(self) -> pulumi.Output[bool]:
        """
        Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: <https://www.mongodb.com/docs/atlas/security-restrict-support-access/>.
        """
        return pulumi.get(self, "restrict_employee_access")

    @property
    @pulumi.getter(name="roleNames")
    def role_names(self) -> pulumi.Output[Sequence[str]]:
        """
        List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
        """
        return pulumi.get(self, "role_names")

