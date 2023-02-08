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
    public sealed class CloudBackupSchedulePolicyItemWeekly
    {
        /// <summary>
        /// Desired frequency of the new backup policy item specified by `frequency_type` (weekly in this case). The supported values for weekly policies are `1` through `7`, where `1` represents Monday and `7` represents Sunday.
        /// </summary>
        public readonly int FrequencyInterval;
        /// <summary>
        /// Frequency associated with the backup policy item. For weekly policies, the frequency type is defined as `weekly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
        /// </summary>
        public readonly string? FrequencyType;
        /// <summary>
        /// Unique identifier of the backup policy item.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Scope of the backup policy item: `days`, `weeks`, or `months`.
        /// </summary>
        public readonly string RetentionUnit;
        /// <summary>
        /// Value to associate with `retention_unit`. Weekly policy must have retention of at least 7 days or 1 week. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the daily policy item specifies a retention of two weeks, the weekly retention policy must specify two weeks or greater.
        /// </summary>
        public readonly int RetentionValue;

        [OutputConstructor]
        private CloudBackupSchedulePolicyItemWeekly(
            int frequencyInterval,

            string? frequencyType,

            string? id,

            string retentionUnit,

            int retentionValue)
        {
            FrequencyInterval = frequencyInterval;
            FrequencyType = frequencyType;
            Id = id;
            RetentionUnit = retentionUnit;
            RetentionValue = retentionValue;
        }
    }
}
