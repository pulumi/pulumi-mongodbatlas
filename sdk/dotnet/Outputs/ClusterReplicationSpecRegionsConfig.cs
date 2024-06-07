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
    public sealed class ClusterReplicationSpecRegionsConfig
    {
        public readonly int? AnalyticsNodes;
        public readonly int? ElectableNodes;
        public readonly int? Priority;
        public readonly int? ReadOnlyNodes;
        public readonly string RegionName;

        [OutputConstructor]
        private ClusterReplicationSpecRegionsConfig(
            int? analyticsNodes,

            int? electableNodes,

            int? priority,

            int? readOnlyNodes,

            string regionName)
        {
            AnalyticsNodes = analyticsNodes;
            ElectableNodes = electableNodes;
            Priority = priority;
            ReadOnlyNodes = readOnlyNodes;
            RegionName = regionName;
        }
    }
}
