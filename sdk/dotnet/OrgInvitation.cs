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
    /// `mongodbatlas.OrgInvitation` invites a user to join an Atlas organization.
    /// 
    /// Each invitation for an Atlas user includes roles that Atlas grants the user when they accept the invitation.
    /// 
    /// The [MongoDB Documentation](https://docs.atlas.mongodb.com/reference/user-roles/#organization-roles) describes the roles a user can have, which map to:
    /// 
    /// * ORG_OWNER
    /// * ORG_GROUP_CREATOR
    /// * ORG_BILLING_ADMIN
    /// * ORG_READ_ONLY
    /// * ORG_MEMBER
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
    ///         var test0 = new Mongodbatlas.OrgInvitation("test0", new Mongodbatlas.OrgInvitationArgs
    ///         {
    ///             OrgId = "&lt;ORG-ID&gt;",
    ///             Roles = 
    ///             {
    ///                 "ORG_OWNER",
    ///             },
    ///             Username = "test0-acc-username",
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
    ///         var test0 = new Mongodbatlas.OrgInvitation("test0", new Mongodbatlas.OrgInvitationArgs
    ///         {
    ///             OrgId = "&lt;ORG-ID&gt;",
    ///             Roles = 
    ///             {
    ///                 "ORG_MEMBER",
    ///                 "ORG_BILLING_ADMIN",
    ///             },
    ///             Username = "test0-acc-username",
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
    ///         var test1 = new Mongodbatlas.OrgInvitation("test1", new Mongodbatlas.OrgInvitationArgs
    ///         {
    ///             OrgId = "&lt;ORG-ID&gt;",
    ///             Roles = 
    ///             {
    ///                 "ORG_MEMBER",
    ///             },
    ///             TeamsIds = 
    ///             {
    ///                 "&lt;TEAM-0-ID&gt;",
    ///                 "&lt;TEAM-1-ID&gt;",
    ///             },
    ///             Username = "test1-acc-username",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import a user's invitation to an organization by separating the `org_id` and the `username` with a hyphen
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/orgInvitation:OrgInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
    /// ```
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/orgInvitation:OrgInvitation")]
    public partial class OrgInvitation : Pulumi.CustomResource
    {
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        /// </summary>
        [Output("expiresAt")]
        public Output<string> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        /// </summary>
        [Output("invitationId")]
        public Output<string> InvitationId { get; private set; } = null!;

        /// <summary>
        /// Atlas user who invited `username` to the organization.
        /// </summary>
        [Output("inviterUsername")]
        public Output<string> InviterUsername { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The following options are available:
        /// * ORG_OWNER
        /// * ORG_GROUP_CREATOR
        /// * ORG_BILLING_ADMIN
        /// * ORG_READ_ONLY
        /// * ORG_MEMBER
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        /// </summary>
        [Output("teamsIds")]
        public Output<ImmutableArray<string>> TeamsIds { get; private set; } = null!;

        /// <summary>
        /// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a OrgInvitation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrgInvitation(string name, OrgInvitationArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/orgInvitation:OrgInvitation", name, args ?? new OrgInvitationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrgInvitation(string name, Input<string> id, OrgInvitationState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/orgInvitation:OrgInvitation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrgInvitation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrgInvitation Get(string name, Input<string> id, OrgInvitationState? state = null, CustomResourceOptions? options = null)
        {
            return new OrgInvitation(name, id, state, options);
        }
    }

    public sealed class OrgInvitationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The following options are available:
        /// * ORG_OWNER
        /// * ORG_GROUP_CREATOR
        /// * ORG_BILLING_ADMIN
        /// * ORG_READ_ONLY
        /// * ORG_MEMBER
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("teamsIds")]
        private InputList<string>? _teamsIds;

        /// <summary>
        /// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        /// </summary>
        public InputList<string> TeamsIds
        {
            get => _teamsIds ?? (_teamsIds = new InputList<string>());
            set => _teamsIds = value;
        }

        /// <summary>
        /// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public OrgInvitationArgs()
        {
        }
    }

    public sealed class OrgInvitationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        /// </summary>
        [Input("invitationId")]
        public Input<string>? InvitationId { get; set; }

        /// <summary>
        /// Atlas user who invited `username` to the organization.
        /// </summary>
        [Input("inviterUsername")]
        public Input<string>? InviterUsername { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The following options are available:
        /// * ORG_OWNER
        /// * ORG_GROUP_CREATOR
        /// * ORG_BILLING_ADMIN
        /// * ORG_READ_ONLY
        /// * ORG_MEMBER
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("teamsIds")]
        private InputList<string>? _teamsIds;

        /// <summary>
        /// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        /// </summary>
        public InputList<string> TeamsIds
        {
            get => _teamsIds ?? (_teamsIds = new InputList<string>());
            set => _teamsIds = value;
        }

        /// <summary>
        /// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public OrgInvitationState()
        {
        }
    }
}
