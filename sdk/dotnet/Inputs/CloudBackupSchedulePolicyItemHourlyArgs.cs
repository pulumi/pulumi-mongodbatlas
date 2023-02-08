// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudBackupSchedulePolicyItemHourlyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Desired frequency of the new backup policy item specified by `frequency_type` (hourly in this case). The supported values for hourly policies are `1`, `2`, `4`, `6`, `8` or `12` hours. Note that `12` hours is the only accepted value for NVMe clusters.
        /// </summary>
        [Input("frequencyInterval", required: true)]
        public Input<int> FrequencyInterval { get; set; } = null!;

        /// <summary>
        /// Frequency associated with the backup policy item. For hourly policies, the frequency type is defined as `hourly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
        /// </summary>
        [Input("frequencyType")]
        public Input<string>? FrequencyType { get; set; }

        /// <summary>
        /// Unique identifier of the backup policy item.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Scope of the backup policy item: `days`, `weeks`, or `months`.
        /// </summary>
        [Input("retentionUnit", required: true)]
        public Input<string> RetentionUnit { get; set; } = null!;

        /// <summary>
        /// Value to associate with `retention_unit`.
        /// </summary>
        [Input("retentionValue", required: true)]
        public Input<int> RetentionValue { get; set; } = null!;

        public CloudBackupSchedulePolicyItemHourlyArgs()
        {
        }
        public static new CloudBackupSchedulePolicyItemHourlyArgs Empty => new CloudBackupSchedulePolicyItemHourlyArgs();
    }
}
