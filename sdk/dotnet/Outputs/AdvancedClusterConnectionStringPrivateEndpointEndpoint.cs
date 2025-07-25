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
    public sealed class AdvancedClusterConnectionStringPrivateEndpointEndpoint
    {
        public readonly string? EndpointId;
        /// <summary>
        /// Cloud service provider on which the servers are provisioned.
        /// The possible values are:
        /// - `AWS` - Amazon AWS
        /// - `GCP` - Google Cloud Platform
        /// - `AZURE` - Microsoft Azure
        /// - `TENANT` - M0 multi-tenant cluster. Use `replication_specs.#.region_configs.#.backing_provider_name` to set the cloud service provider.
        /// </summary>
        public readonly string? ProviderName;
        public readonly string? Region;

        [OutputConstructor]
        private AdvancedClusterConnectionStringPrivateEndpointEndpoint(
            string? endpointId,

            string? providerName,

            string? region)
        {
            EndpointId = endpointId;
            ProviderName = providerName;
            Region = region;
        }
    }
}
