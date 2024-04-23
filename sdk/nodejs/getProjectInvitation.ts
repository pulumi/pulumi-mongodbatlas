// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ProjectInvitation` describes an invitation to a user to join an Atlas project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find GROUP-ID in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testProjectInvitation = new mongodbatlas.ProjectInvitation("test", {
 *     username: "test-acc-username",
 *     projectId: "<PROJECT-ID>",
 *     roles: ["GROUP_DATA_ACCESS_READ_WRITE"],
 * });
 * const test = mongodbatlas.getProjectInvitationOutput({
 *     projectId: testProjectInvitation.projectId,
 *     username: testProjectInvitation.username,
 * });
 * ```
 */
export function getProjectInvitation(args: GetProjectInvitationArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectInvitationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getProjectInvitation:getProjectInvitation", {
        "invitationId": args.invitationId,
        "projectId": args.projectId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectInvitation.
 */
export interface GetProjectInvitationArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     */
    invitationId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
     */
    projectId: string;
    /**
     * Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
     */
    username: string;
}

/**
 * A collection of values returned by getProjectInvitation.
 */
export interface GetProjectInvitationResult {
    /**
     * Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     */
    readonly createdAt: string;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     */
    readonly expiresAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly invitationId: string;
    /**
     * Atlas user who invited `username` to the project.
     */
    readonly inviterUsername: string;
    readonly projectId: string;
    /**
     * Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
     */
    readonly roles: string[];
    readonly username: string;
}
/**
 * `mongodbatlas.ProjectInvitation` describes an invitation to a user to join an Atlas project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find GROUP-ID in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testProjectInvitation = new mongodbatlas.ProjectInvitation("test", {
 *     username: "test-acc-username",
 *     projectId: "<PROJECT-ID>",
 *     roles: ["GROUP_DATA_ACCESS_READ_WRITE"],
 * });
 * const test = mongodbatlas.getProjectInvitationOutput({
 *     projectId: testProjectInvitation.projectId,
 *     username: testProjectInvitation.username,
 * });
 * ```
 */
export function getProjectInvitationOutput(args: GetProjectInvitationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectInvitationResult> {
    return pulumi.output(args).apply((a: any) => getProjectInvitation(a, opts))
}

/**
 * A collection of arguments for invoking getProjectInvitation.
 */
export interface GetProjectInvitationOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     */
    invitationId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
     */
    projectId: pulumi.Input<string>;
    /**
     * Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
     */
    username: pulumi.Input<string>;
}
