// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdvancedClusterConnectionStringPrivateEndpointEndpoint {
    private String endpointId;
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * 
     */
    private String providerName;
    private String region;

    private GetAdvancedClusterConnectionStringPrivateEndpointEndpoint() {}
    public String endpointId() {
        return this.endpointId;
    }
    /**
     * @return Cloud service provider on which the servers are provisioned.
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

    public static Builder builder(GetAdvancedClusterConnectionStringPrivateEndpointEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointId;
        private String providerName;
        private String region;
        public Builder() {}
        public Builder(GetAdvancedClusterConnectionStringPrivateEndpointEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.providerName = defaults.providerName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            if (endpointId == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterConnectionStringPrivateEndpointEndpoint", "endpointId");
            }
            this.endpointId = endpointId;
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            if (providerName == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterConnectionStringPrivateEndpointEndpoint", "providerName");
            }
            this.providerName = providerName;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterConnectionStringPrivateEndpointEndpoint", "region");
            }
            this.region = region;
            return this;
        }
        public GetAdvancedClusterConnectionStringPrivateEndpointEndpoint build() {
            final var _resultValue = new GetAdvancedClusterConnectionStringPrivateEndpointEndpoint();
            _resultValue.endpointId = endpointId;
            _resultValue.providerName = providerName;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}