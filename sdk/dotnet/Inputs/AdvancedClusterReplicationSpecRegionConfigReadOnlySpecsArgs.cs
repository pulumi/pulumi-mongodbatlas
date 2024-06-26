// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can't set this parameter for a multi-cloud cluster.
        /// </summary>
        [Input("diskIops")]
        public Input<int>? DiskIops { get; set; }

        /// <summary>
        /// Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can't set this parameter for a multi-cloud cluster. Valid values are:
        /// * `STANDARD` volume types can't exceed the default IOPS rate for the selected volume size.
        /// * `PROVISIONED` volume types must fall within the allowable IOPS range for the selected volume size.
        /// </summary>
        [Input("ebsVolumeType")]
        public Input<string>? EbsVolumeType { get; set; }

        /// <summary>
        /// Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
        /// </summary>
        [Input("instanceSize", required: true)]
        public Input<string> InstanceSize { get; set; } = null!;

        /// <summary>
        /// Number of nodes of the given type for MongoDB Atlas to deploy to the region.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        public AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs()
        {
        }
        public static new AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs Empty => new AdvancedClusterReplicationSpecRegionConfigReadOnlySpecsArgs();
    }
}
