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
    /// `mongodbatlas..Teams` provides a Team resource. The resource lets you create, edit and delete Teams. Also, Teams can be assigned to multiple projects, and team members’ access to the project is determined by the team’s project role.
    /// 
    /// &gt; **IMPORTANT:** MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Mongodbatlas.Teams("test", new Mongodbatlas.TeamsArgs
    ///         {
    ///             OrgId = "&lt;ORGANIZATION-ID&gt;",
    ///             Usernames = 
    ///             {
    ///                 "user1@email.com",
    ///                 "user2@email.com",
    ///                 "user3@email.com",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Team : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the team you want to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the organization you want to associate the team with.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the team.
        /// </summary>
        [Output("teamId")]
        public Output<string> TeamId { get; private set; } = null!;

        /// <summary>
        /// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team. 
        /// </summary>
        [Output("usernames")]
        public Output<ImmutableArray<string>> Usernames { get; private set; } = null!;


        /// <summary>
        /// Create a Team resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Team(string name, TeamArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/team:Team", name, args ?? new TeamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Team(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/team:Team", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Team resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Team Get(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
        {
            return new Team(name, id, state, options);
        }
    }

    public sealed class TeamArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the team you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique identifier for the organization you want to associate the team with.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("usernames", required: true)]
        private InputList<string>? _usernames;

        /// <summary>
        /// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team. 
        /// </summary>
        public InputList<string> Usernames
        {
            get => _usernames ?? (_usernames = new InputList<string>());
            set => _usernames = value;
        }

        public TeamArgs()
        {
        }
    }

    public sealed class TeamState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the team you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique identifier for the organization you want to associate the team with.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// The unique identifier for the team.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        [Input("usernames")]
        private InputList<string>? _usernames;

        /// <summary>
        /// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team. 
        /// </summary>
        public InputList<string> Usernames
        {
            get => _usernames ?? (_usernames = new InputList<string>());
            set => _usernames = value;
        }

        public TeamState()
        {
        }
    }
}
