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
    public sealed class GetDataLakePipelineSnapshotResult
    {
        public readonly string CopyRegion;
        public readonly string CreatedAt;
        public readonly string ExpiresAt;
        public readonly string FrequencyYype;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
        /// </summary>
        public readonly string Id;
        public readonly string MasterKey;
        public readonly string MongodVersion;
        public readonly ImmutableArray<string> Policies;
        /// <summary>
        /// Target cloud provider for this Data Lake Pipeline.
        /// </summary>
        public readonly string Provider;
        public readonly string ReplicaSetName;
        public readonly int Size;
        public readonly string Status;
        /// <summary>
        /// Type of ingestion source of this Data Lake Pipeline.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDataLakePipelineSnapshotResult(
            string copyRegion,

            string createdAt,

            string expiresAt,

            string frequencyYype,

            string id,

            string masterKey,

            string mongodVersion,

            ImmutableArray<string> policies,

            string provider,

            string replicaSetName,

            int size,

            string status,

            string type)
        {
            CopyRegion = copyRegion;
            CreatedAt = createdAt;
            ExpiresAt = expiresAt;
            FrequencyYype = frequencyYype;
            Id = id;
            MasterKey = masterKey;
            MongodVersion = mongodVersion;
            Policies = policies;
            Provider = provider;
            ReplicaSetName = replicaSetName;
            Size = size;
            Status = status;
            Type = type;
        }
    }
}
