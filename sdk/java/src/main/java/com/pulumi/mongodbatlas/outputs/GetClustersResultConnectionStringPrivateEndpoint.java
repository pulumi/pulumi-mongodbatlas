// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetClustersResultConnectionStringPrivateEndpointEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersResultConnectionStringPrivateEndpoint {
    private String connectionString;
    private List<GetClustersResultConnectionStringPrivateEndpointEndpoint> endpoints;
    private String srvConnectionString;
    private String srvShardOptimizedConnectionString;
    private String type;

    private GetClustersResultConnectionStringPrivateEndpoint() {}
    public String connectionString() {
        return this.connectionString;
    }
    public List<GetClustersResultConnectionStringPrivateEndpointEndpoint> endpoints() {
        return this.endpoints;
    }
    public String srvConnectionString() {
        return this.srvConnectionString;
    }
    public String srvShardOptimizedConnectionString() {
        return this.srvShardOptimizedConnectionString;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResultConnectionStringPrivateEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionString;
        private List<GetClustersResultConnectionStringPrivateEndpointEndpoint> endpoints;
        private String srvConnectionString;
        private String srvShardOptimizedConnectionString;
        private String type;
        public Builder() {}
        public Builder(GetClustersResultConnectionStringPrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.endpoints = defaults.endpoints;
    	      this.srvConnectionString = defaults.srvConnectionString;
    	      this.srvShardOptimizedConnectionString = defaults.srvShardOptimizedConnectionString;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("GetClustersResultConnectionStringPrivateEndpoint", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(List<GetClustersResultConnectionStringPrivateEndpointEndpoint> endpoints) {
            if (endpoints == null) {
              throw new MissingRequiredPropertyException("GetClustersResultConnectionStringPrivateEndpoint", "endpoints");
            }
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(GetClustersResultConnectionStringPrivateEndpointEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder srvConnectionString(String srvConnectionString) {
            if (srvConnectionString == null) {
              throw new MissingRequiredPropertyException("GetClustersResultConnectionStringPrivateEndpoint", "srvConnectionString");
            }
            this.srvConnectionString = srvConnectionString;
            return this;
        }
        @CustomType.Setter
        public Builder srvShardOptimizedConnectionString(String srvShardOptimizedConnectionString) {
            if (srvShardOptimizedConnectionString == null) {
              throw new MissingRequiredPropertyException("GetClustersResultConnectionStringPrivateEndpoint", "srvShardOptimizedConnectionString");
            }
            this.srvShardOptimizedConnectionString = srvShardOptimizedConnectionString;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetClustersResultConnectionStringPrivateEndpoint", "type");
            }
            this.type = type;
            return this;
        }
        public GetClustersResultConnectionStringPrivateEndpoint build() {
            final var _resultValue = new GetClustersResultConnectionStringPrivateEndpoint();
            _resultValue.connectionString = connectionString;
            _resultValue.endpoints = endpoints;
            _resultValue.srvConnectionString = srvConnectionString;
            _resultValue.srvShardOptimizedConnectionString = srvShardOptimizedConnectionString;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
