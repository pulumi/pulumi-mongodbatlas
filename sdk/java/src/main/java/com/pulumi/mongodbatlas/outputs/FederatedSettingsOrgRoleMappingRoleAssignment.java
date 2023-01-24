// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FederatedSettingsOrgRoleMappingRoleAssignment {
    /**
     * @return Unique identifier of the project to which you want the role mapping to apply.
     * 
     */
    private @Nullable String groupId;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Specifies the Roles that are attached to the Role Mapping. Available role IDs can be found on [the User Roles
     * Reference](https://www.mongodb.com/docs/atlas/reference/user-roles/).
     * 
     */
    private @Nullable List<String> roles;

    private FederatedSettingsOrgRoleMappingRoleAssignment() {}
    /**
     * @return Unique identifier of the project to which you want the role mapping to apply.
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Specifies the Roles that are attached to the Role Mapping. Available role IDs can be found on [the User Roles
     * Reference](https://www.mongodb.com/docs/atlas/reference/user-roles/).
     * 
     */
    public List<String> roles() {
        return this.roles == null ? List.of() : this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedSettingsOrgRoleMappingRoleAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String orgId;
        private @Nullable List<String> roles;
        public Builder() {}
        public Builder(FederatedSettingsOrgRoleMappingRoleAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.orgId = defaults.orgId;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<String> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public FederatedSettingsOrgRoleMappingRoleAssignment build() {
            final var o = new FederatedSettingsOrgRoleMappingRoleAssignment();
            o.groupId = groupId;
            o.orgId = orgId;
            o.roles = roles;
            return o;
        }
    }
}
