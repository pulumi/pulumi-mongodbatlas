// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrgInvitationResult {
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     * 
     */
    private String createdAt;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     * 
     */
    private String expiresAt;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String invitationId;
    /**
     * @return Atlas user who invited `username` to the organization.
     * 
     */
    private String inviterUsername;
    private String orgId;
    /**
     * @return Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * 
     */
    private List<String> roles;
    /**
     * @return An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
     * 
     */
    private List<String> teamsIds;
    private String username;

    private GetOrgInvitationResult() {}
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String invitationId() {
        return this.invitationId;
    }
    /**
     * @return Atlas user who invited `username` to the organization.
     * 
     */
    public String inviterUsername() {
        return this.inviterUsername;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }
    /**
     * @return An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
     * 
     */
    public List<String> teamsIds() {
        return this.teamsIds;
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrgInvitationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String expiresAt;
        private String id;
        private String invitationId;
        private String inviterUsername;
        private String orgId;
        private List<String> roles;
        private List<String> teamsIds;
        private String username;
        public Builder() {}
        public Builder(GetOrgInvitationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.invitationId = defaults.invitationId;
    	      this.inviterUsername = defaults.inviterUsername;
    	      this.orgId = defaults.orgId;
    	      this.roles = defaults.roles;
    	      this.teamsIds = defaults.teamsIds;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            if (expiresAt == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "expiresAt");
            }
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder invitationId(String invitationId) {
            if (invitationId == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "invitationId");
            }
            this.invitationId = invitationId;
            return this;
        }
        @CustomType.Setter
        public Builder inviterUsername(String inviterUsername) {
            if (inviterUsername == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "inviterUsername");
            }
            this.inviterUsername = inviterUsername;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder teamsIds(List<String> teamsIds) {
            if (teamsIds == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "teamsIds");
            }
            this.teamsIds = teamsIds;
            return this;
        }
        public Builder teamsIds(String... teamsIds) {
            return teamsIds(List.of(teamsIds));
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetOrgInvitationResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetOrgInvitationResult build() {
            final var _resultValue = new GetOrgInvitationResult();
            _resultValue.createdAt = createdAt;
            _resultValue.expiresAt = expiresAt;
            _resultValue.id = id;
            _resultValue.invitationId = invitationId;
            _resultValue.inviterUsername = inviterUsername;
            _resultValue.orgId = orgId;
            _resultValue.roles = roles;
            _resultValue.teamsIds = teamsIds;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
