// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThirdPartyIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThirdPartyIntegrationArgs Empty = new ThirdPartyIntegrationArgs();

    /**
     * Unique identifier of your New Relic account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Unique identifier of your New Relic account.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Your API Key.
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return Your API Key.
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * Your API Token.
     * 
     */
    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    /**
     * @return Your API Token.
     * 
     */
    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    @Import(name="channelName")
    private @Nullable Output<String> channelName;

    public Optional<Output<String>> channelName() {
        return Optional.ofNullable(this.channelName);
    }

    /**
     * Whether your cluster has Prometheus enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether your cluster has Prometheus enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Your Flowdock Flow name.
     * 
     */
    @Import(name="flowName")
    private @Nullable Output<String> flowName;

    /**
     * @return Your Flowdock Flow name.
     * 
     */
    public Optional<Output<String>> flowName() {
        return Optional.ofNullable(this.flowName);
    }

    /**
     * Your License Key.
     * 
     */
    @Import(name="licenseKey")
    private @Nullable Output<String> licenseKey;

    /**
     * @return Your License Key.
     * 
     */
    public Optional<Output<String>> licenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }

    /**
     * Your Microsoft Teams incoming webhook URL.
     * 
     */
    @Import(name="microsoftTeamsWebhookUrl")
    private @Nullable Output<String> microsoftTeamsWebhookUrl;

    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    public Optional<Output<String>> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }

    /**
     * Your Flowdock organization name.
     * 
     */
    @Import(name="orgName")
    private @Nullable Output<String> orgName;

    /**
     * @return Your Flowdock organization name.
     * 
     */
    public Optional<Output<String>> orgName() {
        return Optional.ofNullable(this.orgName);
    }

    /**
     * Your Prometheus password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Your Prometheus password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The unique ID for the project to get all Third-Party service integrations
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Your Insights Query Key.
     * 
     */
    @Import(name="readToken")
    private @Nullable Output<String> readToken;

    /**
     * @return Your Insights Query Key.
     * 
     */
    public Optional<Output<String>> readToken() {
        return Optional.ofNullable(this.readToken);
    }

    /**
     * Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * An optional field for your Routing Key.
     * 
     */
    @Import(name="routingKey")
    private @Nullable Output<String> routingKey;

    /**
     * @return An optional field for your Routing Key.
     * 
     */
    public Optional<Output<String>> routingKey() {
        return Optional.ofNullable(this.routingKey);
    }

    /**
     * Your Prometheus protocol scheme configured for requests.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    /**
     * @return Your Prometheus protocol scheme configured for requests.
     * 
     */
    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    /**
     * An optional field for your webhook secret.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return An optional field for your webhook secret.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * Indicates which service discovery method is used, either file or http.
     * 
     */
    @Import(name="serviceDiscovery")
    private @Nullable Output<String> serviceDiscovery;

    /**
     * @return Indicates which service discovery method is used, either file or http.
     * 
     */
    public Optional<Output<String>> serviceDiscovery() {
        return Optional.ofNullable(this.serviceDiscovery);
    }

    /**
     * Your Service Key.
     * 
     */
    @Import(name="serviceKey")
    private @Nullable Output<String> serviceKey;

    /**
     * @return Your Service Key.
     * 
     */
    public Optional<Output<String>> serviceKey() {
        return Optional.ofNullable(this.serviceKey);
    }

    @Import(name="teamName")
    private @Nullable Output<String> teamName;

    public Optional<Output<String>> teamName() {
        return Optional.ofNullable(this.teamName);
    }

    /**
     * Third-Party Integration Settings type
     * * PAGER_DUTY
     * * DATADOG
     * * NEW_RELIC*
     * * OPS_GENIE
     * * VICTOR_OPS
     * * FLOWDOCK*
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     * 
     * @deprecated
     * This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release
     * 
     */
    @Deprecated /* This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release  */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Third-Party Integration Settings type
     * * PAGER_DUTY
     * * DATADOG
     * * NEW_RELIC*
     * * OPS_GENIE
     * * VICTOR_OPS
     * * FLOWDOCK*
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     * 
     * @deprecated
     * This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release
     * 
     */
    @Deprecated /* This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release  */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Your webhook URL.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Your webhook URL.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * Your Prometheus username.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Your Prometheus username.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * Your Insights Insert Key.
     * 
     */
    @Import(name="writeToken")
    private @Nullable Output<String> writeToken;

    /**
     * @return Your Insights Insert Key.
     * 
     */
    public Optional<Output<String>> writeToken() {
        return Optional.ofNullable(this.writeToken);
    }

    private ThirdPartyIntegrationArgs() {}

    private ThirdPartyIntegrationArgs(ThirdPartyIntegrationArgs $) {
        this.accountId = $.accountId;
        this.apiKey = $.apiKey;
        this.apiToken = $.apiToken;
        this.channelName = $.channelName;
        this.enabled = $.enabled;
        this.flowName = $.flowName;
        this.licenseKey = $.licenseKey;
        this.microsoftTeamsWebhookUrl = $.microsoftTeamsWebhookUrl;
        this.orgName = $.orgName;
        this.password = $.password;
        this.projectId = $.projectId;
        this.readToken = $.readToken;
        this.region = $.region;
        this.routingKey = $.routingKey;
        this.scheme = $.scheme;
        this.secret = $.secret;
        this.serviceDiscovery = $.serviceDiscovery;
        this.serviceKey = $.serviceKey;
        this.teamName = $.teamName;
        this.type = $.type;
        this.url = $.url;
        this.userName = $.userName;
        this.writeToken = $.writeToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThirdPartyIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThirdPartyIntegrationArgs $;

        public Builder() {
            $ = new ThirdPartyIntegrationArgs();
        }

        public Builder(ThirdPartyIntegrationArgs defaults) {
            $ = new ThirdPartyIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Unique identifier of your New Relic account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Unique identifier of your New Relic account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param apiKey Your API Key.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey Your API Key.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiToken Your API Token.
         * 
         * @return builder
         * 
         */
        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

        /**
         * @param apiToken Your API Token.
         * 
         * @return builder
         * 
         */
        public Builder apiToken(String apiToken) {
            return apiToken(Output.of(apiToken));
        }

        public Builder channelName(@Nullable Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        /**
         * @param enabled Whether your cluster has Prometheus enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether your cluster has Prometheus enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param flowName Your Flowdock Flow name.
         * 
         * @return builder
         * 
         */
        public Builder flowName(@Nullable Output<String> flowName) {
            $.flowName = flowName;
            return this;
        }

        /**
         * @param flowName Your Flowdock Flow name.
         * 
         * @return builder
         * 
         */
        public Builder flowName(String flowName) {
            return flowName(Output.of(flowName));
        }

        /**
         * @param licenseKey Your License Key.
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(@Nullable Output<String> licenseKey) {
            $.licenseKey = licenseKey;
            return this;
        }

        /**
         * @param licenseKey Your License Key.
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(String licenseKey) {
            return licenseKey(Output.of(licenseKey));
        }

        /**
         * @param microsoftTeamsWebhookUrl Your Microsoft Teams incoming webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(@Nullable Output<String> microsoftTeamsWebhookUrl) {
            $.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }

        /**
         * @param microsoftTeamsWebhookUrl Your Microsoft Teams incoming webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(String microsoftTeamsWebhookUrl) {
            return microsoftTeamsWebhookUrl(Output.of(microsoftTeamsWebhookUrl));
        }

        /**
         * @param orgName Your Flowdock organization name.
         * 
         * @return builder
         * 
         */
        public Builder orgName(@Nullable Output<String> orgName) {
            $.orgName = orgName;
            return this;
        }

        /**
         * @param orgName Your Flowdock organization name.
         * 
         * @return builder
         * 
         */
        public Builder orgName(String orgName) {
            return orgName(Output.of(orgName));
        }

        /**
         * @param password Your Prometheus password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Your Prometheus password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param projectId The unique ID for the project to get all Third-Party service integrations
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to get all Third-Party service integrations
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param readToken Your Insights Query Key.
         * 
         * @return builder
         * 
         */
        public Builder readToken(@Nullable Output<String> readToken) {
            $.readToken = readToken;
            return this;
        }

        /**
         * @param readToken Your Insights Query Key.
         * 
         * @return builder
         * 
         */
        public Builder readToken(String readToken) {
            return readToken(Output.of(readToken));
        }

        /**
         * @param region Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param routingKey An optional field for your Routing Key.
         * 
         * @return builder
         * 
         */
        public Builder routingKey(@Nullable Output<String> routingKey) {
            $.routingKey = routingKey;
            return this;
        }

        /**
         * @param routingKey An optional field for your Routing Key.
         * 
         * @return builder
         * 
         */
        public Builder routingKey(String routingKey) {
            return routingKey(Output.of(routingKey));
        }

        /**
         * @param scheme Your Prometheus protocol scheme configured for requests.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Your Prometheus protocol scheme configured for requests.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        /**
         * @param secret An optional field for your webhook secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret An optional field for your webhook secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param serviceDiscovery Indicates which service discovery method is used, either file or http.
         * 
         * @return builder
         * 
         */
        public Builder serviceDiscovery(@Nullable Output<String> serviceDiscovery) {
            $.serviceDiscovery = serviceDiscovery;
            return this;
        }

        /**
         * @param serviceDiscovery Indicates which service discovery method is used, either file or http.
         * 
         * @return builder
         * 
         */
        public Builder serviceDiscovery(String serviceDiscovery) {
            return serviceDiscovery(Output.of(serviceDiscovery));
        }

        /**
         * @param serviceKey Your Service Key.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(@Nullable Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        /**
         * @param serviceKey Your Service Key.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        public Builder teamName(@Nullable Output<String> teamName) {
            $.teamName = teamName;
            return this;
        }

        public Builder teamName(String teamName) {
            return teamName(Output.of(teamName));
        }

        /**
         * @param type Third-Party Integration Settings type
         * * PAGER_DUTY
         * * DATADOG
         * * NEW_RELIC*
         * * OPS_GENIE
         * * VICTOR_OPS
         * * FLOWDOCK*
         * * WEBHOOK
         * * MICROSOFT_TEAMS
         * * PROMETHEUS
         * 
         * @return builder
         * 
         * @deprecated
         * This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release
         * 
         */
        @Deprecated /* This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release  */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Third-Party Integration Settings type
         * * PAGER_DUTY
         * * DATADOG
         * * NEW_RELIC*
         * * OPS_GENIE
         * * VICTOR_OPS
         * * FLOWDOCK*
         * * WEBHOOK
         * * MICROSOFT_TEAMS
         * * PROMETHEUS
         * 
         * @return builder
         * 
         * @deprecated
         * This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release
         * 
         */
        @Deprecated /* This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release  */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url Your webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Your webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param userName Your Prometheus username.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Your Prometheus username.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param writeToken Your Insights Insert Key.
         * 
         * @return builder
         * 
         */
        public Builder writeToken(@Nullable Output<String> writeToken) {
            $.writeToken = writeToken;
            return this;
        }

        /**
         * @param writeToken Your Insights Insert Key.
         * 
         * @return builder
         * 
         */
        public Builder writeToken(String writeToken) {
            return writeToken(Output.of(writeToken));
        }

        public ThirdPartyIntegrationArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
