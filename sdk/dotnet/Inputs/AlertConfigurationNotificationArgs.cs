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

        [Input("datadogApiKey")]
        private Input<string>? _datadogApiKey;
        public Input<string>? DatadogApiKey
        {
            get => _datadogApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _datadogApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("datadogRegion")]
        public Input<string>? DatadogRegion { get; set; }

        [Input("delayMin")]
        public Input<int>? DelayMin { get; set; }

        [Input("emailAddress")]
        public Input<string>? EmailAddress { get; set; }

        [Input("emailEnabled")]
        public Input<bool>? EmailEnabled { get; set; }

        [Input("intervalMin")]
        public Input<int>? IntervalMin { get; set; }

        [Input("microsoftTeamsWebhookUrl")]
        private Input<string>? _microsoftTeamsWebhookUrl;
        public Input<string>? MicrosoftTeamsWebhookUrl
        {
            get => _microsoftTeamsWebhookUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _microsoftTeamsWebhookUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("mobileNumber")]
        public Input<string>? MobileNumber { get; set; }

        [Input("notifierId")]
        public Input<string>? NotifierId { get; set; }

        [Input("opsGenieApiKey")]
        private Input<string>? _opsGenieApiKey;
        public Input<string>? OpsGenieApiKey
        {
            get => _opsGenieApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _opsGenieApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("opsGenieRegion")]
        public Input<string>? OpsGenieRegion { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("serviceKey")]
        private Input<string>? _serviceKey;
        public Input<string>? ServiceKey
        {
            get => _serviceKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("smsEnabled")]
        public Input<bool>? SmsEnabled { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        [Input("teamName")]
        public Input<string>? TeamName { get; set; }

        [Input("typeName", required: true)]
        public Input<string> TypeName { get; set; } = null!;

        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("victorOpsApiKey")]
        private Input<string>? _victorOpsApiKey;
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
