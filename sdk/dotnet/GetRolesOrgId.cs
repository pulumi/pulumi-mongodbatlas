// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetRolesOrgId
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getRolesOrgId
        /// 
        /// `mongodbatlas.getRolesOrgId` describes a MongoDB Atlas Roles Org ID. This represents a Roles Org ID.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using data source to query
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
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["orgId"] = test.Apply(getRolesOrgIdResult =&gt; getRolesOrgIdResult.OrgId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRolesOrgIdResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRolesOrgIdResult>("mongodbatlas:index/getRolesOrgId:getRolesOrgId", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getRolesOrgId
        /// 
        /// `mongodbatlas.getRolesOrgId` describes a MongoDB Atlas Roles Org ID. This represents a Roles Org ID.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using data source to query
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
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["orgId"] = test.Apply(getRolesOrgIdResult =&gt; getRolesOrgIdResult.OrgId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRolesOrgIdResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesOrgIdResult>("mongodbatlas:index/getRolesOrgId:getRolesOrgId", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetRolesOrgIdResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the organization you want to retrieve associated to an API Key.
        /// </summary>
        public readonly string OrgId;

        [OutputConstructor]
        private GetRolesOrgIdResult(
            string id,

            string orgId)
        {
            Id = id;
            OrgId = orgId;
        }
    }
}
