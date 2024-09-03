// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// # Resource: mongodbatlas.FederatedSettingsOrgConfig
    /// 
    /// `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
    /// 
    /// ## Example Usage
    /// 
    /// &gt; **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.
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
    ///         FederationSettingsId = orgConnectionMongodbatlasFederatedSettingsOrgConfig.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// FederatedSettingsOrgConfig must be imported using federation_settings_id-org_id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig org_connection 627a9687f7f7f7f774de306f14-627a9683ea7ff7f74de306f14
    /// ```
    /// For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig")]
    public partial class FederatedSettingsOrgConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The collection of unique ids representing the identity providers that can be used for data access in this organization.
        /// </summary>
        [Output("dataAccessIdentityProviderIds")]
        public Output<ImmutableArray<string>> DataAccessIdentityProviderIds { get; private set; } = null!;

        /// <summary>
        /// List that contains the approved domains from which organization users can log in.
        /// </summary>
        [Output("domainAllowLists")]
        public Output<ImmutableArray<string>> DomainAllowLists { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether domain restriction is enabled for the connected organization.
        /// </summary>
        [Output("domainRestrictionEnabled")]
        public Output<bool> DomainRestrictionEnabled { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Output("federationSettingsId")]
        public Output<string> FederationSettingsId { get; private set; } = null!;

        /// <summary>
        /// Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. Removing the attribute or providing the value `""` will detach/remove the SAML identity provider. This id can be found in two ways:
        /// 1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
        /// 2. `okta_idp_id` on the `mongodbatlas.FederatedSettingsIdentityProvider` resource
        /// </summary>
        [Output("identityProviderId")]
        public Output<string?> IdentityProviderId { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
        /// </summary>
        [Output("postAuthRoleGrants")]
        public Output<ImmutableArray<string>> PostAuthRoleGrants { get; private set; } = null!;

        /// <summary>
        /// List that contains the users who have an email address that doesn't match any domain on the allowed list. See below
        /// </summary>
        [Output("userConflicts")]
        public Output<ImmutableArray<Outputs.FederatedSettingsOrgConfigUserConflict>> UserConflicts { get; private set; } = null!;


        /// <summary>
        /// Create a FederatedSettingsOrgConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FederatedSettingsOrgConfig(string name, FederatedSettingsOrgConfigArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig", name, args ?? new FederatedSettingsOrgConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FederatedSettingsOrgConfig(string name, Input<string> id, FederatedSettingsOrgConfigState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FederatedSettingsOrgConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FederatedSettingsOrgConfig Get(string name, Input<string> id, FederatedSettingsOrgConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new FederatedSettingsOrgConfig(name, id, state, options);
        }
    }

    public sealed class FederatedSettingsOrgConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataAccessIdentityProviderIds")]
        private InputList<string>? _dataAccessIdentityProviderIds;

        /// <summary>
        /// The collection of unique ids representing the identity providers that can be used for data access in this organization.
        /// </summary>
        public InputList<string> DataAccessIdentityProviderIds
        {
            get => _dataAccessIdentityProviderIds ?? (_dataAccessIdentityProviderIds = new InputList<string>());
            set => _dataAccessIdentityProviderIds = value;
        }

        [Input("domainAllowLists")]
        private InputList<string>? _domainAllowLists;

        /// <summary>
        /// List that contains the approved domains from which organization users can log in.
        /// </summary>
        public InputList<string> DomainAllowLists
        {
            get => _domainAllowLists ?? (_domainAllowLists = new InputList<string>());
            set => _domainAllowLists = value;
        }

        /// <summary>
        /// Flag that indicates whether domain restriction is enabled for the connected organization.
        /// </summary>
        [Input("domainRestrictionEnabled", required: true)]
        public Input<bool> DomainRestrictionEnabled { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Input("federationSettingsId", required: true)]
        public Input<string> FederationSettingsId { get; set; } = null!;

        /// <summary>
        /// Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. Removing the attribute or providing the value `""` will detach/remove the SAML identity provider. This id can be found in two ways:
        /// 1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
        /// 2. `okta_idp_id` on the `mongodbatlas.FederatedSettingsIdentityProvider` resource
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("postAuthRoleGrants")]
        private InputList<string>? _postAuthRoleGrants;

        /// <summary>
        /// List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
        /// </summary>
        public InputList<string> PostAuthRoleGrants
        {
            get => _postAuthRoleGrants ?? (_postAuthRoleGrants = new InputList<string>());
            set => _postAuthRoleGrants = value;
        }

        public FederatedSettingsOrgConfigArgs()
        {
        }
        public static new FederatedSettingsOrgConfigArgs Empty => new FederatedSettingsOrgConfigArgs();
    }

    public sealed class FederatedSettingsOrgConfigState : global::Pulumi.ResourceArgs
    {
        [Input("dataAccessIdentityProviderIds")]
        private InputList<string>? _dataAccessIdentityProviderIds;

        /// <summary>
        /// The collection of unique ids representing the identity providers that can be used for data access in this organization.
        /// </summary>
        public InputList<string> DataAccessIdentityProviderIds
        {
            get => _dataAccessIdentityProviderIds ?? (_dataAccessIdentityProviderIds = new InputList<string>());
            set => _dataAccessIdentityProviderIds = value;
        }

        [Input("domainAllowLists")]
        private InputList<string>? _domainAllowLists;

        /// <summary>
        /// List that contains the approved domains from which organization users can log in.
        /// </summary>
        public InputList<string> DomainAllowLists
        {
            get => _domainAllowLists ?? (_domainAllowLists = new InputList<string>());
            set => _domainAllowLists = value;
        }

        /// <summary>
        /// Flag that indicates whether domain restriction is enabled for the connected organization.
        /// </summary>
        [Input("domainRestrictionEnabled")]
        public Input<bool>? DomainRestrictionEnabled { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
        /// </summary>
        [Input("federationSettingsId")]
        public Input<string>? FederationSettingsId { get; set; }

        /// <summary>
        /// Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. Removing the attribute or providing the value `""` will detach/remove the SAML identity provider. This id can be found in two ways:
        /// 1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
        /// 2. `okta_idp_id` on the `mongodbatlas.FederatedSettingsIdentityProvider` resource
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("postAuthRoleGrants")]
        private InputList<string>? _postAuthRoleGrants;

        /// <summary>
        /// List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
        /// </summary>
        public InputList<string> PostAuthRoleGrants
        {
            get => _postAuthRoleGrants ?? (_postAuthRoleGrants = new InputList<string>());
            set => _postAuthRoleGrants = value;
        }

        [Input("userConflicts")]
        private InputList<Inputs.FederatedSettingsOrgConfigUserConflictGetArgs>? _userConflicts;

        /// <summary>
        /// List that contains the users who have an email address that doesn't match any domain on the allowed list. See below
        /// </summary>
        public InputList<Inputs.FederatedSettingsOrgConfigUserConflictGetArgs> UserConflicts
        {
            get => _userConflicts ?? (_userConflicts = new InputList<Inputs.FederatedSettingsOrgConfigUserConflictGetArgs>());
            set => _userConflicts = value;
        }

        public FederatedSettingsOrgConfigState()
        {
        }
        public static new FederatedSettingsOrgConfigState Empty => new FederatedSettingsOrgConfigState();
    }
}
