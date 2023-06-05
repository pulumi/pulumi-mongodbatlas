// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs : global::Pulumi.ResourceArgs
    {
        [Input("computeEnabled")]
        public Input<bool>? ComputeEnabled { get; set; }

        /// <summary>
        /// Maximum instance size to which your cluster can automatically scale (such as M40). Atlas requires this parameter if `replication_specs.#.region_configs.#.auto_scaling.0.compute_enabled` is true.
        /// </summary>
        [Input("computeMaxInstanceSize")]
        public Input<string>? ComputeMaxInstanceSize { get; set; }

        /// <summary>
        /// Minimum instance size to which your cluster can automatically scale (such as M10). Atlas requires this parameter if `replication_specs.#.region_configs.#.auto_scaling.0.compute_scale_down_enabled` is true.
        /// </summary>
        [Input("computeMinInstanceSize")]
        public Input<string>? ComputeMinInstanceSize { get; set; }

        /// <summary>
        /// Flag that indicates whether the instance size may scale down. Atlas requires this parameter if `replication_specs.#.region_configs.#.auto_scaling.0.compute_enabled` : true. If you enable this option, specify a value for `replication_specs.#.region_configs.#.auto_scaling.0.compute_min_instance_size`.
        /// </summary>
        [Input("computeScaleDownEnabled")]
        public Input<bool>? ComputeScaleDownEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether this cluster enables disk auto-scaling. This parameter defaults to true.
        /// </summary>
        [Input("diskGbEnabled")]
        public Input<bool>? DiskGbEnabled { get; set; }

        public AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs()
        {
        }
        public static new AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs Empty => new AdvancedClusterReplicationSpecRegionConfigAutoScalingArgs();
    }
}
