// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivatelinkEndpointServiceDataFederationOnlineArchive
    {
        /// <summary>
        /// `mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive` describes a Private Endpoint Service resource for Data Federation and Online Archive.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var atlas_project = new Mongodbatlas.Project("atlas-project", new()
        ///     {
        ///         OrgId = atlasOrgId,
        ///         Name = atlasProjectName,
        ///     });
        /// 
        ///     var test = new Mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test", new()
        ///     {
        ///         ProjectId = atlas_project.Id,
        ///         EndpointId = "vpce-046cf43c79424d4c9",
        ///         ProviderName = "AWS",
        ///         Comment = "Test",
        ///         Region = "US_EAST_1",
        ///         CustomerEndpointDnsName = "vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com",
        ///     });
        /// 
        ///     var testDataSource = Mongodbatlas.GetPrivatelinkEndpointServiceDataFederationOnlineArchive.Invoke(new()
        ///     {
        ///         ProjectId = atlas_project.Id,
        ///         EndpointId = test.EndpointId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult> InvokeAsync(GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult>("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchive:getPrivatelinkEndpointServiceDataFederationOnlineArchive", args ?? new GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive` describes a Private Endpoint Service resource for Data Federation and Online Archive.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var atlas_project = new Mongodbatlas.Project("atlas-project", new()
        ///     {
        ///         OrgId = atlasOrgId,
        ///         Name = atlasProjectName,
        ///     });
        /// 
        ///     var test = new Mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test", new()
        ///     {
        ///         ProjectId = atlas_project.Id,
        ///         EndpointId = "vpce-046cf43c79424d4c9",
        ///         ProviderName = "AWS",
        ///         Comment = "Test",
        ///         Region = "US_EAST_1",
        ///         CustomerEndpointDnsName = "vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com",
        ///     });
        /// 
        ///     var testDataSource = Mongodbatlas.GetPrivatelinkEndpointServiceDataFederationOnlineArchive.Invoke(new()
        ///     {
        ///         ProjectId = atlas_project.Id,
        ///         EndpointId = test.EndpointId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult> Invoke(GetPrivatelinkEndpointServiceDataFederationOnlineArchiveInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult>("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchive:getPrivatelinkEndpointServiceDataFederationOnlineArchive", args ?? new GetPrivatelinkEndpointServiceDataFederationOnlineArchiveInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        /// </summary>
        [Input("endpointId", required: true)]
        public string EndpointId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs Empty => new GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs();
    }

    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchiveInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceDataFederationOnlineArchiveInvokeArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceDataFederationOnlineArchiveInvokeArgs Empty => new GetPrivatelinkEndpointServiceDataFederationOnlineArchiveInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult
    {
        /// <summary>
        /// Human-readable string to associate with this private endpoint.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// (Optional) Human-readable label to identify VPC endpoint DNS name.
        /// </summary>
        public readonly string CustomerEndpointDnsName;
        public readonly string EndpointId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// Human-readable label that identifies the cloud service provider.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Human-readable label that identifies the resource type associated with this private endpoint.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult(
            string comment,

            string customerEndpointDnsName,

            string endpointId,

            string id,

            string projectId,

            string providerName,

            string region,

            string type)
        {
            Comment = comment;
            CustomerEndpointDnsName = customerEndpointDnsName;
            EndpointId = endpointId;
            Id = id;
            ProjectId = projectId;
            ProviderName = providerName;
            Region = region;
            Type = type;
        }
    }
}
