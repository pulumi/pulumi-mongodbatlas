// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.DatabaseUserArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.DatabaseUserState;
import com.pulumi.mongodbatlas.outputs.DatabaseUserLabel;
import com.pulumi.mongodbatlas.outputs.DatabaseUserRole;
import com.pulumi.mongodbatlas.outputs.DatabaseUserScope;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.DatabaseUser` provides a Database User resource. This represents a database user which will be applied to all clusters within the project.
 * 
 * Each user has a set of roles that provide access to the project’s databases. User&#39;s roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text. Read more about sensitive data in state.
 * 
 * ## Example Usage
 * ### S
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.DatabaseUser;
 * import com.pulumi.mongodbatlas.DatabaseUserArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserLabelArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserRoleArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserScopeArgs;
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
 *         var test = new DatabaseUser(&#34;test&#34;, DatabaseUserArgs.builder()        
 *             .authDatabaseName(&#34;admin&#34;)
 *             .labels(DatabaseUserLabelArgs.builder()
 *                 .key(&#34;My Key&#34;)
 *                 .value(&#34;My Value&#34;)
 *                 .build())
 *             .password(&#34;test-acc-password&#34;)
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .roles(            
 *                 DatabaseUserRoleArgs.builder()
 *                     .databaseName(&#34;dbforApp&#34;)
 *                     .roleName(&#34;readWrite&#34;)
 *                     .build(),
 *                 DatabaseUserRoleArgs.builder()
 *                     .databaseName(&#34;admin&#34;)
 *                     .roleName(&#34;readAnyDatabase&#34;)
 *                     .build())
 *             .scopes(            
 *                 DatabaseUserScopeArgs.builder()
 *                     .name(&#34;My cluster name&#34;)
 *                     .type(&#34;CLUSTER&#34;)
 *                     .build(),
 *                 DatabaseUserScopeArgs.builder()
 *                     .name(&#34;My second cluster name&#34;)
 *                     .type(&#34;CLUSTER&#34;)
 *                     .build())
 *             .username(&#34;test-acc-username&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.DatabaseUser;
 * import com.pulumi.mongodbatlas.DatabaseUserArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserLabelArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserRoleArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserScopeArgs;
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
 *         var test = new DatabaseUser(&#34;test&#34;, DatabaseUserArgs.builder()        
 *             .authDatabaseName(&#34;$external&#34;)
 *             .labels(DatabaseUserLabelArgs.builder()
 *                 .key(&#34;%s&#34;)
 *                 .value(&#34;%s&#34;)
 *                 .build())
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .roles(DatabaseUserRoleArgs.builder()
 *                 .databaseName(&#34;admin&#34;)
 *                 .roleName(&#34;readAnyDatabase&#34;)
 *                 .build())
 *             .scopes(DatabaseUserScopeArgs.builder()
 *                 .name(&#34;My cluster name&#34;)
 *                 .type(&#34;CLUSTER&#34;)
 *                 .build())
 *             .username(&#34;test-acc-username&#34;)
 *             .x509Type(&#34;MANAGED&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.DatabaseUser;
 * import com.pulumi.mongodbatlas.DatabaseUserArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserRoleArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserLabelArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserScopeArgs;
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
 *         var test = new DatabaseUser(&#34;test&#34;, DatabaseUserArgs.builder()        
 *             .username(aws_iam_role.test().arn())
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .authDatabaseName(&#34;$external&#34;)
 *             .awsIamType(&#34;ROLE&#34;)
 *             .roles(DatabaseUserRoleArgs.builder()
 *                 .roleName(&#34;readAnyDatabase&#34;)
 *                 .databaseName(&#34;admin&#34;)
 *                 .build())
 *             .labels(DatabaseUserLabelArgs.builder()
 *                 .key(&#34;%s&#34;)
 *                 .value(&#34;%s&#34;)
 *                 .build())
 *             .scopes(DatabaseUserScopeArgs.builder()
 *                 .name(&#34;My cluster name&#34;)
 *                 .type(&#34;CLUSTER&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Database users can be imported using project ID and username, in the format `project_id`-`username`-`auth_database_name`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/databaseUser:DatabaseUser my_user 1112222b3bf99403840e8934-my_user-admin
 * ```
 * 
 */
@ResourceType(type="mongodbatlas:index/databaseUser:DatabaseUser")
public class DatabaseUser extends com.pulumi.resources.CustomResource {
    /**
     * Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     * 
     */
    @Export(name="authDatabaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> authDatabaseName;

    /**
     * @return Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     * 
     */
    public Output<Optional<String>> authDatabaseName() {
        return Codegen.optional(this.authDatabaseName);
    }
    /**
     * If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    @Export(name="awsIamType", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsIamType;

    /**
     * @return If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    public Output<Optional<String>> awsIamType() {
        return Codegen.optional(this.awsIamType);
    }
    /**
     * Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     * 
     * @deprecated
     * use auth_database_name instead
     * 
     */
    @Deprecated /* use auth_database_name instead */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     * 
     */
    public Output<Optional<String>> databaseName() {
        return Codegen.optional(this.databaseName);
    }
    @Export(name="labels", type=List.class, parameters={DatabaseUserLabel.class})
    private Output<List<DatabaseUserLabel>> labels;

    public Output<List<DatabaseUserLabel>> labels() {
        return this.labels;
    }
    /**
     * Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     * 
     */
    @Export(name="ldapAuthType", type=String.class, parameters={})
    private Output</* @Nullable */ String> ldapAuthType;

    /**
     * @return Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     * 
     */
    public Output<Optional<String>> ldapAuthType() {
        return Codegen.optional(this.ldapAuthType);
    }
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     * 
     */
    @Export(name="roles", type=List.class, parameters={DatabaseUserRole.class})
    private Output<List<DatabaseUserRole>> roles;

    /**
     * @return List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     * 
     */
    public Output<List<DatabaseUserRole>> roles() {
        return this.roles;
    }
    @Export(name="scopes", type=List.class, parameters={DatabaseUserScope.class})
    private Output</* @Nullable */ List<DatabaseUserScope>> scopes;

    public Output<Optional<List<DatabaseUserScope>>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    @Export(name="x509Type", type=String.class, parameters={})
    private Output</* @Nullable */ String> x509Type;

    /**
     * @return X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    public Output<Optional<String>> x509Type() {
        return Codegen.optional(this.x509Type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseUser(String name) {
        this(name, DatabaseUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseUser(String name, DatabaseUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseUser(String name, DatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/databaseUser:DatabaseUser", name, args == null ? DatabaseUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseUser(String name, Output<String> id, @Nullable DatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/databaseUser:DatabaseUser", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
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
    public static DatabaseUser get(String name, Output<String> id, @Nullable DatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseUser(name, id, state, options);
    }
}
