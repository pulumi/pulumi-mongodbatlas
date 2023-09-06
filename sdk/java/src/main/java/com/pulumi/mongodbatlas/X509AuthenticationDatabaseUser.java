// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.X509AuthenticationDatabaseUserArgs;
import com.pulumi.mongodbatlas.inputs.X509AuthenticationDatabaseUserState;
import com.pulumi.mongodbatlas.outputs.X509AuthenticationDatabaseUserCertificate;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.X509AuthenticationDatabaseUser` provides a X509 Authentication Database User resource. The mongodbatlas.X509AuthenticationDatabaseUser resource lets you manage MongoDB users who authenticate using X.509 certificates. You can manage these X.509 certificates or let Atlas do it for you.
 * 
 * | Management  | Description  |
 * |---|---|
 * | Atlas  | Atlas manages your Certificate Authority and can generate certificates for your MongoDB users. No additional X.509 configuration is required.  |
 * | Customer  |  You must provide a Certificate Authority and generate certificates for your MongoDB users. |
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * ## Example Usage
 * 
 * ### S
 * ### Example Usage: Generate an Atlas-managed X.509 certificate for a MongoDB user
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
 * import com.pulumi.mongodbatlas.X509AuthenticationDatabaseUser;
 * import com.pulumi.mongodbatlas.X509AuthenticationDatabaseUserArgs;
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
 *         var user = new DatabaseUser(&#34;user&#34;, DatabaseUserArgs.builder()        
 *             .projectId(&#34;64b926dd56206839b1c8bae9&#34;)
 *             .username(&#34;myUsername&#34;)
 *             .x509Type(&#34;MANAGED&#34;)
 *             .databaseName(&#34;$external&#34;)
 *             .roles(DatabaseUserRoleArgs.builder()
 *                 .roleName(&#34;atlasAdmin&#34;)
 *                 .databaseName(&#34;admin&#34;)
 *                 .build())
 *             .labels(DatabaseUserLabelArgs.builder()
 *                 .key(&#34;My Key&#34;)
 *                 .value(&#34;My Value&#34;)
 *                 .build())
 *             .build());
 * 
 *         var test = new X509AuthenticationDatabaseUser(&#34;test&#34;, X509AuthenticationDatabaseUserArgs.builder()        
 *             .projectId(user.projectId())
 *             .username(user.username())
 *             .monthsUntilExpiration(2)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Usage: Save a self-managed X.509 certificate for an Atlas project and use it with a dababase user
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.X509AuthenticationDatabaseUser;
 * import com.pulumi.mongodbatlas.X509AuthenticationDatabaseUserArgs;
 * import com.pulumi.mongodbatlas.DatabaseUser;
 * import com.pulumi.mongodbatlas.DatabaseUserArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserLabelArgs;
 * import com.pulumi.mongodbatlas.inputs.DatabaseUserRoleArgs;
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
 *         var test = new X509AuthenticationDatabaseUser(&#34;test&#34;, X509AuthenticationDatabaseUserArgs.builder()        
 *             .customerX509Cas(&#34;&#34;&#34;
 *   -----BEGIN CERTIFICATE-----
 *   MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
 *   VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
 *   c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
 *   SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
 *   MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
 *   VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
 *   BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
 *   c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
 *   iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
 *   cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
 *   Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
 *   SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
 *   7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
 *   iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
 *   -----END CERTIFICATE-----&#34;
 * 
 *             &#34;&#34;&#34;)
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .build());
 * 
 *         var user = new DatabaseUser(&#34;user&#34;, DatabaseUserArgs.builder()        
 *             .databaseName(&#34;$external&#34;)
 *             .labels(DatabaseUserLabelArgs.builder()
 *                 .key(&#34;My Key&#34;)
 *                 .value(&#34;My Value&#34;)
 *                 .build())
 *             .projectId(&#34;64b926dd56206839b1c8bae9&#34;)
 *             .roles(DatabaseUserRoleArgs.builder()
 *                 .databaseName(&#34;admin&#34;)
 *                 .roleName(&#34;atlasAdmin&#34;)
 *                 .build())
 *             .username(&#34;myUsername&#34;)
 *             .x509Type(&#34;CUSTOMER&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * X.509 Certificates for a User can be imported using project ID and username, in the format `project_id-username`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934-myUsername
 * ```
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)
 * 
 * Current X.509 Configuration can be imported using project ID, in the format `project_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934
 * ```
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)
 * 
 */
@ResourceType(type="mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser")
public class X509AuthenticationDatabaseUser extends com.pulumi.resources.CustomResource {
    /**
     * Array of objects where each details one unexpired database user certificate.
     * 
     */
    @Export(name="certificates", refs={List.class,X509AuthenticationDatabaseUserCertificate.class}, tree="[0,1]")
    private Output<List<X509AuthenticationDatabaseUserCertificate>> certificates;

    /**
     * @return Array of objects where each details one unexpired database user certificate.
     * 
     */
    public Output<List<X509AuthenticationDatabaseUserCertificate>> certificates() {
        return this.certificates;
    }
    /**
     * Contains the last X.509 certificate and private key created for a database user.
     * 
     */
    @Export(name="currentCertificate", refs={String.class}, tree="[0]")
    private Output<String> currentCertificate;

    /**
     * @return Contains the last X.509 certificate and private key created for a database user.
     * 
     */
    public Output<String> currentCertificate() {
        return this.currentCertificate;
    }
    /**
     * PEM string containing one or more customer CAs for database user authentication.
     * 
     */
    @Export(name="customerX509Cas", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerX509Cas;

    /**
     * @return PEM string containing one or more customer CAs for database user authentication.
     * 
     */
    public Output<Optional<String>> customerX509Cas() {
        return Codegen.optional(this.customerX509Cas);
    }
    /**
     * A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     * 
     */
    @Export(name="monthsUntilExpiration", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> monthsUntilExpiration;

    /**
     * @return A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     * 
     */
    public Output<Optional<Integer>> monthsUntilExpiration() {
        return Codegen.optional(this.monthsUntilExpiration);
    }
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Identifier for the Atlas project associated with the X.509 configuration.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Username of the database user to create a certificate for.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return Username of the database user to create a certificate for.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public X509AuthenticationDatabaseUser(String name) {
        this(name, X509AuthenticationDatabaseUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public X509AuthenticationDatabaseUser(String name, X509AuthenticationDatabaseUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public X509AuthenticationDatabaseUser(String name, X509AuthenticationDatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser", name, args == null ? X509AuthenticationDatabaseUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private X509AuthenticationDatabaseUser(String name, Output<String> id, @Nullable X509AuthenticationDatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "currentCertificate",
                "customerX509Cas"
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
    public static X509AuthenticationDatabaseUser get(String name, Output<String> id, @Nullable X509AuthenticationDatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new X509AuthenticationDatabaseUser(name, id, state, options);
    }
}
