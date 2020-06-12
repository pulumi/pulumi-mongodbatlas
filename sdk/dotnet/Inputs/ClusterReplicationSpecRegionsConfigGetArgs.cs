// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterReplicationSpecRegionsConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of analytics nodes for Atlas to deploy to the region. Analytics nodes are useful for handling analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only, and can never become the primary. If you do not specify this option, no analytics nodes are deployed to the region.
        /// </summary>
        [Input("analyticsNodes")]
        public Input<int>? AnalyticsNodes { get; set; }

        /// <summary>
        /// Number of electable nodes for Atlas to deploy to the region. Electable nodes can become the primary and can facilitate local reads.
        /// * The total number of electableNodes across all replication spec regions  must total 3, 5, or 7.
        /// * Specify 0 if you do not want any electable nodes in the region.
        /// * You cannot create electable nodes in a region if `priority` is 0.
        /// </summary>
        [Input("electableNodes")]
        public Input<int>? ElectableNodes { get; set; }

        /// <summary>
        /// Election priority of the region. For regions with only read-only nodes, set this value to 0.
        /// * For regions where `electable_nodes` is at least 1, each region must have a priority of exactly one (1) less than the previous region. The first region must have a priority of 7. The lowest possible priority is 1.
        /// * The priority 7 region identifies the Preferred Region of the cluster. Atlas places the primary node in the Preferred Region. Priorities 1 through 7 are exclusive - no more than one region per cluster can be assigned a given priority.
        /// * Example: If you have three regions, their priorities would be 7, 6, and 5 respectively. If you added two more regions for supporting electable nodes, the priorities of those regions would be 4 and 3 respectively.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Number of read-only nodes for Atlas to deploy to the region. Read-only nodes can never become the primary, but can facilitate local-reads. Specify 0 if you do not want any read-only nodes in the region.
        /// </summary>
        [Input("readOnlyNodes")]
        public Input<int>? ReadOnlyNodes { get; set; }

        /// <summary>
        /// Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        public ClusterReplicationSpecRegionsConfigGetArgs()
        {
        }
    }
}
