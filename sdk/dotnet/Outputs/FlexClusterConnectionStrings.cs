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
    public sealed class FlexClusterConnectionStrings
    {
        /// <summary>
        /// Public connection string that you can use to connect to this cluster. This connection string uses the mongodb:// protocol.
        /// </summary>
        public readonly string? Standard;
        /// <summary>
        /// Public connection string that you can use to connect to this flex cluster. This connection string uses the `mongodb+srv://` protocol.
        /// </summary>
        public readonly string? StandardSrv;

        [OutputConstructor]
        private FlexClusterConnectionStrings(
            string? standard,

            string? standardSrv)
        {
            Standard = standard;
            StandardSrv = standardSrv;
        }
    }
}
