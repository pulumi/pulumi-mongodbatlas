// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedClusterAdvancedConfiguration {
    /**
     * @return [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
     * 
     */
    private @Nullable String defaultReadConcern;
    /**
     * @return [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     * 
     */
    private @Nullable String defaultWriteConcern;
    /**
     * @return When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
     * 
     */
    private @Nullable Boolean failIndexKeyTooLong;
    /**
     * @return When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     * 
     */
    private @Nullable Boolean javascriptEnabled;
    /**
     * @return Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
     * 
     * - TLS1_0
     * - TLS1_1
     * - TLS1_2
     * 
     */
    private @Nullable String minimumEnabledTlsProtocol;
    /**
     * @return When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     * 
     */
    private @Nullable Boolean noTableScan;
    /**
     * @return Minimum retention window for cluster&#39;s oplog expressed in hours. A value of null indicates that the cluster uses the default minimum oplog window that MongoDB Cloud calculates.
     * * **Note**  A minimum oplog retention is required when seeking to change a cluster&#39;s class to Local NVMe SSD. To learn more and for latest guidance see [`oplogMinRetentionHours`](https://www.mongodb.com/docs/manual/core/replica-set-oplog/#std-label-replica-set-minimum-oplog-size)
     * 
     */
    private @Nullable Integer oplogMinRetentionHours;
    /**
     * @return The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     * 
     */
    private @Nullable Integer oplogSizeMb;
    /**
     * @return Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    private @Nullable Integer sampleRefreshIntervalBiConnector;
    /**
     * @return Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    private @Nullable Integer sampleSizeBiConnector;
    /**
     * @return Lifetime, in seconds, of multi-document transactions. Defaults to 60 seconds.
     * 
     */
    private @Nullable Integer transactionLifetimeLimitSeconds;

    private AdvancedClusterAdvancedConfiguration() {}
    /**
     * @return [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
     * 
     */
    public Optional<String> defaultReadConcern() {
        return Optional.ofNullable(this.defaultReadConcern);
    }
    /**
     * @return [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     * 
     */
    public Optional<String> defaultWriteConcern() {
        return Optional.ofNullable(this.defaultWriteConcern);
    }
    /**
     * @return When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
     * 
     */
    public Optional<Boolean> failIndexKeyTooLong() {
        return Optional.ofNullable(this.failIndexKeyTooLong);
    }
    /**
     * @return When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     * 
     */
    public Optional<Boolean> javascriptEnabled() {
        return Optional.ofNullable(this.javascriptEnabled);
    }
    /**
     * @return Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
     * 
     * - TLS1_0
     * - TLS1_1
     * - TLS1_2
     * 
     */
    public Optional<String> minimumEnabledTlsProtocol() {
        return Optional.ofNullable(this.minimumEnabledTlsProtocol);
    }
    /**
     * @return When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     * 
     */
    public Optional<Boolean> noTableScan() {
        return Optional.ofNullable(this.noTableScan);
    }
    /**
     * @return Minimum retention window for cluster&#39;s oplog expressed in hours. A value of null indicates that the cluster uses the default minimum oplog window that MongoDB Cloud calculates.
     * * **Note**  A minimum oplog retention is required when seeking to change a cluster&#39;s class to Local NVMe SSD. To learn more and for latest guidance see [`oplogMinRetentionHours`](https://www.mongodb.com/docs/manual/core/replica-set-oplog/#std-label-replica-set-minimum-oplog-size)
     * 
     */
    public Optional<Integer> oplogMinRetentionHours() {
        return Optional.ofNullable(this.oplogMinRetentionHours);
    }
    /**
     * @return The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     * 
     */
    public Optional<Integer> oplogSizeMb() {
        return Optional.ofNullable(this.oplogSizeMb);
    }
    /**
     * @return Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    public Optional<Integer> sampleRefreshIntervalBiConnector() {
        return Optional.ofNullable(this.sampleRefreshIntervalBiConnector);
    }
    /**
     * @return Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    public Optional<Integer> sampleSizeBiConnector() {
        return Optional.ofNullable(this.sampleSizeBiConnector);
    }
    /**
     * @return Lifetime, in seconds, of multi-document transactions. Defaults to 60 seconds.
     * 
     */
    public Optional<Integer> transactionLifetimeLimitSeconds() {
        return Optional.ofNullable(this.transactionLifetimeLimitSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedClusterAdvancedConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultReadConcern;
        private @Nullable String defaultWriteConcern;
        private @Nullable Boolean failIndexKeyTooLong;
        private @Nullable Boolean javascriptEnabled;
        private @Nullable String minimumEnabledTlsProtocol;
        private @Nullable Boolean noTableScan;
        private @Nullable Integer oplogMinRetentionHours;
        private @Nullable Integer oplogSizeMb;
        private @Nullable Integer sampleRefreshIntervalBiConnector;
        private @Nullable Integer sampleSizeBiConnector;
        private @Nullable Integer transactionLifetimeLimitSeconds;
        public Builder() {}
        public Builder(AdvancedClusterAdvancedConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultReadConcern = defaults.defaultReadConcern;
    	      this.defaultWriteConcern = defaults.defaultWriteConcern;
    	      this.failIndexKeyTooLong = defaults.failIndexKeyTooLong;
    	      this.javascriptEnabled = defaults.javascriptEnabled;
    	      this.minimumEnabledTlsProtocol = defaults.minimumEnabledTlsProtocol;
    	      this.noTableScan = defaults.noTableScan;
    	      this.oplogMinRetentionHours = defaults.oplogMinRetentionHours;
    	      this.oplogSizeMb = defaults.oplogSizeMb;
    	      this.sampleRefreshIntervalBiConnector = defaults.sampleRefreshIntervalBiConnector;
    	      this.sampleSizeBiConnector = defaults.sampleSizeBiConnector;
    	      this.transactionLifetimeLimitSeconds = defaults.transactionLifetimeLimitSeconds;
        }

        @CustomType.Setter
        public Builder defaultReadConcern(@Nullable String defaultReadConcern) {

            this.defaultReadConcern = defaultReadConcern;
            return this;
        }
        @CustomType.Setter
        public Builder defaultWriteConcern(@Nullable String defaultWriteConcern) {

            this.defaultWriteConcern = defaultWriteConcern;
            return this;
        }
        @CustomType.Setter
        public Builder failIndexKeyTooLong(@Nullable Boolean failIndexKeyTooLong) {

            this.failIndexKeyTooLong = failIndexKeyTooLong;
            return this;
        }
        @CustomType.Setter
        public Builder javascriptEnabled(@Nullable Boolean javascriptEnabled) {

            this.javascriptEnabled = javascriptEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder minimumEnabledTlsProtocol(@Nullable String minimumEnabledTlsProtocol) {

            this.minimumEnabledTlsProtocol = minimumEnabledTlsProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder noTableScan(@Nullable Boolean noTableScan) {

            this.noTableScan = noTableScan;
            return this;
        }
        @CustomType.Setter
        public Builder oplogMinRetentionHours(@Nullable Integer oplogMinRetentionHours) {

            this.oplogMinRetentionHours = oplogMinRetentionHours;
            return this;
        }
        @CustomType.Setter
        public Builder oplogSizeMb(@Nullable Integer oplogSizeMb) {

            this.oplogSizeMb = oplogSizeMb;
            return this;
        }
        @CustomType.Setter
        public Builder sampleRefreshIntervalBiConnector(@Nullable Integer sampleRefreshIntervalBiConnector) {

            this.sampleRefreshIntervalBiConnector = sampleRefreshIntervalBiConnector;
            return this;
        }
        @CustomType.Setter
        public Builder sampleSizeBiConnector(@Nullable Integer sampleSizeBiConnector) {

            this.sampleSizeBiConnector = sampleSizeBiConnector;
            return this;
        }
        @CustomType.Setter
        public Builder transactionLifetimeLimitSeconds(@Nullable Integer transactionLifetimeLimitSeconds) {

            this.transactionLifetimeLimitSeconds = transactionLifetimeLimitSeconds;
            return this;
        }
        public AdvancedClusterAdvancedConfiguration build() {
            final var _resultValue = new AdvancedClusterAdvancedConfiguration();
            _resultValue.defaultReadConcern = defaultReadConcern;
            _resultValue.defaultWriteConcern = defaultWriteConcern;
            _resultValue.failIndexKeyTooLong = failIndexKeyTooLong;
            _resultValue.javascriptEnabled = javascriptEnabled;
            _resultValue.minimumEnabledTlsProtocol = minimumEnabledTlsProtocol;
            _resultValue.noTableScan = noTableScan;
            _resultValue.oplogMinRetentionHours = oplogMinRetentionHours;
            _resultValue.oplogSizeMb = oplogSizeMb;
            _resultValue.sampleRefreshIntervalBiConnector = sampleRefreshIntervalBiConnector;
            _resultValue.sampleSizeBiConnector = sampleSizeBiConnector;
            _resultValue.transactionLifetimeLimitSeconds = transactionLifetimeLimitSeconds;
            return _resultValue;
        }
    }
}
