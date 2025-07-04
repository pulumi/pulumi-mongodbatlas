// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetAtlasUsersResultResult
    {
        /// <summary>
        /// Two alphabet characters that identifies MongoDB Cloud user's geographic location. This parameter uses the ISO 3166-1a2 code format.
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
        public readonly ImmutableArray<Outputs.GetAtlasUsersResultLinkResult> Links;
        /// <summary>
        /// Mobile phone number that belongs to the MongoDB Atlas user.
        /// </summary>
        public readonly string MobileNumber;
        public readonly ImmutableArray<Outputs.GetAtlasUsersResultRoleResult> Roles;
        /// <summary>
        /// List of unique 24-hexadecimal digit strings that identifies the teams to which this MongoDB Atlas user belongs.
        /// * `links.#.href` - Uniform Resource Locator (URL) that points another API resource to which this response has some relationship. This URL often begins with https://cloud.mongodb.com/api/atlas.
        /// * `links.#.rel` - Uniform Resource Locator (URL) that defines the semantic relationship between this resource and another API resource. This URL often begins with https://cloud.mongodb.com/api/atlas.
        /// * `roles.#.group_id` - Unique 24-hexadecimal digit string that identifies the project to which this role belongs. You can set a value for this parameter or orgId but not both in the same request.
        /// * `roles.#.org_id` - Unique 24-hexadecimal digit string that identifies the organization to which this role belongs. You can set a value for this parameter or groupId but not both in the same request.
        /// * `roles.#.role_name` - Human-readable label that identifies the collection of privileges that MongoDB Atlas grants a specific API key, user, or team. These roles include organization- and project-level roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#service-user-roles) describes the valid roles that can be assigned.
        /// </summary>
        public readonly ImmutableArray<string> TeamIds;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies this user.
        /// </summary>
        public readonly string UserId;
        /// <summary>
        /// Email address that belongs to the MongoDB Atlas user account. You cannot modify this address after creating the user.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetAtlasUsersResultResult(
            string country,

            string createdAt,

            string emailAddress,

            string firstName,

            string id,

            string lastAuth,

            string lastName,

            ImmutableArray<Outputs.GetAtlasUsersResultLinkResult> links,

            string mobileNumber,

            ImmutableArray<Outputs.GetAtlasUsersResultRoleResult> roles,

            ImmutableArray<string> teamIds,

            string userId,

            string username)
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
