// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetOrganizationLink;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationResult {
    /**
     * @return (Optional) Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
     * 
     */
    private Boolean apiAccessListRequired;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Flag that indicates whether this organization has been deleted.
     * 
     */
    private Boolean isDeleted;
    private List<GetOrganizationLink> links;
    /**
     * @return (Optional) Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
     * 
     */
    private Boolean multiFactorAuthRequired;
    /**
     * @return Human-readable label that identifies the organization.
     * 
     */
    private String name;
    private String orgId;
    /**
     * @return (Optional) Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
     * 
     */
    private Boolean restrictEmployeeAccess;

    private GetOrganizationResult() {}
    /**
     * @return (Optional) Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
     * 
     */
    public Boolean apiAccessListRequired() {
        return this.apiAccessListRequired;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Flag that indicates whether this organization has been deleted.
     * 
     */
    public Boolean isDeleted() {
        return this.isDeleted;
    }
    public List<GetOrganizationLink> links() {
        return this.links;
    }
    /**
     * @return (Optional) Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
     * 
     */
    public Boolean multiFactorAuthRequired() {
        return this.multiFactorAuthRequired;
    }
    /**
     * @return Human-readable label that identifies the organization.
     * 
     */
    public String name() {
        return this.name;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return (Optional) Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
     * 
     */
    public Boolean restrictEmployeeAccess() {
        return this.restrictEmployeeAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean apiAccessListRequired;
        private String id;
        private Boolean isDeleted;
        private List<GetOrganizationLink> links;
        private Boolean multiFactorAuthRequired;
        private String name;
        private String orgId;
        private Boolean restrictEmployeeAccess;
        public Builder() {}
        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiAccessListRequired = defaults.apiAccessListRequired;
    	      this.id = defaults.id;
    	      this.isDeleted = defaults.isDeleted;
    	      this.links = defaults.links;
    	      this.multiFactorAuthRequired = defaults.multiFactorAuthRequired;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.restrictEmployeeAccess = defaults.restrictEmployeeAccess;
        }

        @CustomType.Setter
        public Builder apiAccessListRequired(Boolean apiAccessListRequired) {
            if (apiAccessListRequired == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "apiAccessListRequired");
            }
            this.apiAccessListRequired = apiAccessListRequired;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isDeleted(Boolean isDeleted) {
            if (isDeleted == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "isDeleted");
            }
            this.isDeleted = isDeleted;
            return this;
        }
        @CustomType.Setter
        public Builder links(List<GetOrganizationLink> links) {
            if (links == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "links");
            }
            this.links = links;
            return this;
        }
        public Builder links(GetOrganizationLink... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder multiFactorAuthRequired(Boolean multiFactorAuthRequired) {
            if (multiFactorAuthRequired == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "multiFactorAuthRequired");
            }
            this.multiFactorAuthRequired = multiFactorAuthRequired;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder restrictEmployeeAccess(Boolean restrictEmployeeAccess) {
            if (restrictEmployeeAccess == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "restrictEmployeeAccess");
            }
            this.restrictEmployeeAccess = restrictEmployeeAccess;
            return this;
        }
        public GetOrganizationResult build() {
            final var _resultValue = new GetOrganizationResult();
            _resultValue.apiAccessListRequired = apiAccessListRequired;
            _resultValue.id = id;
            _resultValue.isDeleted = isDeleted;
            _resultValue.links = links;
            _resultValue.multiFactorAuthRequired = multiFactorAuthRequired;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.restrictEmployeeAccess = restrictEmployeeAccess;
            return _resultValue;
        }
    }
}
