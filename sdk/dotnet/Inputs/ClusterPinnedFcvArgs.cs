// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ClusterPinnedFcvArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expiration date of the fixed FCV. This value is in the ISO 8601 timestamp format (e.g. "2024-12-04T16:25:00Z"). Note that this field cannot exceed 4 weeks from the pinned date.
        /// </summary>
        [Input("expirationDate", required: true)]
        public Input<string> ExpirationDate { get; set; } = null!;

        /// <summary>
        /// Feature compatibility version of the cluster.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ClusterPinnedFcvArgs()
        {
        }
        public static new ClusterPinnedFcvArgs Empty => new ClusterPinnedFcvArgs();
    }
}
