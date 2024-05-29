// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.Project` provides a Project resource. This allows project to be created.
 *
 * > **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete the Atlas project if any snapshots exist.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = mongodbatlas.getRolesOrgId({});
 * const testProject = new mongodbatlas.Project("test", {
 *     name: "project-name",
 *     orgId: test.then(test => test.orgId),
 *     projectOwnerId: "<OWNER_ACCOUNT_ID>",
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
 *     limits: [
 *         {
 *             name: "atlas.project.deployment.clusters",
 *             value: 26,
 *         },
 *         {
 *             name: "atlas.project.deployment.nodesPerPrivateLinkRegion",
 *             value: 51,
 *         },
 *     ],
 *     isCollectDatabaseSpecificsStatisticsEnabled: true,
 *     isDataExplorerEnabled: true,
 *     isExtendedStorageSizesEnabled: true,
 *     isPerformanceAdvisorEnabled: true,
 *     isRealtimePerformancePanelEnabled: true,
 *     isSchemaAdvisorEnabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * Project must be imported using project ID, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/project:Project my_project 5d09d6a59ccf6445652a444a
 * ```
 * For more information see: [MongoDB Atlas Admin API Projects](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects) and [MongoDB Atlas Admin API Teams](https://docs.atlas.mongodb.com/reference/api/teams/) Documentation for more information.
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * The number of Atlas clusters deployed in the project.
     */
    public /*out*/ readonly clusterCount!: pulumi.Output<number>;
    /**
     * The ISO-8601-formatted timestamp of when Atlas created the project.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * IP addresses in a project categorized by services. See IP Addresses.
     */
    public /*out*/ readonly ipAddresses!: pulumi.Output<outputs.ProjectIpAddresses>;
    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     */
    public readonly isCollectDatabaseSpecificsStatisticsEnabled!: pulumi.Output<boolean>;
    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
     */
    public readonly isDataExplorerEnabled!: pulumi.Output<boolean>;
    /**
     * Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     */
    public readonly isExtendedStorageSizesEnabled!: pulumi.Output<boolean>;
    /**
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     */
    public readonly isPerformanceAdvisorEnabled!: pulumi.Output<boolean>;
    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     */
    public readonly isRealtimePerformancePanelEnabled!: pulumi.Output<boolean>;
    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
     */
    public readonly isSchemaAdvisorEnabled!: pulumi.Output<boolean>;
    public readonly limits!: pulumi.Output<outputs.ProjectLimit[] | undefined>;
    /**
     * The name of the project you want to create.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the organization you want to create the project within.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
     */
    public readonly projectOwnerId!: pulumi.Output<string | undefined>;
    /**
     * Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     */
    public readonly regionUsageRestrictions!: pulumi.Output<string>;
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly teams!: pulumi.Output<outputs.ProjectTeam[] | undefined>;
    /**
     * It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     */
    public readonly withDefaultAlertsSettings!: pulumi.Output<boolean>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectState | undefined;
            resourceInputs["clusterCount"] = state ? state.clusterCount : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["ipAddresses"] = state ? state.ipAddresses : undefined;
            resourceInputs["isCollectDatabaseSpecificsStatisticsEnabled"] = state ? state.isCollectDatabaseSpecificsStatisticsEnabled : undefined;
            resourceInputs["isDataExplorerEnabled"] = state ? state.isDataExplorerEnabled : undefined;
            resourceInputs["isExtendedStorageSizesEnabled"] = state ? state.isExtendedStorageSizesEnabled : undefined;
            resourceInputs["isPerformanceAdvisorEnabled"] = state ? state.isPerformanceAdvisorEnabled : undefined;
            resourceInputs["isRealtimePerformancePanelEnabled"] = state ? state.isRealtimePerformancePanelEnabled : undefined;
            resourceInputs["isSchemaAdvisorEnabled"] = state ? state.isSchemaAdvisorEnabled : undefined;
            resourceInputs["limits"] = state ? state.limits : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectOwnerId"] = state ? state.projectOwnerId : undefined;
            resourceInputs["regionUsageRestrictions"] = state ? state.regionUsageRestrictions : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["teams"] = state ? state.teams : undefined;
            resourceInputs["withDefaultAlertsSettings"] = state ? state.withDefaultAlertsSettings : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["isCollectDatabaseSpecificsStatisticsEnabled"] = args ? args.isCollectDatabaseSpecificsStatisticsEnabled : undefined;
            resourceInputs["isDataExplorerEnabled"] = args ? args.isDataExplorerEnabled : undefined;
            resourceInputs["isExtendedStorageSizesEnabled"] = args ? args.isExtendedStorageSizesEnabled : undefined;
            resourceInputs["isPerformanceAdvisorEnabled"] = args ? args.isPerformanceAdvisorEnabled : undefined;
            resourceInputs["isRealtimePerformancePanelEnabled"] = args ? args.isRealtimePerformancePanelEnabled : undefined;
            resourceInputs["isSchemaAdvisorEnabled"] = args ? args.isSchemaAdvisorEnabled : undefined;
            resourceInputs["limits"] = args ? args.limits : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectOwnerId"] = args ? args.projectOwnerId : undefined;
            resourceInputs["regionUsageRestrictions"] = args ? args.regionUsageRestrictions : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["teams"] = args ? args.teams : undefined;
            resourceInputs["withDefaultAlertsSettings"] = args ? args.withDefaultAlertsSettings : undefined;
            resourceInputs["clusterCount"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["ipAddresses"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Project.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * The number of Atlas clusters deployed in the project.
     */
    clusterCount?: pulumi.Input<number>;
    /**
     * The ISO-8601-formatted timestamp of when Atlas created the project.
     */
    created?: pulumi.Input<string>;
    /**
     * IP addresses in a project categorized by services. See IP Addresses.
     */
    ipAddresses?: pulumi.Input<inputs.ProjectIpAddresses>;
    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     */
    isCollectDatabaseSpecificsStatisticsEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
     */
    isDataExplorerEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     */
    isExtendedStorageSizesEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     */
    isPerformanceAdvisorEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     */
    isRealtimePerformancePanelEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
     */
    isSchemaAdvisorEnabled?: pulumi.Input<boolean>;
    limits?: pulumi.Input<pulumi.Input<inputs.ProjectLimit>[]>;
    /**
     * The name of the project you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization you want to create the project within.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
     */
    projectOwnerId?: pulumi.Input<string>;
    /**
     * Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     */
    regionUsageRestrictions?: pulumi.Input<string>;
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    teams?: pulumi.Input<pulumi.Input<inputs.ProjectTeam>[]>;
    /**
     * It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     */
    withDefaultAlertsSettings?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     */
    isCollectDatabaseSpecificsStatisticsEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
     */
    isDataExplorerEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     */
    isExtendedStorageSizesEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     */
    isPerformanceAdvisorEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     */
    isRealtimePerformancePanelEnabled?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
     */
    isSchemaAdvisorEnabled?: pulumi.Input<boolean>;
    limits?: pulumi.Input<pulumi.Input<inputs.ProjectLimit>[]>;
    /**
     * The name of the project you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization you want to create the project within.
     */
    orgId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
     */
    projectOwnerId?: pulumi.Input<string>;
    /**
     * Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     */
    regionUsageRestrictions?: pulumi.Input<string>;
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    teams?: pulumi.Input<pulumi.Input<inputs.ProjectTeam>[]>;
    /**
     * It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     */
    withDefaultAlertsSettings?: pulumi.Input<boolean>;
}
