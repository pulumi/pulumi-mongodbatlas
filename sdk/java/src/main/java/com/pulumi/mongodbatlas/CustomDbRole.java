// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CustomDbRoleArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CustomDbRoleState;
import com.pulumi.mongodbatlas.outputs.CustomDbRoleAction;
import com.pulumi.mongodbatlas.outputs.CustomDbRoleInheritedRole;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.CustomDbRole
 * 
 * `mongodbatlas.CustomDbRole` provides a Custom DB Role resource. The customDBRoles resource lets you retrieve, create and modify the custom MongoDB roles in your cluster. Use custom MongoDB roles to specify custom sets of actions which cannot be described by the built-in Atlas database user privileges.
 * 
 * &gt; **IMPORTANT**  You define custom roles at the project level for all clusters in the project. The `mongodbatlas.CustomDbRole` resource supports a subset of MongoDB privilege actions. For a complete list of [privilege actions](https://docs.mongodb.com/manual/reference/privilege-actions/) available for this resource, see [Custom Role actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions/). Custom roles must include actions that all project&#39;s clusters support, and that are compatible with each MongoDB version used by your project&#39;s clusters. For example, if your project has MongoDB 4.2 clusters, you can&#39;t create custom roles that use actions introduced in MongoDB 4.4.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
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
 * import com.pulumi.mongodbatlas.CustomDbRole;
 * import com.pulumi.mongodbatlas.CustomDbRoleArgs;
 * import com.pulumi.mongodbatlas.inputs.CustomDbRoleActionArgs;
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
 *         var testRole = new CustomDbRole("testRole", CustomDbRoleArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .roleName("myCustomRole")
 *             .actions(            
 *                 CustomDbRoleActionArgs.builder()
 *                     .action("UPDATE")
 *                     .resources(CustomDbRoleActionResourceArgs.builder()
 *                         .collectionName("")
 *                         .databaseName("anyDatabase")
 *                         .build())
 *                     .build(),
 *                 CustomDbRoleActionArgs.builder()
 *                     .action("INSERT")
 *                     .resources(CustomDbRoleActionResourceArgs.builder()
 *                         .collectionName("")
 *                         .databaseName("anyDatabase")
 *                         .build())
 *                     .build(),
 *                 CustomDbRoleActionArgs.builder()
 *                     .action("REMOVE")
 *                     .resources(CustomDbRoleActionResourceArgs.builder()
 *                         .collectionName("")
 *                         .databaseName("anyDatabase")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With Inherited Roles
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.CustomDbRole;
 * import com.pulumi.mongodbatlas.CustomDbRoleArgs;
 * import com.pulumi.mongodbatlas.inputs.CustomDbRoleActionArgs;
 * import com.pulumi.mongodbatlas.inputs.CustomDbRoleInheritedRoleArgs;
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
 *         var inheritedRoleOne = new CustomDbRole("inheritedRoleOne", CustomDbRoleArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .roleName("insertRole")
 *             .actions(CustomDbRoleActionArgs.builder()
 *                 .action("INSERT")
 *                 .resources(CustomDbRoleActionResourceArgs.builder()
 *                     .collectionName("")
 *                     .databaseName("anyDatabase")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var inheritedRoleTwo = new CustomDbRole("inheritedRoleTwo", CustomDbRoleArgs.builder()
 *             .projectId(inheritedRoleOne.projectId())
 *             .roleName("statusServerRole")
 *             .actions(CustomDbRoleActionArgs.builder()
 *                 .action("SERVER_STATUS")
 *                 .resources(CustomDbRoleActionResourceArgs.builder()
 *                     .cluster(true)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var testRole = new CustomDbRole("testRole", CustomDbRoleArgs.builder()
 *             .projectId(inheritedRoleOne.projectId())
 *             .roleName("myCustomRole")
 *             .actions(            
 *                 CustomDbRoleActionArgs.builder()
 *                     .action("UPDATE")
 *                     .resources(CustomDbRoleActionResourceArgs.builder()
 *                         .collectionName("")
 *                         .databaseName("anyDatabase")
 *                         .build())
 *                     .build(),
 *                 CustomDbRoleActionArgs.builder()
 *                     .action("REMOVE")
 *                     .resources(CustomDbRoleActionResourceArgs.builder()
 *                         .collectionName("")
 *                         .databaseName("anyDatabase")
 *                         .build())
 *                     .build())
 *             .inheritedRoles(            
 *                 CustomDbRoleInheritedRoleArgs.builder()
 *                     .roleName(inheritedRoleOne.roleName())
 *                     .databaseName("admin")
 *                     .build(),
 *                 CustomDbRoleInheritedRoleArgs.builder()
 *                     .roleName(inheritedRoleTwo.roleName())
 *                     .databaseName("admin")
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
 * Database users can be imported using project ID and username, in the format `PROJECTID-ROLENAME`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/customDbRole:CustomDbRole my_role 1112222b3bf99403840e8934-MyCustomRole
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/custom-roles/)
 * 
 */
@ResourceType(type="mongodbatlas:index/customDbRole:CustomDbRole")
public class CustomDbRole extends com.pulumi.resources.CustomResource {
    @Export(name="actions", refs={List.class,CustomDbRoleAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CustomDbRoleAction>> actions;

    public Output<Optional<List<CustomDbRoleAction>>> actions() {
        return Codegen.optional(this.actions);
    }
    @Export(name="inheritedRoles", refs={List.class,CustomDbRoleInheritedRole.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CustomDbRoleInheritedRole>> inheritedRoles;

    public Output<Optional<List<CustomDbRoleInheritedRole>>> inheritedRoles() {
        return Codegen.optional(this.inheritedRoles);
    }
    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Name of the custom role.
     * 
     * &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     * 
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return Name of the custom role.
     * 
     * &gt; **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     * 
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDbRole(String name) {
        this(name, CustomDbRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDbRole(String name, CustomDbRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDbRole(String name, CustomDbRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/customDbRole:CustomDbRole", name, args == null ? CustomDbRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDbRole(String name, Output<String> id, @Nullable CustomDbRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/customDbRole:CustomDbRole", name, state, makeResourceOptions(options, id));
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
    public static CustomDbRole get(String name, Output<String> id, @Nullable CustomDbRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDbRole(name, id, state, options);
    }
}
