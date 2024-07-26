// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Resource: privatelinkEndpointServerless
 *
 * `privatelinkEndpointServerless` Provides a Serverless PrivateLink Endpoint resource.
 * This is the first of two resources required to configure PrivateLink for Serverless, the second is mongodbatlas_privatelink_endpoint_service_serverless.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ### AWS Example
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testServerlessInstance = new mongodbatlas.ServerlessInstance("test", {
 *     projectId: "<PROJECT_ID>",
 *     name: "test-db",
 *     providerSettingsBackingProviderName: "AWS",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST_1",
 *     continuousBackupEnabled: true,
 * });
 * const test = new mongodbatlas.PrivatelinkEndpointServerless("test", {
 *     projectId: "<PROJECT_ID>",
 *     instanceName: testServerlessInstance.name,
 *     providerName: "AWS",
 * });
 * ```
 *
 * ## Import
 *
 * Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
 * ```
 * For more information see: [MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).
 */
export class PrivatelinkEndpointServerless extends pulumi.CustomResource {
    /**
     * Get an existing PrivatelinkEndpointServerless resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivatelinkEndpointServerlessState, opts?: pulumi.CustomResourceOptions): PrivatelinkEndpointServerless {
        return new PrivatelinkEndpointServerless(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless';

    /**
     * Returns true if the given object is an instance of PrivatelinkEndpointServerless.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivatelinkEndpointServerless {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivatelinkEndpointServerless.__pulumiType;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the private endpoint.
     */
    public /*out*/ readonly endpointId!: pulumi.Output<string>;
    /**
     * Unique string that identifies the PrivateLink endpoint service.
     */
    public /*out*/ readonly endpointServiceName!: pulumi.Output<string>;
    /**
     * Human-readable label that identifies the serverless instance.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     */
    public /*out*/ readonly privateLinkServiceResourceId!: pulumi.Output<string>;
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Cloud provider name; AWS is currently supported
     */
    public readonly providerName!: pulumi.Output<string>;
    /**
     * Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a PrivatelinkEndpointServerless resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivatelinkEndpointServerlessArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivatelinkEndpointServerlessArgs | PrivatelinkEndpointServerlessState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivatelinkEndpointServerlessState | undefined;
            resourceInputs["endpointId"] = state ? state.endpointId : undefined;
            resourceInputs["endpointServiceName"] = state ? state.endpointServiceName : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["privateLinkServiceResourceId"] = state ? state.privateLinkServiceResourceId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerName"] = state ? state.providerName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PrivatelinkEndpointServerlessArgs | undefined;
            if ((!args || args.instanceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerName'");
            }
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerName"] = args ? args.providerName : undefined;
            resourceInputs["endpointId"] = undefined /*out*/;
            resourceInputs["endpointServiceName"] = undefined /*out*/;
            resourceInputs["privateLinkServiceResourceId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivatelinkEndpointServerless.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivatelinkEndpointServerless resources.
 */
export interface PrivatelinkEndpointServerlessState {
    /**
     * Unique 24-hexadecimal digit string that identifies the private endpoint.
     */
    endpointId?: pulumi.Input<string>;
    /**
     * Unique string that identifies the PrivateLink endpoint service.
     */
    endpointServiceName?: pulumi.Input<string>;
    /**
     * Human-readable label that identifies the serverless instance.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     */
    privateLinkServiceResourceId?: pulumi.Input<string>;
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cloud provider name; AWS is currently supported
     */
    providerName?: pulumi.Input<string>;
    /**
     * Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivatelinkEndpointServerless resource.
 */
export interface PrivatelinkEndpointServerlessArgs {
    /**
     * Human-readable label that identifies the serverless instance.
     */
    instanceName: pulumi.Input<string>;
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Cloud provider name; AWS is currently supported
     */
    providerName: pulumi.Input<string>;
}
