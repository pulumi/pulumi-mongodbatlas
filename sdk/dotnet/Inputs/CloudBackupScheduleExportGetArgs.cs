// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudBackupScheduleExportGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of the mongodbatlas.CloudBackupSnapshotExportBucket export_bucket_id value.
        /// </summary>
        [Input("exportBucketId")]
        public Input<string>? ExportBucketId { get; set; }

        /// <summary>
        /// Frequency associated with the export snapshot item: `weekly`, `monthly`, `yearly`, `daily` (requires reaching out to Customer Support)
        /// </summary>
        [Input("frequencyType")]
        public Input<string>? FrequencyType { get; set; }

        public CloudBackupScheduleExportGetArgs()
        {
        }
        public static new CloudBackupScheduleExportGetArgs Empty => new CloudBackupScheduleExportGetArgs();
    }
}
