// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ### Using CIDR Block
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.AccessListApiKey("test", {
 *     apiKeyId: "a29120e123cd",
 *     cidrBlock: "1.2.3.4/32",
 *     orgId: "<ORG-ID>",
 * });
 * ```
 * ### Using IP Address
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.AccessListApiKey("test", {
 *     apiKeyId: "a29120e123cd",
 *     ipAddress: "2.3.4.5",
 *     orgId: "<ORG-ID>",
 * });
 * ```
 *
 * ## Import
 *
 * IP Access List entries can be imported using the `org_id` , `api_key_id` and `cidr_block` or `ip_address`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/accessListApiKey:AccessListApiKey test 5d0f1f74cf09a29120e123cd-a29120e123cd-10.242.88.0/21
 * ```
 *
 *  For more information see[MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createApiKeyAccessList)
 */
export class AccessListApiKey extends pulumi.CustomResource {
    /**
     * Get an existing AccessListApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessListApiKeyState, opts?: pulumi.CustomResourceOptions): AccessListApiKey {
        return new AccessListApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/accessListApiKey:AccessListApiKey';

    /**
     * Returns true if the given object is an instance of AccessListApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessListApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessListApiKey.__pulumiType;
    }

    /**
     * Unique identifier for the Organization API Key for which you want to create a new access list entry.
     *
     * > **NOTE:** One of the following attributes must set: `cidrBlock`  or `ipAddress` but not both.
     */
    public readonly apiKeyId!: pulumi.Output<string>;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
     */
    public readonly cidrBlock!: pulumi.Output<string>;
    /**
     * Single IP address to be added to the access list.
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    public readonly orgId!: pulumi.Output<string>;

    /**
     * Create a AccessListApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessListApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessListApiKeyArgs | AccessListApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessListApiKeyState | undefined;
            resourceInputs["apiKeyId"] = state ? state.apiKeyId : undefined;
            resourceInputs["cidrBlock"] = state ? state.cidrBlock : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
        } else {
            const args = argsOrState as AccessListApiKeyArgs | undefined;
            if ((!args || args.apiKeyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiKeyId'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["apiKeyId"] = args ? args.apiKeyId : undefined;
            resourceInputs["cidrBlock"] = args ? args.cidrBlock : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessListApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessListApiKey resources.
 */
export interface AccessListApiKeyState {
    /**
     * Unique identifier for the Organization API Key for which you want to create a new access list entry.
     *
     * > **NOTE:** One of the following attributes must set: `cidrBlock`  or `ipAddress` but not both.
     */
    apiKeyId?: pulumi.Input<string>;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * Single IP address to be added to the access list.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessListApiKey resource.
 */
export interface AccessListApiKeyArgs {
    /**
     * Unique identifier for the Organization API Key for which you want to create a new access list entry.
     *
     * > **NOTE:** One of the following attributes must set: `cidrBlock`  or `ipAddress` but not both.
     */
    apiKeyId: pulumi.Input<string>;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * Single IP address to be added to the access list.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     */
    orgId: pulumi.Input<string>;
}
