// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetStreamInstances
    {
        /// <summary>
        /// `mongodbatlas.getStreamInstances` describes the stream instances defined in a project.
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
        ///     var test = Mongodbatlas.GetStreamInstances.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetStreamInstancesResult> InvokeAsync(GetStreamInstancesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStreamInstancesResult>("mongodbatlas:index/getStreamInstances:getStreamInstances", args ?? new GetStreamInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getStreamInstances` describes the stream instances defined in a project.
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
        ///     var test = Mongodbatlas.GetStreamInstances.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStreamInstancesResult> Invoke(GetStreamInstancesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStreamInstancesResult>("mongodbatlas:index/getStreamInstances:getStreamInstances", args ?? new GetStreamInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStreamInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetStreamInstancesArgs()
        {
        }
        public static new GetStreamInstancesArgs Empty => new GetStreamInstancesArgs();
    }

    public sealed class GetStreamInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetStreamInstancesInvokeArgs()
        {
        }
        public static new GetStreamInstancesInvokeArgs Empty => new GetStreamInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetStreamInstancesResult
    {
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// A list where each element contains a Stream Instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStreamInstancesResultResult> Results;
        /// <summary>
        /// Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
        /// </summary>
        public readonly int TotalCount;

        [OutputConstructor]
        private GetStreamInstancesResult(
            string id,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetStreamInstancesResultResult> results,

            int totalCount)
        {
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            ProjectId = projectId;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
