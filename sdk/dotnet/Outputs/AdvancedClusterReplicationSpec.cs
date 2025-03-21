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
    public sealed class AdvancedClusterReplicationSpec
    {
        public readonly ImmutableDictionary<string, string>? ContainerId;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the replication object for a shard in a Cluster. This value corresponds to Shard ID displayed in the UI. When using old sharding configuration (replication spec with `num_shards` greater than 1) this value is not populated.
        /// </summary>
        public readonly string? ExternalId;
        /// <summary>
        /// **(DEPRECATED)** Unique identifer of the replication document for a zone in a Global Cluster. This value corresponds to the legacy sharding schema (no independent shard scaling) and is different from the Shard ID you may see in the Atlas UI. This value is not populated (empty string) when a sharded cluster has independently scaled shards.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED. Omit this value if you selected a `cluster_type` of REPLICASET. This API resource accepts 1 through 50, inclusive. This parameter defaults to 1. If you specify a `num_shards` value of 1 and a `cluster_type` of SHARDED, Atlas deploys a single-shard [sharded cluster](https://docs.atlas.mongodb.com/reference/glossary/#std-term-sharded-cluster). Don't create a sharded cluster with a single shard for production environments. Single-shard sharded clusters don't provide the same benefits as multi-shard configurations.
        /// If you are upgrading a replica set to a sharded cluster, you cannot increase the number of shards in the same update request. You should wait until after the cluster has completed upgrading to sharded and you have reconnected all application clients to the MongoDB router before adding additional shards. Otherwise, your data might become inconsistent once MongoDB Cloud begins distributing data across shards. To learn more, see [Convert a replica set to a sharded cluster documentation](https://www.mongodb.com/docs/atlas/scale-cluster/#convert-a-replica-set-to-a-sharded-cluster) and [Convert a replica set to a sharded cluster tutorial](https://www.mongodb.com/docs/upcoming/tutorial/convert-replica-set-to-replicated-shard-cluster). **(DEPRECATED)** To learn more, see the 1.18.0 Upgrade Guide.
        /// </summary>
        public readonly int? NumShards;
        /// <summary>
        /// Configuration for the hardware specifications for nodes set for a given region. Each `region_configs` object describes the region's priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AdvancedClusterReplicationSpecRegionConfig> RegionConfigs;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the zone in a Global Cluster. If clusterType is GEOSHARDED, this value indicates the zone that the given shard belongs to and can be used to configure Global Cluster backup policies.
        /// </summary>
        public readonly string? ZoneId;
        /// <summary>
        /// Name for the zone in a Global Cluster.
        /// </summary>
        public readonly string? ZoneName;

        [OutputConstructor]
        private AdvancedClusterReplicationSpec(
            ImmutableDictionary<string, string>? containerId,

            string? externalId,

            string? id,

            int? numShards,

            ImmutableArray<Outputs.AdvancedClusterReplicationSpecRegionConfig> regionConfigs,

            string? zoneId,

            string? zoneName)
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
