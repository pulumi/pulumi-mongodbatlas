// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ProjectApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier of the Programmatic API key you want to associate with the Project.  The Programmatic API key and Project must share the same parent organization.  Note: this is not the `publicKey` of the Programmatic API key but the `id` of the key. See [Programmatic API Keys](https://docs.atlas.mongodb.com/reference/api/apiKeys/) for more.
        /// 
        /// **WARNING:** The `api_keys` parameter is deprecated and will be removed in v1.12.0 release from codebase. Use `mongodbatlas.ProjectApiKey`  resource instead.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public Input<string> ApiKeyId { get; set; } = null!;

        [Input("roleNames", required: true)]
        private InputList<string>? _roleNames;

        /// <summary>
        /// Each string in the array represents a project role you want to assign to the team. Every user associated with the team inherits these roles. You must specify an array even if you are only associating a single role with the team. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        /// 
        /// &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
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
}
