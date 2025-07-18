// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterReplicationSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifer of the replication document for a zone in a Global Cluster. This value corresponds to the legacy sharding schema (no independent shard scaling) and is different from the Shard ID you may see in the Atlas UI.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
        /// </summary>
        [Input("numShards", required: true)]
        public Input<int> NumShards { get; set; } = null!;

        [Input("regionsConfigs")]
        private InputList<Inputs.ClusterReplicationSpecRegionsConfigGetArgs>? _regionsConfigs;

        /// <summary>
        /// Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
        /// </summary>
        public InputList<Inputs.ClusterReplicationSpecRegionsConfigGetArgs> RegionsConfigs
        {
            get => _regionsConfigs ?? (_regionsConfigs = new InputList<Inputs.ClusterReplicationSpecRegionsConfigGetArgs>());
            set => _regionsConfigs = value;
        }

        /// <summary>
        /// Name for the zone in a Global Cluster.
        /// 
        /// 
        /// **Region Config**
        /// </summary>
        [Input("zoneName")]
        public Input<string>? ZoneName { get; set; }

        public ClusterReplicationSpecGetArgs()
        {
        }
        public static new ClusterReplicationSpecGetArgs Empty => new ClusterReplicationSpecGetArgs();
    }
}
