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
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.ProjectApiKey("test", new()
    ///     {
    ///         Description = "key-name",
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         RoleNames = new[]
    ///         {
    ///             "GROUP_OWNER",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// API Keys must be imported using org ID, API Key ID e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
    /// ```
    /// 
    ///  See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createAndAssignOneOrganizationApiKeyToOneProject) - Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/projectApiKey:ProjectApiKey")]
    public partial class ProjectApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The unique identifier of the Programmatic API key you want to associate with the Project.  The Programmatic API key and Project must share the same parent organization.  Note: this is not the `publicKey` of the Programmatic API key but the `id` of the key. See [Programmatic API Keys](https://docs.atlas.mongodb.com/reference/api/apiKeys/) for more.
        /// </summary>
        [Output("apiKeyId")]
        public Output<string> ApiKeyId { get; private set; } = null!;

        /// <summary>
        /// Description of this Organization API key.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key.
        /// The following are valid roles:
        /// </summary>
        [Output("roleNames")]
        public Output<ImmutableArray<string>> RoleNames { get; private set; } = null!;


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
        /// Description of this Organization API key.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("roleNames", required: true)]
        private InputList<string>? _roleNames;

        /// <summary>
        /// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key.
        /// The following are valid roles:
        /// </summary>
        public InputList<string> RoleNames
        {
            get => _roleNames ?? (_roleNames = new InputList<string>());
            set => _roleNames = value;
        }

        public ProjectApiKeyArgs()
        {
        }
        public static new ProjectApiKeyArgs Empty => new ProjectApiKeyArgs();
    }

    public sealed class ProjectApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier of the Programmatic API key you want to associate with the Project.  The Programmatic API key and Project must share the same parent organization.  Note: this is not the `publicKey` of the Programmatic API key but the `id` of the key. See [Programmatic API Keys](https://docs.atlas.mongodb.com/reference/api/apiKeys/) for more.
        /// </summary>
        [Input("apiKeyId")]
        public Input<string>? ApiKeyId { get; set; }

        /// <summary>
        /// Description of this Organization API key.
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

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        [Input("roleNames")]
        private InputList<string>? _roleNames;

        /// <summary>
        /// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key.
        /// The following are valid roles:
        /// </summary>
        public InputList<string> RoleNames
        {
            get => _roleNames ?? (_roleNames = new InputList<string>());
            set => _roleNames = value;
        }

        public ProjectApiKeyState()
        {
        }
        public static new ProjectApiKeyState Empty => new ProjectApiKeyState();
    }
}