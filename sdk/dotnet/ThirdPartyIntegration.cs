// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.ThirdPartyIntegration` Provides a Third-Party Integration Settings for the given type.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
    /// 
    /// &gt; **WARNING:** This field type has values (NEW_RELIC, FLOWDOCK) that are deprecated and will be removed in 1.9.0 release release
    /// 
    /// &gt; **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)
    /// 
    /// &gt; **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.
    /// 
    /// &gt; **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.
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
    ///     var testFlowdock = new Mongodbatlas.ThirdPartyIntegration("testFlowdock", new()
    ///     {
    ///         ApiToken = "&lt;API-TOKEN&gt;",
    ///         FlowName = "&lt;FLOW-NAME&gt;",
    ///         OrgName = "&lt;ORG-NAME&gt;",
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         Type = "FLOWDOCK",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration my_user 1112222b3bf99403840e8934-OPS_GENIE
    /// ```
    /// 
    ///  See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration")]
    public partial class ThirdPartyIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique identifier of your New Relic account.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Your API Key.
        /// </summary>
        [Output("apiKey")]
        public Output<string?> ApiKey { get; private set; } = null!;

        /// <summary>
        /// Your API Token.
        /// </summary>
        [Output("apiToken")]
        public Output<string?> ApiToken { get; private set; } = null!;

        [Output("channelName")]
        public Output<string?> ChannelName { get; private set; } = null!;

        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Your Flowdock Flow name.
        /// </summary>
        [Output("flowName")]
        public Output<string?> FlowName { get; private set; } = null!;

        /// <summary>
        /// Your License Key.
        /// </summary>
        [Output("licenseKey")]
        public Output<string?> LicenseKey { get; private set; } = null!;

        /// <summary>
        /// Your Microsoft Teams incoming webhook URL.
        /// </summary>
        [Output("microsoftTeamsWebhookUrl")]
        public Output<string?> MicrosoftTeamsWebhookUrl { get; private set; } = null!;

        /// <summary>
        /// Your Flowdock organization name.
        /// </summary>
        [Output("orgName")]
        public Output<string?> OrgName { get; private set; } = null!;

        /// <summary>
        /// Your Prometheus password.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Your Insights Query Key.
        /// </summary>
        [Output("readToken")]
        public Output<string?> ReadToken { get; private set; } = null!;

        /// <summary>
        /// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// An optional field for your Routing Key.
        /// </summary>
        [Output("routingKey")]
        public Output<string?> RoutingKey { get; private set; } = null!;

        /// <summary>
        /// Your Prometheus protocol scheme configured for requests.
        /// </summary>
        [Output("scheme")]
        public Output<string?> Scheme { get; private set; } = null!;

        /// <summary>
        /// An optional field for your webhook secret.
        /// </summary>
        [Output("secret")]
        public Output<string?> Secret { get; private set; } = null!;

        /// <summary>
        /// Indicates which service discovery method is used, either file or http.
        /// </summary>
        [Output("serviceDiscovery")]
        public Output<string?> ServiceDiscovery { get; private set; } = null!;

        /// <summary>
        /// Your Service Key.
        /// </summary>
        [Output("serviceKey")]
        public Output<string?> ServiceKey { get; private set; } = null!;

        [Output("teamName")]
        public Output<string?> TeamName { get; private set; } = null!;

        /// <summary>
        /// Third-Party Integration Settings type 
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
        /// 
        /// Additional values based on Type
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Your webhook URL.
        /// </summary>
        [Output("url")]
        public Output<string?> Url { get; private set; } = null!;

        /// <summary>
        /// Your Prometheus username.
        /// </summary>
        [Output("userName")]
        public Output<string?> UserName { get; private set; } = null!;

        /// <summary>
        /// Your Insights Insert Key.
        /// </summary>
        [Output("writeToken")]
        public Output<string?> WriteToken { get; private set; } = null!;


        /// <summary>
        /// Create a ThirdPartyIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ThirdPartyIntegration(string name, ThirdPartyIntegrationArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration", name, args ?? new ThirdPartyIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ThirdPartyIntegration(string name, Input<string> id, ThirdPartyIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "apiKey",
                    "apiToken",
                    "licenseKey",
                    "microsoftTeamsWebhookUrl",
                    "password",
                    "readToken",
                    "routingKey",
                    "secret",
                    "serviceDiscovery",
                    "serviceKey",
                    "userName",
                    "writeToken",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ThirdPartyIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ThirdPartyIntegration Get(string name, Input<string> id, ThirdPartyIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ThirdPartyIntegration(name, id, state, options);
        }
    }

    public sealed class ThirdPartyIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of your New Relic account.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// Your API Key.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiToken")]
        private Input<string>? _apiToken;

        /// <summary>
        /// Your API Token.
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

        [Input("channelName")]
        public Input<string>? ChannelName { get; set; }

        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Your Flowdock Flow name.
        /// </summary>
        [Input("flowName")]
        public Input<string>? FlowName { get; set; }

        [Input("licenseKey")]
        private Input<string>? _licenseKey;

        /// <summary>
        /// Your License Key.
        /// </summary>
        public Input<string>? LicenseKey
        {
            get => _licenseKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _licenseKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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
        /// Your Flowdock organization name.
        /// </summary>
        [Input("orgName")]
        public Input<string>? OrgName { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Your Prometheus password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("readToken")]
        private Input<string>? _readToken;

        /// <summary>
        /// Your Insights Query Key.
        /// </summary>
        public Input<string>? ReadToken
        {
            get => _readToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _readToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("routingKey")]
        private Input<string>? _routingKey;

        /// <summary>
        /// An optional field for your Routing Key.
        /// </summary>
        public Input<string>? RoutingKey
        {
            get => _routingKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _routingKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Your Prometheus protocol scheme configured for requests.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// An optional field for your webhook secret.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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

        [Input("serviceKey")]
        private Input<string>? _serviceKey;

        /// <summary>
        /// Your Service Key.
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

        [Input("teamName")]
        public Input<string>? TeamName { get; set; }

        /// <summary>
        /// Third-Party Integration Settings type 
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
        /// 
        /// Additional values based on Type
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Your webhook URL.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

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

        [Input("writeToken")]
        private Input<string>? _writeToken;

        /// <summary>
        /// Your Insights Insert Key.
        /// </summary>
        public Input<string>? WriteToken
        {
            get => _writeToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _writeToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ThirdPartyIntegrationArgs()
        {
        }
        public static new ThirdPartyIntegrationArgs Empty => new ThirdPartyIntegrationArgs();
    }

    public sealed class ThirdPartyIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of your New Relic account.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// Your API Key.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiToken")]
        private Input<string>? _apiToken;

        /// <summary>
        /// Your API Token.
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

        [Input("channelName")]
        public Input<string>? ChannelName { get; set; }

        /// <summary>
        /// Whether your cluster has Prometheus enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Your Flowdock Flow name.
        /// </summary>
        [Input("flowName")]
        public Input<string>? FlowName { get; set; }

        [Input("licenseKey")]
        private Input<string>? _licenseKey;

        /// <summary>
        /// Your License Key.
        /// </summary>
        public Input<string>? LicenseKey
        {
            get => _licenseKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _licenseKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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
        /// Your Flowdock organization name.
        /// </summary>
        [Input("orgName")]
        public Input<string>? OrgName { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Your Prometheus password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("readToken")]
        private Input<string>? _readToken;

        /// <summary>
        /// Your Insights Query Key.
        /// </summary>
        public Input<string>? ReadToken
        {
            get => _readToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _readToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("routingKey")]
        private Input<string>? _routingKey;

        /// <summary>
        /// An optional field for your Routing Key.
        /// </summary>
        public Input<string>? RoutingKey
        {
            get => _routingKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _routingKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Your Prometheus protocol scheme configured for requests.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// An optional field for your webhook secret.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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

        [Input("serviceKey")]
        private Input<string>? _serviceKey;

        /// <summary>
        /// Your Service Key.
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

        [Input("teamName")]
        public Input<string>? TeamName { get; set; }

        /// <summary>
        /// Third-Party Integration Settings type 
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
        /// 
        /// Additional values based on Type
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Your webhook URL.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

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

        [Input("writeToken")]
        private Input<string>? _writeToken;

        /// <summary>
        /// Your Insights Insert Key.
        /// </summary>
        public Input<string>? WriteToken
        {
            get => _writeToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _writeToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ThirdPartyIntegrationState()
        {
        }
        public static new ThirdPartyIntegrationState Empty => new ThirdPartyIntegrationState();
    }
}
