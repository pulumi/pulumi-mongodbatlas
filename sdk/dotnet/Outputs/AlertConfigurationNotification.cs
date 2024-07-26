// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class AlertConfigurationNotification
    {
        /// <summary>
        /// Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
        /// </summary>
        public readonly string? ApiToken;
        /// <summary>
        /// Slack channel name. Required for the SLACK notifications type.
        /// </summary>
        public readonly string? ChannelName;
        /// <summary>
        /// Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
        /// </summary>
        public readonly string? DatadogApiKey;
        /// <summary>
        /// Region that indicates which API URL to use. See the `datadogRegion` field in the `notifications` request parameter of [MongoDB API Alert Configuration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) for more details. The default Datadog region is US.
        /// </summary>
        public readonly string? DatadogRegion;
        /// <summary>
        /// Number of minutes to wait after an alert condition is detected before sending out the first notification.
        /// </summary>
        public readonly int? DelayMin;
        /// <summary>
        /// Email address to which alert notifications are sent. Required for the EMAIL notifications type.
        /// </summary>
        public readonly string? EmailAddress;
        /// <summary>
        /// Flag indicating email notifications should be sent. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
        /// </summary>
        public readonly bool? EmailEnabled;
        /// <summary>
        /// The ID of the associated integration, the credentials of which to use for requests.
        /// </summary>
        public readonly string? IntegrationId;
        /// <summary>
        /// Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
        /// </summary>
        public readonly int? IntervalMin;
        /// <summary>
        /// Microsoft Teams Webhook Uniform Resource Locator (URL) that MongoDB Cloud needs to send this notification via Microsoft Teams. Required if `type_name` is `MICROSOFT_TEAMS`. If the URL later becomes invalid, MongoDB Cloud sends an email to the project owners. If the key remains invalid, MongoDB Cloud removes it.
        /// </summary>
        public readonly string? MicrosoftTeamsWebhookUrl;
        /// <summary>
        /// Mobile number to which alert notifications are sent. Required for the SMS notifications type.
        /// </summary>
        public readonly string? MobileNumber;
        /// <summary>
        /// The notifier ID is a system-generated unique identifier assigned to each notification method. This is needed when updating third-party notifications without requiring explicit authentication credentials.
        /// </summary>
        public readonly string? NotifierId;
        /// <summary>
        /// Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
        /// </summary>
        public readonly string? OpsGenieApiKey;
        /// <summary>
        /// Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
        /// </summary>
        public readonly string? OpsGenieRegion;
        /// <summary>
        /// Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
        /// Accepted values are:
        /// 
        /// | Project roles                   | Organization roles  |
        /// |:----------                      |:-----------         |
        /// | `GROUP_CLUSTER_MANAGER`         | `ORG_OWNER`         |
        /// | `GROUP_DATA_ACCESS_ADMIN`       | `ORG_MEMBER`        |
        /// | `GROUP_DATA_ACCESS_READ_ONLY`   | `ORG_GROUP_CREATOR` |
        /// | `GROUP_DATA_ACCESS_READ_WRITE`  | `ORG_BILLING_ADMIN` |
        /// | `GROUP_OWNER`                   | `ORG_READ_ONLY`     |
        /// | `GROUP_READ_ONLY`               |                     |
        /// </summary>
        public readonly ImmutableArray<string> Roles;
        /// <summary>
        /// PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
        /// </summary>
        public readonly string? ServiceKey;
        /// <summary>
        /// Flag indicating if text message notifications should be sent to this user's mobile phone. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
        /// </summary>
        public readonly bool? SmsEnabled;
        /// <summary>
        /// Unique identifier of a team.
        /// </summary>
        public readonly string? TeamId;
        /// <summary>
        /// Label for the team that receives this notification.
        /// </summary>
        public readonly string? TeamName;
        /// <summary>
        /// Type of alert notification.
        /// Accepted values are:
        /// - `DATADOG`
        /// - `EMAIL`
        /// - `GROUP` (Project)
        /// - `OPS_GENIE`
        /// - `ORG`
        /// - `PAGER_DUTY`
        /// - `SLACK`
        /// - `SMS`
        /// - `TEAM`
        /// - `USER`
        /// - `VICTOR_OPS`
        /// - `WEBHOOK`
        /// - `MICROSOFT_TEAMS`
        /// </summary>
        public readonly string TypeName;
        /// <summary>
        /// Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
        /// </summary>
        public readonly string? VictorOpsApiKey;
        /// <summary>
        /// VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
        /// </summary>
        public readonly string? VictorOpsRoutingKey;
        /// <summary>
        /// Optional authentication secret for the `WEBHOOK` notifications type.
        /// </summary>
        public readonly string? WebhookSecret;
        /// <summary>
        /// Target URL  for the `WEBHOOK` notifications type.
        /// </summary>
        public readonly string? WebhookUrl;

        [OutputConstructor]
        private AlertConfigurationNotification(
            string? apiToken,

            string? channelName,

            string? datadogApiKey,

            string? datadogRegion,

            int? delayMin,

            string? emailAddress,

            bool? emailEnabled,

            string? integrationId,

            int? intervalMin,

            string? microsoftTeamsWebhookUrl,

            string? mobileNumber,

            string? notifierId,

            string? opsGenieApiKey,

            string? opsGenieRegion,

            ImmutableArray<string> roles,

            string? serviceKey,

            bool? smsEnabled,

            string? teamId,

            string? teamName,

            string typeName,

            string? username,

            string? victorOpsApiKey,

            string? victorOpsRoutingKey,

            string? webhookSecret,

            string? webhookUrl)
        {
            ApiToken = apiToken;
            ChannelName = channelName;
            DatadogApiKey = datadogApiKey;
            DatadogRegion = datadogRegion;
            DelayMin = delayMin;
            EmailAddress = emailAddress;
            EmailEnabled = emailEnabled;
            IntegrationId = integrationId;
            IntervalMin = intervalMin;
            MicrosoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            MobileNumber = mobileNumber;
            NotifierId = notifierId;
            OpsGenieApiKey = opsGenieApiKey;
            OpsGenieRegion = opsGenieRegion;
            Roles = roles;
            ServiceKey = serviceKey;
            SmsEnabled = smsEnabled;
            TeamId = teamId;
            TeamName = teamName;
            TypeName = typeName;
            Username = username;
            VictorOpsApiKey = victorOpsApiKey;
            VictorOpsRoutingKey = victorOpsRoutingKey;
            WebhookSecret = webhookSecret;
            WebhookUrl = webhookUrl;
        }
    }
}
