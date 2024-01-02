// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.GetCustomDbRoleInheritedRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomDbRoleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomDbRoleArgs Empty = new GetCustomDbRoleArgs();

    @Import(name="inheritedRoles")
    private @Nullable Output<List<GetCustomDbRoleInheritedRoleArgs>> inheritedRoles;

    public Optional<Output<List<GetCustomDbRoleInheritedRoleArgs>>> inheritedRoles() {
        return Optional.ofNullable(this.inheritedRoles);
    }

    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Name of the custom role.
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return Name of the custom role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    private GetCustomDbRoleArgs() {}

    private GetCustomDbRoleArgs(GetCustomDbRoleArgs $) {
        this.inheritedRoles = $.inheritedRoles;
        this.projectId = $.projectId;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomDbRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomDbRoleArgs $;

        public Builder() {
            $ = new GetCustomDbRoleArgs();
        }

        public Builder(GetCustomDbRoleArgs defaults) {
            $ = new GetCustomDbRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder inheritedRoles(@Nullable Output<List<GetCustomDbRoleInheritedRoleArgs>> inheritedRoles) {
            $.inheritedRoles = inheritedRoles;
            return this;
        }

        public Builder inheritedRoles(List<GetCustomDbRoleInheritedRoleArgs> inheritedRoles) {
            return inheritedRoles(Output.of(inheritedRoles));
        }

        public Builder inheritedRoles(GetCustomDbRoleInheritedRoleArgs... inheritedRoles) {
            return inheritedRoles(List.of(inheritedRoles));
        }

        /**
         * @param projectId The unique ID for the project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roleName Name of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName Name of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public GetCustomDbRoleArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetCustomDbRoleArgs", "projectId");
            }
            if ($.roleName == null) {
                throw new MissingRequiredPropertyException("GetCustomDbRoleArgs", "roleName");
            }
            return $;
        }
    }

}
