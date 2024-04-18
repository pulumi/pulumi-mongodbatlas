// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.AlertConfigurationArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.AlertConfigurationState;
import com.pulumi.mongodbatlas.outputs.AlertConfigurationMatcher;
import com.pulumi.mongodbatlas.outputs.AlertConfigurationMetricThresholdConfig;
import com.pulumi.mongodbatlas.outputs.AlertConfigurationNotification;
import com.pulumi.mongodbatlas.outputs.AlertConfigurationThresholdConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.AlertConfiguration` provides an Alert Configuration resource to define the conditions that trigger an alert and the methods of notification within a MongoDB Atlas project.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.AlertConfiguration;
 * import com.pulumi.mongodbatlas.AlertConfigurationArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationNotificationArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationMatcherArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationMetricThresholdConfigArgs;
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
 *         var test = new AlertConfiguration(&#34;test&#34;, AlertConfigurationArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .eventType(&#34;OUTSIDE_METRIC_THRESHOLD&#34;)
 *             .enabled(true)
 *             .notifications(AlertConfigurationNotificationArgs.builder()
 *                 .typeName(&#34;GROUP&#34;)
 *                 .intervalMin(5)
 *                 .delayMin(0)
 *                 .smsEnabled(false)
 *                 .emailEnabled(true)
 *                 .roles(                
 *                     &#34;GROUP_CHARTS_ADMIN&#34;,
 *                     &#34;GROUP_CLUSTER_MANAGER&#34;)
 *                 .build())
 *             .matchers(AlertConfigurationMatcherArgs.builder()
 *                 .fieldName(&#34;HOSTNAME_AND_PORT&#34;)
 *                 .operator(&#34;EQUALS&#34;)
 *                 .value(&#34;SECONDARY&#34;)
 *                 .build())
 *             .metricThresholdConfig(AlertConfigurationMetricThresholdConfigArgs.builder()
 *                 .metricName(&#34;ASSERT_REGULAR&#34;)
 *                 .operator(&#34;LESS_THAN&#34;)
 *                 .threshold(99)
 *                 .units(&#34;RAW&#34;)
 *                 .mode(&#34;AVERAGE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.AlertConfiguration;
 * import com.pulumi.mongodbatlas.AlertConfigurationArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationNotificationArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationMatcherArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationThresholdConfigArgs;
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
 *         var test = new AlertConfiguration(&#34;test&#34;, AlertConfigurationArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .eventType(&#34;REPLICATION_OPLOG_WINDOW_RUNNING_OUT&#34;)
 *             .enabled(true)
 *             .notifications(AlertConfigurationNotificationArgs.builder()
 *                 .typeName(&#34;GROUP&#34;)
 *                 .intervalMin(5)
 *                 .delayMin(0)
 *                 .smsEnabled(false)
 *                 .emailEnabled(true)
 *                 .roles(                
 *                     &#34;GROUP_CHARTS_ADMIN&#34;,
 *                     &#34;GROUP_CLUSTER_MANAGER&#34;)
 *                 .build())
 *             .matchers(AlertConfigurationMatcherArgs.builder()
 *                 .fieldName(&#34;HOSTNAME_AND_PORT&#34;)
 *                 .operator(&#34;EQUALS&#34;)
 *                 .value(&#34;SECONDARY&#34;)
 *                 .build())
 *             .thresholdConfig(AlertConfigurationThresholdConfigArgs.builder()
 *                 .operator(&#34;LESS_THAN&#34;)
 *                 .threshold(1)
 *                 .units(&#34;HOURS&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create an alert with two notifications using Email and SMS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.AlertConfiguration;
 * import com.pulumi.mongodbatlas.AlertConfigurationArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationNotificationArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationMatcherArgs;
 * import com.pulumi.mongodbatlas.inputs.AlertConfigurationMetricThresholdConfigArgs;
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
 *         var test = new AlertConfiguration(&#34;test&#34;, AlertConfigurationArgs.builder()        
 *             .projectId(&#34;PROJECT ID&#34;)
 *             .eventType(&#34;OUTSIDE_METRIC_THRESHOLD&#34;)
 *             .enabled(true)
 *             .notifications(            
 *                 AlertConfigurationNotificationArgs.builder()
 *                     .typeName(&#34;GROUP&#34;)
 *                     .intervalMin(5)
 *                     .delayMin(0)
 *                     .smsEnabled(false)
 *                     .emailEnabled(true)
 *                     .roles(                    
 *                         &#34;GROUP_DATA_ACCESS_READ_ONLY&#34;,
 *                         &#34;GROUP_CLUSTER_MANAGER&#34;,
 *                         &#34;GROUP_DATA_ACCESS_ADMIN&#34;)
 *                     .build(),
 *                 AlertConfigurationNotificationArgs.builder()
 *                     .typeName(&#34;ORG&#34;)
 *                     .intervalMin(5)
 *                     .delayMin(0)
 *                     .smsEnabled(true)
 *                     .emailEnabled(false)
 *                     .build())
 *             .matchers(AlertConfigurationMatcherArgs.builder()
 *                 .fieldName(&#34;HOSTNAME_AND_PORT&#34;)
 *                 .operator(&#34;EQUALS&#34;)
 *                 .value(&#34;SECONDARY&#34;)
 *                 .build())
 *             .metricThresholdConfig(AlertConfigurationMetricThresholdConfigArgs.builder()
 *                 .metricName(&#34;ASSERT_REGULAR&#34;)
 *                 .operator(&#34;LESS_THAN&#34;)
 *                 .threshold(99)
 *                 .units(&#34;RAW&#34;)
 *                 .mode(&#34;AVERAGE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Alert Configuration can be imported using the `project_id-alert_configuration_id`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/alertConfiguration:AlertConfiguration test 5d0f1f74cf09a29120e123cd-5d0f1f74cf09a29120e1fscg
 * ```
 * __NOTE__: Third-party notifications will not contain their respective credentials as these are sensitive attributes. If you wish to perform updates on these notifications without providing the original credentials, the corresponding `notifier_id` attribute must be provided instead.
 * 
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/alert-configurations/)
 * 
 */
@ResourceType(type="mongodbatlas:index/alertConfiguration:AlertConfiguration")
public class AlertConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier for the alert configuration.
     * 
     */
    @Export(name="alertConfigurationId", refs={String.class}, tree="[0]")
    private Output<String> alertConfigurationId;

    /**
     * @return Unique identifier for the alert configuration.
     * 
     */
    public Output<String> alertConfigurationId() {
        return this.alertConfigurationId;
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The type of event that will trigger an alert.
     * 
     * &gt; ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
     * 
     * &gt; **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
     * 
     */
    @Export(name="eventType", refs={String.class}, tree="[0]")
    private Output<String> eventType;

    /**
     * @return The type of event that will trigger an alert.
     * 
     * &gt; ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
     * 
     * &gt; **NOTE:** If `event_type` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metric_threshold_config` field must also be configured.
     * 
     */
    public Output<String> eventType() {
        return this.eventType;
    }
    @Export(name="matchers", refs={List.class,AlertConfigurationMatcher.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AlertConfigurationMatcher>> matchers;

    public Output<Optional<List<AlertConfigurationMatcher>>> matchers() {
        return Codegen.optional(this.matchers);
    }
    @Export(name="metricThresholdConfig", refs={AlertConfigurationMetricThresholdConfig.class}, tree="[0]")
    private Output</* @Nullable */ AlertConfigurationMetricThresholdConfig> metricThresholdConfig;

    public Output<Optional<AlertConfigurationMetricThresholdConfig>> metricThresholdConfig() {
        return Codegen.optional(this.metricThresholdConfig);
    }
    @Export(name="notifications", refs={List.class,AlertConfigurationNotification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AlertConfigurationNotification>> notifications;

    public Output<Optional<List<AlertConfigurationNotification>>> notifications() {
        return Codegen.optional(this.notifications);
    }
    /**
     * The ID of the project where the alert configuration will create.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of the project where the alert configuration will create.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    @Export(name="thresholdConfig", refs={AlertConfigurationThresholdConfig.class}, tree="[0]")
    private Output</* @Nullable */ AlertConfigurationThresholdConfig> thresholdConfig;

    public Output<Optional<AlertConfigurationThresholdConfig>> thresholdConfig() {
        return Codegen.optional(this.thresholdConfig);
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertConfiguration(String name) {
        this(name, AlertConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertConfiguration(String name, AlertConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertConfiguration(String name, AlertConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/alertConfiguration:AlertConfiguration", name, args == null ? AlertConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlertConfiguration(String name, Output<String> id, @Nullable AlertConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/alertConfiguration:AlertConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static AlertConfiguration get(String name, Output<String> id, @Nullable AlertConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertConfiguration(name, id, state, options);
    }
}
