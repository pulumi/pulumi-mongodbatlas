// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ProjectApiKeyProjectAssignmentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectApiKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectApiKeyArgs Empty = new ProjectApiKeyArgs();

    /**
     * Description of this Project API key.
     * 
     * &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of this Project API key.
     * 
     * &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    @Import(name="projectAssignments")
    private @Nullable Output<List<ProjectApiKeyProjectAssignmentArgs>> projectAssignments;

    public Optional<Output<List<ProjectApiKeyProjectAssignmentArgs>>> projectAssignments() {
        return Optional.ofNullable(this.projectAssignments);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private ProjectApiKeyArgs() {}

    private ProjectApiKeyArgs(ProjectApiKeyArgs $) {
        this.description = $.description;
        this.projectAssignments = $.projectAssignments;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectApiKeyArgs $;

        public Builder() {
            $ = new ProjectApiKeyArgs();
        }

        public Builder(ProjectApiKeyArgs defaults) {
            $ = new ProjectApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of this Project API key.
         * 
         * &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this Project API key.
         * 
         * &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder projectAssignments(@Nullable Output<List<ProjectApiKeyProjectAssignmentArgs>> projectAssignments) {
            $.projectAssignments = projectAssignments;
            return this;
        }

        public Builder projectAssignments(List<ProjectApiKeyProjectAssignmentArgs> projectAssignments) {
            return projectAssignments(Output.of(projectAssignments));
        }

        public Builder projectAssignments(ProjectApiKeyProjectAssignmentArgs... projectAssignments) {
            return projectAssignments(List.of(projectAssignments));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public ProjectApiKeyArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
