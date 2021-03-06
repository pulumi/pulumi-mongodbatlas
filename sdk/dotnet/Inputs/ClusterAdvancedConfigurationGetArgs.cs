// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterAdvancedConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
        /// </summary>
        [Input("failIndexKeyTooLong")]
        public Input<bool>? FailIndexKeyTooLong { get; set; }

        /// <summary>
        /// When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
        /// </summary>
        [Input("javascriptEnabled")]
        public Input<bool>? JavascriptEnabled { get; set; }

        /// <summary>
        /// Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
        /// </summary>
        [Input("minimumEnabledTlsProtocol")]
        public Input<string>? MinimumEnabledTlsProtocol { get; set; }

        /// <summary>
        /// When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
        /// </summary>
        [Input("noTableScan")]
        public Input<bool>? NoTableScan { get; set; }

        /// <summary>
        /// The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
        /// </summary>
        [Input("oplogSizeMb")]
        public Input<int>? OplogSizeMb { get; set; }

        /// <summary>
        /// Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
        /// </summary>
        [Input("sampleRefreshIntervalBiConnector")]
        public Input<int>? SampleRefreshIntervalBiConnector { get; set; }

        /// <summary>
        /// Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
        /// </summary>
        [Input("sampleSizeBiConnector")]
        public Input<int>? SampleSizeBiConnector { get; set; }

        public ClusterAdvancedConfigurationGetArgs()
        {
        }
    }
}
