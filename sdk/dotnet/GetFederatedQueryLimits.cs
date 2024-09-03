// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedQueryLimits
    {
        /// <summary>
        /// # Data Source: mongodbatlas.getFederatedQueryLimits
        /// 
        /// `mongodbatlas.getFederatedQueryLimits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see &lt;https://www.mongodb.com/docs/atlas/data-federation/overview/&gt;.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### s
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetFederatedQueryLimits.Invoke(new()
        ///     {
        ///         ProjectId = "PROJECT_ID",
        ///         TenantName = "FEDERATED_DATABASE_INSTANCE_NAME",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFederatedQueryLimitsResult> InvokeAsync(GetFederatedQueryLimitsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedQueryLimitsResult>("mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits", args ?? new GetFederatedQueryLimitsArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.getFederatedQueryLimits
        /// 
        /// `mongodbatlas.getFederatedQueryLimits` provides a Federated Database Instance Query Limits data source. To learn more about Atlas Data Federation see &lt;https://www.mongodb.com/docs/atlas/data-federation/overview/&gt;.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### s
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetFederatedQueryLimits.Invoke(new()
        ///     {
        ///         ProjectId = "PROJECT_ID",
        ///         TenantName = "FEDERATED_DATABASE_INSTANCE_NAME",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFederatedQueryLimitsResult> Invoke(GetFederatedQueryLimitsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedQueryLimitsResult>("mongodbatlas:index/getFederatedQueryLimits:getFederatedQueryLimits", args ?? new GetFederatedQueryLimitsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedQueryLimitsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("tenantName", required: true)]
        public string TenantName { get; set; } = null!;

        public GetFederatedQueryLimitsArgs()
        {
        }
        public static new GetFederatedQueryLimitsArgs Empty => new GetFederatedQueryLimitsArgs();
    }

    public sealed class GetFederatedQueryLimitsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("tenantName", required: true)]
        public Input<string> TenantName { get; set; } = null!;

        public GetFederatedQueryLimitsInvokeArgs()
        {
        }
        public static new GetFederatedQueryLimitsInvokeArgs Empty => new GetFederatedQueryLimitsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedQueryLimitsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// Includes Federated Database instance query limits for each item detailed in the results array section.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedQueryLimitsResultResult> Results;
        public readonly string TenantName;

        [OutputConstructor]
        private GetFederatedQueryLimitsResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetFederatedQueryLimitsResultResult> results,

            string tenantName)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
            TenantName = tenantName;
        }
    }
}
