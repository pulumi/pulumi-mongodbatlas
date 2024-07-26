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
        /// ## # Data Source: mongodbatlas.getFederatedSettingsIdentityProviders
        /// 
        /// `mongodbatlas.getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
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
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f",
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
        /// ## # Data Source: mongodbatlas.getFederatedSettingsIdentityProviders
        /// 
        /// `mongodbatlas.getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
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
        ///         FederationSettingsId = "627a9687f7f7f7f774de306f",
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

        [Input("idpTypes")]
        private List<string>? _idpTypes;

        /// <summary>
        /// The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
        /// </summary>
        public List<string> IdpTypes
        {
            get => _idpTypes ?? (_idpTypes = new List<string>());
            set => _idpTypes = value;
        }

        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`. **Note**: This attribute is deprecated and not being used. The implementation is currently limited to returning a maximum of 100 results.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`. **Note**: This attribute is deprecated and not being used.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        [Input("protocols")]
        private List<string>? _protocols;

        /// <summary>
        /// The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
        /// </summary>
        public List<string> Protocols
        {
            get => _protocols ?? (_protocols = new List<string>());
            set => _protocols = value;
        }

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

        [Input("idpTypes")]
        private InputList<string>? _idpTypes;

        /// <summary>
        /// The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
        /// </summary>
        public InputList<string> IdpTypes
        {
            get => _idpTypes ?? (_idpTypes = new InputList<string>());
            set => _idpTypes = value;
        }

        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`. **Note**: This attribute is deprecated and not being used. The implementation is currently limited to returning a maximum of 100 results.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`. **Note**: This attribute is deprecated and not being used.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        [Input("protocols")]
        private InputList<string>? _protocols;

        /// <summary>
        /// The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
        /// </summary>
        public InputList<string> Protocols
        {
            get => _protocols ?? (_protocols = new InputList<string>());
            set => _protocols = value;
        }

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
        public readonly ImmutableArray<string> IdpTypes;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        public readonly ImmutableArray<string> Protocols;
        /// <summary>
        /// Includes cloudProviderSnapshot object for each item detailed in the results array section.
        /// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedSettingsIdentityProvidersResultResult> Results;

        [OutputConstructor]
        private GetFederatedSettingsIdentityProvidersResult(
            string federationSettingsId,

            string id,

            ImmutableArray<string> idpTypes,

            int? itemsPerPage,

            int? pageNum,

            ImmutableArray<string> protocols,

            ImmutableArray<Outputs.GetFederatedSettingsIdentityProvidersResultResult> results)
        {
            FederationSettingsId = federationSettingsId;
            Id = id;
            IdpTypes = idpTypes;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            Protocols = protocols;
            Results = results;
        }
    }
}
