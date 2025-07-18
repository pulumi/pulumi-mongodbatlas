// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
        "projectId": args.projectId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getThirdPartyIntegration.
 */
export interface GetThirdPartyIntegrationArgs {
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: string;
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
    readonly enabled: boolean;
    /**
     * Unique identifier of the integration.
     */
    readonly id: string;
    /**
     * Your Microsoft Teams incoming webhook URL.
     * * `PROMETHEUS`
     */
    readonly microsoftTeamsWebhookUrl: string;
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
     * Toggle sending collection latency metrics that includes database names and collection name sand latency metrics on reads, writes, commands, and transactions.
     */
    readonly sendCollectionLatencyMetrics: boolean;
    /**
     * Toggle sending database metrics that includes database names and metrics on the number of collections, storage size, and index size.
     * * `OPS_GENIE`
     */
    readonly sendDatabaseMetrics: boolean;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    readonly serviceDiscovery: string;
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
    readonly userName: string;
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
export function getThirdPartyIntegrationOutput(args: GetThirdPartyIntegrationOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetThirdPartyIntegrationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", {
        "projectId": args.projectId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getThirdPartyIntegration.
 */
export interface GetThirdPartyIntegrationOutputArgs {
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: pulumi.Input<string>;
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
}
