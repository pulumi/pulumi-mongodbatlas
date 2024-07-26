// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getAdvancedClusters
 *
 * `mongodbatlas.getAdvancedClusters` describes all Advanced Clusters by the provided project_id. The data source requires your Project ID.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:**
 * <br> &#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
 * <br> &#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const exampleAdvancedCluster = new mongodbatlas.AdvancedCluster("example", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     name: "cluster-test",
 *     clusterType: "REPLICASET",
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             electableSpecs: {
 *                 instanceSize: "M5",
 *             },
 *             providerName: "TENANT",
 *             backingProviderName: "AWS",
 *             regionName: "US_EAST_1",
 *             priority: 7,
 *         }],
 *     }],
 * });
 * const example = mongodbatlas.getAdvancedClustersOutput({
 *     projectId: exampleAdvancedCluster.projectId,
 * });
 * ```
 */
export function getAdvancedClusters(args: GetAdvancedClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetAdvancedClustersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getAdvancedClusters:getAdvancedClusters", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdvancedClusters.
 */
export interface GetAdvancedClustersArgs {
    /**
     * The unique ID for the project to get the clusters.
     */
    projectId: string;
}

/**
 * A collection of values returned by getAdvancedClusters.
 */
export interface GetAdvancedClustersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a Cluster. See below for more details.
     */
    readonly results: outputs.GetAdvancedClustersResult[];
}
/**
 * ## # Data Source: mongodbatlas.getAdvancedClusters
 *
 * `mongodbatlas.getAdvancedClusters` describes all Advanced Clusters by the provided project_id. The data source requires your Project ID.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:**
 * <br> &#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
 * <br> &#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const exampleAdvancedCluster = new mongodbatlas.AdvancedCluster("example", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     name: "cluster-test",
 *     clusterType: "REPLICASET",
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             electableSpecs: {
 *                 instanceSize: "M5",
 *             },
 *             providerName: "TENANT",
 *             backingProviderName: "AWS",
 *             regionName: "US_EAST_1",
 *             priority: 7,
 *         }],
 *     }],
 * });
 * const example = mongodbatlas.getAdvancedClustersOutput({
 *     projectId: exampleAdvancedCluster.projectId,
 * });
 * ```
 */
export function getAdvancedClustersOutput(args: GetAdvancedClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAdvancedClustersResult> {
    return pulumi.output(args).apply((a: any) => getAdvancedClusters(a, opts))
}

/**
 * A collection of arguments for invoking getAdvancedClusters.
 */
export interface GetAdvancedClustersOutputArgs {
    /**
     * The unique ID for the project to get the clusters.
     */
    projectId: pulumi.Input<string>;
}
