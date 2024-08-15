// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.GlobalClusterConfig
 *
 * `mongodbatlas.GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.AdvancedCluster("test", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     name: "<CLUSTER-NAME>",
 *     clusterType: "GEOSHARDED",
 *     backupEnabled: true,
 *     replicationSpecs: [
 *         {
 *             zoneName: "Zone 1",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_CENTRAL_1",
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 1",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_CENTRAL_1",
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 2",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "US_EAST_2",
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 2",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "US_EAST_2",
 *             }],
 *         },
 *     ],
 * });
 * const configGlobalClusterConfig = new mongodbatlas.GlobalClusterConfig("config", {
 *     projectId: test.projectId,
 *     clusterName: test.name,
 *     managedNamespaces: [{
 *         db: "mydata",
 *         collection: "publishers",
 *         customShardKey: "city",
 *     }],
 *     customZoneMappings: [{
 *         location: "CA",
 *         zone: "Zone 1",
 *     }],
 * });
 * const config = mongodbatlas.getGlobalClusterConfigOutput({
 *     projectId: configGlobalClusterConfig.projectId,
 *     clusterName: configGlobalClusterConfig.clusterName,
 * });
 * ```
 */
export function getGlobalClusterConfig(args: GetGlobalClusterConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalClusterConfigResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig", {
        "clusterName": args.clusterName,
        "managedNamespaces": args.managedNamespaces,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalClusterConfig.
 */
export interface GetGlobalClusterConfigArgs {
    clusterName: string;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    managedNamespaces?: inputs.GetGlobalClusterConfigManagedNamespace[];
    /**
     * The unique ID for the project to create the database user.
     * * `clusterName - (Required) The name of the Global Cluster.
     */
    projectId: string;
}

/**
 * A collection of values returned by getGlobalClusterConfig.
 */
export interface GetGlobalClusterConfigResult {
    readonly clusterName: string;
    /**
     * A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     */
    readonly customZoneMapping: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    readonly managedNamespaces: outputs.GetGlobalClusterConfigManagedNamespace[];
    readonly projectId: string;
}
/**
 * ## # Data Source: mongodbatlas.GlobalClusterConfig
 *
 * `mongodbatlas.GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.AdvancedCluster("test", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     name: "<CLUSTER-NAME>",
 *     clusterType: "GEOSHARDED",
 *     backupEnabled: true,
 *     replicationSpecs: [
 *         {
 *             zoneName: "Zone 1",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_CENTRAL_1",
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 1",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_CENTRAL_1",
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 2",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "US_EAST_2",
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 2",
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "US_EAST_2",
 *             }],
 *         },
 *     ],
 * });
 * const configGlobalClusterConfig = new mongodbatlas.GlobalClusterConfig("config", {
 *     projectId: test.projectId,
 *     clusterName: test.name,
 *     managedNamespaces: [{
 *         db: "mydata",
 *         collection: "publishers",
 *         customShardKey: "city",
 *     }],
 *     customZoneMappings: [{
 *         location: "CA",
 *         zone: "Zone 1",
 *     }],
 * });
 * const config = mongodbatlas.getGlobalClusterConfigOutput({
 *     projectId: configGlobalClusterConfig.projectId,
 *     clusterName: configGlobalClusterConfig.clusterName,
 * });
 * ```
 */
export function getGlobalClusterConfigOutput(args: GetGlobalClusterConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGlobalClusterConfigResult> {
    return pulumi.output(args).apply((a: any) => getGlobalClusterConfig(a, opts))
}

/**
 * A collection of arguments for invoking getGlobalClusterConfig.
 */
export interface GetGlobalClusterConfigOutputArgs {
    clusterName: pulumi.Input<string>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    managedNamespaces?: pulumi.Input<pulumi.Input<inputs.GetGlobalClusterConfigManagedNamespaceArgs>[]>;
    /**
     * The unique ID for the project to create the database user.
     * * `clusterName - (Required) The name of the Global Cluster.
     */
    projectId: pulumi.Input<string>;
}
