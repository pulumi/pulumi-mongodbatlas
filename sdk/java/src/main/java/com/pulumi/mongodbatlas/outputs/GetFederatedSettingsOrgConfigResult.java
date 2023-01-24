// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetFederatedSettingsOrgConfigRoleMapping;
import com.pulumi.mongodbatlas.outputs.GetFederatedSettingsOrgConfigUserConflict;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedSettingsOrgConfigResult {
    /**
     * @return List that contains the approved domains from which organization users can log in.  Note: If the organization uses an identity provider,  `domain_allow_list` includes: any SSO domains associated with organization&#39;s identity provider and any custom domains associated with the specific organization.
     * 
     */
    private List<String> domainAllowLists;
    /**
     * @return Flag that indicates whether domain restriction is enabled for the connected organization.  User Conflicts returns null when `domain_restriction_enabled` is false.
     * 
     */
    private Boolean domainRestrictionEnabled;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    private String federationSettingsId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    private String identityProviderId;
    private String orgId;
    /**
     * @return List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     * 
     */
    private List<String> postAuthRoleGrants;
    private List<GetFederatedSettingsOrgConfigRoleMapping> roleMappings;
    private List<GetFederatedSettingsOrgConfigUserConflict> userConflicts;

    private GetFederatedSettingsOrgConfigResult() {}
    /**
     * @return List that contains the approved domains from which organization users can log in.  Note: If the organization uses an identity provider,  `domain_allow_list` includes: any SSO domains associated with organization&#39;s identity provider and any custom domains associated with the specific organization.
     * 
     */
    public List<String> domainAllowLists() {
        return this.domainAllowLists;
    }
    /**
     * @return Flag that indicates whether domain restriction is enabled for the connected organization.  User Conflicts returns null when `domain_restriction_enabled` is false.
     * 
     */
    public Boolean domainRestrictionEnabled() {
        return this.domainRestrictionEnabled;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public String federationSettingsId() {
        return this.federationSettingsId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public String identityProviderId() {
        return this.identityProviderId;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     * 
     */
    public List<String> postAuthRoleGrants() {
        return this.postAuthRoleGrants;
    }
    public List<GetFederatedSettingsOrgConfigRoleMapping> roleMappings() {
        return this.roleMappings;
    }
    public List<GetFederatedSettingsOrgConfigUserConflict> userConflicts() {
        return this.userConflicts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedSettingsOrgConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> domainAllowLists;
        private Boolean domainRestrictionEnabled;
        private String federationSettingsId;
        private String id;
        private String identityProviderId;
        private String orgId;
        private List<String> postAuthRoleGrants;
        private List<GetFederatedSettingsOrgConfigRoleMapping> roleMappings;
        private List<GetFederatedSettingsOrgConfigUserConflict> userConflicts;
        public Builder() {}
        public Builder(GetFederatedSettingsOrgConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainAllowLists = defaults.domainAllowLists;
    	      this.domainRestrictionEnabled = defaults.domainRestrictionEnabled;
    	      this.federationSettingsId = defaults.federationSettingsId;
    	      this.id = defaults.id;
    	      this.identityProviderId = defaults.identityProviderId;
    	      this.orgId = defaults.orgId;
    	      this.postAuthRoleGrants = defaults.postAuthRoleGrants;
    	      this.roleMappings = defaults.roleMappings;
    	      this.userConflicts = defaults.userConflicts;
        }

        @CustomType.Setter
        public Builder domainAllowLists(List<String> domainAllowLists) {
            this.domainAllowLists = Objects.requireNonNull(domainAllowLists);
            return this;
        }
        public Builder domainAllowLists(String... domainAllowLists) {
            return domainAllowLists(List.of(domainAllowLists));
        }
        @CustomType.Setter
        public Builder domainRestrictionEnabled(Boolean domainRestrictionEnabled) {
            this.domainRestrictionEnabled = Objects.requireNonNull(domainRestrictionEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder federationSettingsId(String federationSettingsId) {
            this.federationSettingsId = Objects.requireNonNull(federationSettingsId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = Objects.requireNonNull(identityProviderId);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder postAuthRoleGrants(List<String> postAuthRoleGrants) {
            this.postAuthRoleGrants = Objects.requireNonNull(postAuthRoleGrants);
            return this;
        }
        public Builder postAuthRoleGrants(String... postAuthRoleGrants) {
            return postAuthRoleGrants(List.of(postAuthRoleGrants));
        }
        @CustomType.Setter
        public Builder roleMappings(List<GetFederatedSettingsOrgConfigRoleMapping> roleMappings) {
            this.roleMappings = Objects.requireNonNull(roleMappings);
            return this;
        }
        public Builder roleMappings(GetFederatedSettingsOrgConfigRoleMapping... roleMappings) {
            return roleMappings(List.of(roleMappings));
        }
        @CustomType.Setter
        public Builder userConflicts(List<GetFederatedSettingsOrgConfigUserConflict> userConflicts) {
            this.userConflicts = Objects.requireNonNull(userConflicts);
            return this;
        }
        public Builder userConflicts(GetFederatedSettingsOrgConfigUserConflict... userConflicts) {
            return userConflicts(List.of(userConflicts));
        }
        public GetFederatedSettingsOrgConfigResult build() {
            final var o = new GetFederatedSettingsOrgConfigResult();
            o.domainAllowLists = domainAllowLists;
            o.domainRestrictionEnabled = domainRestrictionEnabled;
            o.federationSettingsId = federationSettingsId;
            o.id = id;
            o.identityProviderId = identityProviderId;
            o.orgId = orgId;
            o.postAuthRoleGrants = postAuthRoleGrants;
            o.roleMappings = roleMappings;
            o.userConflicts = userConflicts;
            return o;
        }
    }
}
