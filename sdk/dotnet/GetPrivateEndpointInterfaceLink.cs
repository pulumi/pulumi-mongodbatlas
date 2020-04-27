// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivateEndpointInterfaceLink
    {
        /// <summary>
        /// `mongodbatlas_private_endpoint_link` describe a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrivateEndpointInterfaceLinkResult> InvokeAsync(GetPrivateEndpointInterfaceLinkArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPrivateEndpointInterfaceLinkResult>("mongodbatlas:index/getPrivateEndpointInterfaceLink:getPrivateEndpointInterfaceLink", args ?? new GetPrivateEndpointInterfaceLinkArgs(), options.WithVersion());
    }


    public sealed class GetPrivateEndpointInterfaceLinkArgs : Pulumi.InvokeArgs
    {
        [Input("interfaceEndpointId", required: true)]
        public string InterfaceEndpointId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the AWS PrivateLink connection.
        /// </summary>
        [Input("privateLinkId", required: true)]
        public string PrivateLinkId { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPrivateEndpointInterfaceLinkArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetPrivateEndpointInterfaceLinkResult
    {
        /// <summary>
        /// Status of the interface endpoint.
        /// Returns one of the following values:
        /// </summary>
        public readonly string ConnectionStatus;
        /// <summary>
        /// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        /// </summary>
        public readonly bool DeleteRequested;
        /// <summary>
        /// Error message pertaining to the interface endpoint. Returns null if there are no errors.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InterfaceEndpointId;
        public readonly string PrivateLinkId;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetPrivateEndpointInterfaceLinkResult(
            string connectionStatus,

            bool deleteRequested,

            string errorMessage,

            string id,

            string interfaceEndpointId,

            string privateLinkId,

            string projectId)
        {
            ConnectionStatus = connectionStatus;
            DeleteRequested = deleteRequested;
            ErrorMessage = errorMessage;
            Id = id;
            InterfaceEndpointId = interfaceEndpointId;
            PrivateLinkId = privateLinkId;
            ProjectId = projectId;
        }
    }
}
