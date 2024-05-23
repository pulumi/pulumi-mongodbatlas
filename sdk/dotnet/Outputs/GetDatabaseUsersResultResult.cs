// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetDatabaseUsersResultResult
    {
        /// <summary>
        /// (Required) Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
        /// Possible values include:
        /// </summary>
        public readonly string AuthDatabaseName;
        /// <summary>
        /// The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
        /// </summary>
        public readonly string AwsIamType;
        /// <summary>
        /// Autogenerated Unique ID for this data source.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDatabaseUsersResultLabelResult> Labels;
        /// <summary>
        /// Method by which the provided username is authenticated. Default is `NONE`. Other valid values are: `USER`, `GROUP`.
        /// </summary>
        public readonly string LdapAuthType;
        /// <summary>
        /// (Optional) Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
        /// * `NONE` -	The user does not use OIDC federated authentication.
        /// * `IDP_GROUP` - Create a OIDC federated authentication user. To learn more about OIDC federated authentication, see [Set up Workforce Identity Federation with OIDC](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        public readonly string OidcAuthType;
        /// <summary>
        /// The unique ID for the project to get all database users.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabaseUsersResultRoleResult> Roles;
        /// <summary>
        /// Array of clusters and Atlas Data Lakes that this user has access to.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabaseUsersResultScopeResult> Scopes;
        /// <summary>
        /// Username for authenticating to MongoDB.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// X.509 method by which the provided username is authenticated.
        /// </summary>
        public readonly string X509Type;

        [OutputConstructor]
        private GetDatabaseUsersResultResult(
            string authDatabaseName,

            string awsIamType,

            string id,

            ImmutableArray<Outputs.GetDatabaseUsersResultLabelResult> labels,

            string ldapAuthType,

            string oidcAuthType,

            string projectId,

            ImmutableArray<Outputs.GetDatabaseUsersResultRoleResult> roles,

            ImmutableArray<Outputs.GetDatabaseUsersResultScopeResult> scopes,

            string username,

            string x509Type)
        {
            AuthDatabaseName = authDatabaseName;
            AwsIamType = awsIamType;
            Id = id;
            Labels = labels;
            LdapAuthType = ldapAuthType;
            OidcAuthType = oidcAuthType;
            ProjectId = projectId;
            Roles = roles;
            Scopes = scopes;
            Username = username;
            X509Type = x509Type;
        }
    }
}
