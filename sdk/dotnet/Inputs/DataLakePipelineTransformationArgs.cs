// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DataLakePipelineTransformationArgs : global::Pulumi.ResourceArgs
    {
        [Input("field")]
        public Input<string>? Field { get; set; }

        /// <summary>
        /// Type of ingestion source of this Data Lake Pipeline.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DataLakePipelineTransformationArgs()
        {
        }
        public static new DataLakePipelineTransformationArgs Empty => new DataLakePipelineTransformationArgs();
    }
}
