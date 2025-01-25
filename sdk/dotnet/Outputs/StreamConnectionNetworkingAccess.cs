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
    public sealed class StreamConnectionNetworkingAccess
    {
        /// <summary>
        /// Id of the Private Link connection when type is `PRIVATE_LINK`.
        /// </summary>
        public readonly string? ConnectionId;
        /// <summary>
        /// Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private StreamConnectionNetworkingAccess(
            string? connectionId,

            string type)
        {
            ConnectionId = connectionId;
            Type = type;
        }
    }
}