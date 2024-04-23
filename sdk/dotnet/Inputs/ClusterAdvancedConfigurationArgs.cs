// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterAdvancedConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultReadConcern")]
        public Input<string>? DefaultReadConcern { get; set; }

        [Input("defaultWriteConcern")]
        public Input<string>? DefaultWriteConcern { get; set; }

        [Input("failIndexKeyTooLong")]
        public Input<bool>? FailIndexKeyTooLong { get; set; }

        [Input("javascriptEnabled")]
        public Input<bool>? JavascriptEnabled { get; set; }

        [Input("minimumEnabledTlsProtocol")]
        public Input<string>? MinimumEnabledTlsProtocol { get; set; }

        [Input("noTableScan")]
        public Input<bool>? NoTableScan { get; set; }

        [Input("oplogMinRetentionHours")]
        public Input<int>? OplogMinRetentionHours { get; set; }

        [Input("oplogSizeMb")]
        public Input<int>? OplogSizeMb { get; set; }

        [Input("sampleRefreshIntervalBiConnector")]
        public Input<int>? SampleRefreshIntervalBiConnector { get; set; }

        [Input("sampleSizeBiConnector")]
        public Input<int>? SampleSizeBiConnector { get; set; }

        [Input("transactionLifetimeLimitSeconds")]
        public Input<int>? TransactionLifetimeLimitSeconds { get; set; }

        public ClusterAdvancedConfigurationArgs()
        {
        }
        public static new ClusterAdvancedConfigurationArgs Empty => new ClusterAdvancedConfigurationArgs();
    }
}
