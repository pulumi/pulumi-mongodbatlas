// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.GlobalClusterConfig` provides a Global Cluster Configuration resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Examples Usage
 *
 * ### Example Global cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.Cluster("test", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     diskSizeGb: 80,
 *     backupEnabled: false,
 *     providerBackupEnabled: true,
 *     clusterType: "GEOSHARDED",
 *     providerName: "AWS",
 *     providerDiskIops: 240,
 *     providerInstanceSizeName: "M30",
 *     replicationSpecs: [
 *         {
 *             zoneName: "Zone 1",
 *             numShards: 1,
 *             regionsConfigs: [{
 *                 regionName: "EU_CENTRAL_1",
 *                 electableNodes: 3,
 *                 priority: 7,
 *                 readOnlyNodes: 0,
 *             }],
 *         },
 *         {
 *             zoneName: "Zone 2",
 *             numShards: 1,
 *             regionsConfigs: [{
 *                 regionName: "US_EAST_2",
 *                 electableNodes: 3,
 *                 priority: 7,
 *                 readOnlyNodes: 0,
 *             }],
 *         },
 *     ],
 * });
 * const config = new mongodbatlas.GlobalClusterConfig("config", {
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
 * ```
 *
 * ### Example Global cluster config
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const cluster_test = new mongodbatlas.Cluster("cluster-test", {
 *     projectId: "<YOUR-PROJECT-ID>",
 *     numShards: 1,
 *     replicationFactor: 3,
 *     backupEnabled: true,
 *     autoScalingDiskGbEnabled: true,
 *     mongoDbMajorVersion: "4.0",
 *     providerName: "AWS",
 *     diskSizeGb: 100,
 *     providerDiskIops: 300,
 *     providerEncryptEbsVolume: false,
 *     providerInstanceSizeName: "M40",
 *     providerRegionName: "US_EAST_1",
 * });
 * const config = new mongodbatlas.GlobalClusterConfig("config", {
 *     projectId: mongodbatlas_cluster.test.project_id,
 *     clusterName: mongodbatlas_cluster.test.name,
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
 * ```
 */
export class GlobalClusterConfig extends pulumi.CustomResource {
    /**
     * Get an existing GlobalClusterConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalClusterConfigState, opts?: pulumi.CustomResourceOptions): GlobalClusterConfig {
        return new GlobalClusterConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/globalClusterConfig:GlobalClusterConfig';

    /**
     * Returns true if the given object is an instance of GlobalClusterConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalClusterConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalClusterConfig.__pulumiType;
    }

    public readonly clusterName!: pulumi.Output<string>;
    /**
     * A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     */
    public /*out*/ readonly customZoneMapping!: pulumi.Output<{[key: string]: any}>;
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     */
    public readonly customZoneMappings!: pulumi.Output<outputs.GlobalClusterConfigCustomZoneMapping[] | undefined>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    public readonly managedNamespaces!: pulumi.Output<outputs.GlobalClusterConfigManagedNamespace[]>;
    /**
     * The unique ID for the project to create the database user.
     * * `clusterName - (Required) The name of the Global Cluster.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a GlobalClusterConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlobalClusterConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalClusterConfigArgs | GlobalClusterConfigState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GlobalClusterConfigState | undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["customZoneMapping"] = state ? state.customZoneMapping : undefined;
            inputs["customZoneMappings"] = state ? state.customZoneMappings : undefined;
            inputs["managedNamespaces"] = state ? state.managedNamespaces : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as GlobalClusterConfigArgs | undefined;
            if (!args || args.clusterName === undefined) {
                throw new Error("Missing required property 'clusterName'");
            }
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["customZoneMappings"] = args ? args.customZoneMappings : undefined;
            inputs["managedNamespaces"] = args ? args.managedNamespaces : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["customZoneMapping"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(GlobalClusterConfig.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalClusterConfig resources.
 */
export interface GlobalClusterConfigState {
    readonly clusterName?: pulumi.Input<string>;
    /**
     * A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     */
    readonly customZoneMapping?: pulumi.Input<{[key: string]: any}>;
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     */
    readonly customZoneMappings?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigCustomZoneMapping>[]>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    readonly managedNamespaces?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigManagedNamespace>[]>;
    /**
     * The unique ID for the project to create the database user.
     * * `clusterName - (Required) The name of the Global Cluster.
     */
    readonly projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GlobalClusterConfig resource.
 */
export interface GlobalClusterConfigArgs {
    readonly clusterName: pulumi.Input<string>;
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     */
    readonly customZoneMappings?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigCustomZoneMapping>[]>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    readonly managedNamespaces?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigManagedNamespace>[]>;
    /**
     * The unique ID for the project to create the database user.
     * * `clusterName - (Required) The name of the Global Cluster.
     */
    readonly projectId: pulumi.Input<string>;
}
