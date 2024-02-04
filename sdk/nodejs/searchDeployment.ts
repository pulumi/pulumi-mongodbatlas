// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.SearchDeployment` provides a Search Deployment resource. The resource lets you create, edit and delete dedicated search nodes in a cluster.
 *
 * > **NOTE:** For details on supported cloud providers and existing limitations you can visit the [Search Node Documentation](https://www.mongodb.com/docs/atlas/cluster-config/multi-cloud-distribution/#search-nodes-for-workload-isolation).
 *
 * > **NOTE:** Only a single search deployment resource can be defined for each cluster.
 *
 * ## Example Usage
 */
export class SearchDeployment extends pulumi.CustomResource {
    /**
     * Get an existing SearchDeployment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SearchDeploymentState, opts?: pulumi.CustomResourceOptions): SearchDeployment {
        return new SearchDeployment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/searchDeployment:SearchDeployment';

    /**
     * Returns true if the given object is an instance of SearchDeployment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SearchDeployment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SearchDeployment.__pulumiType;
    }

    /**
     * Label that identifies the cluster to return the search nodes for.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
     */
    public readonly specs!: pulumi.Output<outputs.SearchDeploymentSpec[]>;
    /**
     * Human-readable label that indicates the current operating condition of this search deployment.
     */
    public /*out*/ readonly stateName!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.SearchDeploymentTimeouts | undefined>;

    /**
     * Create a SearchDeployment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SearchDeploymentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SearchDeploymentArgs | SearchDeploymentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SearchDeploymentState | undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["specs"] = state ? state.specs : undefined;
            resourceInputs["stateName"] = state ? state.stateName : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
        } else {
            const args = argsOrState as SearchDeploymentArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.specs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'specs'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["specs"] = args ? args.specs : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["stateName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SearchDeployment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SearchDeployment resources.
 */
export interface SearchDeploymentState {
    /**
     * Label that identifies the cluster to return the search nodes for.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
     */
    specs?: pulumi.Input<pulumi.Input<inputs.SearchDeploymentSpec>[]>;
    /**
     * Human-readable label that indicates the current operating condition of this search deployment.
     */
    stateName?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.SearchDeploymentTimeouts>;
}

/**
 * The set of arguments for constructing a SearchDeployment resource.
 */
export interface SearchDeploymentArgs {
    /**
     * Label that identifies the cluster to return the search nodes for.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal character string that identifies the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
     */
    specs: pulumi.Input<pulumi.Input<inputs.SearchDeploymentSpec>[]>;
    timeouts?: pulumi.Input<inputs.SearchDeploymentTimeouts>;
}
