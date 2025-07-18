// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedSettingsOrgConfig
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.FederatedSettingsOrgConfig
        /// 
        /// `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.
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
        ///     var orgConfigsDs = Mongodbatlas.GetFederatedSettingsOrgConfig.Invoke(new()
        ///     {
        ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.Id,
        ///         OrgId = "627a9683ea7ff7f74de306f14",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFederatedSettingsOrgConfigResult> InvokeAsync(GetFederatedSettingsOrgConfigArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedSettingsOrgConfigResult>("mongodbatlas:index/getFederatedSettingsOrgConfig:getFederatedSettingsOrgConfig", args ?? new GetFederatedSettingsOrgConfigArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.FederatedSettingsOrgConfig
        /// 
        /// `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.
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
        ///     var orgConfigsDs = Mongodbatlas.GetFederatedSettingsOrgConfig.Invoke(new()
        ///     {
        ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.Id,
        ///         OrgId = "627a9683ea7ff7f74de306f14",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFederatedSettingsOrgConfigResult> Invoke(GetFederatedSettingsOrgConfigInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsOrgConfigResult>("mongodbatlas:index/getFederatedSettingsOrgConfig:getFederatedSettingsOrgConfig", args ?? new GetFederatedSettingsOrgConfigInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.FederatedSettingsOrgConfig
        /// 
        /// `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Organizational configuration provides federated settings outputs for the configured Organizational configuration.
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
        ///     var orgConfigsDs = Mongodbatlas.GetFederatedSettingsOrgConfig.Invoke(new()
        ///     {
        ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.Id,
        ///         OrgId = "627a9683ea7ff7f74de306f14",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFederatedSettingsOrgConfigResult> Invoke(GetFederatedSettingsOrgConfigInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsOrgConfigResult>("mongodbatlas:index/getFederatedSettingsOrgConfig:getFederatedSettingsOrgConfig", args ?? new GetFederatedSettingsOrgConfigInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedSettingsOrgConfigArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Input("federationSettingsId", required: true)]
        public string FederationSettingsId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetFederatedSettingsOrgConfigArgs()
        {
        }
        public static new GetFederatedSettingsOrgConfigArgs Empty => new GetFederatedSettingsOrgConfigArgs();
    }

    public sealed class GetFederatedSettingsOrgConfigInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Input("federationSettingsId", required: true)]
        public Input<string> FederationSettingsId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetFederatedSettingsOrgConfigInvokeArgs()
        {
        }
        public static new GetFederatedSettingsOrgConfigInvokeArgs Empty => new GetFederatedSettingsOrgConfigInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedSettingsOrgConfigResult
    {
        /// <summary>
        /// The collection of unique ids representing the identity providers that can be used for data access in this organization.
        /// </summary>
        public readonly ImmutableArray<string> DataAccessIdentityProviderIds;
        /// <summary>
        /// List that contains the approved domains from which organization users can log in.  Note: If the organization uses an identity provider,  `domain_allow_list` includes: any SSO domains associated with organization's identity provider and any custom domains associated with the specific organization.
        /// </summary>
        public readonly ImmutableArray<string> DomainAllowLists;
        /// <summary>
        /// Flag that indicates whether domain restriction is enabled for the connected organization.  User Conflicts returns null when `domain_restriction_enabled` is false.
        /// </summary>
        public readonly bool DomainRestrictionEnabled;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        public readonly string FederationSettingsId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. This id can be found in two ways:
        /// 1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
        /// 2. `okta_idp_id` on the `mongodbatlas.FederatedSettingsIdentityProvider` resource
        /// </summary>
        public readonly string IdentityProviderId;
        public readonly string OrgId;
        /// <summary>
        /// List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
        /// </summary>
        public readonly ImmutableArray<string> PostAuthRoleGrants;
        /// <summary>
        /// Role mappings that are configured in this organization. See below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedSettingsOrgConfigRoleMappingResult> RoleMappings;
        /// <summary>
        /// List that contains the users who have an email address that doesn't match any domain on the allowed list. See below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedSettingsOrgConfigUserConflictResult> UserConflicts;

        [OutputConstructor]
        private GetFederatedSettingsOrgConfigResult(
            ImmutableArray<string> dataAccessIdentityProviderIds,

            ImmutableArray<string> domainAllowLists,

            bool domainRestrictionEnabled,

            string federationSettingsId,

            string id,

            string identityProviderId,

            string orgId,

            ImmutableArray<string> postAuthRoleGrants,

            ImmutableArray<Outputs.GetFederatedSettingsOrgConfigRoleMappingResult> roleMappings,

            ImmutableArray<Outputs.GetFederatedSettingsOrgConfigUserConflictResult> userConflicts)
        {
            DataAccessIdentityProviderIds = dataAccessIdentityProviderIds;
            DomainAllowLists = domainAllowLists;
            DomainRestrictionEnabled = domainRestrictionEnabled;
            FederationSettingsId = federationSettingsId;
            Id = id;
            IdentityProviderId = identityProviderId;
            OrgId = orgId;
            PostAuthRoleGrants = postAuthRoleGrants;
            RoleMappings = roleMappings;
            UserConflicts = userConflicts;
        }
    }
}
