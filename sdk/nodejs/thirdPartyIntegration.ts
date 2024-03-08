// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ThirdPartyIntegration` Provides a Third-Party Integration Settings for the given type.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * > **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)
 *
 * > **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.
 *
 * > **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testDatadog = new mongodbatlas.ThirdPartyIntegration("testDatadog", {
 *     apiKey: "<API-KEY>",
 *     projectId: "<PROJECT-ID>",
 *     region: "<REGION>",
 *     type: "DATADOG",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration my_user 1112222b3bf99403840e8934-OPS_GENIE
 * ```
 * See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.
 */
export class ThirdPartyIntegration extends pulumi.CustomResource {
    /**
     * Get an existing ThirdPartyIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ThirdPartyIntegrationState, opts?: pulumi.CustomResourceOptions): ThirdPartyIntegration {
        return new ThirdPartyIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration';

    /**
     * Returns true if the given object is an instance of ThirdPartyIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ThirdPartyIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ThirdPartyIntegration.__pulumiType;
    }

    /**
     * Your API Key.
     */
    public readonly apiKey!: pulumi.Output<string>;
    public readonly channelName!: pulumi.Output<string>;
    /**
     * Whether your cluster has Prometheus enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Your Microsoft Teams incoming webhook URL.
     */
    public readonly microsoftTeamsWebhookUrl!: pulumi.Output<string>;
    /**
     * Your Prometheus password.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * An optional field for your Routing Key.
     */
    public readonly routingKey!: pulumi.Output<string>;
    /**
     * Your Prometheus protocol scheme configured for requests.
     */
    public readonly scheme!: pulumi.Output<string>;
    /**
     * An optional field for your webhook secret.
     */
    public readonly secret!: pulumi.Output<string | undefined>;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    public readonly serviceDiscovery!: pulumi.Output<string>;
    /**
     * Your Service Key.
     */
    public readonly serviceKey!: pulumi.Output<string>;
    public readonly teamName!: pulumi.Output<string>;
    /**
     * Third-Party Integration Settings type 
     * * PAGER_DUTY
     * * DATADOG
     * * OPS_GENIE
     * * VICTOR_OPS
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Your webhook URL.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Your Prometheus username.
     */
    public readonly userName!: pulumi.Output<string>;

    /**
     * Create a ThirdPartyIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ThirdPartyIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ThirdPartyIntegrationArgs | ThirdPartyIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ThirdPartyIntegrationState | undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["channelName"] = state ? state.channelName : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["microsoftTeamsWebhookUrl"] = state ? state.microsoftTeamsWebhookUrl : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["routingKey"] = state ? state.routingKey : undefined;
            resourceInputs["scheme"] = state ? state.scheme : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
            resourceInputs["serviceDiscovery"] = state ? state.serviceDiscovery : undefined;
            resourceInputs["serviceKey"] = state ? state.serviceKey : undefined;
            resourceInputs["teamName"] = state ? state.teamName : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as ThirdPartyIntegrationArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["apiKey"] = args?.apiKey ? pulumi.secret(args.apiKey) : undefined;
            resourceInputs["channelName"] = args ? args.channelName : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["microsoftTeamsWebhookUrl"] = args?.microsoftTeamsWebhookUrl ? pulumi.secret(args.microsoftTeamsWebhookUrl) : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["routingKey"] = args?.routingKey ? pulumi.secret(args.routingKey) : undefined;
            resourceInputs["scheme"] = args ? args.scheme : undefined;
            resourceInputs["secret"] = args?.secret ? pulumi.secret(args.secret) : undefined;
            resourceInputs["serviceDiscovery"] = args?.serviceDiscovery ? pulumi.secret(args.serviceDiscovery) : undefined;
            resourceInputs["serviceKey"] = args?.serviceKey ? pulumi.secret(args.serviceKey) : undefined;
            resourceInputs["teamName"] = args ? args.teamName : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["userName"] = args?.userName ? pulumi.secret(args.userName) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey", "microsoftTeamsWebhookUrl", "password", "routingKey", "secret", "serviceDiscovery", "serviceKey", "userName"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ThirdPartyIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ThirdPartyIntegration resources.
 */
export interface ThirdPartyIntegrationState {
    /**
     * Your API Key.
     */
    apiKey?: pulumi.Input<string>;
    channelName?: pulumi.Input<string>;
    /**
     * Whether your cluster has Prometheus enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Your Microsoft Teams incoming webhook URL.
     */
    microsoftTeamsWebhookUrl?: pulumi.Input<string>;
    /**
     * Your Prometheus password.
     */
    password?: pulumi.Input<string>;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId?: pulumi.Input<string>;
    /**
     * Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
     */
    region?: pulumi.Input<string>;
    /**
     * An optional field for your Routing Key.
     */
    routingKey?: pulumi.Input<string>;
    /**
     * Your Prometheus protocol scheme configured for requests.
     */
    scheme?: pulumi.Input<string>;
    /**
     * An optional field for your webhook secret.
     */
    secret?: pulumi.Input<string>;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    serviceDiscovery?: pulumi.Input<string>;
    /**
     * Your Service Key.
     */
    serviceKey?: pulumi.Input<string>;
    teamName?: pulumi.Input<string>;
    /**
     * Third-Party Integration Settings type 
     * * PAGER_DUTY
     * * DATADOG
     * * OPS_GENIE
     * * VICTOR_OPS
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     */
    type?: pulumi.Input<string>;
    /**
     * Your webhook URL.
     */
    url?: pulumi.Input<string>;
    /**
     * Your Prometheus username.
     */
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ThirdPartyIntegration resource.
 */
export interface ThirdPartyIntegrationArgs {
    /**
     * Your API Key.
     */
    apiKey?: pulumi.Input<string>;
    channelName?: pulumi.Input<string>;
    /**
     * Whether your cluster has Prometheus enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Your Microsoft Teams incoming webhook URL.
     */
    microsoftTeamsWebhookUrl?: pulumi.Input<string>;
    /**
     * Your Prometheus password.
     */
    password?: pulumi.Input<string>;
    /**
     * The unique ID for the project to get all Third-Party service integrations
     */
    projectId: pulumi.Input<string>;
    /**
     * Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
     */
    region?: pulumi.Input<string>;
    /**
     * An optional field for your Routing Key.
     */
    routingKey?: pulumi.Input<string>;
    /**
     * Your Prometheus protocol scheme configured for requests.
     */
    scheme?: pulumi.Input<string>;
    /**
     * An optional field for your webhook secret.
     */
    secret?: pulumi.Input<string>;
    /**
     * Indicates which service discovery method is used, either file or http.
     */
    serviceDiscovery?: pulumi.Input<string>;
    /**
     * Your Service Key.
     */
    serviceKey?: pulumi.Input<string>;
    teamName?: pulumi.Input<string>;
    /**
     * Third-Party Integration Settings type 
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
     * Your webhook URL.
     */
    url?: pulumi.Input<string>;
    /**
     * Your Prometheus username.
     */
    userName?: pulumi.Input<string>;
}
