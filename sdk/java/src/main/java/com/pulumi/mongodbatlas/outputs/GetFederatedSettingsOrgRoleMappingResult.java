// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetFederatedSettingsOrgRoleMappingRoleAssignment;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedSettingsOrgRoleMappingResult {
    /**
     * @return Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     * 
     */
    private String externalGroupName;
    private String federationSettingsId;
    /**
     * @return Unique 24-hexadecimal digit string that identifies this role mapping.
     * 
     */
    private String id;
    private String orgId;
    /**
     * @return Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     * 
     */
    private List<GetFederatedSettingsOrgRoleMappingRoleAssignment> roleAssignments;
    private String roleMappingId;

    private GetFederatedSettingsOrgRoleMappingResult() {}
    /**
     * @return Unique human-readable label that identifies the identity provider group to which this role mapping applies.
     * 
     */
    public String externalGroupName() {
        return this.externalGroupName;
    }
    public String federationSettingsId() {
        return this.federationSettingsId;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies this role mapping.
     * 
     */
    public String id() {
        return this.id;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Atlas roles and the unique identifiers of the groups and organizations associated with each role.
     * 
     */
    public List<GetFederatedSettingsOrgRoleMappingRoleAssignment> roleAssignments() {
        return this.roleAssignments;
    }
    public String roleMappingId() {
        return this.roleMappingId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedSettingsOrgRoleMappingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalGroupName;
        private String federationSettingsId;
        private String id;
        private String orgId;
        private List<GetFederatedSettingsOrgRoleMappingRoleAssignment> roleAssignments;
        private String roleMappingId;
        public Builder() {}
        public Builder(GetFederatedSettingsOrgRoleMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalGroupName = defaults.externalGroupName;
    	      this.federationSettingsId = defaults.federationSettingsId;
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.roleAssignments = defaults.roleAssignments;
    	      this.roleMappingId = defaults.roleMappingId;
        }

        @CustomType.Setter
        public Builder externalGroupName(String externalGroupName) {
            this.externalGroupName = Objects.requireNonNull(externalGroupName);
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
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder roleAssignments(List<GetFederatedSettingsOrgRoleMappingRoleAssignment> roleAssignments) {
            this.roleAssignments = Objects.requireNonNull(roleAssignments);
            return this;
        }
        public Builder roleAssignments(GetFederatedSettingsOrgRoleMappingRoleAssignment... roleAssignments) {
            return roleAssignments(List.of(roleAssignments));
        }
        @CustomType.Setter
        public Builder roleMappingId(String roleMappingId) {
            this.roleMappingId = Objects.requireNonNull(roleMappingId);
            return this;
        }
        public GetFederatedSettingsOrgRoleMappingResult build() {
            final var o = new GetFederatedSettingsOrgRoleMappingResult();
            o.externalGroupName = externalGroupName;
            o.federationSettingsId = federationSettingsId;
            o.id = id;
            o.orgId = orgId;
            o.roleAssignments = roleAssignments;
            o.roleMappingId = roleMappingId;
            return o;
        }
    }
}