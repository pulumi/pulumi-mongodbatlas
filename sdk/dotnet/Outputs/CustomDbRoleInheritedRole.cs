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
    public sealed class CustomDbRoleInheritedRole
    {
        /// <summary>
        /// Database on which the inherited role is granted.
        /// 
        /// &gt; **NOTE** This value should be admin for all roles except read and readWrite.
        /// </summary>
        public readonly string DatabaseName;
        /// <summary>
        /// Name of the inherited role. This can either be another custom role or a built-in role.
        /// </summary>
        public readonly string RoleName;

        [OutputConstructor]
        private CustomDbRoleInheritedRole(
            string databaseName,

            string roleName)
        {
            DatabaseName = databaseName;
            RoleName = roleName;
        }
    }
}
