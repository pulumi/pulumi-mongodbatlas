// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AdvancedClusterReplicationSpecArgs : Pulumi.ResourceArgs
    {
        [Input("containerId")]
        private InputMap<string>? _containerId;

        /// <summary>
        /// A key-value map of the Network Peering Container ID(s) for the configuration specified in `region_configs`. The Container ID is the id of the container either created programmatically by the user before any clusters existed in a project or when the first cluster in the region (AWS/Azure) or project (GCP) was created.  The syntax is `"providerName:regionName" = "containerId"`. Example `AWS:US_EAST_1" = "61e0797dde08fb498ca11a71`.
        /// </summary>
        public InputMap<string> ContainerId
        {
            get => _containerId ?? (_containerId = new InputMap<string>());
            set => _containerId = value;
        }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED. Omit this value if you selected a `cluster_type` of REPLICASET. This API resource accepts 1 through 50, inclusive. This parameter defaults to 1. If you specify a `num_shards` value of 1 and a `cluster_type` of SHARDED, Atlas deploys a single-shard [sharded cluster](https://docs.atlas.mongodb.com/reference/glossary/#std-term-sharded-cluster). Don't create a sharded cluster with a single shard for production environments. Single-shard sharded clusters don't provide the same benefits as multi-shard configurations.
        /// </summary>
        [Input("numShards")]
        public Input<int>? NumShards { get; set; }

        [Input("regionConfigs", required: true)]
        private InputList<Inputs.AdvancedClusterReplicationSpecRegionConfigArgs>? _regionConfigs;

        /// <summary>
        /// Configuration for the hardware specifications for nodes set for a given regionEach `region_configs` object describes the region's priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below
        /// </summary>
        public InputList<Inputs.AdvancedClusterReplicationSpecRegionConfigArgs> RegionConfigs
        {
            get => _regionConfigs ?? (_regionConfigs = new InputList<Inputs.AdvancedClusterReplicationSpecRegionConfigArgs>());
            set => _regionConfigs = value;
        }

        /// <summary>
        /// Name for the zone in a Global Cluster.
        /// </summary>
        [Input("zoneName")]
        public Input<string>? ZoneName { get; set; }

        public AdvancedClusterReplicationSpecArgs()
        {
        }
    }
}
