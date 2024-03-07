// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getProjects` describe all Projects. This represents projects that have been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRolesOrgId = mongodbatlas.getRolesOrgId({});
 * const testProject = new mongodbatlas.Project("testProject", {
 *     orgId: testRolesOrgId.then(testRolesOrgId => testRolesOrgId.orgId),
 *     teams: [
 *         {
 *             teamId: "5e0fa8c99ccf641c722fe645",
 *             roleNames: ["GROUP_OWNER"],
 *         },
 *         {
 *             teamId: "5e1dd7b4f2a30ba80a70cd4rw",
 *             roleNames: [
 *                 "GROUP_READ_ONLY",
 *                 "GROUP_DATA_ACCESS_READ_WRITE",
 *             ],
 *         },
 *     ],
 *     limits: [{
 *         name: "atlas.project.deployment.clusters",
 *         value: 26,
 *     }],
 * });
 * const testProjects = mongodbatlas.getProjects({
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getProjects(args?: GetProjectsArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getProjects:getProjects", {
        "itemsPerPage": args.itemsPerPage,
        "pageNum": args.pageNum,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjects.
 */
export interface GetProjectsArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: number;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: number;
}

/**
 * A collection of values returned by getProjects.
 */
export interface GetProjectsResult {
    /**
     * @deprecated Please use each project's id attribute instead
     */
    readonly id: string;
    readonly itemsPerPage?: number;
    readonly pageNum?: number;
    readonly results: outputs.GetProjectsResult[];
    readonly totalCount: number;
}
/**
 * `mongodbatlas.getProjects` describe all Projects. This represents projects that have been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRolesOrgId = mongodbatlas.getRolesOrgId({});
 * const testProject = new mongodbatlas.Project("testProject", {
 *     orgId: testRolesOrgId.then(testRolesOrgId => testRolesOrgId.orgId),
 *     teams: [
 *         {
 *             teamId: "5e0fa8c99ccf641c722fe645",
 *             roleNames: ["GROUP_OWNER"],
 *         },
 *         {
 *             teamId: "5e1dd7b4f2a30ba80a70cd4rw",
 *             roleNames: [
 *                 "GROUP_READ_ONLY",
 *                 "GROUP_DATA_ACCESS_READ_WRITE",
 *             ],
 *         },
 *     ],
 *     limits: [{
 *         name: "atlas.project.deployment.clusters",
 *         value: 26,
 *     }],
 * });
 * const testProjects = mongodbatlas.getProjects({
 *     pageNum: 1,
 *     itemsPerPage: 5,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getProjectsOutput(args?: GetProjectsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectsResult> {
    return pulumi.output(args).apply((a: any) => getProjects(a, opts))
}

/**
 * A collection of arguments for invoking getProjects.
 */
export interface GetProjectsOutputArgs {
    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     */
    itemsPerPage?: pulumi.Input<number>;
    /**
     * The page to return. Defaults to `1`.
     */
    pageNum?: pulumi.Input<number>;
}
