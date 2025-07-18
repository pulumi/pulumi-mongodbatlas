// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetDatabaseUsers
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getDatabaseUsers
        /// 
        /// `mongodbatlas.getDatabaseUsers` describes all Database Users. This represents a database user which will be applied to all clusters within the project.
        /// 
        /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
        ///     var testDatabaseUser = new Mongodbatlas.DatabaseUser("test", new()
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
        ///                 DatabaseName = "admin",
        ///             },
        ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
        ///             {
        ///                 RoleName = "atlasAdmin",
        ///                 DatabaseName = "admin",
        ///             },
        ///         },
        ///         Labels = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///             {
        ///                 Key = "key 1",
        ///                 Value = "value 1",
        ///             },
        ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///             {
        ///                 Key = "key 2",
        ///                 Value = "value 2",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetDatabaseUsers.Invoke(new()
        ///     {
        ///         ProjectId = testDatabaseUser.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// **Example of usage with a OIDC federated authentication user**
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testDatabaseUser = new Mongodbatlas.DatabaseUser("test", new()
        ///     {
        ///         Username = "64d613677e1ad50839cce4db/testUserOrGroup",
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
        ///     var test = Mongodbatlas.GetDatabaseUsers.Invoke(new()
        ///     {
        ///         ProjectId = "6414908c207f4d22f4d8f232",
        ///     });
        /// 
        /// });
        /// ```
        /// Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        public static Task<GetDatabaseUsersResult> InvokeAsync(GetDatabaseUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseUsersResult>("mongodbatlas:index/getDatabaseUsers:getDatabaseUsers", args ?? new GetDatabaseUsersArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getDatabaseUsers
        /// 
        /// `mongodbatlas.getDatabaseUsers` describes all Database Users. This represents a database user which will be applied to all clusters within the project.
        /// 
        /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
        ///     var testDatabaseUser = new Mongodbatlas.DatabaseUser("test", new()
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
        ///                 DatabaseName = "admin",
        ///             },
        ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
        ///             {
        ///                 RoleName = "atlasAdmin",
        ///                 DatabaseName = "admin",
        ///             },
        ///         },
        ///         Labels = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///             {
        ///                 Key = "key 1",
        ///                 Value = "value 1",
        ///             },
        ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///             {
        ///                 Key = "key 2",
        ///                 Value = "value 2",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetDatabaseUsers.Invoke(new()
        ///     {
        ///         ProjectId = testDatabaseUser.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// **Example of usage with a OIDC federated authentication user**
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testDatabaseUser = new Mongodbatlas.DatabaseUser("test", new()
        ///     {
        ///         Username = "64d613677e1ad50839cce4db/testUserOrGroup",
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
        ///     var test = Mongodbatlas.GetDatabaseUsers.Invoke(new()
        ///     {
        ///         ProjectId = "6414908c207f4d22f4d8f232",
        ///     });
        /// 
        /// });
        /// ```
        /// Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        public static Output<GetDatabaseUsersResult> Invoke(GetDatabaseUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseUsersResult>("mongodbatlas:index/getDatabaseUsers:getDatabaseUsers", args ?? new GetDatabaseUsersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getDatabaseUsers
        /// 
        /// `mongodbatlas.getDatabaseUsers` describes all Database Users. This represents a database user which will be applied to all clusters within the project.
        /// 
        /// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
        ///     var testDatabaseUser = new Mongodbatlas.DatabaseUser("test", new()
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
        ///                 DatabaseName = "admin",
        ///             },
        ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
        ///             {
        ///                 RoleName = "atlasAdmin",
        ///                 DatabaseName = "admin",
        ///             },
        ///         },
        ///         Labels = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///             {
        ///                 Key = "key 1",
        ///                 Value = "value 1",
        ///             },
        ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///             {
        ///                 Key = "key 2",
        ///                 Value = "value 2",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetDatabaseUsers.Invoke(new()
        ///     {
        ///         ProjectId = testDatabaseUser.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// **Example of usage with a OIDC federated authentication user**
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testDatabaseUser = new Mongodbatlas.DatabaseUser("test", new()
        ///     {
        ///         Username = "64d613677e1ad50839cce4db/testUserOrGroup",
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
        ///     var test = Mongodbatlas.GetDatabaseUsers.Invoke(new()
        ///     {
        ///         ProjectId = "6414908c207f4d22f4d8f232",
        ///     });
        /// 
        /// });
        /// ```
        /// Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
        /// </summary>
        public static Output<GetDatabaseUsersResult> Invoke(GetDatabaseUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseUsersResult>("mongodbatlas:index/getDatabaseUsers:getDatabaseUsers", args ?? new GetDatabaseUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all database users.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetDatabaseUsersArgs()
        {
        }
        public static new GetDatabaseUsersArgs Empty => new GetDatabaseUsersArgs();
    }

    public sealed class GetDatabaseUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all database users.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetDatabaseUsersInvokeArgs()
        {
        }
        public static new GetDatabaseUsersInvokeArgs Empty => new GetDatabaseUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabaseUsersResult
    {
        /// <summary>
        /// Autogenerated Unique ID for this data source.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ID of the Atlas project the user belongs to.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Database user.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabaseUsersResultResult> Results;

        [OutputConstructor]
        private GetDatabaseUsersResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetDatabaseUsersResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
