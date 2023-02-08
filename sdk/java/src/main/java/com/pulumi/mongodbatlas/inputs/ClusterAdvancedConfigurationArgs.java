// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAdvancedConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAdvancedConfigurationArgs Empty = new ClusterAdvancedConfigurationArgs();

    /**
     * [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
     * 
     */
    @Import(name="defaultReadConcern")
    private @Nullable Output<String> defaultReadConcern;

    /**
     * @return [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
     * 
     */
    public Optional<Output<String>> defaultReadConcern() {
        return Optional.ofNullable(this.defaultReadConcern);
    }

    /**
     * [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     * 
     */
    @Import(name="defaultWriteConcern")
    private @Nullable Output<String> defaultWriteConcern;

    /**
     * @return [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     * 
     */
    public Optional<Output<String>> defaultWriteConcern() {
        return Optional.ofNullable(this.defaultWriteConcern);
    }

    /**
     * When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
     * 
     */
    @Import(name="failIndexKeyTooLong")
    private @Nullable Output<Boolean> failIndexKeyTooLong;

    /**
     * @return When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
     * 
     */
    public Optional<Output<Boolean>> failIndexKeyTooLong() {
        return Optional.ofNullable(this.failIndexKeyTooLong);
    }

    /**
     * When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     * 
     */
    @Import(name="javascriptEnabled")
    private @Nullable Output<Boolean> javascriptEnabled;

    /**
     * @return When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     * 
     */
    public Optional<Output<Boolean>> javascriptEnabled() {
        return Optional.ofNullable(this.javascriptEnabled);
    }

    /**
     * Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
     * 
     */
    @Import(name="minimumEnabledTlsProtocol")
    private @Nullable Output<String> minimumEnabledTlsProtocol;

    /**
     * @return Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
     * 
     */
    public Optional<Output<String>> minimumEnabledTlsProtocol() {
        return Optional.ofNullable(this.minimumEnabledTlsProtocol);
    }

    /**
     * When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     * 
     */
    @Import(name="noTableScan")
    private @Nullable Output<Boolean> noTableScan;

    /**
     * @return When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     * 
     */
    public Optional<Output<Boolean>> noTableScan() {
        return Optional.ofNullable(this.noTableScan);
    }

    /**
     * The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     * 
     */
    @Import(name="oplogSizeMb")
    private @Nullable Output<Integer> oplogSizeMb;

    /**
     * @return The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     * 
     */
    public Optional<Output<Integer>> oplogSizeMb() {
        return Optional.ofNullable(this.oplogSizeMb);
    }

    /**
     * Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    @Import(name="sampleRefreshIntervalBiConnector")
    private @Nullable Output<Integer> sampleRefreshIntervalBiConnector;

    /**
     * @return Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    public Optional<Output<Integer>> sampleRefreshIntervalBiConnector() {
        return Optional.ofNullable(this.sampleRefreshIntervalBiConnector);
    }

    /**
     * Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    @Import(name="sampleSizeBiConnector")
    private @Nullable Output<Integer> sampleSizeBiConnector;

    /**
     * @return Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    public Optional<Output<Integer>> sampleSizeBiConnector() {
        return Optional.ofNullable(this.sampleSizeBiConnector);
    }

    private ClusterAdvancedConfigurationArgs() {}

    private ClusterAdvancedConfigurationArgs(ClusterAdvancedConfigurationArgs $) {
        this.defaultReadConcern = $.defaultReadConcern;
        this.defaultWriteConcern = $.defaultWriteConcern;
        this.failIndexKeyTooLong = $.failIndexKeyTooLong;
        this.javascriptEnabled = $.javascriptEnabled;
        this.minimumEnabledTlsProtocol = $.minimumEnabledTlsProtocol;
        this.noTableScan = $.noTableScan;
        this.oplogSizeMb = $.oplogSizeMb;
        this.sampleRefreshIntervalBiConnector = $.sampleRefreshIntervalBiConnector;
        this.sampleSizeBiConnector = $.sampleSizeBiConnector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAdvancedConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAdvancedConfigurationArgs $;

        public Builder() {
            $ = new ClusterAdvancedConfigurationArgs();
        }

        public Builder(ClusterAdvancedConfigurationArgs defaults) {
            $ = new ClusterAdvancedConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultReadConcern [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
         * 
         * @return builder
         * 
         */
        public Builder defaultReadConcern(@Nullable Output<String> defaultReadConcern) {
            $.defaultReadConcern = defaultReadConcern;
            return this;
        }

        /**
         * @param defaultReadConcern [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
         * 
         * @return builder
         * 
         */
        public Builder defaultReadConcern(String defaultReadConcern) {
            return defaultReadConcern(Output.of(defaultReadConcern));
        }

        /**
         * @param defaultWriteConcern [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
         * 
         * @return builder
         * 
         */
        public Builder defaultWriteConcern(@Nullable Output<String> defaultWriteConcern) {
            $.defaultWriteConcern = defaultWriteConcern;
            return this;
        }

        /**
         * @param defaultWriteConcern [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
         * 
         * @return builder
         * 
         */
        public Builder defaultWriteConcern(String defaultWriteConcern) {
            return defaultWriteConcern(Output.of(defaultWriteConcern));
        }

        /**
         * @param failIndexKeyTooLong When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
         * 
         * @return builder
         * 
         */
        public Builder failIndexKeyTooLong(@Nullable Output<Boolean> failIndexKeyTooLong) {
            $.failIndexKeyTooLong = failIndexKeyTooLong;
            return this;
        }

        /**
         * @param failIndexKeyTooLong When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
         * 
         * @return builder
         * 
         */
        public Builder failIndexKeyTooLong(Boolean failIndexKeyTooLong) {
            return failIndexKeyTooLong(Output.of(failIndexKeyTooLong));
        }

        /**
         * @param javascriptEnabled When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
         * 
         * @return builder
         * 
         */
        public Builder javascriptEnabled(@Nullable Output<Boolean> javascriptEnabled) {
            $.javascriptEnabled = javascriptEnabled;
            return this;
        }

        /**
         * @param javascriptEnabled When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
         * 
         * @return builder
         * 
         */
        public Builder javascriptEnabled(Boolean javascriptEnabled) {
            return javascriptEnabled(Output.of(javascriptEnabled));
        }

        /**
         * @param minimumEnabledTlsProtocol Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder minimumEnabledTlsProtocol(@Nullable Output<String> minimumEnabledTlsProtocol) {
            $.minimumEnabledTlsProtocol = minimumEnabledTlsProtocol;
            return this;
        }

        /**
         * @param minimumEnabledTlsProtocol Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder minimumEnabledTlsProtocol(String minimumEnabledTlsProtocol) {
            return minimumEnabledTlsProtocol(Output.of(minimumEnabledTlsProtocol));
        }

        /**
         * @param noTableScan When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
         * 
         * @return builder
         * 
         */
        public Builder noTableScan(@Nullable Output<Boolean> noTableScan) {
            $.noTableScan = noTableScan;
            return this;
        }

        /**
         * @param noTableScan When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
         * 
         * @return builder
         * 
         */
        public Builder noTableScan(Boolean noTableScan) {
            return noTableScan(Output.of(noTableScan));
        }

        /**
         * @param oplogSizeMb The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
         * 
         * @return builder
         * 
         */
        public Builder oplogSizeMb(@Nullable Output<Integer> oplogSizeMb) {
            $.oplogSizeMb = oplogSizeMb;
            return this;
        }

        /**
         * @param oplogSizeMb The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
         * 
         * @return builder
         * 
         */
        public Builder oplogSizeMb(Integer oplogSizeMb) {
            return oplogSizeMb(Output.of(oplogSizeMb));
        }

        /**
         * @param sampleRefreshIntervalBiConnector Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
         * 
         * @return builder
         * 
         */
        public Builder sampleRefreshIntervalBiConnector(@Nullable Output<Integer> sampleRefreshIntervalBiConnector) {
            $.sampleRefreshIntervalBiConnector = sampleRefreshIntervalBiConnector;
            return this;
        }

        /**
         * @param sampleRefreshIntervalBiConnector Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
         * 
         * @return builder
         * 
         */
        public Builder sampleRefreshIntervalBiConnector(Integer sampleRefreshIntervalBiConnector) {
            return sampleRefreshIntervalBiConnector(Output.of(sampleRefreshIntervalBiConnector));
        }

        /**
         * @param sampleSizeBiConnector Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
         * 
         * @return builder
         * 
         */
        public Builder sampleSizeBiConnector(@Nullable Output<Integer> sampleSizeBiConnector) {
            $.sampleSizeBiConnector = sampleSizeBiConnector;
            return this;
        }

        /**
         * @param sampleSizeBiConnector Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
         * 
         * @return builder
         * 
         */
        public Builder sampleSizeBiConnector(Integer sampleSizeBiConnector) {
            return sampleSizeBiConnector(Output.of(sampleSizeBiConnector));
        }

        public ClusterAdvancedConfigurationArgs build() {
            return $;
        }
    }

}