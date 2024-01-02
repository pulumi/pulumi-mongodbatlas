// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ProjectApiKeyProjectAssignment {
    /**
     * @return Project ID to assign to Access Key
     * 
     */
    private String projectId;
    /**
     * @return List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
     * 
     */
    private List<String> roleNames;

    private ProjectApiKeyProjectAssignment() {}
    /**
     * @return Project ID to assign to Access Key
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
     * 
     */
    public List<String> roleNames() {
        return this.roleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectApiKeyProjectAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String projectId;
        private List<String> roleNames;
        public Builder() {}
        public Builder(ProjectApiKeyProjectAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectId = defaults.projectId;
    	      this.roleNames = defaults.roleNames;
        }

        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("ProjectApiKeyProjectAssignment", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder roleNames(List<String> roleNames) {
            if (roleNames == null) {
              throw new MissingRequiredPropertyException("ProjectApiKeyProjectAssignment", "roleNames");
            }
            this.roleNames = roleNames;
            return this;
        }
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }
        public ProjectApiKeyProjectAssignment build() {
            final var _resultValue = new ProjectApiKeyProjectAssignment();
            _resultValue.projectId = projectId;
            _resultValue.roleNames = roleNames;
            return _resultValue;
        }
    }
}
