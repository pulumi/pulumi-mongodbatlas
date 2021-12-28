// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class PrivateLinkEndpointServiceEndpointArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Forwarding rule that corresponds to the endpoint you created in GCP.
        /// </summary>
        [Input("endpointName")]
        public Input<string>? EndpointName { get; set; }

        /// <summary>
        /// Private IP address of the endpoint you created in GCP.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Unique alphanumeric and special character strings that identify the service attachment associated with the endpoint.
        /// </summary>
        [Input("serviceAttachmentName")]
        public Input<string>? ServiceAttachmentName { get; set; }

        /// <summary>
        /// Status of the endpoint. Atlas returns one of the [values shown above](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/#std-label-ref-status-field).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public PrivateLinkEndpointServiceEndpointArgs()
        {
        }
    }
}
