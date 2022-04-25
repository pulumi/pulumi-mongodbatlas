// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `privatelinkEndpointsServiceAdl` Describes the list of all Atlas Data Lake (ADL) and Online Archive PrivateLink endpoints resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 * ### Basic
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const adlTest = new mongodbatlas.PrivatelinkEndpointServiceAdl("adlTest", {
 *     projectId: "<PROJECT_ID>",
 *     endpointId: "<ENDPOINT_ID>",
 *     comment: "Comment for PrivateLink endpoint ADL",
 *     type: "DATA_LAKE",
 *     providerName: "AWS",
 * });
 * const test = mongodbatlas.getPrivatelinkEndpointsServiceAdlOutput({
 *     projectId: adlTest.projectId,
 * });
 * ```
 */
export function getPrivatelinkEndpointsServiceAdl(args: GetPrivatelinkEndpointsServiceAdlArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivatelinkEndpointsServiceAdlResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("mongodbatlas:index/getPrivatelinkEndpointsServiceAdl:getPrivatelinkEndpointsServiceAdl", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointsServiceAdl.
 */
export interface GetPrivatelinkEndpointsServiceAdlArgs {
    /**
     * The unique ID for the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getPrivatelinkEndpointsServiceAdl.
 */
export interface GetPrivatelinkEndpointsServiceAdlResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly links: outputs.GetPrivatelinkEndpointsServiceAdlLink[];
    readonly projectId: string;
    readonly results: outputs.GetPrivatelinkEndpointsServiceAdlResult[];
    readonly totalCount: number;
}

export function getPrivatelinkEndpointsServiceAdlOutput(args: GetPrivatelinkEndpointsServiceAdlOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivatelinkEndpointsServiceAdlResult> {
    return pulumi.output(args).apply(a => getPrivatelinkEndpointsServiceAdl(a, opts))
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointsServiceAdl.
 */
export interface GetPrivatelinkEndpointsServiceAdlOutputArgs {
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}