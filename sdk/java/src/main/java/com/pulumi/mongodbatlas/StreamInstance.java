// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.StreamInstanceArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.StreamInstanceState;
import com.pulumi.mongodbatlas.outputs.StreamInstanceDataProcessRegion;
import com.pulumi.mongodbatlas.outputs.StreamInstanceStreamConfig;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.StreamInstance
 * 
 * `mongodbatlas.StreamInstance` provides a Stream Instance resource. The resource lets you create, edit, and delete stream instances in a project.
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
 * import com.pulumi.mongodbatlas.StreamInstance;
 * import com.pulumi.mongodbatlas.StreamInstanceArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamInstanceDataProcessRegionArgs;
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
 *         var test = new StreamInstance("test", StreamInstanceArgs.builder()
 *             .projectId(projectId)
 *             .instanceName("InstanceName")
 *             .dataProcessRegion(StreamInstanceDataProcessRegionArgs.builder()
 *                 .region("VIRGINIA_USA")
 *                 .cloud_provider("AWS")
 *                 .build())
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
 * You can import stream instance resource using the project ID and instance name, in the format `PROJECT_ID-INSTANCE_NAME`. For example:
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/streamInstance:StreamInstance test 650972848269185c55f40ca1-InstanceName
 * ```
 * To learn more, see: [MongoDB Atlas API - Stream Instance](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) Documentation.
 * The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.
 * 
 */
@ResourceType(type="mongodbatlas:index/streamInstance:StreamInstance")
public class StreamInstance extends com.pulumi.resources.CustomResource {
    /**
     * Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
     * 
     */
    @Export(name="dataProcessRegion", refs={StreamInstanceDataProcessRegion.class}, tree="[0]")
    private Output<StreamInstanceDataProcessRegion> dataProcessRegion;

    /**
     * @return Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
     * 
     */
    public Output<StreamInstanceDataProcessRegion> dataProcessRegion() {
        return this.dataProcessRegion;
    }
    /**
     * List that contains the hostnames assigned to the stream instance.
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hostnames;

    /**
     * @return List that contains the hostnames assigned to the stream instance.
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * Human-readable label that identifies the stream instance.
     * 
     */
    @Export(name="instanceName", refs={String.class}, tree="[0]")
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Configuration options for an Atlas Stream Processing Instance. See stream config
     * 
     */
    @Export(name="streamConfig", refs={StreamInstanceStreamConfig.class}, tree="[0]")
    private Output<StreamInstanceStreamConfig> streamConfig;

    /**
     * @return Configuration options for an Atlas Stream Processing Instance. See stream config
     * 
     */
    public Output<StreamInstanceStreamConfig> streamConfig() {
        return this.streamConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamInstance(String name) {
        this(name, StreamInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamInstance(String name, StreamInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamInstance(String name, StreamInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamInstance:StreamInstance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private StreamInstance(String name, Output<String> id, @Nullable StreamInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamInstance:StreamInstance", name, state, makeResourceOptions(options, id));
    }

    private static StreamInstanceArgs makeArgs(StreamInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamInstanceArgs.Empty : args;
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
    public static StreamInstance get(String name, Output<String> id, @Nullable StreamInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamInstance(name, id, state, options);
    }
}
