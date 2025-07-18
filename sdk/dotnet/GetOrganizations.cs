// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetOrganizations
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getOrganizations
        /// 
        /// `mongodbatlas.getOrganizations` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
        /// 
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
        ///     var test = Mongodbatlas.GetOrganizations.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOrganizationsResult> InvokeAsync(GetOrganizationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationsResult>("mongodbatlas:index/getOrganizations:getOrganizations", args ?? new GetOrganizationsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getOrganizations
        /// 
        /// `mongodbatlas.getOrganizations` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
        /// 
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
        ///     var test = Mongodbatlas.GetOrganizations.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOrganizationsResult> Invoke(GetOrganizationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationsResult>("mongodbatlas:index/getOrganizations:getOrganizations", args ?? new GetOrganizationsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getOrganizations
        /// 
        /// `mongodbatlas.getOrganizations` describes all MongoDB Atlas Organizations. This represents organizations that have been created.
        /// 
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
        ///     var test = Mongodbatlas.GetOrganizations.Invoke(new()
        ///     {
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOrganizationsResult> Invoke(GetOrganizationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationsResult>("mongodbatlas:index/getOrganizations:getOrganizations", args ?? new GetOrganizationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        public GetOrganizationsArgs()
        {
        }
        public static new GetOrganizationsArgs Empty => new GetOrganizationsArgs();
    }

    public sealed class GetOrganizationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        public GetOrganizationsInvokeArgs()
        {
        }
        public static new GetOrganizationsInvokeArgs Empty => new GetOrganizationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetOrganizationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly string? Name;
        public readonly int? PageNum;
        public readonly ImmutableArray<Outputs.GetOrganizationsResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetOrganizationsResult(
            string id,

            int? itemsPerPage,

            string? name,

            int? pageNum,

            ImmutableArray<Outputs.GetOrganizationsResultResult> results,

            int totalCount)
        {
            Id = id;
            ItemsPerPage = itemsPerPage;
            Name = name;
            PageNum = pageNum;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
