// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.StreamProcessorArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.StreamProcessorState;
import com.pulumi.mongodbatlas.outputs.StreamProcessorOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.mongodbatlas.StreamInstance;
 * import com.pulumi.mongodbatlas.StreamInstanceArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamInstanceDataProcessRegionArgs;
 * import com.pulumi.mongodbatlas.StreamConnection;
 * import com.pulumi.mongodbatlas.StreamConnectionArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamConnectionDbRoleToExecuteArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamConnectionAuthenticationArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamConnectionSecurityArgs;
 * import com.pulumi.mongodbatlas.StreamProcessor;
 * import com.pulumi.mongodbatlas.StreamProcessorArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamProcessorOptionsArgs;
 * import com.pulumi.mongodbatlas.inputs.StreamProcessorOptionsDlqArgs;
 * import com.pulumi.mongodbatlas.MongodbatlasFunctions;
 * import com.pulumi.mongodbatlas.inputs.GetStreamProcessorsArgs;
 * import com.pulumi.mongodbatlas.inputs.GetStreamProcessorArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new StreamInstance("example", StreamInstanceArgs.builder()
 *             .projectId(projectId)
 *             .instanceName("InstanceName")
 *             .dataProcessRegion(StreamInstanceDataProcessRegionArgs.builder()
 *                 .region("VIRGINIA_USA")
 *                 .cloud_provider("AWS")
 *                 .build())
 *             .build());
 * 
 *         var example_sample = new StreamConnection("example-sample", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .connectionName("sample_stream_solar")
 *             .type("Sample")
 *             .build());
 * 
 *         var example_cluster = new StreamConnection("example-cluster", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .connectionName("ClusterConnection")
 *             .type("Cluster")
 *             .clusterName(clusterName)
 *             .dbRoleToExecute(StreamConnectionDbRoleToExecuteArgs.builder()
 *                 .role("atlasAdmin")
 *                 .type("BUILT_IN")
 *                 .build())
 *             .build());
 * 
 *         var example_kafka = new StreamConnection("example-kafka", StreamConnectionArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .connectionName("KafkaPlaintextConnection")
 *             .type("Kafka")
 *             .authentication(StreamConnectionAuthenticationArgs.builder()
 *                 .mechanism("PLAIN")
 *                 .username(kafkaUsername)
 *                 .password(kafkaPassword)
 *                 .build())
 *             .bootstrapServers("localhost:9092,localhost:9092")
 *             .config(Map.of("auto.offset.reset", "earliest"))
 *             .security(StreamConnectionSecurityArgs.builder()
 *                 .protocol("PLAINTEXT")
 *                 .build())
 *             .build());
 * 
 *         var stream_processor_sample_example = new StreamProcessor("stream-processor-sample-example", StreamProcessorArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .processorName("sampleProcessorName")
 *             .pipeline(serializeJson(
 *                 jsonArray(
 *                     jsonObject(
 *                         jsonProperty("$source", jsonObject(
 *                             jsonProperty("connectionName", mongodbatlasStreamConnection.example-sample().connectionName())
 *                         ))
 *                     ), 
 *                     jsonObject(
 *                         jsonProperty("$emit", jsonObject(
 *                             jsonProperty("connectionName", mongodbatlasStreamConnection.example-cluster().connectionName()),
 *                             jsonProperty("db", "sample"),
 *                             jsonProperty("coll", "solar"),
 *                             jsonProperty("timeseries", jsonObject(
 *                                 jsonProperty("timeField", "_ts")
 *                             ))
 *                         ))
 *                     )
 *                 )))
 *             .state("STARTED")
 *             .build());
 * 
 *         var stream_processor_cluster_to_kafka_example = new StreamProcessor("stream-processor-cluster-to-kafka-example", StreamProcessorArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .processorName("clusterProcessorName")
 *             .pipeline(serializeJson(
 *                 jsonArray(
 *                     jsonObject(
 *                         jsonProperty("$source", jsonObject(
 *                             jsonProperty("connectionName", mongodbatlasStreamConnection.example-cluster().connectionName())
 *                         ))
 *                     ), 
 *                     jsonObject(
 *                         jsonProperty("$emit", jsonObject(
 *                             jsonProperty("connectionName", mongodbatlasStreamConnection.example-kafka().connectionName()),
 *                             jsonProperty("topic", "topic_from_cluster")
 *                         ))
 *                     )
 *                 )))
 *             .state("CREATED")
 *             .build());
 * 
 *         var stream_processor_kafka_to_cluster_example = new StreamProcessor("stream-processor-kafka-to-cluster-example", StreamProcessorArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .processorName("kafkaProcessorName")
 *             .pipeline(serializeJson(
 *                 jsonArray(
 *                     jsonObject(
 *                         jsonProperty("$source", jsonObject(
 *                             jsonProperty("connectionName", mongodbatlasStreamConnection.example-kafka().connectionName()),
 *                             jsonProperty("topic", "topic_source")
 *                         ))
 *                     ), 
 *                     jsonObject(
 *                         jsonProperty("$emit", jsonObject(
 *                             jsonProperty("connectionName", mongodbatlasStreamConnection.example-cluster().connectionName()),
 *                             jsonProperty("db", "kafka"),
 *                             jsonProperty("coll", "topic_source"),
 *                             jsonProperty("timeseries", jsonObject(
 *                                 jsonProperty("timeField", "ts")
 *                             ))
 *                         ))
 *                     )
 *                 )))
 *             .state("CREATED")
 *             .options(StreamProcessorOptionsArgs.builder()
 *                 .dlq(StreamProcessorOptionsDlqArgs.builder()
 *                     .coll("exampleColumn")
 *                     .connectionName(mongodbatlasStreamConnection.example-cluster().connectionName())
 *                     .db("exampleDb")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var example-stream-processors = MongodbatlasFunctions.getStreamProcessors(GetStreamProcessorsArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .build());
 * 
 *         final var example-stream-processor = MongodbatlasFunctions.getStreamProcessor(GetStreamProcessorArgs.builder()
 *             .projectId(projectId)
 *             .instanceName(example.instanceName())
 *             .processorName(stream_processor_sample_example.processorName())
 *             .build());
 * 
 *         ctx.export("streamProcessorsState", example_stream_processor.applyValue(example_stream_processor -> example_stream_processor.state()));
 *         ctx.export("streamProcessorsResults", example_stream_processors.applyValue(example_stream_processors -> example_stream_processors.results()));
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Stream Processor resource can be imported using the Project ID, Stream Instance name and Stream Processor name, in the format `INSTANCE_NAME-PROJECT_ID-PROCESSOR_NAME`, e.g.
 * 
 * For more information see: [MongoDB Atlas API - Stream Processor](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Streams/operation/createStreamProcessor) Documentation.
 * 
 */
@ResourceType(type="mongodbatlas:index/streamProcessor:StreamProcessor")
public class StreamProcessor extends com.pulumi.resources.CustomResource {
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
     * Optional configuration for the stream processor.
     * 
     */
    @Export(name="options", refs={StreamProcessorOptions.class}, tree="[0]")
    private Output</* @Nullable */ StreamProcessorOptions> options;

    /**
     * @return Optional configuration for the stream processor.
     * 
     */
    public Output<Optional<StreamProcessorOptions>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
     * 
     */
    @Export(name="pipeline", refs={String.class}, tree="[0]")
    private Output<String> pipeline;

    /**
     * @return Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
     * 
     */
    public Output<String> pipeline() {
        return this.pipeline;
    }
    /**
     * Human-readable label that identifies the stream processor.
     * 
     */
    @Export(name="processorName", refs={String.class}, tree="[0]")
    private Output<String> processorName;

    /**
     * @return Human-readable label that identifies the stream processor.
     * 
     */
    public Output<String> processorName() {
        return this.processorName;
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
     * The state of the stream processor. Commonly occurring states are &#39;CREATED&#39;, &#39;STARTED&#39;, &#39;STOPPED&#39; and &#39;FAILED&#39;. Used to
     * start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
     * created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
     * setting the state to STARTED can automatically start the stream processor.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the stream processor. Commonly occurring states are &#39;CREATED&#39;, &#39;STARTED&#39;, &#39;STOPPED&#39; and &#39;FAILED&#39;. Used to
     * start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
     * created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
     * setting the state to STARTED can automatically start the stream processor.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The stats associated with the stream processor. Refer to the [MongoDB Atlas
     * Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
     * for more information.
     * 
     */
    @Export(name="stats", refs={String.class}, tree="[0]")
    private Output<String> stats;

    /**
     * @return The stats associated with the stream processor. Refer to the [MongoDB Atlas
     * Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
     * for more information.
     * 
     */
    public Output<String> stats() {
        return this.stats;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamProcessor(java.lang.String name) {
        this(name, StreamProcessorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamProcessor(java.lang.String name, StreamProcessorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamProcessor(java.lang.String name, StreamProcessorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamProcessor:StreamProcessor", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamProcessor(java.lang.String name, Output<java.lang.String> id, @Nullable StreamProcessorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamProcessor:StreamProcessor", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamProcessorArgs makeArgs(StreamProcessorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamProcessorArgs.Empty : args;
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
    public static StreamProcessor get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamProcessorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamProcessor(name, id, state, options);
    }
}
