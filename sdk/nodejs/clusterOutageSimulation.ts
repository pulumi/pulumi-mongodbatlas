// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ClusterOutageSimulation` provides a Cluster Outage Simulation resource. For more details see https://www.mongodb.com/docs/atlas/tutorial/test-resilience/simulate-regional-outage/
 *
 * Test Outage on Minority of Electable Nodes - Select fewer than half of your electable nodes.
 *
 * Test Outage on Majority of Electable Nodes - Select at least one more than half of your electable nodes and keep at least one electable node remaining.
 *
 * **IMPORTANT:** Test Outage on Majority of Electable Nodes will leave the Atlas cluster without a majority quorum. There will be no primary so write operations will not succeed, and reads will succeed only when configured with a suitable [readPreference](https://www.mongodb.com/docs/manual/core/read-preference/). To recover the majority quorum, you will have the option to manually reconfigure your cluster by adding new nodes to existing regions or adding new regions at the risk of losing recent writes, or end the simulation.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** This resource cannot be updated.
 * **IMPORTANT:** An existing Cluster Outage Simulation cannot be imported as this resource does not support import operation.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const outageSimulation = new mongodbatlas.ClusterOutageSimulation("outage_simulation", {
 *     projectId: "64707f06c519c20c3a2b1b03",
 *     clusterName: "Cluster0",
 *     outageFilters: [
 *         {
 *             cloudProvider: "AWS",
 *             regionName: "US_EAST_1",
 *         },
 *         {
 *             cloudProvider: "AWS",
 *             regionName: "US_EAST_2",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * The `mongodbatlas_cluster_outage_simulation` resource does not support import operation.
 *
 * See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cluster-Outage-Simulation) Documentation for more information.
 */
export class ClusterOutageSimulation extends pulumi.CustomResource {
    /**
     * Get an existing ClusterOutageSimulation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterOutageSimulationState, opts?: pulumi.CustomResourceOptions): ClusterOutageSimulation {
        return new ClusterOutageSimulation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation';

    /**
     * Returns true if the given object is an instance of ClusterOutageSimulation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterOutageSimulation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterOutageSimulation.__pulumiType;
    }

    /**
     * Name of the Atlas Cluster that is/will undergoing outage simulation.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * List of settings that specify the type of cluster outage simulation.
     */
    public readonly outageFilters!: pulumi.Output<outputs.ClusterOutageSimulationOutageFilter[]>;
    /**
     * The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the outage simulation.
     */
    public /*out*/ readonly simulationId!: pulumi.Output<string>;
    /**
     * Date and time when MongoDB Cloud started the regional outage simulation.
     */
    public /*out*/ readonly startRequestDate!: pulumi.Output<string>;
    /**
     * Current phase of the outage simulation:
     * * `START_REQUESTED` - User has requested cluster outage simulation.
     * * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
     * * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
     * * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
     * * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
     * * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a ClusterOutageSimulation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterOutageSimulationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterOutageSimulationArgs | ClusterOutageSimulationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterOutageSimulationState | undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["outageFilters"] = state ? state.outageFilters : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["simulationId"] = state ? state.simulationId : undefined;
            resourceInputs["startRequestDate"] = state ? state.startRequestDate : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as ClusterOutageSimulationArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.outageFilters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outageFilters'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["outageFilters"] = args ? args.outageFilters : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["simulationId"] = undefined /*out*/;
            resourceInputs["startRequestDate"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterOutageSimulation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterOutageSimulation resources.
 */
export interface ClusterOutageSimulationState {
    /**
     * Name of the Atlas Cluster that is/will undergoing outage simulation.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * List of settings that specify the type of cluster outage simulation.
     */
    outageFilters?: pulumi.Input<pulumi.Input<inputs.ClusterOutageSimulationOutageFilter>[]>;
    /**
     * The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the outage simulation.
     */
    simulationId?: pulumi.Input<string>;
    /**
     * Date and time when MongoDB Cloud started the regional outage simulation.
     */
    startRequestDate?: pulumi.Input<string>;
    /**
     * Current phase of the outage simulation:
     * * `START_REQUESTED` - User has requested cluster outage simulation.
     * * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
     * * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
     * * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
     * * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
     * * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClusterOutageSimulation resource.
 */
export interface ClusterOutageSimulationArgs {
    /**
     * Name of the Atlas Cluster that is/will undergoing outage simulation.
     */
    clusterName: pulumi.Input<string>;
    /**
     * List of settings that specify the type of cluster outage simulation.
     */
    outageFilters: pulumi.Input<pulumi.Input<inputs.ClusterOutageSimulationOutageFilter>[]>;
    /**
     * The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     */
    projectId: pulumi.Input<string>;
}
