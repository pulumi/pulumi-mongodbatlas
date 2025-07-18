// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class AdvancedClusterConnectionStringPrivateEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        [Input("endpoints")]
        private InputList<Inputs.AdvancedClusterConnectionStringPrivateEndpointEndpointGetArgs>? _endpoints;
        public InputList<Inputs.AdvancedClusterConnectionStringPrivateEndpointEndpointGetArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.AdvancedClusterConnectionStringPrivateEndpointEndpointGetArgs>());
            set => _endpoints = value;
        }

        [Input("srvConnectionString")]
        public Input<string>? SrvConnectionString { get; set; }

        [Input("srvShardOptimizedConnectionString")]
        public Input<string>? SrvShardOptimizedConnectionString { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public AdvancedClusterConnectionStringPrivateEndpointGetArgs()
        {
        }
        public static new AdvancedClusterConnectionStringPrivateEndpointGetArgs Empty => new AdvancedClusterConnectionStringPrivateEndpointGetArgs();
    }
}
