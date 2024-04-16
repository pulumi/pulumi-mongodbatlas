// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivatelinkEndpointServiceDataFederationOnlineArchives
    {
        /// <summary>
        /// `mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
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
        ///     var testDataSource = Mongodbatlas.GetPrivatelinkEndpointServiceDataFederationOnlineArchives.Invoke(new()
        ///     {
        ///         ProjectId = atlas_project.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult> InvokeAsync(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult>("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives", args ?? new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
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
        ///     var testDataSource = Mongodbatlas.GetPrivatelinkEndpointServiceDataFederationOnlineArchives.Invoke(new()
        ///     {
        ///         ProjectId = atlas_project.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult> Invoke(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult>("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives", args ?? new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs Empty => new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs();
    }

    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceDataFederationOnlineArchivesInvokeArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesInvokeArgs Empty => new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Private Endpoint Service
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultResult> Results;

        [OutputConstructor]
        private GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
