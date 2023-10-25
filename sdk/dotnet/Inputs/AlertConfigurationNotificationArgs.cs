// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AlertConfigurationNotificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiToken")]
        private Input<string>? _apiToken;

        /// <summary>
        /// Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
        /// </summary>
        public Input<string>? ApiToken
        {
            get => _apiToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Slack channel name. Required for the SLACK notifications type.
        /// </summary>
        [Input("channelName")]
        public Input<string>? ChannelName { get; set; }

        [Input("datadogApiKey")]
        private Input<string>? _datadogApiKey;

        /// <summary>
        /// Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
        /// </summary>
        public Input<string>? DatadogApiKey
        {
            get => _datadogApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _datadogApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Region that indicates which API URL to use. Accepted regions are: `US`, `EU`. The default Datadog region is US.
        /// </summary>
        [Input("datadogRegion")]
        public Input<string>? DatadogRegion { get; set; }

        /// <summary>
        /// Number of minutes to wait after an alert condition is detected before sending out the first notification.
        /// </summary>
        [Input("delayMin")]
        public Input<int>? DelayMin { get; set; }

        /// <summary>
        /// Email address to which alert notifications are sent. Required for the EMAIL notifications type.
        /// </summary>
        [Input("emailAddress")]
        public Input<string>? EmailAddress { get; set; }

        /// <summary>
        /// Flag indicating email notifications should be sent. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
        /// </summary>
        [Input("emailEnabled")]
        public Input<bool>? EmailEnabled { get; set; }

        /// <summary>
        /// Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
        /// </summary>
        [Input("intervalMin")]
        public Input<int>? IntervalMin { get; set; }

        [Input("microsoftTeamsWebhookUrl")]
        private Input<string>? _microsoftTeamsWebhookUrl;

        /// <summary>
        /// Microsoft Teams Webhook Uniform Resource Locator (URL) that MongoDB Cloud needs to send this notification via Microsoft Teams. Required if `type_name` is `MICROSOFT_TEAMS`. If the URL later becomes invalid, MongoDB Cloud sends an email to the project owners. If the key remains invalid, MongoDB Cloud removes it.
        /// </summary>
        public Input<string>? MicrosoftTeamsWebhookUrl
        {
            get => _microsoftTeamsWebhookUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _microsoftTeamsWebhookUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Mobile number to which alert notifications are sent. Required for the SMS notifications type.
        /// </summary>
        [Input("mobileNumber")]
        public Input<string>? MobileNumber { get; set; }

        /// <summary>
        /// The notifier id is a system-generated unique identifier assigned to each notification method. This is needed when updating third-party notifications without requiring explicit authentication credentials.
        /// </summary>
        [Input("notifierId")]
        public Input<string>? NotifierId { get; set; }

        [Input("opsGenieApiKey")]
        private Input<string>? _opsGenieApiKey;

        /// <summary>
        /// Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
        /// </summary>
        public Input<string>? OpsGenieApiKey
        {
            get => _opsGenieApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _opsGenieApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
        /// </summary>
        [Input("opsGenieRegion")]
        public Input<string>? OpsGenieRegion { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
        /// Accepted values are:
        /// 
        /// | Project roles                   | Organization roles  |
        /// |:----------                      |:-----------         |
        /// | `GROUP_CHARTS_ADMIN`            | `ORG_OWNER`         |
        /// | `GROUP_CLUSTER_MANAGER`         | `ORG_MEMBER`        |
        /// | `GROUP_DATA_ACCESS_ADMIN`       | `ORG_GROUP_CREATOR` |
        /// | `GROUP_DATA_ACCESS_READ_ONLY`   | `ORG_BILLING_ADMIN` |
        /// | `GROUP_DATA_ACCESS_READ_WRITE`  | `ORG_READ_ONLY`     |
        /// | `GROUP_OWNER`                   |                     |
        /// | `GROUP_READ_ONLY`               |                     |
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("serviceKey")]
        private Input<string>? _serviceKey;

        /// <summary>
        /// PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
        /// </summary>
        public Input<string>? ServiceKey
        {
            get => _serviceKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Flag indicating if text message notifications should be sent to this user's mobile phone. This flag is only valid if `type_name` is set to `ORG`, `GROUP`, or `USER`.
        /// </summary>
        [Input("smsEnabled")]
        public Input<bool>? SmsEnabled { get; set; }

        /// <summary>
        /// Unique identifier of a team.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        /// <summary>
        /// Label for the team that receives this notification.
        /// </summary>
        [Input("teamName")]
        public Input<string>? TeamName { get; set; }

        /// <summary>
        /// Type of alert notification.
        /// Accepted values are:
        /// </summary>
        [Input("typeName", required: true)]
        public Input<string> TypeName { get; set; } = null!;

        /// <summary>
        /// Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("victorOpsApiKey")]
        private Input<string>? _victorOpsApiKey;

        /// <summary>
        /// VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
        /// </summary>
        public Input<string>? VictorOpsApiKey
        {
            get => _victorOpsApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _victorOpsApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("victorOpsRoutingKey")]
        private Input<string>? _victorOpsRoutingKey;

        /// <summary>
        /// VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
        /// </summary>
        public Input<string>? VictorOpsRoutingKey
        {
            get => _victorOpsRoutingKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _victorOpsRoutingKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("webhookSecret")]
        private Input<string>? _webhookSecret;

        /// <summary>
        /// Optional authentication secret for the `WEBHOOK` notifications type.
        /// </summary>
        public Input<string>? WebhookSecret
        {
            get => _webhookSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _webhookSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("webhookUrl")]
        private Input<string>? _webhookUrl;

        /// <summary>
        /// Target URL  for the `WEBHOOK` notifications type.
        /// </summary>
        public Input<string>? WebhookUrl
        {
            get => _webhookUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _webhookUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public AlertConfigurationNotificationArgs()
        {
        }
        public static new AlertConfigurationNotificationArgs Empty => new AlertConfigurationNotificationArgs();
    }
}
