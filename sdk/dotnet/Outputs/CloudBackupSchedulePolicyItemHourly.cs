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
    public sealed class CloudBackupSchedulePolicyItemHourly
    {
        /// <summary>
        /// Desired frequency of the new backup policy item specified by `frequency_type` (hourly in this case). The supported values for hourly policies are `1`, `2`, `4`, `6`, `8` or `12` hours. Note that `12` hours is the only accepted value for NVMe clusters.
        /// </summary>
        public readonly int FrequencyInterval;
        /// <summary>
        /// Frequency associated with the backup policy item. For hourly policies, the frequency type is defined as `hourly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
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
        /// Value to associate with `retention_unit`.
        /// </summary>
        public readonly int RetentionValue;

        [OutputConstructor]
        private CloudBackupSchedulePolicyItemHourly(
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
