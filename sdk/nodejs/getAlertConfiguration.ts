// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getAlertConfiguration(args: GetAlertConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertConfigurationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getAlertConfiguration:getAlertConfiguration", {
        "alertConfigurationId": args.alertConfigurationId,
        "outputs": args.outputs,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertConfiguration.
 */
export interface GetAlertConfigurationArgs {
    /**
     * Unique identifier for the alert configuration.
     */
    alertConfigurationId: string;
    /**
     * List of formatted output requested for this alert configuration
     * * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
     */
    outputs?: inputs.GetAlertConfigurationOutput[];
    /**
     * The ID of the project where the alert configuration will create.
     */
    projectId: string;
}

/**
 * A collection of values returned by getAlertConfiguration.
 */
export interface GetAlertConfigurationResult {
    readonly alertConfigurationId: string;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     */
    readonly created: string;
    /**
     * If set to true, the alert configuration is enabled. If enabled is not exported it is set to false.
     */
    readonly enabled: boolean;
    /**
     * The type of event that will trigger an alert.
     */
    readonly eventType: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly matchers: outputs.GetAlertConfigurationMatcher[];
    readonly metricThreshold: {[key: string]: string};
    readonly metricThresholdConfigs: outputs.GetAlertConfigurationMetricThresholdConfig[];
    readonly notifications: outputs.GetAlertConfigurationNotification[];
    readonly outputs?: outputs.GetAlertConfigurationOutput[];
    readonly projectId: string;
    /**
     * Threshold value outside of which an alert will be triggered.
     */
    readonly threshold: {[key: string]: string};
    readonly thresholdConfigs: outputs.GetAlertConfigurationThresholdConfig[];
    /**
     * Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     */
    readonly updated: string;
}
export function getAlertConfigurationOutput(args: GetAlertConfigurationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlertConfigurationResult> {
    return pulumi.output(args).apply((a: any) => getAlertConfiguration(a, opts))
}

/**
 * A collection of arguments for invoking getAlertConfiguration.
 */
export interface GetAlertConfigurationOutputArgs {
    /**
     * Unique identifier for the alert configuration.
     */
    alertConfigurationId: pulumi.Input<string>;
    /**
     * List of formatted output requested for this alert configuration
     * * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
     */
    outputs?: pulumi.Input<pulumi.Input<inputs.GetAlertConfigurationOutputArgs>[]>;
    /**
     * The ID of the project where the alert configuration will create.
     */
    projectId: pulumi.Input<string>;
}
