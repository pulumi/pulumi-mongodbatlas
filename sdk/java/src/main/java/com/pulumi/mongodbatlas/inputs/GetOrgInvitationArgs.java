// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrgInvitationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrgInvitationArgs Empty = new GetOrgInvitationArgs();

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
     * Unique 24-hexadecimal digit string that identifies the organization to which you invited the user.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization to which you invited the user.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
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

    private GetOrgInvitationArgs() {}

    private GetOrgInvitationArgs(GetOrgInvitationArgs $) {
        this.invitationId = $.invitationId;
        this.orgId = $.orgId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrgInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrgInvitationArgs $;

        public Builder() {
            $ = new GetOrgInvitationArgs();
        }

        public Builder(GetOrgInvitationArgs defaults) {
            $ = new GetOrgInvitationArgs(Objects.requireNonNull(defaults));
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
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization to which you invited the user.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization to which you invited the user.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
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

        public GetOrgInvitationArgs build() {
            $.invitationId = Objects.requireNonNull($.invitationId, "expected parameter 'invitationId' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}