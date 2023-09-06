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
    public sealed class AdvancedClusterLabel
    {
        /// <summary>
        /// The key that you want to write.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// The value that you want to write.
        /// 
        /// &gt; **NOTE:** MongoDB Atlas doesn't display your labels.
        /// &gt; **NOTE:** Cluster labels are not the same as [resource TAGs](https://www.mongodb.com/docs/atlas/tags/). We plan to add [resource TAGs](https://www.mongodb.com/docs/atlas/tags/) support in a future release.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private AdvancedClusterLabel(
            string? key,

            string? value)
        {
            Key = key;
            Value = value;
        }
    }
}
