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
    public sealed class GetAlertConfigurationsResultNotificationResult
    {
        public readonly string ApiToken;
        public readonly string ChannelName;
        public readonly string DatadogApiKey;
        public readonly string DatadogRegion;
        public readonly int DelayMin;
        public readonly string EmailAddress;
        public readonly bool EmailEnabled;
        public readonly string FlowName;
        public readonly string FlowdockApiToken;
        public readonly int IntervalMin;
        public readonly string? MicrosoftTeamsWebhookUrl;
        public readonly string MobileNumber;
        public readonly string OpsGenieApiKey;
        public readonly string OpsGenieRegion;
        public readonly string OrgName;
        public readonly ImmutableArray<string> Roles;
        public readonly string ServiceKey;
        public readonly bool SmsEnabled;
        public readonly string TeamId;
        public readonly string TeamName;
        public readonly string TypeName;
        public readonly string Username;
        public readonly string VictorOpsApiKey;
        public readonly string VictorOpsRoutingKey;
        public readonly string? WebhookSecret;
        public readonly string? WebhookUrl;

        [OutputConstructor]
        private GetAlertConfigurationsResultNotificationResult(
            string apiToken,

            string channelName,

            string datadogApiKey,

            string datadogRegion,

            int delayMin,

            string emailAddress,

            bool emailEnabled,

            string flowName,

            string flowdockApiToken,

            int intervalMin,

            string? microsoftTeamsWebhookUrl,

            string mobileNumber,

            string opsGenieApiKey,

            string opsGenieRegion,

            string orgName,

            ImmutableArray<string> roles,

            string serviceKey,

            bool smsEnabled,

            string teamId,

            string teamName,

            string typeName,

            string username,

            string victorOpsApiKey,

            string victorOpsRoutingKey,

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
            FlowName = flowName;
            FlowdockApiToken = flowdockApiToken;
            IntervalMin = intervalMin;
            MicrosoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            MobileNumber = mobileNumber;
            OpsGenieApiKey = opsGenieApiKey;
            OpsGenieRegion = opsGenieRegion;
            OrgName = orgName;
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