// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCustomDbRoles
    {
        /// <summary>
        /// `mongodbatlas..getCustomDbRoles` describe all Custom DB Roles. This represents a custom db roles.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCustomDbRolesResult> InvokeAsync(GetCustomDbRolesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCustomDbRolesResult>("mongodbatlas:index/getCustomDbRoles:getCustomDbRoles", args ?? new GetCustomDbRolesArgs(), options.WithVersion());
    }


    public sealed class GetCustomDbRolesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all custom db roles.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCustomDbRolesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCustomDbRolesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a custom db roles.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomDbRolesResultResult> Results;

        [OutputConstructor]
        private GetCustomDbRolesResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetCustomDbRolesResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
