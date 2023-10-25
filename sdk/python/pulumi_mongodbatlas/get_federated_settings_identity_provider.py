# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetFederatedSettingsIdentityProviderResult',
    'AwaitableGetFederatedSettingsIdentityProviderResult',
    'get_federated_settings_identity_provider',
    'get_federated_settings_identity_provider_output',
]

@pulumi.output_type
class GetFederatedSettingsIdentityProviderResult:
    """
    A collection of values returned by getFederatedSettingsIdentityProvider.
    """
    def __init__(__self__, acs_url=None, associated_domains=None, associated_orgs=None, audience_uri=None, display_name=None, federation_settings_id=None, id=None, identity_provider_id=None, issuer_uri=None, okta_idp_id=None, pem_file_infos=None, request_binding=None, response_signature_algorithm=None, sso_debug_enabled=None, sso_url=None, status=None):
        if acs_url and not isinstance(acs_url, str):
            raise TypeError("Expected argument 'acs_url' to be a str")
        pulumi.set(__self__, "acs_url", acs_url)
        if associated_domains and not isinstance(associated_domains, list):
            raise TypeError("Expected argument 'associated_domains' to be a list")
        pulumi.set(__self__, "associated_domains", associated_domains)
        if associated_orgs and not isinstance(associated_orgs, list):
            raise TypeError("Expected argument 'associated_orgs' to be a list")
        pulumi.set(__self__, "associated_orgs", associated_orgs)
        if audience_uri and not isinstance(audience_uri, str):
            raise TypeError("Expected argument 'audience_uri' to be a str")
        pulumi.set(__self__, "audience_uri", audience_uri)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if federation_settings_id and not isinstance(federation_settings_id, str):
            raise TypeError("Expected argument 'federation_settings_id' to be a str")
        pulumi.set(__self__, "federation_settings_id", federation_settings_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_provider_id and not isinstance(identity_provider_id, str):
            raise TypeError("Expected argument 'identity_provider_id' to be a str")
        pulumi.set(__self__, "identity_provider_id", identity_provider_id)
        if issuer_uri and not isinstance(issuer_uri, str):
            raise TypeError("Expected argument 'issuer_uri' to be a str")
        pulumi.set(__self__, "issuer_uri", issuer_uri)
        if okta_idp_id and not isinstance(okta_idp_id, str):
            raise TypeError("Expected argument 'okta_idp_id' to be a str")
        pulumi.set(__self__, "okta_idp_id", okta_idp_id)
        if pem_file_infos and not isinstance(pem_file_infos, list):
            raise TypeError("Expected argument 'pem_file_infos' to be a list")
        pulumi.set(__self__, "pem_file_infos", pem_file_infos)
        if request_binding and not isinstance(request_binding, str):
            raise TypeError("Expected argument 'request_binding' to be a str")
        pulumi.set(__self__, "request_binding", request_binding)
        if response_signature_algorithm and not isinstance(response_signature_algorithm, str):
            raise TypeError("Expected argument 'response_signature_algorithm' to be a str")
        pulumi.set(__self__, "response_signature_algorithm", response_signature_algorithm)
        if sso_debug_enabled and not isinstance(sso_debug_enabled, bool):
            raise TypeError("Expected argument 'sso_debug_enabled' to be a bool")
        pulumi.set(__self__, "sso_debug_enabled", sso_debug_enabled)
        if sso_url and not isinstance(sso_url, str):
            raise TypeError("Expected argument 'sso_url' to be a str")
        pulumi.set(__self__, "sso_url", sso_url)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="acsUrl")
    def acs_url(self) -> str:
        """
        Assertion consumer service URL to which the IdP sends the SAML response.
        """
        return pulumi.get(self, "acs_url")

    @property
    @pulumi.getter(name="associatedDomains")
    def associated_domains(self) -> Sequence[str]:
        """
        List that contains the configured domains from which users can log in for this IdP.
        """
        return pulumi.get(self, "associated_domains")

    @property
    @pulumi.getter(name="associatedOrgs")
    def associated_orgs(self) -> Sequence['outputs.GetFederatedSettingsIdentityProviderAssociatedOrgResult']:
        """
        List that contains the organizations from which users can log in for this IdP.
        """
        return pulumi.get(self, "associated_orgs")

    @property
    @pulumi.getter(name="audienceUri")
    def audience_uri(self) -> str:
        """
        Identifier for the intended audience of the SAML Assertion.
        """
        return pulumi.get(self, "audience_uri")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        Human-readable label that identifies the IdP.
        """
        return pulumi.get(self, "display_name")

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
        return pulumi.get(self, "identity_provider_id")

    @property
    @pulumi.getter(name="issuerUri")
    def issuer_uri(self) -> str:
        """
        Identifier for the issuer of the SAML Assertion.
        """
        return pulumi.get(self, "issuer_uri")

    @property
    @pulumi.getter(name="oktaIdpId")
    def okta_idp_id(self) -> str:
        """
        Unique 20-hexadecimal digit string that identifies the IdP.
        """
        return pulumi.get(self, "okta_idp_id")

    @property
    @pulumi.getter(name="pemFileInfos")
    def pem_file_infos(self) -> Sequence['outputs.GetFederatedSettingsIdentityProviderPemFileInfoResult']:
        return pulumi.get(self, "pem_file_infos")

    @property
    @pulumi.getter(name="requestBinding")
    def request_binding(self) -> str:
        """
        SAML Authentication Request Protocol binding used to send the AuthNRequest. Atlas supports the following binding values:
        - HTTP POST
        - HTTP REDIRECT
        """
        return pulumi.get(self, "request_binding")

    @property
    @pulumi.getter(name="responseSignatureAlgorithm")
    def response_signature_algorithm(self) -> str:
        """
        Algorithm used to encrypt the IdP signature. Atlas supports the following signature algorithm values:
        - SHA-1
        - SHA-256
        """
        return pulumi.get(self, "response_signature_algorithm")

    @property
    @pulumi.getter(name="ssoDebugEnabled")
    def sso_debug_enabled(self) -> bool:
        """
        Flag that indicates whether the IdP has enabled Bypass SAML Mode. Enabling this mode generates a URL that allows you bypass SAML and login to your organizations at any point. You can authenticate with this special URL only when Bypass Mode is enabled. Set this parameter to true during testing. This keeps you from getting locked out of MongoDB.
        """
        return pulumi.get(self, "sso_debug_enabled")

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> str:
        """
        URL of the receiver of the SAML AuthNRequest.
        """
        return pulumi.get(self, "sso_url")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Label that indicates whether the identity provider is active. The IdP is Inactive until you map at least one domain to the IdP.
        """
        return pulumi.get(self, "status")


class AwaitableGetFederatedSettingsIdentityProviderResult(GetFederatedSettingsIdentityProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFederatedSettingsIdentityProviderResult(
            acs_url=self.acs_url,
            associated_domains=self.associated_domains,
            associated_orgs=self.associated_orgs,
            audience_uri=self.audience_uri,
            display_name=self.display_name,
            federation_settings_id=self.federation_settings_id,
            id=self.id,
            identity_provider_id=self.identity_provider_id,
            issuer_uri=self.issuer_uri,
            okta_idp_id=self.okta_idp_id,
            pem_file_infos=self.pem_file_infos,
            request_binding=self.request_binding,
            response_signature_algorithm=self.response_signature_algorithm,
            sso_debug_enabled=self.sso_debug_enabled,
            sso_url=self.sso_url,
            status=self.status)


def get_federated_settings_identity_provider(federation_settings_id: Optional[str] = None,
                                             identity_provider_id: Optional[str] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFederatedSettingsIdentityProviderResult:
    """
    `FederatedSettingsIdentityProvider` provides a federated settings identity provider data source. Atlas federated settings identity provider provides federated settings outputs for the configured identity provider.


    :param str federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
    :param str identity_provider_id: Unique 20-hexadecimal digit string that identifies the IdP.
    """
    __args__ = dict()
    __args__['federationSettingsId'] = federation_settings_id
    __args__['identityProviderId'] = identity_provider_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFederatedSettingsIdentityProvider:getFederatedSettingsIdentityProvider', __args__, opts=opts, typ=GetFederatedSettingsIdentityProviderResult).value

    return AwaitableGetFederatedSettingsIdentityProviderResult(
        acs_url=pulumi.get(__ret__, 'acs_url'),
        associated_domains=pulumi.get(__ret__, 'associated_domains'),
        associated_orgs=pulumi.get(__ret__, 'associated_orgs'),
        audience_uri=pulumi.get(__ret__, 'audience_uri'),
        display_name=pulumi.get(__ret__, 'display_name'),
        federation_settings_id=pulumi.get(__ret__, 'federation_settings_id'),
        id=pulumi.get(__ret__, 'id'),
        identity_provider_id=pulumi.get(__ret__, 'identity_provider_id'),
        issuer_uri=pulumi.get(__ret__, 'issuer_uri'),
        okta_idp_id=pulumi.get(__ret__, 'okta_idp_id'),
        pem_file_infos=pulumi.get(__ret__, 'pem_file_infos'),
        request_binding=pulumi.get(__ret__, 'request_binding'),
        response_signature_algorithm=pulumi.get(__ret__, 'response_signature_algorithm'),
        sso_debug_enabled=pulumi.get(__ret__, 'sso_debug_enabled'),
        sso_url=pulumi.get(__ret__, 'sso_url'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_federated_settings_identity_provider)
def get_federated_settings_identity_provider_output(federation_settings_id: Optional[pulumi.Input[str]] = None,
                                                    identity_provider_id: Optional[pulumi.Input[str]] = None,
                                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFederatedSettingsIdentityProviderResult]:
    """
    `FederatedSettingsIdentityProvider` provides a federated settings identity provider data source. Atlas federated settings identity provider provides federated settings outputs for the configured identity provider.


    :param str federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
    :param str identity_provider_id: Unique 20-hexadecimal digit string that identifies the IdP.
    """
    ...
