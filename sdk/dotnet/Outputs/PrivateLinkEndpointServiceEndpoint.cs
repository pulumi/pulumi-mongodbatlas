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
    public sealed class PrivateLinkEndpointServiceEndpoint
    {
        /// <summary>
        /// Forwarding rule that corresponds to the endpoint you created in GCP.
        /// </summary>
        public readonly string? EndpointName;
        /// <summary>
        /// Private IP address of the endpoint you created in GCP.
        /// </summary>
        public readonly string? IpAddress;
        /// <summary>
        /// Status of the endpoint. Atlas returns one of the [values shown above](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/#std-label-ref-status-field).
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private PrivateLinkEndpointServiceEndpoint(
            string? endpointName,

            string? ipAddress,

            string? status)
        {
            EndpointName = endpointName;
            IpAddress = ipAddress;
            Status = status;
        }
    }
}
