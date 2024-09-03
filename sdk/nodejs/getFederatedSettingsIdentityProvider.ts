// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * # Data Source: mongodbatlas.FederatedSettingsIdentityProvider
 *
 * `mongodbatlas.FederatedSettingsIdentityProvider` provides a federated settings identity provider data source. Atlas federated settings identity provider provides federated settings outputs for the configured identity provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const identityProvider = new mongodbatlas.FederatedSettingsIdentityProvider("identity_provider", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     name: "mongodb_federation_test",
 *     associatedDomains: ["yourdomain.com"],
 *     ssoDebugEnabled: true,
 *     status: "ACTIVE",
 *     ssoUrl: "https://mysso.oktapreview.com/app/mysso_terraformtest_1/exk177f7f7f70h8/sso/saml",
 *     issuerUri: "http://www.okta.com/exk17f7f7f7f7p50h8",
 *     requestBinding: "HTTP-POST",
 *     responseSignatureAlgorithm: "SHA-256",
 * });
 * const identityProviderDs = mongodbatlas.getFederatedSettingsIdentityProviderOutput({
 *     federationSettingsId: identityProvider.id,
 *     identityProviderId: "0oad4fas87jL5Xnk12971234",
 * });
 * ```
 */
export function getFederatedSettingsIdentityProvider(args: GetFederatedSettingsIdentityProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedSettingsIdentityProviderResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedSettingsIdentityProvider:getFederatedSettingsIdentityProvider", {
        "federationSettingsId": args.federationSettingsId,
        "identityProviderId": args.identityProviderId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedSettingsIdentityProvider.
 */
export interface GetFederatedSettingsIdentityProviderArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the IdP.
     */
    identityProviderId: string;
}

/**
 * A collection of values returned by getFederatedSettingsIdentityProvider.
 */
export interface GetFederatedSettingsIdentityProviderResult {
    /**
     * Assertion consumer service URL to which the IdP sends the SAML response.
     */
    readonly acsUrl: string;
    /**
     * List that contains the configured domains from which users can log in for this IdP.
     */
    readonly associatedDomains: string[];
    /**
     * List that contains the organizations from which users can log in for this IdP.
     */
    readonly associatedOrgs: outputs.GetFederatedSettingsIdentityProviderAssociatedOrg[];
    /**
     * Identifier of the intended recipient of the token.
     */
    readonly audience: string;
    /**
     * Identifier for the intended audience of the SAML Assertion.
     */
    readonly audienceUri: string;
    /**
     * Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
     */
    readonly authorizationType: string;
    /**
     * Client identifier that is assigned to an application by the Identity Provider.
     */
    readonly clientId: string;
    /**
     * The description of the identity provider.
     */
    readonly description: string;
    /**
     * Human-readable label that identifies the IdP.
     */
    readonly displayName: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    readonly federationSettingsId: string;
    /**
     * Identifier of the claim which contains IdP Group IDs in the token.
     */
    readonly groupsClaim: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identityProviderId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the IdP
     */
    readonly idpId: string;
    /**
     * Type of the identity provider. Valid values are `WORKFORCE` or `WORKLOAD`.
     */
    readonly idpType: string;
    /**
     * Identifier for the issuer of the SAML Assertion.
     */
    readonly issuerUri: string;
    /**
     * Unique 20-hexadecimal digit string that identifies the IdP.
     */
    readonly oktaIdpId: string;
    readonly pemFileInfos: outputs.GetFederatedSettingsIdentityProviderPemFileInfo[];
    /**
     * The protocol of the identity provider. Valid values are `SAML` or `OIDC`.
     */
    readonly protocol: string;
    /**
     * SAML Authentication Request Protocol binding used to send the AuthNRequest. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     */
    readonly requestBinding: string;
    /**
     * Scopes that MongoDB applications will request from the authorization endpoint.
     */
    readonly requestedScopes: string[];
    /**
     * Algorithm used to encrypt the IdP signature. Atlas supports the following signature algorithm values:
     * - SHA-1
     * - SHA-256
     */
    readonly responseSignatureAlgorithm: string;
    /**
     * Flag that indicates whether the IdP has enabled Bypass SAML Mode. Enabling this mode generates a URL that allows you bypass SAML and login to your organizations at any point. You can authenticate with this special URL only when Bypass Mode is enabled. Set this parameter to true during testing. This keeps you from getting locked out of MongoDB.
     */
    readonly ssoDebugEnabled: boolean;
    /**
     * URL of the receiver of the SAML AuthNRequest.
     */
    readonly ssoUrl: string;
    /**
     * Label that indicates whether the identity provider is active. The IdP is Inactive until you map at least one domain to the IdP.
     */
    readonly status: string;
    /**
     * Identifier of the claim which contains the user ID in the token.
     */
    readonly userClaim: string;
}
/**
 * # Data Source: mongodbatlas.FederatedSettingsIdentityProvider
 *
 * `mongodbatlas.FederatedSettingsIdentityProvider` provides a federated settings identity provider data source. Atlas federated settings identity provider provides federated settings outputs for the configured identity provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const identityProvider = new mongodbatlas.FederatedSettingsIdentityProvider("identity_provider", {
 *     federationSettingsId: "627a9687f7f7f7f774de306f14",
 *     name: "mongodb_federation_test",
 *     associatedDomains: ["yourdomain.com"],
 *     ssoDebugEnabled: true,
 *     status: "ACTIVE",
 *     ssoUrl: "https://mysso.oktapreview.com/app/mysso_terraformtest_1/exk177f7f7f70h8/sso/saml",
 *     issuerUri: "http://www.okta.com/exk17f7f7f7f7p50h8",
 *     requestBinding: "HTTP-POST",
 *     responseSignatureAlgorithm: "SHA-256",
 * });
 * const identityProviderDs = mongodbatlas.getFederatedSettingsIdentityProviderOutput({
 *     federationSettingsId: identityProvider.id,
 *     identityProviderId: "0oad4fas87jL5Xnk12971234",
 * });
 * ```
 */
export function getFederatedSettingsIdentityProviderOutput(args: GetFederatedSettingsIdentityProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedSettingsIdentityProviderResult> {
    return pulumi.output(args).apply((a: any) => getFederatedSettingsIdentityProvider(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedSettingsIdentityProvider.
 */
export interface GetFederatedSettingsIdentityProviderOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     */
    federationSettingsId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the IdP.
     */
    identityProviderId: pulumi.Input<string>;
}
