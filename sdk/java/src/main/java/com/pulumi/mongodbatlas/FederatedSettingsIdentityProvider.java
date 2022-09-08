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
 * ## Example Usage
 * 
 * &gt; **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.
 * ```java
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
 *         var identityProvider = new FederatedSettingsIdentityProvider(&#34;identityProvider&#34;, FederatedSettingsIdentityProviderArgs.builder()        
 *             .associatedDomains(&#34;yourdomain.com&#34;)
 *             .federationSettingsId(&#34;627a9687f7f7f7f774de306f14&#34;)
 *             .issuerUri(&#34;http://www.okta.com/exk17q7f7f7f7fp50h8&#34;)
 *             .requestBinding(&#34;HTTP-POST&#34;)
 *             .responseSignatureAlgorithm(&#34;SHA-256&#34;)
 *             .ssoDebugEnabled(true)
 *             .ssoUrl(&#34;https://mysso.oktapreview.com/app/mysso_terraformtestsso/exk17q7f7f7f7f50h8/sso/saml&#34;)
 *             .status(&#34;ACTIVE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Identity Provider **must** be imported before using federation_settings_id-idp_id, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider identity_provider 6287a663c660f52b1c441c6c-0oad4fas87jL5Xnk1297
 * ```
 * 
 *  For more information see[MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
 * 
 */
@ResourceType(type="mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider")
public class FederatedSettingsIdentityProvider extends com.pulumi.resources.CustomResource {
    /**
     * List that contains the domains associated with the identity provider.
     * 
     */
    @Export(name="associatedDomains", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> associatedDomains;

    /**
     * @return List that contains the domains associated with the identity provider.
     * 
     */
    public Output<Optional<List<String>>> associatedDomains() {
        return Codegen.optional(this.associatedDomains);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    @Export(name="federationSettingsId", type=String.class, parameters={})
    private Output<String> federationSettingsId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public Output<String> federationSettingsId() {
        return this.federationSettingsId;
    }
    /**
     * Unique string that identifies the issuer of the SAML
     * 
     */
    @Export(name="issuerUri", type=String.class, parameters={})
    private Output<String> issuerUri;

    /**
     * @return Unique string that identifies the issuer of the SAML
     * 
     */
    public Output<String> issuerUri() {
        return this.issuerUri;
    }
    /**
     * Human-readable label that identifies the identity provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="oktaIdpId", type=String.class, parameters={})
    private Output<String> oktaIdpId;

    /**
     * @return Unique 20-hexadecimal digit string that identifies the IdP.
     * 
     */
    public Output<String> oktaIdpId() {
        return this.oktaIdpId;
    }
    /**
     * SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    @Export(name="requestBinding", type=String.class, parameters={})
    private Output<String> requestBinding;

    /**
     * @return SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    public Output<String> requestBinding() {
        return this.requestBinding;
    }
    /**
     * Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
     * 
     */
    @Export(name="responseSignatureAlgorithm", type=String.class, parameters={})
    private Output<String> responseSignatureAlgorithm;

    /**
     * @return Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
     * 
     */
    public Output<String> responseSignatureAlgorithm() {
        return this.responseSignatureAlgorithm;
    }
    /**
     * Flag that indicates whether the identity provider has SSO debug enabled.
     * 
     */
    @Export(name="ssoDebugEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> ssoDebugEnabled;

    /**
     * @return Flag that indicates whether the identity provider has SSO debug enabled.
     * 
     */
    public Output<Boolean> ssoDebugEnabled() {
        return this.ssoDebugEnabled;
    }
    /**
     * Unique string that identifies the intended audience of the SAML assertion.
     * 
     */
    @Export(name="ssoUrl", type=String.class, parameters={})
    private Output<String> ssoUrl;

    /**
     * @return Unique string that identifies the intended audience of the SAML assertion.
     * 
     */
    public Output<String> ssoUrl() {
        return this.ssoUrl;
    }
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
     * 
     */
    public Output<String> status() {
        return this.status;
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
