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
    public sealed class GetFlexClustersResultBackupSettingsResult
    {
        /// <summary>
        /// Flag that indicates whether backups are performed for this flex cluster. Backup uses [flex cluster backups](https://www.mongodb.com/docs/atlas/backup/cloud-backup/flex-cluster-backup/).
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private GetFlexClustersResultBackupSettingsResult(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
