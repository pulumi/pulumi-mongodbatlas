// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DataLakeDataProcessRegionArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudProvider", required: true)]
        public Input<string> CloudProvider { get; set; } = null!;

        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public DataLakeDataProcessRegionArgs()
        {
        }
        public static new DataLakeDataProcessRegionArgs Empty => new DataLakeDataProcessRegionArgs();
    }
}
