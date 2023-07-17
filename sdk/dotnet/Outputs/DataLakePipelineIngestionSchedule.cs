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
    public sealed class DataLakePipelineIngestionSchedule
    {
        public readonly int? FrequencyInterval;
        public readonly string? FrequencyType;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
        /// </summary>
        public readonly string? Id;
        public readonly string? RetentionUnit;
        public readonly int? RetentionValue;

        [OutputConstructor]
        private DataLakePipelineIngestionSchedule(
            int? frequencyInterval,

            string? frequencyType,

            string? id,

            string? retentionUnit,

            int? retentionValue)
        {
            FrequencyInterval = frequencyInterval;
            FrequencyType = frequencyType;
            Id = id;
            RetentionUnit = retentionUnit;
            RetentionValue = retentionValue;
        }
    }
}