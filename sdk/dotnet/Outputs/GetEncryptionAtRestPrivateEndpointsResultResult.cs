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
    public sealed class GetEncryptionAtRestPrivateEndpointsResultResult
    {
        /// <summary>
        /// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        /// </summary>
        public readonly string CloudProvider;
        /// <summary>
        /// Error message for failures associated with the Encryption At Rest private endpoint.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Connection name of the Azure Private Endpoint.
        /// </summary>
        public readonly string PrivateEndpointConnectionName;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Cloud provider region in which the Encryption At Rest private endpoint is located.
        /// </summary>
        public readonly string RegionName;
        /// <summary>
        /// State of the Encryption At Rest private endpoint.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetEncryptionAtRestPrivateEndpointsResultResult(
            string cloudProvider,

            string errorMessage,

            string id,

            string privateEndpointConnectionName,

            string projectId,

            string regionName,

            string status)
        {
            CloudProvider = cloudProvider;
            ErrorMessage = errorMessage;
            Id = id;
            PrivateEndpointConnectionName = privateEndpointConnectionName;
            ProjectId = projectId;
            RegionName = regionName;
            Status = status;
        }
    }
}