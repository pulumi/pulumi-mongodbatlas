// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limits resource. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 * ### S
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.FederatedQueryLimit("test", {
 *     limitName: "bytesProcessed.weekly",
 *     overrunPolicy: "BLOCK",
 *     projectId: "64707f06c519c20c3a2b1b03",
 *     tenantName: "FederatedDatabseInstance0",
 *     value: 5147483648,
 * });
 * ```
 *
 * ## Import
 *
 * The Federated Database Instance Query Limit can be imported using project ID, name of the instance and limit name, in the format: `project_id`--`tenant_name`--`limit_name`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit example 1112222b3bf99403840e8934--FederatedDatabaseInstance0--bytesProcessed.daily
 * ```
 *  See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createOneDataFederationQueryLimit) Documentation for more information.
 */
export class FederatedQueryLimit extends pulumi.CustomResource {
    /**
     * Get an existing FederatedQueryLimit resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FederatedQueryLimitState, opts?: pulumi.CustomResourceOptions): FederatedQueryLimit {
        return new FederatedQueryLimit(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit';

    /**
     * Returns true if the given object is an instance of FederatedQueryLimit.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FederatedQueryLimit {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FederatedQueryLimit.__pulumiType;
    }

    /**
     * Amount that indicates the current usage of the limit.
     */
    public /*out*/ readonly currentUsage!: pulumi.Output<number>;
    /**
     * Default value of the limit.
     */
    public readonly defaultLimit!: pulumi.Output<number | undefined>;
    public /*out*/ readonly lastModifiedDate!: pulumi.Output<string>;
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     */
    public readonly limitName!: pulumi.Output<string>;
    public readonly maximumLimit!: pulumi.Output<number | undefined>;
    /**
     * String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
     */
    public readonly overrunPolicy!: pulumi.Output<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    public readonly tenantName!: pulumi.Output<string>;
    /**
     * Amount to set the limit to.
     */
    public readonly value!: pulumi.Output<number>;

    /**
     * Create a FederatedQueryLimit resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FederatedQueryLimitArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FederatedQueryLimitArgs | FederatedQueryLimitState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FederatedQueryLimitState | undefined;
            resourceInputs["currentUsage"] = state ? state.currentUsage : undefined;
            resourceInputs["defaultLimit"] = state ? state.defaultLimit : undefined;
            resourceInputs["lastModifiedDate"] = state ? state.lastModifiedDate : undefined;
            resourceInputs["limitName"] = state ? state.limitName : undefined;
            resourceInputs["maximumLimit"] = state ? state.maximumLimit : undefined;
            resourceInputs["overrunPolicy"] = state ? state.overrunPolicy : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tenantName"] = state ? state.tenantName : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as FederatedQueryLimitArgs | undefined;
            if ((!args || args.limitName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'limitName'");
            }
            if ((!args || args.overrunPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'overrunPolicy'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.tenantName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantName'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            resourceInputs["defaultLimit"] = args ? args.defaultLimit : undefined;
            resourceInputs["limitName"] = args ? args.limitName : undefined;
            resourceInputs["maximumLimit"] = args ? args.maximumLimit : undefined;
            resourceInputs["overrunPolicy"] = args ? args.overrunPolicy : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tenantName"] = args ? args.tenantName : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
            resourceInputs["currentUsage"] = undefined /*out*/;
            resourceInputs["lastModifiedDate"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FederatedQueryLimit.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FederatedQueryLimit resources.
 */
export interface FederatedQueryLimitState {
    /**
     * Amount that indicates the current usage of the limit.
     */
    currentUsage?: pulumi.Input<number>;
    /**
     * Default value of the limit.
     */
    defaultLimit?: pulumi.Input<number>;
    lastModifiedDate?: pulumi.Input<string>;
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     */
    limitName?: pulumi.Input<string>;
    maximumLimit?: pulumi.Input<number>;
    /**
     * String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
     */
    overrunPolicy?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    tenantName?: pulumi.Input<string>;
    /**
     * Amount to set the limit to.
     */
    value?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a FederatedQueryLimit resource.
 */
export interface FederatedQueryLimitArgs {
    /**
     * Default value of the limit.
     */
    defaultLimit?: pulumi.Input<number>;
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     */
    limitName: pulumi.Input<string>;
    maximumLimit?: pulumi.Input<number>;
    /**
     * String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
     */
    overrunPolicy: pulumi.Input<string>;
    /**
     * The unique ID for the project to create a Federated Database Instance.
     */
    projectId: pulumi.Input<string>;
    /**
     * Name of the Atlas Federated Database Instance.
     */
    tenantName: pulumi.Input<string>;
    /**
     * Amount to set the limit to.
     */
    value: pulumi.Input<number>;
}
