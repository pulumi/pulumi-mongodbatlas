// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetTeams
    {
        public static Task<GetTeamsResult> InvokeAsync(GetTeamsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTeamsResult>("mongodbatlas:index/getTeams:getTeams", args ?? new GetTeamsArgs(), options.WithDefaults());

        public static Output<GetTeamsResult> Invoke(GetTeamsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTeamsResult>("mongodbatlas:index/getTeams:getTeams", args ?? new GetTeamsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTeamsArgs : Pulumi.InvokeArgs
    {
        [Input("name")]
        public string? Name { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        [Input("teamId")]
        public string? TeamId { get; set; }

        public GetTeamsArgs()
        {
        }
    }

    public sealed class GetTeamsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public GetTeamsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTeamsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string OrgId;
        public readonly string TeamId;
        public readonly ImmutableArray<string> Usernames;

        [OutputConstructor]
        private GetTeamsResult(
            string id,

            string name,

            string orgId,

            string teamId,

            ImmutableArray<string> usernames)
        {
            Id = id;
            Name = name;
            OrgId = orgId;
            TeamId = teamId;
            Usernames = usernames;
        }
    }
}
