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
    public sealed class AdvancedClusterReplicationSpecRegionConfigAutoScaling
    {
        public readonly bool? ComputeEnabled;
        /// <summary>
        /// Maximum instance size to which your cluster can automatically scale (such as M40). Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_enabled` is true.
        /// </summary>
        public readonly string? ComputeMaxInstanceSize;
        /// <summary>
        /// Minimum instance size to which your cluster can automatically scale (such as M10). Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_scale_down_enabled` is true.
        /// </summary>
        public readonly string? ComputeMinInstanceSize;
        /// <summary>
        /// Flag that indicates whether the instance size may scale down. Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_enabled` : true. If you enable this option, specify a value for `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_min_instance_size`.
        /// </summary>
        public readonly bool? ComputeScaleDownEnabled;
        public readonly bool? DiskGbEnabled;

        [OutputConstructor]
        private AdvancedClusterReplicationSpecRegionConfigAutoScaling(
            bool? computeEnabled,

            string? computeMaxInstanceSize,

            string? computeMinInstanceSize,

            bool? computeScaleDownEnabled,

            bool? diskGbEnabled)
        {
            ComputeEnabled = computeEnabled;
            ComputeMaxInstanceSize = computeMaxInstanceSize;
            ComputeMinInstanceSize = computeMinInstanceSize;
            ComputeScaleDownEnabled = computeScaleDownEnabled;
            DiskGbEnabled = diskGbEnabled;
        }
    }
}
