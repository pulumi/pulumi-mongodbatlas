// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.MongodbEmployeeAccessGrantArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.MongodbEmployeeAccessGrantState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.MongodbEmployeeAccessGrant
 * 
 * `mongodbatlas.MongodbEmployeeAccessGrant` provides a MongoDB Employee Access Grant resource. The resource lets you create, delete, update and import a MongoDB employee access grant.
 * 
 * ## Example Usage
 * 
 * ### S
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.MongodbEmployeeAccessGrant;
 * import com.pulumi.mongodbatlas.MongodbEmployeeAccessGrantArgs;
 * import com.pulumi.mongodbatlas.MongodbatlasFunctions;
 * import com.pulumi.mongodbatlas.inputs.GetMongodbEmployeeAccessGrantArgs;
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
 *         var example = new MongodbEmployeeAccessGrant("example", MongodbEmployeeAccessGrantArgs.builder()
 *             .projectId(projectId)
 *             .clusterName(clusterName)
 *             .grantType("CLUSTER_INFRASTRUCTURE_AND_APP_SERVICES_SYNC_DATA")
 *             .expirationTime("2025-01-01T12:00:00Z")
 *             .build());
 * 
 *         final var dsExample = MongodbatlasFunctions.getMongodbEmployeeAccessGrant(GetMongodbEmployeeAccessGrantArgs.builder()
 *             .projectId(projectId)
 *             .clusterName(clusterName)
 *             .build());
 * 
 *         ctx.export("grantType", dsExample.applyValue(getMongodbEmployeeAccessGrantResult -> getMongodbEmployeeAccessGrantResult.grantType()));
 *         ctx.export("expirationTime", dsExample.applyValue(getMongodbEmployeeAccessGrantResult -> getMongodbEmployeeAccessGrantResult.expirationTime()));
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The resource can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTERNAME`, e.g.
 * 
 * For more information see: [MongoDB Employee Access Grant API doc](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Clusters/operation/grantMongoDBEmployeeAccess).
 * 
 */
@ResourceType(type="mongodbatlas:index/mongodbEmployeeAccessGrant:MongodbEmployeeAccessGrant")
public class MongodbEmployeeAccessGrant extends com.pulumi.resources.CustomResource {
    /**
     * Human-readable label that identifies this cluster.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return Human-readable label that identifies this cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Expiration date for the employee access grant.
     * 
     */
    @Export(name="expirationTime", refs={String.class}, tree="[0]")
    private Output<String> expirationTime;

    /**
     * @return Expiration date for the employee access grant.
     * 
     */
    public Output<String> expirationTime() {
        return this.expirationTime;
    }
    /**
     * Level of access to grant to MongoDB Employees. Possible values are CLUSTER*DATABASE*LOGS, CLUSTER*INFRASTRUCTURE or CLUSTER*INFRASTRUCTURE*AND*APP*SERVICES*SYNC_DATA.
     * 
     */
    @Export(name="grantType", refs={String.class}, tree="[0]")
    private Output<String> grantType;

    /**
     * @return Level of access to grant to MongoDB Employees. Possible values are CLUSTER*DATABASE*LOGS, CLUSTER*INFRASTRUCTURE or CLUSTER*INFRASTRUCTURE*AND*APP*SERVICES*SYNC_DATA.
     * 
     */
    public Output<String> grantType() {
        return this.grantType;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MongodbEmployeeAccessGrant(java.lang.String name) {
        this(name, MongodbEmployeeAccessGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MongodbEmployeeAccessGrant(java.lang.String name, MongodbEmployeeAccessGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MongodbEmployeeAccessGrant(java.lang.String name, MongodbEmployeeAccessGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/mongodbEmployeeAccessGrant:MongodbEmployeeAccessGrant", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MongodbEmployeeAccessGrant(java.lang.String name, Output<java.lang.String> id, @Nullable MongodbEmployeeAccessGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/mongodbEmployeeAccessGrant:MongodbEmployeeAccessGrant", name, state, makeResourceOptions(options, id), false);
    }

    private static MongodbEmployeeAccessGrantArgs makeArgs(MongodbEmployeeAccessGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MongodbEmployeeAccessGrantArgs.Empty : args;
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
    public static MongodbEmployeeAccessGrant get(java.lang.String name, Output<java.lang.String> id, @Nullable MongodbEmployeeAccessGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MongodbEmployeeAccessGrant(name, id, state, options);
    }
}
