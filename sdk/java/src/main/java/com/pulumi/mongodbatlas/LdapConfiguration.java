// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.LdapConfigurationArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.LdapConfigurationState;
import com.pulumi.mongodbatlas.outputs.LdapConfigurationUserToDnMapping;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.LdapConfiguration
 * 
 * `mongodbatlas.LdapConfiguration` provides an LDAP Configuration resource. This allows an LDAP configuration for an Atlas project to be created and managed. This endpoint doesn’t verify connectivity using the provided LDAP over TLS configuration details. To verify a configuration before saving it, use the resource to verify the LDAP configuration.
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
 * import com.pulumi.mongodbatlas.LdapConfiguration;
 * import com.pulumi.mongodbatlas.LdapConfigurationArgs;
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
 *         var testLdapConfiguration = new LdapConfiguration("testLdapConfiguration", LdapConfigurationArgs.builder()
 *             .projectId(test.id())
 *             .authenticationEnabled(true)
 *             .hostname("HOSTNAME")
 *             .port(636)
 *             .bindUsername("USERNAME")
 *             .bindPassword("PASSWORD")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### LDAP With User To DN Mapping
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
 * import com.pulumi.mongodbatlas.LdapConfiguration;
 * import com.pulumi.mongodbatlas.LdapConfigurationArgs;
 * import com.pulumi.mongodbatlas.inputs.LdapConfigurationUserToDnMappingArgs;
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
 *         var testLdapConfiguration = new LdapConfiguration("testLdapConfiguration", LdapConfigurationArgs.builder()
 *             .projectId(test.id())
 *             .authenticationEnabled(true)
 *             .hostname("HOSTNAME")
 *             .port(636)
 *             .bindUsername("USERNAME")
 *             .bindPassword("PASSWORD")
 *             .caCertificate("CA CERTIFICATE")
 *             .authzQueryTemplate("{USER}?memberOf?base")
 *             .userToDnMappings(LdapConfigurationUserToDnMappingArgs.builder()
 *                 .match("(.+)")
 *                 .ldapQuery("DC=example,DC=com??sub?(userPrincipalName={0})")
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
 * LDAP Configuration must be imported using project ID, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/ldapConfiguration:LdapConfiguration test 5d09d6a59ccf6445652a444a
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save)
 * 
 */
@ResourceType(type="mongodbatlas:index/ldapConfiguration:LdapConfiguration")
public class LdapConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether user authentication with LDAP is enabled.
     * 
     */
    @Export(name="authenticationEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> authenticationEnabled;

    /**
     * @return Specifies whether user authentication with LDAP is enabled.
     * 
     */
    public Output<Boolean> authenticationEnabled() {
        return this.authenticationEnabled;
    }
    /**
     * Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
     * 
     */
    @Export(name="authorizationEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> authorizationEnabled;

    /**
     * @return Specifies whether user authorization with LDAP is enabled. You cannot enable user authorization with LDAP without first enabling user authentication with LDAP.
     * 
     */
    public Output<Boolean> authorizationEnabled() {
        return this.authorizationEnabled;
    }
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
     * The port to which the LDAP server listens for client connections. Default: `636`
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port to which the LDAP server listens for client connections. Default: `636`
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
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
     * Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldap_query` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
     * * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldap_query` template.
     * * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * 
     */
    @Export(name="userToDnMappings", refs={List.class,LdapConfigurationUserToDnMapping.class}, tree="[0,1]")
    private Output<List<LdapConfigurationUserToDnMapping>> userToDnMappings;

    /**
     * @return Maps an LDAP username for authentication to an LDAP Distinguished Name (DN). Each document contains a `match` regular expression and either a `substitution` or `ldap_query` template used to transform the LDAP username extracted from the regular expression. Atlas steps through the each document in the array in the given order, checking the authentication username against the `match` filter. If a match is found, Atlas applies the transformation and uses the output to authenticate the user. Atlas does not check the remaining documents in the array. For more details and examples see the [MongoDB Atlas API Reference](https://docs.atlas.mongodb.com/reference/api/ldaps-configuration-save/).
     * * `user_to_dn_mapping.0.match` - (Optional) A regular expression to match against a provided LDAP username. Each parenthesis-enclosed section represents a regular expression capture group used by the `substitution` or `ldap_query` template.
     * * `user_to_dn_mapping.0.substitution` - (Optional) An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name. Each bracket-enclosed numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * * `user_to_dn_mapping.0.ldap_query` - (Optional) An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516. Each numeric value is replaced by the corresponding regular expression capture group extracted from the LDAP username that matched the `match` regular expression.
     * 
     */
    public Output<List<LdapConfigurationUserToDnMapping>> userToDnMappings() {
        return this.userToDnMappings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LdapConfiguration(String name) {
        this(name, LdapConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LdapConfiguration(String name, LdapConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LdapConfiguration(String name, LdapConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/ldapConfiguration:LdapConfiguration", name, args == null ? LdapConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LdapConfiguration(String name, Output<String> id, @Nullable LdapConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/ldapConfiguration:LdapConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "bindPassword"
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
    public static LdapConfiguration get(String name, Output<String> id, @Nullable LdapConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LdapConfiguration(name, id, state, options);
    }
}
