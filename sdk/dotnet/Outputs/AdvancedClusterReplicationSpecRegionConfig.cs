// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class AdvancedClusterReplicationSpecRegionConfig
    {
        /// <summary>
        /// Configuration for the Collection of settings that configures analytics-auto-scaling information for the cluster. The values for the `analytics_auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
        /// </summary>
        public readonly Outputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling? AnalyticsAutoScaling;
        /// <summary>
        /// Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. Analytics nodes handle analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only and can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary). If you don't specify this parameter, no analytics nodes deploy to this region. See below.
        /// </summary>
        public readonly Outputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs? AnalyticsSpecs;
        /// <summary>
        /// Configuration for the collection of settings that configures auto-scaling information for the cluster. The values for the `auto_scaling` attribute must be the same for all `region_configs` of a cluster. See below.
        /// </summary>
        public readonly Outputs.AdvancedClusterReplicationSpecRegionConfigAutoScaling? AutoScaling;
        /// <summary>
        /// Cloud service provider on which you provision the host for a multi-tenant cluster. Use this only when a `provider_name` is `TENANT` and `instance_size` is `M0`.
        /// </summary>
        public readonly string? BackingProviderName;
        /// <summary>
        /// Hardware specifications for electable nodes in the region. All `electable_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size`. Electable nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you do not specify this option, no electable nodes are deployed to the region. See below.
        /// </summary>
        public readonly Outputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecs? ElectableSpecs;
        /// <summary>
        /// Election priority of the region. For regions with only read-only nodes, set this value to 0.
        /// * If you have multiple `region_configs` objects (your cluster is multi-region or multi-cloud), they must have priorities in descending order. The highest priority is 7.
        /// * If your region has set `region_configs.#.electable_specs.0.node_count` to 1 or higher, it must have a priority of exactly one (1) less than another region in the `replication_specs.#.region_configs.#` array. The highest-priority region must have a priority of 7. The lowest possible priority is 1.
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// Cloud service provider on which the servers are provisioned.
        /// The possible values are:
        /// - `AWS` - Amazon AWS
        /// - `GCP` - Google Cloud Platform
        /// - `AZURE` - Microsoft Azure
        /// - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Hardware specifications for read-only nodes in the region. All `read_only_specs` in the `region_configs` of a `replication_specs` must have the same `instance_size` as `electable_specs`. Read-only nodes can become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary) and can enable local reads. If you don't specify this parameter, no read-only nodes are deployed to the region. See below.
        /// </summary>
        public readonly Outputs.AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs? ReadOnlySpecs;
        /// <summary>
        /// Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        public readonly string RegionName;

        [OutputConstructor]
        private AdvancedClusterReplicationSpecRegionConfig(
            Outputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling? analyticsAutoScaling,

            Outputs.AdvancedClusterReplicationSpecRegionConfigAnalyticsSpecs? analyticsSpecs,

            Outputs.AdvancedClusterReplicationSpecRegionConfigAutoScaling? autoScaling,

            string? backingProviderName,

            Outputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecs? electableSpecs,

            int priority,

            string providerName,

            Outputs.AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs? readOnlySpecs,

            string regionName)
        {
            AnalyticsAutoScaling = analyticsAutoScaling;
            AnalyticsSpecs = analyticsSpecs;
            AutoScaling = autoScaling;
            BackingProviderName = backingProviderName;
            ElectableSpecs = electableSpecs;
            Priority = priority;
            ProviderName = providerName;
            ReadOnlySpecs = readOnlySpecs;
            RegionName = regionName;
        }
    }
}
