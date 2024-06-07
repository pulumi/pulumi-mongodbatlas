// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getThirdPartyIntegrations` describe all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `DATADOG`
 * applied across the project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testPagerDuty = new mongodbatlas.ThirdPartyIntegration("test_pager_duty", {
 *     projectId: "<PROJECT-ID>",
 *     type: "PAGER_DUTY",
 *     serviceKey: "<PAGER-DUTY-SERVICE-KEY>",
 * });
 * const testDatadog = new mongodbatlas.ThirdPartyIntegration("test_datadog", {
 *     projectId: "<PROJECT-ID>",
 *     type: "DATADOG",
 *     apiKey: "<API-KEY>",
 *     region: "<REGION>",
 * });
 * const test = mongodbatlas.getThirdPartyIntegrationsOutput({
 *     projectId: testPagerDuty.projectId,
 * });
 * ```
 */
export function getThirdPartyIntegrations(args: GetThirdPartyIntegrationsArgs, opts?: pulumi.InvokeOptions): Promise<GetThirdPartyIntegrationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getThirdPartyIntegrations:getThirdPartyIntegrations", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getThirdPartyIntegrations.
 */
export interface GetThirdPartyIntegrationsArgs {
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: string;
}

/**
 * A collection of values returned by getThirdPartyIntegrations.
 */
export interface GetThirdPartyIntegrationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * ID of the Atlas project the Third-Party Service Integration belongs to.
     */
    readonly projectId: string;
    /**
     * A list where each represents a Third-Party service integration.
     */
    readonly results: outputs.GetThirdPartyIntegrationsResult[];
}
/**
 * `mongodbatlas.getThirdPartyIntegrations` describe all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `DATADOG`
 * applied across the project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testPagerDuty = new mongodbatlas.ThirdPartyIntegration("test_pager_duty", {
 *     projectId: "<PROJECT-ID>",
 *     type: "PAGER_DUTY",
 *     serviceKey: "<PAGER-DUTY-SERVICE-KEY>",
 * });
 * const testDatadog = new mongodbatlas.ThirdPartyIntegration("test_datadog", {
 *     projectId: "<PROJECT-ID>",
 *     type: "DATADOG",
 *     apiKey: "<API-KEY>",
 *     region: "<REGION>",
 * });
 * const test = mongodbatlas.getThirdPartyIntegrationsOutput({
 *     projectId: testPagerDuty.projectId,
 * });
 * ```
 */
export function getThirdPartyIntegrationsOutput(args: GetThirdPartyIntegrationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetThirdPartyIntegrationsResult> {
    return pulumi.output(args).apply((a: any) => getThirdPartyIntegrations(a, opts))
}

/**
 * A collection of arguments for invoking getThirdPartyIntegrations.
 */
export interface GetThirdPartyIntegrationsOutputArgs {
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: pulumi.Input<string>;
}
