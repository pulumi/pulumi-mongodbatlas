// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.CustomDbRoleActionArgs;
import com.pulumi.mongodbatlas.inputs.CustomDbRoleInheritedRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDbRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDbRoleArgs Empty = new CustomDbRoleArgs();

    @Import(name="actions")
    private @Nullable Output<List<CustomDbRoleActionArgs>> actions;

    public Optional<Output<List<CustomDbRoleActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    @Import(name="inheritedRoles")
    private @Nullable Output<List<CustomDbRoleInheritedRoleArgs>> inheritedRoles;

    public Optional<Output<List<CustomDbRoleInheritedRoleArgs>>> inheritedRoles() {
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
     * &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     * 
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return Name of the custom role.
     * 
     * &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     * 
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    private CustomDbRoleArgs() {}

    private CustomDbRoleArgs(CustomDbRoleArgs $) {
        this.actions = $.actions;
        this.inheritedRoles = $.inheritedRoles;
        this.projectId = $.projectId;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDbRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDbRoleArgs $;

        public Builder() {
            $ = new CustomDbRoleArgs();
        }

        public Builder(CustomDbRoleArgs defaults) {
            $ = new CustomDbRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(@Nullable Output<List<CustomDbRoleActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<CustomDbRoleActionArgs> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(CustomDbRoleActionArgs... actions) {
            return actions(List.of(actions));
        }

        public Builder inheritedRoles(@Nullable Output<List<CustomDbRoleInheritedRoleArgs>> inheritedRoles) {
            $.inheritedRoles = inheritedRoles;
            return this;
        }

        public Builder inheritedRoles(List<CustomDbRoleInheritedRoleArgs> inheritedRoles) {
            return inheritedRoles(Output.of(inheritedRoles));
        }

        public Builder inheritedRoles(CustomDbRoleInheritedRoleArgs... inheritedRoles) {
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
         * &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
         * 
         * * Is a name already used by an existing custom role in the project
         * * Is a name of any of the built-in roles
         * * Is `atlasAdmin`
         * * Starts with `xgen-`
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
         * &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
         * 
         * * Is a name already used by an existing custom role in the project
         * * Is a name of any of the built-in roles
         * * Is `atlasAdmin`
         * * Starts with `xgen-`
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public CustomDbRoleArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("CustomDbRoleArgs", "projectId");
            }
            if ($.roleName == null) {
                throw new MissingRequiredPropertyException("CustomDbRoleArgs", "roleName");
            }
            return $;
        }
    }

}
