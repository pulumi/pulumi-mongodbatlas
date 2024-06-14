// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterReplicationSpecRegionsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("analyticsNodes")]
        public Input<int>? AnalyticsNodes { get; set; }

        [Input("electableNodes")]
        public Input<int>? ElectableNodes { get; set; }

        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("readOnlyNodes")]
        public Input<int>? ReadOnlyNodes { get; set; }

        [Input("regionName", required: true)]
        public Input<string> RegionName { get; set; } = null!;

        public ClusterReplicationSpecRegionsConfigGetArgs()
        {
        }
        public static new ClusterReplicationSpecRegionsConfigGetArgs Empty => new ClusterReplicationSpecRegionsConfigGetArgs();
    }
}