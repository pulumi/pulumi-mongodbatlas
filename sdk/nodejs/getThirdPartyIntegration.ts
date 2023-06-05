// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testFlowdock = new mongodbatlas.ThirdPartyIntegration("testFlowdock", {
 *     projectId: "<PROJECT-ID>",
 *     type: "FLOWDOCK",
 *     flowName: "<FLOW-NAME>",
 *     apiToken: "<API-TOKEN>",
 *     orgName: "<ORG-NAME>",
 * });
 * const test = mongodbatlas.getThirdPartyIntegrationOutput({
 *     projectId: testFlowdock.projectId,
 * });
 * ```
 */
export function getThirdPartyIntegration(args: GetThirdPartyIntegrationArgs, opts?: pulumi.InvokeOptions): Promise<GetThirdPartyIntegrationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", {
        "enabled": args.enabled,
        "microsoftTeamsWebhookUrl": args.microsoftTeamsWebhookUrl,
        "projectId": args.projectId,
        "scheme": args.scheme,
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
     */
    microsoftTeamsWebhookUrl?: string;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: string;
    /**
     * Your Prometheus protocol scheme configured for requests.
     */
    scheme?: string;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    serviceDiscovery?: string;
    /**
     * Third-Party service integration type
     * * PAGER_DUTY
     * * DATADOG
     * * NEW_RELIC*
     * * OPS_GENIE
     * * VICTOR_OPS
     * * FLOWDOCK*
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     *
     * *resource is now deprecated and will be removed in the next major version, 1.9.0
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
    /**
     * Unique identifier of your New Relic account.
     */
    readonly accountId: string;
    /**
     * Your API Key.
     */
    readonly apiKey: string;
    /**
     * Your API Token.
     */
    readonly apiToken: string;
    readonly channelName: string;
    /**
     * Whether your cluster has Prometheus enabled.
     */
    readonly enabled?: boolean;
    /**
     * Your Flowdock Flow name.
     */
    readonly flowName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Your License Key.
     */
    readonly licenseKey: string;
    /**
     * Your Microsoft Teams incoming webhook URL.
     */
    readonly microsoftTeamsWebhookUrl?: string;
    /**
     * Your Flowdock organization name.
     */
    readonly orgName: string;
    readonly projectId: string;
    /**
     * Your Insights Query Key.
     */
    readonly readToken: string;
    /**
     * Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
     */
    readonly region: string;
    /**
     * An optional field for your Routing Key.
     */
    readonly routingKey: string;
    /**
     * Your Prometheus protocol scheme configured for requests.
     */
    readonly scheme?: string;
    /**
     * An optional field for your webhook secret.
     */
    readonly secret: string;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    readonly serviceDiscovery?: string;
    /**
     * Your Service Key.
     */
    readonly serviceKey: string;
    readonly teamName: string;
    /**
     * Property equal to its own integration type
     */
    readonly type: string;
    /**
     * Your webhook URL.
     */
    readonly url: string;
    /**
     * Your Prometheus username.
     */
    readonly userName?: string;
    /**
     * Your Insights Insert Key.
     */
    readonly writeToken: string;
}
/**
 * `mongodbatlas.ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testFlowdock = new mongodbatlas.ThirdPartyIntegration("testFlowdock", {
 *     projectId: "<PROJECT-ID>",
 *     type: "FLOWDOCK",
 *     flowName: "<FLOW-NAME>",
 *     apiToken: "<API-TOKEN>",
 *     orgName: "<ORG-NAME>",
 * });
 * const test = mongodbatlas.getThirdPartyIntegrationOutput({
 *     projectId: testFlowdock.projectId,
 * });
 * ```
 */
export function getThirdPartyIntegrationOutput(args: GetThirdPartyIntegrationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetThirdPartyIntegrationResult> {
    return pulumi.output(args).apply((a: any) => getThirdPartyIntegration(a, opts))
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
     */
    microsoftTeamsWebhookUrl?: pulumi.Input<string>;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: pulumi.Input<string>;
    /**
     * Your Prometheus protocol scheme configured for requests.
     */
    scheme?: pulumi.Input<string>;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    serviceDiscovery?: pulumi.Input<string>;
    /**
     * Third-Party service integration type
     * * PAGER_DUTY
     * * DATADOG
     * * NEW_RELIC*
     * * OPS_GENIE
     * * VICTOR_OPS
     * * FLOWDOCK*
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     *
     * *resource is now deprecated and will be removed in the next major version, 1.9.0
     */
    type: pulumi.Input<string>;
    /**
     * Your Prometheus username.
     */
    userName?: pulumi.Input<string>;
}
