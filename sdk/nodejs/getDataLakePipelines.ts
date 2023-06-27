// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getDataLakePipelines` describes Data Lake Pipelines.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 */
export function getDataLakePipelines(args: GetDataLakePipelinesArgs, opts?: pulumi.InvokeOptions): Promise<GetDataLakePipelinesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getDataLakePipelines:getDataLakePipelines", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDataLakePipelines.
 */
export interface GetDataLakePipelinesArgs {
    /**
     * The unique ID for the project to create a data lake pipeline.
     */
    projectId: string;
}

/**
 * A collection of values returned by getDataLakePipelines.
 */
export interface GetDataLakePipelinesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    readonly projectId: string;
    /**
     * A list where each represents a Data Lake Pipeline.
     */
    readonly results: outputs.GetDataLakePipelinesResult[];
}
/**
 * `mongodbatlas.getDataLakePipelines` describes Data Lake Pipelines.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 */
export function getDataLakePipelinesOutput(args: GetDataLakePipelinesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDataLakePipelinesResult> {
    return pulumi.output(args).apply((a: any) => getDataLakePipelines(a, opts))
}

/**
 * A collection of arguments for invoking getDataLakePipelines.
 */
export interface GetDataLakePipelinesOutputArgs {
    /**
     * The unique ID for the project to create a data lake pipeline.
     */
    projectId: pulumi.Input<string>;
}
