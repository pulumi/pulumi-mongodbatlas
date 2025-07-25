// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetCloudBackupSchedulePolicyItemDailyResult
    {
        /// <summary>
        /// Desired frequency of the new backup policy item specified by `frequency_type` (yearly in this case). The supported values for yearly policies are
        /// </summary>
        public readonly int FrequencyInterval;
        /// <summary>
        /// Frequency associated with the backup policy item. For yearly policies, the frequency type is defined as `yearly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
        /// </summary>
        public readonly string FrequencyType;
        /// <summary>
        /// Unique identifier of the backup policy item.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Scope of the backup policy item: `days`, `weeks`, `months`, or `years`.
        /// </summary>
        public readonly string RetentionUnit;
        /// <summary>
        /// Value to associate with `retention_unit`. Yearly policy must have retention of at least 1 year.
        /// </summary>
        public readonly int RetentionValue;

        [OutputConstructor]
        private GetCloudBackupSchedulePolicyItemDailyResult(
            int frequencyInterval,

            string frequencyType,

            string id,

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
