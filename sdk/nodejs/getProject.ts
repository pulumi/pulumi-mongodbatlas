// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.Project` describes a MongoDB Atlas Project. This represents a project that has been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 */
export function getProject(args?: GetProjectArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getProject:getProject", {
        "name": args.name,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectArgs {
    /**
     * The unique ID for the project.
     *
     * > **IMPORTANT:** Either `projectId` or `name` must be configurated.
     */
    name?: string;
    /**
     * The unique ID for the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getProject.
 */
export interface GetProjectResult {
    readonly apiKeys: outputs.GetProjectApiKey[];
    /**
     * The number of Atlas clusters deployed in the project.
     */
    readonly clusterCount: number;
    /**
     * The ISO-8601-formatted timestamp of when Atlas created the project.
     * * `teams.#.team_id` - The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
     * * `teams.#.role_names` - Each string in the array represents a project role assigned to the team. Every user associated with the team inherits these roles.
     * The following are valid roles:
     */
    readonly created: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
     */
    readonly isCollectDatabaseSpecificsStatisticsEnabled: boolean;
    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
     */
    readonly isDataExplorerEnabled: boolean;
    /**
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
     */
    readonly isPerformanceAdvisorEnabled: boolean;
    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
     */
    readonly isRealtimePerformancePanelEnabled: boolean;
    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
     */
    readonly isSchemaAdvisorEnabled: boolean;
    /**
     * The name of the project you want to create. (Cannot be changed via this Provider after creation.)
     */
    readonly name?: string;
    /**
     * The ID of the organization you want to create the project within.
     */
    readonly orgId: string;
    readonly projectId?: string;
    /**
     * If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     */
    readonly regionUsageRestrictions: string;
    readonly teams: outputs.GetProjectTeam[];
}
/**
 * `mongodbatlas.Project` describes a MongoDB Atlas Project. This represents a project that has been created.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 */
export function getProjectOutput(args?: GetProjectOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectResult> {
    return pulumi.output(args).apply((a: any) => getProject(a, opts))
}

/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectOutputArgs {
    /**
     * The unique ID for the project.
     *
     * > **IMPORTANT:** Either `projectId` or `name` must be configurated.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique ID for the project.
     */
    projectId?: pulumi.Input<string>;
}
