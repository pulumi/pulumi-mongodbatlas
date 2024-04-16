// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivatelinkEndpointsServiceServerless
    {
        /// <summary>
        /// `privatelink_endpoints_service_serverless` Describes the list of all Serverless PrivateLink Endpoint Service resource.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example with AWS
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
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         Name = "test-db",
        ///         ProviderSettingsBackingProviderName = "AWS",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST_1",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetPrivatelinkEndpointsServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///         ProviderName = "AWS",
        ///         Comment = "New serverless endpoint",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Example with AZURE
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
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         Name = "test-db",
        ///         ProviderSettingsBackingProviderName = "AZURE",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetPrivatelinkEndpointsServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AZURE",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///         ProviderName = "AZURE",
        ///         Comment = "New serverless endpoint",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetPrivatelinkEndpointsServiceServerlessResult> InvokeAsync(GetPrivatelinkEndpointsServiceServerlessArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivatelinkEndpointsServiceServerlessResult>("mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless", args ?? new GetPrivatelinkEndpointsServiceServerlessArgs(), options.WithDefaults());

        /// <summary>
        /// `privatelink_endpoints_service_serverless` Describes the list of all Serverless PrivateLink Endpoint Service resource.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example with AWS
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
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         Name = "test-db",
        ///         ProviderSettingsBackingProviderName = "AWS",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST_1",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetPrivatelinkEndpointsServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///         ProviderName = "AWS",
        ///         Comment = "New serverless endpoint",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Example with AZURE
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
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         Name = "test-db",
        ///         ProviderSettingsBackingProviderName = "AZURE",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetPrivatelinkEndpointsServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AZURE",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///         ProviderName = "AZURE",
        ///         Comment = "New serverless endpoint",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetPrivatelinkEndpointsServiceServerlessResult> Invoke(GetPrivatelinkEndpointsServiceServerlessInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivatelinkEndpointsServiceServerlessResult>("mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless", args ?? new GetPrivatelinkEndpointsServiceServerlessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivatelinkEndpointsServiceServerlessArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the serverless instance
        /// </summary>
        [Input("instanceName", required: true)]
        public string InstanceName { get; set; } = null!;

        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        [Input("pageNum")]
        public int? PageNum { get; set; }

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointsServiceServerlessArgs()
        {
        }
        public static new GetPrivatelinkEndpointsServiceServerlessArgs Empty => new GetPrivatelinkEndpointsServiceServerlessArgs();
    }

    public sealed class GetPrivatelinkEndpointsServiceServerlessInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the serverless instance
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointsServiceServerlessInvokeArgs()
        {
        }
        public static new GetPrivatelinkEndpointsServiceServerlessInvokeArgs Empty => new GetPrivatelinkEndpointsServiceServerlessInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivatelinkEndpointsServiceServerlessResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceName;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        public readonly string ProjectId;
        /// <summary>
        /// Each element in the `result` array is one private serverless endpoint.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivatelinkEndpointsServiceServerlessResultResult> Results;

        [OutputConstructor]
        private GetPrivatelinkEndpointsServiceServerlessResult(
            string id,

            string instanceName,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetPrivatelinkEndpointsServiceServerlessResultResult> results)
        {
            Id = id;
            InstanceName = instanceName;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            ProjectId = projectId;
            Results = results;
        }
    }
}
