// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.EventTriggerArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.EventTriggerState;
import com.pulumi.mongodbatlas.outputs.EventTriggerEventProcessors;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.EventTrigger
 * 
 * `mongodbatlas.EventTrigger` provides a Event Trigger resource.
 * 
 * Note: If the `app_id` changes in the mongodbatlas.EventTrigger resource, it will force a replacement and delete itself from the old Atlas App Services app if it still exists then create itself in the new  Atlas App Services app. See [Atlas Triggers](https://www.mongodb.com/docs/atlas/app-services/triggers/) to learn more.
 * 
 * ## Example Usage
 * 
 * ### S
 * 
 * ### Example Usage: Database Trigger with Function
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.EventTrigger;
 * import com.pulumi.mongodbatlas.EventTriggerArgs;
 * import com.pulumi.mongodbatlas.inputs.EventTriggerEventProcessorsArgs;
 * import com.pulumi.mongodbatlas.inputs.EventTriggerEventProcessorsAwsEventbridgeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new EventTrigger("test", EventTriggerArgs.builder()
 *             .projectId("PROJECT ID")
 *             .appId("APPLICATION ID")
 *             .name("NAME OF THE TRIGGER")
 *             .type("DATABASE")
 *             .functionId("FUNCTION ID")
 *             .disabled(false)
 *             .configOperationTypes(            
 *                 "INSERT",
 *                 "UPDATE")
 *             .configDatabase("DATABASE NAME")
 *             .configCollection("COLLECTION NAME")
 *             .configServiceId("SERVICE ID")
 *             .configMatch("""
 * {  \"updateDescription.updatedFields\": {    \"status\": \"blocked\"  }}
 *             """)
 *             .configProject("{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}")
 *             .configFullDocument(false)
 *             .configFullDocumentBefore(false)
 *             .eventProcessors(EventTriggerEventProcessorsArgs.builder()
 *                 .awsEventbridge(EventTriggerEventProcessorsAwsEventbridgeArgs.builder()
 *                     .configAccountId("AWS ACCOUNT ID")
 *                     .configRegion("AWS REGIOn")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Usage: Database Trigger with EventBridge
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.EventTrigger;
 * import com.pulumi.mongodbatlas.EventTriggerArgs;
 * import com.pulumi.mongodbatlas.inputs.EventTriggerEventProcessorsArgs;
 * import com.pulumi.mongodbatlas.inputs.EventTriggerEventProcessorsAwsEventbridgeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new EventTrigger("test", EventTriggerArgs.builder()
 *             .projectId("PROJECT ID")
 *             .appId("APPLICATION ID")
 *             .name("NAME OF THE TRIGGER")
 *             .type("DATABASE")
 *             .disabled(false)
 *             .unordered(false)
 *             .configOperationTypes(            
 *                 "INSERT",
 *                 "UPDATE")
 *             .configOperationType("LOGIN")
 *             .configProviders("anon-user")
 *             .configDatabase("DATABASE NAME")
 *             .configCollection("COLLECTION NAME")
 *             .configServiceId("1")
 *             .configMatch("{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}")
 *             .configProject("{\"updateDescription.updatedFields\":{\"status\":\"blocked\"}}")
 *             .configFullDocument(false)
 *             .configFullDocumentBefore(false)
 *             .configSchedule("*")
 *             .eventProcessors(EventTriggerEventProcessorsArgs.builder()
 *                 .awsEventbridge(EventTriggerEventProcessorsAwsEventbridgeArgs.builder()
 *                     .configAccountId("AWS ACCOUNT ID")
 *                     .configRegion("AWS REGIOn")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Usage: Authentication Trigger
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.EventTrigger;
 * import com.pulumi.mongodbatlas.EventTriggerArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new EventTrigger("test", EventTriggerArgs.builder()
 *             .projectId("PROJECT ID")
 *             .appId("APPLICATION ID")
 *             .name("NAME OF THE TRIGGER")
 *             .type("AUTHENTICATION")
 *             .functionId("1")
 *             .disabled(false)
 *             .configOperationType("LOGIN")
 *             .configProviders("anon-user")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Usage: Scheduled Trigger
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.EventTrigger;
 * import com.pulumi.mongodbatlas.EventTriggerArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new EventTrigger("test", EventTriggerArgs.builder()
 *             .projectId("PROJECT ID")
 *             .appId("APPLICATION ID")
 *             .name("NAME OF THE TRIGGER")
 *             .type("SCHEDULED")
 *             .functionId("1")
 *             .disabled(false)
 *             .configSchedule("*")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Event trigger can be imported using project ID, App ID and Trigger ID, in the format `project_id`--`app_id`-`trigger_id`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/eventTrigger:EventTrigger test 1112222b3bf99403840e8934--testing-example--1112222b3bf99403840e8934
 * ```
 * For more details on this resource see [Triggers resource](https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#tag/triggers) in Atlas App Services Documentation.
 * 
 */
@ResourceType(type="mongodbatlas:index/eventTrigger:EventTrigger")
public class EventTrigger extends com.pulumi.resources.CustomResource {
    /**
     * The ObjectID of your application.
     * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The ObjectID of your application.
     * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
     * 
     */
    @Export(name="configCollection", refs={String.class}, tree="[0]")
    private Output<String> configCollection;

    /**
     * @return Optional for `DATABASE` type. The name of the MongoDB collection that the trigger watches for change events. The collection must be part of the specified database.
     * 
     */
    public Output<String> configCollection() {
        return this.configCollection;
    }
    /**
     * Required for `DATABASE` type. The name of the MongoDB database to watch.
     * 
     */
    @Export(name="configDatabase", refs={String.class}, tree="[0]")
    private Output<String> configDatabase;

    /**
     * @return Required for `DATABASE` type. The name of the MongoDB database to watch.
     * 
     */
    public Output<String> configDatabase() {
        return this.configDatabase;
    }
    /**
     * Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
     * 
     */
    @Export(name="configFullDocument", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> configFullDocument;

    /**
     * @return Optional for `DATABASE` type. If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
     * 
     */
    public Output<Boolean> configFullDocument() {
        return this.configFullDocument;
    }
    @Export(name="configFullDocumentBefore", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> configFullDocumentBefore;

    public Output<Boolean> configFullDocumentBefore() {
        return this.configFullDocumentBefore;
    }
    /**
     * Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
     * 
     */
    @Export(name="configMatch", refs={String.class}, tree="[0]")
    private Output<String> configMatch;

    /**
     * @return Optional for `DATABASE` type. A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger. This is useful when you want to filter change events beyond their operation type. The trigger will only fire if the expression evaluates to true for a given change event.
     * 
     */
    public Output<String> configMatch() {
        return this.configMatch;
    }
    /**
     * Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
     * 
     */
    @Export(name="configOperationType", refs={String.class}, tree="[0]")
    private Output<String> configOperationType;

    /**
     * @return Required for `AUTHENTICATION` type. The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for. Possible Values: `LOGIN`, `CREATE`, `DELETE`
     * 
     */
    public Output<String> configOperationType() {
        return this.configOperationType;
    }
    /**
     * Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
     * 
     */
    @Export(name="configOperationTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> configOperationTypes;

    /**
     * @return Required for `DATABASE` type. The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for. This must contain at least one value. Possible Values: `INSERT`, `UPDATE`, `REPLACE`, `DELETE`
     * 
     */
    public Output<List<String>> configOperationTypes() {
        return this.configOperationTypes;
    }
    /**
     * Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
     * 
     */
    @Export(name="configProject", refs={String.class}, tree="[0]")
    private Output<String> configProject;

    /**
     * @return Optional for `DATABASE` type. A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
     * 
     */
    public Output<String> configProject() {
        return this.configProject;
    }
    /**
     * Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
     * 
     */
    @Export(name="configProviders", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> configProviders;

    /**
     * @return Required for `AUTHENTICATION` type. A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
     * 
     */
    public Output<List<String>> configProviders() {
        return this.configProviders;
    }
    /**
     * Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
     * 
     */
    @Export(name="configSchedule", refs={String.class}, tree="[0]")
    private Output<String> configSchedule;

    /**
     * @return Required for `SCHEDULED` type. A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
     * 
     */
    public Output<String> configSchedule() {
        return this.configSchedule;
    }
    @Export(name="configScheduleType", refs={String.class}, tree="[0]")
    private Output<String> configScheduleType;

    public Output<String> configScheduleType() {
        return this.configScheduleType;
    }
    /**
     * Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
     * 
     */
    @Export(name="configServiceId", refs={String.class}, tree="[0]")
    private Output<String> configServiceId;

    /**
     * @return Required for `DATABASE` type. The ID of the MongoDB Service associated with the trigger.
     * 
     */
    public Output<String> configServiceId() {
        return this.configServiceId;
    }
    /**
     * Default: `false` If `true`, the trigger is disabled.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disabled;

    /**
     * @return Default: `false` If `true`, the trigger is disabled.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
     * * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
     * * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
     * 
     */
    @Export(name="eventProcessors", refs={EventTriggerEventProcessors.class}, tree="[0]")
    private Output</* @Nullable */ EventTriggerEventProcessors> eventProcessors;

    /**
     * @return An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor. The following event processors are supported: `AWS_EVENTBRIDGE` For an example configuration object, see [Send Trigger Events to AWS EventBridge](https://docs.mongodb.com/realm/triggers/eventbridge/#std-label-event_processor_example).
     * * `event_processors.0.aws_eventbridge.config_account_id` - (Optional) AWS Account ID.
     * * `event_processors.0.aws_eventbridge.config_region` - (Optional) Region of AWS Account.
     * 
     */
    public Output<Optional<EventTriggerEventProcessors>> eventProcessors() {
        return Codegen.optional(this.eventProcessors);
    }
    /**
     * The ID of the function associated with the trigger.
     * 
     */
    @Export(name="functionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> functionId;

    /**
     * @return The ID of the function associated with the trigger.
     * 
     */
    public Output<Optional<String>> functionId() {
        return Codegen.optional(this.functionId);
    }
    /**
     * The name of the function associated with the trigger.
     * 
     */
    @Export(name="functionName", refs={String.class}, tree="[0]")
    private Output<String> functionName;

    /**
     * @return The name of the function associated with the trigger.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }
    /**
     * The name of the trigger.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the trigger.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique ID for the project to create the trigger.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the trigger.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The unique ID of the trigger.
     * 
     */
    @Export(name="triggerId", refs={String.class}, tree="[0]")
    private Output<String> triggerId;

    /**
     * @return The unique ID of the trigger.
     * 
     */
    public Output<String> triggerId() {
        return this.triggerId;
    }
    /**
     * The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the trigger. Possible Values: `DATABASE`, `AUTHENTICATION`,`SCHEDULED`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
     * 
     */
    @Export(name="unordered", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> unordered;

    /**
     * @return Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
     * 
     */
    public Output<Boolean> unordered() {
        return this.unordered;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventTrigger(java.lang.String name) {
        this(name, EventTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventTrigger(java.lang.String name, EventTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventTrigger(java.lang.String name, EventTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/eventTrigger:EventTrigger", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EventTrigger(java.lang.String name, Output<java.lang.String> id, @Nullable EventTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/eventTrigger:EventTrigger", name, state, makeResourceOptions(options, id), false);
    }

    private static EventTriggerArgs makeArgs(EventTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EventTriggerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventTrigger get(java.lang.String name, Output<java.lang.String> id, @Nullable EventTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventTrigger(name, id, state, options);
    }
}
