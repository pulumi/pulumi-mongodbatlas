// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export function getProjectApiKey(args: GetProjectApiKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectApiKeyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getProjectApiKey:getProjectApiKey", {
        "apiKeyId": args.apiKeyId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectApiKey.
 */
export interface GetProjectApiKeyArgs {
    /**
     * Unique identifier for this Project API key.
     */
    apiKeyId: string;
    /**
     * The unique ID for the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getProjectApiKey.
 */
export interface GetProjectApiKeyResult {
    readonly apiKeyId: string;
    /**
     * Description of this Project API key.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Private key for this Organization API key.
     */
    readonly privateKey: string;
    readonly projectAssignments: outputs.GetProjectApiKeyProjectAssignment[];
    /**
     * Project ID to assign to Access Key
     */
    readonly projectId: string;
    /**
     * Public key for this Organization API key.
     */
    readonly publicKey: string;
}
/**
 * ## Example Usage
 */
export function getProjectApiKeyOutput(args: GetProjectApiKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectApiKeyResult> {
    return pulumi.output(args).apply((a: any) => getProjectApiKey(a, opts))
}

/**
 * A collection of arguments for invoking getProjectApiKey.
 */
export interface GetProjectApiKeyOutputArgs {
    /**
     * Unique identifier for this Project API key.
     */
    apiKeyId: pulumi.Input<string>;
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}
