// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterOutageSimulationOutageFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOutageSimulationOutageFilterArgs Empty = new ClusterOutageSimulationOutageFilterArgs();

    /**
     * The cloud provider of the region that undergoes the outage simulation. Following values are supported:
     * * `AWS`
     * * `GCP`
     * * `AZURE`
     * 
     */
    @Import(name="cloudProvider", required=true)
    private Output<String> cloudProvider;

    /**
     * @return The cloud provider of the region that undergoes the outage simulation. Following values are supported:
     * * `AWS`
     * * `GCP`
     * * `AZURE`
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }

    /**
     * The Atlas name of the region to undergo an outage simulation.
     * 
     */
    @Import(name="regionName", required=true)
    private Output<String> regionName;

    /**
     * @return The Atlas name of the region to undergo an outage simulation.
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }

    /**
     * The type of cluster outage simulation. Following values are supported:
     * * `REGION` - Simulates a cluster outage for a region
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of cluster outage simulation. Following values are supported:
     * * `REGION` - Simulates a cluster outage for a region
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ClusterOutageSimulationOutageFilterArgs() {}

    private ClusterOutageSimulationOutageFilterArgs(ClusterOutageSimulationOutageFilterArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.regionName = $.regionName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOutageSimulationOutageFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOutageSimulationOutageFilterArgs $;

        public Builder() {
            $ = new ClusterOutageSimulationOutageFilterArgs();
        }

        public Builder(ClusterOutageSimulationOutageFilterArgs defaults) {
            $ = new ClusterOutageSimulationOutageFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider The cloud provider of the region that undergoes the outage simulation. Following values are supported:
         * * `AWS`
         * * `GCP`
         * * `AZURE`
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider The cloud provider of the region that undergoes the outage simulation. Following values are supported:
         * * `AWS`
         * * `GCP`
         * * `AZURE`
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param regionName The Atlas name of the region to undergo an outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder regionName(Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName The Atlas name of the region to undergo an outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        /**
         * @param type The type of cluster outage simulation. Following values are supported:
         * * `REGION` - Simulates a cluster outage for a region
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of cluster outage simulation. Following values are supported:
         * * `REGION` - Simulates a cluster outage for a region
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ClusterOutageSimulationOutageFilterArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("ClusterOutageSimulationOutageFilterArgs", "cloudProvider");
            }
            if ($.regionName == null) {
                throw new MissingRequiredPropertyException("ClusterOutageSimulationOutageFilterArgs", "regionName");
            }
            return $;
        }
    }

}
