// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivateLinkEndpointService
    {
        /// <summary>
        /// `mongodbatlas.PrivateLinkEndpointService` describe a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Task<GetPrivateLinkEndpointServiceResult> InvokeAsync(GetPrivateLinkEndpointServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivateLinkEndpointServiceResult>("mongodbatlas:index/getPrivateLinkEndpointService:getPrivateLinkEndpointService", args ?? new GetPrivateLinkEndpointServiceArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.PrivateLinkEndpointService` describe a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Output<GetPrivateLinkEndpointServiceResult> Invoke(GetPrivateLinkEndpointServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateLinkEndpointServiceResult>("mongodbatlas:index/getPrivateLinkEndpointService:getPrivateLinkEndpointService", args ?? new GetPrivateLinkEndpointServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateLinkEndpointServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the `AWS` or `AZURE` resource.
        /// </summary>
        [Input("endpointServiceId", required: true)]
        public string EndpointServiceId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
        /// </summary>
        [Input("privateLinkId", required: true)]
        public string PrivateLinkId { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        /// </summary>
        [Input("providerName", required: true)]
        public string ProviderName { get; set; } = null!;

        public GetPrivateLinkEndpointServiceArgs()
        {
        }
        public static new GetPrivateLinkEndpointServiceArgs Empty => new GetPrivateLinkEndpointServiceArgs();
    }

    public sealed class GetPrivateLinkEndpointServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the `AWS` or `AZURE` resource.
        /// </summary>
        [Input("endpointServiceId", required: true)]
        public Input<string> EndpointServiceId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
        /// </summary>
        [Input("privateLinkId", required: true)]
        public Input<string> PrivateLinkId { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        public GetPrivateLinkEndpointServiceInvokeArgs()
        {
        }
        public static new GetPrivateLinkEndpointServiceInvokeArgs Empty => new GetPrivateLinkEndpointServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivateLinkEndpointServiceResult
    {
        /// <summary>
        /// Status of the interface endpoint for AWS.
        /// Returns one of the following values:
        /// </summary>
        public readonly string AwsConnectionStatus;
        /// <summary>
        /// Status of the interface endpoint for AZURE.
        /// Returns one of the following values:
        /// </summary>
        public readonly string AzureStatus;
        /// <summary>
        /// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        /// </summary>
        public readonly bool DeleteRequested;
        public readonly string EndpointServiceId;
        /// <summary>
        /// Collection of individual private endpoints that comprise your network endpoint group.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkEndpointServiceEndpointResult> Endpoints;
        /// <summary>
        /// Error message pertaining to the interface endpoint. Returns null if there are no errors.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// Status of the interface endpoint for GCP.
        /// Returns one of the following values:
        /// </summary>
        public readonly string GcpStatus;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the interface endpoint.
        /// </summary>
        public readonly string InterfaceEndpointId;
        /// <summary>
        /// Name of the connection for this private endpoint that Atlas generates.
        /// </summary>
        public readonly string PrivateEndpointConnectionName;
        /// <summary>
        /// Private IP address of the private endpoint network interface.
        /// </summary>
        public readonly string PrivateEndpointIpAddress;
        /// <summary>
        /// Unique identifier of the private endpoint.
        /// </summary>
        public readonly string PrivateEndpointResourceId;
        public readonly string PrivateLinkId;
        public readonly string ProjectId;
        public readonly string ProviderName;

        [OutputConstructor]
        private GetPrivateLinkEndpointServiceResult(
            string awsConnectionStatus,

            string azureStatus,

            bool deleteRequested,

            string endpointServiceId,

            ImmutableArray<Outputs.GetPrivateLinkEndpointServiceEndpointResult> endpoints,

            string errorMessage,

            string gcpStatus,

            string id,

            string interfaceEndpointId,

            string privateEndpointConnectionName,

            string privateEndpointIpAddress,

            string privateEndpointResourceId,

            string privateLinkId,

            string projectId,

            string providerName)
        {
            AwsConnectionStatus = awsConnectionStatus;
            AzureStatus = azureStatus;
            DeleteRequested = deleteRequested;
            EndpointServiceId = endpointServiceId;
            Endpoints = endpoints;
            ErrorMessage = errorMessage;
            GcpStatus = gcpStatus;
            Id = id;
            InterfaceEndpointId = interfaceEndpointId;
            PrivateEndpointConnectionName = privateEndpointConnectionName;
            PrivateEndpointIpAddress = privateEndpointIpAddress;
            PrivateEndpointResourceId = privateEndpointResourceId;
            PrivateLinkId = privateLinkId;
            ProjectId = projectId;
            ProviderName = providerName;
        }
    }
}
