// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCustomDbRole
    {
        /// <summary>
        /// `mongodbatlas.CustomDbRole` describe a Custom DB Role. This represents a custom db role.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testRole = new Mongodbatlas.CustomDbRole("test_role", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
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
        ///     var test = Mongodbatlas.GetCustomDbRole.Invoke(new()
        ///     {
        ///         ProjectId = testRole.ProjectId,
        ///         RoleName = testRole.RoleName,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetCustomDbRoleResult> InvokeAsync(GetCustomDbRoleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomDbRoleResult>("mongodbatlas:index/getCustomDbRole:getCustomDbRole", args ?? new GetCustomDbRoleArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.CustomDbRole` describe a Custom DB Role. This represents a custom db role.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testRole = new Mongodbatlas.CustomDbRole("test_role", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
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
        ///     var test = Mongodbatlas.GetCustomDbRole.Invoke(new()
        ///     {
        ///         ProjectId = testRole.ProjectId,
        ///         RoleName = testRole.RoleName,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetCustomDbRoleResult> Invoke(GetCustomDbRoleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomDbRoleResult>("mongodbatlas:index/getCustomDbRole:getCustomDbRole", args ?? new GetCustomDbRoleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomDbRoleArgs : global::Pulumi.InvokeArgs
    {
        [Input("inheritedRoles")]
        private List<Inputs.GetCustomDbRoleInheritedRoleArgs>? _inheritedRoles;
        public List<Inputs.GetCustomDbRoleInheritedRoleArgs> InheritedRoles
        {
            get => _inheritedRoles ?? (_inheritedRoles = new List<Inputs.GetCustomDbRoleInheritedRoleArgs>());
            set => _inheritedRoles = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the custom role.
        /// </summary>
        [Input("roleName", required: true)]
        public string RoleName { get; set; } = null!;

        public GetCustomDbRoleArgs()
        {
        }
        public static new GetCustomDbRoleArgs Empty => new GetCustomDbRoleArgs();
    }

    public sealed class GetCustomDbRoleInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("inheritedRoles")]
        private InputList<Inputs.GetCustomDbRoleInheritedRoleInputArgs>? _inheritedRoles;
        public InputList<Inputs.GetCustomDbRoleInheritedRoleInputArgs> InheritedRoles
        {
            get => _inheritedRoles ?? (_inheritedRoles = new InputList<Inputs.GetCustomDbRoleInheritedRoleInputArgs>());
            set => _inheritedRoles = value;
        }

        /// <summary>
        /// The unique ID for the project to create the database user.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the custom role.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        public GetCustomDbRoleInvokeArgs()
        {
        }
        public static new GetCustomDbRoleInvokeArgs Empty => new GetCustomDbRoleInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomDbRoleResult
    {
        public readonly ImmutableArray<Outputs.GetCustomDbRoleActionResult> Actions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetCustomDbRoleInheritedRoleResult> InheritedRoles;
        public readonly string ProjectId;
        /// <summary>
        /// (Required) Name of the inherited role. This can either be another custom role or a built-in role.
        /// </summary>
        public readonly string RoleName;

        [OutputConstructor]
        private GetCustomDbRoleResult(
            ImmutableArray<Outputs.GetCustomDbRoleActionResult> actions,

            string id,

            ImmutableArray<Outputs.GetCustomDbRoleInheritedRoleResult> inheritedRoles,

            string projectId,

            string roleName)
        {
            Actions = actions;
            Id = id;
            InheritedRoles = inheritedRoles;
            ProjectId = projectId;
            RoleName = roleName;
        }
    }
}
