# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetFederatedSettingsResult',
    'AwaitableGetFederatedSettingsResult',
    'get_federated_settings',
    'get_federated_settings_output',
]

@pulumi.output_type
class GetFederatedSettingsResult:
    """
    A collection of values returned by getFederatedSettings.
    """
    def __init__(__self__, federated_domains=None, has_role_mappings=None, id=None, identity_provider_id=None, identity_provider_status=None, org_id=None):
        if federated_domains and not isinstance(federated_domains, list):
            raise TypeError("Expected argument 'federated_domains' to be a list")
        pulumi.set(__self__, "federated_domains", federated_domains)
        if has_role_mappings and not isinstance(has_role_mappings, bool):
            raise TypeError("Expected argument 'has_role_mappings' to be a bool")
        pulumi.set(__self__, "has_role_mappings", has_role_mappings)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_provider_id and not isinstance(identity_provider_id, str):
            raise TypeError("Expected argument 'identity_provider_id' to be a str")
        pulumi.set(__self__, "identity_provider_id", identity_provider_id)
        if identity_provider_status and not isinstance(identity_provider_status, str):
            raise TypeError("Expected argument 'identity_provider_status' to be a str")
        pulumi.set(__self__, "identity_provider_status", identity_provider_status)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter(name="federatedDomains")
    def federated_domains(self) -> Sequence[str]:
        """
        List that contains the domains associated with the organization's identity provider.
        """
        return pulumi.get(self, "federated_domains")

    @property
    @pulumi.getter(name="hasRoleMappings")
    def has_role_mappings(self) -> bool:
        """
        Flag that indicates whether this organization has role mappings configured.
        """
        return pulumi.get(self, "has_role_mappings")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies this federation.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="identityProviderId")
    def identity_provider_id(self) -> str:
        """
        Unique 20-hexadecimal digit string that identifies the identity provider connected to this organization.
        """
        return pulumi.get(self, "identity_provider_id")

    @property
    @pulumi.getter(name="identityProviderStatus")
    def identity_provider_status(self) -> str:
        """
        Value that indicates whether the identity provider is active. Atlas returns ACTIVE if the identity provider is active and INACTIVE if the identity provider is inactive.
        """
        return pulumi.get(self, "identity_provider_status")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")


class AwaitableGetFederatedSettingsResult(GetFederatedSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFederatedSettingsResult(
            federated_domains=self.federated_domains,
            has_role_mappings=self.has_role_mappings,
            id=self.id,
            identity_provider_id=self.identity_provider_id,
            identity_provider_status=self.identity_provider_status,
            org_id=self.org_id)


def get_federated_settings(org_id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedSettingsResult:
    """
    `get_federated_settings` provides a federated settings data source. Atlas Cloud federated settings provides federated settings outputs.


    :param str org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFederatedSettings:getFederatedSettings', __args__, opts=opts, typ=GetFederatedSettingsResult).value

    return AwaitableGetFederatedSettingsResult(
        federated_domains=pulumi.get(__ret__, 'federated_domains'),
        has_role_mappings=pulumi.get(__ret__, 'has_role_mappings'),
        id=pulumi.get(__ret__, 'id'),
        identity_provider_id=pulumi.get(__ret__, 'identity_provider_id'),
        identity_provider_status=pulumi.get(__ret__, 'identity_provider_status'),
        org_id=pulumi.get(__ret__, 'org_id'))


@_utilities.lift_output_func(get_federated_settings)
def get_federated_settings_output(org_id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFederatedSettingsResult]:
    """
    `get_federated_settings` provides a federated settings data source. Atlas Cloud federated settings provides federated settings outputs.


    :param str org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
    """
    ...
