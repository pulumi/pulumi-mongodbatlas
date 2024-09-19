// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getAtlasUser
 *
 * `mongodbatlas.getAtlasUser` Provides a MongoDB Atlas User.
 *
 * > **NOTE:** If you are the owner of a MongoDB Atlas organization or project, you can also retrieve the user profile for any user with membership in that organization or project.
 *
 * ## Example Usage
 *
 * ### Using userId attribute to query
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getAtlasUser({
 *     userId: "<USER_ID>",
 * });
 * ```
 *
 * ### Using username attribute to query
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getAtlasUser({
 *     username: "<USERNAME>",
 * });
 * ```
 */
export function getAtlasUser(args?: GetAtlasUserArgs, opts?: pulumi.InvokeOptions): Promise<GetAtlasUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getAtlasUser:getAtlasUser", {
        "userId": args.userId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getAtlasUser.
 */
export interface GetAtlasUserArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies this user.
     */
    userId?: string;
    /**
     * Email address that belongs to the MongoDB Atlas user account. You can't modify this address after creating the user.
     *
     * > **IMPORTANT:** Either `userId` or `username` must be configurated.
     */
    username?: string;
}

/**
 * A collection of values returned by getAtlasUser.
 */
export interface GetAtlasUserResult {
    /**
     * Two alphabet characters that identifies MongoDB Atlas user's geographic location. This parameter uses the ISO 3166-1a2 code format.
     */
    readonly country: string;
    /**
     * Date and time when the current account is created. This value is in the ISO 8601 timestamp format in UTC.
     */
    readonly createdAt: string;
    /**
     * Email address that belongs to the MongoDB Atlas user.
     */
    readonly emailAddress: string;
    /**
     * First or given name that belongs to the MongoDB Atlas user.
     */
    readonly firstName: string;
    /**
     * @deprecated Please use userId id attribute instead
     */
    readonly id: string;
    /**
     * Date and time when the current account last authenticated. This value is in the ISO 8601 timestamp format in UTC.
     */
    readonly lastAuth: string;
    /**
     * Last name, family name, or surname that belongs to the MongoDB Atlas user.
     */
    readonly lastName: string;
    readonly links: outputs.GetAtlasUserLink[];
    /**
     * Mobile phone number that belongs to the MongoDB Atlas user.
     */
    readonly mobileNumber: string;
    readonly roles: outputs.GetAtlasUserRole[];
    /**
     * List of unique 24-hexadecimal digit strings that identifies the teams to which this MongoDB Atlas user belongs.
     * * `links.#.href` - Uniform Resource Locator (URL) that points another API resource to which this response has some relationship. This URL often begins with https://cloud.mongodb.com/api/atlas.
     * * `links.#.rel` - Uniform Resource Locator (URL) that defines the semantic relationship between this resource and another API resource. This URL often begins with https://cloud.mongodb.com/api/atlas.
     * * `roles.#.group_id` - Unique 24-hexadecimal digit string that identifies the project to which this role belongs. You can set a value for this parameter or orgId but not both in the same request.
     * * `roles.#.org_id` - Unique 24-hexadecimal digit string that identifies the organization to which this role belongs. You can set a value for this parameter or groupId but not both in the same request.
     * * `roles.#.role_name` - Human-readable label that identifies the collection of privileges that MongoDB Atlas grants a specific API key, user, or team. These roles include organization- and project-level roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#service-user-roles) describes the valid roles that can be assigned.
     */
    readonly teamIds: string[];
    readonly userId?: string;
    readonly username?: string;
}
/**
 * ## # Data Source: mongodbatlas.getAtlasUser
 *
 * `mongodbatlas.getAtlasUser` Provides a MongoDB Atlas User.
 *
 * > **NOTE:** If you are the owner of a MongoDB Atlas organization or project, you can also retrieve the user profile for any user with membership in that organization or project.
 *
 * ## Example Usage
 *
 * ### Using userId attribute to query
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getAtlasUser({
 *     userId: "<USER_ID>",
 * });
 * ```
 *
 * ### Using username attribute to query
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getAtlasUser({
 *     username: "<USERNAME>",
 * });
 * ```
 */
export function getAtlasUserOutput(args?: GetAtlasUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAtlasUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getAtlasUser:getAtlasUser", {
        "userId": args.userId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getAtlasUser.
 */
export interface GetAtlasUserOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies this user.
     */
    userId?: pulumi.Input<string>;
    /**
     * Email address that belongs to the MongoDB Atlas user account. You can't modify this address after creating the user.
     *
     * > **IMPORTANT:** Either `userId` or `username` must be configurated.
     */
    username?: pulumi.Input<string>;
}
