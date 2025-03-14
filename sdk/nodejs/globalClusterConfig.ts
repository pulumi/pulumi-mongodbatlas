// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Resource: mongodbatlas.GlobalClusterConfig
 *
 * `mongodbatlas.GlobalClusterConfig` provides a Global Cluster Configuration resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **NOTE:** This resource can only be used with Atlas-managed clusters. See doc for `globalClusterSelfManagedSharding` attribute in `mongodbatlas.AdvancedCluster` resource for more information.
 *
 * > **IMPORTANT:** You can update a Global Cluster Configuration to add new custom zone mappings and managed namespaces. However, once configured, you can't modify or partially delete custom zone mappings (you must remove them all at once). You can add or remove, but can't modify, managed namespaces. Any update that changes an existing managed namespace results in an error. [Read more about Global Cluster Configuration](https://www.mongodb.com/docs/atlas/global-clusters/). For more details, see [Global Clusters API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Global-Clusters)
 *
 * ## Examples Usage
 *
 * ### Example Global cluster
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
 * const config = new mongodbatlas.GlobalClusterConfig("config", {
 *     projectId: test.projectId,
 *     clusterName: test.name,
 *     managedNamespaces: [{
 *         db: "mydata",
 *         collection: "publishers",
 *         customShardKey: "city",
 *         isCustomShardKeyHashed: false,
 *         isShardKeyUnique: false,
 *     }],
 *     customZoneMappings: [{
 *         location: "CA",
 *         zone: "Zone 1",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)
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

    /**
     * The name of the Global Cluster.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `customZoneMappingZoneId` instead.
     *
     * @deprecated This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.
     */
    public /*out*/ readonly customZoneMapping!: pulumi.Output<{[key: string]: string}>;
    /**
     * A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     */
    public /*out*/ readonly customZoneMappingZoneId!: pulumi.Output<{[key: string]: string}>;
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     */
    public readonly customZoneMappings!: pulumi.Output<outputs.GlobalClusterConfigCustomZoneMapping[] | undefined>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    public readonly managedNamespaces!: pulumi.Output<outputs.GlobalClusterConfigManagedNamespace[]>;
    /**
     * The unique ID for the project.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalClusterConfigState | undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["customZoneMapping"] = state ? state.customZoneMapping : undefined;
            resourceInputs["customZoneMappingZoneId"] = state ? state.customZoneMappingZoneId : undefined;
            resourceInputs["customZoneMappings"] = state ? state.customZoneMappings : undefined;
            resourceInputs["managedNamespaces"] = state ? state.managedNamespaces : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as GlobalClusterConfigArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["customZoneMappings"] = args ? args.customZoneMappings : undefined;
            resourceInputs["managedNamespaces"] = args ? args.managedNamespaces : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["customZoneMapping"] = undefined /*out*/;
            resourceInputs["customZoneMappingZoneId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalClusterConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalClusterConfig resources.
 */
export interface GlobalClusterConfigState {
    /**
     * The name of the Global Cluster.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `customZoneMappingZoneId` instead.
     *
     * @deprecated This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.
     */
    customZoneMapping?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     */
    customZoneMappingZoneId?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     */
    customZoneMappings?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigCustomZoneMapping>[]>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    managedNamespaces?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigManagedNamespace>[]>;
    /**
     * The unique ID for the project.
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GlobalClusterConfig resource.
 */
export interface GlobalClusterConfigArgs {
    /**
     * The name of the Global Cluster.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     */
    customZoneMappings?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigCustomZoneMapping>[]>;
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     */
    managedNamespaces?: pulumi.Input<pulumi.Input<inputs.GlobalClusterConfigManagedNamespace>[]>;
    /**
     * The unique ID for the project.
     */
    projectId: pulumi.Input<string>;
}
