// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Private Endpoint Regional Mode can be imported using project id in format `{project_id}`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode test 1112222b3bf99403840e8934
 * ```
 *  See detailed information for arguments and attributes__Private Endpoints__ [Get Regional Mode](https://www.mongodb.com/docs/atlas/reference/api/private-endpoints-get-regional-mode/) | [Update Regional Mode](https://www.mongodb.com/docs/atlas/reference/api/private-endpoints-update-regional-mode/)
 */
export class PrivateEndpointRegionalMode extends pulumi.CustomResource {
    /**
     * Get an existing PrivateEndpointRegionalMode resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateEndpointRegionalModeState, opts?: pulumi.CustomResourceOptions): PrivateEndpointRegionalMode {
        return new PrivateEndpointRegionalMode(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode';

    /**
     * Returns true if the given object is an instance of PrivateEndpointRegionalMode.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateEndpointRegionalMode {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateEndpointRegionalMode.__pulumiType;
    }

    /**
     * Flag that indicates whether the regionalized private endpoint setting is enabled for the project.   Set this value to true to create more than one private endpoint in a cloud provider region to connect to multi-region and global Atlas sharded clusters. You can enable this setting only if your Atlas project contains no replica sets. You can't disable this setting if you have:
     * * More than one private endpoint in more than one region, or
     * * More than one private endpoint in one region and one private endpoint in one or more regions.
     * You can create only sharded clusters when you enable the regionalized private endpoint setting. You can't create replica sets.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a PrivateEndpointRegionalMode resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateEndpointRegionalModeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateEndpointRegionalModeArgs | PrivateEndpointRegionalModeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateEndpointRegionalModeState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as PrivateEndpointRegionalModeArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateEndpointRegionalMode.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateEndpointRegionalMode resources.
 */
export interface PrivateEndpointRegionalModeState {
    /**
     * Flag that indicates whether the regionalized private endpoint setting is enabled for the project.   Set this value to true to create more than one private endpoint in a cloud provider region to connect to multi-region and global Atlas sharded clusters. You can enable this setting only if your Atlas project contains no replica sets. You can't disable this setting if you have:
     * * More than one private endpoint in more than one region, or
     * * More than one private endpoint in one region and one private endpoint in one or more regions.
     * You can create only sharded clusters when you enable the regionalized private endpoint setting. You can't create replica sets.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Unique identifier for the project.
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateEndpointRegionalMode resource.
 */
export interface PrivateEndpointRegionalModeArgs {
    /**
     * Flag that indicates whether the regionalized private endpoint setting is enabled for the project.   Set this value to true to create more than one private endpoint in a cloud provider region to connect to multi-region and global Atlas sharded clusters. You can enable this setting only if your Atlas project contains no replica sets. You can't disable this setting if you have:
     * * More than one private endpoint in more than one region, or
     * * More than one private endpoint in one region and one private endpoint in one or more regions.
     * You can create only sharded clusters when you enable the regionalized private endpoint setting. You can't create replica sets.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
}
