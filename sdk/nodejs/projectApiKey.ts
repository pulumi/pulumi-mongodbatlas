// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Create And Assign PAK Together
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ProjectApiKey("test", {
 *     description: "Description of your API key",
 *     projectAssignments: [{
 *         projectId: "64259ee860c43338194b0f8e",
 *         roleNames: ["GROUP_OWNER"],
 *     }],
 * });
 * ```
 *
 * ### Create And Assign PAK To Multiple Projects
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ProjectApiKey("test", {
 *     description: "Description of your API key",
 *     projectAssignments: [
 *         {
 *             projectId: "64259ee860c43338194b0f8e",
 *             roleNames: [
 *                 "GROUP_READ_ONLY",
 *                 "GROUP_OWNER",
 *             ],
 *         },
 *         {
 *             projectId: "74259ee860c43338194b0f8e",
 *             roleNames: ["GROUP_READ_ONLY"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * API Keys must be imported using project ID, API Key ID e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
 * ```
 * See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information.
 */
export class ProjectApiKey extends pulumi.CustomResource {
    /**
     * Get an existing ProjectApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectApiKeyState, opts?: pulumi.CustomResourceOptions): ProjectApiKey {
        return new ProjectApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/projectApiKey:ProjectApiKey';

    /**
     * Returns true if the given object is an instance of ProjectApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectApiKey.__pulumiType;
    }

    /**
     * Unique identifier for this Project API key.
     */
    public /*out*/ readonly apiKeyId!: pulumi.Output<string>;
    /**
     * Description of this Project API key.
     */
    public readonly description!: pulumi.Output<string>;
    public /*out*/ readonly privateKey!: pulumi.Output<string>;
    public readonly projectAssignments!: pulumi.Output<outputs.ProjectApiKeyProjectAssignment[]>;
    public /*out*/ readonly publicKey!: pulumi.Output<string>;

    /**
     * Create a ProjectApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectApiKeyArgs | ProjectApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectApiKeyState | undefined;
            resourceInputs["apiKeyId"] = state ? state.apiKeyId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
            resourceInputs["projectAssignments"] = state ? state.projectAssignments : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
        } else {
            const args = argsOrState as ProjectApiKeyArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.projectAssignments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectAssignments'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["projectAssignments"] = args ? args.projectAssignments : undefined;
            resourceInputs["apiKeyId"] = undefined /*out*/;
            resourceInputs["privateKey"] = undefined /*out*/;
            resourceInputs["publicKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["privateKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ProjectApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectApiKey resources.
 */
export interface ProjectApiKeyState {
    /**
     * Unique identifier for this Project API key.
     */
    apiKeyId?: pulumi.Input<string>;
    /**
     * Description of this Project API key.
     */
    description?: pulumi.Input<string>;
    privateKey?: pulumi.Input<string>;
    projectAssignments?: pulumi.Input<pulumi.Input<inputs.ProjectApiKeyProjectAssignment>[]>;
    publicKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectApiKey resource.
 */
export interface ProjectApiKeyArgs {
    /**
     * Description of this Project API key.
     */
    description: pulumi.Input<string>;
    projectAssignments: pulumi.Input<pulumi.Input<inputs.ProjectApiKeyProjectAssignment>[]>;
}
