// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.ThirdPartyIntegration
 *
 * `mongodbatlas.ThirdPartyIntegration` describes a Third-Party Integration Settings for the given type.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatadog = new mongodbatlas.ThirdPartyIntegration("test_datadog", {
 *     projectId: "<PROJECT-ID>",
 *     type: "DATADOG",
 *     apiKey: "<API-KEY>",
 *     region: "<REGION>",
 * });
 * const test = mongodbatlas.getThirdPartyIntegrationOutput({
 *     projectId: testDatadog.projectId,
 *     type: "DATADOG",
 * });
 * ```
 */
export function getThirdPartyIntegration(args: GetThirdPartyIntegrationArgs, opts?: pulumi.InvokeOptions): Promise<GetThirdPartyIntegrationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", {
        "enabled": args.enabled,
        "microsoftTeamsWebhookUrl": args.microsoftTeamsWebhookUrl,
        "projectId": args.projectId,
        "serviceDiscovery": args.serviceDiscovery,
        "type": args.type,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getThirdPartyIntegration.
 */
export interface GetThirdPartyIntegrationArgs {
    /**
     * Whether your cluster has Prometheus enabled.
     */
    enabled?: boolean;
    /**
     * Your Microsoft Teams incoming webhook URL.
     * * `PROMETHEUS`
     */
    microsoftTeamsWebhookUrl?: string;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: string;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    serviceDiscovery?: string;
    /**
     * Third-Party service integration type
     * * PAGER_DUTY
     * * DATADOG
     * * OPS_GENIE
     * * VICTOR_OPS
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     */
    type: string;
    /**
     * Your Prometheus username.
     */
    userName?: string;
}

/**
 * A collection of values returned by getThirdPartyIntegration.
 */
export interface GetThirdPartyIntegrationResult {
    readonly accountId: string;
    /**
     * Your API Key.
     */
    readonly apiKey: string;
    readonly channelName: string;
    /**
     * Whether your cluster has Prometheus enabled.
     */
    readonly enabled?: boolean;
    /**
     * Unique identifier of the integration.
     */
    readonly id: string;
    /**
     * Your Microsoft Teams incoming webhook URL.
     * * `PROMETHEUS`
     */
    readonly microsoftTeamsWebhookUrl?: string;
    readonly projectId: string;
    /**
     * Two-letter code that indicates which API URL to use. See the `region` response field of [MongoDB API Third-Party Service Integration documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Third-Party-Integrations/operation/getThirdPartyIntegration) for more details. Opsgenie will use US by default.
     * * `VICTOR_OPS`
     */
    readonly region: string;
    /**
     * An optional field for your Routing Key.
     * * `WEBHOOK`
     */
    readonly routingKey: string;
    /**
     * An optional field for your webhook secret.
     * * `MICROSOFT_TEAMS`
     */
    readonly secret: string;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    readonly serviceDiscovery?: string;
    /**
     * Your Service Key.
     * * `DATADOG`
     */
    readonly serviceKey: string;
    readonly teamName: string;
    readonly type: string;
    /**
     * Your webhook URL.
     */
    readonly url: string;
    /**
     * Your Prometheus username.
     */
    readonly userName?: string;
}
/**
 * ## # Data Source: mongodbatlas.ThirdPartyIntegration
 *
 * `mongodbatlas.ThirdPartyIntegration` describes a Third-Party Integration Settings for the given type.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatadog = new mongodbatlas.ThirdPartyIntegration("test_datadog", {
 *     projectId: "<PROJECT-ID>",
 *     type: "DATADOG",
 *     apiKey: "<API-KEY>",
 *     region: "<REGION>",
 * });
 * const test = mongodbatlas.getThirdPartyIntegrationOutput({
 *     projectId: testDatadog.projectId,
 *     type: "DATADOG",
 * });
 * ```
 */
export function getThirdPartyIntegrationOutput(args: GetThirdPartyIntegrationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetThirdPartyIntegrationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", {
        "enabled": args.enabled,
        "microsoftTeamsWebhookUrl": args.microsoftTeamsWebhookUrl,
        "projectId": args.projectId,
        "serviceDiscovery": args.serviceDiscovery,
        "type": args.type,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getThirdPartyIntegration.
 */
export interface GetThirdPartyIntegrationOutputArgs {
    /**
     * Whether your cluster has Prometheus enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Your Microsoft Teams incoming webhook URL.
     * * `PROMETHEUS`
     */
    microsoftTeamsWebhookUrl?: pulumi.Input<string>;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: pulumi.Input<string>;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    serviceDiscovery?: pulumi.Input<string>;
    /**
     * Third-Party service integration type
     * * PAGER_DUTY
     * * DATADOG
     * * OPS_GENIE
     * * VICTOR_OPS
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     */
    type: pulumi.Input<string>;
    /**
     * Your Prometheus username.
     */
    userName?: pulumi.Input<string>;
}
