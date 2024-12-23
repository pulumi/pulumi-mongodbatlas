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
    public sealed class GetClusterAdvancedConfigurationResult
    {
        /// <summary>
        /// (Optional) The minimum pre- and post-image retention time in seconds. This parameter is only supported for MongoDB version 6.0 and above. Defaults to `-1`(off).
        /// </summary>
        public readonly int ChangeStreamOptionsPreAndPostImagesExpireAfterSeconds;
        /// <summary>
        /// The custom OpenSSL cipher suite list for TLS 1.2. This field is only valid when `tls_cipher_config_mode` is set to `CUSTOM`.
        /// </summary>
        public readonly ImmutableArray<string> CustomOpensslCipherConfigTls12s;
        public readonly int DefaultMaxTimeMs;
        /// <summary>
        /// [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
        /// </summary>
        public readonly string DefaultReadConcern;
        /// <summary>
        /// [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
        /// </summary>
        public readonly string DefaultWriteConcern;
        /// <summary>
        /// When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
        /// </summary>
        public readonly bool FailIndexKeyTooLong;
        /// <summary>
        /// When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
        /// </summary>
        public readonly bool JavascriptEnabled;
        /// <summary>
        /// Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
        /// </summary>
        public readonly string MinimumEnabledTlsProtocol;
        /// <summary>
        /// When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
        /// </summary>
        public readonly bool NoTableScan;
        /// <summary>
        /// Minimum retention window for cluster's oplog expressed in hours. A value of null indicates that the cluster uses the default minimum oplog window that MongoDB Cloud calculates.
        /// </summary>
        public readonly double OplogMinRetentionHours;
        /// <summary>
        /// The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
        /// </summary>
        public readonly int OplogSizeMb;
        /// <summary>
        /// Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
        /// </summary>
        public readonly int SampleRefreshIntervalBiConnector;
        /// <summary>
        /// Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
        /// </summary>
        public readonly int SampleSizeBiConnector;
        /// <summary>
        /// The TLS cipher suite configuration mode. Valid values include `CUSTOM` or `DEFAULT`. The `DEFAULT` mode uses the default cipher suites. The `CUSTOM` mode allows you to specify custom cipher suites for both TLS 1.2 and TLS 1.3.
        /// </summary>
        public readonly string TlsCipherConfigMode;
        /// <summary>
        /// Lifetime, in seconds, of multi-document transactions. Defaults to 60 seconds.
        /// </summary>
        public readonly int TransactionLifetimeLimitSeconds;

        [OutputConstructor]
        private GetClusterAdvancedConfigurationResult(
            int changeStreamOptionsPreAndPostImagesExpireAfterSeconds,

            ImmutableArray<string> customOpensslCipherConfigTls12s,

            int defaultMaxTimeMs,

            string defaultReadConcern,

            string defaultWriteConcern,

            bool failIndexKeyTooLong,

            bool javascriptEnabled,

            string minimumEnabledTlsProtocol,

            bool noTableScan,

            double oplogMinRetentionHours,

            int oplogSizeMb,

            int sampleRefreshIntervalBiConnector,

            int sampleSizeBiConnector,

            string tlsCipherConfigMode,

            int transactionLifetimeLimitSeconds)
        {
            ChangeStreamOptionsPreAndPostImagesExpireAfterSeconds = changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
            CustomOpensslCipherConfigTls12s = customOpensslCipherConfigTls12s;
            DefaultMaxTimeMs = defaultMaxTimeMs;
            DefaultReadConcern = defaultReadConcern;
            DefaultWriteConcern = defaultWriteConcern;
            FailIndexKeyTooLong = failIndexKeyTooLong;
            JavascriptEnabled = javascriptEnabled;
            MinimumEnabledTlsProtocol = minimumEnabledTlsProtocol;
            NoTableScan = noTableScan;
            OplogMinRetentionHours = oplogMinRetentionHours;
            OplogSizeMb = oplogSizeMb;
            SampleRefreshIntervalBiConnector = sampleRefreshIntervalBiConnector;
            SampleSizeBiConnector = sampleSizeBiConnector;
            TlsCipherConfigMode = tlsCipherConfigMode;
            TransactionLifetimeLimitSeconds = transactionLifetimeLimitSeconds;
        }
    }
}
