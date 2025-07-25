// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GlobalClusterConfigCustomZoneMapping
    {
        /// <summary>
        /// The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// The name of the zone in your Global Cluster that you want to map to location.
        /// </summary>
        public readonly string? Zone;

        [OutputConstructor]
        private GlobalClusterConfigCustomZoneMapping(
            string? location,

            string? zone)
        {
            Location = location;
            Zone = zone;
        }
    }
}
