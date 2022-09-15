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
    public sealed class ClusterSnapshotBackupPolicyPolicyPolicyItem
    {
        public readonly int? FrequencyInterval;
        public readonly string? FrequencyType;
        /// <summary>
        /// Unique identifer of the replication document for a zone in a Global Cluster.
        /// </summary>
        public readonly string? Id;
        public readonly string? RetentionUnit;
        public readonly int? RetentionValue;

        [OutputConstructor]
        private ClusterSnapshotBackupPolicyPolicyPolicyItem(
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
