// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProjectInvitationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectInvitationArgs Empty = new GetProjectInvitationArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     * 
     */
    @Import(name="invitationId", required=true)
    private Output<String> invitationId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     * 
     */
    public Output<String> invitationId() {
        return this.invitationId;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private GetProjectInvitationArgs() {}

    private GetProjectInvitationArgs(GetProjectInvitationArgs $) {
        this.invitationId = $.invitationId;
        this.projectId = $.projectId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectInvitationArgs $;

        public Builder() {
            $ = new GetProjectInvitationArgs();
        }

        public Builder(GetProjectInvitationArgs defaults) {
            $ = new GetProjectInvitationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param invitationId Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
         * 
         * @return builder
         * 
         */
        public Builder invitationId(Output<String> invitationId) {
            $.invitationId = invitationId;
            return this;
        }

        /**
         * @param invitationId Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
         * 
         * @return builder
         * 
         */
        public Builder invitationId(String invitationId) {
            return invitationId(Output.of(invitationId));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param username Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetProjectInvitationArgs build() {
            if ($.invitationId == null) {
                throw new MissingRequiredPropertyException("GetProjectInvitationArgs", "invitationId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetProjectInvitationArgs", "projectId");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetProjectInvitationArgs", "username");
            }
            return $;
        }
    }

}
