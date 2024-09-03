// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### s
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ProjectInvitation("test", {
 *     username: "test-acc-username",
 *     projectId: "<PROJECT-ID>",
 *     roles: ["GROUP_DATA_ACCESS_READ_WRITE"],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ProjectInvitation("test", {
 *     username: "test-acc-username",
 *     projectId: "<PROJECT-ID>",
 *     roles: [
 *         "GROUP_READ_ONLY",
 *         "GROUP_DATA_ACCESS_READ_ONLY",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ~> __IMPORTANT:__
 * A project invitation can __not__ be imported once it has been accepted.
 *
 * Import a user's invitation to a project by separating the `project_id` and the `username` with a hyphen:
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/projectInvitation:ProjectInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
 * ```
 */
export class ProjectInvitation extends pulumi.CustomResource {
    /**
     * Get an existing ProjectInvitation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectInvitationState, opts?: pulumi.CustomResourceOptions): ProjectInvitation {
        return new ProjectInvitation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/projectInvitation:ProjectInvitation';

    /**
     * Returns true if the given object is an instance of ProjectInvitation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectInvitation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectInvitation.__pulumiType;
    }

    /**
     * Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     */
    public /*out*/ readonly expiresAt!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     */
    public /*out*/ readonly invitationId!: pulumi.Output<string>;
    /**
     * Atlas user who invited `username` to the project.
     */
    public /*out*/ readonly inviterUsername!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
     */
    public readonly roles!: pulumi.Output<string[]>;
    /**
     * Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a ProjectInvitation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectInvitationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectInvitationArgs | ProjectInvitationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectInvitationState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["expiresAt"] = state ? state.expiresAt : undefined;
            resourceInputs["invitationId"] = state ? state.invitationId : undefined;
            resourceInputs["inviterUsername"] = state ? state.inviterUsername : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as ProjectInvitationArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["expiresAt"] = undefined /*out*/;
            resourceInputs["invitationId"] = undefined /*out*/;
            resourceInputs["inviterUsername"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectInvitation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectInvitation resources.
 */
export interface ProjectInvitationState {
    /**
     * Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     */
    invitationId?: pulumi.Input<string>;
    /**
     * Atlas user who invited `username` to the project.
     */
    inviterUsername?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectInvitation resource.
 */
export interface ProjectInvitationArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
     */
    projectId: pulumi.Input<string>;
    /**
     * List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
     */
    roles: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
     */
    username: pulumi.Input<string>;
}
