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
    /// `mongodbatlas.Project` provides a Project resource. This allows project to be created.
    /// 
    /// &gt; **IMPORTANT WARNING:**  Changing the name of an existing Project in your configuration will result the destruction of that Project and related resources (including Clusters) and the re-creation of those resources.  The provider will inform you of the destroyed/created resources before applying so be sure to verify any change to your environment before applying.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Mongodbatlas.Project("test", new Mongodbatlas.ProjectArgs
    ///         {
    ///             OrgId = "&lt;ORG_ID&gt;",
    ///             Teams = 
    ///             {
    ///                 new Mongodbatlas.Inputs.ProjectTeamArgs
    ///                 {
    ///                     RoleNames = 
    ///                     {
    ///                         "GROUP_OWNER",
    ///                     },
    ///                     TeamId = "5e0fa8c99ccf641c722fe645",
    ///                 },
    ///                 new Mongodbatlas.Inputs.ProjectTeamArgs
    ///                 {
    ///                     RoleNames = 
    ///                     {
    ///                         "GROUP_READ_ONLY",
    ///                         "GROUP_DATA_ACCESS_READ_WRITE",
    ///                     },
    ///                     TeamId = "5e1dd7b4f2a30ba80a70cd4rw",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Project : Pulumi.CustomResource
    {
        /// <summary>
        /// The number of Atlas clusters deployed in the project..
        /// </summary>
        [Output("clusterCount")]
        public Output<int> ClusterCount { get; private set; } = null!;

        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project..
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        [Output("teams")]
        public Output<ImmutableArray<Outputs.ProjectTeam>> Teams { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/project:Project", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("teams")]
        private InputList<Inputs.ProjectTeamArgs>? _teams;
        public InputList<Inputs.ProjectTeamArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.ProjectTeamArgs>());
            set => _teams = value;
        }

        public ProjectArgs()
        {
        }
    }

    public sealed class ProjectState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of Atlas clusters deployed in the project..
        /// </summary>
        [Input("clusterCount")]
        public Input<int>? ClusterCount { get; set; }

        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project..
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("teams")]
        private InputList<Inputs.ProjectTeamGetArgs>? _teams;
        public InputList<Inputs.ProjectTeamGetArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.ProjectTeamGetArgs>());
            set => _teams = value;
        }

        public ProjectState()
        {
        }
    }
}
