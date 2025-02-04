// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export function getResourcePolicy(args: GetResourcePolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetResourcePolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getResourcePolicy:getResourcePolicy", {
        "id": args.id,
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourcePolicy.
 */
export interface GetResourcePolicyArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies an Atlas resource policy.
     */
    id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     */
    orgId: string;
}

/**
 * A collection of values returned by getResourcePolicy.
 */
export interface GetResourcePolicyResult {
    /**
     * The user that last updated the Atlas resource policy.
     */
    readonly createdByUser: outputs.GetResourcePolicyCreatedByUser;
    /**
     * Date and time in UTC when the Atlas resource policy was created.
     */
    readonly createdDate: string;
    /**
     * Unique 24-hexadecimal digit string that identifies an Atlas resource policy.
     */
    readonly id: string;
    /**
     * The user that last updated the Atlas resource policy.
     */
    readonly lastUpdatedByUser: outputs.GetResourcePolicyLastUpdatedByUser;
    /**
     * Date and time in UTC when the Atlas resource policy was last updated.
     */
    readonly lastUpdatedDate: string;
    /**
     * Human-readable label that describes the Atlas resource policy.
     */
    readonly name: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     */
    readonly orgId: string;
    /**
     * List of policies that make up the Atlas resource policy.
     */
    readonly policies: outputs.GetResourcePolicyPolicy[];
    /**
     * A string that identifies the version of the Atlas resource policy.
     */
    readonly version: string;
}
/**
 * ## Example Usage
 */
export function getResourcePolicyOutput(args: GetResourcePolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetResourcePolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getResourcePolicy:getResourcePolicy", {
        "id": args.id,
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourcePolicy.
 */
export interface GetResourcePolicyOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies an Atlas resource policy.
     */
    id: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     */
    orgId: pulumi.Input<string>;
}
