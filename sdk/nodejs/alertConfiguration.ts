// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.AlertConfiguration` provides an Alert Configuration resource to define the conditions that trigger an alert and the methods of notification within a MongoDB Atlas project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Import
 *
 * Alert Configuration can be imported using the `project_id-alert_configuration_id`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/alertConfiguration:AlertConfiguration test 5d0f1f74cf09a29120e123cd-5d0f1f74cf09a29120e1fscg
 * ```
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/alert-configurations/)
 */
export class AlertConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing AlertConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertConfigurationState, opts?: pulumi.CustomResourceOptions): AlertConfiguration {
        return new AlertConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/alertConfiguration:AlertConfiguration';

    /**
     * Returns true if the given object is an instance of AlertConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertConfiguration.__pulumiType;
    }

    /**
     * Unique identifier for the alert configuration.
     */
    public /*out*/ readonly alertConfigurationId!: pulumi.Output<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The type of event that will trigger an alert.
     *
     * > ***IMPORTANT:*** Event Type has many possible values. All current options at available at https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/ and https://www.mongodb.com/docs/atlas/reference/alert-conditions/ Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/) and checking the latest eventTypeName options.
     *
     * > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
     */
    public readonly eventType!: pulumi.Output<string>;
    public readonly matchers!: pulumi.Output<outputs.AlertConfigurationMatcher[] | undefined>;
    public readonly metricThresholdConfig!: pulumi.Output<outputs.AlertConfigurationMetricThresholdConfig | undefined>;
    public readonly notifications!: pulumi.Output<outputs.AlertConfigurationNotification[] | undefined>;
    /**
     * The ID of the project where the alert configuration will create.
     */
    public readonly projectId!: pulumi.Output<string>;
    public readonly thresholdConfig!: pulumi.Output<outputs.AlertConfigurationThresholdConfig | undefined>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a AlertConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertConfigurationArgs | AlertConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertConfigurationState | undefined;
            resourceInputs["alertConfigurationId"] = state ? state.alertConfigurationId : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["eventType"] = state ? state.eventType : undefined;
            resourceInputs["matchers"] = state ? state.matchers : undefined;
            resourceInputs["metricThresholdConfig"] = state ? state.metricThresholdConfig : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["thresholdConfig"] = state ? state.thresholdConfig : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as AlertConfigurationArgs | undefined;
            if ((!args || args.eventType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventType'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["eventType"] = args ? args.eventType : undefined;
            resourceInputs["matchers"] = args ? args.matchers : undefined;
            resourceInputs["metricThresholdConfig"] = args ? args.metricThresholdConfig : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["thresholdConfig"] = args ? args.thresholdConfig : undefined;
            resourceInputs["alertConfigurationId"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertConfiguration resources.
 */
export interface AlertConfigurationState {
    /**
     * Unique identifier for the alert configuration.
     */
    alertConfigurationId?: pulumi.Input<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     */
    created?: pulumi.Input<string>;
    /**
     * It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The type of event that will trigger an alert.
     *
     * > ***IMPORTANT:*** Event Type has many possible values. All current options at available at https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/ and https://www.mongodb.com/docs/atlas/reference/alert-conditions/ Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/) and checking the latest eventTypeName options.
     *
     * > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
     */
    eventType?: pulumi.Input<string>;
    matchers?: pulumi.Input<pulumi.Input<inputs.AlertConfigurationMatcher>[]>;
    metricThresholdConfig?: pulumi.Input<inputs.AlertConfigurationMetricThresholdConfig>;
    notifications?: pulumi.Input<pulumi.Input<inputs.AlertConfigurationNotification>[]>;
    /**
     * The ID of the project where the alert configuration will create.
     */
    projectId?: pulumi.Input<string>;
    thresholdConfig?: pulumi.Input<inputs.AlertConfigurationThresholdConfig>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertConfiguration resource.
 */
export interface AlertConfigurationArgs {
    /**
     * It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The type of event that will trigger an alert.
     *
     * > ***IMPORTANT:*** Event Type has many possible values. All current options at available at https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/ and https://www.mongodb.com/docs/atlas/reference/alert-conditions/ Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/) and checking the latest eventTypeName options.
     *
     * > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
     */
    eventType: pulumi.Input<string>;
    matchers?: pulumi.Input<pulumi.Input<inputs.AlertConfigurationMatcher>[]>;
    metricThresholdConfig?: pulumi.Input<inputs.AlertConfigurationMetricThresholdConfig>;
    notifications?: pulumi.Input<pulumi.Input<inputs.AlertConfigurationNotification>[]>;
    /**
     * The ID of the project where the alert configuration will create.
     */
    projectId: pulumi.Input<string>;
    thresholdConfig?: pulumi.Input<inputs.AlertConfigurationThresholdConfig>;
}
