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
    /// ## Example Usage
    /// ### S
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.ProjectInvitation("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         Roles = new[]
    ///         {
    ///             "GROUP_DATA_ACCESS_READ_WRITE",
    ///         },
    ///         Username = "test-acc-username",
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
    ///     var test = new Mongodbatlas.ProjectInvitation("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         Roles = new[]
    ///         {
    ///             "GROUP_READ_ONLY",
    ///             "GROUP_DATA_ACCESS_READ_ONLY",
    ///         },
    ///         Username = "test-acc-username",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ~&gt; __IMPORTANT:__ A project invitation can __not__ be imported once it has been accepted.
    /// 
    /// Import a user's invitation to a project by separating the `project_id` and the `username` with a hyphen:
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/projectInvitation:ProjectInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
    /// ```
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/projectInvitation:ProjectInvitation")]
    public partial class ProjectInvitation : global::Pulumi.CustomResource
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
        /// Atlas user who invited `username` to the project.
        /// </summary>
        [Output("inviterUsername")]
        public Output<string> InviterUsername { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectInvitation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectInvitation(string name, ProjectInvitationArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/projectInvitation:ProjectInvitation", name, args ?? new ProjectInvitationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectInvitation(string name, Input<string> id, ProjectInvitationState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/projectInvitation:ProjectInvitation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectInvitation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectInvitation Get(string name, Input<string> id, ProjectInvitationState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectInvitation(name, id, state, options);
        }
    }

    public sealed class ProjectInvitationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ProjectInvitationArgs()
        {
        }
        public static new ProjectInvitationArgs Empty => new ProjectInvitationArgs();
    }

    public sealed class ProjectInvitationState : global::Pulumi.ResourceArgs
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
        /// Atlas user who invited `username` to the project.
        /// </summary>
        [Input("inviterUsername")]
        public Input<string>? InviterUsername { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProjectInvitationState()
        {
        }
        public static new ProjectInvitationState Empty => new ProjectInvitationState();
    }
}
