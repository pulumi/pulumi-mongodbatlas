// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.LdapVerifyArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.LdapVerifyState;
import com.pulumi.mongodbatlas.outputs.LdapVerifyLink;
import com.pulumi.mongodbatlas.outputs.LdapVerifyValidation;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.LdapVerify
 * 
 * `mongodbatlas.LdapVerify` provides an LDAP Verify resource. This allows a a verification of an LDAP configuration over TLS for an Atlas project. Atlas retains only the most recent request for each project.
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
 * import com.pulumi.mongodbatlas.Project;
 * import com.pulumi.mongodbatlas.ProjectArgs;
 * import com.pulumi.mongodbatlas.AdvancedCluster;
 * import com.pulumi.mongodbatlas.AdvancedClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecArgs;
 * import com.pulumi.mongodbatlas.LdapVerify;
 * import com.pulumi.mongodbatlas.LdapVerifyArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var test = new Project("test", ProjectArgs.builder()
 *             .name("NAME OF THE PROJECT")
 *             .orgId("ORG ID")
 *             .build());
 * 
 *         var testAdvancedCluster = new AdvancedCluster("testAdvancedCluster", AdvancedClusterArgs.builder()
 *             .projectId(test.id())
 *             .name("NAME OF THE CLUSTER")
 *             .clusterType("REPLICASET")
 *             .backupEnabled(true)
 *             .replicationSpecs(AdvancedClusterReplicationSpecArgs.builder()
 *                 .regionConfigs(AdvancedClusterReplicationSpecRegionConfigArgs.builder()
 *                     .priority(7)
 *                     .providerName("AWS")
 *                     .regionName("US_EAST_1")
 *                     .electableSpecs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs.builder()
 *                         .instanceSize("M10")
 *                         .nodeCount(3)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var testLdapVerify = new LdapVerify("testLdapVerify", LdapVerifyArgs.builder()
 *             .projectId(test.id())
 *             .hostname("HOSTNAME")
 *             .port(636)
 *             .bindUsername("USERNAME")
 *             .bindPassword("PASSWORD")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(testAdvancedCluster)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * LDAP Configuration must be imported using project ID and request ID, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/ldapVerify:LdapVerify test 5d09d6a59ccf6445652a444a-5d09d6a59ccf6445652a444a
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-request-verification)
 * 
 */
@ResourceType(type="mongodbatlas:index/ldapVerify:LdapVerify")
public class LdapVerify extends com.pulumi.resources.CustomResource {
    /**
     * An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
     * 
     */
    @Export(name="authzQueryTemplate", refs={String.class}, tree="[0]")
    private Output<String> authzQueryTemplate;

    /**
     * @return An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs. Used only for user authorization. Use the {USER} placeholder in the URL to substitute the authenticated username. The query is relative to the host specified with hostname. The formatting for the query must conform to RFC4515 and RFC 4516. If you do not provide a query template, Atlas attempts to use the default value: `{USER}?memberOf?base`.
     * 
     */
    public Output<String> authzQueryTemplate() {
        return this.authzQueryTemplate;
    }
    /**
     * The password used to authenticate the `bind_username`.
     * 
     */
    @Export(name="bindPassword", refs={String.class}, tree="[0]")
    private Output<String> bindPassword;

    /**
     * @return The password used to authenticate the `bind_username`.
     * 
     */
    public Output<String> bindPassword() {
        return this.bindPassword;
    }
    /**
     * The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
     * 
     */
    @Export(name="bindUsername", refs={String.class}, tree="[0]")
    private Output<String> bindUsername;

    /**
     * @return The user DN that Atlas uses to connect to the LDAP server. Must be the full DN, such as `CN=BindUser,CN=Users,DC=myldapserver,DC=mycompany,DC=com`.
     * 
     */
    public Output<String> bindUsername() {
        return this.bindUsername;
    }
    /**
     * CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
     * 
     */
    @Export(name="caCertificate", refs={String.class}, tree="[0]")
    private Output<String> caCertificate;

    /**
     * @return CA certificate used to verify the identify of the LDAP server. Self-signed certificates are allowed.
     * 
     */
    public Output<String> caCertificate() {
        return this.caCertificate;
    }
    /**
     * The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return The hostname or IP address of the LDAP server. The server must be visible to the internet or connected to your Atlas cluster with VPC Peering.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * One or more links to sub-resources. The relations in the URLs are explained in the Web Linking Specification.
     * 
     */
    @Export(name="links", refs={List.class,LdapVerifyLink.class}, tree="[0,1]")
    private Output<List<LdapVerifyLink>> links;

    /**
     * @return One or more links to sub-resources. The relations in the URLs are explained in the Web Linking Specification.
     * 
     */
    public Output<List<LdapVerifyLink>> links() {
        return this.links;
    }
    /**
     * The port to which the LDAP server listens for client connections. Default: `636`
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port to which the LDAP server listens for client connections. Default: `636`
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The unique ID for the project to configure LDAP.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to configure LDAP.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The unique identifier for the request to verify the LDAP over TLS/SSL configuration.
     * 
     */
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    /**
     * @return The unique identifier for the request to verify the LDAP over TLS/SSL configuration.
     * 
     */
    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Array of validation messages related to the verification of the provided LDAP over TLS/SSL configuration details. The array contains a document for each test that Atlas runs. Atlas stops running tests after the first failure. The following return values can be seen here: [Values](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-request-verification)
     * 
     */
    @Export(name="validations", refs={List.class,LdapVerifyValidation.class}, tree="[0,1]")
    private Output<List<LdapVerifyValidation>> validations;

    /**
     * @return Array of validation messages related to the verification of the provided LDAP over TLS/SSL configuration details. The array contains a document for each test that Atlas runs. Atlas stops running tests after the first failure. The following return values can be seen here: [Values](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-request-verification)
     * 
     */
    public Output<List<LdapVerifyValidation>> validations() {
        return this.validations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LdapVerify(java.lang.String name) {
        this(name, LdapVerifyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LdapVerify(java.lang.String name, LdapVerifyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LdapVerify(java.lang.String name, LdapVerifyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/ldapVerify:LdapVerify", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LdapVerify(java.lang.String name, Output<java.lang.String> id, @Nullable LdapVerifyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/ldapVerify:LdapVerify", name, state, makeResourceOptions(options, id), false);
    }

    private static LdapVerifyArgs makeArgs(LdapVerifyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LdapVerifyArgs.Empty : args;
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
    public static LdapVerify get(java.lang.String name, Output<java.lang.String> id, @Nullable LdapVerifyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LdapVerify(name, id, state, options);
    }
}
