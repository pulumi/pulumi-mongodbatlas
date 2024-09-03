// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAtlasUser
    {
        /// <summary>
        /// # Data Source: mongodbatlas.getAtlasUser
        /// 
        /// `mongodbatlas.getAtlasUser` Provides a MongoDB Atlas User.
        /// 
        /// &gt; **NOTE:** If you are the owner of a MongoDB Atlas organization or project, you can also retrieve the user profile for any user with membership in that organization or project.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using user_id attribute to query
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUser.Invoke(new()
        ///     {
        ///         UserId = "&lt;USER_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using username attribute to query
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUser.Invoke(new()
        ///     {
        ///         Username = "&lt;USERNAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAtlasUserResult> InvokeAsync(GetAtlasUserArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAtlasUserResult>("mongodbatlas:index/getAtlasUser:getAtlasUser", args ?? new GetAtlasUserArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.getAtlasUser
        /// 
        /// `mongodbatlas.getAtlasUser` Provides a MongoDB Atlas User.
        /// 
        /// &gt; **NOTE:** If you are the owner of a MongoDB Atlas organization or project, you can also retrieve the user profile for any user with membership in that organization or project.
        /// 
        /// ## Example Usage
        /// 
        /// ### Using user_id attribute to query
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUser.Invoke(new()
        ///     {
        ///         UserId = "&lt;USER_ID&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using username attribute to query
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetAtlasUser.Invoke(new()
        ///     {
        ///         Username = "&lt;USERNAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAtlasUserResult> Invoke(GetAtlasUserInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAtlasUserResult>("mongodbatlas:index/getAtlasUser:getAtlasUser", args ?? new GetAtlasUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAtlasUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies this user.
        /// </summary>
        [Input("userId")]
        public string? UserId { get; set; }

        /// <summary>
        /// Email address that belongs to the MongoDB Atlas user account. You can't modify this address after creating the user.
        /// 
        /// &gt; **IMPORTANT:** Either `user_id` or `username` must be configurated.
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetAtlasUserArgs()
        {
        }
        public static new GetAtlasUserArgs Empty => new GetAtlasUserArgs();
    }

    public sealed class GetAtlasUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies this user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        /// <summary>
        /// Email address that belongs to the MongoDB Atlas user account. You can't modify this address after creating the user.
        /// 
        /// &gt; **IMPORTANT:** Either `user_id` or `username` must be configurated.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GetAtlasUserInvokeArgs()
        {
        }
        public static new GetAtlasUserInvokeArgs Empty => new GetAtlasUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetAtlasUserResult
    {
        /// <summary>
        /// Two alphabet characters that identifies MongoDB Atlas user's geographic location. This parameter uses the ISO 3166-1a2 code format.
        /// </summary>
        public readonly string Country;
        /// <summary>
        /// Date and time when the current account is created. This value is in the ISO 8601 timestamp format in UTC.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Email address that belongs to the MongoDB Atlas user.
        /// </summary>
        public readonly string EmailAddress;
        /// <summary>
        /// First or given name that belongs to the MongoDB Atlas user.
        /// </summary>
        public readonly string FirstName;
        public readonly string Id;
        /// <summary>
        /// Date and time when the current account last authenticated. This value is in the ISO 8601 timestamp format in UTC.
        /// </summary>
        public readonly string LastAuth;
        /// <summary>
        /// Last name, family name, or surname that belongs to the MongoDB Atlas user.
        /// </summary>
        public readonly string LastName;
        public readonly ImmutableArray<Outputs.GetAtlasUserLinkResult> Links;
        /// <summary>
        /// Mobile phone number that belongs to the MongoDB Atlas user.
        /// </summary>
        public readonly string MobileNumber;
        public readonly ImmutableArray<Outputs.GetAtlasUserRoleResult> Roles;
        /// <summary>
        /// List of unique 24-hexadecimal digit strings that identifies the teams to which this MongoDB Atlas user belongs.
        /// * `links.#.href` - Uniform Resource Locator (URL) that points another API resource to which this response has some relationship. This URL often begins with &lt;https://cloud.mongodb.com/api/atlas&gt;.
        /// * `links.#.rel` - Uniform Resource Locator (URL) that defines the semantic relationship between this resource and another API resource. This URL often begins with &lt;https://cloud.mongodb.com/api/atlas&gt;.
        /// * `roles.#.group_id` - Unique 24-hexadecimal digit string that identifies the project to which this role belongs. You can set a value for this parameter or orgId but not both in the same request.
        /// * `roles.#.org_id` - Unique 24-hexadecimal digit string that identifies the organization to which this role belongs. You can set a value for this parameter or groupId but not both in the same request.
        /// * `roles.#.role_name` - Human-readable label that identifies the collection of privileges that MongoDB Atlas grants a specific API key, user, or team. These roles include organization- and project-level roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#service-user-roles) describes the valid roles that can be assigned.
        /// </summary>
        public readonly ImmutableArray<string> TeamIds;
        public readonly string? UserId;
        public readonly string? Username;

        [OutputConstructor]
        private GetAtlasUserResult(
            string country,

            string createdAt,

            string emailAddress,

            string firstName,

            string id,

            string lastAuth,

            string lastName,

            ImmutableArray<Outputs.GetAtlasUserLinkResult> links,

            string mobileNumber,

            ImmutableArray<Outputs.GetAtlasUserRoleResult> roles,

            ImmutableArray<string> teamIds,

            string? userId,

            string? username)
        {
            Country = country;
            CreatedAt = createdAt;
            EmailAddress = emailAddress;
            FirstName = firstName;
            Id = id;
            LastAuth = lastAuth;
            LastName = lastName;
            Links = links;
            MobileNumber = mobileNumber;
            Roles = roles;
            TeamIds = teamIds;
            UserId = userId;
            Username = username;
        }
    }
}
