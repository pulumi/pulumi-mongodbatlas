// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.ClusterConnectionStringPrivateEndpointEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterConnectionStringPrivateEndpoint {
    private @Nullable String connectionString;
    private @Nullable List<ClusterConnectionStringPrivateEndpointEndpoint> endpoints;
    private @Nullable String srvConnectionString;
    private @Nullable String srvShardOptimizedConnectionString;
    private @Nullable String type;

    private ClusterConnectionStringPrivateEndpoint() {}
    public Optional<String> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    public List<ClusterConnectionStringPrivateEndpointEndpoint> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    public Optional<String> srvConnectionString() {
        return Optional.ofNullable(this.srvConnectionString);
    }
    public Optional<String> srvShardOptimizedConnectionString() {
        return Optional.ofNullable(this.srvShardOptimizedConnectionString);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConnectionStringPrivateEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionString;
        private @Nullable List<ClusterConnectionStringPrivateEndpointEndpoint> endpoints;
        private @Nullable String srvConnectionString;
        private @Nullable String srvShardOptimizedConnectionString;
        private @Nullable String type;
        public Builder() {}
        public Builder(ClusterConnectionStringPrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.endpoints = defaults.endpoints;
    	      this.srvConnectionString = defaults.srvConnectionString;
    	      this.srvShardOptimizedConnectionString = defaults.srvShardOptimizedConnectionString;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(@Nullable List<ClusterConnectionStringPrivateEndpointEndpoint> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(ClusterConnectionStringPrivateEndpointEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder srvConnectionString(@Nullable String srvConnectionString) {
            this.srvConnectionString = srvConnectionString;
            return this;
        }
        @CustomType.Setter
        public Builder srvShardOptimizedConnectionString(@Nullable String srvShardOptimizedConnectionString) {
            this.srvShardOptimizedConnectionString = srvShardOptimizedConnectionString;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ClusterConnectionStringPrivateEndpoint build() {
            final var o = new ClusterConnectionStringPrivateEndpoint();
            o.connectionString = connectionString;
            o.endpoints = endpoints;
            o.srvConnectionString = srvConnectionString;
            o.srvShardOptimizedConnectionString = srvShardOptimizedConnectionString;
            o.type = type;
            return o;
        }
    }
}
