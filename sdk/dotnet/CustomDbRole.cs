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
    /// `mongodbatlas.CustomDbRole` provides a Custom DB Role resource. The customDBRoles resource lets you retrieve, create and modify the custom MongoDB roles in your cluster. Use custom MongoDB roles to specify custom sets of actions which cannot be described by the built-in Atlas database user privileges.
    /// 
    /// &gt; **IMPORTANT**  You define custom roles at the project level for all clusters in the project. The `mongodbatlas.CustomDbRole` resource supports a subset of MongoDB privilege actions. For a complete list of [privilege actions](https://docs.mongodb.com/manual/reference/privilege-actions/) available for this resource, see [Custom Role actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions/). Custom roles must include actions that all project's clusters support, and that are compatible with each MongoDB version used by your project's clusters. For example, if your project has MongoDB 4.2 clusters, you can't create custom roles that use actions introduced in MongoDB 4.4.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testRole = new Mongodbatlas.CustomDbRole("testRole", new()
    ///     {
    ///         Actions = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "UPDATE",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         CollectionName = "",
    ///                         DatabaseName = "anyDatabase",
    ///                     },
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "INSERT",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         CollectionName = "",
    ///                         DatabaseName = "anyDatabase",
    ///                     },
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "REMOVE",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         CollectionName = "",
    ///                         DatabaseName = "anyDatabase",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         RoleName = "myCustomRole",
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Inherited Roles
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var inheritedRoleOne = new Mongodbatlas.CustomDbRole("inheritedRoleOne", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         RoleName = "insertRole",
    ///         Actions = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "INSERT",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         CollectionName = "",
    ///                         DatabaseName = "anyDatabase",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var inheritedRoleTwo = new Mongodbatlas.CustomDbRole("inheritedRoleTwo", new()
    ///     {
    ///         ProjectId = inheritedRoleOne.ProjectId,
    ///         RoleName = "statusServerRole",
    ///         Actions = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "SERVER_STATUS",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         Cluster = true,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var testRole = new Mongodbatlas.CustomDbRole("testRole", new()
    ///     {
    ///         ProjectId = inheritedRoleOne.ProjectId,
    ///         RoleName = "myCustomRole",
    ///         Actions = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "UPDATE",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         CollectionName = "",
    ///                         DatabaseName = "anyDatabase",
    ///                     },
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.CustomDbRoleActionArgs
    ///             {
    ///                 Action = "REMOVE",
    ///                 Resources = new[]
    ///                 {
    ///                     new Mongodbatlas.Inputs.CustomDbRoleActionResourceArgs
    ///                     {
    ///                         CollectionName = "",
    ///                         DatabaseName = "anyDatabase",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         InheritedRoles = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.CustomDbRoleInheritedRoleArgs
    ///             {
    ///                 RoleName = inheritedRoleOne.RoleName,
    ///                 DatabaseName = "admin",
    ///             },
    ///             new Mongodbatlas.Inputs.CustomDbRoleInheritedRoleArgs
    ///             {
    ///                 RoleName = inheritedRoleTwo.RoleName,
    ///                 DatabaseName = "admin",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database users can be imported using project ID and username, in the format `PROJECTID-ROLENAME`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/customDbRole:CustomDbRole my_role 1112222b3bf99403840e8934-MyCustomRole
    /// ```
    /// 
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/custom-roles/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/customDbRole:CustomDbRole")]
    public partial class CustomDbRole : global::Pulumi.CustomResource
    {
        [Output("actions")]
        public Output<ImmutableArray<Outputs.CustomDbRoleAction>> Actions { get; private set; } = null!;

        [Output("inheritedRoles")]
        public Output<ImmutableArray<Outputs.CustomDbRoleInheritedRole>> InheritedRoles { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Name of the custom role.
        /// 
        /// &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
        /// 
        /// * Is a name already used by an existing custom role in the project
        /// * Is a name of any of the built-in roles
        /// * Is `atlasAdmin`
        /// * Starts with `xgen-`
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;


        /// <summary>
        /// Create a CustomDbRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomDbRole(string name, CustomDbRoleArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/customDbRole:CustomDbRole", name, args ?? new CustomDbRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomDbRole(string name, Input<string> id, CustomDbRoleState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/customDbRole:CustomDbRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomDbRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomDbRole Get(string name, Input<string> id, CustomDbRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomDbRole(name, id, state, options);
        }
    }

    public sealed class CustomDbRoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.CustomDbRoleActionArgs>? _actions;
        public InputList<Inputs.CustomDbRoleActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.CustomDbRoleActionArgs>());
            set => _actions = value;
        }

        [Input("inheritedRoles")]
        private InputList<Inputs.CustomDbRoleInheritedRoleArgs>? _inheritedRoles;
        public InputList<Inputs.CustomDbRoleInheritedRoleArgs> InheritedRoles
        {
            get => _inheritedRoles ?? (_inheritedRoles = new InputList<Inputs.CustomDbRoleInheritedRoleArgs>());
            set => _inheritedRoles = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the custom role.
        /// 
        /// &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
        /// 
        /// * Is a name already used by an existing custom role in the project
        /// * Is a name of any of the built-in roles
        /// * Is `atlasAdmin`
        /// * Starts with `xgen-`
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        public CustomDbRoleArgs()
        {
        }
        public static new CustomDbRoleArgs Empty => new CustomDbRoleArgs();
    }

    public sealed class CustomDbRoleState : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.CustomDbRoleActionGetArgs>? _actions;
        public InputList<Inputs.CustomDbRoleActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.CustomDbRoleActionGetArgs>());
            set => _actions = value;
        }

        [Input("inheritedRoles")]
        private InputList<Inputs.CustomDbRoleInheritedRoleGetArgs>? _inheritedRoles;
        public InputList<Inputs.CustomDbRoleInheritedRoleGetArgs> InheritedRoles
        {
            get => _inheritedRoles ?? (_inheritedRoles = new InputList<Inputs.CustomDbRoleInheritedRoleGetArgs>());
            set => _inheritedRoles = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Name of the custom role.
        /// 
        /// &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
        /// 
        /// * Is a name already used by an existing custom role in the project
        /// * Is a name of any of the built-in roles
        /// * Is `atlasAdmin`
        /// * Starts with `xgen-`
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        public CustomDbRoleState()
        {
        }
        public static new CustomDbRoleState Empty => new CustomDbRoleState();
    }
}
