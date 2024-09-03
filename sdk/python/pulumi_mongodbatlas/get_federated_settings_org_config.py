# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetFederatedSettingsOrgConfigResult',
    'AwaitableGetFederatedSettingsOrgConfigResult',
    'get_federated_settings_org_config',
    'get_federated_settings_org_config_output',
]

@pulumi.output_type
class GetFederatedSettingsOrgConfigResult:
    """
    A collection of values returned by getFederatedSettingsOrgConfig.
    """
    def __init__(__self__, data_access_identity_provider_ids=None, domain_allow_lists=None, domain_restriction_enabled=None, federation_settings_id=None, id=None, identity_provider_id=None, org_id=None, post_auth_role_grants=None, role_mappings=None, user_conflicts=None):
        if data_access_identity_provider_ids and not isinstance(data_access_identity_provider_ids, list):
            raise TypeError("Expected argument 'data_access_identity_provider_ids' to be a list")
        pulumi.set(__self__, "data_access_identity_provider_ids", data_access_identity_provider_ids)
        if domain_allow_lists and not isinstance(domain_allow_lists, list):
            raise TypeError("Expected argument 'domain_allow_lists' to be a list")
        pulumi.set(__self__, "domain_allow_lists", domain_allow_lists)
        if domain_restriction_enabled and not isinstance(domain_restriction_enabled, bool):
            raise TypeError("Expected argument 'domain_restriction_enabled' to be a bool")
        pulumi.set(__self__, "domain_restriction_enabled", domain_restriction_enabled)
        if federation_settings_id and not isinstance(federation_settings_id, str):
            raise TypeError("Expected argument 'federation_settings_id' to be a str")
        pulumi.set(__self__, "federation_settings_id", federation_settings_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_provider_id and not isinstance(identity_provider_id, str):
            raise TypeError("Expected argument 'identity_provider_id' to be a str")
        pulumi.set(__self__, "identity_provider_id", identity_provider_id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if post_auth_role_grants and not isinstance(post_auth_role_grants, list):
            raise TypeError("Expected argument 'post_auth_role_grants' to be a list")
        pulumi.set(__self__, "post_auth_role_grants", post_auth_role_grants)
        if role_mappings and not isinstance(role_mappings, list):
            raise TypeError("Expected argument 'role_mappings' to be a list")
        pulumi.set(__self__, "role_mappings", role_mappings)
        if user_conflicts and not isinstance(user_conflicts, list):
            raise TypeError("Expected argument 'user_conflicts' to be a list")
        pulumi.set(__self__, "user_conflicts", user_conflicts)

    @property
    @pulumi.getter(name="dataAccessIdentityProviderIds")
    def data_access_identity_provider_ids(self) -> Sequence[str]:
        """
        The collection of unique ids representing the identity providers that can be used for data access in this organization.
        """
        return pulumi.get(self, "data_access_identity_provider_ids")

    @property
    @pulumi.getter(name="domainAllowLists")
    def domain_allow_lists(self) -> Sequence[str]:
        """
        List that contains the approved domains from which organization users can log in.  Note: If the organization uses an identity provider,  `domain_allow_list` includes: any SSO domains associated with organization's identity provider and any custom domains associated with the specific organization.
        """
        return pulumi.get(self, "domain_allow_lists")

    @property
    @pulumi.getter(name="domainRestrictionEnabled")
    def domain_restriction_enabled(self) -> bool:
        """
        Flag that indicates whether domain restriction is enabled for the connected organization.  User Conflicts returns null when `domain_restriction_enabled` is false.
        """
        return pulumi.get(self, "domain_restriction_enabled")

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        """
        return pulumi.get(self, "federation_settings_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="identityProviderId")
    def identity_provider_id(self) -> str:
        """
        Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. This id can be found in two ways:
        1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
        2. `okta_idp_id` on the `FederatedSettingsIdentityProvider` resource
        """
        return pulumi.get(self, "identity_provider_id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="postAuthRoleGrants")
    def post_auth_role_grants(self) -> Sequence[str]:
        """
        List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
        """
        return pulumi.get(self, "post_auth_role_grants")

    @property
    @pulumi.getter(name="roleMappings")
    def role_mappings(self) -> Sequence['outputs.GetFederatedSettingsOrgConfigRoleMappingResult']:
        """
        Role mappings that are configured in this organization. See below
        """
        return pulumi.get(self, "role_mappings")

    @property
    @pulumi.getter(name="userConflicts")
    def user_conflicts(self) -> Sequence['outputs.GetFederatedSettingsOrgConfigUserConflictResult']:
        """
        List that contains the users who have an email address that doesn't match any domain on the allowed list. See below
        """
        return pulumi.get(self, "user_conflicts")


class AwaitableGetFederatedSettingsOrgConfigResult(GetFederatedSettingsOrgConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFederatedSettingsOrgConfigResult(
            data_access_identity_provider_ids=self.data_access_identity_provider_ids,
            domain_allow_lists=self.domain_allow_lists,
            domain_restriction_enabled=self.domain_restriction_enabled,
            federation_settings_id=self.federation_settings_id,
            id=self.id,
            identity_provider_id=self.identity_provider_id,
            org_id=self.org_id,
            post_auth_role_grants=self.post_auth_role_grants,
            role_mappings=self.role_mappings,
            user_conflicts=self.user_conflicts)


def get_federated_settings_org_config(federation_settings_id: Optional[str] = None,
                                      org_id: Optional[str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedSettingsOrgConfigResult:
    """
    # Data Source: FederatedSettingsOrgConfig

    `FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    org_connection = mongodbatlas.FederatedSettingsOrgConfig("org_connection",
        federation_settings_id="627a9687f7f7f7f774de306f14",
        org_id="627a9683ea7ff7f74de306f14",
        data_access_identity_provider_ids=["64d613677e1ad50839cce4db"],
        domain_restriction_enabled=False,
        domain_allow_lists=["mydomain.com"],
        post_auth_role_grants=["ORG_MEMBER"],
        identity_provider_id="0oaqyt9fc2ySTWnA0357")
    org_configs_ds = mongodbatlas.get_federated_settings_org_config(federation_settings_id=org_connection_mongodbatlas_federated_settings_org_config["id"],
        org_id="627a9683ea7ff7f74de306f14")
    ```


    :param str federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
    :param str org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
    """
    __args__ = dict()
    __args__['federationSettingsId'] = federation_settings_id
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFederatedSettingsOrgConfig:getFederatedSettingsOrgConfig', __args__, opts=opts, typ=GetFederatedSettingsOrgConfigResult).value

    return AwaitableGetFederatedSettingsOrgConfigResult(
        data_access_identity_provider_ids=pulumi.get(__ret__, 'data_access_identity_provider_ids'),
        domain_allow_lists=pulumi.get(__ret__, 'domain_allow_lists'),
        domain_restriction_enabled=pulumi.get(__ret__, 'domain_restriction_enabled'),
        federation_settings_id=pulumi.get(__ret__, 'federation_settings_id'),
        id=pulumi.get(__ret__, 'id'),
        identity_provider_id=pulumi.get(__ret__, 'identity_provider_id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        post_auth_role_grants=pulumi.get(__ret__, 'post_auth_role_grants'),
        role_mappings=pulumi.get(__ret__, 'role_mappings'),
        user_conflicts=pulumi.get(__ret__, 'user_conflicts'))


@_utilities.lift_output_func(get_federated_settings_org_config)
def get_federated_settings_org_config_output(federation_settings_id: Optional[pulumi.Input[str]] = None,
                                             org_id: Optional[pulumi.Input[str]] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFederatedSettingsOrgConfigResult]:
    """
    # Data Source: FederatedSettingsOrgConfig

    `FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    org_connection = mongodbatlas.FederatedSettingsOrgConfig("org_connection",
        federation_settings_id="627a9687f7f7f7f774de306f14",
        org_id="627a9683ea7ff7f74de306f14",
        data_access_identity_provider_ids=["64d613677e1ad50839cce4db"],
        domain_restriction_enabled=False,
        domain_allow_lists=["mydomain.com"],
        post_auth_role_grants=["ORG_MEMBER"],
        identity_provider_id="0oaqyt9fc2ySTWnA0357")
    org_configs_ds = mongodbatlas.get_federated_settings_org_config(federation_settings_id=org_connection_mongodbatlas_federated_settings_org_config["id"],
        org_id="627a9683ea7ff7f74de306f14")
    ```


    :param str federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
    :param str org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
    """
    ...
