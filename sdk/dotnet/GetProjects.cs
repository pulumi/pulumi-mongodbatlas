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
        /// ## # Data Source: mongodbatlas.getProjects
        /// 
        /// `mongodbatlas.getProjects` describes all Projects. This represents projects that have been created.
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
        ///     var test = Mongodbatlas.GetRolesOrgId.Invoke();
        /// 
        ///     var testProject = new Mongodbatlas.Project("test", new()
        ///     {
        ///         Name = "project-name",
        ///         OrgId = test.Apply(getRolesOrgIdResult =&gt; getRolesOrgIdResult.OrgId),
        ///         Teams = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.ProjectTeamArgs
        ///             {
        ///                 TeamId = "5e0fa8c99ccf641c722fe645",
        ///                 RoleNames = new[]
        ///                 {
        ///                     "GROUP_OWNER",
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.ProjectTeamArgs
        ///             {
        ///                 TeamId = "5e1dd7b4f2a30ba80a70cd4rw",
        ///                 RoleNames = new[]
        ///                 {
        ///                     "GROUP_READ_ONLY",
        ///                     "GROUP_DATA_ACCESS_READ_WRITE",
        ///                 },
        ///             },
        ///         },
        ///         Limits = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.ProjectLimitArgs
        ///             {
        ///                 Name = "atlas.project.deployment.clusters",
        ///                 Value = 26,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var testGetProjects = Mongodbatlas.GetProjects.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectsResult> InvokeAsync(GetProjectsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectsResult>("mongodbatlas:index/getProjects:getProjects", args ?? new GetProjectsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getProjects
        /// 
        /// `mongodbatlas.getProjects` describes all Projects. This represents projects that have been created.
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
        ///     var test = Mongodbatlas.GetRolesOrgId.Invoke();
        /// 
        ///     var testProject = new Mongodbatlas.Project("test", new()
        ///     {
        ///         Name = "project-name",
        ///         OrgId = test.Apply(getRolesOrgIdResult =&gt; getRolesOrgIdResult.OrgId),
        ///         Teams = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.ProjectTeamArgs
        ///             {
        ///                 TeamId = "5e0fa8c99ccf641c722fe645",
        ///                 RoleNames = new[]
        ///                 {
        ///                     "GROUP_OWNER",
        ///                 },
        ///             },
        ///             new Mongodbatlas.Inputs.ProjectTeamArgs
        ///             {
        ///                 TeamId = "5e1dd7b4f2a30ba80a70cd4rw",
        ///                 RoleNames = new[]
        ///                 {
        ///                     "GROUP_READ_ONLY",
        ///                     "GROUP_DATA_ACCESS_READ_WRITE",
        ///                 },
        ///             },
        ///         },
        ///         Limits = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.ProjectLimitArgs
        ///             {
        ///                 Name = "atlas.project.deployment.clusters",
        ///                 Value = 26,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var testGetProjects = Mongodbatlas.GetProjects.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectsResult> Invoke(GetProjectsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectsResult>("mongodbatlas:index/getProjects:getProjects", args ?? new GetProjectsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectsArgs : global::Pulumi.InvokeArgs
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
        public static new GetProjectsArgs Empty => new GetProjectsArgs();
    }

    public sealed class GetProjectsInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetProjectsInvokeArgs()
        {
        }
        public static new GetProjectsInvokeArgs Empty => new GetProjectsInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectsResult
    {
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
