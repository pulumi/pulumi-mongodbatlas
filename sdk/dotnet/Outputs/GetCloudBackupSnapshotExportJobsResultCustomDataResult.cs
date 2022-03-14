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
    public sealed class GetCloudBackupSnapshotExportJobsResultCustomDataResult
    {
        /// <summary>
        /// Custom data specified as key in the key and value pair.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Value for the key specified using `key`.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetCloudBackupSnapshotExportJobsResultCustomDataResult(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
