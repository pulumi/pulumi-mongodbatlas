// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAlertConfiguration
    {
        /// <summary>
        /// `mongodbatlas.AlertConfiguration` describes an Alert Configuration.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// </summary>
        public static Task<GetAlertConfigurationResult> InvokeAsync(GetAlertConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlertConfigurationResult>("mongodbatlas:index/getAlertConfiguration:getAlertConfiguration", args ?? new GetAlertConfigurationArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.AlertConfiguration` describes an Alert Configuration.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
        /// </summary>
        public static Output<GetAlertConfigurationResult> Invoke(GetAlertConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlertConfigurationResult>("mongodbatlas:index/getAlertConfiguration:getAlertConfiguration", args ?? new GetAlertConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlertConfigurationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the alert configuration.
        /// </summary>
        [Input("alertConfigurationId", required: true)]
        public string AlertConfigurationId { get; set; } = null!;

        [Input("outputs")]
        private List<Inputs.GetAlertConfigurationOutputArgs>? _outputs;

        /// <summary>
        /// List of formatted output requested for this alert configuration
        /// * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
        /// </summary>
        public List<Inputs.GetAlertConfigurationOutputArgs> Outputs
        {
            get => _outputs ?? (_outputs = new List<Inputs.GetAlertConfigurationOutputArgs>());
            set => _outputs = value;
        }

        /// <summary>
        /// The ID of the project where the alert configuration will create.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetAlertConfigurationArgs()
        {
        }
        public static new GetAlertConfigurationArgs Empty => new GetAlertConfigurationArgs();
    }

    public sealed class GetAlertConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the alert configuration.
        /// </summary>
        [Input("alertConfigurationId", required: true)]
        public Input<string> AlertConfigurationId { get; set; } = null!;

        [Input("outputs")]
        private InputList<Inputs.GetAlertConfigurationOutputInputArgs>? _outputs;

        /// <summary>
        /// List of formatted output requested for this alert configuration
        /// * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
        /// </summary>
        public InputList<Inputs.GetAlertConfigurationOutputInputArgs> Outputs
        {
            get => _outputs ?? (_outputs = new InputList<Inputs.GetAlertConfigurationOutputInputArgs>());
            set => _outputs = value;
        }

        /// <summary>
        /// The ID of the project where the alert configuration will create.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetAlertConfigurationInvokeArgs()
        {
        }
        public static new GetAlertConfigurationInvokeArgs Empty => new GetAlertConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlertConfigurationResult
    {
        public readonly string AlertConfigurationId;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// If set to true, the alert configuration is enabled. If enabled is not exported it is set to false.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The type of event that will trigger an alert.
        /// </summary>
        public readonly string EventType;
        public readonly string Id;
        /// <summary>
        /// Rules to apply when matching an object against this alert configuration. See matchers.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlertConfigurationMatcherResult> Matchers;
        /// <summary>
        /// The threshold that causes an alert to be triggered. Required if `event_type_name` : `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See metric threshold config.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlertConfigurationMetricThresholdConfigResult> MetricThresholdConfigs;
        public readonly ImmutableArray<Outputs.GetAlertConfigurationNotificationResult> Notifications;
        public readonly ImmutableArray<Outputs.GetAlertConfigurationOutputResult> Outputs;
        public readonly string ProjectId;
        /// <summary>
        /// Threshold that triggers an alert. Required if `event_type_name` is any value other than `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See threshold config.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlertConfigurationThresholdConfigResult> ThresholdConfigs;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetAlertConfigurationResult(
            string alertConfigurationId,

            string created,

            bool enabled,

            string eventType,

            string id,

            ImmutableArray<Outputs.GetAlertConfigurationMatcherResult> matchers,

            ImmutableArray<Outputs.GetAlertConfigurationMetricThresholdConfigResult> metricThresholdConfigs,

            ImmutableArray<Outputs.GetAlertConfigurationNotificationResult> notifications,

            ImmutableArray<Outputs.GetAlertConfigurationOutputResult> outputs,

            string projectId,

            ImmutableArray<Outputs.GetAlertConfigurationThresholdConfigResult> thresholdConfigs,

            string updated)
        {
            AlertConfigurationId = alertConfigurationId;
            Created = created;
            Enabled = enabled;
            EventType = eventType;
            Id = id;
            Matchers = matchers;
            MetricThresholdConfigs = metricThresholdConfigs;
            Notifications = notifications;
            Outputs = outputs;
            ProjectId = projectId;
            ThresholdConfigs = thresholdConfigs;
            Updated = updated;
        }
    }
}
