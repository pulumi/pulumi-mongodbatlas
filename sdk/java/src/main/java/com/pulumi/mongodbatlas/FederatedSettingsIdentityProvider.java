// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.FederatedSettingsIdentityProviderArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.FederatedSettingsIdentityProviderState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.FederatedSettingsIdentityProvider` provides an Atlas federated settings identity provider resource provides a subset of settings to be maintained post import of the existing resource.
 * 
 * &gt; **NOTE:** OIDC Workforce IdP is currently in preview. To learn more about OIDC and existing limitations see the [OIDC Authentication Documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
 * ## Example Usage
 * 
 * &gt; **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.FederatedSettingsIdentityProvider;
 * import com.pulumi.mongodbatlas.FederatedSettingsIdentityProviderArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var identityProvider = new FederatedSettingsIdentityProvider("identityProvider", FederatedSettingsIdentityProviderArgs.builder()
 *             .federationSettingsId("627a9687f7f7f7f774de306f14")
 *             .name("mongodb_federation_test")
 *             .associatedDomains("yourdomain.com")
 *             .ssoDebugEnabled(true)
 *             .status("ACTIVE")
 *             .ssoUrl("https://mysso.oktapreview.com/app/mysso_terraformtestsso/exk17q7f7f7f7f50h8/sso/saml")
 *             .issuerUri("http://www.okta.com/exk17q7f7f7f7fp50h8")
 *             .requestBinding("HTTP-POST")
 *             .responseSignatureAlgorithm("SHA-256")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Identity Provider __must__ be imported before using federation_settings_id-idp_id, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider identity_provider 6287a663c660f52b1c441c6c-0oad4fas87jL5Xnk12971234
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
 * 
 */
@ResourceType(type="mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider")
public class FederatedSettingsIdentityProvider extends com.pulumi.resources.CustomResource {
    /**
     * List that contains the domains associated with the identity provider.
     * 
     */
    @Export(name="associatedDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> associatedDomains;

    /**
     * @return List that contains the domains associated with the identity provider.
     * 
     */
    public Output<Optional<List<String>>> associatedDomains() {
        return Codegen.optional(this.associatedDomains);
    }
    /**
     * Identifier of the intended recipient of the token used in OIDC IdP.
     * 
     */
    @Export(name="audience", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> audience;

    /**
     * @return Identifier of the intended recipient of the token used in OIDC IdP.
     * 
     */
    public Output<Optional<String>> audience() {
        return Codegen.optional(this.audience);
    }
    /**
     * Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
     * 
     */
    @Export(name="authorizationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationType;

    /**
     * @return Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
     * 
     */
    public Output<Optional<String>> authorizationType() {
        return Codegen.optional(this.authorizationType);
    }
    /**
     * Client identifier that is assigned to an application by the OIDC Identity Provider.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientId;

    /**
     * @return Client identifier that is assigned to an application by the OIDC Identity Provider.
     * 
     */
    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    /**
     * The description of the identity provider.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the identity provider.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    @Export(name="federationSettingsId", refs={String.class}, tree="[0]")
    private Output<String> federationSettingsId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public Output<String> federationSettingsId() {
        return this.federationSettingsId;
    }
    /**
     * Identifier of the claim which contains OIDC IdP Group IDs in the token.
     * 
     */
    @Export(name="groupsClaim", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> groupsClaim;

    /**
     * @return Identifier of the claim which contains OIDC IdP Group IDs in the token.
     * 
     */
    public Output<Optional<String>> groupsClaim() {
        return Codegen.optional(this.groupsClaim);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the IdP.
     * 
     */
    @Export(name="idpId", refs={String.class}, tree="[0]")
    private Output<String> idpId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the IdP.
     * 
     */
    public Output<String> idpId() {
        return this.idpId;
    }
    @Export(name="idpType", refs={String.class}, tree="[0]")
    private Output<String> idpType;

    public Output<String> idpType() {
        return this.idpType;
    }
    /**
     * Unique string that identifies the issuer of the IdP.
     * 
     */
    @Export(name="issuerUri", refs={String.class}, tree="[0]")
    private Output<String> issuerUri;

    /**
     * @return Unique string that identifies the issuer of the IdP.
     * 
     */
    public Output<String> issuerUri() {
        return this.issuerUri;
    }
    /**
     * Human-readable label that identifies the identity provider.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human-readable label that identifies the identity provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique 20-hexadecimal digit string that identifies the IdP.
     * 
     */
    @Export(name="oktaIdpId", refs={String.class}, tree="[0]")
    private Output<String> oktaIdpId;

    /**
     * @return Unique 20-hexadecimal digit string that identifies the IdP.
     * 
     */
    public Output<String> oktaIdpId() {
        return this.oktaIdpId;
    }
    /**
     * The protocol of the identity provider. Either `SAML` or `OIDC`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return The protocol of the identity provider. Either `SAML` or `OIDC`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    @Export(name="requestBinding", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> requestBinding;

    /**
     * @return SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    public Output<Optional<String>> requestBinding() {
        return Codegen.optional(this.requestBinding);
    }
    /**
     * Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
     * 
     */
    @Export(name="requestedScopes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> requestedScopes;

    /**
     * @return Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
     * 
     */
    public Output<Optional<List<String>>> requestedScopes() {
        return Codegen.optional(this.requestedScopes);
    }
    /**
     * Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
     * 
     */
    @Export(name="responseSignatureAlgorithm", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> responseSignatureAlgorithm;

    /**
     * @return Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
     * 
     */
    public Output<Optional<String>> responseSignatureAlgorithm() {
        return Codegen.optional(this.responseSignatureAlgorithm);
    }
    /**
     * Flag that indicates whether the identity provider has SSO debug enabled.
     * 
     */
    @Export(name="ssoDebugEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ssoDebugEnabled;

    /**
     * @return Flag that indicates whether the identity provider has SSO debug enabled.
     * 
     */
    public Output<Optional<Boolean>> ssoDebugEnabled() {
        return Codegen.optional(this.ssoDebugEnabled);
    }
    /**
     * Unique string that identifies the intended audience of the SAML assertion.
     * 
     */
    @Export(name="ssoUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ssoUrl;

    /**
     * @return Unique string that identifies the intended audience of the SAML assertion.
     * 
     */
    public Output<Optional<String>> ssoUrl() {
        return Codegen.optional(this.ssoUrl);
    }
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
     * userClaim is required for OIDC IdP with authorizationType GROUP and USER.
     * 
     */
    @Export(name="userClaim", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userClaim;

    /**
     * @return Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
     * userClaim is required for OIDC IdP with authorizationType GROUP and USER.
     * 
     */
    public Output<Optional<String>> userClaim() {
        return Codegen.optional(this.userClaim);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FederatedSettingsIdentityProvider(String name) {
        this(name, FederatedSettingsIdentityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FederatedSettingsIdentityProvider(String name, FederatedSettingsIdentityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FederatedSettingsIdentityProvider(String name, FederatedSettingsIdentityProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider", name, args == null ? FederatedSettingsIdentityProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FederatedSettingsIdentityProvider(String name, Output<String> id, @Nullable FederatedSettingsIdentityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FederatedSettingsIdentityProvider get(String name, Output<String> id, @Nullable FederatedSettingsIdentityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FederatedSettingsIdentityProvider(name, id, state, options);
    }
}
