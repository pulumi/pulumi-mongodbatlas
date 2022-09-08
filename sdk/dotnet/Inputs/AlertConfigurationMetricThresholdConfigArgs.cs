// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AlertConfigurationMetricThresholdConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the metric to check. The full list being quite large, please refer to atlas docs [here for general metrics](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types) and [here for serverless metrics](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-create-config/#serverless-measurements)
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// This must be set to AVERAGE. Atlas computes the current metric value as an average.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Operator to apply when checking the current metric value against the threshold value.
        /// Accepted values are:
        /// - `GREATER_THAN`
        /// - `LESS_THAN`
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// Threshold value outside of which an alert will be triggered.
        /// </summary>
        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        /// <summary>
        /// The units for the threshold value. Depends on the type of metric.
        /// Accepted values are:
        /// - `RAW`
        /// - `BITS`
        /// - `BYTES`
        /// - `KILOBITS`
        /// - `KILOBYTES`
        /// - `MEGABITS`
        /// - `MEGABYTES`
        /// - `GIGABITS`
        /// - `GIGABYTES`
        /// - `TERABYTES`
        /// - `PETABYTES`
        /// - `MILLISECONDS`
        /// - `SECONDS`
        /// - `MINUTES`
        /// - `HOURS`
        /// - `DAYS`
        /// </summary>
        [Input("units")]
        public Input<string>? Units { get; set; }

        public AlertConfigurationMetricThresholdConfigArgs()
        {
        }
        public static new AlertConfigurationMetricThresholdConfigArgs Empty => new AlertConfigurationMetricThresholdConfigArgs();
    }
}
