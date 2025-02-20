// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.StreamProcessor
 *
 * `mongodbatlas.StreamProcessor` describes a stream processor.
 *
 * ## Example Usage
 *
 * ### S
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const example = new mongodbatlas.StreamInstance("example", {
 *     projectId: projectId,
 *     instanceName: "InstanceName",
 *     dataProcessRegion: {
 *         region: "VIRGINIA_USA",
 *         cloudProvider: "AWS",
 *     },
 * });
 * const example_sample = new mongodbatlas.StreamConnection("example-sample", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     connectionName: "sample_stream_solar",
 *     type: "Sample",
 * });
 * const example_cluster = new mongodbatlas.StreamConnection("example-cluster", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     connectionName: "ClusterConnection",
 *     type: "Cluster",
 *     clusterName: clusterName,
 *     dbRoleToExecute: {
 *         role: "atlasAdmin",
 *         type: "BUILT_IN",
 *     },
 * });
 * const example_kafka = new mongodbatlas.StreamConnection("example-kafka", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     connectionName: "KafkaPlaintextConnection",
 *     type: "Kafka",
 *     authentication: {
 *         mechanism: "PLAIN",
 *         username: kafkaUsername,
 *         password: kafkaPassword,
 *     },
 *     bootstrapServers: "localhost:9092,localhost:9092",
 *     config: {
 *         "auto.offset.reset": "earliest",
 *     },
 *     security: {
 *         protocol: "PLAINTEXT",
 *     },
 * });
 * const stream_processor_sample_example = new mongodbatlas.StreamProcessor("stream-processor-sample-example", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     processorName: "sampleProcessorName",
 *     pipeline: JSON.stringify([
 *         {
 *             $source: {
 *                 connectionName: mongodbatlasStreamConnection["example-sample"].connectionName,
 *             },
 *         },
 *         {
 *             $emit: {
 *                 connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *                 db: "sample",
 *                 coll: "solar",
 *                 timeseries: {
 *                     timeField: "_ts",
 *                 },
 *             },
 *         },
 *     ]),
 *     state: "STARTED",
 * });
 * const stream_processor_cluster_to_kafka_example = new mongodbatlas.StreamProcessor("stream-processor-cluster-to-kafka-example", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     processorName: "clusterProcessorName",
 *     pipeline: JSON.stringify([
 *         {
 *             $source: {
 *                 connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *             },
 *         },
 *         {
 *             $emit: {
 *                 connectionName: mongodbatlasStreamConnection["example-kafka"].connectionName,
 *                 topic: "topic_from_cluster",
 *             },
 *         },
 *     ]),
 *     state: "CREATED",
 * });
 * const stream_processor_kafka_to_cluster_example = new mongodbatlas.StreamProcessor("stream-processor-kafka-to-cluster-example", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     processorName: "kafkaProcessorName",
 *     pipeline: JSON.stringify([
 *         {
 *             $source: {
 *                 connectionName: mongodbatlasStreamConnection["example-kafka"].connectionName,
 *                 topic: "topic_source",
 *             },
 *         },
 *         {
 *             $emit: {
 *                 connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *                 db: "kafka",
 *                 coll: "topic_source",
 *                 timeseries: {
 *                     timeField: "ts",
 *                 },
 *             },
 *         },
 *     ]),
 *     state: "CREATED",
 *     options: {
 *         dlq: {
 *             coll: "exampleColumn",
 *             connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *             db: "exampleDb",
 *         },
 *     },
 * });
 * const example_stream_processors = example.instanceName.apply(instanceName => mongodbatlas.getStreamProcessorsOutput({
 *     projectId: projectId,
 *     instanceName: instanceName,
 * }));
 * const example_stream_processor = pulumi.all([example.instanceName, stream_processor_sample_example.processorName]).apply(([instanceName, processorName]) => mongodbatlas.getStreamProcessorOutput({
 *     projectId: projectId,
 *     instanceName: instanceName,
 *     processorName: processorName,
 * }));
 * export const streamProcessorsState = example_stream_processor.apply(example_stream_processor => example_stream_processor.state);
 * export const streamProcessorsResults = example_stream_processors.apply(example_stream_processors => example_stream_processors.results);
 * ```
 */
export function getStreamProcessor(args: GetStreamProcessorArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamProcessorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getStreamProcessor:getStreamProcessor", {
        "instanceName": args.instanceName,
        "processorName": args.processorName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamProcessor.
 */
export interface GetStreamProcessorArgs {
    /**
     * Human-readable label that identifies the stream instance.
     */
    instanceName: string;
    /**
     * Human-readable label that identifies the stream processor.
     */
    processorName: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: string;
}

/**
 * A collection of values returned by getStreamProcessor.
 */
export interface GetStreamProcessorResult {
    readonly id: string;
    /**
     * Human-readable label that identifies the stream instance.
     */
    readonly instanceName: string;
    readonly options: outputs.GetStreamProcessorOptions;
    readonly pipeline: string;
    /**
     * Human-readable label that identifies the stream processor.
     */
    readonly processorName: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    readonly projectId: string;
    readonly state: string;
    readonly stats: string;
}
/**
 * ## # Data Source: mongodbatlas.StreamProcessor
 *
 * `mongodbatlas.StreamProcessor` describes a stream processor.
 *
 * ## Example Usage
 *
 * ### S
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const example = new mongodbatlas.StreamInstance("example", {
 *     projectId: projectId,
 *     instanceName: "InstanceName",
 *     dataProcessRegion: {
 *         region: "VIRGINIA_USA",
 *         cloudProvider: "AWS",
 *     },
 * });
 * const example_sample = new mongodbatlas.StreamConnection("example-sample", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     connectionName: "sample_stream_solar",
 *     type: "Sample",
 * });
 * const example_cluster = new mongodbatlas.StreamConnection("example-cluster", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     connectionName: "ClusterConnection",
 *     type: "Cluster",
 *     clusterName: clusterName,
 *     dbRoleToExecute: {
 *         role: "atlasAdmin",
 *         type: "BUILT_IN",
 *     },
 * });
 * const example_kafka = new mongodbatlas.StreamConnection("example-kafka", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     connectionName: "KafkaPlaintextConnection",
 *     type: "Kafka",
 *     authentication: {
 *         mechanism: "PLAIN",
 *         username: kafkaUsername,
 *         password: kafkaPassword,
 *     },
 *     bootstrapServers: "localhost:9092,localhost:9092",
 *     config: {
 *         "auto.offset.reset": "earliest",
 *     },
 *     security: {
 *         protocol: "PLAINTEXT",
 *     },
 * });
 * const stream_processor_sample_example = new mongodbatlas.StreamProcessor("stream-processor-sample-example", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     processorName: "sampleProcessorName",
 *     pipeline: JSON.stringify([
 *         {
 *             $source: {
 *                 connectionName: mongodbatlasStreamConnection["example-sample"].connectionName,
 *             },
 *         },
 *         {
 *             $emit: {
 *                 connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *                 db: "sample",
 *                 coll: "solar",
 *                 timeseries: {
 *                     timeField: "_ts",
 *                 },
 *             },
 *         },
 *     ]),
 *     state: "STARTED",
 * });
 * const stream_processor_cluster_to_kafka_example = new mongodbatlas.StreamProcessor("stream-processor-cluster-to-kafka-example", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     processorName: "clusterProcessorName",
 *     pipeline: JSON.stringify([
 *         {
 *             $source: {
 *                 connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *             },
 *         },
 *         {
 *             $emit: {
 *                 connectionName: mongodbatlasStreamConnection["example-kafka"].connectionName,
 *                 topic: "topic_from_cluster",
 *             },
 *         },
 *     ]),
 *     state: "CREATED",
 * });
 * const stream_processor_kafka_to_cluster_example = new mongodbatlas.StreamProcessor("stream-processor-kafka-to-cluster-example", {
 *     projectId: projectId,
 *     instanceName: example.instanceName,
 *     processorName: "kafkaProcessorName",
 *     pipeline: JSON.stringify([
 *         {
 *             $source: {
 *                 connectionName: mongodbatlasStreamConnection["example-kafka"].connectionName,
 *                 topic: "topic_source",
 *             },
 *         },
 *         {
 *             $emit: {
 *                 connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *                 db: "kafka",
 *                 coll: "topic_source",
 *                 timeseries: {
 *                     timeField: "ts",
 *                 },
 *             },
 *         },
 *     ]),
 *     state: "CREATED",
 *     options: {
 *         dlq: {
 *             coll: "exampleColumn",
 *             connectionName: mongodbatlasStreamConnection["example-cluster"].connectionName,
 *             db: "exampleDb",
 *         },
 *     },
 * });
 * const example_stream_processors = example.instanceName.apply(instanceName => mongodbatlas.getStreamProcessorsOutput({
 *     projectId: projectId,
 *     instanceName: instanceName,
 * }));
 * const example_stream_processor = pulumi.all([example.instanceName, stream_processor_sample_example.processorName]).apply(([instanceName, processorName]) => mongodbatlas.getStreamProcessorOutput({
 *     projectId: projectId,
 *     instanceName: instanceName,
 *     processorName: processorName,
 * }));
 * export const streamProcessorsState = example_stream_processor.apply(example_stream_processor => example_stream_processor.state);
 * export const streamProcessorsResults = example_stream_processors.apply(example_stream_processors => example_stream_processors.results);
 * ```
 */
export function getStreamProcessorOutput(args: GetStreamProcessorOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStreamProcessorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getStreamProcessor:getStreamProcessor", {
        "instanceName": args.instanceName,
        "processorName": args.processorName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamProcessor.
 */
export interface GetStreamProcessorOutputArgs {
    /**
     * Human-readable label that identifies the stream instance.
     */
    instanceName: pulumi.Input<string>;
    /**
     * Human-readable label that identifies the stream processor.
     */
    processorName: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: pulumi.Input<string>;
}
