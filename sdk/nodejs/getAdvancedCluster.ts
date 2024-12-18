// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.AdvancedCluster
 *
 * `mongodbatlas.AdvancedCluster` describes an Advanced Cluster. The data source requires your Project ID.
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
 *                 instanceSize: "M0",
 *             },
 *             providerName: "TENANT",
 *             backingProviderName: "AWS",
 *             regionName: "US_EAST_1",
 *             priority: 7,
 *         }],
 *     }],
 * });
 * const example = mongodbatlas.getAdvancedClusterOutput({
 *     projectId: exampleAdvancedCluster.projectId,
 *     name: exampleAdvancedCluster.name,
 * });
 * ```
 *
 * **NOTE:** There can only be one M0 cluster per project.
 *
 * ## Example using latest sharding configurations with independent shard scaling in the cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const exampleAdvancedCluster = new mongodbatlas.AdvancedCluster("example", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     name: "cluster-test",
 *     backupEnabled: false,
 *     clusterType: "SHARDED",
 *     replicationSpecs: [
 *         {
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     diskIops: 3000,
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_WEST_1",
 *             }],
 *         },
 *         {
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M40",
 *                     diskIops: 3000,
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_WEST_1",
 *             }],
 *         },
 *     ],
 * });
 * const example = mongodbatlas.getAdvancedClusterOutput({
 *     projectId: exampleAdvancedCluster.projectId,
 *     name: exampleAdvancedCluster.name,
 *     useReplicationSpecPerShard: true,
 * });
 * ```
 */
export function getAdvancedCluster(args: GetAdvancedClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetAdvancedClusterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", {
        "name": args.name,
        "pitEnabled": args.pitEnabled,
        "projectId": args.projectId,
        "useReplicationSpecPerShard": args.useReplicationSpecPerShard,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdvancedCluster.
 */
export interface GetAdvancedClusterArgs {
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
     */
    name: string;
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     */
    pitEnabled?: boolean;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: string;
    /**
     * Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replicationSpecs` object. This enables representing clusters with independent shard scaling.
     */
    useReplicationSpecPerShard?: boolean;
}

/**
 * A collection of values returned by getAdvancedCluster.
 */
export interface GetAdvancedClusterResult {
    /**
     * Get the advanced configuration options. See Advanced Configuration below for more details.
     */
    readonly advancedConfigurations: outputs.GetAdvancedClusterAdvancedConfiguration[];
    readonly backupEnabled: boolean;
    /**
     * Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `biConnector`
     */
    readonly biConnectorConfigs: outputs.GetAdvancedClusterBiConnectorConfig[];
    /**
     * Type of the cluster that you want to create.
     */
    readonly clusterType: string;
    /**
     * Config Server Management Mode for creating or updating a sharded cluster. Valid values are `ATLAS_MANAGED` (default) and `FIXED_TO_DEDICATED`. When configured as `ATLAS_MANAGED`, Atlas may automatically switch the cluster's config server type for optimal performance and savings. When configured as `FIXED_TO_DEDICATED`, the cluster will always use a dedicated config server. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
     */
    readonly configServerManagementMode: string;
    /**
     * Describes a sharded cluster's config server type. Valid values are `DEDICATED` and `EMBEDDED`. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
     */
    readonly configServerType: string;
    /**
     * Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     */
    readonly connectionStrings: outputs.GetAdvancedClusterConnectionString[];
    readonly createDate: string;
    /**
     * Storage capacity that the host's root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
     *
     * @deprecated This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     */
    readonly diskSizeGb: number;
    /**
     * Possible values are AWS, GCP, AZURE or NONE.
     */
    readonly encryptionAtRestProvider: string;
    /**
     * Flag that indicates if cluster uses Atlas-Managed Sharding (false) or Self-Managed Sharding (true).
     */
    readonly globalClusterSelfManagedSharding: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **(DEPRECATED.)** Use `tags` instead.
     */
    readonly labels: outputs.GetAdvancedClusterLabel[];
    /**
     * Version of the cluster to deploy.
     */
    readonly mongoDbMajorVersion: string;
    /**
     * Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     */
    readonly mongoDbVersion: string;
    readonly name: string;
    /**
     * Flag that indicates whether the cluster is paused or not.
     */
    readonly paused: boolean;
    /**
     * The pinned Feature Compatibility Version (FCV) with its associated expiration date. See below.
     */
    readonly pinnedFcvs: outputs.GetAdvancedClusterPinnedFcv[];
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     */
    readonly pitEnabled: boolean;
    readonly projectId: string;
    /**
     * (Optional) Flag that enables or disables log redaction, see the [manual](https://www.mongodb.com/docs/manual/administration/monitoring/#log-redaction) for more info.
     */
    readonly redactClientLogData: boolean;
    /**
     * (Optional) Replica set scaling mode for your cluster.
     */
    readonly replicaSetScalingStrategy: string;
    /**
     * List of settings that configure your cluster regions. If `useReplicationSpecPerShard = true`, this array has one object per shard representing node configurations in each shard. For replica sets there is only one object representing node configurations. See below.
     */
    readonly replicationSpecs: outputs.GetAdvancedClusterReplicationSpec[];
    /**
     * Certificate Authority that MongoDB Atlas clusters use.
     */
    readonly rootCertType: string;
    /**
     * Current state of the cluster. The possible states are:
     */
    readonly stateName: string;
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     */
    readonly tags: outputs.GetAdvancedClusterTag[];
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    readonly terminationProtectionEnabled: boolean;
    readonly useReplicationSpecPerShard?: boolean;
    /**
     * Release cadence that Atlas uses for this cluster.
     */
    readonly versionReleaseSystem: string;
}
/**
 * ## # Data Source: mongodbatlas.AdvancedCluster
 *
 * `mongodbatlas.AdvancedCluster` describes an Advanced Cluster. The data source requires your Project ID.
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
 *                 instanceSize: "M0",
 *             },
 *             providerName: "TENANT",
 *             backingProviderName: "AWS",
 *             regionName: "US_EAST_1",
 *             priority: 7,
 *         }],
 *     }],
 * });
 * const example = mongodbatlas.getAdvancedClusterOutput({
 *     projectId: exampleAdvancedCluster.projectId,
 *     name: exampleAdvancedCluster.name,
 * });
 * ```
 *
 * **NOTE:** There can only be one M0 cluster per project.
 *
 * ## Example using latest sharding configurations with independent shard scaling in the cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const exampleAdvancedCluster = new mongodbatlas.AdvancedCluster("example", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     name: "cluster-test",
 *     backupEnabled: false,
 *     clusterType: "SHARDED",
 *     replicationSpecs: [
 *         {
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M30",
 *                     diskIops: 3000,
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_WEST_1",
 *             }],
 *         },
 *         {
 *             regionConfigs: [{
 *                 electableSpecs: {
 *                     instanceSize: "M40",
 *                     diskIops: 3000,
 *                     nodeCount: 3,
 *                 },
 *                 providerName: "AWS",
 *                 priority: 7,
 *                 regionName: "EU_WEST_1",
 *             }],
 *         },
 *     ],
 * });
 * const example = mongodbatlas.getAdvancedClusterOutput({
 *     projectId: exampleAdvancedCluster.projectId,
 *     name: exampleAdvancedCluster.name,
 *     useReplicationSpecPerShard: true,
 * });
 * ```
 */
export function getAdvancedClusterOutput(args: GetAdvancedClusterOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAdvancedClusterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", {
        "name": args.name,
        "pitEnabled": args.pitEnabled,
        "projectId": args.projectId,
        "useReplicationSpecPerShard": args.useReplicationSpecPerShard,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdvancedCluster.
 */
export interface GetAdvancedClusterOutputArgs {
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
     */
    name: pulumi.Input<string>;
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     */
    pitEnabled?: pulumi.Input<boolean>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
    /**
     * Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replicationSpecs` object. This enables representing clusters with independent shard scaling.
     */
    useReplicationSpecPerShard?: pulumi.Input<boolean>;
}
