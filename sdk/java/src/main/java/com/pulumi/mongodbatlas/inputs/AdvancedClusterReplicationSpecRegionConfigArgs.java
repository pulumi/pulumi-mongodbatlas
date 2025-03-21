// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScalingArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdvancedClusterReplicationSpecRegionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdvancedClusterReplicationSpecRegionConfigArgs Empty = new AdvancedClusterReplicationSpecRegionConfigArgs();

    /**
     * Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
     * 
     */
    @Import(name="analyticsAutoScaling")
    private @Nullable Output<AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScalingArgs> analyticsAutoScaling;

    /**
     * @return Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
     * 
     */
    public Optional<Output<AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScalingArgs>> analyticsAutoScaling() {
        return Optional.ofNullable(this.analyticsAutoScaling);
    }

    /**
     * Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don&#39;t specify this parameter, no analytics nodes deploy to this region. See below.
     * 
     */
    @Import(name="analyticsSpecs")
    private @Nullable Output<AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsArgs> analyticsSpecs;

    /**
     * @return Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don&#39;t specify this parameter, no analytics nodes deploy to this region. See below.
     * 
     */
    public Optional<Output<AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsArgs>> analyticsSpecs() {
        return Optional.ofNullable(this.analyticsSpecs);
    }

    /**
     * Configuration for the collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
     * 
     */
    @Import(name="autoScaling")
    private @Nullable Output<AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs> autoScaling;

    /**
     * @return Configuration for the collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
     * 
     */
    public Optional<Output<AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs>> autoScaling() {
        return Optional.ofNullable(this.autoScaling);
    }

    /**
     * Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` is `M0`.
     * 
     */
    @Import(name="backingProviderName")
    private @Nullable Output<String> backingProviderName;

    /**
     * @return Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` is `M0`.
     * 
     */
    public Optional<Output<String>> backingProviderName() {
        return Optional.ofNullable(this.backingProviderName);
    }

    /**
     * Hardware specifications for electable nodes in the region. All `electable_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size`. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below.
     * 
     */
    @Import(name="electableSpecs")
    private @Nullable Output<AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs> electableSpecs;

    /**
     * @return Hardware specifications for electable nodes in the region. All `electable_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size`. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below.
     * 
     */
    public Optional<Output<AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs>> electableSpecs() {
        return Optional.ofNullable(this.electableSpecs);
    }

    /**
     * Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
     * * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
     * * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Cloud service provider on which the servers are provisioned.
     * The possible values are:
     * - `AWS` - Amazon AWS
     * - `GCP` - Google Cloud Platform
     * - `AZURE` - Microsoft Azure
     * - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return Cloud service provider on which the servers are provisioned.
     * The possible values are:
     * - `AWS` - Amazon AWS
     * - `GCP` - Google Cloud Platform
     * - `AZURE` - Microsoft Azure
     * - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     * Hardware specifications for read-only nodes in the region. All `read_only_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size` as `electable_specs`. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don&#39;t specify this parameter, no read-only nodes are deployed to the region. See below.
     * 
     */
    @Import(name="readOnlySpecs")
    private @Nullable Output<AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs> readOnlySpecs;

    /**
     * @return Hardware specifications for read-only nodes in the region. All `read_only_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size` as `electable_specs`. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don&#39;t specify this parameter, no read-only nodes are deployed to the region. See below.
     * 
     */
    public Optional<Output<AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs>> readOnlySpecs() {
        return Optional.ofNullable(this.readOnlySpecs);
    }

    /**
     * Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    @Import(name="regionName", required=true)
    private Output<String> regionName;

    /**
     * @return Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }

    private AdvancedClusterReplicationSpecRegionConfigArgs() {}

    private AdvancedClusterReplicationSpecRegionConfigArgs(AdvancedClusterReplicationSpecRegionConfigArgs $) {
        this.analyticsAutoScaling = $.analyticsAutoScaling;
        this.analyticsSpecs = $.analyticsSpecs;
        this.autoScaling = $.autoScaling;
        this.backingProviderName = $.backingProviderName;
        this.electableSpecs = $.electableSpecs;
        this.priority = $.priority;
        this.providerName = $.providerName;
        this.readOnlySpecs = $.readOnlySpecs;
        this.regionName = $.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdvancedClusterReplicationSpecRegionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedClusterReplicationSpecRegionConfigArgs $;

        public Builder() {
            $ = new AdvancedClusterReplicationSpecRegionConfigArgs();
        }

        public Builder(AdvancedClusterReplicationSpecRegionConfigArgs defaults) {
            $ = new AdvancedClusterReplicationSpecRegionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyticsAutoScaling Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
         * 
         * @return builder
         * 
         */
        public Builder analyticsAutoScaling(@Nullable Output<AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScalingArgs> analyticsAutoScaling) {
            $.analyticsAutoScaling = analyticsAutoScaling;
            return this;
        }

        /**
         * @param analyticsAutoScaling Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
         * 
         * @return builder
         * 
         */
        public Builder analyticsAutoScaling(AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScalingArgs analyticsAutoScaling) {
            return analyticsAutoScaling(Output.of(analyticsAutoScaling));
        }

        /**
         * @param analyticsSpecs Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don&#39;t specify this parameter, no analytics nodes deploy to this region. See below.
         * 
         * @return builder
         * 
         */
        public Builder analyticsSpecs(@Nullable Output<AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsArgs> analyticsSpecs) {
            $.analyticsSpecs = analyticsSpecs;
            return this;
        }

        /**
         * @param analyticsSpecs Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don&#39;t specify this parameter, no analytics nodes deploy to this region. See below.
         * 
         * @return builder
         * 
         */
        public Builder analyticsSpecs(AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsArgs analyticsSpecs) {
            return analyticsSpecs(Output.of(analyticsSpecs));
        }

        /**
         * @param autoScaling Configuration for the collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
         * 
         * @return builder
         * 
         */
        public Builder autoScaling(@Nullable Output<AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs> autoScaling) {
            $.autoScaling = autoScaling;
            return this;
        }

        /**
         * @param autoScaling Configuration for the collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
         * 
         * @return builder
         * 
         */
        public Builder autoScaling(AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs autoScaling) {
            return autoScaling(Output.of(autoScaling));
        }

        /**
         * @param backingProviderName Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` is `M0`.
         * 
         * @return builder
         * 
         */
        public Builder backingProviderName(@Nullable Output<String> backingProviderName) {
            $.backingProviderName = backingProviderName;
            return this;
        }

        /**
         * @param backingProviderName Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` is `M0`.
         * 
         * @return builder
         * 
         */
        public Builder backingProviderName(String backingProviderName) {
            return backingProviderName(Output.of(backingProviderName));
        }

        /**
         * @param electableSpecs Hardware specifications for electable nodes in the region. All `electable_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size`. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below.
         * 
         * @return builder
         * 
         */
        public Builder electableSpecs(@Nullable Output<AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs> electableSpecs) {
            $.electableSpecs = electableSpecs;
            return this;
        }

        /**
         * @param electableSpecs Hardware specifications for electable nodes in the region. All `electable_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size`. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below.
         * 
         * @return builder
         * 
         */
        public Builder electableSpecs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs electableSpecs) {
            return electableSpecs(Output.of(electableSpecs));
        }

        /**
         * @param priority Election priority of the region. For regions with only read-only nodes, set this value to 0.
         * * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
         * * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Election priority of the region. For regions with only read-only nodes, set this value to 0.
         * * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
         * * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param providerName Cloud service provider on which the servers are provisioned.
         * The possible values are:
         * - `AWS` - Amazon AWS
         * - `GCP` - Google Cloud Platform
         * - `AZURE` - Microsoft Azure
         * - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud service provider on which the servers are provisioned.
         * The possible values are:
         * - `AWS` - Amazon AWS
         * - `GCP` - Google Cloud Platform
         * - `AZURE` - Microsoft Azure
         * - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param readOnlySpecs Hardware specifications for read-only nodes in the region. All `read_only_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size` as `electable_specs`. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don&#39;t specify this parameter, no read-only nodes are deployed to the region. See below.
         * 
         * @return builder
         * 
         */
        public Builder readOnlySpecs(@Nullable Output<AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs> readOnlySpecs) {
            $.readOnlySpecs = readOnlySpecs;
            return this;
        }

        /**
         * @param readOnlySpecs Hardware specifications for read-only nodes in the region. All `read_only_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size` as `electable_specs`. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don&#39;t specify this parameter, no read-only nodes are deployed to the region. See below.
         * 
         * @return builder
         * 
         */
        public Builder readOnlySpecs(AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs readOnlySpecs) {
            return readOnlySpecs(Output.of(readOnlySpecs));
        }

        /**
         * @param regionName Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
         * 
         * @return builder
         * 
         */
        public Builder regionName(Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        public AdvancedClusterReplicationSpecRegionConfigArgs build() {
            if ($.priority == null) {
                throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfigArgs", "priority");
            }
            if ($.providerName == null) {
                throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfigArgs", "providerName");
            }
            if ($.regionName == null) {
                throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfigArgs", "regionName");
            }
            return $;
        }
    }

}
