// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetProjectApiKeys
    {
        /// <summary>
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
        ///     var test = Mongodbatlas.GetProjectApiKeys.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///         ProjectId = "32b6e34b3d91647abb20e7b8",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectApiKeysResult> InvokeAsync(GetProjectApiKeysArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectApiKeysResult>("mongodbatlas:index/getProjectApiKeys:getProjectApiKeys", args ?? new GetProjectApiKeysArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var test = Mongodbatlas.GetProjectApiKeys.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///         ProjectId = "32b6e34b3d91647abb20e7b8",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectApiKeysResult> Invoke(GetProjectApiKeysInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectApiKeysResult>("mongodbatlas:index/getProjectApiKeys:getProjectApiKeys", args ?? new GetProjectApiKeysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectApiKeysArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectApiKeysArgs()
        {
        }
        public static new GetProjectApiKeysArgs Empty => new GetProjectApiKeysArgs();
    }

    public sealed class GetProjectApiKeysInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetProjectApiKeysInvokeArgs()
        {
        }
        public static new GetProjectApiKeysInvokeArgs Empty => new GetProjectApiKeysInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectApiKeysResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        /// <summary>
        /// Project ID to assign to Access Key
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// A list where each element represents a API Key assigned to the project.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectApiKeysResultResult> Results;

        [OutputConstructor]
        private GetProjectApiKeysResult(
            string id,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetProjectApiKeysResultResult> results)
        {
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            ProjectId = projectId;
            Results = results;
        }
    }
}