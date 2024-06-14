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
    public sealed class ClusterConnectionStringPrivateEndpoint
    {
        public readonly string? ConnectionString;
        public readonly ImmutableArray<Outputs.ClusterConnectionStringPrivateEndpointEndpoint> Endpoints;
        public readonly string? SrvConnectionString;
        public readonly string? SrvShardOptimizedConnectionString;
        public readonly string? Type;

        [OutputConstructor]
        private ClusterConnectionStringPrivateEndpoint(
            string? connectionString,

            ImmutableArray<Outputs.ClusterConnectionStringPrivateEndpointEndpoint> endpoints,

            string? srvConnectionString,

            string? srvShardOptimizedConnectionString,

            string? type)
        {
            ConnectionString = connectionString;
            Endpoints = endpoints;
            SrvConnectionString = srvConnectionString;
            SrvShardOptimizedConnectionString = srvShardOptimizedConnectionString;
            Type = type;
        }
    }
}