// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CustomDbRole` provides a Custom DB Role resource. The customDBRoles resource lets you retrieve, create and modify the custom MongoDB roles in your cluster. Use custom MongoDB roles to specify custom sets of actions which cannot be described by the built-in Atlas database user privileges.
 *
 * > **IMPORTANT**  You define custom roles at the project level for all clusters in the project. The `mongodbatlas.CustomDbRole` resource supports a subset of MongoDB privilege actions. For a complete list of [privilege actions](https://docs.mongodb.com/manual/reference/privilege-actions/) available for this resource, see [Custom Role actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions/). Custom roles must include actions that all project's clusters support, and that are compatible with each MongoDB version used by your project's clusters. For example, if your project has MongoDB 4.2 clusters, you can't create custom roles that use actions introduced in MongoDB 4.4.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRole = new mongodbatlas.CustomDbRole("testRole", {
 *     actions: [
 *         {
 *             action: "UPDATE",
 *             resources: [{
 *                 collectionName: "",
 *                 databaseName: "anyDatabase",
 *             }],
 *         },
 *         {
 *             action: "INSERT",
 *             resources: [{
 *                 collectionName: "",
 *                 databaseName: "anyDatabase",
 *             }],
 *         },
 *         {
 *             action: "REMOVE",
 *             resources: [{
 *                 collectionName: "",
 *                 databaseName: "anyDatabase",
 *             }],
 *         },
 *     ],
 *     projectId: "<PROJECT-ID>",
 *     roleName: "myCustomRole",
 * });
 * ```
 * ### With Inherited Roles
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const inheritedRoleOne = new mongodbatlas.CustomDbRole("inheritedRoleOne", {
 *     projectId: "<PROJECT-ID>",
 *     roleName: "insertRole",
 *     actions: [{
 *         action: "INSERT",
 *         resources: [{
 *             collectionName: "",
 *             databaseName: "anyDatabase",
 *         }],
 *     }],
 * });
 * const inheritedRoleTwo = new mongodbatlas.CustomDbRole("inheritedRoleTwo", {
 *     projectId: inheritedRoleOne.projectId,
 *     roleName: "statusServerRole",
 *     actions: [{
 *         action: "SERVER_STATUS",
 *         resources: [{
 *             cluster: true,
 *         }],
 *     }],
 * });
 * const testRole = new mongodbatlas.CustomDbRole("testRole", {
 *     projectId: inheritedRoleOne.projectId,
 *     roleName: "myCustomRole",
 *     actions: [
 *         {
 *             action: "UPDATE",
 *             resources: [{
 *                 collectionName: "",
 *                 databaseName: "anyDatabase",
 *             }],
 *         },
 *         {
 *             action: "REMOVE",
 *             resources: [{
 *                 collectionName: "",
 *                 databaseName: "anyDatabase",
 *             }],
 *         },
 *     ],
 *     inheritedRoles: [
 *         {
 *             roleName: inheritedRoleOne.roleName,
 *             databaseName: "admin",
 *         },
 *         {
 *             roleName: inheritedRoleTwo.roleName,
 *             databaseName: "admin",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Database users can be imported using project ID and username, in the format `PROJECTID-ROLENAME`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/customDbRole:CustomDbRole my_role 1112222b3bf99403840e8934-MyCustomRole
 * ```
 *
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/custom-roles/)
 */
export class CustomDbRole extends pulumi.CustomResource {
    /**
     * Get an existing CustomDbRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomDbRoleState, opts?: pulumi.CustomResourceOptions): CustomDbRole {
        return new CustomDbRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/customDbRole:CustomDbRole';

    /**
     * Returns true if the given object is an instance of CustomDbRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomDbRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomDbRole.__pulumiType;
    }

    public readonly actions!: pulumi.Output<outputs.CustomDbRoleAction[] | undefined>;
    public readonly inheritedRoles!: pulumi.Output<outputs.CustomDbRoleInheritedRole[] | undefined>;
    /**
     * The unique ID for the project to create the database user.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Name of the custom role.
     *
     * > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     *
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     */
    public readonly roleName!: pulumi.Output<string>;

    /**
     * Create a CustomDbRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomDbRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomDbRoleArgs | CustomDbRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomDbRoleState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["inheritedRoles"] = state ? state.inheritedRoles : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
        } else {
            const args = argsOrState as CustomDbRoleArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["inheritedRoles"] = args ? args.inheritedRoles : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomDbRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomDbRole resources.
 */
export interface CustomDbRoleState {
    actions?: pulumi.Input<pulumi.Input<inputs.CustomDbRoleAction>[]>;
    inheritedRoles?: pulumi.Input<pulumi.Input<inputs.CustomDbRoleInheritedRole>[]>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Name of the custom role.
     *
     * > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     *
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     */
    roleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomDbRole resource.
 */
export interface CustomDbRoleArgs {
    actions?: pulumi.Input<pulumi.Input<inputs.CustomDbRoleAction>[]>;
    inheritedRoles?: pulumi.Input<pulumi.Input<inputs.CustomDbRoleInheritedRole>[]>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
    /**
     * Name of the custom role.
     *
     * > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
     *
     * * Is a name already used by an existing custom role in the project
     * * Is a name of any of the built-in roles
     * * Is `atlasAdmin`
     * * Starts with `xgen-`
     */
    roleName: pulumi.Input<string>;
}
