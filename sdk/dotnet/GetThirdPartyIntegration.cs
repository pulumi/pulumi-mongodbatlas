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
        /// # Data Source: mongodbatlas.ThirdPartyIntegration
        /// 
        /// `mongodbatlas.ThirdPartyIntegration` describes a Third-Party Integration Settings for the given type.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testDatadog = new Mongodbatlas.ThirdPartyIntegration("test_datadog", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Type = "DATADOG",
        ///         ApiKey = "&lt;API-KEY&gt;",
        ///         Region = "&lt;REGION&gt;",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetThirdPartyIntegration.Invoke(new()
        ///     {
        ///         ProjectId = testDatadog.ProjectId,
        ///         Type = "DATADOG",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetThirdPartyIntegrationResult> InvokeAsync(GetThirdPartyIntegrationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetThirdPartyIntegrationResult>("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", args ?? new GetThirdPartyIntegrationArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.ThirdPartyIntegration
        /// 
        /// `mongodbatlas.ThirdPartyIntegration` describes a Third-Party Integration Settings for the given type.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testDatadog = new Mongodbatlas.ThirdPartyIntegration("test_datadog", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Type = "DATADOG",
        ///         ApiKey = "&lt;API-KEY&gt;",
        ///         Region = "&lt;REGION&gt;",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetThirdPartyIntegration.Invoke(new()
        ///     {
        ///         ProjectId = testDatadog.ProjectId,
        ///         Type = "DATADOG",
        ///     });
        /// 
        /// });
        /// ```
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
        /// * `PROMETHEUS`
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
        /// * OPS_GENIE
        /// * VICTOR_OPS
        /// * WEBHOOK
        /// * MICROSOFT_TEAMS
        /// * PROMETHEUS
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
        /// * `PROMETHEUS`
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
        /// * OPS_GENIE
        /// * VICTOR_OPS
        /// * WEBHOOK
        /// * MICROSOFT_TEAMS
        /// * PROMETHEUS
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
        /// Unique identifier of the integration.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
        /// * `PROMETHEUS`
        /// </summary>
        public readonly string? MicrosoftTeamsWebhookUrl;
        public readonly string ProjectId;
        /// <summary>
        /// Two-letter code that indicates which API URL to use. See the `region` response field of [MongoDB API Third-Party Service Integration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Third-Party-Integrations/operation/getThirdPartyIntegration) for more details. Opsgenie will use US by default.
        /// * `VICTOR_OPS`
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// An optional field for your Routing Key.
        /// * `WEBHOOK`
        /// </summary>
        public readonly string RoutingKey;
        /// <summary>
        /// An optional field for your webhook secret.
        /// * `MICROSOFT_TEAMS`
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// Indicates which service discovery method is used, either file or http.
        /// </summary>
        public readonly string? ServiceDiscovery;
        /// <summary>
        /// Your Service Key.
        /// * `DATADOG`
        /// </summary>
        public readonly string ServiceKey;
        public readonly string TeamName;
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

            string channelName,

            bool? enabled,

            string id,

            string? microsoftTeamsWebhookUrl,

            string projectId,

            string region,

            string routingKey,

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
            Id = id;
            MicrosoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            ProjectId = projectId;
            Region = region;
            RoutingKey = routingKey;
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
