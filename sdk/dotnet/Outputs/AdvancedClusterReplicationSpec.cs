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
        public readonly string? Id;
        /// <summary>
        /// Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED. Omit this value if you selected a `cluster_type` of REPLICASET. This API resource accepts 1 through 50, inclusive. This parameter defaults to 1. If you specify a `num_shards` value of 1 and a `cluster_type` of SHARDED, Atlas deploys a single-shard [sharded cluster](https://docs.atlas.mongodb.com/reference/glossary/#std-term-sharded-cluster). Don't create a sharded cluster with a single shard for production environments. Single-shard sharded clusters don't provide the same benefits as multi-shard configurations.
        /// If you are upgrading a replica set to a sharded cluster, you cannot increase the number of shards in the same update request. You should wait until after the cluster has completed upgrading to sharded and you have reconnected all application clients to the MongoDB router before adding additional shards. Otherwise, your data might become inconsistent once MongoDB Cloud begins distributing data across shards. To learn more, see [Convert a replica set to a sharded cluster documentation](https://www.mongodb.com/docs/atlas/scale-cluster/#convert-a-replica-set-to-a-sharded-cluster) and [Convert a replica set to a sharded cluster tutorial](https://www.mongodb.com/docs/upcoming/tutorial/convert-replica-set-to-replicated-shard-cluster).
        /// </summary>
        public readonly int? NumShards;
        /// <summary>
        /// Configuration for the hardware specifications for nodes set for a given regionEach `region_configs` object describes the region's priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below
        /// </summary>
        public readonly ImmutableArray<Outputs.AdvancedClusterReplicationSpecRegionConfig> RegionConfigs;
        /// <summary>
        /// Name for the zone in a Global Cluster.
        /// </summary>
        public readonly string? ZoneName;

        [OutputConstructor]
        private AdvancedClusterReplicationSpec(
            ImmutableDictionary<string, string>? containerId,

            string? id,

            int? numShards,

            ImmutableArray<Outputs.AdvancedClusterReplicationSpecRegionConfig> regionConfigs,

            string? zoneName)
        {
            ContainerId = containerId;
            Id = id;
            NumShards = numShards;
            RegionConfigs = regionConfigs;
            ZoneName = zoneName;
        }
    }
}
