// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetThirdPartyIntegration
    {
        /// <summary>
        /// `mongodbatlas.ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetThirdPartyIntegrationResult> InvokeAsync(GetThirdPartyIntegrationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetThirdPartyIntegrationResult>("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", args ?? new GetThirdPartyIntegrationArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Output<GetThirdPartyIntegrationResult> Invoke(GetThirdPartyIntegrationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetThirdPartyIntegrationResult>("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", args ?? new GetThirdPartyIntegrationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetThirdPartyIntegrationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("microsoftTeamsWebhookUrl")]
        private string? _microsoftTeamsWebhookUrl;

        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
        /// </summary>
        public string? MicrosoftTeamsWebhookUrl
        {
            get => _microsoftTeamsWebhookUrl;
            set => _microsoftTeamsWebhookUrl = value;
        }

        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Your Prometheus protocol scheme configured for requests.
        /// </summary>
        [Input("scheme")]
        public string? Scheme { get; set; }

        [Input("serviceDiscovery")]
        private string? _serviceDiscovery;

        /// <summary>
        /// Indicates which service discovery method is used, either file or http.
        /// </summary>
        public string? ServiceDiscovery
        {
            get => _serviceDiscovery;
            set => _serviceDiscovery = value;
        }

        /// <summary>
        /// Third-Party service integration type
        /// * PAGER_DUTY
        /// * DATADOG
        /// * NEW_RELIC*
        /// * OPS_GENIE
        /// * VICTOR_OPS
        /// * FLOWDOCK*
        /// * WEBHOOK
        /// * MICROSOFT_TEAMS
        /// * PROMETHEUS
        /// 
        /// *resource is now deprecated and will be removed in the next major version, 1.9.0
        /// **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        [Input("userName")]
        private string? _userName;

        /// <summary>
        /// Your Prometheus username.
        /// </summary>
        public string? UserName
        {
            get => _userName;
            set => _userName = value;
        }

        public GetThirdPartyIntegrationArgs()
        {
        }
        public static new GetThirdPartyIntegrationArgs Empty => new GetThirdPartyIntegrationArgs();
    }

    public sealed class GetThirdPartyIntegrationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("microsoftTeamsWebhookUrl")]
        private Input<string>? _microsoftTeamsWebhookUrl;

        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
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
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Your Prometheus protocol scheme configured for requests.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("serviceDiscovery")]
        private Input<string>? _serviceDiscovery;

        /// <summary>
        /// Indicates which service discovery method is used, either file or http.
        /// </summary>
        public Input<string>? ServiceDiscovery
        {
            get => _serviceDiscovery;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceDiscovery = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Third-Party service integration type
        /// * PAGER_DUTY
        /// * DATADOG
        /// * NEW_RELIC*
        /// * OPS_GENIE
        /// * VICTOR_OPS
        /// * FLOWDOCK*
        /// * WEBHOOK
        /// * MICROSOFT_TEAMS
        /// * PROMETHEUS
        /// 
        /// *resource is now deprecated and will be removed in the next major version, 1.9.0
        /// **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("userName")]
        private Input<string>? _userName;

        /// <summary>
        /// Your Prometheus username.
        /// </summary>
        public Input<string>? UserName
        {
            get => _userName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _userName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public GetThirdPartyIntegrationInvokeArgs()
        {
        }
        public static new GetThirdPartyIntegrationInvokeArgs Empty => new GetThirdPartyIntegrationInvokeArgs();
    }


    [OutputType]
    public sealed class GetThirdPartyIntegrationResult
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
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Your License Key.
        /// </summary>
        public readonly string LicenseKey;
        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
        /// </summary>
        public readonly string? MicrosoftTeamsWebhookUrl;
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
        /// Property equal to its own integration type
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
        private GetThirdPartyIntegrationResult(
            string accountId,

            string apiKey,

            string apiToken,

            string channelName,

            bool? enabled,

            string id,

            string licenseKey,

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
            ApiToken = apiToken;
            ChannelName = channelName;
            Enabled = enabled;
            Id = id;
            LicenseKey = licenseKey;
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
