// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AdvancedClusterAdvancedConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/). **(DEPRECATED)** MongoDB 5.0 and later clusters default to `local`. To use a custom read concern level, please refer to your driver documentation.
        /// </summary>
        [Input("defaultReadConcern")]
        public Input<string>? DefaultReadConcern { get; set; }

        /// <summary>
        /// [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
        /// </summary>
        [Input("defaultWriteConcern")]
        public Input<string>? DefaultWriteConcern { get; set; }

        /// <summary>
        /// When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them. **(DEPRECATED)** This parameter has been removed as of [MongoDB 4.4](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.failIndexKeyTooLong).
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
        /// 
        /// - TLS1_0
        /// - TLS1_1
        /// - TLS1_2
        /// </summary>
        [Input("minimumEnabledTlsProtocol")]
        public Input<string>? MinimumEnabledTlsProtocol { get; set; }

        /// <summary>
        /// When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
        /// </summary>
        [Input("noTableScan")]
        public Input<bool>? NoTableScan { get; set; }

        /// <summary>
        /// Minimum retention window for cluster's oplog expressed in hours. A value of null indicates that the cluster uses the default minimum oplog window that MongoDB Cloud calculates.
        /// * **Note**  A minimum oplog retention is required when seeking to change a cluster's class to Local NVMe SSD. To learn more and for latest guidance see [`oplogMinRetentionHours`](https://www.mongodb.com/docs/manual/core/replica-set-oplog/#std-label-replica-set-minimum-oplog-size)
        /// </summary>
        [Input("oplogMinRetentionHours")]
        public Input<int>? OplogMinRetentionHours { get; set; }

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

        /// <summary>
        /// Lifetime, in seconds, of multi-document transactions. Defaults to 60 seconds.
        /// </summary>
        [Input("transactionLifetimeLimitSeconds")]
        public Input<int>? TransactionLifetimeLimitSeconds { get; set; }

        public AdvancedClusterAdvancedConfigurationGetArgs()
        {
        }
        public static new AdvancedClusterAdvancedConfigurationGetArgs Empty => new AdvancedClusterAdvancedConfigurationGetArgs();
    }
}
