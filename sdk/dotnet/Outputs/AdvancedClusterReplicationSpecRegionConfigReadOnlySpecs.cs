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
    public sealed class AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs
    {
        /// <summary>
        /// Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can't set this parameter for a multi-cloud cluster.
        /// </summary>
        public readonly int? DiskIops;
        /// <summary>
        /// Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can't set this parameter for a multi-cloud cluster. Valid values are:
        /// </summary>
        public readonly string? EbsVolumeType;
        /// <summary>
        /// Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
        /// </summary>
        public readonly string InstanceSize;
        /// <summary>
        /// Number of read-only nodes for Atlas to deploy to the region. Read-only nodes can never become the [primary](https://docs.atlas.mongodb.com/reference/glossary/#std-term-primary), but can enable local reads.
        /// </summary>
        public readonly int? NodeCount;

        [OutputConstructor]
        private AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs(
            int? diskIops,

            string? ebsVolumeType,

            string instanceSize,

            int? nodeCount)
        {
            DiskIops = diskIops;
            EbsVolumeType = ebsVolumeType;
            InstanceSize = instanceSize;
            NodeCount = nodeCount;
        }
    }
}
