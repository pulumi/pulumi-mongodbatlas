# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FederatedSettingsIdentityProviderArgs', 'FederatedSettingsIdentityProvider']

@pulumi.input_type
class FederatedSettingsIdentityProviderArgs:
    def __init__(__self__, *,
                 federation_settings_id: pulumi.Input[str],
                 issuer_uri: pulumi.Input[str],
                 request_binding: pulumi.Input[str],
                 response_signature_algorithm: pulumi.Input[str],
                 sso_debug_enabled: pulumi.Input[bool],
                 sso_url: pulumi.Input[str],
                 status: pulumi.Input[str],
                 associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FederatedSettingsIdentityProvider resource.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        :param pulumi.Input[str] issuer_uri: Unique string that identifies the issuer of the SAML
        :param pulumi.Input[str] request_binding: SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
               - HTTP POST
               - HTTP REDIRECT
        :param pulumi.Input[str] response_signature_algorithm: Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        :param pulumi.Input[bool] sso_debug_enabled: Flag that indicates whether the identity provider has SSO debug enabled.
        :param pulumi.Input[str] sso_url: Unique string that identifies the intended audience of the SAML assertion.
        :param pulumi.Input[str] status: String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_domains: List that contains the domains associated with the identity provider.
        :param pulumi.Input[str] name: Human-readable label that identifies the identity provider.
        """
        FederatedSettingsIdentityProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            federation_settings_id=federation_settings_id,
            issuer_uri=issuer_uri,
            request_binding=request_binding,
            response_signature_algorithm=response_signature_algorithm,
            sso_debug_enabled=sso_debug_enabled,
            sso_url=sso_url,
            status=status,
            associated_domains=associated_domains,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             federation_settings_id: pulumi.Input[str],
             issuer_uri: pulumi.Input[str],
             request_binding: pulumi.Input[str],
             response_signature_algorithm: pulumi.Input[str],
             sso_debug_enabled: pulumi.Input[bool],
             sso_url: pulumi.Input[str],
             status: pulumi.Input[str],
             associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("federation_settings_id", federation_settings_id)
        _setter("issuer_uri", issuer_uri)
        _setter("request_binding", request_binding)
        _setter("response_signature_algorithm", response_signature_algorithm)
        _setter("sso_debug_enabled", sso_debug_enabled)
        _setter("sso_url", sso_url)
        _setter("status", status)
        if associated_domains is not None:
            _setter("associated_domains", associated_domains)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        """
        return pulumi.get(self, "federation_settings_id")

    @federation_settings_id.setter
    def federation_settings_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "federation_settings_id", value)

    @property
    @pulumi.getter(name="issuerUri")
    def issuer_uri(self) -> pulumi.Input[str]:
        """
        Unique string that identifies the issuer of the SAML
        """
        return pulumi.get(self, "issuer_uri")

    @issuer_uri.setter
    def issuer_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "issuer_uri", value)

    @property
    @pulumi.getter(name="requestBinding")
    def request_binding(self) -> pulumi.Input[str]:
        """
        SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
        - HTTP POST
        - HTTP REDIRECT
        """
        return pulumi.get(self, "request_binding")

    @request_binding.setter
    def request_binding(self, value: pulumi.Input[str]):
        pulumi.set(self, "request_binding", value)

    @property
    @pulumi.getter(name="responseSignatureAlgorithm")
    def response_signature_algorithm(self) -> pulumi.Input[str]:
        """
        Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        """
        return pulumi.get(self, "response_signature_algorithm")

    @response_signature_algorithm.setter
    def response_signature_algorithm(self, value: pulumi.Input[str]):
        pulumi.set(self, "response_signature_algorithm", value)

    @property
    @pulumi.getter(name="ssoDebugEnabled")
    def sso_debug_enabled(self) -> pulumi.Input[bool]:
        """
        Flag that indicates whether the identity provider has SSO debug enabled.
        """
        return pulumi.get(self, "sso_debug_enabled")

    @sso_debug_enabled.setter
    def sso_debug_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "sso_debug_enabled", value)

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> pulumi.Input[str]:
        """
        Unique string that identifies the intended audience of the SAML assertion.
        """
        return pulumi.get(self, "sso_url")

    @sso_url.setter
    def sso_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "sso_url", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="associatedDomains")
    def associated_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List that contains the domains associated with the identity provider.
        """
        return pulumi.get(self, "associated_domains")

    @associated_domains.setter
    def associated_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_domains", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that identifies the identity provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FederatedSettingsIdentityProviderState:
    def __init__(__self__, *,
                 associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 issuer_uri: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 okta_idp_id: Optional[pulumi.Input[str]] = None,
                 request_binding: Optional[pulumi.Input[str]] = None,
                 response_signature_algorithm: Optional[pulumi.Input[str]] = None,
                 sso_debug_enabled: Optional[pulumi.Input[bool]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FederatedSettingsIdentityProvider resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_domains: List that contains the domains associated with the identity provider.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        :param pulumi.Input[str] issuer_uri: Unique string that identifies the issuer of the SAML
        :param pulumi.Input[str] name: Human-readable label that identifies the identity provider.
        :param pulumi.Input[str] okta_idp_id: Unique 20-hexadecimal digit string that identifies the IdP.
        :param pulumi.Input[str] request_binding: SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
               - HTTP POST
               - HTTP REDIRECT
        :param pulumi.Input[str] response_signature_algorithm: Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        :param pulumi.Input[bool] sso_debug_enabled: Flag that indicates whether the identity provider has SSO debug enabled.
        :param pulumi.Input[str] sso_url: Unique string that identifies the intended audience of the SAML assertion.
        :param pulumi.Input[str] status: String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        """
        _FederatedSettingsIdentityProviderState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            associated_domains=associated_domains,
            federation_settings_id=federation_settings_id,
            issuer_uri=issuer_uri,
            name=name,
            okta_idp_id=okta_idp_id,
            request_binding=request_binding,
            response_signature_algorithm=response_signature_algorithm,
            sso_debug_enabled=sso_debug_enabled,
            sso_url=sso_url,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             federation_settings_id: Optional[pulumi.Input[str]] = None,
             issuer_uri: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             okta_idp_id: Optional[pulumi.Input[str]] = None,
             request_binding: Optional[pulumi.Input[str]] = None,
             response_signature_algorithm: Optional[pulumi.Input[str]] = None,
             sso_debug_enabled: Optional[pulumi.Input[bool]] = None,
             sso_url: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if associated_domains is not None:
            _setter("associated_domains", associated_domains)
        if federation_settings_id is not None:
            _setter("federation_settings_id", federation_settings_id)
        if issuer_uri is not None:
            _setter("issuer_uri", issuer_uri)
        if name is not None:
            _setter("name", name)
        if okta_idp_id is not None:
            _setter("okta_idp_id", okta_idp_id)
        if request_binding is not None:
            _setter("request_binding", request_binding)
        if response_signature_algorithm is not None:
            _setter("response_signature_algorithm", response_signature_algorithm)
        if sso_debug_enabled is not None:
            _setter("sso_debug_enabled", sso_debug_enabled)
        if sso_url is not None:
            _setter("sso_url", sso_url)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="associatedDomains")
    def associated_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List that contains the domains associated with the identity provider.
        """
        return pulumi.get(self, "associated_domains")

    @associated_domains.setter
    def associated_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_domains", value)

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        """
        return pulumi.get(self, "federation_settings_id")

    @federation_settings_id.setter
    def federation_settings_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "federation_settings_id", value)

    @property
    @pulumi.getter(name="issuerUri")
    def issuer_uri(self) -> Optional[pulumi.Input[str]]:
        """
        Unique string that identifies the issuer of the SAML
        """
        return pulumi.get(self, "issuer_uri")

    @issuer_uri.setter
    def issuer_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer_uri", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that identifies the identity provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="oktaIdpId")
    def okta_idp_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 20-hexadecimal digit string that identifies the IdP.
        """
        return pulumi.get(self, "okta_idp_id")

    @okta_idp_id.setter
    def okta_idp_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "okta_idp_id", value)

    @property
    @pulumi.getter(name="requestBinding")
    def request_binding(self) -> Optional[pulumi.Input[str]]:
        """
        SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
        - HTTP POST
        - HTTP REDIRECT
        """
        return pulumi.get(self, "request_binding")

    @request_binding.setter
    def request_binding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_binding", value)

    @property
    @pulumi.getter(name="responseSignatureAlgorithm")
    def response_signature_algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        """
        return pulumi.get(self, "response_signature_algorithm")

    @response_signature_algorithm.setter
    def response_signature_algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "response_signature_algorithm", value)

    @property
    @pulumi.getter(name="ssoDebugEnabled")
    def sso_debug_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag that indicates whether the identity provider has SSO debug enabled.
        """
        return pulumi.get(self, "sso_debug_enabled")

    @sso_debug_enabled.setter
    def sso_debug_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "sso_debug_enabled", value)

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> Optional[pulumi.Input[str]]:
        """
        Unique string that identifies the intended audience of the SAML assertion.
        """
        return pulumi.get(self, "sso_url")

    @sso_url.setter
    def sso_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sso_url", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class FederatedSettingsIdentityProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 issuer_uri: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_binding: Optional[pulumi.Input[str]] = None,
                 response_signature_algorithm: Optional[pulumi.Input[str]] = None,
                 sso_debug_enabled: Optional[pulumi.Input[bool]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `FederatedSettingsIdentityProvider` provides an Atlas federated settings identity provider resource provides a subset of settings to be maintained post import of the existing resource.
        ## Example Usage

        > **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        identity_provider = mongodbatlas.FederatedSettingsIdentityProvider("identityProvider",
            associated_domains=["yourdomain.com"],
            federation_settings_id="627a9687f7f7f7f774de306f14",
            issuer_uri="http://www.okta.com/exk17q7f7f7f7fp50h8",
            request_binding="HTTP-POST",
            response_signature_algorithm="SHA-256",
            sso_debug_enabled=True,
            sso_url="https://mysso.oktapreview.com/app/mysso_terraformtestsso/exk17q7f7f7f7f50h8/sso/saml",
            status="ACTIVE")
        ```

        ## Import

        Identity Provider __must__ be imported before using federation_settings_id-idp_id, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider identity_provider 6287a663c660f52b1c441c6c-0oad4fas87jL5Xnk1297
        ```
         For more information see[MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_domains: List that contains the domains associated with the identity provider.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        :param pulumi.Input[str] issuer_uri: Unique string that identifies the issuer of the SAML
        :param pulumi.Input[str] name: Human-readable label that identifies the identity provider.
        :param pulumi.Input[str] request_binding: SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
               - HTTP POST
               - HTTP REDIRECT
        :param pulumi.Input[str] response_signature_algorithm: Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        :param pulumi.Input[bool] sso_debug_enabled: Flag that indicates whether the identity provider has SSO debug enabled.
        :param pulumi.Input[str] sso_url: Unique string that identifies the intended audience of the SAML assertion.
        :param pulumi.Input[str] status: String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FederatedSettingsIdentityProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `FederatedSettingsIdentityProvider` provides an Atlas federated settings identity provider resource provides a subset of settings to be maintained post import of the existing resource.
        ## Example Usage

        > **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        identity_provider = mongodbatlas.FederatedSettingsIdentityProvider("identityProvider",
            associated_domains=["yourdomain.com"],
            federation_settings_id="627a9687f7f7f7f774de306f14",
            issuer_uri="http://www.okta.com/exk17q7f7f7f7fp50h8",
            request_binding="HTTP-POST",
            response_signature_algorithm="SHA-256",
            sso_debug_enabled=True,
            sso_url="https://mysso.oktapreview.com/app/mysso_terraformtestsso/exk17q7f7f7f7f50h8/sso/saml",
            status="ACTIVE")
        ```

        ## Import

        Identity Provider __must__ be imported before using federation_settings_id-idp_id, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider identity_provider 6287a663c660f52b1c441c6c-0oad4fas87jL5Xnk1297
        ```
         For more information see[MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)

        :param str resource_name: The name of the resource.
        :param FederatedSettingsIdentityProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FederatedSettingsIdentityProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FederatedSettingsIdentityProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 federation_settings_id: Optional[pulumi.Input[str]] = None,
                 issuer_uri: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_binding: Optional[pulumi.Input[str]] = None,
                 response_signature_algorithm: Optional[pulumi.Input[str]] = None,
                 sso_debug_enabled: Optional[pulumi.Input[bool]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FederatedSettingsIdentityProviderArgs.__new__(FederatedSettingsIdentityProviderArgs)

            __props__.__dict__["associated_domains"] = associated_domains
            if federation_settings_id is None and not opts.urn:
                raise TypeError("Missing required property 'federation_settings_id'")
            __props__.__dict__["federation_settings_id"] = federation_settings_id
            if issuer_uri is None and not opts.urn:
                raise TypeError("Missing required property 'issuer_uri'")
            __props__.__dict__["issuer_uri"] = issuer_uri
            __props__.__dict__["name"] = name
            if request_binding is None and not opts.urn:
                raise TypeError("Missing required property 'request_binding'")
            __props__.__dict__["request_binding"] = request_binding
            if response_signature_algorithm is None and not opts.urn:
                raise TypeError("Missing required property 'response_signature_algorithm'")
            __props__.__dict__["response_signature_algorithm"] = response_signature_algorithm
            if sso_debug_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'sso_debug_enabled'")
            __props__.__dict__["sso_debug_enabled"] = sso_debug_enabled
            if sso_url is None and not opts.urn:
                raise TypeError("Missing required property 'sso_url'")
            __props__.__dict__["sso_url"] = sso_url
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            __props__.__dict__["okta_idp_id"] = None
        super(FederatedSettingsIdentityProvider, __self__).__init__(
            'mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            associated_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            federation_settings_id: Optional[pulumi.Input[str]] = None,
            issuer_uri: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            okta_idp_id: Optional[pulumi.Input[str]] = None,
            request_binding: Optional[pulumi.Input[str]] = None,
            response_signature_algorithm: Optional[pulumi.Input[str]] = None,
            sso_debug_enabled: Optional[pulumi.Input[bool]] = None,
            sso_url: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'FederatedSettingsIdentityProvider':
        """
        Get an existing FederatedSettingsIdentityProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_domains: List that contains the domains associated with the identity provider.
        :param pulumi.Input[str] federation_settings_id: Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        :param pulumi.Input[str] issuer_uri: Unique string that identifies the issuer of the SAML
        :param pulumi.Input[str] name: Human-readable label that identifies the identity provider.
        :param pulumi.Input[str] okta_idp_id: Unique 20-hexadecimal digit string that identifies the IdP.
        :param pulumi.Input[str] request_binding: SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
               - HTTP POST
               - HTTP REDIRECT
        :param pulumi.Input[str] response_signature_algorithm: Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        :param pulumi.Input[bool] sso_debug_enabled: Flag that indicates whether the identity provider has SSO debug enabled.
        :param pulumi.Input[str] sso_url: Unique string that identifies the intended audience of the SAML assertion.
        :param pulumi.Input[str] status: String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FederatedSettingsIdentityProviderState.__new__(_FederatedSettingsIdentityProviderState)

        __props__.__dict__["associated_domains"] = associated_domains
        __props__.__dict__["federation_settings_id"] = federation_settings_id
        __props__.__dict__["issuer_uri"] = issuer_uri
        __props__.__dict__["name"] = name
        __props__.__dict__["okta_idp_id"] = okta_idp_id
        __props__.__dict__["request_binding"] = request_binding
        __props__.__dict__["response_signature_algorithm"] = response_signature_algorithm
        __props__.__dict__["sso_debug_enabled"] = sso_debug_enabled
        __props__.__dict__["sso_url"] = sso_url
        __props__.__dict__["status"] = status
        return FederatedSettingsIdentityProvider(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="associatedDomains")
    def associated_domains(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List that contains the domains associated with the identity provider.
        """
        return pulumi.get(self, "associated_domains")

    @property
    @pulumi.getter(name="federationSettingsId")
    def federation_settings_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        """
        return pulumi.get(self, "federation_settings_id")

    @property
    @pulumi.getter(name="issuerUri")
    def issuer_uri(self) -> pulumi.Output[str]:
        """
        Unique string that identifies the issuer of the SAML
        """
        return pulumi.get(self, "issuer_uri")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Human-readable label that identifies the identity provider.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oktaIdpId")
    def okta_idp_id(self) -> pulumi.Output[str]:
        """
        Unique 20-hexadecimal digit string that identifies the IdP.
        """
        return pulumi.get(self, "okta_idp_id")

    @property
    @pulumi.getter(name="requestBinding")
    def request_binding(self) -> pulumi.Output[str]:
        """
        SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
        - HTTP POST
        - HTTP REDIRECT
        """
        return pulumi.get(self, "request_binding")

    @property
    @pulumi.getter(name="responseSignatureAlgorithm")
    def response_signature_algorithm(self) -> pulumi.Output[str]:
        """
        Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
        """
        return pulumi.get(self, "response_signature_algorithm")

    @property
    @pulumi.getter(name="ssoDebugEnabled")
    def sso_debug_enabled(self) -> pulumi.Output[bool]:
        """
        Flag that indicates whether the identity provider has SSO debug enabled.
        """
        return pulumi.get(self, "sso_debug_enabled")

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> pulumi.Output[str]:
        """
        Unique string that identifies the intended audience of the SAML assertion.
        """
        return pulumi.get(self, "sso_url")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
        """
        return pulumi.get(self, "status")

