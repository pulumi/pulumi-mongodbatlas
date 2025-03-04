// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ProjectApiKeyArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ProjectApiKeyState;
import com.pulumi.mongodbatlas.outputs.ProjectApiKeyProjectAssignment;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Create And Assign PAK Together
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ProjectApiKey;
 * import com.pulumi.mongodbatlas.ProjectApiKeyArgs;
 * import com.pulumi.mongodbatlas.inputs.ProjectApiKeyProjectAssignmentArgs;
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
 *         var test = new ProjectApiKey("test", ProjectApiKeyArgs.builder()
 *             .description("Description of your API key")
 *             .projectAssignments(ProjectApiKeyProjectAssignmentArgs.builder()
 *                 .projectId("64259ee860c43338194b0f8e")
 *                 .roleNames("GROUP_OWNER")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create And Assign PAK To Multiple Projects
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ProjectApiKey;
 * import com.pulumi.mongodbatlas.ProjectApiKeyArgs;
 * import com.pulumi.mongodbatlas.inputs.ProjectApiKeyProjectAssignmentArgs;
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
 *         var test = new ProjectApiKey("test", ProjectApiKeyArgs.builder()
 *             .description("Description of your API key")
 *             .projectAssignments(            
 *                 ProjectApiKeyProjectAssignmentArgs.builder()
 *                     .projectId("64259ee860c43338194b0f8e")
 *                     .roleNames(                    
 *                         "GROUP_READ_ONLY",
 *                         "GROUP_OWNER")
 *                     .build(),
 *                 ProjectApiKeyProjectAssignmentArgs.builder()
 *                     .projectId("74259ee860c43338194b0f8e")
 *                     .roleNames("GROUP_READ_ONLY")
 *                     .build())
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
 * API Keys must be imported using project ID, API Key ID e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
 * ```
 * See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/projectApiKey:ProjectApiKey")
public class ProjectApiKey extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier for this Project API key.
     * 
     */
    @Export(name="apiKeyId", refs={String.class}, tree="[0]")
    private Output<String> apiKeyId;

    /**
     * @return Unique identifier for this Project API key.
     * 
     */
    public Output<String> apiKeyId() {
        return this.apiKeyId;
    }
    /**
     * Description of this Project API key.
     * 
     * &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of this Project API key.
     * 
     * &gt; **NOTE:** Project created by API Keys must belong to an existing organization.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey;
    }
    @Export(name="projectAssignments", refs={List.class,ProjectApiKeyProjectAssignment.class}, tree="[0,1]")
    private Output<List<ProjectApiKeyProjectAssignment>> projectAssignments;

    public Output<List<ProjectApiKeyProjectAssignment>> projectAssignments() {
        return this.projectAssignments;
    }
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    public Output<String> publicKey() {
        return this.publicKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectApiKey(java.lang.String name) {
        this(name, ProjectApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectApiKey(java.lang.String name, ProjectApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectApiKey(java.lang.String name, ProjectApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/projectApiKey:ProjectApiKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProjectApiKey(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/projectApiKey:ProjectApiKey", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectApiKeyArgs makeArgs(ProjectApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectApiKeyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
            ))
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
    public static ProjectApiKey get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectApiKey(name, id, state, options);
    }
}
