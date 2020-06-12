// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudProviderSnapshotRestoreJobDeliveryTypeArgs : Pulumi.ResourceArgs
    {
        [Input("automated")]
        public Input<bool>? Automated { get; set; }

        [Input("download")]
        public Input<bool>? Download { get; set; }

        [Input("oplogInc")]
        public Input<int>? OplogInc { get; set; }

        [Input("oplogTs")]
        public Input<int>? OplogTs { get; set; }

        [Input("pointInTime")]
        public Input<bool>? PointInTime { get; set; }

        [Input("pointInTimeUtcSeconds")]
        public Input<int>? PointInTimeUtcSeconds { get; set; }

        /// <summary>
        /// Name of the target Atlas cluster to which the restore job restores the snapshot. Only required if deliveryType is automated.
        /// </summary>
        [Input("targetClusterName")]
        public Input<string>? TargetClusterName { get; set; }

        [Input("targetProjectId")]
        public Input<string>? TargetProjectId { get; set; }

        public CloudProviderSnapshotRestoreJobDeliveryTypeArgs()
        {
        }
    }
}
