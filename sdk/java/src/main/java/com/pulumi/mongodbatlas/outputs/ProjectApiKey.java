// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ProjectApiKey {
    /**
     * @return The unique identifier of the Programmatic API key you want to associate with the Project.  The Programmatic API key and Project must share the same parent organization.  Note: this is not the `publicKey` of the Programmatic API key but the `id` of the key. See [Programmatic API Keys](https://docs.atlas.mongodb.com/reference/api/apiKeys/) for more.
     * 
     */
    private String apiKeyId;
    /**
     * @return Each string in the array represents a project role you want to assign to the team. Every user associated with the team inherits these roles. You must specify an array even if you are only associating a single role with the team.
     * The following are valid roles:
     * The following are valid roles:
     * 
     */
    private List<String> roleNames;

    private ProjectApiKey() {}
    /**
     * @return The unique identifier of the Programmatic API key you want to associate with the Project.  The Programmatic API key and Project must share the same parent organization.  Note: this is not the `publicKey` of the Programmatic API key but the `id` of the key. See [Programmatic API Keys](https://docs.atlas.mongodb.com/reference/api/apiKeys/) for more.
     * 
     */
    public String apiKeyId() {
        return this.apiKeyId;
    }
    /**
     * @return Each string in the array represents a project role you want to assign to the team. Every user associated with the team inherits these roles. You must specify an array even if you are only associating a single role with the team.
     * The following are valid roles:
     * The following are valid roles:
     * 
     */
    public List<String> roleNames() {
        return this.roleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectApiKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKeyId;
        private List<String> roleNames;
        public Builder() {}
        public Builder(ProjectApiKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyId = defaults.apiKeyId;
    	      this.roleNames = defaults.roleNames;
        }

        @CustomType.Setter
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = Objects.requireNonNull(apiKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder roleNames(List<String> roleNames) {
            this.roleNames = Objects.requireNonNull(roleNames);
            return this;
        }
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }
        public ProjectApiKey build() {
            final var o = new ProjectApiKey();
            o.apiKeyId = apiKeyId;
            o.roleNames = roleNames;
            return o;
        }
    }
}
