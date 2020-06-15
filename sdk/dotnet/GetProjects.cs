// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetProjects
    {
        /// <summary>
        /// `mongodbatlas..getProjects` describe all Projects. This represents projects that have been created.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectsResult> InvokeAsync(GetProjectsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProjectsResult>("mongodbatlas:index/getProjects:getProjects", args ?? new GetProjectsArgs(), options.WithVersion());
    }


    public sealed class GetProjectsArgs : Pulumi.InvokeArgs
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

        public GetProjectsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProjectsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        public readonly ImmutableArray<Outputs.GetProjectsResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetProjectsResult(
            string id,

            int? itemsPerPage,

            int? pageNum,

            ImmutableArray<Outputs.GetProjectsResultResult> results,

            int totalCount)
        {
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
