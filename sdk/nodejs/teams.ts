// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **WARNING:** This resource is deprecated, use `mongodbatlas.Team`
 *
 * This resource is deprecated. Please transition to using `mongodbatlas.Team` which defines the same underlying implementation, aligning the name of the resource with the implementation which manages a single team.
 */
export class Teams extends pulumi.CustomResource {
    /**
     * Get an existing Teams resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamsState, opts?: pulumi.CustomResourceOptions): Teams {
        return new Teams(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/teams:Teams';

    /**
     * Returns true if the given object is an instance of Teams.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Teams {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Teams.__pulumiType;
    }

    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    public /*out*/ readonly teamId!: pulumi.Output<string>;
    public readonly usernames!: pulumi.Output<string[]>;

    /**
     * Create a Teams resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamsArgs | TeamsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamsState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
            resourceInputs["usernames"] = state ? state.usernames : undefined;
        } else {
            const args = argsOrState as TeamsArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.usernames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'usernames'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["usernames"] = args ? args.usernames : undefined;
            resourceInputs["teamId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Teams.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Teams resources.
 */
export interface TeamsState {
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    teamId?: pulumi.Input<string>;
    usernames?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Teams resource.
 */
export interface TeamsArgs {
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    usernames: pulumi.Input<pulumi.Input<string>[]>;
}
