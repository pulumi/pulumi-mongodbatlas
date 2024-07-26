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
    /// ## # Resource: mongodbatlas.LdapConfiguration
    /// 
    /// `mongodbatlas.LdapConfiguration` provides an LDAP Configuration resource. This allows an LDAP configuration for an Atlas project to be created and managed. This endpoint doesn’t verify connectivity using the provided LDAP over TLS configuration details. To verify a configuration before saving it, use the resource to verify the LDAP configuration.
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
    ///     var test = new Mongodbatlas.Project("test", new()
    ///     {
    ///         Name = "NAME OF THE PROJECT",
    ///         OrgId = "ORG ID",
    ///     });
    /// 
    ///     var testLdapConfiguration = new Mongodbatlas.LdapConfiguration("test", new()
    ///     {
    ///         ProjectId = test.Id,
    ///         AuthenticationEnabled = true,
    ///         Hostname = "HOSTNAME",
    ///         Port = 636,
    ///         BindUsername = "USERNAME",
    ///         BindPassword = "PASSWORD",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### LDAP With User To DN Mapping
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.Project("test", new()
    ///     {
    ///         Name = "NAME OF THE PROJECT",
    ///         OrgId = "ORG ID",
    ///     });
    /// 
    ///     var testLdapConfiguration = new Mongodbatlas.LdapConfiguration("test", new()
    ///     {
    ///         ProjectId = test.Id,
    ///         AuthenticationEnabled = true,
    ///         Hostname = "HOSTNAME",
    ///         Port = 636,
    ///         BindUsername = "USERNAME",
    ///         BindPassword = "PASSWORD",
    ///         CaCertificate = "CA CERTIFICATE",
    ///         AuthzQueryTemplate = "{USER}?memberOf?base",
    ///         UserToDnMappings = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.LdapConfigurationUserToDnMappingArgs
    ///             {
    ///                 Match = "(.+)",
    ///                 LdapQuery = "DC=example,DC=com??sub?(userPrincipalName={0})",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// LDAP Configuration must be imported using project ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/ldapConfiguration:LdapConfiguration test 5d09d6a59ccf6445652a444a
    /// ```
    /// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/ldapConfiguration:LdapConfiguration")]
    public partial class LdapConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether user authentication with LDAP is enabled.
        /// </summary>
        [Output("authenticationEnabled")]
        public Output<bool> AuthenticationEnabled { get; private set; } = null!;

        /// <summary>
        /// Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
        /// </summary>
        [Output("authorizationEnabled")]
        public Output<bool> AuthorizationEnabled { get; private set; } = null!;

        /// <summary>
        /// An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
        /// </summary>
        [Output("authzQueryTemplate")]
        public Output<string> AuthzQueryTemplate { get; private set; } = null!;

        /// <summary>
        /// The password used to authenticate the `bind_username`.
        /// </summary>
        [Output("bindPassword")]
        public Output<string> BindPassword { get; private set; } = null!;

        /// <summary>
        /// The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
        /// </summary>
        [Output("bindUsername")]
        public Output<string> BindUsername { get; private set; } = null!;

        /// <summary>
        /// CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
        /// </summary>
        [Output("caCertificate")]
        public Output<string> CaCertificate { get; private set; } = null!;

        /// <summary>
        /// The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// The port to which the LDAP server listens for client connections. Default: `636`
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to configure LDAP.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldap_query` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
        /// * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldap_query` template.
        /// * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
        /// * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
        /// </summary>
        [Output("userToDnMappings")]
        public Output<ImmutableArray<Outputs.LdapConfigurationUserToDnMapping>> UserToDnMappings { get; private set; } = null!;


        /// <summary>
        /// Create a LdapConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LdapConfiguration(string name, LdapConfigurationArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/ldapConfiguration:LdapConfiguration", name, args ?? new LdapConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LdapConfiguration(string name, Input<string> id, LdapConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/ldapConfiguration:LdapConfiguration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "bindPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LdapConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LdapConfiguration Get(string name, Input<string> id, LdapConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new LdapConfiguration(name, id, state, options);
        }
    }

    public sealed class LdapConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether user authentication with LDAP is enabled.
        /// </summary>
        [Input("authenticationEnabled", required: true)]
        public Input<bool> AuthenticationEnabled { get; set; } = null!;

        /// <summary>
        /// Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
        /// </summary>
        [Input("authorizationEnabled")]
        public Input<bool>? AuthorizationEnabled { get; set; }

        /// <summary>
        /// An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
        /// </summary>
        [Input("authzQueryTemplate")]
        public Input<string>? AuthzQueryTemplate { get; set; }

        [Input("bindPassword", required: true)]
        private Input<string>? _bindPassword;

        /// <summary>
        /// The password used to authenticate the `bind_username`.
        /// </summary>
        public Input<string>? BindPassword
        {
            get => _bindPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _bindPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
        /// </summary>
        [Input("bindUsername", required: true)]
        public Input<string> BindUsername { get; set; } = null!;

        /// <summary>
        /// CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
        /// </summary>
        [Input("caCertificate")]
        public Input<string>? CaCertificate { get; set; }

        /// <summary>
        /// The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        /// <summary>
        /// The port to which the LDAP server listens for client connections. Default: `636`
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The unique ID for the project to configure LDAP.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("userToDnMappings")]
        private InputList<Inputs.LdapConfigurationUserToDnMappingArgs>? _userToDnMappings;

        /// <summary>
        /// Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldap_query` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
        /// * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldap_query` template.
        /// * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
        /// * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
        /// </summary>
        public InputList<Inputs.LdapConfigurationUserToDnMappingArgs> UserToDnMappings
        {
            get => _userToDnMappings ?? (_userToDnMappings = new InputList<Inputs.LdapConfigurationUserToDnMappingArgs>());
            set => _userToDnMappings = value;
        }

        public LdapConfigurationArgs()
        {
        }
        public static new LdapConfigurationArgs Empty => new LdapConfigurationArgs();
    }

    public sealed class LdapConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether user authentication with LDAP is enabled.
        /// </summary>
        [Input("authenticationEnabled")]
        public Input<bool>? AuthenticationEnabled { get; set; }

        /// <summary>
        /// Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
        /// </summary>
        [Input("authorizationEnabled")]
        public Input<bool>? AuthorizationEnabled { get; set; }

        /// <summary>
        /// An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
        /// </summary>
        [Input("authzQueryTemplate")]
        public Input<string>? AuthzQueryTemplate { get; set; }

        [Input("bindPassword")]
        private Input<string>? _bindPassword;

        /// <summary>
        /// The password used to authenticate the `bind_username`.
        /// </summary>
        public Input<string>? BindPassword
        {
            get => _bindPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _bindPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
        /// </summary>
        [Input("bindUsername")]
        public Input<string>? BindUsername { get; set; }

        /// <summary>
        /// CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
        /// </summary>
        [Input("caCertificate")]
        public Input<string>? CaCertificate { get; set; }

        /// <summary>
        /// The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The port to which the LDAP server listens for client connections. Default: `636`
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The unique ID for the project to configure LDAP.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("userToDnMappings")]
        private InputList<Inputs.LdapConfigurationUserToDnMappingGetArgs>? _userToDnMappings;

        /// <summary>
        /// Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldap_query` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
        /// * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldap_query` template.
        /// * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
        /// * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
        /// </summary>
        public InputList<Inputs.LdapConfigurationUserToDnMappingGetArgs> UserToDnMappings
        {
            get => _userToDnMappings ?? (_userToDnMappings = new InputList<Inputs.LdapConfigurationUserToDnMappingGetArgs>());
            set => _userToDnMappings = value;
        }

        public LdapConfigurationState()
        {
        }
        public static new LdapConfigurationState Empty => new LdapConfigurationState();
    }
}
