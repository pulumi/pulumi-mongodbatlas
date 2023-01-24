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
    public sealed class GetThirdPartyIntegrationsResultResult
    {
        /// <summary>
        /// Unique identifier of your New Relic account.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Your API Key.
        /// </summary>
        public readonly string ApiKey;
        /// <summary>
        /// Your API Token.
        /// </summary>
        public readonly string ApiToken;
        public readonly string ChannelName;
        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Your Flowdock Flow name.
        /// </summary>
        public readonly string FlowName;
        /// <summary>
        /// Your License Key.
        /// </summary>
        public readonly string LicenseKey;
        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
        /// </summary>
        public readonly string? MicrosoftTeamsWebhookUrl;
        /// <summary>
        /// Your Flowdock organization name.
        /// </summary>
        public readonly string OrgName;
        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Your Insights Query Key.
        /// </summary>
        public readonly string ReadToken;
        /// <summary>
        /// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// An optional field for your Routing Key.
        /// </summary>
        public readonly string RoutingKey;
        /// <summary>
        /// Your Prometheus protocol scheme configured for requests.
        /// </summary>
        public readonly string? Scheme;
        /// <summary>
        /// An optional field for your webhook secret.
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// Indicates which service discovery method is used, either file or http.
        /// </summary>
        public readonly string? ServiceDiscovery;
        /// <summary>
        /// Your Service Key.
        /// </summary>
        public readonly string ServiceKey;
        public readonly string TeamName;
        /// <summary>
        /// (Required) Thirt-Party service integration type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Your webhook URL.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Your Prometheus username.
        /// </summary>
        public readonly string? UserName;
        /// <summary>
        /// Your Insights Insert Key.
        /// </summary>
        public readonly string WriteToken;

        [OutputConstructor]
        private GetThirdPartyIntegrationsResultResult(
            string accountId,

            string apiKey,

            string apiToken,

            string channelName,

            bool? enabled,

            string flowName,

            string licenseKey,

            string? microsoftTeamsWebhookUrl,

            string orgName,

            string projectId,

            string readToken,

            string region,

            string routingKey,

            string? scheme,

            string secret,

            string? serviceDiscovery,

            string serviceKey,

            string teamName,

            string type,

            string url,

            string? userName,

            string writeToken)
        {
            AccountId = accountId;
            ApiKey = apiKey;
            ApiToken = apiToken;
            ChannelName = channelName;
            Enabled = enabled;
            FlowName = flowName;
            LicenseKey = licenseKey;
            MicrosoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            OrgName = orgName;
            ProjectId = projectId;
            ReadToken = readToken;
            Region = region;
            RoutingKey = routingKey;
            Scheme = scheme;
            Secret = secret;
            ServiceDiscovery = serviceDiscovery;
            ServiceKey = serviceKey;
            TeamName = teamName;
            Type = type;
            Url = url;
            UserName = userName;
            WriteToken = writeToken;
        }
    }
}
