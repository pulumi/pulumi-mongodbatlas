// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivatelinkEndpointServiceAdl
    {
        /// <summary>
        /// `privatelink_endpoint_service_adl` Provides an Atlas Data Lake (ADL) and Online Archive PrivateLink endpoint resource.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrivatelinkEndpointServiceAdlResult> InvokeAsync(GetPrivatelinkEndpointServiceAdlArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivatelinkEndpointServiceAdlResult>("mongodbatlas:index/getPrivatelinkEndpointServiceAdl:getPrivatelinkEndpointServiceAdl", args ?? new GetPrivatelinkEndpointServiceAdlArgs(), options.WithDefaults());

        /// <summary>
        /// `privatelink_endpoint_service_adl` Provides an Atlas Data Lake (ADL) and Online Archive PrivateLink endpoint resource.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrivatelinkEndpointServiceAdlResult> Invoke(GetPrivatelinkEndpointServiceAdlInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivatelinkEndpointServiceAdlResult>("mongodbatlas:index/getPrivatelinkEndpointServiceAdl:getPrivatelinkEndpointServiceAdl", args ?? new GetPrivatelinkEndpointServiceAdlInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivatelinkEndpointServiceAdlArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [|aws| PrivateLink](https://aws.amazon.com/privatelink/) feature.
        /// </summary>
        [Input("endpointId", required: true)]
        public string EndpointId { get; set; } = null!;

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceAdlArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceAdlArgs Empty => new GetPrivatelinkEndpointServiceAdlArgs();
    }

    public sealed class GetPrivatelinkEndpointServiceAdlInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [|aws| PrivateLink](https://aws.amazon.com/privatelink/) feature.
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceAdlInvokeArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceAdlInvokeArgs Empty => new GetPrivatelinkEndpointServiceAdlInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivatelinkEndpointServiceAdlResult
    {
        /// <summary>
        /// Human-readable string to associate with this private endpoint.
        /// </summary>
        public readonly string Comment;
        public readonly string EndpointId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// Human-readable label that identifies the cloud provider for this endpoint.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Human-readable label that identifies the type of resource to associate with this private endpoint.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPrivatelinkEndpointServiceAdlResult(
            string comment,

            string endpointId,

            string id,

            string projectId,

            string providerName,

            string type)
        {
            Comment = comment;
            EndpointId = endpointId;
            Id = id;
            ProjectId = projectId;
            ProviderName = providerName;
            Type = type;
        }
    }
}
