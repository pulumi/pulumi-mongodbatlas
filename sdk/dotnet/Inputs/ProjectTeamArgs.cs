// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ProjectTeamArgs : Pulumi.ResourceArgs
    {
        [Input("roleNames", required: true)]
        private InputList<string>? _roleNames;

        /// <summary>
        /// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key.
        /// The following are valid roles:
        /// * `GROUP_OWNER`
        /// * `GROUP_READ_ONLY`
        /// * `GROUP_DATA_ACCESS_ADMIN`
        /// * `GROUP_DATA_ACCESS_READ_WRITE`
        /// * `GROUP_DATA_ACCESS_READ_ONLY`
        /// * `GROUP_CLUSTER_MANAGER`
        /// </summary>
        public InputList<string> RoleNames
        {
            get => _roleNames ?? (_roleNames = new InputList<string>());
            set => _roleNames = value;
        }

        /// <summary>
        /// The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        public ProjectTeamArgs()
        {
        }
    }
}
