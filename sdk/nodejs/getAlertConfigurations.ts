// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getAlertConfigurations
 *
 * `mongodbatlas.getAlertConfigurations` describes all Alert Configurations by the provided project_id. The data source requires your Project ID.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 */
export function getAlertConfigurations(args: GetAlertConfigurationsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertConfigurationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getAlertConfigurations:getAlertConfigurations", {
        "listOptions": args.listOptions,
        "outputTypes": args.outputTypes,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertConfigurations.
 */
export interface GetAlertConfigurationsArgs {
    /**
     * Arguments that dictate how many and which results are returned by the data source
     * * `list_options.page_num` - Which page of results to retrieve (default to first page)
     * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
     * * `list_options.include_count` - Whether to include total count of results in the response (default false)
     */
    listOptions?: inputs.GetAlertConfigurationsListOption[];
    /**
     * List of requested string formatted output to be included on each individual result. Options are `resourceHcl` and `resourceImport`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
     */
    outputTypes?: string[];
    /**
     * The unique ID for the project to get the alert configurations.
     */
    projectId: string;
}

/**
 * A collection of values returned by getAlertConfigurations.
 */
export interface GetAlertConfigurationsResult {
    readonly id: string;
    readonly listOptions?: outputs.GetAlertConfigurationsListOption[];
    readonly outputTypes?: string[];
    /**
     * The ID of the project where the alert configuration exists
     */
    readonly projectId: string;
    /**
     * A list of alert configurations for the project_id, constrained by the `listOptions`.
     */
    readonly results: outputs.GetAlertConfigurationsResult[];
    /**
     * Total count of results
     */
    readonly totalCount: number;
}
/**
 * ## # Data Source: mongodbatlas.getAlertConfigurations
 *
 * `mongodbatlas.getAlertConfigurations` describes all Alert Configurations by the provided project_id. The data source requires your Project ID.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 */
export function getAlertConfigurationsOutput(args: GetAlertConfigurationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAlertConfigurationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getAlertConfigurations:getAlertConfigurations", {
        "listOptions": args.listOptions,
        "outputTypes": args.outputTypes,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertConfigurations.
 */
export interface GetAlertConfigurationsOutputArgs {
    /**
     * Arguments that dictate how many and which results are returned by the data source
     * * `list_options.page_num` - Which page of results to retrieve (default to first page)
     * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
     * * `list_options.include_count` - Whether to include total count of results in the response (default false)
     */
    listOptions?: pulumi.Input<pulumi.Input<inputs.GetAlertConfigurationsListOptionArgs>[]>;
    /**
     * List of requested string formatted output to be included on each individual result. Options are `resourceHcl` and `resourceImport`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
     */
    outputTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique ID for the project to get the alert configurations.
     */
    projectId: pulumi.Input<string>;
}
