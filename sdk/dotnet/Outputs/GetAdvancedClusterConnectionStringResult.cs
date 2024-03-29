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
    public sealed class GetAdvancedClusterConnectionStringResult
    {
        public readonly string Private;
        public readonly ImmutableArray<Outputs.GetAdvancedClusterConnectionStringPrivateEndpointResult> PrivateEndpoints;
        public readonly string PrivateSrv;
        public readonly string Standard;
        public readonly string StandardSrv;

        [OutputConstructor]
        private GetAdvancedClusterConnectionStringResult(
            string @private,

            ImmutableArray<Outputs.GetAdvancedClusterConnectionStringPrivateEndpointResult> privateEndpoints,

            string privateSrv,

            string standard,

            string standardSrv)
        {
            Private = @private;
            PrivateEndpoints = privateEndpoints;
            PrivateSrv = privateSrv;
            Standard = standard;
            StandardSrv = standardSrv;
        }
    }
}
