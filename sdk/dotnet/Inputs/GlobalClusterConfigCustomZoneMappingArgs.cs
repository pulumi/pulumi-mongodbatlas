// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class GlobalClusterConfigCustomZoneMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the zone in your Global Cluster that you want to map to location.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GlobalClusterConfigCustomZoneMappingArgs()
        {
        }
        public static new GlobalClusterConfigCustomZoneMappingArgs Empty => new GlobalClusterConfigCustomZoneMappingArgs();
    }
}
