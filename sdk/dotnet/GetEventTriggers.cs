// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetEventTriggers
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getEventTriggers
        /// 
        /// `mongodbatlas.getEventTriggers` describes all Event Triggers.
        /// </summary>
        public static Task<GetEventTriggersResult> InvokeAsync(GetEventTriggersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventTriggersResult>("mongodbatlas:index/getEventTriggers:getEventTriggers", args ?? new GetEventTriggersArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getEventTriggers
        /// 
        /// `mongodbatlas.getEventTriggers` describes all Event Triggers.
        /// </summary>
        public static Output<GetEventTriggersResult> Invoke(GetEventTriggersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventTriggersResult>("mongodbatlas:index/getEventTriggers:getEventTriggers", args ?? new GetEventTriggersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getEventTriggers
        /// 
        /// `mongodbatlas.getEventTriggers` describes all Event Triggers.
        /// </summary>
        public static Output<GetEventTriggersResult> Invoke(GetEventTriggersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventTriggersResult>("mongodbatlas:index/getEventTriggers:getEventTriggers", args ?? new GetEventTriggersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventTriggersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Input("appId", required: true)]
        public string AppId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to get all event triggers.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetEventTriggersArgs()
        {
        }
        public static new GetEventTriggersArgs Empty => new GetEventTriggersArgs();
    }

    public sealed class GetEventTriggersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to get all event triggers.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetEventTriggersInvokeArgs()
        {
        }
        public static new GetEventTriggersInvokeArgs Empty => new GetEventTriggersInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventTriggersResult
    {
        public readonly string AppId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Event Trigger.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventTriggersResultResult> Results;

        [OutputConstructor]
        private GetEventTriggersResult(
            string appId,

            string id,

            string projectId,

            ImmutableArray<Outputs.GetEventTriggersResultResult> results)
        {
            AppId = appId;
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
