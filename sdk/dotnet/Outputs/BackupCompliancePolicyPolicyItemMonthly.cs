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
    public sealed class BackupCompliancePolicyPolicyItemMonthly
    {
        /// <summary>
        /// Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
        /// </summary>
        public readonly int FrequencyInterval;
        /// <summary>
        /// Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
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
        /// Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
        /// </summary>
        public readonly int RetentionValue;

        [OutputConstructor]
        private BackupCompliancePolicyPolicyItemMonthly(
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
