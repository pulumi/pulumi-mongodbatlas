// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProjectInvitationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectInvitationArgs Empty = new ProjectInvitationArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<String>> roles;

    /**
     * @return List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }

    /**
     * Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ProjectInvitationArgs() {}

    private ProjectInvitationArgs(ProjectInvitationArgs $) {
        this.projectId = $.projectId;
        this.roles = $.roles;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectInvitationArgs $;

        public Builder() {
            $ = new ProjectInvitationArgs();
        }

        public Builder(ProjectInvitationArgs defaults) {
            $ = new ProjectInvitationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roles List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param username Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ProjectInvitationArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
