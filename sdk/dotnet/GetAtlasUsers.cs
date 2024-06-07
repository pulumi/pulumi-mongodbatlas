// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAtlasUsers
    {
        /// <summary>
        /// `atlas_users` provides Atlas Users associated with a specified Organization, Project, or Team.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using org_id attribute to query Organization Atlas Users
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUsers.Invoke(new()
        ///     {
        ///         OrgId = "&lt;ORG_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using project_id attribute to query Project Atlas Users
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUsers.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using team_id and org_id attribute to query Team Atlas Users
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUsers.Invoke(new()
        ///     {
        ///         TeamId = "&lt;TEAM_ID&gt;",
        ///         OrgId = "&lt;ORG_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAtlasUsersResult> InvokeAsync(GetAtlasUsersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAtlasUsersResult>("mongodbatlas:index/getAtlasUsers:getAtlasUsers", args ?? new GetAtlasUsersArgs(), options.WithDefaults());

        /// <summary>
        /// `atlas_users` provides Atlas Users associated with a specified Organization, Project, or Team.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using org_id attribute to query Organization Atlas Users
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUsers.Invoke(new()
        ///     {
        ///         OrgId = "&lt;ORG_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using project_id attribute to query Project Atlas Users
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUsers.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using team_id and org_id attribute to query Team Atlas Users
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUsers.Invoke(new()
        ///     {
        ///         TeamId = "&lt;TEAM_ID&gt;",
        ///         OrgId = "&lt;ORG_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAtlasUsersResult> Invoke(GetAtlasUsersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAtlasUsersResult>("mongodbatlas:index/getAtlasUsers:getAtlasUsers", args ?? new GetAtlasUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAtlasUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
        /// 
        /// &gt; **IMPORTANT:** Either `org_id`, `project_id`, or `team_id` with `org_id` must be configurated.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `team_id` attributes is defined.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
        /// </summary>
        [Input("teamId")]
        public string? TeamId { get; set; }

        public GetAtlasUsersArgs()
        {
        }
        public static new GetAtlasUsersArgs Empty => new GetAtlasUsersArgs();
    }

    public sealed class GetAtlasUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items that the response returns per page, up to a maximum of `500`. Defaults to `100`.
        /// 
        /// &gt; **IMPORTANT:** Either `org_id`, `project_id`, or `team_id` with `org_id` must be configurated.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization whose users you want to return. Also needed when `team_id` attributes is defined.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Number of the page that displays the current set of the total objects that the response returns. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project whose users you want to return.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the team whose users you want to return.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public GetAtlasUsersInvokeArgs()
        {
        }
        public static new GetAtlasUsersInvokeArgs Empty => new GetAtlasUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetAtlasUsersResult
    {
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly string? OrgId;
        public readonly int? PageNum;
        public readonly string? ProjectId;
        /// <summary>
        /// A list where each element contains a Atlas User.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAtlasUsersResultResult> Results;
        public readonly string? TeamId;
        /// <summary>
        /// Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
        /// </summary>
        public readonly int TotalCount;

        [OutputConstructor]
        private GetAtlasUsersResult(
            string id,

            int? itemsPerPage,

            string? orgId,

            int? pageNum,

            string? projectId,

            ImmutableArray<Outputs.GetAtlasUsersResultResult> results,

            string? teamId,

            int totalCount)
        {
            Id = id;
            ItemsPerPage = itemsPerPage;
            OrgId = orgId;
            PageNum = pageNum;
            ProjectId = projectId;
            Results = results;
            TeamId = teamId;
            TotalCount = totalCount;
        }
    }
}
