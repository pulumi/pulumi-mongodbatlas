// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CustomDnsConfigurationClusterAws` describes a Custom DNS Configuration for Atlas Clusters on AWS.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCustomDnsConfigurationClusterAws = new mongodbatlas.CustomDnsConfigurationClusterAws("test", {
 *     projectId: "<project-id>",
 *     enabled: true,
 * });
 * const test = mongodbatlas.getCustomDnsConfigurationClusterAwsOutput({
 *     projectId: testCustomDnsConfigurationClusterAws.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getCustomDnsConfigurationClusterAws(args: GetCustomDnsConfigurationClusterAwsArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomDnsConfigurationClusterAwsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCustomDnsConfigurationClusterAws:getCustomDnsConfigurationClusterAws", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomDnsConfigurationClusterAws.
 */
export interface GetCustomDnsConfigurationClusterAwsArgs {
    /**
     * Unique identifier for the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getCustomDnsConfigurationClusterAws.
 */
export interface GetCustomDnsConfigurationClusterAwsResult {
    /**
     * Indicates whether the project's clusters deployed to AWS use custom DNS.
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
}
/**
 * `mongodbatlas.CustomDnsConfigurationClusterAws` describes a Custom DNS Configuration for Atlas Clusters on AWS.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testCustomDnsConfigurationClusterAws = new mongodbatlas.CustomDnsConfigurationClusterAws("test", {
 *     projectId: "<project-id>",
 *     enabled: true,
 * });
 * const test = mongodbatlas.getCustomDnsConfigurationClusterAwsOutput({
 *     projectId: testCustomDnsConfigurationClusterAws.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getCustomDnsConfigurationClusterAwsOutput(args: GetCustomDnsConfigurationClusterAwsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCustomDnsConfigurationClusterAwsResult> {
    return pulumi.output(args).apply((a: any) => getCustomDnsConfigurationClusterAws(a, opts))
}

/**
 * A collection of arguments for invoking getCustomDnsConfigurationClusterAws.
 */
export interface GetCustomDnsConfigurationClusterAwsOutputArgs {
    /**
     * Unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
}
