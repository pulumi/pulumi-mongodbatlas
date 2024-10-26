// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterReplicationSpecRegionConfigAutoScaling;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecs;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedClusterReplicationSpecRegionConfig {
    /**
     * @return Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` parameter must be the same for all `region_configs` in all `replication_specs`. See below
     * 
     */
    private @Nullable AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling analyticsAutoScaling;
    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don&#39;t specify this parameter, no analytics nodes deploy to this region. See below
     * 
     */
    private @Nullable AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs;
    /**
     * @return Configuration for the Collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` parameter must be the same for all `region_configs` in all `replication_specs`. See below
     * 
     */
    private @Nullable AdvancedClusterReplicationSpecRegionConfigAutoScaling autoScaling;
    /**
     * @return Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` of a specs is `M2` or `M5`.
     * 
     */
    private @Nullable String backingProviderName;
    /**
     * @return Hardware specifications for electable nodes in the region. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below
     * 
     */
    private @Nullable AdvancedClusterReplicationSpecRegionConfigElectableSpecs electableSpecs;
    /**
     * @return Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
     * * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
     * 
     */
    private Integer priority;
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * The possible values are:
     * 
     * - `AWS` - Amazon AWS
     * - `GCP` - Google Cloud Platform
     * - `AZURE` - Microsoft Azure
     * - `TENANT` - M0, M2 or M5 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
     * 
     */
    private String providerName;
    /**
     * @return Hardware specifications for read-only nodes in the region. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don&#39;t specify this parameter, no read-only nodes are deployed to the region. See below
     * 
     */
    private @Nullable AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs;
    /**
     * @return Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    private String regionName;

    private AdvancedClusterReplicationSpecRegionConfig() {}
    /**
     * @return Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` parameter must be the same for all `region_configs` in all `replication_specs`. See below
     * 
     */
    public Optional<AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling> analyticsAutoScaling() {
        return Optional.ofNullable(this.analyticsAutoScaling);
    }
    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don&#39;t specify this parameter, no analytics nodes deploy to this region. See below
     * 
     */
    public Optional<AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs> analyticsSpecs() {
        return Optional.ofNullable(this.analyticsSpecs);
    }
    /**
     * @return Configuration for the Collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` parameter must be the same for all `region_configs` in all `replication_specs`. See below
     * 
     */
    public Optional<AdvancedClusterReplicationSpecRegionConfigAutoScaling> autoScaling() {
        return Optional.ofNullable(this.autoScaling);
    }
    /**
     * @return Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` of a specs is `M2` or `M5`.
     * 
     */
    public Optional<String> backingProviderName() {
        return Optional.ofNullable(this.backingProviderName);
    }
    /**
     * @return Hardware specifications for electable nodes in the region. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below
     * 
     */
    public Optional<AdvancedClusterReplicationSpecRegionConfigElectableSpecs> electableSpecs() {
        return Optional.ofNullable(this.electableSpecs);
    }
    /**
     * @return Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
     * * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Cloud service provider on which the servers are provisioned.
     * The possible values are:
     * 
     * - `AWS` - Amazon AWS
     * - `GCP` - Google Cloud Platform
     * - `AZURE` - Microsoft Azure
     * - `TENANT` - M0, M2 or M5 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    /**
     * @return Hardware specifications for read-only nodes in the region. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don&#39;t specify this parameter, no read-only nodes are deployed to the region. See below
     * 
     */
    public Optional<AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs> readOnlySpecs() {
        return Optional.ofNullable(this.readOnlySpecs);
    }
    /**
     * @return Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedClusterReplicationSpecRegionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling analyticsAutoScaling;
        private @Nullable AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs;
        private @Nullable AdvancedClusterReplicationSpecRegionConfigAutoScaling autoScaling;
        private @Nullable String backingProviderName;
        private @Nullable AdvancedClusterReplicationSpecRegionConfigElectableSpecs electableSpecs;
        private Integer priority;
        private String providerName;
        private @Nullable AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs;
        private String regionName;
        public Builder() {}
        public Builder(AdvancedClusterReplicationSpecRegionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsAutoScaling = defaults.analyticsAutoScaling;
    	      this.analyticsSpecs = defaults.analyticsSpecs;
    	      this.autoScaling = defaults.autoScaling;
    	      this.backingProviderName = defaults.backingProviderName;
    	      this.electableSpecs = defaults.electableSpecs;
    	      this.priority = defaults.priority;
    	      this.providerName = defaults.providerName;
    	      this.readOnlySpecs = defaults.readOnlySpecs;
    	      this.regionName = defaults.regionName;
        }

        @CustomType.Setter
        public Builder analyticsAutoScaling(@Nullable AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling analyticsAutoScaling) {

            this.analyticsAutoScaling = analyticsAutoScaling;
            return this;
        }
        @CustomType.Setter
        public Builder analyticsSpecs(@Nullable AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs analyticsSpecs) {

            this.analyticsSpecs = analyticsSpecs;
            return this;
        }
        @CustomType.Setter
        public Builder autoScaling(@Nullable AdvancedClusterReplicationSpecRegionConfigAutoScaling autoScaling) {

            this.autoScaling = autoScaling;
            return this;
        }
        @CustomType.Setter
        public Builder backingProviderName(@Nullable String backingProviderName) {

            this.backingProviderName = backingProviderName;
            return this;
        }
        @CustomType.Setter
        public Builder electableSpecs(@Nullable AdvancedClusterReplicationSpecRegionConfigElectableSpecs electableSpecs) {

            this.electableSpecs = electableSpecs;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfig", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            if (providerName == null) {
              throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfig", "providerName");
            }
            this.providerName = providerName;
            return this;
        }
        @CustomType.Setter
        public Builder readOnlySpecs(@Nullable AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs readOnlySpecs) {

            this.readOnlySpecs = readOnlySpecs;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            if (regionName == null) {
              throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfig", "regionName");
            }
            this.regionName = regionName;
            return this;
        }
        public AdvancedClusterReplicationSpecRegionConfig build() {
            final var _resultValue = new AdvancedClusterReplicationSpecRegionConfig();
            _resultValue.analyticsAutoScaling = analyticsAutoScaling;
            _resultValue.analyticsSpecs = analyticsSpecs;
            _resultValue.autoScaling = autoScaling;
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
