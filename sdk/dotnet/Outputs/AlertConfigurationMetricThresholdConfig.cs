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
    public sealed class AlertConfigurationMetricThresholdConfig
    {
        /// <summary>
        /// Name of the metric to check. The full list being quite large, please refer to atlas docs [here for general metrics](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types) and [here for serverless metrics](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-create-config/#serverless-measurements)
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// This must be set to AVERAGE. Atlas computes the current metric value as an average.
        /// </summary>
        public readonly string? Mode;
        public readonly string? Operator;
        public readonly double? Threshold;
        public readonly string? Units;

        [OutputConstructor]
        private AlertConfigurationMetricThresholdConfig(
            string metricName,

            string? mode,

            string? @operator,

            double? threshold,

            string? units)
        {
            MetricName = metricName;
            Mode = mode;
            Operator = @operator;
            Threshold = threshold;
            Units = units;
        }
    }
}
