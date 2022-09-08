// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTeamResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the team you want to create.
     * 
     */
    private String name;
    private String orgId;
    /**
     * @return The unique identifier for the team.
     * 
     */
    private String teamId;
    /**
     * @return The users who are part of the organization.
     * 
     */
    private List<String> usernames;

    private GetTeamResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the team you want to create.
     * 
     */
    public String name() {
        return this.name;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return The unique identifier for the team.
     * 
     */
    public String teamId() {
        return this.teamId;
    }
    /**
     * @return The users who are part of the organization.
     * 
     */
    public List<String> usernames() {
        return this.usernames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String orgId;
        private String teamId;
        private List<String> usernames;
        public Builder() {}
        public Builder(GetTeamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.teamId = defaults.teamId;
    	      this.usernames = defaults.usernames;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder teamId(String teamId) {
            this.teamId = Objects.requireNonNull(teamId);
            return this;
        }
        @CustomType.Setter
        public Builder usernames(List<String> usernames) {
            this.usernames = Objects.requireNonNull(usernames);
            return this;
        }
        public Builder usernames(String... usernames) {
            return usernames(List.of(usernames));
        }
        public GetTeamResult build() {
            final var o = new GetTeamResult();
            o.id = id;
            o.name = name;
            o.orgId = orgId;
            o.teamId = teamId;
            o.usernames = usernames;
            return o;
        }
    }
}
