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
    public sealed class GlobalClusterConfigCustomZoneMapping
    {
        public readonly string? Location;
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
