// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
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
     * Name of the role. This resource returns all the roles the user has in Atlas.
     * The following are valid roles:
     * 
     */
    @Import(name="roleNames", required=true)
    private Output<List<String>> roleNames;

    /**
     * @return Name of the role. This resource returns all the roles the user has in Atlas.
     * The following are valid roles:
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
         * @param roleNames Name of the role. This resource returns all the roles the user has in Atlas.
         * The following are valid roles:
         * 
         * @return builder
         * 
         */
        public Builder roleNames(Output<List<String>> roleNames) {
            $.roleNames = roleNames;
            return this;
        }

        /**
         * @param roleNames Name of the role. This resource returns all the roles the user has in Atlas.
         * The following are valid roles:
         * 
         * @return builder
         * 
         */
        public Builder roleNames(List<String> roleNames) {
            return roleNames(Output.of(roleNames));
        }

        /**
         * @param roleNames Name of the role. This resource returns all the roles the user has in Atlas.
         * The following are valid roles:
         * 
         * @return builder
         * 
         */
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }

        public ProjectApiKeyProjectAssignmentArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.roleNames = Objects.requireNonNull($.roleNames, "expected parameter 'roleNames' to be non-null");
            return $;
        }
    }

}