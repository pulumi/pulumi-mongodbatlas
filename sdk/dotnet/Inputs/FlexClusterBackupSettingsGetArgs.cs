// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FlexClusterBackupSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag that indicates whether backups are performed for this flex cluster. Backup uses TODO for flex clusters.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public FlexClusterBackupSettingsGetArgs()
        {
        }
        public static new FlexClusterBackupSettingsGetArgs Empty => new FlexClusterBackupSettingsGetArgs();
    }
}
