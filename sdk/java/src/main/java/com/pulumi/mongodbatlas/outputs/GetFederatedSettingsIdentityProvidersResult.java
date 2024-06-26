// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedSettingsIdentityProvidersResultAssociatedOrg;
import com.pulumi.mongodbatlas.outputs.GetFederatedSettingsIdentityProvidersResultPemFileInfo;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedSettingsIdentityProvidersResult {
    /**
     * @return Assertion consumer service URL to which the IdP sends the SAML response.
     * 
     */
    private String acsUrl;
    /**
     * @return List that contains the configured domains from which users can log in for this IdP.
     * 
     */
    private List<String> associatedDomains;
    /**
     * @return List that contains the configured domains from which users can log in for this IdP.
     * 
     */
    private List<GetFederatedSettingsIdentityProvidersResultAssociatedOrg> associatedOrgs;
    /**
     * @return Identifier of the intended recipient of the token.
     * 
     */
    private String audience;
    /**
     * @return Identifier for the intended audience of the SAML Assertion.
     * 
     */
    private String audienceUri;
    /**
     * @return Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
     * 
     */
    private String authorizationType;
    /**
     * @return Client identifier that is assigned to an application by the Identity Provider.
     * 
     */
    private String clientId;
    /**
     * @return The description of the identity provider.
     * 
     */
    private String description;
    /**
     * @return Human-readable label that identifies the IdP.
     * 
     */
    private String displayName;
    /**
     * @return Identifier of the claim which contains IdP Group IDs in the token.
     * 
     */
    private String groupsClaim;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the IdP.
     * 
     */
    private String idpId;
    /**
     * @return Type of the identity provider. Valid values are `WORKFORCE` or `WORKLOAD`.
     * 
     */
    private String idpType;
    /**
     * @return Identifier for the issuer of the SAML Assertion.
     * 
     */
    private String issuerUri;
    private String oktaIdpId;
    private List<GetFederatedSettingsIdentityProvidersResultPemFileInfo> pemFileInfos;
    /**
     * @return The protocol of the identity provider
     * 
     */
    private String protocol;
    /**
     * @return SAML Authentication Request Protocol binding used to send the AuthNRequest. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    private String requestBinding;
    /**
     * @return Scopes that MongoDB applications will request from the authorization endpoint.
     * 
     */
    private List<String> requestedScopes;
    /**
     * @return Algorithm used to encrypt the IdP signature. Atlas supports the following signature algorithm values:
     * - SHA-1
     * - SHA-256
     * 
     */
    private String responseSignatureAlgorithm;
    /**
     * @return Flag that indicates whether the IdP has enabled Bypass SAML Mode. Enabling this mode generates a URL that allows you bypass SAML and login to your organizations at any point. You can authenticate with this special URL only when Bypass Mode is enabled. Set this parameter to true during testing. This keeps you from getting locked out of MongoDB.
     * 
     */
    private Boolean ssoDebugEnabled;
    /**
     * @return URL of the receiver of the SAML AuthNRequest.
     * 
     */
    private String ssoUrl;
    /**
     * @return Label that indicates whether the identity provider is active. The IdP is Inactive until you map at least one domain to the IdP.
     * 
     */
    private String status;
    /**
     * @return Identifier of the claim which contains the user ID in the token.
     * 
     */
    private String userClaim;

    private GetFederatedSettingsIdentityProvidersResult() {}
    /**
     * @return Assertion consumer service URL to which the IdP sends the SAML response.
     * 
     */
    public String acsUrl() {
        return this.acsUrl;
    }
    /**
     * @return List that contains the configured domains from which users can log in for this IdP.
     * 
     */
    public List<String> associatedDomains() {
        return this.associatedDomains;
    }
    /**
     * @return List that contains the configured domains from which users can log in for this IdP.
     * 
     */
    public List<GetFederatedSettingsIdentityProvidersResultAssociatedOrg> associatedOrgs() {
        return this.associatedOrgs;
    }
    /**
     * @return Identifier of the intended recipient of the token.
     * 
     */
    public String audience() {
        return this.audience;
    }
    /**
     * @return Identifier for the intended audience of the SAML Assertion.
     * 
     */
    public String audienceUri() {
        return this.audienceUri;
    }
    /**
     * @return Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
     * 
     */
    public String authorizationType() {
        return this.authorizationType;
    }
    /**
     * @return Client identifier that is assigned to an application by the Identity Provider.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The description of the identity provider.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Human-readable label that identifies the IdP.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Identifier of the claim which contains IdP Group IDs in the token.
     * 
     */
    public String groupsClaim() {
        return this.groupsClaim;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the IdP.
     * 
     */
    public String idpId() {
        return this.idpId;
    }
    /**
     * @return Type of the identity provider. Valid values are `WORKFORCE` or `WORKLOAD`.
     * 
     */
    public String idpType() {
        return this.idpType;
    }
    /**
     * @return Identifier for the issuer of the SAML Assertion.
     * 
     */
    public String issuerUri() {
        return this.issuerUri;
    }
    public String oktaIdpId() {
        return this.oktaIdpId;
    }
    public List<GetFederatedSettingsIdentityProvidersResultPemFileInfo> pemFileInfos() {
        return this.pemFileInfos;
    }
    /**
     * @return The protocol of the identity provider
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return SAML Authentication Request Protocol binding used to send the AuthNRequest. Atlas supports the following binding values:
     * - HTTP POST
     * - HTTP REDIRECT
     * 
     */
    public String requestBinding() {
        return this.requestBinding;
    }
    /**
     * @return Scopes that MongoDB applications will request from the authorization endpoint.
     * 
     */
    public List<String> requestedScopes() {
        return this.requestedScopes;
    }
    /**
     * @return Algorithm used to encrypt the IdP signature. Atlas supports the following signature algorithm values:
     * - SHA-1
     * - SHA-256
     * 
     */
    public String responseSignatureAlgorithm() {
        return this.responseSignatureAlgorithm;
    }
    /**
     * @return Flag that indicates whether the IdP has enabled Bypass SAML Mode. Enabling this mode generates a URL that allows you bypass SAML and login to your organizations at any point. You can authenticate with this special URL only when Bypass Mode is enabled. Set this parameter to true during testing. This keeps you from getting locked out of MongoDB.
     * 
     */
    public Boolean ssoDebugEnabled() {
        return this.ssoDebugEnabled;
    }
    /**
     * @return URL of the receiver of the SAML AuthNRequest.
     * 
     */
    public String ssoUrl() {
        return this.ssoUrl;
    }
    /**
     * @return Label that indicates whether the identity provider is active. The IdP is Inactive until you map at least one domain to the IdP.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Identifier of the claim which contains the user ID in the token.
     * 
     */
    public String userClaim() {
        return this.userClaim;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedSettingsIdentityProvidersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acsUrl;
        private List<String> associatedDomains;
        private List<GetFederatedSettingsIdentityProvidersResultAssociatedOrg> associatedOrgs;
        private String audience;
        private String audienceUri;
        private String authorizationType;
        private String clientId;
        private String description;
        private String displayName;
        private String groupsClaim;
        private String idpId;
        private String idpType;
        private String issuerUri;
        private String oktaIdpId;
        private List<GetFederatedSettingsIdentityProvidersResultPemFileInfo> pemFileInfos;
        private String protocol;
        private String requestBinding;
        private List<String> requestedScopes;
        private String responseSignatureAlgorithm;
        private Boolean ssoDebugEnabled;
        private String ssoUrl;
        private String status;
        private String userClaim;
        public Builder() {}
        public Builder(GetFederatedSettingsIdentityProvidersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsUrl = defaults.acsUrl;
    	      this.associatedDomains = defaults.associatedDomains;
    	      this.associatedOrgs = defaults.associatedOrgs;
    	      this.audience = defaults.audience;
    	      this.audienceUri = defaults.audienceUri;
    	      this.authorizationType = defaults.authorizationType;
    	      this.clientId = defaults.clientId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupsClaim = defaults.groupsClaim;
    	      this.idpId = defaults.idpId;
    	      this.idpType = defaults.idpType;
    	      this.issuerUri = defaults.issuerUri;
    	      this.oktaIdpId = defaults.oktaIdpId;
    	      this.pemFileInfos = defaults.pemFileInfos;
    	      this.protocol = defaults.protocol;
    	      this.requestBinding = defaults.requestBinding;
    	      this.requestedScopes = defaults.requestedScopes;
    	      this.responseSignatureAlgorithm = defaults.responseSignatureAlgorithm;
    	      this.ssoDebugEnabled = defaults.ssoDebugEnabled;
    	      this.ssoUrl = defaults.ssoUrl;
    	      this.status = defaults.status;
    	      this.userClaim = defaults.userClaim;
        }

        @CustomType.Setter
        public Builder acsUrl(String acsUrl) {
            if (acsUrl == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "acsUrl");
            }
            this.acsUrl = acsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder associatedDomains(List<String> associatedDomains) {
            if (associatedDomains == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "associatedDomains");
            }
            this.associatedDomains = associatedDomains;
            return this;
        }
        public Builder associatedDomains(String... associatedDomains) {
            return associatedDomains(List.of(associatedDomains));
        }
        @CustomType.Setter
        public Builder associatedOrgs(List<GetFederatedSettingsIdentityProvidersResultAssociatedOrg> associatedOrgs) {
            if (associatedOrgs == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "associatedOrgs");
            }
            this.associatedOrgs = associatedOrgs;
            return this;
        }
        public Builder associatedOrgs(GetFederatedSettingsIdentityProvidersResultAssociatedOrg... associatedOrgs) {
            return associatedOrgs(List.of(associatedOrgs));
        }
        @CustomType.Setter
        public Builder audience(String audience) {
            if (audience == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "audience");
            }
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder audienceUri(String audienceUri) {
            if (audienceUri == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "audienceUri");
            }
            this.audienceUri = audienceUri;
            return this;
        }
        @CustomType.Setter
        public Builder authorizationType(String authorizationType) {
            if (authorizationType == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "authorizationType");
            }
            this.authorizationType = authorizationType;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder groupsClaim(String groupsClaim) {
            if (groupsClaim == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "groupsClaim");
            }
            this.groupsClaim = groupsClaim;
            return this;
        }
        @CustomType.Setter
        public Builder idpId(String idpId) {
            if (idpId == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "idpId");
            }
            this.idpId = idpId;
            return this;
        }
        @CustomType.Setter
        public Builder idpType(String idpType) {
            if (idpType == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "idpType");
            }
            this.idpType = idpType;
            return this;
        }
        @CustomType.Setter
        public Builder issuerUri(String issuerUri) {
            if (issuerUri == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "issuerUri");
            }
            this.issuerUri = issuerUri;
            return this;
        }
        @CustomType.Setter
        public Builder oktaIdpId(String oktaIdpId) {
            if (oktaIdpId == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "oktaIdpId");
            }
            this.oktaIdpId = oktaIdpId;
            return this;
        }
        @CustomType.Setter
        public Builder pemFileInfos(List<GetFederatedSettingsIdentityProvidersResultPemFileInfo> pemFileInfos) {
            if (pemFileInfos == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "pemFileInfos");
            }
            this.pemFileInfos = pemFileInfos;
            return this;
        }
        public Builder pemFileInfos(GetFederatedSettingsIdentityProvidersResultPemFileInfo... pemFileInfos) {
            return pemFileInfos(List.of(pemFileInfos));
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder requestBinding(String requestBinding) {
            if (requestBinding == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "requestBinding");
            }
            this.requestBinding = requestBinding;
            return this;
        }
        @CustomType.Setter
        public Builder requestedScopes(List<String> requestedScopes) {
            if (requestedScopes == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "requestedScopes");
            }
            this.requestedScopes = requestedScopes;
            return this;
        }
        public Builder requestedScopes(String... requestedScopes) {
            return requestedScopes(List.of(requestedScopes));
        }
        @CustomType.Setter
        public Builder responseSignatureAlgorithm(String responseSignatureAlgorithm) {
            if (responseSignatureAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "responseSignatureAlgorithm");
            }
            this.responseSignatureAlgorithm = responseSignatureAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder ssoDebugEnabled(Boolean ssoDebugEnabled) {
            if (ssoDebugEnabled == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "ssoDebugEnabled");
            }
            this.ssoDebugEnabled = ssoDebugEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder ssoUrl(String ssoUrl) {
            if (ssoUrl == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "ssoUrl");
            }
            this.ssoUrl = ssoUrl;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder userClaim(String userClaim) {
            if (userClaim == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResult", "userClaim");
            }
            this.userClaim = userClaim;
            return this;
        }
        public GetFederatedSettingsIdentityProvidersResult build() {
            final var _resultValue = new GetFederatedSettingsIdentityProvidersResult();
            _resultValue.acsUrl = acsUrl;
            _resultValue.associatedDomains = associatedDomains;
            _resultValue.associatedOrgs = associatedOrgs;
            _resultValue.audience = audience;
            _resultValue.audienceUri = audienceUri;
            _resultValue.authorizationType = authorizationType;
            _resultValue.clientId = clientId;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.groupsClaim = groupsClaim;
            _resultValue.idpId = idpId;
            _resultValue.idpType = idpType;
            _resultValue.issuerUri = issuerUri;
            _resultValue.oktaIdpId = oktaIdpId;
            _resultValue.pemFileInfos = pemFileInfos;
            _resultValue.protocol = protocol;
            _resultValue.requestBinding = requestBinding;
            _resultValue.requestedScopes = requestedScopes;
            _resultValue.responseSignatureAlgorithm = responseSignatureAlgorithm;
            _resultValue.ssoDebugEnabled = ssoDebugEnabled;
            _resultValue.ssoUrl = ssoUrl;
            _resultValue.status = status;
            _resultValue.userClaim = userClaim;
            return _resultValue;
        }
    }
}
