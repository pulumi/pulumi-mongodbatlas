// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCustomDbRolesResultInheritedRole {
    /**
     * @return (Required) Database on which the inherited role is granted.
     * 
     */
    private String databaseName;
    /**
     * @return (Required) Name of the inherited role. This can either be another custom role or a built-in role.
     * 
     */
    private String roleName;

    private GetCustomDbRolesResultInheritedRole() {}
    /**
     * @return (Required) Database on which the inherited role is granted.
     * 
     */
    public String databaseName() {
        return this.databaseName;
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

    public static Builder builder(GetCustomDbRolesResultInheritedRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseName;
        private String roleName;
        public Builder() {}
        public Builder(GetCustomDbRolesResultInheritedRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.roleName = defaults.roleName;
        }

        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder roleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }
        public GetCustomDbRolesResultInheritedRole build() {
            final var _resultValue = new GetCustomDbRolesResultInheritedRole();
            _resultValue.databaseName = databaseName;
            _resultValue.roleName = roleName;
            return _resultValue;
        }
    }
}
