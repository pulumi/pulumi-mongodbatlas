// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetThirdPartyIntegrationsResult {
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
     * @return Unique identifier of the integration.
     * 
     */
    private String id;
    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * * `PROMETHEUS`
     * 
     */
    private @Nullable String microsoftTeamsWebhookUrl;
    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    private String projectId;
    /**
     * @return Two-letter code that indicates which API URL to use. See the `region` response field of [MongoDB API Third-Party Service Integration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Third-Party-Integrations/operation/getThirdPartyIntegration) for more details. Opsgenie will use US by default.
     * * `VICTOR_OPS`
     * 
     */
    private String region;
    /**
     * @return An optional field for your Routing Key.
     * * `WEBHOOK`
     * 
     */
    private String routingKey;
    /**
     * @return Your Prometheus protocol scheme configured for requests. **Note** This attribute is deprecated as it is not being used.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    private @Nullable String scheme;
    /**
     * @return An optional field for your webhook secret.
     * * `MICROSOFT_TEAMS`
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
     * * `DATADOG`
     * 
     */
    private String serviceKey;
    private String teamName;
    /**
     * @return Thirt-Party service integration type.
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

    private GetThirdPartyIntegrationsResult() {}
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
     * @return Unique identifier of the integration.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * * `PROMETHEUS`
     * 
     */
    public Optional<String> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }
    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Two-letter code that indicates which API URL to use. See the `region` response field of [MongoDB API Third-Party Service Integration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Third-Party-Integrations/operation/getThirdPartyIntegration) for more details. Opsgenie will use US by default.
     * * `VICTOR_OPS`
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return An optional field for your Routing Key.
     * * `WEBHOOK`
     * 
     */
    public String routingKey() {
        return this.routingKey;
    }
    /**
     * @return Your Prometheus protocol scheme configured for requests. **Note** This attribute is deprecated as it is not being used.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    /**
     * @return An optional field for your webhook secret.
     * * `MICROSOFT_TEAMS`
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
     * * `DATADOG`
     * 
     */
    public String serviceKey() {
        return this.serviceKey;
    }
    public String teamName() {
        return this.teamName;
    }
    /**
     * @return Thirt-Party service integration type.
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

    public static Builder builder(GetThirdPartyIntegrationsResult defaults) {
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
        public Builder(GetThirdPartyIntegrationsResult defaults) {
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
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            if (apiKey == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "apiKey");
            }
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder channelName(String channelName) {
            if (channelName == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "channelName");
            }
            this.channelName = channelName;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder microsoftTeamsWebhookUrl(@Nullable String microsoftTeamsWebhookUrl) {

            this.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder routingKey(String routingKey) {
            if (routingKey == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "routingKey");
            }
            this.routingKey = routingKey;
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {

            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder serviceDiscovery(@Nullable String serviceDiscovery) {

            this.serviceDiscovery = serviceDiscovery;
            return this;
        }
        @CustomType.Setter
        public Builder serviceKey(String serviceKey) {
            if (serviceKey == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "serviceKey");
            }
            this.serviceKey = serviceKey;
            return this;
        }
        @CustomType.Setter
        public Builder teamName(String teamName) {
            if (teamName == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "teamName");
            }
            this.teamName = teamName;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetThirdPartyIntegrationsResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {

            this.userName = userName;
            return this;
        }
        public GetThirdPartyIntegrationsResult build() {
            final var _resultValue = new GetThirdPartyIntegrationsResult();
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
