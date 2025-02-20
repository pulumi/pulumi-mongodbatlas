// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Resource: mongodbatlas.StreamConnection
 *
 * `mongodbatlas.StreamConnection` provides a Stream Connection resource. The resource lets you create, edit, and delete stream instance connections.
 *
 * > **IMPORTANT:** All arguments including the Kafka authentication password will be stored in the raw state as plaintext. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * ### Example Cluster Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.StreamConnection("test", {
 *     projectId: projectId,
 *     instanceName: "InstanceName",
 *     connectionName: "ConnectionName",
 *     type: "Cluster",
 *     clusterName: "Cluster0",
 * });
 * ```
 *
 * ### Example Kafka Plaintext Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.StreamConnection("test", {
 *     projectId: projectId,
 *     instanceName: "NewInstance",
 *     connectionName: "KafkaConnection",
 *     type: "Kafka",
 *     authentication: {
 *         mechanism: "SCRAM-256",
 *         username: "user",
 *         password: "somepassword",
 *     },
 *     security: {
 *         protocol: "PLAINTEXT",
 *     },
 *     config: {
 *         "auto.offset.reset": "latest",
 *     },
 *     bootstrapServers: "localhost:9091,localhost:9092",
 * });
 * ```
 *
 * ## Import
 *
 * You can import a stream connection resource using the instance name, project ID, and connection name. The format must be `INSTANCE_NAME-PROJECT_ID-CONNECTION_NAME`. For example:
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/streamConnection:StreamConnection test "DefaultInstance-12251446ae5f3f6ec7968b13-NewConnection"
 * ```
 * To learn more, see: [MongoDB Atlas API - Stream Connection](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamConnection) Documentation.
 * The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.
 */
export class StreamConnection extends pulumi.CustomResource {
    /**
     * Get an existing StreamConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamConnectionState, opts?: pulumi.CustomResourceOptions): StreamConnection {
        return new StreamConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/streamConnection:StreamConnection';

    /**
     * Returns true if the given object is an instance of StreamConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamConnection.__pulumiType;
    }

    public readonly authentication!: pulumi.Output<outputs.StreamConnectionAuthentication | undefined>;
    public readonly bootstrapServers!: pulumi.Output<string | undefined>;
    public readonly clusterName!: pulumi.Output<string | undefined>;
    public readonly config!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     */
    public readonly connectionName!: pulumi.Output<string>;
    public readonly dbRoleToExecute!: pulumi.Output<outputs.StreamConnectionDbRoleToExecute | undefined>;
    /**
     * Human-readable label that identifies the stream instance.
     */
    public readonly instanceName!: pulumi.Output<string>;
    public readonly networking!: pulumi.Output<outputs.StreamConnectionNetworking>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    public readonly projectId!: pulumi.Output<string>;
    public readonly security!: pulumi.Output<outputs.StreamConnectionSecurity | undefined>;
    /**
     * Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a StreamConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamConnectionArgs | StreamConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamConnectionState | undefined;
            resourceInputs["authentication"] = state ? state.authentication : undefined;
            resourceInputs["bootstrapServers"] = state ? state.bootstrapServers : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["connectionName"] = state ? state.connectionName : undefined;
            resourceInputs["dbRoleToExecute"] = state ? state.dbRoleToExecute : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["networking"] = state ? state.networking : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["security"] = state ? state.security : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as StreamConnectionArgs | undefined;
            if ((!args || args.connectionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionName'");
            }
            if ((!args || args.instanceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["authentication"] = args ? args.authentication : undefined;
            resourceInputs["bootstrapServers"] = args ? args.bootstrapServers : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["connectionName"] = args ? args.connectionName : undefined;
            resourceInputs["dbRoleToExecute"] = args ? args.dbRoleToExecute : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["networking"] = args ? args.networking : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["security"] = args ? args.security : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StreamConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamConnection resources.
 */
export interface StreamConnectionState {
    authentication?: pulumi.Input<inputs.StreamConnectionAuthentication>;
    bootstrapServers?: pulumi.Input<string>;
    clusterName?: pulumi.Input<string>;
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     */
    connectionName?: pulumi.Input<string>;
    dbRoleToExecute?: pulumi.Input<inputs.StreamConnectionDbRoleToExecute>;
    /**
     * Human-readable label that identifies the stream instance.
     */
    instanceName?: pulumi.Input<string>;
    networking?: pulumi.Input<inputs.StreamConnectionNetworking>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId?: pulumi.Input<string>;
    security?: pulumi.Input<inputs.StreamConnectionSecurity>;
    /**
     * Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamConnection resource.
 */
export interface StreamConnectionArgs {
    authentication?: pulumi.Input<inputs.StreamConnectionAuthentication>;
    bootstrapServers?: pulumi.Input<string>;
    clusterName?: pulumi.Input<string>;
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     */
    connectionName: pulumi.Input<string>;
    dbRoleToExecute?: pulumi.Input<inputs.StreamConnectionDbRoleToExecute>;
    /**
     * Human-readable label that identifies the stream instance.
     */
    instanceName: pulumi.Input<string>;
    networking?: pulumi.Input<inputs.StreamConnectionNetworking>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: pulumi.Input<string>;
    security?: pulumi.Input<inputs.StreamConnectionSecurity>;
    /**
     * Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
     */
    type: pulumi.Input<string>;
}
