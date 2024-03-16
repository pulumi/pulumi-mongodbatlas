// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `privatelinkEndpointsServiceServerless` Describes the list of all Serverless PrivateLink Endpoint Service resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example with AWS
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("testServerlessInstance", {
 *     projectId: "<PROJECT_ID>",
 *     providerSettingsBackingProviderName: "AWS",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST_1",
 *     continuousBackupEnabled: true,
 * });
 * const testPrivatelinkEndpointsServiceServerless = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AWS",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AWS",
 *     comment: "New serverless endpoint",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Example with AZURE
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("testServerlessInstance", {
 *     projectId: "<PROJECT_ID>",
 *     providerSettingsBackingProviderName: "AZURE",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST",
 *     continuousBackupEnabled: true,
 * });
 * const testPrivatelinkEndpointsServiceServerless = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AZURE",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AZURE",
 *     comment: "New serverless endpoint",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrivatelinkEndpointsServiceServerless(args: GetPrivatelinkEndpointsServiceServerlessArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivatelinkEndpointsServiceServerlessResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless", {
        "instanceName": args.instanceName,
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
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
     * @deprecated this parameter is deprecated and will be removed in version 1.17.0
     */
    itemsPerPage?: number;
    /**
     * @deprecated this parameter is deprecated and will be removed in version 1.17.0
     */
    pageNum?: number;
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
    /**
     * @deprecated this parameter is deprecated and will be removed in version 1.17.0
     */
    readonly itemsPerPage?: number;
    /**
     * @deprecated this parameter is deprecated and will be removed in version 1.17.0
     */
    readonly pageNum?: number;
    readonly projectId: string;
    /**
     * Each element in the `result` array is one private serverless endpoint.
     */
    readonly results: outputs.GetPrivatelinkEndpointsServiceServerlessResult[];
}
/**
 * `privatelinkEndpointsServiceServerless` Describes the list of all Serverless PrivateLink Endpoint Service resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example with AWS
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("testServerlessInstance", {
 *     projectId: "<PROJECT_ID>",
 *     providerSettingsBackingProviderName: "AWS",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST_1",
 *     continuousBackupEnabled: true,
 * });
 * const testPrivatelinkEndpointsServiceServerless = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AWS",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AWS",
 *     comment: "New serverless endpoint",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Example with AZURE
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("testServerlessInstance", {
 *     projectId: "<PROJECT_ID>",
 *     providerSettingsBackingProviderName: "AZURE",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST",
 *     continuousBackupEnabled: true,
 * });
 * const testPrivatelinkEndpointsServiceServerless = mongodbatlas.getPrivatelinkEndpointsServiceServerlessOutput({
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 * });
 * const testPrivatelinkEndpointServerless = new mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AZURE",
 * });
 * const testPrivatelinkEndpointServiceServerless = new mongodbatlas.PrivatelinkEndpointServiceServerless("testPrivatelinkEndpointServiceServerless", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: "test-db",
 *     endpointId: testPrivatelinkEndpointServerless.endpointId,
 *     providerName: "AZURE",
 *     comment: "New serverless endpoint",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrivatelinkEndpointsServiceServerlessOutput(args: GetPrivatelinkEndpointsServiceServerlessOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivatelinkEndpointsServiceServerlessResult> {
    return pulumi.output(args).apply((a: any) => getPrivatelinkEndpointsServiceServerless(a, opts))
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
     * @deprecated this parameter is deprecated and will be removed in version 1.17.0
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * @deprecated this parameter is deprecated and will be removed in version 1.17.0
     */
    pageNum?: pulumi.Input<number>;
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     */
    projectId: pulumi.Input<string>;
}
