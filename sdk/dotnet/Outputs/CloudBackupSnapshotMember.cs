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
    public sealed class CloudBackupSnapshotMember
    {
        /// <summary>
        /// Cloud provider that stores this snapshot.
        /// </summary>
        public readonly string? CloudProvider;
        /// <summary>
        /// Unique identifier for the sharded cluster snapshot.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Label given to a shard or config server from which Atlas took this snapshot.
        /// </summary>
        public readonly string? ReplicaSetName;

        [OutputConstructor]
        private CloudBackupSnapshotMember(
            string? cloudProvider,

            string? id,

            string? replicaSetName)
        {
            CloudProvider = cloudProvider;
            Id = id;
            ReplicaSetName = replicaSetName;
        }
    }
}
