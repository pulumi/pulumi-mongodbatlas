// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConfigurationNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConfigurationNotificationArgs Empty = new AlertConfigurationNotificationArgs();

    /**
     * Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    /**
     * @return Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    /**
     * Slack channel name. Required for the SLACK notifications type.
     * 
     */
    @Import(name="channelName")
    private @Nullable Output<String> channelName;

    /**
     * @return Slack channel name. Required for the SLACK notifications type.
     * 
     */
    public Optional<Output<String>> channelName() {
        return Optional.ofNullable(this.channelName);
    }

    /**
     * Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
     * 
     */
    @Import(name="datadogApiKey")
    private @Nullable Output<String> datadogApiKey;

    /**
     * @return Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
     * 
     */
    public Optional<Output<String>> datadogApiKey() {
        return Optional.ofNullable(this.datadogApiKey);
    }

    /**
     * Region that indicates which API URL to use. Accepted regions are: `US`, `EU`. The default Datadog region is US.
     * 
     */
    @Import(name="datadogRegion")
    private @Nullable Output<String> datadogRegion;

    /**
     * @return Region that indicates which API URL to use. Accepted regions are: `US`, `EU`. The default Datadog region is US.
     * 
     */
    public Optional<Output<String>> datadogRegion() {
        return Optional.ofNullable(this.datadogRegion);
    }

    /**
     * Number of minutes to wait after an alert condition is detected before sending out the first notification.
     * 
     */
    @Import(name="delayMin")
    private @Nullable Output<Integer> delayMin;

    /**
     * @return Number of minutes to wait after an alert condition is detected before sending out the first notification.
     * 
     */
    public Optional<Output<Integer>> delayMin() {
        return Optional.ofNullable(this.delayMin);
    }

    /**
     * Email address to which alert notifications are sent. Required for the EMAIL notifications type.
     * 
     */
    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    /**
     * @return Email address to which alert notifications are sent. Required for the EMAIL notifications type.
     * 
     */
    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * Flag indicating email notifications should be sent. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * 
     */
    @Import(name="emailEnabled")
    private @Nullable Output<Boolean> emailEnabled;

    /**
     * @return Flag indicating email notifications should be sent. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * 
     */
    public Optional<Output<Boolean>> emailEnabled() {
        return Optional.ofNullable(this.emailEnabled);
    }

    /**
     * Flowdock flow name in lower-case letters. Required for the `FLOWDOCK` notifications type
     * 
     */
    @Import(name="flowName")
    private @Nullable Output<String> flowName;

    /**
     * @return Flowdock flow name in lower-case letters. Required for the `FLOWDOCK` notifications type
     * 
     */
    public Optional<Output<String>> flowName() {
        return Optional.ofNullable(this.flowName);
    }

    /**
     * The Flowdock personal API token. Required for the `FLOWDOCK` notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    @Import(name="flowdockApiToken")
    private @Nullable Output<String> flowdockApiToken;

    /**
     * @return The Flowdock personal API token. Required for the `FLOWDOCK` notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    public Optional<Output<String>> flowdockApiToken() {
        return Optional.ofNullable(this.flowdockApiToken);
    }

    /**
     * Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
     * 
     */
    @Import(name="intervalMin")
    private @Nullable Output<Integer> intervalMin;

    /**
     * @return Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
     * 
     */
    public Optional<Output<Integer>> intervalMin() {
        return Optional.ofNullable(this.intervalMin);
    }

    /**
     * Microsoft Teams Webhook Uniform Resource Locator (URL) that MongoDB Cloud needs to send this notification via Microsoft Teams. Required if `type_name` is `MICROSOFT_TEAMS`. If the URL later becomes invalid, MongoDB Cloud sends an email to the project owners. If the key remains invalid, MongoDB Cloud removes it.
     * 
     */
    @Import(name="microsoftTeamsWebhookUrl")
    private @Nullable Output<String> microsoftTeamsWebhookUrl;

    /**
     * @return Microsoft Teams Webhook Uniform Resource Locator (URL) that MongoDB Cloud needs to send this notification via Microsoft Teams. Required if `type_name` is `MICROSOFT_TEAMS`. If the URL later becomes invalid, MongoDB Cloud sends an email to the project owners. If the key remains invalid, MongoDB Cloud removes it.
     * 
     */
    public Optional<Output<String>> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }

    /**
     * Mobile number to which alert notifications are sent. Required for the SMS notifications type.
     * 
     */
    @Import(name="mobileNumber")
    private @Nullable Output<String> mobileNumber;

    /**
     * @return Mobile number to which alert notifications are sent. Required for the SMS notifications type.
     * 
     */
    public Optional<Output<String>> mobileNumber() {
        return Optional.ofNullable(this.mobileNumber);
    }

    /**
     * Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    @Import(name="opsGenieApiKey")
    private @Nullable Output<String> opsGenieApiKey;

    /**
     * @return Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    public Optional<Output<String>> opsGenieApiKey() {
        return Optional.ofNullable(this.opsGenieApiKey);
    }

    /**
     * Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
     * 
     */
    @Import(name="opsGenieRegion")
    private @Nullable Output<String> opsGenieRegion;

    /**
     * @return Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
     * 
     */
    public Optional<Output<String>> opsGenieRegion() {
        return Optional.ofNullable(this.opsGenieRegion);
    }

    /**
     * Flowdock organization name in lower-case letters. This is the name that appears after www.flowdock.com/app/ in the URL string. Required for the FLOWDOCK notifications type.
     * 
     */
    @Import(name="orgName")
    private @Nullable Output<String> orgName;

    /**
     * @return Flowdock organization name in lower-case letters. This is the name that appears after www.flowdock.com/app/ in the URL string. Required for the FLOWDOCK notifications type.
     * 
     */
    public Optional<Output<String>> orgName() {
        return Optional.ofNullable(this.orgName);
    }

    /**
     * Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * Accepted values are:
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * Accepted values are:
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    @Import(name="serviceKey")
    private @Nullable Output<String> serviceKey;

    /**
     * @return PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    public Optional<Output<String>> serviceKey() {
        return Optional.ofNullable(this.serviceKey);
    }

    /**
     * Flag indicating if text message notifications should be sent to this user&#39;s mobile phone. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * 
     */
    @Import(name="smsEnabled")
    private @Nullable Output<Boolean> smsEnabled;

    /**
     * @return Flag indicating if text message notifications should be sent to this user&#39;s mobile phone. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * 
     */
    public Optional<Output<Boolean>> smsEnabled() {
        return Optional.ofNullable(this.smsEnabled);
    }

    /**
     * Unique identifier of a team.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return Unique identifier of a team.
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    /**
     * Label for the team that receives this notification.
     * 
     */
    @Import(name="teamName")
    private @Nullable Output<String> teamName;

    /**
     * @return Label for the team that receives this notification.
     * 
     */
    public Optional<Output<String>> teamName() {
        return Optional.ofNullable(this.teamName);
    }

    /**
     * Type of alert notification.
     * Accepted values are:
     * 
     */
    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    /**
     * @return Type of alert notification.
     * Accepted values are:
     * 
     */
    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    /**
     * Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    @Import(name="victorOpsApiKey")
    private @Nullable Output<String> victorOpsApiKey;

    /**
     * @return VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    public Optional<Output<String>> victorOpsApiKey() {
        return Optional.ofNullable(this.victorOpsApiKey);
    }

    /**
     * VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    @Import(name="victorOpsRoutingKey")
    private @Nullable Output<String> victorOpsRoutingKey;

    /**
     * @return VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    public Optional<Output<String>> victorOpsRoutingKey() {
        return Optional.ofNullable(this.victorOpsRoutingKey);
    }

    /**
     * Optional authentication secret for the `WEBHOOK` notifications type.
     * 
     */
    @Import(name="webhookSecret")
    private @Nullable Output<String> webhookSecret;

    /**
     * @return Optional authentication secret for the `WEBHOOK` notifications type.
     * 
     */
    public Optional<Output<String>> webhookSecret() {
        return Optional.ofNullable(this.webhookSecret);
    }

    /**
     * Target URL  for the `WEBHOOK` notifications type.
     * 
     */
    @Import(name="webhookUrl")
    private @Nullable Output<String> webhookUrl;

    /**
     * @return Target URL  for the `WEBHOOK` notifications type.
     * 
     */
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
        this.flowName = $.flowName;
        this.flowdockApiToken = $.flowdockApiToken;
        this.intervalMin = $.intervalMin;
        this.microsoftTeamsWebhookUrl = $.microsoftTeamsWebhookUrl;
        this.mobileNumber = $.mobileNumber;
        this.opsGenieApiKey = $.opsGenieApiKey;
        this.opsGenieRegion = $.opsGenieRegion;
        this.orgName = $.orgName;
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

        /**
         * @param apiToken Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
         * 
         * @return builder
         * 
         */
        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

        /**
         * @param apiToken Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
         * 
         * @return builder
         * 
         */
        public Builder apiToken(String apiToken) {
            return apiToken(Output.of(apiToken));
        }

        /**
         * @param channelName Slack channel name. Required for the SLACK notifications type.
         * 
         * @return builder
         * 
         */
        public Builder channelName(@Nullable Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        /**
         * @param channelName Slack channel name. Required for the SLACK notifications type.
         * 
         * @return builder
         * 
         */
        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        /**
         * @param datadogApiKey Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
         * 
         * @return builder
         * 
         */
        public Builder datadogApiKey(@Nullable Output<String> datadogApiKey) {
            $.datadogApiKey = datadogApiKey;
            return this;
        }

        /**
         * @param datadogApiKey Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
         * 
         * @return builder
         * 
         */
        public Builder datadogApiKey(String datadogApiKey) {
            return datadogApiKey(Output.of(datadogApiKey));
        }

        /**
         * @param datadogRegion Region that indicates which API URL to use. Accepted regions are: `US`, `EU`. The default Datadog region is US.
         * 
         * @return builder
         * 
         */
        public Builder datadogRegion(@Nullable Output<String> datadogRegion) {
            $.datadogRegion = datadogRegion;
            return this;
        }

        /**
         * @param datadogRegion Region that indicates which API URL to use. Accepted regions are: `US`, `EU`. The default Datadog region is US.
         * 
         * @return builder
         * 
         */
        public Builder datadogRegion(String datadogRegion) {
            return datadogRegion(Output.of(datadogRegion));
        }

        /**
         * @param delayMin Number of minutes to wait after an alert condition is detected before sending out the first notification.
         * 
         * @return builder
         * 
         */
        public Builder delayMin(@Nullable Output<Integer> delayMin) {
            $.delayMin = delayMin;
            return this;
        }

        /**
         * @param delayMin Number of minutes to wait after an alert condition is detected before sending out the first notification.
         * 
         * @return builder
         * 
         */
        public Builder delayMin(Integer delayMin) {
            return delayMin(Output.of(delayMin));
        }

        /**
         * @param emailAddress Email address to which alert notifications are sent. Required for the EMAIL notifications type.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress Email address to which alert notifications are sent. Required for the EMAIL notifications type.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param emailEnabled Flag indicating email notifications should be sent. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * 
         * @return builder
         * 
         */
        public Builder emailEnabled(@Nullable Output<Boolean> emailEnabled) {
            $.emailEnabled = emailEnabled;
            return this;
        }

        /**
         * @param emailEnabled Flag indicating email notifications should be sent. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * 
         * @return builder
         * 
         */
        public Builder emailEnabled(Boolean emailEnabled) {
            return emailEnabled(Output.of(emailEnabled));
        }

        /**
         * @param flowName Flowdock flow name in lower-case letters. Required for the `FLOWDOCK` notifications type
         * 
         * @return builder
         * 
         */
        public Builder flowName(@Nullable Output<String> flowName) {
            $.flowName = flowName;
            return this;
        }

        /**
         * @param flowName Flowdock flow name in lower-case letters. Required for the `FLOWDOCK` notifications type
         * 
         * @return builder
         * 
         */
        public Builder flowName(String flowName) {
            return flowName(Output.of(flowName));
        }

        /**
         * @param flowdockApiToken The Flowdock personal API token. Required for the `FLOWDOCK` notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
         * 
         * @return builder
         * 
         */
        public Builder flowdockApiToken(@Nullable Output<String> flowdockApiToken) {
            $.flowdockApiToken = flowdockApiToken;
            return this;
        }

        /**
         * @param flowdockApiToken The Flowdock personal API token. Required for the `FLOWDOCK` notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
         * 
         * @return builder
         * 
         */
        public Builder flowdockApiToken(String flowdockApiToken) {
            return flowdockApiToken(Output.of(flowdockApiToken));
        }

        /**
         * @param intervalMin Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
         * 
         * @return builder
         * 
         */
        public Builder intervalMin(@Nullable Output<Integer> intervalMin) {
            $.intervalMin = intervalMin;
            return this;
        }

        /**
         * @param intervalMin Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
         * 
         * @return builder
         * 
         */
        public Builder intervalMin(Integer intervalMin) {
            return intervalMin(Output.of(intervalMin));
        }

        /**
         * @param microsoftTeamsWebhookUrl Microsoft Teams Webhook Uniform Resource Locator (URL) that MongoDB Cloud needs to send this notification via Microsoft Teams. Required if `type_name` is `MICROSOFT_TEAMS`. If the URL later becomes invalid, MongoDB Cloud sends an email to the project owners. If the key remains invalid, MongoDB Cloud removes it.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(@Nullable Output<String> microsoftTeamsWebhookUrl) {
            $.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }

        /**
         * @param microsoftTeamsWebhookUrl Microsoft Teams Webhook Uniform Resource Locator (URL) that MongoDB Cloud needs to send this notification via Microsoft Teams. Required if `type_name` is `MICROSOFT_TEAMS`. If the URL later becomes invalid, MongoDB Cloud sends an email to the project owners. If the key remains invalid, MongoDB Cloud removes it.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(String microsoftTeamsWebhookUrl) {
            return microsoftTeamsWebhookUrl(Output.of(microsoftTeamsWebhookUrl));
        }

        /**
         * @param mobileNumber Mobile number to which alert notifications are sent. Required for the SMS notifications type.
         * 
         * @return builder
         * 
         */
        public Builder mobileNumber(@Nullable Output<String> mobileNumber) {
            $.mobileNumber = mobileNumber;
            return this;
        }

        /**
         * @param mobileNumber Mobile number to which alert notifications are sent. Required for the SMS notifications type.
         * 
         * @return builder
         * 
         */
        public Builder mobileNumber(String mobileNumber) {
            return mobileNumber(Output.of(mobileNumber));
        }

        /**
         * @param opsGenieApiKey Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
         * 
         * @return builder
         * 
         */
        public Builder opsGenieApiKey(@Nullable Output<String> opsGenieApiKey) {
            $.opsGenieApiKey = opsGenieApiKey;
            return this;
        }

        /**
         * @param opsGenieApiKey Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
         * 
         * @return builder
         * 
         */
        public Builder opsGenieApiKey(String opsGenieApiKey) {
            return opsGenieApiKey(Output.of(opsGenieApiKey));
        }

        /**
         * @param opsGenieRegion Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
         * 
         * @return builder
         * 
         */
        public Builder opsGenieRegion(@Nullable Output<String> opsGenieRegion) {
            $.opsGenieRegion = opsGenieRegion;
            return this;
        }

        /**
         * @param opsGenieRegion Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
         * 
         * @return builder
         * 
         */
        public Builder opsGenieRegion(String opsGenieRegion) {
            return opsGenieRegion(Output.of(opsGenieRegion));
        }

        /**
         * @param orgName Flowdock organization name in lower-case letters. This is the name that appears after www.flowdock.com/app/ in the URL string. Required for the FLOWDOCK notifications type.
         * 
         * @return builder
         * 
         */
        public Builder orgName(@Nullable Output<String> orgName) {
            $.orgName = orgName;
            return this;
        }

        /**
         * @param orgName Flowdock organization name in lower-case letters. This is the name that appears after www.flowdock.com/app/ in the URL string. Required for the FLOWDOCK notifications type.
         * 
         * @return builder
         * 
         */
        public Builder orgName(String orgName) {
            return orgName(Output.of(orgName));
        }

        /**
         * @param roles Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param serviceKey PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(@Nullable Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        /**
         * @param serviceKey PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        /**
         * @param smsEnabled Flag indicating if text message notifications should be sent to this user&#39;s mobile phone. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * 
         * @return builder
         * 
         */
        public Builder smsEnabled(@Nullable Output<Boolean> smsEnabled) {
            $.smsEnabled = smsEnabled;
            return this;
        }

        /**
         * @param smsEnabled Flag indicating if text message notifications should be sent to this user&#39;s mobile phone. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
         * 
         * @return builder
         * 
         */
        public Builder smsEnabled(Boolean smsEnabled) {
            return smsEnabled(Output.of(smsEnabled));
        }

        /**
         * @param teamId Unique identifier of a team.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId Unique identifier of a team.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param teamName Label for the team that receives this notification.
         * 
         * @return builder
         * 
         */
        public Builder teamName(@Nullable Output<String> teamName) {
            $.teamName = teamName;
            return this;
        }

        /**
         * @param teamName Label for the team that receives this notification.
         * 
         * @return builder
         * 
         */
        public Builder teamName(String teamName) {
            return teamName(Output.of(teamName));
        }

        /**
         * @param typeName Type of alert notification.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        /**
         * @param typeName Type of alert notification.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        /**
         * @param username Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param victorOpsApiKey VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
         * 
         * @return builder
         * 
         */
        public Builder victorOpsApiKey(@Nullable Output<String> victorOpsApiKey) {
            $.victorOpsApiKey = victorOpsApiKey;
            return this;
        }

        /**
         * @param victorOpsApiKey VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
         * 
         * @return builder
         * 
         */
        public Builder victorOpsApiKey(String victorOpsApiKey) {
            return victorOpsApiKey(Output.of(victorOpsApiKey));
        }

        /**
         * @param victorOpsRoutingKey VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
         * 
         * @return builder
         * 
         */
        public Builder victorOpsRoutingKey(@Nullable Output<String> victorOpsRoutingKey) {
            $.victorOpsRoutingKey = victorOpsRoutingKey;
            return this;
        }

        /**
         * @param victorOpsRoutingKey VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
         * 
         * @return builder
         * 
         */
        public Builder victorOpsRoutingKey(String victorOpsRoutingKey) {
            return victorOpsRoutingKey(Output.of(victorOpsRoutingKey));
        }

        /**
         * @param webhookSecret Optional authentication secret for the `WEBHOOK` notifications type.
         * 
         * @return builder
         * 
         */
        public Builder webhookSecret(@Nullable Output<String> webhookSecret) {
            $.webhookSecret = webhookSecret;
            return this;
        }

        /**
         * @param webhookSecret Optional authentication secret for the `WEBHOOK` notifications type.
         * 
         * @return builder
         * 
         */
        public Builder webhookSecret(String webhookSecret) {
            return webhookSecret(Output.of(webhookSecret));
        }

        /**
         * @param webhookUrl Target URL  for the `WEBHOOK` notifications type.
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(@Nullable Output<String> webhookUrl) {
            $.webhookUrl = webhookUrl;
            return this;
        }

        /**
         * @param webhookUrl Target URL  for the `WEBHOOK` notifications type.
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(String webhookUrl) {
            return webhookUrl(Output.of(webhookUrl));
        }

        public AlertConfigurationNotificationArgs build() {
            return $;
        }
    }

}