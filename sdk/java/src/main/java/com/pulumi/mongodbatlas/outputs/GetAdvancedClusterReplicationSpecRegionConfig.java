// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterReplicationSpecRegionConfigAutoScaling;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterReplicationSpecRegionConfigElectableSpecs;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdvancedClusterReplicationSpecRegionConfig {
    /**
     * @return Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. See below
     * 
     */
    private List<GetAdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings;
    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. See below
     * 
     */
    private @Nullable GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs;
    /**
     * @return Configuration for the Collection of settings that configures auto-scaling information for the cluster. See below
     * 
     */
    private List<GetAdvancedClusterReplicationSpecRegionConfigAutoScaling> autoScalings;
    /**
     * @return Cloud service provider on which you provision the host for a multi-tenant cluster.
     * 
     */
    private String backingProviderName;
    /**
     * @return Hardware specifications for electable nodes in the region.
     * 
     */
    private @Nullable GetAdvancedClusterReplicationSpecRegionConfigElectableSpecs electableSpecs;
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
    private @Nullable GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs;
    /**
     * @return Physical location of your MongoDB cluster.
     * 
     */
    private String regionName;

    private GetAdvancedClusterReplicationSpecRegionConfig() {}
    /**
     * @return Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. See below
     * 
     */
    public List<GetAdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings() {
        return this.analyticsAutoScalings;
    }
    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. See below
     * 
     */
    public Optional<GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs> analyticsSpecs() {
        return Optional.ofNullable(this.analyticsSpecs);
    }
    /**
     * @return Configuration for the Collection of settings that configures auto-scaling information for the cluster. See below
     * 
     */
    public List<GetAdvancedClusterReplicationSpecRegionConfigAutoScaling> autoScalings() {
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
    public Optional<GetAdvancedClusterReplicationSpecRegionConfigElectableSpecs> electableSpecs() {
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
    public Optional<GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecs> readOnlySpecs() {
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

    public static Builder builder(GetAdvancedClusterReplicationSpecRegionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings;
        private @Nullable GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs;
        private List<GetAdvancedClusterReplicationSpecRegionConfigAutoScaling> autoScalings;
        private String backingProviderName;
        private @Nullable GetAdvancedClusterReplicationSpecRegionConfigElectableSpecs electableSpecs;
        private Integer priority;
        private String providerName;
        private @Nullable GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs;
        private String regionName;
        public Builder() {}
        public Builder(GetAdvancedClusterReplicationSpecRegionConfig defaults) {
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
        public Builder analyticsAutoScalings(List<GetAdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScalings) {
            this.analyticsAutoScalings = Objects.requireNonNull(analyticsAutoScalings);
            return this;
        }
        public Builder analyticsAutoScalings(GetAdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling... analyticsAutoScalings) {
            return analyticsAutoScalings(List.of(analyticsAutoScalings));
        }
        @CustomType.Setter
        public Builder analyticsSpecs(@Nullable GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs) {
            this.analyticsSpecs = analyticsSpecs;
            return this;
        }
        @CustomType.Setter
        public Builder autoScalings(List<GetAdvancedClusterReplicationSpecRegionConfigAutoScaling> autoScalings) {
            this.autoScalings = Objects.requireNonNull(autoScalings);
            return this;
        }
        public Builder autoScalings(GetAdvancedClusterReplicationSpecRegionConfigAutoScaling... autoScalings) {
            return autoScalings(List.of(autoScalings));
        }
        @CustomType.Setter
        public Builder backingProviderName(String backingProviderName) {
            this.backingProviderName = Objects.requireNonNull(backingProviderName);
            return this;
        }
        @CustomType.Setter
        public Builder electableSpecs(@Nullable GetAdvancedClusterReplicationSpecRegionConfigElectableSpecs electableSpecs) {
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
        public Builder readOnlySpecs(@Nullable GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs) {
            this.readOnlySpecs = readOnlySpecs;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public GetAdvancedClusterReplicationSpecRegionConfig build() {
            final var _resultValue = new GetAdvancedClusterReplicationSpecRegionConfig();
            _resultValue.analyticsAutoScalings = analyticsAutoScalings;
            _resultValue.analyticsSpecs = analyticsSpecs;
            _resultValue.autoScalings = autoScalings;
            _resultValue.backingProviderName = backingProviderName;
            _resultValue.electableSpecs = electableSpecs;
            _resultValue.priority = priority;
            _resultValue.providerName = providerName;
            _resultValue.readOnlySpecs = readOnlySpecs;
            _resultValue.regionName = regionName;
            return _resultValue;
        }
    }
}
