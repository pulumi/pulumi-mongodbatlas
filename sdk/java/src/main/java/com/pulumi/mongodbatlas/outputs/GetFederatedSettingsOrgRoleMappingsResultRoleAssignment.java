// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFederatedSettingsOrgRoleMappingsResultRoleAssignment {
    /**
     * @return Unique identifier of the project to which you want the role mapping to apply.
     * 
     */
    private String groupId;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    private String orgId;
    /**
     * @return Specifies the Role that is attached to the Role Mapping.
     * 
     */
    private String role;

    private GetFederatedSettingsOrgRoleMappingsResultRoleAssignment() {}
    /**
     * @return Unique identifier of the project to which you want the role mapping to apply.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Specifies the Role that is attached to the Role Mapping.
     * 
     */
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedSettingsOrgRoleMappingsResultRoleAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groupId;
        private String orgId;
        private String role;
        public Builder() {}
        public Builder(GetFederatedSettingsOrgRoleMappingsResultRoleAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GetFederatedSettingsOrgRoleMappingsResultRoleAssignment build() {
            final var _resultValue = new GetFederatedSettingsOrgRoleMappingsResultRoleAssignment();
            _resultValue.groupId = groupId;
            _resultValue.orgId = orgId;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}
