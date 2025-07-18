// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetAdvancedClustersResultReplicationSpecRegionConfigResult
    {
        /// <summary>
        /// Configuration for the Collection of settings that configures analytis-auto-scaling information for the cluster. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScalingResult> AnalyticsAutoScalings;
        /// <summary>
        /// Hardware specifications for [analytics nodes](https://docs.atlas.mongodb.com/reference/faq/deployment/#std-label-analytics-nodes-overview) needed in the region. See below.
        /// </summary>
        public readonly Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecsResult AnalyticsSpecs;
        /// <summary>
        /// Configuration for the Collection of settings that configures auto-scaling information for the cluster. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAutoScalingResult> AutoScalings;
        /// <summary>
        /// Cloud service provider on which you provision the host for a multi-tenant cluster.
        /// </summary>
        public readonly string BackingProviderName;
        /// <summary>
        /// Hardware specifications for electable nodes in the region.
        /// </summary>
        public readonly Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecsResult ElectableSpecs;
        /// <summary>
        /// Election priority of the region.
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// Cloud service provider on which the servers are provisioned.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Hardware specifications for read-only nodes in the region. See below.
        /// </summary>
        public readonly Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecsResult ReadOnlySpecs;
        /// <summary>
        /// Physical location of your MongoDB cluster.
        /// </summary>
        public readonly string RegionName;

        [OutputConstructor]
        private GetAdvancedClustersResultReplicationSpecRegionConfigResult(
            ImmutableArray<Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScalingResult> analyticsAutoScalings,

            Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsSpecsResult analyticsSpecs,

            ImmutableArray<Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigAutoScalingResult> autoScalings,

            string backingProviderName,

            Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigElectableSpecsResult electableSpecs,

            int priority,

            string providerName,

            Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecsResult readOnlySpecs,

            string regionName)
        {
            AnalyticsAutoScalings = analyticsAutoScalings;
            AnalyticsSpecs = analyticsSpecs;
            AutoScalings = autoScalings;
            BackingProviderName = backingProviderName;
            ElectableSpecs = electableSpecs;
            Priority = priority;
            ProviderName = providerName;
            ReadOnlySpecs = readOnlySpecs;
            RegionName = regionName;
        }
    }
}
