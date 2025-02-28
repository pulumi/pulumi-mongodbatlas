// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedClusterConnectionStringPrivateEndpointEndpoint {
    private @Nullable String endpointId;
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * The possible values are:
     * 
     * - `AWS` - Amazon AWS
     * - `GCP` - Google Cloud Platform
     * - `AZURE` - Microsoft Azure
     * - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
     * 
     */
    private @Nullable String providerName;
    private @Nullable String region;

    private AdvancedClusterConnectionStringPrivateEndpointEndpoint() {}
    public Optional<String> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * The possible values are:
     * 
     * - `AWS` - Amazon AWS
     * - `GCP` - Google Cloud Platform
     * - `AZURE` - Microsoft Azure
     * - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
     * 
     */
    public Optional<String> providerName() {
        return Optional.ofNullable(this.providerName);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedClusterConnectionStringPrivateEndpointEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endpointId;
        private @Nullable String providerName;
        private @Nullable String region;
        public Builder() {}
        public Builder(AdvancedClusterConnectionStringPrivateEndpointEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.providerName = defaults.providerName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder endpointId(@Nullable String endpointId) {

            this.endpointId = endpointId;
            return this;
        }
        @CustomType.Setter
        public Builder providerName(@Nullable String providerName) {

            this.providerName = providerName;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public AdvancedClusterConnectionStringPrivateEndpointEndpoint build() {
            final var _resultValue = new AdvancedClusterConnectionStringPrivateEndpointEndpoint();
            _resultValue.endpointId = endpointId;
            _resultValue.providerName = providerName;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
