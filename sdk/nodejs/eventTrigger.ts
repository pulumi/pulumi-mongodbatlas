// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.EventTrigger` provides a Event Trigger resource.
 *
 * Note: If the `appId` changes in the mongodbatlas.EventTrigger resource, it will force a replacement and delete itself from the old Atlas App Services app if it still exists then create itself in the new  Atlas App Services app. See [Atlas Triggers](https://www.mongodb.com/docs/atlas/app-services/triggers/) to learn more.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ### Example Usage: Database Trigger with Function
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.EventTrigger("test", {
 *     projectId: "PROJECT ID",
 *     appId: "APPLICATION ID",
 *     name: "NAME OF THE TRIGGER",
 *     type: "DATABASE",
 *     functionId: "FUNCTION ID",
 *     disabled: false,
 *     configOperationTypes: [
 *         "INSERT",
 *         "UPDATE",
 *     ],
 *     configDatabase: "DATABASE NAME",
 *     configCollection: "COLLECTION NAME",
 *     configServiceId: "SERVICE ID",
 *     configMatch: `{
 *   "updateDescription.updatedFields": {
 *     "status": "blocked"
 *   }
 * }
 * `,
 *     configProject: "{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}",
 *     configFullDocument: false,
 *     configFullDocumentBefore: false,
 *     eventProcessors: {
 *         awsEventbridge: {
 *             configAccountId: "AWS ACCOUNT ID",
 *             configRegion: "AWS REGIOn",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Usage: Database Trigger with EventBridge
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.EventTrigger("test", {
 *     projectId: "PROJECT ID",
 *     appId: "APPLICATION ID",
 *     name: "NAME OF THE TRIGGER",
 *     type: "DATABASE",
 *     disabled: false,
 *     unordered: false,
 *     configOperationTypes: [
 *         "INSERT",
 *         "UPDATE",
 *     ],
 *     configOperationType: "LOGIN",
 *     configProviders: ["anon-user"],
 *     configDatabase: "DATABASE NAME",
 *     configCollection: "COLLECTION NAME",
 *     configServiceId: "1",
 *     configMatch: "{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}",
 *     configProject: "{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}",
 *     configFullDocument: false,
 *     configFullDocumentBefore: false,
 *     configSchedule: "*",
 *     eventProcessors: {
 *         awsEventbridge: {
 *             configAccountId: "AWS ACCOUNT ID",
 *             configRegion: "AWS REGIOn",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Usage: Authentication Trigger
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.EventTrigger("test", {
 *     projectId: "PROJECT ID",
 *     appId: "APPLICATION ID",
 *     name: "NAME OF THE TRIGGER",
 *     type: "AUTHENTICATION",
 *     functionId: "1",
 *     disabled: false,
 *     configOperationType: "LOGIN",
 *     configProviders: ["anon-user"],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Usage: Scheduled Trigger
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.EventTrigger("test", {
 *     projectId: "PROJECT ID",
 *     appId: "APPLICATION ID",
 *     name: "NAME OF THE TRIGGER",
 *     type: "SCHEDULED",
 *     functionId: "1",
 *     disabled: false,
 *     configSchedule: "*",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Event trigger can be imported using project ID, App ID and Trigger ID, in the format `project_id`--`app_id`-`trigger_id`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/eventTrigger:EventTrigger test 1112222b3bf99403840e8934--testing-example--1112222b3bf99403840e8934
 * ```
 * For more details on this resource see [Triggers resource](https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#tag/triggers) in Atlas App Services Documentation.
 */
export class EventTrigger extends pulumi.CustomResource {
    /**
     * Get an existing EventTrigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventTriggerState, opts?: pulumi.CustomResourceOptions): EventTrigger {
        return new EventTrigger(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/eventTrigger:EventTrigger';

    /**
     * Returns true if the given object is an instance of EventTrigger.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventTrigger {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventTrigger.__pulumiType;
    }

    /**
     * The ObjectID of your application.
     * * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
     */
    public readonly configCollection!: pulumi.Output<string>;
    /**
     * Required for `DATABASE` type. The name of the MongoDB database to watch.
     */
    public readonly configDatabase!: pulumi.Output<string>;
    /**
     * Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
     */
    public readonly configFullDocument!: pulumi.Output<boolean>;
    public readonly configFullDocumentBefore!: pulumi.Output<boolean>;
    /**
     * Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
     */
    public readonly configMatch!: pulumi.Output<string>;
    /**
     * Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
     */
    public readonly configOperationType!: pulumi.Output<string>;
    /**
     * Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
     */
    public readonly configOperationTypes!: pulumi.Output<string[]>;
    /**
     * Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
     */
    public readonly configProject!: pulumi.Output<string>;
    /**
     * Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
     */
    public readonly configProviders!: pulumi.Output<string[]>;
    /**
     * Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
     */
    public readonly configSchedule!: pulumi.Output<string>;
    public /*out*/ readonly configScheduleType!: pulumi.Output<string>;
    /**
     * Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
     */
    public readonly configServiceId!: pulumi.Output<string>;
    /**
     * Default: `false` If `true`, the trigger is disabled.
     */
    public readonly disabled!: pulumi.Output<boolean>;
    /**
     * An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
     * * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
     * * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
     */
    public readonly eventProcessors!: pulumi.Output<outputs.EventTriggerEventProcessors | undefined>;
    /**
     * The ID of the function associated with the trigger.
     */
    public readonly functionId!: pulumi.Output<string | undefined>;
    /**
     * The name of the function associated with the trigger.
     */
    public /*out*/ readonly functionName!: pulumi.Output<string>;
    /**
     * The name of the trigger.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The unique ID for the project to create the trigger.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The unique ID of the trigger.
     */
    public /*out*/ readonly triggerId!: pulumi.Output<string>;
    /**
     * The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
     */
    public readonly unordered!: pulumi.Output<boolean>;

    /**
     * Create a EventTrigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventTriggerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventTriggerArgs | EventTriggerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventTriggerState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["configCollection"] = state ? state.configCollection : undefined;
            resourceInputs["configDatabase"] = state ? state.configDatabase : undefined;
            resourceInputs["configFullDocument"] = state ? state.configFullDocument : undefined;
            resourceInputs["configFullDocumentBefore"] = state ? state.configFullDocumentBefore : undefined;
            resourceInputs["configMatch"] = state ? state.configMatch : undefined;
            resourceInputs["configOperationType"] = state ? state.configOperationType : undefined;
            resourceInputs["configOperationTypes"] = state ? state.configOperationTypes : undefined;
            resourceInputs["configProject"] = state ? state.configProject : undefined;
            resourceInputs["configProviders"] = state ? state.configProviders : undefined;
            resourceInputs["configSchedule"] = state ? state.configSchedule : undefined;
            resourceInputs["configScheduleType"] = state ? state.configScheduleType : undefined;
            resourceInputs["configServiceId"] = state ? state.configServiceId : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["eventProcessors"] = state ? state.eventProcessors : undefined;
            resourceInputs["functionId"] = state ? state.functionId : undefined;
            resourceInputs["functionName"] = state ? state.functionName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["triggerId"] = state ? state.triggerId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["unordered"] = state ? state.unordered : undefined;
        } else {
            const args = argsOrState as EventTriggerArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["configCollection"] = args ? args.configCollection : undefined;
            resourceInputs["configDatabase"] = args ? args.configDatabase : undefined;
            resourceInputs["configFullDocument"] = args ? args.configFullDocument : undefined;
            resourceInputs["configFullDocumentBefore"] = args ? args.configFullDocumentBefore : undefined;
            resourceInputs["configMatch"] = args ? args.configMatch : undefined;
            resourceInputs["configOperationType"] = args ? args.configOperationType : undefined;
            resourceInputs["configOperationTypes"] = args ? args.configOperationTypes : undefined;
            resourceInputs["configProject"] = args ? args.configProject : undefined;
            resourceInputs["configProviders"] = args ? args.configProviders : undefined;
            resourceInputs["configSchedule"] = args ? args.configSchedule : undefined;
            resourceInputs["configServiceId"] = args ? args.configServiceId : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["eventProcessors"] = args ? args.eventProcessors : undefined;
            resourceInputs["functionId"] = args ? args.functionId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["unordered"] = args ? args.unordered : undefined;
            resourceInputs["configScheduleType"] = undefined /*out*/;
            resourceInputs["functionName"] = undefined /*out*/;
            resourceInputs["triggerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventTrigger.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventTrigger resources.
 */
export interface EventTriggerState {
    /**
     * The ObjectID of your application.
     * * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     */
    appId?: pulumi.Input<string>;
    /**
     * Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
     */
    configCollection?: pulumi.Input<string>;
    /**
     * Required for `DATABASE` type. The name of the MongoDB database to watch.
     */
    configDatabase?: pulumi.Input<string>;
    /**
     * Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
     */
    configFullDocument?: pulumi.Input<boolean>;
    configFullDocumentBefore?: pulumi.Input<boolean>;
    /**
     * Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
     */
    configMatch?: pulumi.Input<string>;
    /**
     * Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
     */
    configOperationType?: pulumi.Input<string>;
    /**
     * Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
     */
    configOperationTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
     */
    configProject?: pulumi.Input<string>;
    /**
     * Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
     */
    configProviders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
     */
    configSchedule?: pulumi.Input<string>;
    configScheduleType?: pulumi.Input<string>;
    /**
     * Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
     */
    configServiceId?: pulumi.Input<string>;
    /**
     * Default: `false` If `true`, the trigger is disabled.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
     * * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
     * * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
     */
    eventProcessors?: pulumi.Input<inputs.EventTriggerEventProcessors>;
    /**
     * The ID of the function associated with the trigger.
     */
    functionId?: pulumi.Input<string>;
    /**
     * The name of the function associated with the trigger.
     */
    functionName?: pulumi.Input<string>;
    /**
     * The name of the trigger.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create the trigger.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The unique ID of the trigger.
     */
    triggerId?: pulumi.Input<string>;
    /**
     * The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
     */
    type?: pulumi.Input<string>;
    /**
     * Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
     */
    unordered?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a EventTrigger resource.
 */
export interface EventTriggerArgs {
    /**
     * The ObjectID of your application.
     * * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     */
    appId: pulumi.Input<string>;
    /**
     * Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
     */
    configCollection?: pulumi.Input<string>;
    /**
     * Required for `DATABASE` type. The name of the MongoDB database to watch.
     */
    configDatabase?: pulumi.Input<string>;
    /**
     * Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
     */
    configFullDocument?: pulumi.Input<boolean>;
    configFullDocumentBefore?: pulumi.Input<boolean>;
    /**
     * Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
     */
    configMatch?: pulumi.Input<string>;
    /**
     * Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
     */
    configOperationType?: pulumi.Input<string>;
    /**
     * Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
     */
    configOperationTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
     */
    configProject?: pulumi.Input<string>;
    /**
     * Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
     */
    configProviders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
     */
    configSchedule?: pulumi.Input<string>;
    /**
     * Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
     */
    configServiceId?: pulumi.Input<string>;
    /**
     * Default: `false` If `true`, the trigger is disabled.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
     * * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
     * * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
     */
    eventProcessors?: pulumi.Input<inputs.EventTriggerEventProcessors>;
    /**
     * The ID of the function associated with the trigger.
     */
    functionId?: pulumi.Input<string>;
    /**
     * The name of the trigger.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create the trigger.
     */
    projectId: pulumi.Input<string>;
    /**
     * The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
     */
    type: pulumi.Input<string>;
    /**
     * Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
     */
    unordered?: pulumi.Input<boolean>;
}
