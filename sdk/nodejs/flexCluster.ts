// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Resource: mongodbatlas.FlexCluster
 *
 * `mongodbatlas.FlexCluster` provides a Flex Cluster resource. The resource lets you create, update, delete and import a flex cluster.
 *
 * **RECOMMENDATION:** We recommend using the `mongodbatlas.AdvancedCluster` resource instead of the `mongodbatlas.FlexCluster` resource to create and manage Flex clusters. The `mongodbatlas.AdvancedCluster` resource not only supports Flex clusters, but also supports tenant and dedicated clusters, providing easier migration between different cluster types. For more information, see the Advanced Cluster resource.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * You can import the Flex Cluster resource by using the Project ID and Flex Cluster name, in the format `PROJECT_ID-FLEX_CLUSTER_NAME`. For example:
 *
 * For more information see: [MongoDB Atlas API - Flex Cluster](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Flex-Clusters/operation/createFlexcluster) Documentation.
 */
export class FlexCluster extends pulumi.CustomResource {
    /**
     * Get an existing FlexCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlexClusterState, opts?: pulumi.CustomResourceOptions): FlexCluster {
        return new FlexCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/flexCluster:FlexCluster';

    /**
     * Returns true if the given object is an instance of FlexCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlexCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlexCluster.__pulumiType;
    }

    /**
     * Flex backup configuration
     */
    public /*out*/ readonly backupSettings!: pulumi.Output<outputs.FlexClusterBackupSettings>;
    /**
     * Flex cluster topology.
     */
    public /*out*/ readonly clusterType!: pulumi.Output<string>;
    /**
     * Collection of Uniform Resource Locators that point to the MongoDB database.
     */
    public /*out*/ readonly connectionStrings!: pulumi.Output<outputs.FlexClusterConnectionStrings>;
    /**
     * Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
     */
    public /*out*/ readonly createDate!: pulumi.Output<string>;
    /**
     * Version of MongoDB that the instance runs.
     */
    public /*out*/ readonly mongoDbVersion!: pulumi.Output<string>;
    /**
     * Human-readable label that identifies the instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
     */
    public readonly providerSettings!: pulumi.Output<outputs.FlexClusterProviderSettings>;
    /**
     * Human-readable label that indicates the current operating condition of this instance.
     */
    public /*out*/ readonly stateName!: pulumi.Output<string>;
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
     */
    public readonly terminationProtectionEnabled!: pulumi.Output<boolean>;
    /**
     * Method by which the cluster maintains the MongoDB versions.
     */
    public /*out*/ readonly versionReleaseSystem!: pulumi.Output<string>;

    /**
     * Create a FlexCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlexClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlexClusterArgs | FlexClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlexClusterState | undefined;
            resourceInputs["backupSettings"] = state ? state.backupSettings : undefined;
            resourceInputs["clusterType"] = state ? state.clusterType : undefined;
            resourceInputs["connectionStrings"] = state ? state.connectionStrings : undefined;
            resourceInputs["createDate"] = state ? state.createDate : undefined;
            resourceInputs["mongoDbVersion"] = state ? state.mongoDbVersion : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerSettings"] = state ? state.providerSettings : undefined;
            resourceInputs["stateName"] = state ? state.stateName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["terminationProtectionEnabled"] = state ? state.terminationProtectionEnabled : undefined;
            resourceInputs["versionReleaseSystem"] = state ? state.versionReleaseSystem : undefined;
        } else {
            const args = argsOrState as FlexClusterArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerSettings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerSettings'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerSettings"] = args ? args.providerSettings : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["terminationProtectionEnabled"] = args ? args.terminationProtectionEnabled : undefined;
            resourceInputs["backupSettings"] = undefined /*out*/;
            resourceInputs["clusterType"] = undefined /*out*/;
            resourceInputs["connectionStrings"] = undefined /*out*/;
            resourceInputs["createDate"] = undefined /*out*/;
            resourceInputs["mongoDbVersion"] = undefined /*out*/;
            resourceInputs["stateName"] = undefined /*out*/;
            resourceInputs["versionReleaseSystem"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FlexCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlexCluster resources.
 */
export interface FlexClusterState {
    /**
     * Flex backup configuration
     */
    backupSettings?: pulumi.Input<inputs.FlexClusterBackupSettings>;
    /**
     * Flex cluster topology.
     */
    clusterType?: pulumi.Input<string>;
    /**
     * Collection of Uniform Resource Locators that point to the MongoDB database.
     */
    connectionStrings?: pulumi.Input<inputs.FlexClusterConnectionStrings>;
    /**
     * Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
     */
    createDate?: pulumi.Input<string>;
    /**
     * Version of MongoDB that the instance runs.
     */
    mongoDbVersion?: pulumi.Input<string>;
    /**
     * Human-readable label that identifies the instance.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
     */
    providerSettings?: pulumi.Input<inputs.FlexClusterProviderSettings>;
    /**
     * Human-readable label that indicates the current operating condition of this instance.
     */
    stateName?: pulumi.Input<string>;
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
     */
    terminationProtectionEnabled?: pulumi.Input<boolean>;
    /**
     * Method by which the cluster maintains the MongoDB versions.
     */
    versionReleaseSystem?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlexCluster resource.
 */
export interface FlexClusterArgs {
    /**
     * Human-readable label that identifies the instance.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
     */
    providerSettings: pulumi.Input<inputs.FlexClusterProviderSettings>;
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
     */
    terminationProtectionEnabled?: pulumi.Input<boolean>;
}
