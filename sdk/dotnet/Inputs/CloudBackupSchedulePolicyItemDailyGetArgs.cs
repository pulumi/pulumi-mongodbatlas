// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudBackupSchedulePolicyItemDailyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
        /// </summary>
        [Input("frequencyInterval", required: true)]
        public Input<int> FrequencyInterval { get; set; } = null!;

        /// <summary>
        /// Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
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
        /// Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
        /// </summary>
        [Input("retentionValue", required: true)]
        public Input<int> RetentionValue { get; set; } = null!;

        public CloudBackupSchedulePolicyItemDailyGetArgs()
        {
        }
        public static new CloudBackupSchedulePolicyItemDailyGetArgs Empty => new CloudBackupSchedulePolicyItemDailyGetArgs();
    }
}
