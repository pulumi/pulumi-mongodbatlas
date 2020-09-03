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
            => Pulumi.Deployment.Instance.InvokeAsync<GetAlertConfigurationResult>("mongodbatlas:index/getAlertConfiguration:getAlertConfiguration", args ?? new GetAlertConfigurationArgs(), options.WithVersion());
    }


    public sealed class GetAlertConfigurationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the alert configuration.
        /// </summary>
        [Input("alertConfigurationId", required: true)]
        public string AlertConfigurationId { get; set; } = null!;

        /// <summary>
        /// The ID of the project where the alert configuration will create.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetAlertConfigurationArgs()
        {
        }
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
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetAlertConfigurationMatcherResult> Matchers;
        public readonly Outputs.GetAlertConfigurationMetricThresholdResult MetricThreshold;
        public readonly ImmutableArray<Outputs.GetAlertConfigurationNotificationResult> Notifications;
        public readonly string ProjectId;
        /// <summary>
        /// Threshold value outside of which an alert will be triggered.
        /// </summary>
        public readonly Outputs.GetAlertConfigurationThresholdResult Threshold;
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

            Outputs.GetAlertConfigurationMetricThresholdResult metricThreshold,

            ImmutableArray<Outputs.GetAlertConfigurationNotificationResult> notifications,

            string projectId,

            Outputs.GetAlertConfigurationThresholdResult threshold,

            string updated)
        {
            AlertConfigurationId = alertConfigurationId;
            Created = created;
            Enabled = enabled;
            EventType = eventType;
            Id = id;
            Matchers = matchers;
            MetricThreshold = metricThreshold;
            Notifications = notifications;
            ProjectId = projectId;
            Threshold = threshold;
            Updated = updated;
        }
    }
}
