// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FederatedSettingsIdentityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedSettingsIdentityProviderArgs Empty = new FederatedSettingsIdentityProviderArgs();

    /**
     * List that contains the domains associated with the identity provider.
     * 
     */
    @Import(name="associatedDomains")
    private @Nullable Output<List<String>> associatedDomains;

    /**
     * @return List that contains the domains associated with the identity provider.
     * 
     */
    public Optional<Output<List<String>>> associatedDomains() {
        return Optional.ofNullable(this.associatedDomains);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    @Import(name="federationSettingsId", required=true)
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
    @Import(name="issuerUri", required=true)
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
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human-readable label that identifies the identity provider.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    @Import(name="requestBinding", required=true)
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
    @Import(name="responseSignatureAlgorithm", required=true)
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
    @Import(name="ssoDebugEnabled", required=true)
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
    @Import(name="ssoUrl", required=true)
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
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private FederatedSettingsIdentityProviderArgs() {}

    private FederatedSettingsIdentityProviderArgs(FederatedSettingsIdentityProviderArgs $) {
        this.associatedDomains = $.associatedDomains;
        this.federationSettingsId = $.federationSettingsId;
        this.issuerUri = $.issuerUri;
        this.name = $.name;
        this.requestBinding = $.requestBinding;
        this.responseSignatureAlgorithm = $.responseSignatureAlgorithm;
        this.ssoDebugEnabled = $.ssoDebugEnabled;
        this.ssoUrl = $.ssoUrl;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedSettingsIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedSettingsIdentityProviderArgs $;

        public Builder() {
            $ = new FederatedSettingsIdentityProviderArgs();
        }

        public Builder(FederatedSettingsIdentityProviderArgs defaults) {
            $ = new FederatedSettingsIdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associatedDomains List that contains the domains associated with the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder associatedDomains(@Nullable Output<List<String>> associatedDomains) {
            $.associatedDomains = associatedDomains;
            return this;
        }

        /**
         * @param associatedDomains List that contains the domains associated with the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder associatedDomains(List<String> associatedDomains) {
            return associatedDomains(Output.of(associatedDomains));
        }

        /**
         * @param associatedDomains List that contains the domains associated with the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder associatedDomains(String... associatedDomains) {
            return associatedDomains(List.of(associatedDomains));
        }

        /**
         * @param federationSettingsId Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
         * 
         * @return builder
         * 
         */
        public Builder federationSettingsId(Output<String> federationSettingsId) {
            $.federationSettingsId = federationSettingsId;
            return this;
        }

        /**
         * @param federationSettingsId Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
         * 
         * @return builder
         * 
         */
        public Builder federationSettingsId(String federationSettingsId) {
            return federationSettingsId(Output.of(federationSettingsId));
        }

        /**
         * @param issuerUri Unique string that identifies the issuer of the SAML
         * 
         * @return builder
         * 
         */
        public Builder issuerUri(Output<String> issuerUri) {
            $.issuerUri = issuerUri;
            return this;
        }

        /**
         * @param issuerUri Unique string that identifies the issuer of the SAML
         * 
         * @return builder
         * 
         */
        public Builder issuerUri(String issuerUri) {
            return issuerUri(Output.of(issuerUri));
        }

        /**
         * @param name Human-readable label that identifies the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human-readable label that identifies the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requestBinding SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
         * - HTTP POST
         * - HTTP REDIRECT
         * 
         * @return builder
         * 
         */
        public Builder requestBinding(Output<String> requestBinding) {
            $.requestBinding = requestBinding;
            return this;
        }

        /**
         * @param requestBinding SAML Authentication Request Protocol HTTP method binding (POST or REDIRECT) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
         * - HTTP POST
         * - HTTP REDIRECT
         * 
         * @return builder
         * 
         */
        public Builder requestBinding(String requestBinding) {
            return requestBinding(Output.of(requestBinding));
        }

        /**
         * @param responseSignatureAlgorithm Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
         * 
         * @return builder
         * 
         */
        public Builder responseSignatureAlgorithm(Output<String> responseSignatureAlgorithm) {
            $.responseSignatureAlgorithm = responseSignatureAlgorithm;
            return this;
        }

        /**
         * @param responseSignatureAlgorithm Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include SHA-1 and SHA-256.
         * 
         * @return builder
         * 
         */
        public Builder responseSignatureAlgorithm(String responseSignatureAlgorithm) {
            return responseSignatureAlgorithm(Output.of(responseSignatureAlgorithm));
        }

        /**
         * @param ssoDebugEnabled Flag that indicates whether the identity provider has SSO debug enabled.
         * 
         * @return builder
         * 
         */
        public Builder ssoDebugEnabled(Output<Boolean> ssoDebugEnabled) {
            $.ssoDebugEnabled = ssoDebugEnabled;
            return this;
        }

        /**
         * @param ssoDebugEnabled Flag that indicates whether the identity provider has SSO debug enabled.
         * 
         * @return builder
         * 
         */
        public Builder ssoDebugEnabled(Boolean ssoDebugEnabled) {
            return ssoDebugEnabled(Output.of(ssoDebugEnabled));
        }

        /**
         * @param ssoUrl Unique string that identifies the intended audience of the SAML assertion.
         * 
         * @return builder
         * 
         */
        public Builder ssoUrl(Output<String> ssoUrl) {
            $.ssoUrl = ssoUrl;
            return this;
        }

        /**
         * @param ssoUrl Unique string that identifies the intended audience of the SAML assertion.
         * 
         * @return builder
         * 
         */
        public Builder ssoUrl(String ssoUrl) {
            return ssoUrl(Output.of(ssoUrl));
        }

        /**
         * @param status String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public FederatedSettingsIdentityProviderArgs build() {
            $.federationSettingsId = Objects.requireNonNull($.federationSettingsId, "expected parameter 'federationSettingsId' to be non-null");
            $.issuerUri = Objects.requireNonNull($.issuerUri, "expected parameter 'issuerUri' to be non-null");
            $.requestBinding = Objects.requireNonNull($.requestBinding, "expected parameter 'requestBinding' to be non-null");
            $.responseSignatureAlgorithm = Objects.requireNonNull($.responseSignatureAlgorithm, "expected parameter 'responseSignatureAlgorithm' to be non-null");
            $.ssoDebugEnabled = Objects.requireNonNull($.ssoDebugEnabled, "expected parameter 'ssoDebugEnabled' to be non-null");
            $.ssoUrl = Objects.requireNonNull($.ssoUrl, "expected parameter 'ssoUrl' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
