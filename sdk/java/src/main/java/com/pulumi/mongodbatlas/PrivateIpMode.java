// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivateIpModeArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivateIpModeState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.PrivateIpMode` provides a Private IP Mode resource. This allows one to disable Connect via Peering Only mode for a MongoDB Atlas Project.
 * 
 * &gt; **Deprecated Feature**: &lt;br&gt; This feature has been deprecated. Use [Split Horizon connection strings](https://dochub.mongodb.org/core/atlas-horizon-faq) to connect to your cluster. These connection strings allow you to connect using both VPC/VNet Peering and whitelisted public IP addresses. To learn more about support for Split Horizon, see [this FAQ](https://dochub.mongodb.org/core/atlas-horizon-faq). You need this endpoint to [disable Peering Only](https://docs.atlas.mongodb.com/reference/faq/connection-changes/#disable-peering-mode).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.PrivateIpMode;
 * import com.pulumi.mongodbatlas.PrivateIpModeArgs;
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
 *         var myPrivateIpMode = new PrivateIpMode(&#34;myPrivateIpMode&#34;, PrivateIpModeArgs.builder()        
 *             .enabled(false)
 *             .projectId(&#34;&lt;YOUR PROJECT ID&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Project must be imported using project ID, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/privateIpMode:PrivateIpMode my_private_ip_mode 5d09d6a59ccf6445652a444a
 * ```
 * 
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/get-private-ip-mode-for-project/)
 * 
 */
@ResourceType(type="mongodbatlas:index/privateIpMode:PrivateIpMode")
public class PrivateIpMode extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The unique ID for the project to enable Only Private IP Mode.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to enable Only Private IP Mode.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateIpMode(String name) {
        this(name, PrivateIpModeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateIpMode(String name, PrivateIpModeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateIpMode(String name, PrivateIpModeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateIpMode:PrivateIpMode", name, args == null ? PrivateIpModeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateIpMode(String name, Output<String> id, @Nullable PrivateIpModeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateIpMode:PrivateIpMode", name, state, makeResourceOptions(options, id));
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
    public static PrivateIpMode get(String name, Output<String> id, @Nullable PrivateIpModeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateIpMode(name, id, state, options);
    }
}