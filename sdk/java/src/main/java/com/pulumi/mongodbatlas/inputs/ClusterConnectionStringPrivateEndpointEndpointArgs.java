// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterConnectionStringPrivateEndpointEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterConnectionStringPrivateEndpointEndpointArgs Empty = new ClusterConnectionStringPrivateEndpointEndpointArgs();

    @Import(name="endpointId")
    private @Nullable Output<String> endpointId;

    public Optional<Output<String>> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * Cloud service provider on which the servers are provisioned.
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return Cloud service provider on which the servers are provisioned.
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ClusterConnectionStringPrivateEndpointEndpointArgs() {}

    private ClusterConnectionStringPrivateEndpointEndpointArgs(ClusterConnectionStringPrivateEndpointEndpointArgs $) {
        this.endpointId = $.endpointId;
        this.providerName = $.providerName;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConnectionStringPrivateEndpointEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConnectionStringPrivateEndpointEndpointArgs $;

        public Builder() {
            $ = new ClusterConnectionStringPrivateEndpointEndpointArgs();
        }

        public Builder(ClusterConnectionStringPrivateEndpointEndpointArgs defaults) {
            $ = new ClusterConnectionStringPrivateEndpointEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointId(@Nullable Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param providerName Cloud service provider on which the servers are provisioned.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud service provider on which the servers are provisioned.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ClusterConnectionStringPrivateEndpointEndpointArgs build() {
            return $;
        }
    }

}