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
    /// **WARNING:** This resource is deprecated, use `mongodbatlas.Team`
    /// 
    /// This resource is deprecated. Please transition to using `mongodbatlas.Team` which defines the same underlying implementation, aligning the name of the resource with the implementation which manages a single team.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/teams:Teams")]
    public partial class Teams : global::Pulumi.CustomResource
    {
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        [Output("teamId")]
        public Output<string> TeamId { get; private set; } = null!;

        [Output("usernames")]
        public Output<ImmutableArray<string>> Usernames { get; private set; } = null!;


        /// <summary>
        /// Create a Teams resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Teams(string name, TeamsArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/teams:Teams", name, args ?? new TeamsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Teams(string name, Input<string> id, TeamsState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/teams:Teams", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Teams resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Teams Get(string name, Input<string> id, TeamsState? state = null, CustomResourceOptions? options = null)
        {
            return new Teams(name, id, state, options);
        }
    }

    public sealed class TeamsArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("usernames", required: true)]
        private InputList<string>? _usernames;
        public InputList<string> Usernames
        {
            get => _usernames ?? (_usernames = new InputList<string>());
            set => _usernames = value;
        }

        public TeamsArgs()
        {
        }
        public static new TeamsArgs Empty => new TeamsArgs();
    }

    public sealed class TeamsState : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        [Input("usernames")]
        private InputList<string>? _usernames;
        public InputList<string> Usernames
        {
            get => _usernames ?? (_usernames = new InputList<string>());
            set => _usernames = value;
        }

        public TeamsState()
        {
        }
        public static new TeamsState Empty => new TeamsState();
    }
}
