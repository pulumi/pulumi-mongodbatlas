// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersResultConnectionStringPrivateEndpointEndpoint {
    private String endpointId;
    /**
     * @return Indicates the cloud service provider on which the servers are provisioned.
     * 
     */
    private String providerName;
    private String region;

    private GetClustersResultConnectionStringPrivateEndpointEndpoint() {}
    public String endpointId() {
        return this.endpointId;
    }
    /**
     * @return Indicates the cloud service provider on which the servers are provisioned.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResultConnectionStringPrivateEndpointEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointId;
        private String providerName;
        private String region;
        public Builder() {}
        public Builder(GetClustersResultConnectionStringPrivateEndpointEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.providerName = defaults.providerName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetClustersResultConnectionStringPrivateEndpointEndpoint build() {
            final var _resultValue = new GetClustersResultConnectionStringPrivateEndpointEndpoint();
            _resultValue.endpointId = endpointId;
            _resultValue.providerName = providerName;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
