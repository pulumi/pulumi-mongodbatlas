// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterBiConnectorConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether or not BI Connector for Atlas is enabled on the cluster.l
        /// * 
        ///   - Set to `true` to enable BI Connector for Atlas.
        ///   - Set to `false` to disable BI Connector for Atlas.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
        /// - Set to "primary" to have BI Connector for Atlas read from the primary.
        /// 
        /// 
        /// - Set to "secondary" to have BI Connector for Atlas read from a secondary member. Default if there are no analytics nodes in the cluster.
        /// 
        /// 
        /// - Set to "analytics" to have BI Connector for Atlas read from an analytics node. Default if the cluster contains analytics nodes.
        /// </summary>
        [Input("readPreference")]
        public Input<string>? ReadPreference { get; set; }

        public ClusterBiConnectorConfigGetArgs()
        {
        }
        public static new ClusterBiConnectorConfigGetArgs Empty => new ClusterBiConnectorConfigGetArgs();
    }
}
