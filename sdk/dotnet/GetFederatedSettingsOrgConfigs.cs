// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedSettingsOrgConfigs
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getFederatedSettingsOrgConfigs
        /// 
        /// `mongodbatlas.getFederatedSettingsOrgConfigs` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
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
        ///     var orgConnection = new Mongodbatlas.FederatedSettingsOrgConfig("org_connection", new()
        ///     {
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f14",
        ///         OrgId = "627a9683ea7ff7f74de306f14",
        ///         DataAccessIdentityProviderIds = new[]
        ///         {
        ///             "64d613677e1ad50839cce4db",
        ///         },
        ///         DomainRestrictionEnabled = false,
        ///         DomainAllowLists = new[]
        ///         {
        ///             "mydomain.com",
        ///         },
        ///         PostAuthRoleGrants = new[]
        ///         {
        ///             "ORG_MEMBER",
        ///         },
        ///         IdentityProviderId = "0oaqyt9fc2ySTWnA0357",
        ///     });
        /// 
        ///     var orgConfigsDs = Mongodbatlas.GetFederatedSettingsOrgConfigs.Invoke(new()
        ///     {
        ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.FederationSettingsId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFederatedSettingsOrgConfigsResult> InvokeAsync(GetFederatedSettingsOrgConfigsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedSettingsOrgConfigsResult>("mongodbatlas:index/getFederatedSettingsOrgConfigs:getFederatedSettingsOrgConfigs", args ?? new GetFederatedSettingsOrgConfigsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getFederatedSettingsOrgConfigs
        /// 
        /// `mongodbatlas.getFederatedSettingsOrgConfigs` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
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
        ///     var orgConnection = new Mongodbatlas.FederatedSettingsOrgConfig("org_connection", new()
        ///     {
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f14",
        ///         OrgId = "627a9683ea7ff7f74de306f14",
        ///         DataAccessIdentityProviderIds = new[]
        ///         {
        ///             "64d613677e1ad50839cce4db",
        ///         },
        ///         DomainRestrictionEnabled = false,
        ///         DomainAllowLists = new[]
        ///         {
        ///             "mydomain.com",
        ///         },
        ///         PostAuthRoleGrants = new[]
        ///         {
        ///             "ORG_MEMBER",
        ///         },
        ///         IdentityProviderId = "0oaqyt9fc2ySTWnA0357",
        ///     });
        /// 
        ///     var orgConfigsDs = Mongodbatlas.GetFederatedSettingsOrgConfigs.Invoke(new()
        ///     {
        ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.FederationSettingsId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFederatedSettingsOrgConfigsResult> Invoke(GetFederatedSettingsOrgConfigsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsOrgConfigsResult>("mongodbatlas:index/getFederatedSettingsOrgConfigs:getFederatedSettingsOrgConfigs", args ?? new GetFederatedSettingsOrgConfigsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getFederatedSettingsOrgConfigs
        /// 
        /// `mongodbatlas.getFederatedSettingsOrgConfigs` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
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
        ///     var orgConnection = new Mongodbatlas.FederatedSettingsOrgConfig("org_connection", new()
        ///     {
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f14",
        ///         OrgId = "627a9683ea7ff7f74de306f14",
        ///         DataAccessIdentityProviderIds = new[]
        ///         {
        ///             "64d613677e1ad50839cce4db",
        ///         },
        ///         DomainRestrictionEnabled = false,
        ///         DomainAllowLists = new[]
        ///         {
        ///             "mydomain.com",
        ///         },
        ///         PostAuthRoleGrants = new[]
        ///         {
        ///             "ORG_MEMBER",
        ///         },
        ///         IdentityProviderId = "0oaqyt9fc2ySTWnA0357",
        ///     });
        /// 
        ///     var orgConfigsDs = Mongodbatlas.GetFederatedSettingsOrgConfigs.Invoke(new()
        ///     {
        ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.FederationSettingsId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFederatedSettingsOrgConfigsResult> Invoke(GetFederatedSettingsOrgConfigsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsOrgConfigsResult>("mongodbatlas:index/getFederatedSettingsOrgConfigs:getFederatedSettingsOrgConfigs", args ?? new GetFederatedSettingsOrgConfigsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedSettingsOrgConfigsArgs : global::Pulumi.InvokeArgs
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
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        public GetFederatedSettingsOrgConfigsArgs()
        {
        }
        public static new GetFederatedSettingsOrgConfigsArgs Empty => new GetFederatedSettingsOrgConfigsArgs();
    }

    public sealed class GetFederatedSettingsOrgConfigsInvokeArgs : global::Pulumi.InvokeArgs
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
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        public GetFederatedSettingsOrgConfigsInvokeArgs()
        {
        }
        public static new GetFederatedSettingsOrgConfigsInvokeArgs Empty => new GetFederatedSettingsOrgConfigsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedSettingsOrgConfigsResult
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        public readonly string FederationSettingsId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        /// <summary>
        /// Includes cloudProviderSnapshot object for each item detailed in the results array section.
        /// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedSettingsOrgConfigsResultResult> Results;

        [OutputConstructor]
        private GetFederatedSettingsOrgConfigsResult(
            string federationSettingsId,

            string id,

            int? itemsPerPage,

            int? pageNum,

            ImmutableArray<Outputs.GetFederatedSettingsOrgConfigsResultResult> results)
        {
            FederationSettingsId = federationSettingsId;
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            Results = results;
        }
    }
}
