// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.StreamPrivatelinkEndpoint
 *
 * `mongodbatlas.StreamPrivatelinkEndpoint` describes a Privatelink Endpoint for Streams.
 *
 * ## Example Usage
 */
export function getStreamPrivatelinkEndpoint(args: GetStreamPrivatelinkEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamPrivatelinkEndpointResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getStreamPrivatelinkEndpoint:getStreamPrivatelinkEndpoint", {
        "id": args.id,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamPrivatelinkEndpoint.
 */
export interface GetStreamPrivatelinkEndpointArgs {
    /**
     * The ID of the Private Link connection.
     */
    id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: string;
}

/**
 * A collection of values returned by getStreamPrivatelinkEndpoint.
 */
export interface GetStreamPrivatelinkEndpointResult {
    readonly dnsDomain: string;
    readonly dnsSubDomains: string[];
    /**
     * The ID of the Private Link connection.
     */
    readonly id: string;
    readonly interfaceEndpointId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    readonly projectId: string;
    readonly providerName: string;
    readonly region: string;
    readonly serviceEndpointId: string;
    readonly state: string;
    readonly vendor: string;
}
/**
 * ## # Data Source: mongodbatlas.StreamPrivatelinkEndpoint
 *
 * `mongodbatlas.StreamPrivatelinkEndpoint` describes a Privatelink Endpoint for Streams.
 *
 * ## Example Usage
 */
export function getStreamPrivatelinkEndpointOutput(args: GetStreamPrivatelinkEndpointOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStreamPrivatelinkEndpointResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getStreamPrivatelinkEndpoint:getStreamPrivatelinkEndpoint", {
        "id": args.id,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamPrivatelinkEndpoint.
 */
export interface GetStreamPrivatelinkEndpointOutputArgs {
    /**
     * The ID of the Private Link connection.
     */
    id: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: pulumi.Input<string>;
}