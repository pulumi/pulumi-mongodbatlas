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
        public readonly string AccountId;
        /// <summary>
        /// Your API Key.
        /// </summary>
        public readonly string ApiKey;
        public readonly string ChannelName;
        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
        /// </summary>
        public readonly string? MicrosoftTeamsWebhookUrl;
        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        public readonly string ProjectId;
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

        [OutputConstructor]
        private GetThirdPartyIntegrationsResultResult(
            string accountId,

            string apiKey,

            string channelName,

            bool? enabled,

            string? microsoftTeamsWebhookUrl,

            string projectId,

            string region,

            string routingKey,

            string? scheme,

            string secret,

            string? serviceDiscovery,

            string serviceKey,

            string teamName,

            string type,

            string url,

            string? userName)
        {
            AccountId = accountId;
            ApiKey = apiKey;
            ChannelName = channelName;
            Enabled = enabled;
            MicrosoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            ProjectId = projectId;
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
        }
    }
}
