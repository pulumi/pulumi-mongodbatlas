// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetThirdPartyIntegrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetThirdPartyIntegrationPlainArgs Empty = new GetThirdPartyIntegrationPlainArgs();

    /**
     * Whether your cluster has Prometheus enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Whether your cluster has Prometheus enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Your Microsoft Teams incoming webhook URL.
     * 
     */
    @Import(name="microsoftTeamsWebhookUrl")
    private @Nullable String microsoftTeamsWebhookUrl;

    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    public Optional<String> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }

    /**
     * The unique ID for the project to get all Third-Party service integrations
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Your Prometheus protocol scheme configured for requests.
     * 
     */
    @Import(name="scheme")
    private @Nullable String scheme;

    /**
     * @return Your Prometheus protocol scheme configured for requests.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    /**
     * Indicates which service discovery method is used, either file or http.
     * 
     */
    @Import(name="serviceDiscovery")
    private @Nullable String serviceDiscovery;

    /**
     * @return Indicates which service discovery method is used, either file or http.
     * 
     */
    public Optional<String> serviceDiscovery() {
        return Optional.ofNullable(this.serviceDiscovery);
    }

    /**
     * Third-Party service integration type
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
     * *resource is now deprecated and will be removed in the next major version, 1.9.0
     * **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Third-Party service integration type
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
     * *resource is now deprecated and will be removed in the next major version, 1.9.0
     * **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Your Prometheus username.
     * 
     */
    @Import(name="userName")
    private @Nullable String userName;

    /**
     * @return Your Prometheus username.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    private GetThirdPartyIntegrationPlainArgs() {}

    private GetThirdPartyIntegrationPlainArgs(GetThirdPartyIntegrationPlainArgs $) {
        this.enabled = $.enabled;
        this.microsoftTeamsWebhookUrl = $.microsoftTeamsWebhookUrl;
        this.projectId = $.projectId;
        this.scheme = $.scheme;
        this.serviceDiscovery = $.serviceDiscovery;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetThirdPartyIntegrationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetThirdPartyIntegrationPlainArgs $;

        public Builder() {
            $ = new GetThirdPartyIntegrationPlainArgs();
        }

        public Builder(GetThirdPartyIntegrationPlainArgs defaults) {
            $ = new GetThirdPartyIntegrationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether your cluster has Prometheus enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param microsoftTeamsWebhookUrl Your Microsoft Teams incoming webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(@Nullable String microsoftTeamsWebhookUrl) {
            $.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to get all Third-Party service integrations
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param scheme Your Prometheus protocol scheme configured for requests.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable String scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param serviceDiscovery Indicates which service discovery method is used, either file or http.
         * 
         * @return builder
         * 
         */
        public Builder serviceDiscovery(@Nullable String serviceDiscovery) {
            $.serviceDiscovery = serviceDiscovery;
            return this;
        }

        /**
         * @param type Third-Party service integration type
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
         * *resource is now deprecated and will be removed in the next major version, 1.9.0
         * **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param userName Your Prometheus username.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable String userName) {
            $.userName = userName;
            return this;
        }

        public GetThirdPartyIntegrationPlainArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
