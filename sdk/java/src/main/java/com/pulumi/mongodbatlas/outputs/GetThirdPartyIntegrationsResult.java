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
public final class GetThirdPartyIntegrationsResult {
    /**
     * @return Unique identifier of your New Relic account.
     * 
     */
    private String accountId;
    /**
     * @return Your API Key.
     * 
     */
    private String apiKey;
    /**
     * @return Your API Token.
     * 
     */
    private String apiToken;
    private String channelName;
    /**
     * @return Whether your cluster has Prometheus enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Your Flowdock Flow name.
     * 
     */
    private String flowName;
    /**
     * @return Your License Key.
     * 
     */
    private String licenseKey;
    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    private @Nullable String microsoftTeamsWebhookUrl;
    /**
     * @return Your Flowdock organization name.
     * 
     */
    private String orgName;
    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    private String projectId;
    /**
     * @return Your Insights Query Key.
     * 
     */
    private String readToken;
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
     * @return (Required) Thirt-Party service integration type.
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
    /**
     * @return Your Insights Insert Key.
     * 
     */
    private String writeToken;

    private GetThirdPartyIntegrationsResult() {}
    /**
     * @return Unique identifier of your New Relic account.
     * 
     */
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
    /**
     * @return Your API Token.
     * 
     */
    public String apiToken() {
        return this.apiToken;
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
     * @return Your Flowdock Flow name.
     * 
     */
    public String flowName() {
        return this.flowName;
    }
    /**
     * @return Your License Key.
     * 
     */
    public String licenseKey() {
        return this.licenseKey;
    }
    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    public Optional<String> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }
    /**
     * @return Your Flowdock organization name.
     * 
     */
    public String orgName() {
        return this.orgName;
    }
    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Your Insights Query Key.
     * 
     */
    public String readToken() {
        return this.readToken;
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
     * @return (Required) Thirt-Party service integration type.
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
    /**
     * @return Your Insights Insert Key.
     * 
     */
    public String writeToken() {
        return this.writeToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThirdPartyIntegrationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String apiKey;
        private String apiToken;
        private String channelName;
        private @Nullable Boolean enabled;
        private String flowName;
        private String licenseKey;
        private @Nullable String microsoftTeamsWebhookUrl;
        private String orgName;
        private String projectId;
        private String readToken;
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
        private String writeToken;
        public Builder() {}
        public Builder(GetThirdPartyIntegrationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.apiKey = defaults.apiKey;
    	      this.apiToken = defaults.apiToken;
    	      this.channelName = defaults.channelName;
    	      this.enabled = defaults.enabled;
    	      this.flowName = defaults.flowName;
    	      this.licenseKey = defaults.licenseKey;
    	      this.microsoftTeamsWebhookUrl = defaults.microsoftTeamsWebhookUrl;
    	      this.orgName = defaults.orgName;
    	      this.projectId = defaults.projectId;
    	      this.readToken = defaults.readToken;
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
    	      this.writeToken = defaults.writeToken;
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
        public Builder apiToken(String apiToken) {
            this.apiToken = Objects.requireNonNull(apiToken);
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
        public Builder flowName(String flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(String licenseKey) {
            this.licenseKey = Objects.requireNonNull(licenseKey);
            return this;
        }
        @CustomType.Setter
        public Builder microsoftTeamsWebhookUrl(@Nullable String microsoftTeamsWebhookUrl) {
            this.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }
        @CustomType.Setter
        public Builder orgName(String orgName) {
            this.orgName = Objects.requireNonNull(orgName);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder readToken(String readToken) {
            this.readToken = Objects.requireNonNull(readToken);
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
        @CustomType.Setter
        public Builder writeToken(String writeToken) {
            this.writeToken = Objects.requireNonNull(writeToken);
            return this;
        }
        public GetThirdPartyIntegrationsResult build() {
            final var o = new GetThirdPartyIntegrationsResult();
            o.accountId = accountId;
            o.apiKey = apiKey;
            o.apiToken = apiToken;
            o.channelName = channelName;
            o.enabled = enabled;
            o.flowName = flowName;
            o.licenseKey = licenseKey;
            o.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            o.orgName = orgName;
            o.projectId = projectId;
            o.readToken = readToken;
            o.region = region;
            o.routingKey = routingKey;
            o.scheme = scheme;
            o.secret = secret;
            o.serviceDiscovery = serviceDiscovery;
            o.serviceKey = serviceKey;
            o.teamName = teamName;
            o.type = type;
            o.url = url;
            o.userName = userName;
            o.writeToken = writeToken;
            return o;
        }
    }
}
