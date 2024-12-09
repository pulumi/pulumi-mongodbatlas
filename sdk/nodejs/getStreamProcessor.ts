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
