// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedSettingsIdentityProviderAssociatedOrgRoleMappingRoleAssignment;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping {
    /**
     * @return Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     * 
     */
    private String externalGroupName;
    /**
     * @return Unique 24-hexadecimal digit string that identifies this role mapping.
     * 
     */
    private String id;
    /**
     * @return Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     * 
     */
    private List<GetFederatedSettingsIdentityProviderAssociatedOrgRoleMappingRoleAssignment> roleAssignments;

    private GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping() {}
    /**
     * @return Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     * 
     */
    public String externalGroupName() {
        return this.externalGroupName;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies this role mapping.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     * 
     */
    public List<GetFederatedSettingsIdentityProviderAssociatedOrgRoleMappingRoleAssignment> roleAssignments() {
        return this.roleAssignments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalGroupName;
        private String id;
        private List<GetFederatedSettingsIdentityProviderAssociatedOrgRoleMappingRoleAssignment> roleAssignments;
        public Builder() {}
        public Builder(GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalGroupName = defaults.externalGroupName;
    	      this.id = defaults.id;
    	      this.roleAssignments = defaults.roleAssignments;
        }

        @CustomType.Setter
        public Builder externalGroupName(String externalGroupName) {
            if (externalGroupName == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping", "externalGroupName");
            }
            this.externalGroupName = externalGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder roleAssignments(List<GetFederatedSettingsIdentityProviderAssociatedOrgRoleMappingRoleAssignment> roleAssignments) {
            if (roleAssignments == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping", "roleAssignments");
            }
            this.roleAssignments = roleAssignments;
            return this;
        }
        public Builder roleAssignments(GetFederatedSettingsIdentityProviderAssociatedOrgRoleMappingRoleAssignment... roleAssignments) {
            return roleAssignments(List.of(roleAssignments));
        }
        public GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping build() {
            final var _resultValue = new GetFederatedSettingsIdentityProviderAssociatedOrgRoleMapping();
            _resultValue.externalGroupName = externalGroupName;
            _resultValue.id = id;
            _resultValue.roleAssignments = roleAssignments;
            return _resultValue;
        }
    }
}