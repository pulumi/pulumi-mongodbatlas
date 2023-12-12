// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetThirdPartyIntegrationResult {
    private String accountId;
    /**
     * @return Your API Key.
     * 
     */
    private String apiKey;
    private String channelName;
    /**
     * @return Whether your cluster has Prometheus enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    private @Nullable String microsoftTeamsWebhookUrl;
    private String projectId;
    /**
     * @return Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
     * 
     */
    private String region;
    /**
     * @return An optional field for your Routing Key.
     * 
     */
    private String routingKey;
    /**
     * @return Your Prometheus protocol scheme configured for requests.
     * 
     */
    private @Nullable String scheme;
    /**
     * @return An optional field for your webhook secret.
     * 
     */
    private String secret;
    /**
     * @return Indicates which service discovery method is used, either file or http.
     * 
     */
    private @Nullable String serviceDiscovery;
    /**
     * @return Your Service Key.
     * 
     */
    private String serviceKey;
    private String teamName;
    /**
     * @return Property equal to its own integration type
     * 
     */
    private String type;
    /**
     * @return Your webhook URL.
     * 
     */
    private String url;
    /**
     * @return Your Prometheus username.
     * 
     */
    private @Nullable String userName;

    private GetThirdPartyIntegrationResult() {}
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Your API Key.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    public String channelName() {
        return this.channelName;
    }
    /**
     * @return Whether your cluster has Prometheus enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    public Optional<String> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return An optional field for your Routing Key.
     * 
     */
    public String routingKey() {
        return this.routingKey;
    }
    /**
     * @return Your Prometheus protocol scheme configured for requests.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    /**
     * @return An optional field for your webhook secret.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Indicates which service discovery method is used, either file or http.
     * 
     */
    public Optional<String> serviceDiscovery() {
        return Optional.ofNullable(this.serviceDiscovery);
    }
    /**
     * @return Your Service Key.
     * 
     */
    public String serviceKey() {
        return this.serviceKey;
    }
    public String teamName() {
        return this.teamName;
    }
    /**
     * @return Property equal to its own integration type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Your webhook URL.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Your Prometheus username.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThirdPartyIntegrationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String apiKey;
        private String channelName;
        private @Nullable Boolean enabled;
        private String id;
        private @Nullable String microsoftTeamsWebhookUrl;
        private String projectId;
        private String region;
        private String routingKey;
        private @Nullable String scheme;
        private String secret;
        private @Nullable String serviceDiscovery;
        private String serviceKey;
        private String teamName;
        private String type;
        private String url;
        private @Nullable String userName;
        public Builder() {}
        public Builder(GetThirdPartyIntegrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.apiKey = defaults.apiKey;
    	      this.channelName = defaults.channelName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.microsoftTeamsWebhookUrl = defaults.microsoftTeamsWebhookUrl;
    	      this.projectId = defaults.projectId;
    	      this.region = defaults.region;
    	      this.routingKey = defaults.routingKey;
    	      this.scheme = defaults.scheme;
    	      this.secret = defaults.secret;
    	      this.serviceDiscovery = defaults.serviceDiscovery;
    	      this.serviceKey = defaults.serviceKey;
    	      this.teamName = defaults.teamName;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        @CustomType.Setter
        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder microsoftTeamsWebhookUrl(@Nullable String microsoftTeamsWebhookUrl) {
            this.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder routingKey(String routingKey) {
            this.routingKey = Objects.requireNonNull(routingKey);
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        @CustomType.Setter
        public Builder serviceDiscovery(@Nullable String serviceDiscovery) {
            this.serviceDiscovery = serviceDiscovery;
            return this;
        }
        @CustomType.Setter
        public Builder serviceKey(String serviceKey) {
            this.serviceKey = Objects.requireNonNull(serviceKey);
            return this;
        }
        @CustomType.Setter
        public Builder teamName(String teamName) {
            this.teamName = Objects.requireNonNull(teamName);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public GetThirdPartyIntegrationResult build() {
            final var _resultValue = new GetThirdPartyIntegrationResult();
            _resultValue.accountId = accountId;
            _resultValue.apiKey = apiKey;
            _resultValue.channelName = channelName;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            _resultValue.projectId = projectId;
            _resultValue.region = region;
            _resultValue.routingKey = routingKey;
            _resultValue.scheme = scheme;
            _resultValue.secret = secret;
            _resultValue.serviceDiscovery = serviceDiscovery;
            _resultValue.serviceKey = serviceKey;
            _resultValue.teamName = teamName;
            _resultValue.type = type;
            _resultValue.url = url;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
