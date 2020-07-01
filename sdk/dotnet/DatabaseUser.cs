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
    /// `mongodbatlas.DatabaseUser` provides a Database User resource. This represents a database user which will be applied to all clusters within the project.
    /// 
    /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text.
    /// 
    /// ## Example Usage
    /// ### S
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Mongodbatlas.DatabaseUser("test", new Mongodbatlas.DatabaseUserArgs
    ///         {
    ///             AuthDatabaseName = "admin",
    ///             Labels = 
    ///             {
    ///                 new Mongodbatlas.Inputs.DatabaseUserLabelArgs
    ///                 {
    ///                     Key = "My Key",
    ///                     Value = "My Value",
    ///                 },
    ///             },
    ///             Password = "test-acc-password",
    ///             ProjectId = "&lt;PROJECT-ID&gt;",
    ///             Roles = 
    ///             {
    ///                 new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///                 {
    ///                     DatabaseName = "dbforApp",
    ///                     RoleName = "readWrite",
    ///                 },
    ///                 new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///                 {
    ///                     DatabaseName = "admin",
    ///                     RoleName = "readAnyDatabase",
    ///                 },
    ///             },
    ///             Username = "test-acc-username",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Mongodbatlas.DatabaseUser("test", new Mongodbatlas.DatabaseUserArgs
    ///         {
    ///             AuthDatabaseName = "$external",
    ///             Labels = 
    ///             {
    ///                 new Mongodbatlas.Inputs.DatabaseUserLabelArgs
    ///                 {
    ///                     Key = "%s",
    ///                     Value = "%s",
    ///                 },
    ///             },
    ///             ProjectId = "&lt;PROJECT-ID&gt;",
    ///             Roles = 
    ///             {
    ///                 new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///                 {
    ///                     DatabaseName = "admin",
    ///                     RoleName = "readAnyDatabase",
    ///                 },
    ///             },
    ///             Username = "test-acc-username",
    ///             X509Type = "MANAGED",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class DatabaseUser : Pulumi.CustomResource
    {
        /// <summary>
        /// The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is always the admin database.
        /// </summary>
        [Output("authDatabaseName")]
        public Output<string?> AuthDatabaseName { get; private set; } = null!;

        /// <summary>
        /// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        /// </summary>
        [Output("databaseName")]
        public Output<string?> DatabaseName { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableArray<Outputs.DatabaseUserLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// User's initial password. A value is required to create the database user, however the argument but may be removed from your configuration after user creation without impacting the user, password or management. IMPORTANT --- Passwords may show up in provider related logs and it will be stored in the state file as plain-text. Password can be changed after creation using your preferred method, e.g. via the MongoDB Atlas UI, to ensure security.  If you do change management of the password to outside of provider be sure to remove the argument from the provider configuration so it is not inadvertently updated to the original password.
        /// </summary>
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

        /// <summary>
        /// Username for authenticating to MongoDB.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        /// </summary>
        [Output("x509Type")]
        public Output<string?> X509Type { get; private set; } = null!;


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

    public sealed class DatabaseUserArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is always the admin database.
        /// </summary>
        [Input("authDatabaseName")]
        public Input<string>? AuthDatabaseName { get; set; }

        /// <summary>
        /// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("labels")]
        private InputList<Inputs.DatabaseUserLabelArgs>? _labels;
        public InputList<Inputs.DatabaseUserLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.DatabaseUserLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// User's initial password. A value is required to create the database user, however the argument but may be removed from your configuration after user creation without impacting the user, password or management. IMPORTANT --- Passwords may show up in provider related logs and it will be stored in the state file as plain-text. Password can be changed after creation using your preferred method, e.g. via the MongoDB Atlas UI, to ensure security.  If you do change management of the password to outside of provider be sure to remove the argument from the provider configuration so it is not inadvertently updated to the original password.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

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

        /// <summary>
        /// Username for authenticating to MongoDB.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        /// <summary>
        /// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        /// </summary>
        [Input("x509Type")]
        public Input<string>? X509Type { get; set; }

        public DatabaseUserArgs()
        {
        }
    }

    public sealed class DatabaseUserState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is always the admin database.
        /// </summary>
        [Input("authDatabaseName")]
        public Input<string>? AuthDatabaseName { get; set; }

        /// <summary>
        /// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("labels")]
        private InputList<Inputs.DatabaseUserLabelGetArgs>? _labels;
        public InputList<Inputs.DatabaseUserLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.DatabaseUserLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// User's initial password. A value is required to create the database user, however the argument but may be removed from your configuration after user creation without impacting the user, password or management. IMPORTANT --- Passwords may show up in provider related logs and it will be stored in the state file as plain-text. Password can be changed after creation using your preferred method, e.g. via the MongoDB Atlas UI, to ensure security.  If you do change management of the password to outside of provider be sure to remove the argument from the provider configuration so it is not inadvertently updated to the original password.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

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

        /// <summary>
        /// Username for authenticating to MongoDB.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        /// </summary>
        [Input("x509Type")]
        public Input<string>? X509Type { get; set; }

        public DatabaseUserState()
        {
        }
    }
}
