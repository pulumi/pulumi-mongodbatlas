// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CustomDbRoleInheritedRoleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database on which the inherited role is granted.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// Name of the inherited role. This can either be another custom role or a built-in role.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        public CustomDbRoleInheritedRoleGetArgs()
        {
        }
        public static new CustomDbRoleInheritedRoleGetArgs Empty => new CustomDbRoleInheritedRoleGetArgs();
    }
}
