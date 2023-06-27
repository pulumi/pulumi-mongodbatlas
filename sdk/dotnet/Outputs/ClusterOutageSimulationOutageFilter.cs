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
    public sealed class ClusterOutageSimulationOutageFilter
    {
        /// <summary>
        /// The cloud provider of the region that undergoes the outage simulation. Following values are supported:
        /// </summary>
        public readonly string CloudProvider;
        /// <summary>
        /// The Atlas name of the region to undergo an outage simulation.
        /// </summary>
        public readonly string RegionName;
        /// <summary>
        /// The type of cluster outage simulation. Following values are supported:
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ClusterOutageSimulationOutageFilter(
            string cloudProvider,

            string regionName,

            string? type)
        {
            CloudProvider = cloudProvider;
            RegionName = regionName;
            Type = type;
        }
    }
}
