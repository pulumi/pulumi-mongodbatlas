// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersResultAdvancedConfiguration {
    /**
     * @return (Optional) The minimum pre- and post-image retention time in seconds. This parameter is only supported for MongoDB version 6.0 and above. Defaults to `-1`(off).
     * 
     */
    private Integer changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
    /**
     * @return The custom OpenSSL cipher suite list for TLS 1.2. This field is only valid when `tls_cipher_config_mode` is set to `CUSTOM`.
     * 
     */
    private List<String> customOpensslCipherConfigTls12s;
    /**
     * @return Default time limit in milliseconds for individual read operations to complete. This option corresponds to the [defaultMaxTimeMS](https://www.mongodb.com/docs/upcoming/reference/cluster-parameters/defaultMaxTimeMS/) cluster parameter. This parameter is supported only for MongoDB version 8.0 and above.
     * 
     */
    private Integer defaultMaxTimeMs;
    /**
     * @return [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/). **(DEPRECATED)** MongoDB 5.0 and later clusters default to `local`. To use a custom read concern level, please refer to your driver documentation.
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    private String defaultReadConcern;
    /**
     * @return [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     * 
     */
    private String defaultWriteConcern;
    /**
     * @return When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them. **(DEPRECATED)** This parameter has been removed as of [MongoDB 4.4](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.failIndexKeyTooLong).
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    private Boolean failIndexKeyTooLong;
    /**
     * @return When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     * 
     */
    private Boolean javascriptEnabled;
    /**
     * @return Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections. Valid values are:
     * 
     */
    private String minimumEnabledTlsProtocol;
    /**
     * @return When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     * 
     */
    private Boolean noTableScan;
    /**
     * @return Minimum retention window for cluster&#39;s oplog expressed in hours. A value of null indicates that the cluster uses the default minimum oplog window that MongoDB Cloud calculates.
     * 
     */
    private Double oplogMinRetentionHours;
    /**
     * @return The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     * 
     */
    private Integer oplogSizeMb;
    /**
     * @return Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    private Integer sampleRefreshIntervalBiConnector;
    /**
     * @return Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    private Integer sampleSizeBiConnector;
    /**
     * @return The TLS cipher suite configuration mode. Valid values include `CUSTOM` or `DEFAULT`. The `DEFAULT` mode uses the default cipher suites. The `CUSTOM` mode allows you to specify custom cipher suites for both TLS 1.2 and TLS 1.3.
     * 
     */
    private String tlsCipherConfigMode;
    /**
     * @return (Optional) Lifetime, in seconds, of multi-document transactions. Defaults to 60 seconds.
     * 
     */
    private Integer transactionLifetimeLimitSeconds;

    private GetAdvancedClustersResultAdvancedConfiguration() {}
    /**
     * @return (Optional) The minimum pre- and post-image retention time in seconds. This parameter is only supported for MongoDB version 6.0 and above. Defaults to `-1`(off).
     * 
     */
    public Integer changeStreamOptionsPreAndPostImagesExpireAfterSeconds() {
        return this.changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
    }
    /**
     * @return The custom OpenSSL cipher suite list for TLS 1.2. This field is only valid when `tls_cipher_config_mode` is set to `CUSTOM`.
     * 
     */
    public List<String> customOpensslCipherConfigTls12s() {
        return this.customOpensslCipherConfigTls12s;
    }
    /**
     * @return Default time limit in milliseconds for individual read operations to complete. This option corresponds to the [defaultMaxTimeMS](https://www.mongodb.com/docs/upcoming/reference/cluster-parameters/defaultMaxTimeMS/) cluster parameter. This parameter is supported only for MongoDB version 8.0 and above.
     * 
     */
    public Integer defaultMaxTimeMs() {
        return this.defaultMaxTimeMs;
    }
    /**
     * @return [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/). **(DEPRECATED)** MongoDB 5.0 and later clusters default to `local`. To use a custom read concern level, please refer to your driver documentation.
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    public String defaultReadConcern() {
        return this.defaultReadConcern;
    }
    /**
     * @return [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     * 
     */
    public String defaultWriteConcern() {
        return this.defaultWriteConcern;
    }
    /**
     * @return When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them. **(DEPRECATED)** This parameter has been removed as of [MongoDB 4.4](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.failIndexKeyTooLong).
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    public Boolean failIndexKeyTooLong() {
        return this.failIndexKeyTooLong;
    }
    /**
     * @return When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     * 
     */
    public Boolean javascriptEnabled() {
        return this.javascriptEnabled;
    }
    /**
     * @return Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections. Valid values are:
     * 
     */
    public String minimumEnabledTlsProtocol() {
        return this.minimumEnabledTlsProtocol;
    }
    /**
     * @return When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     * 
     */
    public Boolean noTableScan() {
        return this.noTableScan;
    }
    /**
     * @return Minimum retention window for cluster&#39;s oplog expressed in hours. A value of null indicates that the cluster uses the default minimum oplog window that MongoDB Cloud calculates.
     * 
     */
    public Double oplogMinRetentionHours() {
        return this.oplogMinRetentionHours;
    }
    /**
     * @return The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     * 
     */
    public Integer oplogSizeMb() {
        return this.oplogSizeMb;
    }
    /**
     * @return Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    public Integer sampleRefreshIntervalBiConnector() {
        return this.sampleRefreshIntervalBiConnector;
    }
    /**
     * @return Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     * 
     */
    public Integer sampleSizeBiConnector() {
        return this.sampleSizeBiConnector;
    }
    /**
     * @return The TLS cipher suite configuration mode. Valid values include `CUSTOM` or `DEFAULT`. The `DEFAULT` mode uses the default cipher suites. The `CUSTOM` mode allows you to specify custom cipher suites for both TLS 1.2 and TLS 1.3.
     * 
     */
    public String tlsCipherConfigMode() {
        return this.tlsCipherConfigMode;
    }
    /**
     * @return (Optional) Lifetime, in seconds, of multi-document transactions. Defaults to 60 seconds.
     * 
     */
    public Integer transactionLifetimeLimitSeconds() {
        return this.transactionLifetimeLimitSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultAdvancedConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
        private List<String> customOpensslCipherConfigTls12s;
        private Integer defaultMaxTimeMs;
        private String defaultReadConcern;
        private String defaultWriteConcern;
        private Boolean failIndexKeyTooLong;
        private Boolean javascriptEnabled;
        private String minimumEnabledTlsProtocol;
        private Boolean noTableScan;
        private Double oplogMinRetentionHours;
        private Integer oplogSizeMb;
        private Integer sampleRefreshIntervalBiConnector;
        private Integer sampleSizeBiConnector;
        private String tlsCipherConfigMode;
        private Integer transactionLifetimeLimitSeconds;
        public Builder() {}
        public Builder(GetAdvancedClustersResultAdvancedConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeStreamOptionsPreAndPostImagesExpireAfterSeconds = defaults.changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
    	      this.customOpensslCipherConfigTls12s = defaults.customOpensslCipherConfigTls12s;
    	      this.defaultMaxTimeMs = defaults.defaultMaxTimeMs;
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
    	      this.tlsCipherConfigMode = defaults.tlsCipherConfigMode;
    	      this.transactionLifetimeLimitSeconds = defaults.transactionLifetimeLimitSeconds;
        }

        @CustomType.Setter
        public Builder changeStreamOptionsPreAndPostImagesExpireAfterSeconds(Integer changeStreamOptionsPreAndPostImagesExpireAfterSeconds) {
            if (changeStreamOptionsPreAndPostImagesExpireAfterSeconds == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "changeStreamOptionsPreAndPostImagesExpireAfterSeconds");
            }
            this.changeStreamOptionsPreAndPostImagesExpireAfterSeconds = changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder customOpensslCipherConfigTls12s(List<String> customOpensslCipherConfigTls12s) {
            if (customOpensslCipherConfigTls12s == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "customOpensslCipherConfigTls12s");
            }
            this.customOpensslCipherConfigTls12s = customOpensslCipherConfigTls12s;
            return this;
        }
        public Builder customOpensslCipherConfigTls12s(String... customOpensslCipherConfigTls12s) {
            return customOpensslCipherConfigTls12s(List.of(customOpensslCipherConfigTls12s));
        }
        @CustomType.Setter
        public Builder defaultMaxTimeMs(Integer defaultMaxTimeMs) {
            if (defaultMaxTimeMs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "defaultMaxTimeMs");
            }
            this.defaultMaxTimeMs = defaultMaxTimeMs;
            return this;
        }
        @CustomType.Setter
        public Builder defaultReadConcern(String defaultReadConcern) {
            if (defaultReadConcern == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "defaultReadConcern");
            }
            this.defaultReadConcern = defaultReadConcern;
            return this;
        }
        @CustomType.Setter
        public Builder defaultWriteConcern(String defaultWriteConcern) {
            if (defaultWriteConcern == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "defaultWriteConcern");
            }
            this.defaultWriteConcern = defaultWriteConcern;
            return this;
        }
        @CustomType.Setter
        public Builder failIndexKeyTooLong(Boolean failIndexKeyTooLong) {
            if (failIndexKeyTooLong == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "failIndexKeyTooLong");
            }
            this.failIndexKeyTooLong = failIndexKeyTooLong;
            return this;
        }
        @CustomType.Setter
        public Builder javascriptEnabled(Boolean javascriptEnabled) {
            if (javascriptEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "javascriptEnabled");
            }
            this.javascriptEnabled = javascriptEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder minimumEnabledTlsProtocol(String minimumEnabledTlsProtocol) {
            if (minimumEnabledTlsProtocol == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "minimumEnabledTlsProtocol");
            }
            this.minimumEnabledTlsProtocol = minimumEnabledTlsProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder noTableScan(Boolean noTableScan) {
            if (noTableScan == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "noTableScan");
            }
            this.noTableScan = noTableScan;
            return this;
        }
        @CustomType.Setter
        public Builder oplogMinRetentionHours(Double oplogMinRetentionHours) {
            if (oplogMinRetentionHours == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "oplogMinRetentionHours");
            }
            this.oplogMinRetentionHours = oplogMinRetentionHours;
            return this;
        }
        @CustomType.Setter
        public Builder oplogSizeMb(Integer oplogSizeMb) {
            if (oplogSizeMb == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "oplogSizeMb");
            }
            this.oplogSizeMb = oplogSizeMb;
            return this;
        }
        @CustomType.Setter
        public Builder sampleRefreshIntervalBiConnector(Integer sampleRefreshIntervalBiConnector) {
            if (sampleRefreshIntervalBiConnector == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "sampleRefreshIntervalBiConnector");
            }
            this.sampleRefreshIntervalBiConnector = sampleRefreshIntervalBiConnector;
            return this;
        }
        @CustomType.Setter
        public Builder sampleSizeBiConnector(Integer sampleSizeBiConnector) {
            if (sampleSizeBiConnector == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "sampleSizeBiConnector");
            }
            this.sampleSizeBiConnector = sampleSizeBiConnector;
            return this;
        }
        @CustomType.Setter
        public Builder tlsCipherConfigMode(String tlsCipherConfigMode) {
            if (tlsCipherConfigMode == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "tlsCipherConfigMode");
            }
            this.tlsCipherConfigMode = tlsCipherConfigMode;
            return this;
        }
        @CustomType.Setter
        public Builder transactionLifetimeLimitSeconds(Integer transactionLifetimeLimitSeconds) {
            if (transactionLifetimeLimitSeconds == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultAdvancedConfiguration", "transactionLifetimeLimitSeconds");
            }
            this.transactionLifetimeLimitSeconds = transactionLifetimeLimitSeconds;
            return this;
        }
        public GetAdvancedClustersResultAdvancedConfiguration build() {
            final var _resultValue = new GetAdvancedClustersResultAdvancedConfiguration();
            _resultValue.changeStreamOptionsPreAndPostImagesExpireAfterSeconds = changeStreamOptionsPreAndPostImagesExpireAfterSeconds;
            _resultValue.customOpensslCipherConfigTls12s = customOpensslCipherConfigTls12s;
            _resultValue.defaultMaxTimeMs = defaultMaxTimeMs;
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
            _resultValue.tlsCipherConfigMode = tlsCipherConfigMode;
            _resultValue.transactionLifetimeLimitSeconds = transactionLifetimeLimitSeconds;
            return _resultValue;
        }
    }
}
