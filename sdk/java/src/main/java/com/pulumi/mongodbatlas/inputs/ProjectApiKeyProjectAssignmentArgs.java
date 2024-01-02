// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProjectApiKeyProjectAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectApiKeyProjectAssignmentArgs Empty = new ProjectApiKeyProjectAssignmentArgs();

    /**
     * Project ID to assign to Access Key
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Project ID to assign to Access Key
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
     * 
     */
    @Import(name="roleNames", required=true)
    private Output<List<String>> roleNames;

    /**
     * @return List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
     * 
     */
    public Output<List<String>> roleNames() {
        return this.roleNames;
    }

    private ProjectApiKeyProjectAssignmentArgs() {}

    private ProjectApiKeyProjectAssignmentArgs(ProjectApiKeyProjectAssignmentArgs $) {
        this.projectId = $.projectId;
        this.roleNames = $.roleNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectApiKeyProjectAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectApiKeyProjectAssignmentArgs $;

        public Builder() {
            $ = new ProjectApiKeyProjectAssignmentArgs();
        }

        public Builder(ProjectApiKeyProjectAssignmentArgs defaults) {
            $ = new ProjectApiKeyProjectAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Project ID to assign to Access Key
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to assign to Access Key
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roleNames List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(Output<List<String>> roleNames) {
            $.roleNames = roleNames;
            return this;
        }

        /**
         * @param roleNames List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(List<String> roleNames) {
            return roleNames(Output.of(roleNames));
        }

        /**
         * @param roleNames List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }

        public ProjectApiKeyProjectAssignmentArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ProjectApiKeyProjectAssignmentArgs", "projectId");
            }
            if ($.roleNames == null) {
                throw new MissingRequiredPropertyException("ProjectApiKeyProjectAssignmentArgs", "roleNames");
            }
            return $;
        }
    }

}
