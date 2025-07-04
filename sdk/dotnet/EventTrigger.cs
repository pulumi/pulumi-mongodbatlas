// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// ## # Resource: mongodbatlas.EventTrigger
    /// 
    /// `mongodbatlas.EventTrigger` provides a Event Trigger resource.
    /// 
    /// Note: If the `app_id` changes in the mongodbatlas.EventTrigger resource, it will force a replacement and delete itself from the old Atlas App Services app if it still exists then create itself in the new  Atlas App Services app. See [Atlas Triggers](https://www.mongodb.com/docs/atlas/app-services/triggers/) to learn more.
    /// 
    /// ## Example Usage
    /// 
    /// ### S
    /// 
    /// ### Example Usage: Database Trigger with Function
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.EventTrigger("test", new()
    ///     {
    ///         ProjectId = "PROJECT ID",
    ///         AppId = "APPLICATION ID",
    ///         Name = "NAME OF THE TRIGGER",
    ///         Type = "DATABASE",
    ///         FunctionId = "FUNCTION ID",
    ///         Disabled = false,
    ///         ConfigOperationTypes = new[]
    ///         {
    ///             "INSERT",
    ///             "UPDATE",
    ///         },
    ///         ConfigDatabase = "DATABASE NAME",
    ///         ConfigCollection = "COLLECTION NAME",
    ///         ConfigServiceId = "SERVICE ID",
    ///         ConfigMatch = @"{
    ///   ""updateDescription.updatedFields"": {
    ///     ""status"": ""blocked""
    ///   }
    /// }
    /// ",
    ///         ConfigProject = "{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}",
    ///         ConfigFullDocument = false,
    ///         ConfigFullDocumentBefore = false,
    ///         EventProcessors = new Mongodbatlas.Inputs.EventTriggerEventProcessorsArgs
    ///         {
    ///             AwsEventbridge = new Mongodbatlas.Inputs.EventTriggerEventProcessorsAwsEventbridgeArgs
    ///             {
    ///                 ConfigAccountId = "AWS ACCOUNT ID",
    ///                 ConfigRegion = "AWS REGIOn",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Usage: Database Trigger with EventBridge
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.EventTrigger("test", new()
    ///     {
    ///         ProjectId = "PROJECT ID",
    ///         AppId = "APPLICATION ID",
    ///         Name = "NAME OF THE TRIGGER",
    ///         Type = "DATABASE",
    ///         Disabled = false,
    ///         Unordered = false,
    ///         ConfigOperationTypes = new[]
    ///         {
    ///             "INSERT",
    ///             "UPDATE",
    ///         },
    ///         ConfigOperationType = "LOGIN",
    ///         ConfigProviders = new[]
    ///         {
    ///             "anon-user",
    ///         },
    ///         ConfigDatabase = "DATABASE NAME",
    ///         ConfigCollection = "COLLECTION NAME",
    ///         ConfigServiceId = "1",
    ///         ConfigMatch = "{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}",
    ///         ConfigProject = "{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}",
    ///         ConfigFullDocument = false,
    ///         ConfigFullDocumentBefore = false,
    ///         ConfigSchedule = "*",
    ///         EventProcessors = new Mongodbatlas.Inputs.EventTriggerEventProcessorsArgs
    ///         {
    ///             AwsEventbridge = new Mongodbatlas.Inputs.EventTriggerEventProcessorsAwsEventbridgeArgs
    ///             {
    ///                 ConfigAccountId = "AWS ACCOUNT ID",
    ///                 ConfigRegion = "AWS REGIOn",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Usage: Authentication Trigger
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.EventTrigger("test", new()
    ///     {
    ///         ProjectId = "PROJECT ID",
    ///         AppId = "APPLICATION ID",
    ///         Name = "NAME OF THE TRIGGER",
    ///         Type = "AUTHENTICATION",
    ///         FunctionId = "1",
    ///         Disabled = false,
    ///         ConfigOperationType = "LOGIN",
    ///         ConfigProviders = new[]
    ///         {
    ///             "anon-user",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Usage: Scheduled Trigger
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.EventTrigger("test", new()
    ///     {
    ///         ProjectId = "PROJECT ID",
    ///         AppId = "APPLICATION ID",
    ///         Name = "NAME OF THE TRIGGER",
    ///         Type = "SCHEDULED",
    ///         FunctionId = "1",
    ///         Disabled = false,
    ///         ConfigSchedule = "*",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Event trigger can be imported using project ID, App ID and Trigger ID, in the format `project_id`--`app_id`-`trigger_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/eventTrigger:EventTrigger test 1112222b3bf99403840e8934--testing-example--1112222b3bf99403840e8934
    /// ```
    /// For more details on this resource see [Triggers resource](https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#tag/triggers) in Atlas App Services Documentation.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/eventTrigger:EventTrigger")]
    public partial class EventTrigger : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
        /// </summary>
        [Output("configCollection")]
        public Output<string> ConfigCollection { get; private set; } = null!;

        /// <summary>
        /// Required for `DATABASE` type. The name of the MongoDB database to watch.
        /// </summary>
        [Output("configDatabase")]
        public Output<string> ConfigDatabase { get; private set; } = null!;

        /// <summary>
        /// Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
        /// </summary>
        [Output("configFullDocument")]
        public Output<bool> ConfigFullDocument { get; private set; } = null!;

        [Output("configFullDocumentBefore")]
        public Output<bool> ConfigFullDocumentBefore { get; private set; } = null!;

        /// <summary>
        /// Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
        /// </summary>
        [Output("configMatch")]
        public Output<string> ConfigMatch { get; private set; } = null!;

        /// <summary>
        /// Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
        /// </summary>
        [Output("configOperationType")]
        public Output<string> ConfigOperationType { get; private set; } = null!;

        /// <summary>
        /// Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
        /// </summary>
        [Output("configOperationTypes")]
        public Output<ImmutableArray<string>> ConfigOperationTypes { get; private set; } = null!;

        /// <summary>
        /// Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
        /// </summary>
        [Output("configProject")]
        public Output<string> ConfigProject { get; private set; } = null!;

        /// <summary>
        /// Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
        /// </summary>
        [Output("configProviders")]
        public Output<ImmutableArray<string>> ConfigProviders { get; private set; } = null!;

        /// <summary>
        /// Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
        /// </summary>
        [Output("configSchedule")]
        public Output<string> ConfigSchedule { get; private set; } = null!;

        [Output("configScheduleType")]
        public Output<string> ConfigScheduleType { get; private set; } = null!;

        /// <summary>
        /// Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
        /// </summary>
        [Output("configServiceId")]
        public Output<string> ConfigServiceId { get; private set; } = null!;

        /// <summary>
        /// Default: `false` If `true`, the trigger is disabled.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
        /// * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
        /// * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
        /// </summary>
        [Output("eventProcessors")]
        public Output<Outputs.EventTriggerEventProcessors?> EventProcessors { get; private set; } = null!;

        /// <summary>
        /// The ID of the function associated with the trigger.
        /// </summary>
        [Output("functionId")]
        public Output<string?> FunctionId { get; private set; } = null!;

        /// <summary>
        /// The name of the function associated with the trigger.
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// The name of the trigger.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create the trigger.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the trigger.
        /// </summary>
        [Output("triggerId")]
        public Output<string> TriggerId { get; private set; } = null!;

        /// <summary>
        /// The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
        /// </summary>
        [Output("unordered")]
        public Output<bool> Unordered { get; private set; } = null!;


        /// <summary>
        /// Create a EventTrigger resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventTrigger(string name, EventTriggerArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/eventTrigger:EventTrigger", name, args ?? new EventTriggerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventTrigger(string name, Input<string> id, EventTriggerState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/eventTrigger:EventTrigger", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EventTrigger resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventTrigger Get(string name, Input<string> id, EventTriggerState? state = null, CustomResourceOptions? options = null)
        {
            return new EventTrigger(name, id, state, options);
        }
    }

    public sealed class EventTriggerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
        /// </summary>
        [Input("configCollection")]
        public Input<string>? ConfigCollection { get; set; }

        /// <summary>
        /// Required for `DATABASE` type. The name of the MongoDB database to watch.
        /// </summary>
        [Input("configDatabase")]
        public Input<string>? ConfigDatabase { get; set; }

        /// <summary>
        /// Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
        /// </summary>
        [Input("configFullDocument")]
        public Input<bool>? ConfigFullDocument { get; set; }

        [Input("configFullDocumentBefore")]
        public Input<bool>? ConfigFullDocumentBefore { get; set; }

        /// <summary>
        /// Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
        /// </summary>
        [Input("configMatch")]
        public Input<string>? ConfigMatch { get; set; }

        /// <summary>
        /// Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
        /// </summary>
        [Input("configOperationType")]
        public Input<string>? ConfigOperationType { get; set; }

        [Input("configOperationTypes")]
        private InputList<string>? _configOperationTypes;

        /// <summary>
        /// Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
        /// </summary>
        public InputList<string> ConfigOperationTypes
        {
            get => _configOperationTypes ?? (_configOperationTypes = new InputList<string>());
            set => _configOperationTypes = value;
        }

        /// <summary>
        /// Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
        /// </summary>
        [Input("configProject")]
        public Input<string>? ConfigProject { get; set; }

        [Input("configProviders")]
        private InputList<string>? _configProviders;

        /// <summary>
        /// Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
        /// </summary>
        public InputList<string> ConfigProviders
        {
            get => _configProviders ?? (_configProviders = new InputList<string>());
            set => _configProviders = value;
        }

        /// <summary>
        /// Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
        /// </summary>
        [Input("configSchedule")]
        public Input<string>? ConfigSchedule { get; set; }

        /// <summary>
        /// Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
        /// </summary>
        [Input("configServiceId")]
        public Input<string>? ConfigServiceId { get; set; }

        /// <summary>
        /// Default: `false` If `true`, the trigger is disabled.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
        /// * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
        /// * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
        /// </summary>
        [Input("eventProcessors")]
        public Input<Inputs.EventTriggerEventProcessorsArgs>? EventProcessors { get; set; }

        /// <summary>
        /// The ID of the function associated with the trigger.
        /// </summary>
        [Input("functionId")]
        public Input<string>? FunctionId { get; set; }

        /// <summary>
        /// The name of the trigger.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create the trigger.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
        /// </summary>
        [Input("unordered")]
        public Input<bool>? Unordered { get; set; }

        public EventTriggerArgs()
        {
        }
        public static new EventTriggerArgs Empty => new EventTriggerArgs();
    }

    public sealed class EventTriggerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ObjectID of your application.
        /// * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
        /// </summary>
        [Input("configCollection")]
        public Input<string>? ConfigCollection { get; set; }

        /// <summary>
        /// Required for `DATABASE` type. The name of the MongoDB database to watch.
        /// </summary>
        [Input("configDatabase")]
        public Input<string>? ConfigDatabase { get; set; }

        /// <summary>
        /// Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
        /// </summary>
        [Input("configFullDocument")]
        public Input<bool>? ConfigFullDocument { get; set; }

        [Input("configFullDocumentBefore")]
        public Input<bool>? ConfigFullDocumentBefore { get; set; }

        /// <summary>
        /// Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
        /// </summary>
        [Input("configMatch")]
        public Input<string>? ConfigMatch { get; set; }

        /// <summary>
        /// Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
        /// </summary>
        [Input("configOperationType")]
        public Input<string>? ConfigOperationType { get; set; }

        [Input("configOperationTypes")]
        private InputList<string>? _configOperationTypes;

        /// <summary>
        /// Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
        /// </summary>
        public InputList<string> ConfigOperationTypes
        {
            get => _configOperationTypes ?? (_configOperationTypes = new InputList<string>());
            set => _configOperationTypes = value;
        }

        /// <summary>
        /// Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
        /// </summary>
        [Input("configProject")]
        public Input<string>? ConfigProject { get; set; }

        [Input("configProviders")]
        private InputList<string>? _configProviders;

        /// <summary>
        /// Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
        /// </summary>
        public InputList<string> ConfigProviders
        {
            get => _configProviders ?? (_configProviders = new InputList<string>());
            set => _configProviders = value;
        }

        /// <summary>
        /// Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
        /// </summary>
        [Input("configSchedule")]
        public Input<string>? ConfigSchedule { get; set; }

        [Input("configScheduleType")]
        public Input<string>? ConfigScheduleType { get; set; }

        /// <summary>
        /// Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
        /// </summary>
        [Input("configServiceId")]
        public Input<string>? ConfigServiceId { get; set; }

        /// <summary>
        /// Default: `false` If `true`, the trigger is disabled.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
        /// * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
        /// * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
        /// </summary>
        [Input("eventProcessors")]
        public Input<Inputs.EventTriggerEventProcessorsGetArgs>? EventProcessors { get; set; }

        /// <summary>
        /// The ID of the function associated with the trigger.
        /// </summary>
        [Input("functionId")]
        public Input<string>? FunctionId { get; set; }

        /// <summary>
        /// The name of the function associated with the trigger.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// The name of the trigger.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create the trigger.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The unique ID of the trigger.
        /// </summary>
        [Input("triggerId")]
        public Input<string>? TriggerId { get; set; }

        /// <summary>
        /// The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
        /// </summary>
        [Input("unordered")]
        public Input<bool>? Unordered { get; set; }

        public EventTriggerState()
        {
        }
        public static new EventTriggerState Empty => new EventTriggerState();
    }
}
