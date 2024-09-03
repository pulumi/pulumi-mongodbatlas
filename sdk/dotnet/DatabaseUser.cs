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
    /// # Resource: mongodbatlas.DatabaseUser
    /// 
    /// `mongodbatlas.DatabaseUser` provides a Database User resource. This represents a database user which will be applied to all clusters within the project.
    /// 
    /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// &gt; **WARNING:** The password argument is required for creation but should be removed after creation if it will be managed externally. More details can be found in the password argument documentation.
    /// 
    /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text. Read more about sensitive data in state.
    /// 
    /// ## Example of how to create a OIDC federated authentication user
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.DatabaseUser("test", new()
    ///     {
    ///         Username = "64d613677e1ad50839cce4db/testUserOr",
    ///         ProjectId = "6414908c207f4d22f4d8f232",
    ///         AuthDatabaseName = "admin",
    ///         OidcAuthType = "IDP_GROUP",
    ///         Roles = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///             {
    ///                 RoleName = "readWriteAnyDatabase",
    ///                 DatabaseName = "admin",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// `username` format: Atlas OIDC IdP ID (found in federation settings), followed by a '/', followed by the IdP group name
    /// 
    /// Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
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
    ///     var test = new Mongodbatlas.DatabaseUser("test", new()
    ///     {
    ///         Username = "test-acc-username",
    ///         Password = "test-acc-password",
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         AuthDatabaseName = "admin",
    ///         Roles = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///             {
    ///                 RoleName = "readWrite",
    ///                 DatabaseName = "dbforApp",
    ///             },
    ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///             {
    ///                 RoleName = "readAnyDatabase",
    ///                 DatabaseName = "admin",
    ///             },
    ///         },
    ///         Labels = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
    ///             {
    ///                 Key = "My Key",
    ///                 Value = "My Value",
    ///             },
    ///         },
    ///         Scopes = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserScopeArgs
    ///             {
    ///                 Name = "My cluster name",
    ///                 Type = "CLUSTER",
    ///             },
    ///             new Mongodbatlas.Inputs.DatabaseUserScopeArgs
    ///             {
    ///                 Name = "My second cluster name",
    ///                 Type = "CLUSTER",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.DatabaseUser("test", new()
    ///     {
    ///         Username = "test-acc-username",
    ///         X509Type = "MANAGED",
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         AuthDatabaseName = "$external",
    ///         Roles = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///             {
    ///                 RoleName = "readAnyDatabase",
    ///                 DatabaseName = "admin",
    ///             },
    ///         },
    ///         Labels = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
    ///             {
    ///                 Key = "%s",
    ///                 Value = "%s",
    ///             },
    ///         },
    ///         Scopes = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserScopeArgs
    ///             {
    ///                 Name = "My cluster name",
    ///                 Type = "CLUSTER",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.DatabaseUser("test", new()
    ///     {
    ///         Username = testAwsIamRole.Arn,
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         AuthDatabaseName = "$external",
    ///         AwsIamType = "ROLE",
    ///         Roles = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///             {
    ///                 RoleName = "readAnyDatabase",
    ///                 DatabaseName = "admin",
    ///             },
    ///         },
    ///         Labels = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
    ///             {
    ///                 Key = "%s",
    ///                 Value = "%s",
    ///             },
    ///         },
    ///         Scopes = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserScopeArgs
    ///             {
    ///                 Name = "My cluster name",
    ///                 Type = "CLUSTER",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database users can be imported using project ID and username, in the format `project_id`-`username`-`auth_database_name`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/databaseUser:DatabaseUser my_user 1112222b3bf99403840e8934-my_user-admin
    /// ```
    /// ~&gt; __NOTE:__ Terraform will want to change the password after importing the user if a `password` argument is specified.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/databaseUser:DatabaseUser")]
    public partial class DatabaseUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
        /// Accepted values include:
        /// </summary>
        [Output("authDatabaseName")]
        public Output<string> AuthDatabaseName { get; private set; } = null!;

        /// <summary>
        /// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use AWS IAM credentials.
        /// * `USER` - New database user has AWS IAM user credentials.
        /// * `ROLE` -  New database user has credentials associated with an AWS IAM role.
        /// </summary>
        [Output("awsIamType")]
        public Output<string> AwsIamType { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableArray<Outputs.DatabaseUserLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
        /// * `NONE` -	Atlas authenticates this user through [SCRAM-SHA](https://docs.mongodb.com/manual/core/security-scram/), not LDAP.
        /// * `USER` - LDAP server authenticates this user through the user's LDAP user. `username` must also be a fully qualified distinguished name, as defined in [RFC-2253](https://tools.ietf.org/html/rfc2253).
        /// * `GROUP` - LDAP server authenticates this user using their LDAP user and authorizes this user using their LDAP group. To learn more about LDAP security, see [Set up User Authentication and Authorization with LDAP](https://docs.atlas.mongodb.com/security-ldaps). `username` must also be a fully qualified distinguished name, as defined in [RFC-2253](https://tools.ietf.org/html/rfc2253).
        /// </summary>
        [Output("ldapAuthType")]
        public Output<string> LdapAuthType { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use OIDC federated authentication.
        /// * `IDP_GROUP` - OIDC Workforce federated authentication group. To learn more about OIDC federated authentication, see [Set up Workforce Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// * `USER` - OIDC Workload federated authentication user. To learn more about OIDC federated authentication, see [Set up Workload Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        [Output("oidcAuthType")]
        public Output<string> OidcAuthType { get; private set; } = null!;

        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<Outputs.DatabaseUserRole>> Roles { get; private set; } = null!;

        [Output("scopes")]
        public Output<ImmutableArray<Outputs.DatabaseUserScope>> Scopes { get; private set; } = null!;

        /// <summary>
        /// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        /// * `NONE` -	The user does not use X.509 authentication.
        /// * `MANAGED` - The user is being created for use with Atlas-managed X.509.Externally authenticated users can only be created on the `$external` database.
        /// * `CUSTOMER` -  The user is being created for use with Self-Managed X.509. Users created with this x509Type require a Common Name (CN) in the username field. Externally authenticated users can only be created on the `$external` database.
        /// </summary>
        [Output("x509Type")]
        public Output<string> X509Type { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseUser(string name, DatabaseUserArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/databaseUser:DatabaseUser", name, args ?? new DatabaseUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseUser(string name, Input<string> id, DatabaseUserState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/databaseUser:DatabaseUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseUser Get(string name, Input<string> id, DatabaseUserState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseUser(name, id, state, options);
        }
    }

    public sealed class DatabaseUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
        /// Accepted values include:
        /// </summary>
        [Input("authDatabaseName", required: true)]
        public Input<string> AuthDatabaseName { get; set; } = null!;

        /// <summary>
        /// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use AWS IAM credentials.
        /// * `USER` - New database user has AWS IAM user credentials.
        /// * `ROLE` -  New database user has credentials associated with an AWS IAM role.
        /// </summary>
        [Input("awsIamType")]
        public Input<string>? AwsIamType { get; set; }

        [Input("labels")]
        private InputList<Inputs.DatabaseUserLabelArgs>? _labels;
        public InputList<Inputs.DatabaseUserLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.DatabaseUserLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
        /// * `NONE` -	Atlas authenticates this user through [SCRAM-SHA](https://docs.mongodb.com/manual/core/security-scram/), not LDAP.
        /// * `USER` - LDAP server authenticates this user through the user's LDAP user. `username` must also be a fully qualified distinguished name, as defined in [RFC-2253](https://tools.ietf.org/html/rfc2253).
        /// * `GROUP` - LDAP server authenticates this user using their LDAP user and authorizes this user using their LDAP group. To learn more about LDAP security, see [Set up User Authentication and Authorization with LDAP](https://docs.atlas.mongodb.com/security-ldaps). `username` must also be a fully qualified distinguished name, as defined in [RFC-2253](https://tools.ietf.org/html/rfc2253).
        /// </summary>
        [Input("ldapAuthType")]
        public Input<string>? LdapAuthType { get; set; }

        /// <summary>
        /// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use OIDC federated authentication.
        /// * `IDP_GROUP` - OIDC Workforce federated authentication group. To learn more about OIDC federated authentication, see [Set up Workforce Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// * `USER` - OIDC Workload federated authentication user. To learn more about OIDC federated authentication, see [Set up Workload Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        [Input("oidcAuthType")]
        public Input<string>? OidcAuthType { get; set; }

        [Input("password")]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("roles")]
        private InputList<Inputs.DatabaseUserRoleArgs>? _roles;

        /// <summary>
        /// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        /// </summary>
        public InputList<Inputs.DatabaseUserRoleArgs> Roles
        {
            get => _roles ?? (_roles = new InputList<Inputs.DatabaseUserRoleArgs>());
            set => _roles = value;
        }

        [Input("scopes")]
        private InputList<Inputs.DatabaseUserScopeArgs>? _scopes;
        public InputList<Inputs.DatabaseUserScopeArgs> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<Inputs.DatabaseUserScopeArgs>());
            set => _scopes = value;
        }

        /// <summary>
        /// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        /// <summary>
        /// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        /// * `NONE` -	The user does not use X.509 authentication.
        /// * `MANAGED` - The user is being created for use with Atlas-managed X.509.Externally authenticated users can only be created on the `$external` database.
        /// * `CUSTOMER` -  The user is being created for use with Self-Managed X.509. Users created with this x509Type require a Common Name (CN) in the username field. Externally authenticated users can only be created on the `$external` database.
        /// </summary>
        [Input("x509Type")]
        public Input<string>? X509Type { get; set; }

        public DatabaseUserArgs()
        {
        }
        public static new DatabaseUserArgs Empty => new DatabaseUserArgs();
    }

    public sealed class DatabaseUserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
        /// Accepted values include:
        /// </summary>
        [Input("authDatabaseName")]
        public Input<string>? AuthDatabaseName { get; set; }

        /// <summary>
        /// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use AWS IAM credentials.
        /// * `USER` - New database user has AWS IAM user credentials.
        /// * `ROLE` -  New database user has credentials associated with an AWS IAM role.
        /// </summary>
        [Input("awsIamType")]
        public Input<string>? AwsIamType { get; set; }

        [Input("labels")]
        private InputList<Inputs.DatabaseUserLabelGetArgs>? _labels;
        public InputList<Inputs.DatabaseUserLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.DatabaseUserLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
        /// * `NONE` -	Atlas authenticates this user through [SCRAM-SHA](https://docs.mongodb.com/manual/core/security-scram/), not LDAP.
        /// * `USER` - LDAP server authenticates this user through the user's LDAP user. `username` must also be a fully qualified distinguished name, as defined in [RFC-2253](https://tools.ietf.org/html/rfc2253).
        /// * `GROUP` - LDAP server authenticates this user using their LDAP user and authorizes this user using their LDAP group. To learn more about LDAP security, see [Set up User Authentication and Authorization with LDAP](https://docs.atlas.mongodb.com/security-ldaps). `username` must also be a fully qualified distinguished name, as defined in [RFC-2253](https://tools.ietf.org/html/rfc2253).
        /// </summary>
        [Input("ldapAuthType")]
        public Input<string>? LdapAuthType { get; set; }

        /// <summary>
        /// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use OIDC federated authentication.
        /// * `IDP_GROUP` - OIDC Workforce federated authentication group. To learn more about OIDC federated authentication, see [Set up Workforce Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// * `USER` - OIDC Workload federated authentication user. To learn more about OIDC federated authentication, see [Set up Workload Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        [Input("oidcAuthType")]
        public Input<string>? OidcAuthType { get; set; }

        [Input("password")]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("roles")]
        private InputList<Inputs.DatabaseUserRoleGetArgs>? _roles;

        /// <summary>
        /// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        /// </summary>
        public InputList<Inputs.DatabaseUserRoleGetArgs> Roles
        {
            get => _roles ?? (_roles = new InputList<Inputs.DatabaseUserRoleGetArgs>());
            set => _roles = value;
        }

        [Input("scopes")]
        private InputList<Inputs.DatabaseUserScopeGetArgs>? _scopes;
        public InputList<Inputs.DatabaseUserScopeGetArgs> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<Inputs.DatabaseUserScopeGetArgs>());
            set => _scopes = value;
        }

        /// <summary>
        /// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        /// * `NONE` -	The user does not use X.509 authentication.
        /// * `MANAGED` - The user is being created for use with Atlas-managed X.509.Externally authenticated users can only be created on the `$external` database.
        /// * `CUSTOMER` -  The user is being created for use with Self-Managed X.509. Users created with this x509Type require a Common Name (CN) in the username field. Externally authenticated users can only be created on the `$external` database.
        /// </summary>
        [Input("x509Type")]
        public Input<string>? X509Type { get; set; }

        public DatabaseUserState()
        {
        }
        public static new DatabaseUserState Empty => new DatabaseUserState();
    }
}
