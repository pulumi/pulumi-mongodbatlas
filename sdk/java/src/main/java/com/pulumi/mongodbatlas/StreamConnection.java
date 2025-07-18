// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.StreamConnectionArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.StreamConnectionState;
import com.pulumi.mongodbatlas.outputs.StreamConnectionAuthentication;
import com.pulumi.mongodbatlas.outputs.StreamConnectionAws;
import com.pulumi.mongodbatlas.outputs.StreamConnectionDbRoleToExecute;
import com.pulumi.mongodbatlas.outputs.StreamConnectionNetworking;
import com.pulumi.mongodbatlas.outputs.StreamConnectionSecurity;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.StreamConnection
 * 
 * `mongodbatlas.StreamConnection` provides a Stream Connection resource. The resource lets you create, edit, and delete stream instance connections.
 * 
 * &gt; **IMPORTANT:** All arguments including the Kafka authentication password will be stored in the raw state as plaintext. Read more about sensitive data in state.
 * 
 * ## Example Usage
 * 
 * ### Example Cluster Connection
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.StreamConnection;
 * import com.pulumi.mongodbatlas.StreamConnectionArgs;
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
 *         var test = new StreamConnection("test", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName("InstanceName")
 *             .connectionName("ConnectionName")
 *             .type("Cluster")
 *             .clusterName("Cluster0")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Cross Project Cluster Connection
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.StreamConnection;
 * import com.pulumi.mongodbatlas.StreamConnectionArgs;
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
 *         var test = new StreamConnection("test", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName("InstanceName")
 *             .connectionName("ConnectionName")
 *             .type("Cluster")
 *             .clusterName("OtherCluster")
 *             .clusterProjectId(otherProjectId)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Kafka SASL Plaintext Connection
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.StreamConnection;
 * import com.pulumi.mongodbatlas.StreamConnectionArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamConnectionAuthenticationArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamConnectionSecurityArgs;
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
 *         var test = new StreamConnection("test", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName("NewInstance")
 *             .connectionName("KafkaConnection")
 *             .type("Kafka")
 *             .authentication(StreamConnectionAuthenticationArgs.builder()
 *                 .mechanism("SCRAM-256")
 *                 .username("user")
 *                 .password("somepassword")
 *                 .build())
 *             .security(StreamConnectionSecurityArgs.builder()
 *                 .protocol("SASL_PLAINTEXT")
 *                 .build())
 *             .config(Map.of("auto.offset.reset", "latest"))
 *             .bootstrapServers("localhost:9091,localhost:9092")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Kafka SASL SSL Connection
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example AWSLambda Connection
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Https Connection
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.StreamConnection;
 * import com.pulumi.mongodbatlas.StreamConnectionArgs;
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
 *         var example_https = new StreamConnection("example-https", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .connectionName("https_connection_tf_new")
 *             .type("Https")
 *             .url("https://example.com")
 *             .headers(Map.ofEntries(
 *                 Map.entry("key1", "value1"),
 *                 Map.entry("key2", "value2")
 *             ))
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
 * You can import a stream connection resource using the instance name, project ID, and connection name. The format must be `INSTANCE_NAME-PROJECT_ID-CONNECTION_NAME`. For example:
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/streamConnection:StreamConnection test &#34;DefaultInstance-12251446ae5f3f6ec7968b13-NewConnection&#34;
 * ```
 * To learn more, see: [MongoDB Atlas API - Stream Connection](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamConnection) Documentation.
 * The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.
 * 
 */
@ResourceType(type="mongodbatlas:index/streamConnection:StreamConnection")
public class StreamConnection extends com.pulumi.resources.CustomResource {
    @Export(name="authentication", refs={StreamConnectionAuthentication.class}, tree="[0]")
    private Output</* @Nullable */ StreamConnectionAuthentication> authentication;

    public Output<Optional<StreamConnectionAuthentication>> authentication() {
        return Codegen.optional(this.authentication);
    }
    @Export(name="aws", refs={StreamConnectionAws.class}, tree="[0]")
    private Output</* @Nullable */ StreamConnectionAws> aws;

    public Output<Optional<StreamConnectionAws>> aws() {
        return Codegen.optional(this.aws);
    }
    @Export(name="bootstrapServers", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bootstrapServers;

    public Output<Optional<String>> bootstrapServers() {
        return Codegen.optional(this.bootstrapServers);
    }
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterName;

    public Output<Optional<String>> clusterName() {
        return Codegen.optional(this.clusterName);
    }
    @Export(name="clusterProjectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterProjectId;

    public Output<Optional<String>> clusterProjectId() {
        return Codegen.optional(this.clusterProjectId);
    }
    @Export(name="config", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> config;

    public Output<Optional<Map<String,String>>> config() {
        return Codegen.optional(this.config);
    }
    /**
     * Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     * 
     */
    @Export(name="connectionName", refs={String.class}, tree="[0]")
    private Output<String> connectionName;

    /**
     * @return Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }
    @Export(name="dbRoleToExecute", refs={StreamConnectionDbRoleToExecute.class}, tree="[0]")
    private Output</* @Nullable */ StreamConnectionDbRoleToExecute> dbRoleToExecute;

    public Output<Optional<StreamConnectionDbRoleToExecute>> dbRoleToExecute() {
        return Codegen.optional(this.dbRoleToExecute);
    }
    @Export(name="headers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> headers;

    public Output<Optional<Map<String,String>>> headers() {
        return Codegen.optional(this.headers);
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
    @Export(name="networking", refs={StreamConnectionNetworking.class}, tree="[0]")
    private Output<StreamConnectionNetworking> networking;

    public Output<StreamConnectionNetworking> networking() {
        return this.networking;
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
    @Export(name="security", refs={StreamConnectionSecurity.class}, tree="[0]")
    private Output</* @Nullable */ StreamConnectionSecurity> security;

    public Output<Optional<StreamConnectionSecurity>> security() {
        return Codegen.optional(this.security);
    }
    /**
     * Type of connection. Can be `AWSLambda`, `Cluster`, `Https`, `Kafka` or `Sample`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of connection. Can be `AWSLambda`, `Cluster`, `Https`, `Kafka` or `Sample`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> url;

    public Output<Optional<String>> url() {
        return Codegen.optional(this.url);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamConnection(java.lang.String name) {
        this(name, StreamConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamConnection(java.lang.String name, StreamConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamConnection(java.lang.String name, StreamConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamConnection:StreamConnection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamConnection(java.lang.String name, Output<java.lang.String> id, @Nullable StreamConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamConnection:StreamConnection", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamConnectionArgs makeArgs(StreamConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamConnectionArgs.Empty : args;
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
    public static StreamConnection get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamConnection(name, id, state, options);
    }
}
