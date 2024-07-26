// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetProjectInvitation
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.ProjectInvitation
        /// 
        /// `mongodbatlas.ProjectInvitation` describes an invitation to a user to join an Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find GROUP-ID in the official documentation.
        /// 
        /// ## Example Usage
        /// 
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
        ///     var testProjectInvitation = new Mongodbatlas.ProjectInvitation("test", new()
        ///     {
        ///         Username = "test-acc-username",
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Roles = new[]
        ///         {
        ///             "GROUP_DATA_ACCESS_READ_WRITE",
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectInvitation.Invoke(new()
        ///     {
        ///         ProjectId = testProjectInvitation.ProjectId,
        ///         Username = testProjectInvitation.Username,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectInvitationResult> InvokeAsync(GetProjectInvitationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectInvitationResult>("mongodbatlas:index/getProjectInvitation:getProjectInvitation", args ?? new GetProjectInvitationArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.ProjectInvitation
        /// 
        /// `mongodbatlas.ProjectInvitation` describes an invitation to a user to join an Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find GROUP-ID in the official documentation.
        /// 
        /// ## Example Usage
        /// 
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
        ///     var testProjectInvitation = new Mongodbatlas.ProjectInvitation("test", new()
        ///     {
        ///         Username = "test-acc-username",
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Roles = new[]
        ///         {
        ///             "GROUP_DATA_ACCESS_READ_WRITE",
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectInvitation.Invoke(new()
        ///     {
        ///         ProjectId = testProjectInvitation.ProjectId,
        ///         Username = testProjectInvitation.Username,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectInvitationResult> Invoke(GetProjectInvitationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectInvitationResult>("mongodbatlas:index/getProjectInvitation:getProjectInvitation", args ?? new GetProjectInvitationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectInvitationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        /// </summary>
        [Input("invitationId", required: true)]
        public string InvitationId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetProjectInvitationArgs()
        {
        }
        public static new GetProjectInvitationArgs Empty => new GetProjectInvitationArgs();
    }

    public sealed class GetProjectInvitationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        /// </summary>
        [Input("invitationId", required: true)]
        public Input<string> InvitationId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetProjectInvitationInvokeArgs()
        {
        }
        public static new GetProjectInvitationInvokeArgs Empty => new GetProjectInvitationInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectInvitationResult
    {
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InvitationId;
        /// <summary>
        /// Atlas user who invited `username` to the project.
        /// </summary>
        public readonly string InviterUsername;
        public readonly string ProjectId;
        /// <summary>
        /// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        /// </summary>
        public readonly ImmutableArray<string> Roles;
        public readonly string Username;

        [OutputConstructor]
        private GetProjectInvitationResult(
            string createdAt,

            string expiresAt,

            string id,

            string invitationId,

            string inviterUsername,

            string projectId,

            ImmutableArray<string> roles,

            string username)
        {
            CreatedAt = createdAt;
            ExpiresAt = expiresAt;
            Id = id;
            InvitationId = invitationId;
            InviterUsername = inviterUsername;
            ProjectId = projectId;
            Roles = roles;
            Username = username;
        }
    }
}
