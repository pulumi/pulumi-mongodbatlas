// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas..PrivateIpMode` provides a Private IP Mode resource. This allows one to disable Connect via Peering Only mode for a MongoDB Atlas Project.
 *
 * > **Deprecated Feature**: <br> This feature has been deprecated. Use [Split Horizon connection strings](https://dochub.mongodb.org/core/atlas-horizon-faq) to connect to your cluster. These connection strings allow you to connect using both VPC/VNet Peering and whitelisted public IP addresses. To learn more about support for Split Horizon, see [this FAQ](https://dochub.mongodb.org/core/atlas-horizon-faq). You need this endpoint to [disable Peering Only](https://docs.atlas.mongodb.com/reference/faq/connection-changes/#disable-peering-mode).
 *
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myPrivateIpMode = new mongodbatlas.PrivateIpMode("myPrivateIpMode", {
 *     enabled: false,
 *     projectId: "<YOUR PROJECT ID>",
 * });
 * ```
 */
export class PrivateIpMode extends pulumi.CustomResource {
    /**
     * Get an existing PrivateIpMode resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateIpModeState, opts?: pulumi.CustomResourceOptions): PrivateIpMode {
        return new PrivateIpMode(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/privateIpMode:PrivateIpMode';

    /**
     * Returns true if the given object is an instance of PrivateIpMode.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateIpMode {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateIpMode.__pulumiType;
    }

    /**
     * Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The unique ID for the project to enable Only Private IP Mode.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a PrivateIpMode resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateIpModeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateIpModeArgs | PrivateIpModeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as PrivateIpModeState | undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as PrivateIpModeArgs | undefined;
            if (!args || args.enabled === undefined) {
                throw new Error("Missing required property 'enabled'");
            }
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(PrivateIpMode.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateIpMode resources.
 */
export interface PrivateIpModeState {
    /**
     * Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The unique ID for the project to enable Only Private IP Mode.
     */
    readonly projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateIpMode resource.
 */
export interface PrivateIpModeArgs {
    /**
     * Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     */
    readonly enabled: pulumi.Input<boolean>;
    /**
     * The unique ID for the project to enable Only Private IP Mode.
     */
    readonly projectId: pulumi.Input<string>;
}
