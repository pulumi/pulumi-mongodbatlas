// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.PrivateLinkEndpointService` describe a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 */
export function getPrivateLinkEndpointService(args: GetPrivateLinkEndpointServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivateLinkEndpointServiceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getPrivateLinkEndpointService:getPrivateLinkEndpointService", {
        "endpointServiceId": args.endpointServiceId,
        "privateLinkId": args.privateLinkId,
        "projectId": args.projectId,
        "providerName": args.providerName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivateLinkEndpointService.
 */
export interface GetPrivateLinkEndpointServiceArgs {
    /**
     * Unique identifier of the `AWS` or `AZURE` resource.
     */
    endpointServiceId: string;
    /**
     * Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
     */
    privateLinkId: string;
    /**
     * Unique identifier for the project.
     */
    projectId: string;
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
     */
    providerName: string;
}

/**
 * A collection of values returned by getPrivateLinkEndpointService.
 */
export interface GetPrivateLinkEndpointServiceResult {
    /**
     * Status of the interface endpoint for AWS.
     * Returns one of the following values:
     */
    readonly awsConnectionStatus: string;
    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     */
    readonly azureStatus: string;
    /**
     * Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     */
    readonly deleteRequested: boolean;
    readonly endpointServiceId: string;
    /**
     * Collection of individual private endpoints that comprise your network endpoint group.
     */
    readonly endpoints: outputs.GetPrivateLinkEndpointServiceEndpoint[];
    /**
     * Error message pertaining to the interface endpoint. Returns null if there are no errors.
     */
    readonly errorMessage: string;
    /**
     * Status of the interface endpoint for GCP.
     * Returns one of the following values:
     */
    readonly gcpStatus: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the interface endpoint.
     */
    readonly interfaceEndpointId: string;
    /**
     * Name of the connection for this private endpoint that Atlas generates.
     */
    readonly privateEndpointConnectionName: string;
    /**
     * Private IP address of the private endpoint network interface.
     */
    readonly privateEndpointIpAddress: string;
    /**
     * Unique identifier of the private endpoint.
     */
    readonly privateEndpointResourceId: string;
    readonly privateLinkId: string;
    readonly projectId: string;
    readonly providerName: string;
}
/**
 * `mongodbatlas.PrivateLinkEndpointService` describe a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 */
export function getPrivateLinkEndpointServiceOutput(args: GetPrivateLinkEndpointServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivateLinkEndpointServiceResult> {
    return pulumi.output(args).apply((a: any) => getPrivateLinkEndpointService(a, opts))
}

/**
 * A collection of arguments for invoking getPrivateLinkEndpointService.
 */
export interface GetPrivateLinkEndpointServiceOutputArgs {
    /**
     * Unique identifier of the `AWS` or `AZURE` resource.
     */
    endpointServiceId: pulumi.Input<string>;
    /**
     * Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
     */
    privateLinkId: pulumi.Input<string>;
    /**
     * Unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE`.
     */
    providerName: pulumi.Input<string>;
}
