// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetOrganization
    {
        /// <summary>
        /// `mongodbatlas.Organization` describe all MongoDB Atlas Organizations. This represents organizations that have been created.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using project_id attribute to query
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetOrganization.Invoke(new()
        ///     {
        ///         OrgId = "&lt;org_id&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOrganizationResult> InvokeAsync(GetOrganizationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationResult>("mongodbatlas:index/getOrganization:getOrganization", args ?? new GetOrganizationArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.Organization` describe all MongoDB Atlas Organizations. This represents organizations that have been created.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using project_id attribute to query
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetOrganization.Invoke(new()
        ///     {
        ///         OrgId = "&lt;org_id&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOrganizationResult> Invoke(GetOrganizationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationResult>("mongodbatlas:index/getOrganization:getOrganization", args ?? new GetOrganizationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetOrganizationArgs()
        {
        }
        public static new GetOrganizationArgs Empty => new GetOrganizationArgs();
    }

    public sealed class GetOrganizationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetOrganizationInvokeArgs()
        {
        }
        public static new GetOrganizationInvokeArgs Empty => new GetOrganizationInvokeArgs();
    }


    [OutputType]
    public sealed class GetOrganizationResult
    {
        /// <summary>
        /// (Optional) Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        /// </summary>
        public readonly bool ApiAccessListRequired;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Flag that indicates whether this organization has been deleted.
        /// </summary>
        public readonly bool IsDeleted;
        public readonly ImmutableArray<Outputs.GetOrganizationLinkResult> Links;
        /// <summary>
        /// (Optional) Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
        /// </summary>
        public readonly bool MultiFactorAuthRequired;
        /// <summary>
        /// Human-readable label that identifies the organization.
        /// </summary>
        public readonly string Name;
        public readonly string OrgId;
        /// <summary>
        /// (Optional) Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
        /// </summary>
        public readonly bool RestrictEmployeeAccess;

        [OutputConstructor]
        private GetOrganizationResult(
            bool apiAccessListRequired,

            string id,

            bool isDeleted,

            ImmutableArray<Outputs.GetOrganizationLinkResult> links,

            bool multiFactorAuthRequired,

            string name,

            string orgId,

            bool restrictEmployeeAccess)
        {
            ApiAccessListRequired = apiAccessListRequired;
            Id = id;
            IsDeleted = isDeleted;
            Links = links;
            MultiFactorAuthRequired = multiFactorAuthRequired;
            Name = name;
            OrgId = orgId;
            RestrictEmployeeAccess = restrictEmployeeAccess;
        }
    }
}