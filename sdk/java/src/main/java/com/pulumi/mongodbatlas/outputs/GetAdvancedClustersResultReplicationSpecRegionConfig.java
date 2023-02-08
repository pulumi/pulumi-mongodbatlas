// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecs;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAutoScaling;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecs;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdvancedClustersResultReplicationSpecRegionConfig {
    /**
     * @return Configuration for the Collection of settings that configures analytis-auto-scaling information for the cluster. See below
     * 
     */
    private List<GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings;
    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. See below
     * 
     */
    private @Nullable GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs;
    /**
     * @return Configuration for the Collection of settings that configures auto-scaling information for the cluster. See below
     * 
     */
    private List<GetAdvancedClustersResultReplicationSpecRegionConfigAutoScaling> autoScalings;
    /**
     * @return Cloud service provider on which you provision the host for a multi-tenant cluster.
     * 
     */
    private String backingProviderName;
    /**
     * @return Hardware specifications for electable nodes in the region.
     * 
     */
    private @Nullable GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecs electableSpecs;
    /**
     * @return Election priority of the region.
     * 
     */
    private Integer priority;
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * 
     */
    private String providerName;
    /**
     * @return Hardware specifications for read-only nodes in the region. See below
     * 
     */
    private @Nullable GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs;
    /**
     * @return Physical location of your MongoDB cluster.
     * 
     */
    private String regionName;

    private GetAdvancedClustersResultReplicationSpecRegionConfig() {}
    /**
     * @return Configuration for the Collection of settings that configures analytis-auto-scaling information for the cluster. See below
     * 
     */
    public List<GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings() {
        return this.analyticsAutoScalings;
    }
    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. See below
     * 
     */
    public Optional<GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecs> analyticsSpecs() {
        return Optional.ofNullable(this.analyticsSpecs);
    }
    /**
     * @return Configuration for the Collection of settings that configures auto-scaling information for the cluster. See below
     * 
     */
    public List<GetAdvancedClustersResultReplicationSpecRegionConfigAutoScaling> autoScalings() {
        return this.autoScalings;
    }
    /**
     * @return Cloud service provider on which you provision the host for a multi-tenant cluster.
     * 
     */
    public String backingProviderName() {
        return this.backingProviderName;
    }
    /**
     * @return Hardware specifications for electable nodes in the region.
     * 
     */
    public Optional<GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecs> electableSpecs() {
        return Optional.ofNullable(this.electableSpecs);
    }
    /**
     * @return Election priority of the region.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    /**
     * @return Hardware specifications for read-only nodes in the region. See below
     * 
     */
    public Optional<GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs> readOnlySpecs() {
        return Optional.ofNullable(this.readOnlySpecs);
    }
    /**
     * @return Physical location of your MongoDB cluster.
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultReplicationSpecRegionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings;
        private @Nullable GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs;
        private List<GetAdvancedClustersResultReplicationSpecRegionConfigAutoScaling> autoScalings;
        private String backingProviderName;
        private @Nullable GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecs electableSpecs;
        private Integer priority;
        private String providerName;
        private @Nullable GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs;
        private String regionName;
        public Builder() {}
        public Builder(GetAdvancedClustersResultReplicationSpecRegionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsAutoScalings = defaults.analyticsAutoScalings;
    	      this.analyticsSpecs = defaults.analyticsSpecs;
    	      this.autoScalings = defaults.autoScalings;
    	      this.backingProviderName = defaults.backingProviderName;
    	      this.electableSpecs = defaults.electableSpecs;
    	      this.priority = defaults.priority;
    	      this.providerName = defaults.providerName;
    	      this.readOnlySpecs = defaults.readOnlySpecs;
    	      this.regionName = defaults.regionName;
        }

        @CustomType.Setter
        public Builder analyticsAutoScalings(List<GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings) {
            this.analyticsAutoScalings = Objects.requireNonNull(analyticsAutoScalings);
            return this;
        }
        public Builder analyticsAutoScalings(GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling... analyticsAutoScalings) {
            return analyticsAutoScalings(List.of(analyticsAutoScalings));
        }
        @CustomType.Setter
        public Builder analyticsSpecs(@Nullable GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs) {
            this.analyticsSpecs = analyticsSpecs;
            return this;
        }
        @CustomType.Setter
        public Builder autoScalings(List<GetAdvancedClustersResultReplicationSpecRegionConfigAutoScaling> autoScalings) {
            this.autoScalings = Objects.requireNonNull(autoScalings);
            return this;
        }
        public Builder autoScalings(GetAdvancedClustersResultReplicationSpecRegionConfigAutoScaling... autoScalings) {
            return autoScalings(List.of(autoScalings));
        }
        @CustomType.Setter
        public Builder backingProviderName(String backingProviderName) {
            this.backingProviderName = Objects.requireNonNull(backingProviderName);
            return this;
        }
        @CustomType.Setter
        public Builder electableSpecs(@Nullable GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecs electableSpecs) {
            this.electableSpecs = electableSpecs;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        @CustomType.Setter
        public Builder readOnlySpecs(@Nullable GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs) {
            this.readOnlySpecs = readOnlySpecs;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public GetAdvancedClustersResultReplicationSpecRegionConfig build() {
            final var o = new GetAdvancedClustersResultReplicationSpecRegionConfig();
            o.analyticsAutoScalings = analyticsAutoScalings;
            o.analyticsSpecs = analyticsSpecs;
            o.autoScalings = autoScalings;
            o.backingProviderName = backingProviderName;
            o.electableSpecs = electableSpecs;
            o.priority = priority;
            o.providerName = providerName;
            o.readOnlySpecs = readOnlySpecs;
            o.regionName = regionName;
            return o;
        }
    }
}
