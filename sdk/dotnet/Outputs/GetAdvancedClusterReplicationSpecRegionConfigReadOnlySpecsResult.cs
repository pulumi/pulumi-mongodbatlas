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
    public sealed class GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecsResult
    {
        /// <summary>
        /// Target IOPS (Input/Output Operations Per Second) desired for storage attached to this hardware. This parameter defaults to the cluster tier's standard IOPS value.
        /// </summary>
        public readonly int DiskIops;
        /// <summary>
        /// Storage capacity that the host's root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
        /// </summary>
        public readonly double DiskSizeGb;
        /// <summary>
        /// Type of storage you want to attach to your AWS-provisioned cluster.
        /// * `STANDARD` volume types can't exceed the default IOPS rate for the selected volume size.
        /// * `PROVISIONED` volume types must fall within the allowable IOPS range for the selected volume size.
        /// </summary>
        public readonly string EbsVolumeType;
        /// <summary>
        /// Hardware specification for the instance sizes in this region.
        /// </summary>
        public readonly string InstanceSize;
        /// <summary>
        /// Number of nodes of the given type for MongoDB Atlas to deploy to the region.
        /// </summary>
        public readonly int? NodeCount;

        [OutputConstructor]
        private GetAdvancedClusterReplicationSpecRegionConfigReadOnlySpecsResult(
            int diskIops,

            double diskSizeGb,

            string ebsVolumeType,

            string instanceSize,

            int? nodeCount)
        {
            DiskIops = diskIops;
            DiskSizeGb = diskSizeGb;
            EbsVolumeType = ebsVolumeType;
            InstanceSize = instanceSize;
            NodeCount = nodeCount;
        }
    }
}
