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
    public sealed class GetAdvancedClustersResultConnectionStringPrivateEndpointEndpointResult
    {
        public readonly string EndpointId;
        /// <summary>
        /// Cloud service provider on which the servers are provisioned.
        /// </summary>
        public readonly string ProviderName;
        public readonly string Region;

        [OutputConstructor]
        private GetAdvancedClustersResultConnectionStringPrivateEndpointEndpointResult(
            string endpointId,

            string providerName,

            string region)
        {
            EndpointId = endpointId;
            ProviderName = providerName;
            Region = region;
        }
    }
}