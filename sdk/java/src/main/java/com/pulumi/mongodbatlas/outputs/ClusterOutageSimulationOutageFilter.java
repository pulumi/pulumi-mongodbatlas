// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterOutageSimulationOutageFilter {
    /**
     * @return The cloud provider of the region that undergoes the outage simulation. Following values are supported:
     * * `AWS`
     * * `GCP`
     * * `AZURE`
     * 
     */
    private String cloudProvider;
    /**
     * @return The Atlas name of the region to undergo an outage simulation.
     * 
     */
    private String regionName;
    /**
     * @return The type of cluster outage simulation. Following values are supported:
     * * `REGION` - Simulates a cluster outage for a region
     * 
     */
    private @Nullable String type;

    private ClusterOutageSimulationOutageFilter() {}
    /**
     * @return The cloud provider of the region that undergoes the outage simulation. Following values are supported:
     * * `AWS`
     * * `GCP`
     * * `AZURE`
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * @return The Atlas name of the region to undergo an outage simulation.
     * 
     */
    public String regionName() {
        return this.regionName;
    }
    /**
     * @return The type of cluster outage simulation. Following values are supported:
     * * `REGION` - Simulates a cluster outage for a region
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOutageSimulationOutageFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String regionName;
        private @Nullable String type;
        public Builder() {}
        public Builder(ClusterOutageSimulationOutageFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.regionName = defaults.regionName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            if (cloudProvider == null) {
              throw new MissingRequiredPropertyException("ClusterOutageSimulationOutageFilter", "cloudProvider");
            }
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            if (regionName == null) {
              throw new MissingRequiredPropertyException("ClusterOutageSimulationOutageFilter", "regionName");
            }
            this.regionName = regionName;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ClusterOutageSimulationOutageFilter build() {
            final var _resultValue = new ClusterOutageSimulationOutageFilter();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.regionName = regionName;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
