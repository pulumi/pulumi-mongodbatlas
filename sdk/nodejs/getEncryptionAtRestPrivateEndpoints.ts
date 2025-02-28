// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getEncryptionAtRestPrivateEndpoints
 *
 * `mongodbatlas.getEncryptionAtRestPrivateEndpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.
 *
 * ## Example Usage
 *
 * ### S
 *
 * > **NOTE:** Only Azure Key Vault with Azure Private Link and AWS KMS over AWS PrivateLink is supported at this time.
 *
 * ### Encryption At Rest Azure Key Vault Private Endpoint
 * To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const plural = mongodbatlas.getEncryptionAtRestPrivateEndpoints({
 *     projectId: atlasProjectId,
 *     cloudProvider: "AZURE",
 * });
 * export const numberOfEndpoints = plural.then(plural => plural.results).length;
 * ```
 *
 * ### Encryption At Rest AWS KMS Private Endpoint
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const plural = mongodbatlas.getEncryptionAtRestPrivateEndpoints({
 *     projectId: atlasProjectId,
 *     cloudProvider: "AWS",
 * });
 * export const numberOfEndpoints = plural.then(plural => plural.results).length;
 * ```
 */
export function getEncryptionAtRestPrivateEndpoints(args: GetEncryptionAtRestPrivateEndpointsArgs, opts?: pulumi.InvokeOptions): Promise<GetEncryptionAtRestPrivateEndpointsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints", {
        "cloudProvider": args.cloudProvider,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptionAtRestPrivateEndpoints.
 */
export interface GetEncryptionAtRestPrivateEndpointsArgs {
    /**
     * Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     */
    cloudProvider: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getEncryptionAtRestPrivateEndpoints.
 */
export interface GetEncryptionAtRestPrivateEndpointsResult {
    /**
     * Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     */
    readonly cloudProvider: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    readonly projectId: string;
    /**
     * List of documents that MongoDB Cloud returns for this request.
     */
    readonly results: outputs.GetEncryptionAtRestPrivateEndpointsResult[];
}
/**
 * ## # Data Source: mongodbatlas.getEncryptionAtRestPrivateEndpoints
 *
 * `mongodbatlas.getEncryptionAtRestPrivateEndpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.
 *
 * ## Example Usage
 *
 * ### S
 *
 * > **NOTE:** Only Azure Key Vault with Azure Private Link and AWS KMS over AWS PrivateLink is supported at this time.
 *
 * ### Encryption At Rest Azure Key Vault Private Endpoint
 * To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const plural = mongodbatlas.getEncryptionAtRestPrivateEndpoints({
 *     projectId: atlasProjectId,
 *     cloudProvider: "AZURE",
 * });
 * export const numberOfEndpoints = plural.then(plural => plural.results).length;
 * ```
 *
 * ### Encryption At Rest AWS KMS Private Endpoint
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const plural = mongodbatlas.getEncryptionAtRestPrivateEndpoints({
 *     projectId: atlasProjectId,
 *     cloudProvider: "AWS",
 * });
 * export const numberOfEndpoints = plural.then(plural => plural.results).length;
 * ```
 */
export function getEncryptionAtRestPrivateEndpointsOutput(args: GetEncryptionAtRestPrivateEndpointsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEncryptionAtRestPrivateEndpointsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints", {
        "cloudProvider": args.cloudProvider,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptionAtRestPrivateEndpoints.
 */
export interface GetEncryptionAtRestPrivateEndpointsOutputArgs {
    /**
     * Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     */
    cloudProvider: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: pulumi.Input<string>;
}
