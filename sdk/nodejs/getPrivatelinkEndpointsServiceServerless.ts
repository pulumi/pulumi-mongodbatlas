// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * **WARNING:** This data source is deprecated and will be removed in March 2025. For more datails see Migration Guide: Transition out of Serverless Instances and Shared-tier clusters
 *
 * `privatelinkEndpointsServiceServerless` describes the list of all Serverless PrivateLink Endpoint Service resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example with AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("test", {
 *     projectId: "<PROJECT_ID>",
 *     name: "test-db",
 *     providerSettingsBackingProviderName: "AWS",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST_1",
 *     continuousBackupEnabled: true,
 * });
 * const test = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AWS",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AWS",
 *     comment: "New serverless endpoint",
 * });
 * ```
 *
 * ## Example with AZURE
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("test", {
 *     projectId: "<PROJECT_ID>",
 *     name: "test-db",
 *     providerSettingsBackingProviderName: "AZURE",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST",
 *     continuousBackupEnabled: true,
 * });
 * const test = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AZURE",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AZURE",
 *     comment: "New serverless endpoint",
 * });
 * ```
 */
export function getPrivatelinkEndpointsServiceServerless(args: GetPrivatelinkEndpointsServiceServerlessArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivatelinkEndpointsServiceServerlessResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless", {
        "instanceName": args.instanceName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointsServiceServerless.
 */
export interface GetPrivatelinkEndpointsServiceServerlessArgs {
    /**
     * Human-readable label that identifies the serverless instance
     */
    instanceName: string;
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getPrivatelinkEndpointsServiceServerless.
 */
export interface GetPrivatelinkEndpointsServiceServerlessResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceName: string;
    readonly projectId: string;
    /**
     * Each element in the `result` array is one private serverless endpoint.
     */
    readonly results: outputs.GetPrivatelinkEndpointsServiceServerlessResult[];
}
/**
 * **WARNING:** This data source is deprecated and will be removed in March 2025. For more datails see Migration Guide: Transition out of Serverless Instances and Shared-tier clusters
 *
 * `privatelinkEndpointsServiceServerless` describes the list of all Serverless PrivateLink Endpoint Service resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example with AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("test", {
 *     projectId: "<PROJECT_ID>",
 *     name: "test-db",
 *     providerSettingsBackingProviderName: "AWS",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST_1",
 *     continuousBackupEnabled: true,
 * });
 * const test = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AWS",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AWS",
 *     comment: "New serverless endpoint",
 * });
 * ```
 *
 * ## Example with AZURE
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("test", {
 *     projectId: "<PROJECT_ID>",
 *     name: "test-db",
 *     providerSettingsBackingProviderName: "AZURE",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST",
 *     continuousBackupEnabled: true,
 * });
 * const test = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AZURE",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AZURE",
 *     comment: "New serverless endpoint",
 * });
 * ```
 */
export function getPrivatelinkEndpointsServiceServerlessOutput(args: GetPrivatelinkEndpointsServiceServerlessOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivatelinkEndpointsServiceServerlessResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless", {
        "instanceName": args.instanceName,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointsServiceServerless.
 */
export interface GetPrivatelinkEndpointsServiceServerlessOutputArgs {
    /**
     * Human-readable label that identifies the serverless instance
     */
    instanceName: pulumi.Input<string>;
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     */
    projectId: pulumi.Input<string>;
}
