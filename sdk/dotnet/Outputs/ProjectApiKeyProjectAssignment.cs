// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class ProjectApiKeyProjectAssignment
    {
        /// <summary>
        /// Project ID to assign to Access Key
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project. You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned.
        /// </summary>
        public readonly ImmutableArray<string> RoleNames;

        [OutputConstructor]
        private ProjectApiKeyProjectAssignment(
            string projectId,

            ImmutableArray<string> roleNames)
        {
            ProjectId = projectId;
            RoleNames = roleNames;
        }
    }
}
