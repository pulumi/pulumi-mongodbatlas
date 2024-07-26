// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedSettingsOrgRoleMappings
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getFederatedSettingsOrgRoleMappings
        /// 
        /// `mongodbatlas.getFederatedSettingsOrgRoleMappings` provides an Federated Settings Org Role Mapping datasource. Atlas Cloud Federated Settings Org Role Mapping provides federated settings outputs for the configured Org Role Mapping.
        /// </summary>
        public static Task<GetFederatedSettingsOrgRoleMappingsResult> InvokeAsync(GetFederatedSettingsOrgRoleMappingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedSettingsOrgRoleMappingsResult>("mongodbatlas:index/getFederatedSettingsOrgRoleMappings:getFederatedSettingsOrgRoleMappings", args ?? new GetFederatedSettingsOrgRoleMappingsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getFederatedSettingsOrgRoleMappings
        /// 
        /// `mongodbatlas.getFederatedSettingsOrgRoleMappings` provides an Federated Settings Org Role Mapping datasource. Atlas Cloud Federated Settings Org Role Mapping provides federated settings outputs for the configured Org Role Mapping.
        /// </summary>
        public static Output<GetFederatedSettingsOrgRoleMappingsResult> Invoke(GetFederatedSettingsOrgRoleMappingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsOrgRoleMappingsResult>("mongodbatlas:index/getFederatedSettingsOrgRoleMappings:getFederatedSettingsOrgRoleMappings", args ?? new GetFederatedSettingsOrgRoleMappingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedSettingsOrgRoleMappingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Input("federationSettingsId", required: true)]
        public string FederationSettingsId { get; set; } = null!;

        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        public GetFederatedSettingsOrgRoleMappingsArgs()
        {
        }
        public static new GetFederatedSettingsOrgRoleMappingsArgs Empty => new GetFederatedSettingsOrgRoleMappingsArgs();
    }

    public sealed class GetFederatedSettingsOrgRoleMappingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Input("federationSettingsId", required: true)]
        public Input<string> FederationSettingsId { get; set; } = null!;

        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        public GetFederatedSettingsOrgRoleMappingsInvokeArgs()
        {
        }
        public static new GetFederatedSettingsOrgRoleMappingsInvokeArgs Empty => new GetFederatedSettingsOrgRoleMappingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedSettingsOrgRoleMappingsResult
    {
        public readonly string FederationSettingsId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly string OrgId;
        public readonly int? PageNum;
        /// <summary>
        /// Includes cloudProviderSnapshot object for each item detailed in the results array section.
        /// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedSettingsOrgRoleMappingsResultResult> Results;

        [OutputConstructor]
        private GetFederatedSettingsOrgRoleMappingsResult(
            string federationSettingsId,

            string id,

            int? itemsPerPage,

            string orgId,

            int? pageNum,

            ImmutableArray<Outputs.GetFederatedSettingsOrgRoleMappingsResultResult> results)
        {
            FederationSettingsId = federationSettingsId;
            Id = id;
            ItemsPerPage = itemsPerPage;
            OrgId = orgId;
            PageNum = pageNum;
            Results = results;
        }
    }
}
