// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.MaintenanceWindowArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.MaintenanceWindowState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * # Resource: mongodbatlas.MaintenanceWindow
 * 
 * `mongodbatlas.MaintenanceWindow` provides a resource to schedule the maintenance window for your MongoDB Atlas Project and/or set to defer a scheduled maintenance up to two times. Please refer to [Maintenance Windows](https://www.mongodb.com/docs/atlas/tutorial/cluster-maintenance-window/#configure-maintenance-window) documentation for more details.
 * 
 * &gt; **NOTE:** Only a single maintenance window resource can be defined per project.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * ## Maintenance Window Considerations:
 * 
 * - Urgent Maintenance Activities Cannot Wait: Urgent maintenance activities such as security patches cannot wait for your chosen window. Atlas will start those maintenance activities when needed.
 * 
 * Once maintenance is scheduled for your cluster, you cannot change your maintenance window until the current maintenance efforts have completed.
 * - Maintenance Requires Replica Set Elections: Atlas performs maintenance the same way as the manual maintenance procedure. This requires at least one replica set election during the maintenance window per replica set.
 * - Maintenance Starts As Close to the Hour As Possible: Maintenance always begins as close to the scheduled hour as possible, but in-progress cluster updates or expected system issues could delay the start time.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.MaintenanceWindow;
 * import com.pulumi.mongodbatlas.MaintenanceWindowArgs;
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
 *         var test = new MaintenanceWindow("test", MaintenanceWindowArgs.builder()
 *             .projectId("<your-project-id>")
 *             .dayOfWeek(3)
 *             .hourOfDay(4)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.MaintenanceWindow;
 * import com.pulumi.mongodbatlas.MaintenanceWindowArgs;
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
 *         var test = new MaintenanceWindow("test", MaintenanceWindowArgs.builder()
 *             .projectId("<your-project-id>")
 *             .defer(true)
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
 * Maintenance Window entries can be imported using project project_id, in the format `PROJECTID`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/maintenanceWindow:MaintenanceWindow test 5d0f1f73cf09a29120e173cf
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)
 * 
 */
@ResourceType(type="mongodbatlas:index/maintenanceWindow:MaintenanceWindow")
public class MaintenanceWindow extends com.pulumi.resources.CustomResource {
    /**
     * Defer any scheduled maintenance for the given project for one week.
     * 
     */
    @Export(name="autoDefer", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoDefer;

    /**
     * @return Defer any scheduled maintenance for the given project for one week.
     * 
     */
    public Output<Boolean> autoDefer() {
        return this.autoDefer;
    }
    @Export(name="autoDeferOnceEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoDeferOnceEnabled;

    public Output<Boolean> autoDeferOnceEnabled() {
        return this.autoDeferOnceEnabled;
    }
    /**
     * Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
     * 
     */
    @Export(name="dayOfWeek", refs={Integer.class}, tree="[0]")
    private Output<Integer> dayOfWeek;

    /**
     * @return Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
     * 
     */
    public Output<Integer> dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * Defer the next scheduled maintenance for the given project for one week.
     * 
     */
    @Export(name="defer", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> defer;

    /**
     * @return Defer the next scheduled maintenance for the given project for one week.
     * 
     */
    public Output<Boolean> defer() {
        return this.defer;
    }
    /**
     * Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
     * 
     */
    @Export(name="hourOfDay", refs={Integer.class}, tree="[0]")
    private Output<Integer> hourOfDay;

    /**
     * @return Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
     * 
     */
    public Output<Integer> hourOfDay() {
        return this.hourOfDay;
    }
    /**
     * Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
     * 
     */
    @Export(name="numberOfDeferrals", refs={Integer.class}, tree="[0]")
    private Output<Integer> numberOfDeferrals;

    /**
     * @return Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
     * 
     */
    public Output<Integer> numberOfDeferrals() {
        return this.numberOfDeferrals;
    }
    /**
     * The unique identifier of the project for the Maintenance Window.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Maintenance Window.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     * 
     */
    @Export(name="startAsap", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> startAsap;

    /**
     * @return Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     * 
     */
    public Output<Boolean> startAsap() {
        return this.startAsap;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MaintenanceWindow(java.lang.String name) {
        this(name, MaintenanceWindowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaintenanceWindow(java.lang.String name, MaintenanceWindowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaintenanceWindow(java.lang.String name, MaintenanceWindowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/maintenanceWindow:MaintenanceWindow", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MaintenanceWindow(java.lang.String name, Output<java.lang.String> id, @Nullable MaintenanceWindowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/maintenanceWindow:MaintenanceWindow", name, state, makeResourceOptions(options, id), false);
    }

    private static MaintenanceWindowArgs makeArgs(MaintenanceWindowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MaintenanceWindowArgs.Empty : args;
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
    public static MaintenanceWindow get(java.lang.String name, Output<java.lang.String> id, @Nullable MaintenanceWindowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaintenanceWindow(name, id, state, options);
    }
}
