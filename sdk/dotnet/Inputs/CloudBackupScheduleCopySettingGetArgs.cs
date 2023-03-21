// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudBackupScheduleCopySettingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Human-readable label that identifies the cloud provider that stores the snapshot copy. i.e. "AWS" "AZURE" "GCP"
        /// </summary>
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        [Input("frequencies")]
        private InputList<string>? _frequencies;

        /// <summary>
        /// List that describes which types of snapshots to copy. i.e. "HOURLY" "DAILY" "WEEKLY" "MONTHLY" "ON_DEMAND"
        /// </summary>
        public InputList<string> Frequencies
        {
            get => _frequencies ?? (_frequencies = new InputList<string>());
            set => _frequencies = value;
        }

        /// <summary>
        /// Target region to copy snapshots belonging to replicationSpecId to. Please supply the 'Atlas Region' which can be found under https://www.mongodb.com/docs/atlas/reference/cloud-providers/ 'regions' link
        /// </summary>
        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the replication object for a zone in a cluster. For global clusters, there can be multiple zones to choose from. For sharded clusters and replica set clusters, there is only one zone in the cluster. To find the Replication Spec Id, do a GET request to Return One Cluster in One Project and consult the replicationSpecs array https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#operation/returnOneCluster
        /// </summary>
        [Input("replicationSpecId")]
        public Input<string>? ReplicationSpecId { get; set; }

        /// <summary>
        /// Flag that indicates whether to copy the oplogs to the target region. You can use the oplogs to perform point-in-time restores.
        /// </summary>
        [Input("shouldCopyOplogs")]
        public Input<bool>? ShouldCopyOplogs { get; set; }

        public CloudBackupScheduleCopySettingGetArgs()
        {
        }
        public static new CloudBackupScheduleCopySettingGetArgs Empty => new CloudBackupScheduleCopySettingGetArgs();
    }
}