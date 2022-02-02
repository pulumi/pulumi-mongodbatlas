// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetDatabaseUser
    {
        /// <summary>
        /// `mongodbatlas.DatabaseUser` describe a Database User. This represents a database user which will be applied to all clusters within the project.
        /// 
        /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Task<GetDatabaseUserResult> InvokeAsync(GetDatabaseUserArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseUserResult>("mongodbatlas:index/getDatabaseUser:getDatabaseUser", args ?? new GetDatabaseUserArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.DatabaseUser` describe a Database User. This represents a database user which will be applied to all clusters within the project.
        /// 
        /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Output<GetDatabaseUserResult> Invoke(GetDatabaseUserInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDatabaseUserResult>("mongodbatlas:index/getDatabaseUser:getDatabaseUser", args ?? new GetDatabaseUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseUserArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is almost always the admin database, for X509 it is $external.
        /// </summary>
        [Input("authDatabaseName")]
        public string? AuthDatabaseName { get; set; }

        /// <summary>
        /// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        /// </summary>
        [Input("databaseName")]
        public string? DatabaseName { get; set; }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Username for authenticating to MongoDB.
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetDatabaseUserArgs()
        {
        }
    }

    public sealed class GetDatabaseUserInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is almost always the admin database, for X509 it is $external.
        /// </summary>
        [Input("authDatabaseName")]
        public Input<string>? AuthDatabaseName { get; set; }

        /// <summary>
        /// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Username for authenticating to MongoDB.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetDatabaseUserInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDatabaseUserResult
    {
        public readonly string? AuthDatabaseName;
        /// <summary>
        /// The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
        /// </summary>
        public readonly string AwsIamType;
        /// <summary>
        /// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        /// </summary>
        public readonly string? DatabaseName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDatabaseUserLabelResult> Labels;
        /// <summary>
        /// Method by which the provided username is authenticated. Default is `NONE`. Other valid values are: `USER`, `GROUP`.
        /// </summary>
        public readonly string LdapAuthType;
        public readonly string ProjectId;
        /// <summary>
        /// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabaseUserRoleResult> Roles;
        /// <summary>
        /// Array of clusters and Atlas Data Lakes that this user has access to.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabaseUserScopeResult> Scopes;
        public readonly string Username;
        /// <summary>
        /// X.509 method by which the provided username is authenticated.
        /// </summary>
        public readonly string X509Type;

        [OutputConstructor]
        private GetDatabaseUserResult(
            string? authDatabaseName,

            string awsIamType,

            string? databaseName,

            string id,

            ImmutableArray<Outputs.GetDatabaseUserLabelResult> labels,

            string ldapAuthType,

            string projectId,

            ImmutableArray<Outputs.GetDatabaseUserRoleResult> roles,

            ImmutableArray<Outputs.GetDatabaseUserScopeResult> scopes,

            string username,

            string x509Type)
        {
            AuthDatabaseName = authDatabaseName;
            AwsIamType = awsIamType;
            DatabaseName = databaseName;
            Id = id;
            Labels = labels;
            LdapAuthType = ldapAuthType;
            ProjectId = projectId;
            Roles = roles;
            Scopes = scopes;
            Username = username;
            X509Type = x509Type;
        }
    }
}
