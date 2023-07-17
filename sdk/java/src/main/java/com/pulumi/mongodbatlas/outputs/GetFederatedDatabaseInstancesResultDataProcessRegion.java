// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstancesResultDataProcessRegion {
    /**
     * @return Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * 
     */
    private String cloudProvider;
    /**
     * @return Name of the region to which the Federanted Instnace routes client connections for data processing.
     * 
     */
    private String region;

    private GetFederatedDatabaseInstancesResultDataProcessRegion() {}
    /**
     * @return Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * @return Name of the region to which the Federanted Instnace routes client connections for data processing.
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstancesResultDataProcessRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String region;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstancesResultDataProcessRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            this.cloudProvider = Objects.requireNonNull(cloudProvider);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetFederatedDatabaseInstancesResultDataProcessRegion build() {
            final var o = new GetFederatedDatabaseInstancesResultDataProcessRegion();
            o.cloudProvider = cloudProvider;
            o.region = region;
            return o;
        }
    }
}