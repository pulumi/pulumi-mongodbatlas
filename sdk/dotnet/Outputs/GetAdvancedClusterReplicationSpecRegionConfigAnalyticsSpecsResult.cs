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
    public sealed class GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsResult
    {
        /// <summary>
        /// Target throughput (IOPS) desired for AWS storage attached to your cluster.
        /// </summary>
        public readonly int? DiskIops;
        /// <summary>
        /// Type of storage you want to attach to your AWS-provisioned cluster.
        /// </summary>
        public readonly string? EbsVolumeType;
        /// <summary>
        /// Hardware specification for the instance sizes in this region.
        /// </summary>
        public readonly string InstanceSize;
        /// <summary>
        /// Number of nodes of the given type for MongoDB Atlas to deploy to the region.
        /// </summary>
        public readonly int? NodeCount;

        [OutputConstructor]
        private GetAdvancedClusterReplicationSpecRegionConfigAnalyticsSpecsResult(
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
