// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConfigurationNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConfigurationNotificationArgs Empty = new AlertConfigurationNotificationArgs();

    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    @Import(name="channelName")
    private @Nullable Output<String> channelName;

    public Optional<Output<String>> channelName() {
        return Optional.ofNullable(this.channelName);
    }

    @Import(name="datadogApiKey")
    private @Nullable Output<String> datadogApiKey;

    public Optional<Output<String>> datadogApiKey() {
        return Optional.ofNullable(this.datadogApiKey);
    }

    @Import(name="datadogRegion")
    private @Nullable Output<String> datadogRegion;

    public Optional<Output<String>> datadogRegion() {
        return Optional.ofNullable(this.datadogRegion);
    }

    @Import(name="delayMin")
    private @Nullable Output<Integer> delayMin;

    public Optional<Output<Integer>> delayMin() {
        return Optional.ofNullable(this.delayMin);
    }

    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    @Import(name="emailEnabled")
    private @Nullable Output<Boolean> emailEnabled;

    public Optional<Output<Boolean>> emailEnabled() {
        return Optional.ofNullable(this.emailEnabled);
    }

    @Import(name="integrationId")
    private @Nullable Output<String> integrationId;

    public Optional<Output<String>> integrationId() {
        return Optional.ofNullable(this.integrationId);
    }

    @Import(name="intervalMin")
    private @Nullable Output<Integer> intervalMin;

    public Optional<Output<Integer>> intervalMin() {
        return Optional.ofNullable(this.intervalMin);
    }

    @Import(name="microsoftTeamsWebhookUrl")
    private @Nullable Output<String> microsoftTeamsWebhookUrl;

    public Optional<Output<String>> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }

    @Import(name="mobileNumber")
    private @Nullable Output<String> mobileNumber;

    public Optional<Output<String>> mobileNumber() {
        return Optional.ofNullable(this.mobileNumber);
    }

    @Import(name="notifierId")
    private @Nullable Output<String> notifierId;

    public Optional<Output<String>> notifierId() {
        return Optional.ofNullable(this.notifierId);
    }

    @Import(name="opsGenieApiKey")
    private @Nullable Output<String> opsGenieApiKey;

    public Optional<Output<String>> opsGenieApiKey() {
        return Optional.ofNullable(this.opsGenieApiKey);
    }

    @Import(name="opsGenieRegion")
    private @Nullable Output<String> opsGenieRegion;

    public Optional<Output<String>> opsGenieRegion() {
        return Optional.ofNullable(this.opsGenieRegion);
    }

    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    @Import(name="serviceKey")
    private @Nullable Output<String> serviceKey;

    public Optional<Output<String>> serviceKey() {
        return Optional.ofNullable(this.serviceKey);
    }

    @Import(name="smsEnabled")
    private @Nullable Output<Boolean> smsEnabled;

    public Optional<Output<Boolean>> smsEnabled() {
        return Optional.ofNullable(this.smsEnabled);
    }

    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    @Import(name="teamName")
    private @Nullable Output<String> teamName;

    public Optional<Output<String>> teamName() {
        return Optional.ofNullable(this.teamName);
    }

    @Import(name="typeName", required=true)
    private Output<String> typeName;

    public Output<String> typeName() {
        return this.typeName;
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="victorOpsApiKey")
    private @Nullable Output<String> victorOpsApiKey;

    public Optional<Output<String>> victorOpsApiKey() {
        return Optional.ofNullable(this.victorOpsApiKey);
    }

    @Import(name="victorOpsRoutingKey")
    private @Nullable Output<String> victorOpsRoutingKey;

    public Optional<Output<String>> victorOpsRoutingKey() {
        return Optional.ofNullable(this.victorOpsRoutingKey);
    }

    @Import(name="webhookSecret")
    private @Nullable Output<String> webhookSecret;

    public Optional<Output<String>> webhookSecret() {
        return Optional.ofNullable(this.webhookSecret);
    }

    @Import(name="webhookUrl")
    private @Nullable Output<String> webhookUrl;

    public Optional<Output<String>> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    private AlertConfigurationNotificationArgs() {}

    private AlertConfigurationNotificationArgs(AlertConfigurationNotificationArgs $) {
        this.apiToken = $.apiToken;
        this.channelName = $.channelName;
        this.datadogApiKey = $.datadogApiKey;
        this.datadogRegion = $.datadogRegion;
        this.delayMin = $.delayMin;
        this.emailAddress = $.emailAddress;
        this.emailEnabled = $.emailEnabled;
        this.integrationId = $.integrationId;
        this.intervalMin = $.intervalMin;
        this.microsoftTeamsWebhookUrl = $.microsoftTeamsWebhookUrl;
        this.mobileNumber = $.mobileNumber;
        this.notifierId = $.notifierId;
        this.opsGenieApiKey = $.opsGenieApiKey;
        this.opsGenieRegion = $.opsGenieRegion;
        this.roles = $.roles;
        this.serviceKey = $.serviceKey;
        this.smsEnabled = $.smsEnabled;
        this.teamId = $.teamId;
        this.teamName = $.teamName;
        this.typeName = $.typeName;
        this.username = $.username;
        this.victorOpsApiKey = $.victorOpsApiKey;
        this.victorOpsRoutingKey = $.victorOpsRoutingKey;
        this.webhookSecret = $.webhookSecret;
        this.webhookUrl = $.webhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConfigurationNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConfigurationNotificationArgs $;

        public Builder() {
            $ = new AlertConfigurationNotificationArgs();
        }

        public Builder(AlertConfigurationNotificationArgs defaults) {
            $ = new AlertConfigurationNotificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

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

        public Builder datadogApiKey(@Nullable Output<String> datadogApiKey) {
            $.datadogApiKey = datadogApiKey;
            return this;
        }

        public Builder datadogApiKey(String datadogApiKey) {
            return datadogApiKey(Output.of(datadogApiKey));
        }

        public Builder datadogRegion(@Nullable Output<String> datadogRegion) {
            $.datadogRegion = datadogRegion;
            return this;
        }

        public Builder datadogRegion(String datadogRegion) {
            return datadogRegion(Output.of(datadogRegion));
        }

        public Builder delayMin(@Nullable Output<Integer> delayMin) {
            $.delayMin = delayMin;
            return this;
        }

        public Builder delayMin(Integer delayMin) {
            return delayMin(Output.of(delayMin));
        }

        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        public Builder emailEnabled(@Nullable Output<Boolean> emailEnabled) {
            $.emailEnabled = emailEnabled;
            return this;
        }

        public Builder emailEnabled(Boolean emailEnabled) {
            return emailEnabled(Output.of(emailEnabled));
        }

        public Builder integrationId(@Nullable Output<String> integrationId) {
            $.integrationId = integrationId;
            return this;
        }

        public Builder integrationId(String integrationId) {
            return integrationId(Output.of(integrationId));
        }

        public Builder intervalMin(@Nullable Output<Integer> intervalMin) {
            $.intervalMin = intervalMin;
            return this;
        }

        public Builder intervalMin(Integer intervalMin) {
            return intervalMin(Output.of(intervalMin));
        }

        public Builder microsoftTeamsWebhookUrl(@Nullable Output<String> microsoftTeamsWebhookUrl) {
            $.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }

        public Builder microsoftTeamsWebhookUrl(String microsoftTeamsWebhookUrl) {
            return microsoftTeamsWebhookUrl(Output.of(microsoftTeamsWebhookUrl));
        }

        public Builder mobileNumber(@Nullable Output<String> mobileNumber) {
            $.mobileNumber = mobileNumber;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            return mobileNumber(Output.of(mobileNumber));
        }

        public Builder notifierId(@Nullable Output<String> notifierId) {
            $.notifierId = notifierId;
            return this;
        }

        public Builder notifierId(String notifierId) {
            return notifierId(Output.of(notifierId));
        }

        public Builder opsGenieApiKey(@Nullable Output<String> opsGenieApiKey) {
            $.opsGenieApiKey = opsGenieApiKey;
            return this;
        }

        public Builder opsGenieApiKey(String opsGenieApiKey) {
            return opsGenieApiKey(Output.of(opsGenieApiKey));
        }

        public Builder opsGenieRegion(@Nullable Output<String> opsGenieRegion) {
            $.opsGenieRegion = opsGenieRegion;
            return this;
        }

        public Builder opsGenieRegion(String opsGenieRegion) {
            return opsGenieRegion(Output.of(opsGenieRegion));
        }

        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        public Builder serviceKey(@Nullable Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        public Builder smsEnabled(@Nullable Output<Boolean> smsEnabled) {
            $.smsEnabled = smsEnabled;
            return this;
        }

        public Builder smsEnabled(Boolean smsEnabled) {
            return smsEnabled(Output.of(smsEnabled));
        }

        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public Builder teamName(@Nullable Output<String> teamName) {
            $.teamName = teamName;
            return this;
        }

        public Builder teamName(String teamName) {
            return teamName(Output.of(teamName));
        }

        public Builder typeName(Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder victorOpsApiKey(@Nullable Output<String> victorOpsApiKey) {
            $.victorOpsApiKey = victorOpsApiKey;
            return this;
        }

        public Builder victorOpsApiKey(String victorOpsApiKey) {
            return victorOpsApiKey(Output.of(victorOpsApiKey));
        }

        public Builder victorOpsRoutingKey(@Nullable Output<String> victorOpsRoutingKey) {
            $.victorOpsRoutingKey = victorOpsRoutingKey;
            return this;
        }

        public Builder victorOpsRoutingKey(String victorOpsRoutingKey) {
            return victorOpsRoutingKey(Output.of(victorOpsRoutingKey));
        }

        public Builder webhookSecret(@Nullable Output<String> webhookSecret) {
            $.webhookSecret = webhookSecret;
            return this;
        }

        public Builder webhookSecret(String webhookSecret) {
            return webhookSecret(Output.of(webhookSecret));
        }

        public Builder webhookUrl(@Nullable Output<String> webhookUrl) {
            $.webhookUrl = webhookUrl;
            return this;
        }

        public Builder webhookUrl(String webhookUrl) {
            return webhookUrl(Output.of(webhookUrl));
        }

        public AlertConfigurationNotificationArgs build() {
            if ($.typeName == null) {
                throw new MissingRequiredPropertyException("AlertConfigurationNotificationArgs", "typeName");
            }
            return $;
        }
    }

}
