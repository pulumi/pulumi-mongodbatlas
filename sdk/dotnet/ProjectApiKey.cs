// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
    /// 
    /// ### Create And Assign PAK Together
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.ProjectApiKey("test", new()
    ///     {
    ///         Description = "Description of your API key",
    ///         ProjectAssignments = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ProjectApiKeyProjectAssignmentArgs
    ///             {
    ///                 ProjectId = "64259ee860c43338194b0f8e",
    ///                 RoleNames = new[]
    ///                 {
    ///                     "GROUP_OWNER",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create And Assign PAK To Multiple Projects
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.ProjectApiKey("test", new()
    ///     {
    ///         Description = "Description of your API key",
    ///         ProjectAssignments = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ProjectApiKeyProjectAssignmentArgs
    ///             {
    ///                 ProjectId = "64259ee860c43338194b0f8e",
    ///                 RoleNames = new[]
    ///                 {
    ///                     "GROUP_READ_ONLY",
    ///                     "GROUP_OWNER",
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.ProjectApiKeyProjectAssignmentArgs
    ///             {
    ///                 ProjectId = "74259ee860c43338194b0f8e",
    ///                 RoleNames = new[]
    ///                 {
    ///                     "GROUP_READ_ONLY",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// API Keys must be imported using project ID, API Key ID e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
    /// ```
    /// See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/projectApiKey:ProjectApiKey")]
    public partial class ProjectApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique identifier for this Project API key.
        /// </summary>
        [Output("apiKeyId")]
        public Output<string> ApiKeyId { get; private set; } = null!;

        /// <summary>
        /// Description of this Project API key.
        /// 
        /// &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        [Output("projectAssignments")]
        public Output<ImmutableArray<Outputs.ProjectApiKeyProjectAssignment>> ProjectAssignments { get; private set; } = null!;

        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectApiKey(string name, ProjectApiKeyArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/projectApiKey:ProjectApiKey", name, args ?? new ProjectApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectApiKey(string name, Input<string> id, ProjectApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/projectApiKey:ProjectApiKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "privateKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProjectApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectApiKey Get(string name, Input<string> id, ProjectApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectApiKey(name, id, state, options);
        }
    }

    public sealed class ProjectApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of this Project API key.
        /// 
        /// &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("projectAssignments", required: true)]
        private InputList<Inputs.ProjectApiKeyProjectAssignmentArgs>? _projectAssignments;
        public InputList<Inputs.ProjectApiKeyProjectAssignmentArgs> ProjectAssignments
        {
            get => _projectAssignments ?? (_projectAssignments = new InputList<Inputs.ProjectApiKeyProjectAssignmentArgs>());
            set => _projectAssignments = value;
        }

        public ProjectApiKeyArgs()
        {
        }
        public static new ProjectApiKeyArgs Empty => new ProjectApiKeyArgs();
    }

    public sealed class ProjectApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier for this Project API key.
        /// </summary>
        [Input("apiKeyId")]
        public Input<string>? ApiKeyId { get; set; }

        /// <summary>
        /// Description of this Project API key.
        /// 
        /// &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("projectAssignments")]
        private InputList<Inputs.ProjectApiKeyProjectAssignmentGetArgs>? _projectAssignments;
        public InputList<Inputs.ProjectApiKeyProjectAssignmentGetArgs> ProjectAssignments
        {
            get => _projectAssignments ?? (_projectAssignments = new InputList<Inputs.ProjectApiKeyProjectAssignmentGetArgs>());
            set => _projectAssignments = value;
        }

        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        public ProjectApiKeyState()
        {
        }
        public static new ProjectApiKeyState Empty => new ProjectApiKeyState();
    }
}
