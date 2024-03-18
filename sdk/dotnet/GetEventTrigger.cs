// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetEventTrigger
    {
        /// <summary>
        /// `mongodbatlas.EventTrigger` describe an Event Trigger. 
        /// </summary>
        public static Task<GetEventTriggerResult> InvokeAsync(GetEventTriggerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventTriggerResult>("mongodbatlas:index/getEventTrigger:getEventTrigger", args ?? new GetEventTriggerArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.EventTrigger` describe an Event Trigger. 
        /// </summary>
        public static Output<GetEventTriggerResult> Invoke(GetEventTriggerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventTriggerResult>("mongodbatlas:index/getEventTrigger:getEventTrigger", args ?? new GetEventTriggerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventTriggerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Input("appId", required: true)]
        public string AppId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the trigger.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// The unique ID of the trigger.
        /// </summary>
        [Input("triggerId", required: true)]
        public string TriggerId { get; set; } = null!;

        public GetEventTriggerArgs()
        {
        }
        public static new GetEventTriggerArgs Empty => new GetEventTriggerArgs();
    }

    public sealed class GetEventTriggerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the trigger.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The unique ID of the trigger.
        /// </summary>
        [Input("triggerId", required: true)]
        public Input<string> TriggerId { get; set; } = null!;

        public GetEventTriggerInvokeArgs()
        {
        }
        public static new GetEventTriggerInvokeArgs Empty => new GetEventTriggerInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventTriggerResult
    {
        public readonly string AppId;
        /// <summary>
        /// The name of the MongoDB collection that the trigger watches for change events.
        /// </summary>
        public readonly string ConfigCollection;
        /// <summary>
        /// The name of the MongoDB database to watch.
        /// </summary>
        public readonly string ConfigDatabase;
        /// <summary>
        /// If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
        /// </summary>
        public readonly bool ConfigFullDocument;
        public readonly bool ConfigFullDocumentBefore;
        /// <summary>
        /// A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger.
        /// </summary>
        public readonly string ConfigMatch;
        /// <summary>
        /// The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for.
        /// </summary>
        public readonly string ConfigOperationType;
        /// <summary>
        /// The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for.
        /// </summary>
        public readonly ImmutableArray<string> ConfigOperationTypes;
        /// <summary>
        /// A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
        /// </summary>
        public readonly string ConfigProject;
        /// <summary>
        /// A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
        /// </summary>
        public readonly ImmutableArray<string> ConfigProviders;
        /// <summary>
        /// A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
        /// </summary>
        public readonly string ConfigSchedule;
        public readonly string ConfigScheduleType;
        /// <summary>
        /// The ID of the MongoDB Service associated with the trigger.
        /// </summary>
        public readonly string ConfigServiceId;
        /// <summary>
        /// Status of a trigger.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor.
        /// * `event_processors.0.aws_eventbridge.config_account_id` - AWS Account ID.
        /// * `event_processors.0.aws_eventbridge.config_region` - Region of AWS Account.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventTriggerEventProcessorResult> EventProcessors;
        /// <summary>
        /// The ID of the function associated with the trigger.
        /// </summary>
        public readonly string FunctionId;
        /// <summary>
        /// The name of the function associated with the trigger.
        /// </summary>
        public readonly string FunctionName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the trigger.
        /// </summary>
        public readonly string Name;
        public readonly string ProjectId;
        public readonly string TriggerId;
        /// <summary>
        /// The type of the trigger.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
        /// </summary>
        public readonly bool Unordered;

        [OutputConstructor]
        private GetEventTriggerResult(
            string appId,

            string configCollection,

            string configDatabase,

            bool configFullDocument,

            bool configFullDocumentBefore,

            string configMatch,

            string configOperationType,

            ImmutableArray<string> configOperationTypes,

            string configProject,

            ImmutableArray<string> configProviders,

            string configSchedule,

            string configScheduleType,

            string configServiceId,

            bool disabled,

            ImmutableArray<Outputs.GetEventTriggerEventProcessorResult> eventProcessors,

            string functionId,

            string functionName,

            string id,

            string name,

            string projectId,

            string triggerId,

            string type,

            bool unordered)
        {
            AppId = appId;
            ConfigCollection = configCollection;
            ConfigDatabase = configDatabase;
            ConfigFullDocument = configFullDocument;
            ConfigFullDocumentBefore = configFullDocumentBefore;
            ConfigMatch = configMatch;
            ConfigOperationType = configOperationType;
            ConfigOperationTypes = configOperationTypes;
            ConfigProject = configProject;
            ConfigProviders = configProviders;
            ConfigSchedule = configSchedule;
            ConfigScheduleType = configScheduleType;
            ConfigServiceId = configServiceId;
            Disabled = disabled;
            EventProcessors = eventProcessors;
            FunctionId = functionId;
            FunctionName = functionName;
            Id = id;
            Name = name;
            ProjectId = projectId;
            TriggerId = triggerId;
            Type = type;
            Unordered = unordered;
        }
    }
}
