// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedSettingsIdentityProviders
    {
        /// <summary>
        /// `mongodbatlas.getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
        /// 
        /// &gt; **NOTE:** OIDC Workforce IdP is currently in preview. To learn more about OIDC and existing limitations see the [OIDC Authentication Documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
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
        ///     var identityProvider = new Mongodbatlas.FederatedSettingsIdentityProvider("identity_provider", new()
        ///     {
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f14",
        ///         Name = "mongodb_federation_test",
        ///         AssociatedDomains = new[]
        ///         {
        ///             "yourdomain.com",
        ///         },
        ///         SsoDebugEnabled = true,
        ///         Status = "ACTIVE",
        ///     });
        /// 
        ///     var identittyProvider = Mongodbatlas.GetFederatedSettingsIdentityProviders.Invoke(new()
        ///     {
        ///         FederationSettingsId = identityProvider.Id,
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFederatedSettingsIdentityProvidersResult> InvokeAsync(GetFederatedSettingsIdentityProvidersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedSettingsIdentityProvidersResult>("mongodbatlas:index/getFederatedSettingsIdentityProviders:getFederatedSettingsIdentityProviders", args ?? new GetFederatedSettingsIdentityProvidersArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
        /// 
        /// &gt; **NOTE:** OIDC Workforce IdP is currently in preview. To learn more about OIDC and existing limitations see the [OIDC Authentication Documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
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
        ///     var identityProvider = new Mongodbatlas.FederatedSettingsIdentityProvider("identity_provider", new()
        ///     {
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f14",
        ///         Name = "mongodb_federation_test",
        ///         AssociatedDomains = new[]
        ///         {
        ///             "yourdomain.com",
        ///         },
        ///         SsoDebugEnabled = true,
        ///         Status = "ACTIVE",
        ///     });
        /// 
        ///     var identittyProvider = Mongodbatlas.GetFederatedSettingsIdentityProviders.Invoke(new()
        ///     {
        ///         FederationSettingsId = identityProvider.Id,
        ///         PageNum = 1,
        ///         ItemsPerPage = 5,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFederatedSettingsIdentityProvidersResult> Invoke(GetFederatedSettingsIdentityProvidersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsIdentityProvidersResult>("mongodbatlas:index/getFederatedSettingsIdentityProviders:getFederatedSettingsIdentityProviders", args ?? new GetFederatedSettingsIdentityProvidersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedSettingsIdentityProvidersArgs : global::Pulumi.InvokeArgs
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

        public GetFederatedSettingsIdentityProvidersArgs()
        {
        }
        public static new GetFederatedSettingsIdentityProvidersArgs Empty => new GetFederatedSettingsIdentityProvidersArgs();
    }

    public sealed class GetFederatedSettingsIdentityProvidersInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetFederatedSettingsIdentityProvidersInvokeArgs()
        {
        }
        public static new GetFederatedSettingsIdentityProvidersInvokeArgs Empty => new GetFederatedSettingsIdentityProvidersInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedSettingsIdentityProvidersResult
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
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedSettingsIdentityProvidersResultResult> Results;

        [OutputConstructor]
        private GetFederatedSettingsIdentityProvidersResult(
            string federationSettingsId,

            string id,

            int? itemsPerPage,

            int? pageNum,

            ImmutableArray<Outputs.GetFederatedSettingsIdentityProvidersResultResult> results)
        {
            FederationSettingsId = federationSettingsId;
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            Results = results;
        }
    }
}
