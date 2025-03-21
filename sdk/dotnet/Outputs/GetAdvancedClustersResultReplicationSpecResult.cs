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
    public sealed class GetAdvancedClustersResultReplicationSpecResult
    {
        /// <summary>
        /// A key-value map of the Network Peering Container ID(s) for the configuration specified in `region_configs`. The Container ID is the id of the container either created programmatically by the user before any clusters existed in a project or when the first cluster in the region (AWS/Azure) or project (GCP) was created.  The syntax is `"providerName:regionName" = "containerId"`. Example `AWS:US_EAST_1" = "61e0797dde08fb498ca11a71`.
        /// </summary>
        public readonly ImmutableDictionary<string, string> ContainerId;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the replication object for a shard in a Cluster. This value corresponds to Shard ID displayed in the UI. When using old sharding configuration (replication spec with `num_shards` greater than 1) this value is not populated.
        /// </summary>
        public readonly string ExternalId;
        public readonly string Id;
        /// <summary>
        /// Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED. **(DEPRECATED)** To learn more, see the Migration Guide for more details.
        /// </summary>
        public readonly int NumShards;
        /// <summary>
        /// Configuration for the hardware specifications for nodes set for a given region. Each `region_configs` object describes the region's priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigResult> RegionConfigs;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the zone in a Global Cluster. If clusterType is GEOSHARDED, this value indicates the zone that the given shard belongs to and can be used to configure Global Cluster backup policies.
        /// </summary>
        public readonly string ZoneId;
        /// <summary>
        /// Name for the zone in a Global Cluster.
        /// </summary>
        public readonly string ZoneName;

        [OutputConstructor]
        private GetAdvancedClustersResultReplicationSpecResult(
            ImmutableDictionary<string, string> containerId,

            string externalId,

            string id,

            int numShards,

            ImmutableArray<Outputs.GetAdvancedClustersResultReplicationSpecRegionConfigResult> regionConfigs,

            string zoneId,

            string zoneName)
        {
            ContainerId = containerId;
            ExternalId = externalId;
            Id = id;
            NumShards = numShards;
            RegionConfigs = regionConfigs;
            ZoneId = zoneId;
            ZoneName = zoneName;
        }
    }
}
