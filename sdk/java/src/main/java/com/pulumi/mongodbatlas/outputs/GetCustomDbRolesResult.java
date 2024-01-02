// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetCustomDbRolesResultAction;
import com.pulumi.mongodbatlas.outputs.GetCustomDbRolesResultInheritedRole;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomDbRolesResult {
    private List<GetCustomDbRolesResultAction> actions;
    private List<GetCustomDbRolesResultInheritedRole> inheritedRoles;
    /**
     * @return (Required) Name of the inherited role. This can either be another custom role or a built-in role.
     * 
     */
    private String roleName;

    private GetCustomDbRolesResult() {}
    public List<GetCustomDbRolesResultAction> actions() {
        return this.actions;
    }
    public List<GetCustomDbRolesResultInheritedRole> inheritedRoles() {
        return this.inheritedRoles;
    }
    /**
     * @return (Required) Name of the inherited role. This can either be another custom role or a built-in role.
     * 
     */
    public String roleName() {
        return this.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomDbRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCustomDbRolesResultAction> actions;
        private List<GetCustomDbRolesResultInheritedRole> inheritedRoles;
        private String roleName;
        public Builder() {}
        public Builder(GetCustomDbRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.inheritedRoles = defaults.inheritedRoles;
    	      this.roleName = defaults.roleName;
        }

        @CustomType.Setter
        public Builder actions(List<GetCustomDbRolesResultAction> actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("GetCustomDbRolesResult", "actions");
            }
            this.actions = actions;
            return this;
        }
        public Builder actions(GetCustomDbRolesResultAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder inheritedRoles(List<GetCustomDbRolesResultInheritedRole> inheritedRoles) {
            if (inheritedRoles == null) {
              throw new MissingRequiredPropertyException("GetCustomDbRolesResult", "inheritedRoles");
            }
            this.inheritedRoles = inheritedRoles;
            return this;
        }
        public Builder inheritedRoles(GetCustomDbRolesResultInheritedRole... inheritedRoles) {
            return inheritedRoles(List.of(inheritedRoles));
        }
        @CustomType.Setter
        public Builder roleName(String roleName) {
            if (roleName == null) {
              throw new MissingRequiredPropertyException("GetCustomDbRolesResult", "roleName");
            }
            this.roleName = roleName;
            return this;
        }
        public GetCustomDbRolesResult build() {
            final var _resultValue = new GetCustomDbRolesResult();
            _resultValue.actions = actions;
            _resultValue.inheritedRoles = inheritedRoles;
            _resultValue.roleName = roleName;
            return _resultValue;
        }
    }
}
