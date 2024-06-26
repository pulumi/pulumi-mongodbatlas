// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudBackupScheduleCopySettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        [Input("frequencies")]
        private InputList<string>? _frequencies;
        public InputList<string> Frequencies
        {
            get => _frequencies ?? (_frequencies = new InputList<string>());
            set => _frequencies = value;
        }

        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        [Input("replicationSpecId")]
        public Input<string>? ReplicationSpecId { get; set; }

        [Input("shouldCopyOplogs")]
        public Input<bool>? ShouldCopyOplogs { get; set; }

        public CloudBackupScheduleCopySettingArgs()
        {
        }
        public static new CloudBackupScheduleCopySettingArgs Empty => new CloudBackupScheduleCopySettingArgs();
    }
}
