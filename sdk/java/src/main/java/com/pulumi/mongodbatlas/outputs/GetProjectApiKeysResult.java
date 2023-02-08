// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProjectApiKeysResult {
    /**
     * @return Unique identifier for the API key you want to update. Use the /orgs/{ORG-ID}/apiKeys endpoint to retrieve all API keys to which the authenticated user has access for the specified organization.
     * 
     */
    private String apiKeyId;
    /**
     * @return Description of this Project API key.
     * 
     */
    private String description;
    private String privateKey;
    private String publicKey;
    /**
     * @return Name of the role. This resource returns all the roles the user has in Atlas.
     * The following are valid roles:
     * 
     */
    private List<String> roleNames;

    private GetProjectApiKeysResult() {}
    /**
     * @return Unique identifier for the API key you want to update. Use the /orgs/{ORG-ID}/apiKeys endpoint to retrieve all API keys to which the authenticated user has access for the specified organization.
     * 
     */
    public String apiKeyId() {
        return this.apiKeyId;
    }
    /**
     * @return Description of this Project API key.
     * 
     */
    public String description() {
        return this.description;
    }
    public String privateKey() {
        return this.privateKey;
    }
    public String publicKey() {
        return this.publicKey;
    }
    /**
     * @return Name of the role. This resource returns all the roles the user has in Atlas.
     * The following are valid roles:
     * 
     */
    public List<String> roleNames() {
        return this.roleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectApiKeysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKeyId;
        private String description;
        private String privateKey;
        private String publicKey;
        private List<String> roleNames;
        public Builder() {}
        public Builder(GetProjectApiKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyId = defaults.apiKeyId;
    	      this.description = defaults.description;
    	      this.privateKey = defaults.privateKey;
    	      this.publicKey = defaults.publicKey;
    	      this.roleNames = defaults.roleNames;
        }

        @CustomType.Setter
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = Objects.requireNonNull(apiKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
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
        public GetProjectApiKeysResult build() {
            final var o = new GetProjectApiKeysResult();
            o.apiKeyId = apiKeyId;
            o.description = description;
            o.privateKey = privateKey;
            o.publicKey = publicKey;
            o.roleNames = roleNames;
            return o;
        }
    }
}
