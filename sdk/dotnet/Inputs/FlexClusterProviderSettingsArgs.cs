// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FlexClusterProviderSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud service provider on which MongoDB Cloud provisioned the flex cluster.
        /// </summary>
        [Input("backingProviderName", required: true)]
        public Input<string> BackingProviderName { get; set; } = null!;

        /// <summary>
        /// Storage capacity available to the flex cluster expressed in gigabytes.
        /// </summary>
        [Input("diskSizeGb")]
        public Input<double>? DiskSizeGb { get; set; }

        /// <summary>
        /// Human-readable label that identifies the cloud service provider.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Human-readable label that identifies the geographic location of your MongoDB flex cluster. The region you choose can affect network latency for clients accessing your databases. For a complete list of region names, see [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/#std-label-amazon-aws), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), and [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        [Input("regionName", required: true)]
        public Input<string> RegionName { get; set; } = null!;

        public FlexClusterProviderSettingsArgs()
        {
        }
        public static new FlexClusterProviderSettingsArgs Empty => new FlexClusterProviderSettingsArgs();
    }
}
