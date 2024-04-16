// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Data Source: mongodbatlas.FederatedQueryLimit
 *
 * `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getFederatedQueryLimit({
 *     projectId: "PROJECT_ID",
 *     tenantName: "FEDERATED_DATABASE_INSTANCE_NAME",
 *     limitName: "LIMIT_NAME",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFederatedQueryLimit(args: GetFederatedQueryLimitArgs, opts?: pulumi.InvokeOptions): Promise<GetFederatedQueryLimitResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getFederatedQueryLimit:getFederatedQueryLimit", {
        "limitName": args.limitName,
        "projectId": args.projectId,
        "tenantName": args.tenantName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFederatedQueryLimit.
 */
export interface GetFederatedQueryLimitArgs {
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     */
    limitName: string;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: string;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    tenantName: string;
}

/**
 * A collection of values returned by getFederatedQueryLimit.
 */
export interface GetFederatedQueryLimitResult {
    /**
     * Amount that indicates the current usage of the limit.
     */
    readonly currentUsage: number;
    /**
     * Default value of the limit.
     */
    readonly defaultLimit: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lastModifiedDate: string;
    readonly limitName: string;
    readonly maximumLimit: number;
    readonly overrunPolicy: string;
    readonly projectId: string;
    readonly tenantName: string;
    readonly value: number;
}
/**
 * ## Data Source: mongodbatlas.FederatedQueryLimit
 *
 * `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getFederatedQueryLimit({
 *     projectId: "PROJECT_ID",
 *     tenantName: "FEDERATED_DATABASE_INSTANCE_NAME",
 *     limitName: "LIMIT_NAME",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFederatedQueryLimitOutput(args: GetFederatedQueryLimitOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFederatedQueryLimitResult> {
    return pulumi.output(args).apply((a: any) => getFederatedQueryLimit(a, opts))
}

/**
 * A collection of arguments for invoking getFederatedQueryLimit.
 */
export interface GetFederatedQueryLimitOutputArgs {
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     */
    limitName: pulumi.Input<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: pulumi.Input<string>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    tenantName: pulumi.Input<string>;
}
