// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationNotification {
    /**
     * @return Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    private String apiToken;
    /**
     * @return Slack channel name. Required for the SLACK notifications type.
     * 
     */
    private String channelName;
    /**
     * @return Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
     * 
     */
    private String datadogApiKey;
    /**
     * @return Region that indicates which API URL to use. See the `datadogRegion` field in the `notifications` request parameter of [MongoDB API Alert Configuration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) for more details. The default Datadog region is US.
     * 
     */
    private String datadogRegion;
    /**
     * @return Number of minutes to wait after an alert condition is detected before sending out the first notification.
     * 
     */
    private Integer delayMin;
    /**
     * @return Email address to which alert notifications are sent. Required for the EMAIL notifications type.
     * 
     */
    private String emailAddress;
    /**
     * @return Flag indicating email notifications should be sent. Atlas returns this value if `type_name` is set  to `ORG`, `GROUP`, or `USER`.
     * 
     */
    private Boolean emailEnabled;
    /**
     * @return The ID of the associated integration, the credentials of which to use for requests.
     * 
     */
    private String integrationId;
    /**
     * @return Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5.
     * 
     */
    private Integer intervalMin;
    /**
     * @return Microsoft Teams channel incoming webhook URL. Required for the `MICROSOFT_TEAMS` notifications type.
     * 
     */
    private String microsoftTeamsWebhookUrl;
    /**
     * @return Mobile number to which alert notifications are sent. Required for the SMS notifications type.
     * 
     */
    private String mobileNumber;
    /**
     * @return The notifier ID is a system-generated unique identifier assigned to each notification method. This is needed when updating third-party notifications without requiring explicit authentication credentials.
     * 
     */
    private String notifierId;
    /**
     * @return Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    private String opsGenieApiKey;
    /**
     * @return Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
     * 
     */
    private String opsGenieRegion;
    /**
     * @return Atlas role in current Project or Organization. Atlas returns this value if you set `type_name` to `ORG` or `GROUP`.
     * 
     */
    private List<String> roles;
    /**
     * @return PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    private String serviceKey;
    /**
     * @return Flag indicating text notifications should be sent. Atlas returns this value if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * 
     */
    private Boolean smsEnabled;
    /**
     * @return Unique identifier of a team.
     * 
     */
    private String teamId;
    /**
     * @return Label for the team that receives this notification.
     * 
     */
    private String teamName;
    /**
     * @return Type of alert notification.
     * Accepted values are:
     * - `DATADOG`
     * - `EMAIL`
     * - `GROUP` (Project)
     * - `OPS_GENIE`
     * - `ORG`
     * - `PAGER_DUTY`
     * - `SLACK`
     * - `SMS`
     * - `TEAM`
     * - `USER`
     * - `VICTOR_OPS`
     * - `WEBHOOK`
     * - `MICROSOFT_TEAMS`
     * 
     */
    private String typeName;
    /**
     * @return Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
     * 
     */
    private String username;
    /**
     * @return VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    private String victorOpsApiKey;
    /**
     * @return VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    private String victorOpsRoutingKey;
    /**
     * @return Authentication secret for the `WEBHOOK` notifications type.
     * 
     */
    private String webhookSecret;
    /**
     * @return Target URL  for the `WEBHOOK` notifications type.
     * 
     */
    private String webhookUrl;

    private GetAlertConfigurationNotification() {}
    /**
     * @return Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    public String apiToken() {
        return this.apiToken;
    }
    /**
     * @return Slack channel name. Required for the SLACK notifications type.
     * 
     */
    public String channelName() {
        return this.channelName;
    }
    /**
     * @return Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
     * 
     */
    public String datadogApiKey() {
        return this.datadogApiKey;
    }
    /**
     * @return Region that indicates which API URL to use. See the `datadogRegion` field in the `notifications` request parameter of [MongoDB API Alert Configuration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) for more details. The default Datadog region is US.
     * 
     */
    public String datadogRegion() {
        return this.datadogRegion;
    }
    /**
     * @return Number of minutes to wait after an alert condition is detected before sending out the first notification.
     * 
     */
    public Integer delayMin() {
        return this.delayMin;
    }
    /**
     * @return Email address to which alert notifications are sent. Required for the EMAIL notifications type.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return Flag indicating email notifications should be sent. Atlas returns this value if `type_name` is set  to `ORG`, `GROUP`, or `USER`.
     * 
     */
    public Boolean emailEnabled() {
        return this.emailEnabled;
    }
    /**
     * @return The ID of the associated integration, the credentials of which to use for requests.
     * 
     */
    public String integrationId() {
        return this.integrationId;
    }
    /**
     * @return Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5.
     * 
     */
    public Integer intervalMin() {
        return this.intervalMin;
    }
    /**
     * @return Microsoft Teams channel incoming webhook URL. Required for the `MICROSOFT_TEAMS` notifications type.
     * 
     */
    public String microsoftTeamsWebhookUrl() {
        return this.microsoftTeamsWebhookUrl;
    }
    /**
     * @return Mobile number to which alert notifications are sent. Required for the SMS notifications type.
     * 
     */
    public String mobileNumber() {
        return this.mobileNumber;
    }
    /**
     * @return The notifier ID is a system-generated unique identifier assigned to each notification method. This is needed when updating third-party notifications without requiring explicit authentication credentials.
     * 
     */
    public String notifierId() {
        return this.notifierId;
    }
    /**
     * @return Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     * 
     */
    public String opsGenieApiKey() {
        return this.opsGenieApiKey;
    }
    /**
     * @return Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
     * 
     */
    public String opsGenieRegion() {
        return this.opsGenieRegion;
    }
    /**
     * @return Atlas role in current Project or Organization. Atlas returns this value if you set `type_name` to `ORG` or `GROUP`.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }
    /**
     * @return PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    public String serviceKey() {
        return this.serviceKey;
    }
    /**
     * @return Flag indicating text notifications should be sent. Atlas returns this value if `type_name` is set to `ORG`, `GROUP`, or `USER`.
     * 
     */
    public Boolean smsEnabled() {
        return this.smsEnabled;
    }
    /**
     * @return Unique identifier of a team.
     * 
     */
    public String teamId() {
        return this.teamId;
    }
    /**
     * @return Label for the team that receives this notification.
     * 
     */
    public String teamName() {
        return this.teamName;
    }
    /**
     * @return Type of alert notification.
     * Accepted values are:
     * - `DATADOG`
     * - `EMAIL`
     * - `GROUP` (Project)
     * - `OPS_GENIE`
     * - `ORG`
     * - `PAGER_DUTY`
     * - `SLACK`
     * - `SMS`
     * - `TEAM`
     * - `USER`
     * - `VICTOR_OPS`
     * - `WEBHOOK`
     * - `MICROSOFT_TEAMS`
     * 
     */
    public String typeName() {
        return this.typeName;
    }
    /**
     * @return Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
     * 
     */
    public String username() {
        return this.username;
    }
    /**
     * @return VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    public String victorOpsApiKey() {
        return this.victorOpsApiKey;
    }
    /**
     * @return VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     * 
     */
    public String victorOpsRoutingKey() {
        return this.victorOpsRoutingKey;
    }
    /**
     * @return Authentication secret for the `WEBHOOK` notifications type.
     * 
     */
    public String webhookSecret() {
        return this.webhookSecret;
    }
    /**
     * @return Target URL  for the `WEBHOOK` notifications type.
     * 
     */
    public String webhookUrl() {
        return this.webhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertConfigurationNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiToken;
        private String channelName;
        private String datadogApiKey;
        private String datadogRegion;
        private Integer delayMin;
        private String emailAddress;
        private Boolean emailEnabled;
        private String integrationId;
        private Integer intervalMin;
        private String microsoftTeamsWebhookUrl;
        private String mobileNumber;
        private String notifierId;
        private String opsGenieApiKey;
        private String opsGenieRegion;
        private List<String> roles;
        private String serviceKey;
        private Boolean smsEnabled;
        private String teamId;
        private String teamName;
        private String typeName;
        private String username;
        private String victorOpsApiKey;
        private String victorOpsRoutingKey;
        private String webhookSecret;
        private String webhookUrl;
        public Builder() {}
        public Builder(GetAlertConfigurationNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiToken = defaults.apiToken;
    	      this.channelName = defaults.channelName;
    	      this.datadogApiKey = defaults.datadogApiKey;
    	      this.datadogRegion = defaults.datadogRegion;
    	      this.delayMin = defaults.delayMin;
    	      this.emailAddress = defaults.emailAddress;
    	      this.emailEnabled = defaults.emailEnabled;
    	      this.integrationId = defaults.integrationId;
    	      this.intervalMin = defaults.intervalMin;
    	      this.microsoftTeamsWebhookUrl = defaults.microsoftTeamsWebhookUrl;
    	      this.mobileNumber = defaults.mobileNumber;
    	      this.notifierId = defaults.notifierId;
    	      this.opsGenieApiKey = defaults.opsGenieApiKey;
    	      this.opsGenieRegion = defaults.opsGenieRegion;
    	      this.roles = defaults.roles;
    	      this.serviceKey = defaults.serviceKey;
    	      this.smsEnabled = defaults.smsEnabled;
    	      this.teamId = defaults.teamId;
    	      this.teamName = defaults.teamName;
    	      this.typeName = defaults.typeName;
    	      this.username = defaults.username;
    	      this.victorOpsApiKey = defaults.victorOpsApiKey;
    	      this.victorOpsRoutingKey = defaults.victorOpsRoutingKey;
    	      this.webhookSecret = defaults.webhookSecret;
    	      this.webhookUrl = defaults.webhookUrl;
        }

        @CustomType.Setter
        public Builder apiToken(String apiToken) {
            if (apiToken == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "apiToken");
            }
            this.apiToken = apiToken;
            return this;
        }
        @CustomType.Setter
        public Builder channelName(String channelName) {
            if (channelName == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "channelName");
            }
            this.channelName = channelName;
            return this;
        }
        @CustomType.Setter
        public Builder datadogApiKey(String datadogApiKey) {
            if (datadogApiKey == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "datadogApiKey");
            }
            this.datadogApiKey = datadogApiKey;
            return this;
        }
        @CustomType.Setter
        public Builder datadogRegion(String datadogRegion) {
            if (datadogRegion == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "datadogRegion");
            }
            this.datadogRegion = datadogRegion;
            return this;
        }
        @CustomType.Setter
        public Builder delayMin(Integer delayMin) {
            if (delayMin == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "delayMin");
            }
            this.delayMin = delayMin;
            return this;
        }
        @CustomType.Setter
        public Builder emailAddress(String emailAddress) {
            if (emailAddress == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "emailAddress");
            }
            this.emailAddress = emailAddress;
            return this;
        }
        @CustomType.Setter
        public Builder emailEnabled(Boolean emailEnabled) {
            if (emailEnabled == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "emailEnabled");
            }
            this.emailEnabled = emailEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder integrationId(String integrationId) {
            if (integrationId == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "integrationId");
            }
            this.integrationId = integrationId;
            return this;
        }
        @CustomType.Setter
        public Builder intervalMin(Integer intervalMin) {
            if (intervalMin == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "intervalMin");
            }
            this.intervalMin = intervalMin;
            return this;
        }
        @CustomType.Setter
        public Builder microsoftTeamsWebhookUrl(String microsoftTeamsWebhookUrl) {
            if (microsoftTeamsWebhookUrl == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "microsoftTeamsWebhookUrl");
            }
            this.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }
        @CustomType.Setter
        public Builder mobileNumber(String mobileNumber) {
            if (mobileNumber == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "mobileNumber");
            }
            this.mobileNumber = mobileNumber;
            return this;
        }
        @CustomType.Setter
        public Builder notifierId(String notifierId) {
            if (notifierId == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "notifierId");
            }
            this.notifierId = notifierId;
            return this;
        }
        @CustomType.Setter
        public Builder opsGenieApiKey(String opsGenieApiKey) {
            if (opsGenieApiKey == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "opsGenieApiKey");
            }
            this.opsGenieApiKey = opsGenieApiKey;
            return this;
        }
        @CustomType.Setter
        public Builder opsGenieRegion(String opsGenieRegion) {
            if (opsGenieRegion == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "opsGenieRegion");
            }
            this.opsGenieRegion = opsGenieRegion;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder serviceKey(String serviceKey) {
            if (serviceKey == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "serviceKey");
            }
            this.serviceKey = serviceKey;
            return this;
        }
        @CustomType.Setter
        public Builder smsEnabled(Boolean smsEnabled) {
            if (smsEnabled == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "smsEnabled");
            }
            this.smsEnabled = smsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder teamId(String teamId) {
            if (teamId == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "teamId");
            }
            this.teamId = teamId;
            return this;
        }
        @CustomType.Setter
        public Builder teamName(String teamName) {
            if (teamName == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "teamName");
            }
            this.teamName = teamName;
            return this;
        }
        @CustomType.Setter
        public Builder typeName(String typeName) {
            if (typeName == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "typeName");
            }
            this.typeName = typeName;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "username");
            }
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder victorOpsApiKey(String victorOpsApiKey) {
            if (victorOpsApiKey == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "victorOpsApiKey");
            }
            this.victorOpsApiKey = victorOpsApiKey;
            return this;
        }
        @CustomType.Setter
        public Builder victorOpsRoutingKey(String victorOpsRoutingKey) {
            if (victorOpsRoutingKey == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "victorOpsRoutingKey");
            }
            this.victorOpsRoutingKey = victorOpsRoutingKey;
            return this;
        }
        @CustomType.Setter
        public Builder webhookSecret(String webhookSecret) {
            if (webhookSecret == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "webhookSecret");
            }
            this.webhookSecret = webhookSecret;
            return this;
        }
        @CustomType.Setter
        public Builder webhookUrl(String webhookUrl) {
            if (webhookUrl == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationNotification", "webhookUrl");
            }
            this.webhookUrl = webhookUrl;
            return this;
        }
        public GetAlertConfigurationNotification build() {
            final var _resultValue = new GetAlertConfigurationNotification();
            _resultValue.apiToken = apiToken;
            _resultValue.channelName = channelName;
            _resultValue.datadogApiKey = datadogApiKey;
            _resultValue.datadogRegion = datadogRegion;
            _resultValue.delayMin = delayMin;
            _resultValue.emailAddress = emailAddress;
            _resultValue.emailEnabled = emailEnabled;
            _resultValue.integrationId = integrationId;
            _resultValue.intervalMin = intervalMin;
            _resultValue.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            _resultValue.mobileNumber = mobileNumber;
            _resultValue.notifierId = notifierId;
            _resultValue.opsGenieApiKey = opsGenieApiKey;
            _resultValue.opsGenieRegion = opsGenieRegion;
            _resultValue.roles = roles;
            _resultValue.serviceKey = serviceKey;
            _resultValue.smsEnabled = smsEnabled;
            _resultValue.teamId = teamId;
            _resultValue.teamName = teamName;
            _resultValue.typeName = typeName;
            _resultValue.username = username;
            _resultValue.victorOpsApiKey = victorOpsApiKey;
            _resultValue.victorOpsRoutingKey = victorOpsRoutingKey;
            _resultValue.webhookSecret = webhookSecret;
            _resultValue.webhookUrl = webhookUrl;
            return _resultValue;
        }
    }
}
