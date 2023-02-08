// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetClustersResultConnectionStringPrivateEndpointEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersResultConnectionStringPrivateEndpoint {
    private String connectionString;
    private List<GetClustersResultConnectionStringPrivateEndpointEndpoint> endpoints;
    private String srvConnectionString;
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
        private String type;
        public Builder() {}
        public Builder(GetClustersResultConnectionStringPrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.endpoints = defaults.endpoints;
    	      this.srvConnectionString = defaults.srvConnectionString;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(List<GetClustersResultConnectionStringPrivateEndpointEndpoint> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(GetClustersResultConnectionStringPrivateEndpointEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder srvConnectionString(String srvConnectionString) {
            this.srvConnectionString = Objects.requireNonNull(srvConnectionString);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetClustersResultConnectionStringPrivateEndpoint build() {
            final var o = new GetClustersResultConnectionStringPrivateEndpoint();
            o.connectionString = connectionString;
            o.endpoints = endpoints;
            o.srvConnectionString = srvConnectionString;
            o.type = type;
            return o;
        }
    }
}