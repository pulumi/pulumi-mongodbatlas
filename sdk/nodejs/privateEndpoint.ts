// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.PrivateEndpoint` provides a Private Endpoint resource. This represents a Private Endpoint Connection that can be created in an Atlas project.
 *
 * > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.PrivateEndpoint("test", {
 *     projectId: "<PROJECT-ID>",
 *     providerName: "AWS",
 *     region: "us-east-1",
 * });
 * ```
 */
export class PrivateEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing PrivateEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateEndpointState, opts?: pulumi.CustomResourceOptions): PrivateEndpoint {
        return new PrivateEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/privateEndpoint:PrivateEndpoint';

    /**
     * Returns true if the given object is an instance of PrivateEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateEndpoint.__pulumiType;
    }

    /**
     * Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
     */
    public /*out*/ readonly endpointServiceName!: pulumi.Output<string>;
    /**
     * Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
     */
    public /*out*/ readonly interfaceEndpoints!: pulumi.Output<string[]>;
    /**
     * Unique identifier of the AWS PrivateLink connection.
     */
    public /*out*/ readonly privateLinkId!: pulumi.Output<string>;
    /**
     * Required 	Unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    public readonly providerName!: pulumi.Output<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are:
     * * `us-east-1`
     * * `us-east-2`
     * * `us-west-1`
     * * `us-west-2`
     * * `ca-central-1`
     * * `sa-east-1`
     * * `eu-north-1`
     * * `eu-west-1`
     * * `eu-west-2`
     * * `eu-west-3`
     * * `eu-central-1`
     * * `me-south-1`
     * * `ap-northeast-1`
     * * `ap-northeast-2`
     * * `ap-south-1`
     * * `ap-southeast-1`
     * * `ap-southeast-2`
     * * `ap-east-1`
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Status of the AWS PrivateLink connection.
     * Returns one of the following values:
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a PrivateEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateEndpointArgs | PrivateEndpointState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as PrivateEndpointState | undefined;
            inputs["endpointServiceName"] = state ? state.endpointServiceName : undefined;
            inputs["errorMessage"] = state ? state.errorMessage : undefined;
            inputs["interfaceEndpoints"] = state ? state.interfaceEndpoints : undefined;
            inputs["privateLinkId"] = state ? state.privateLinkId : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["providerName"] = state ? state.providerName : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PrivateEndpointArgs | undefined;
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            if (!args || args.providerName === undefined) {
                throw new Error("Missing required property 'providerName'");
            }
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["providerName"] = args ? args.providerName : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["endpointServiceName"] = undefined /*out*/;
            inputs["errorMessage"] = undefined /*out*/;
            inputs["interfaceEndpoints"] = undefined /*out*/;
            inputs["privateLinkId"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(PrivateEndpoint.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateEndpoint resources.
 */
export interface PrivateEndpointState {
    /**
     * Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
     */
    readonly endpointServiceName?: pulumi.Input<string>;
    /**
     * Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
     */
    readonly errorMessage?: pulumi.Input<string>;
    /**
     * Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
     */
    readonly interfaceEndpoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the AWS PrivateLink connection.
     */
    readonly privateLinkId?: pulumi.Input<string>;
    /**
     * Required 	Unique identifier for the project.
     */
    readonly projectId?: pulumi.Input<string>;
    readonly providerName?: pulumi.Input<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are:
     * * `us-east-1`
     * * `us-east-2`
     * * `us-west-1`
     * * `us-west-2`
     * * `ca-central-1`
     * * `sa-east-1`
     * * `eu-north-1`
     * * `eu-west-1`
     * * `eu-west-2`
     * * `eu-west-3`
     * * `eu-central-1`
     * * `me-south-1`
     * * `ap-northeast-1`
     * * `ap-northeast-2`
     * * `ap-south-1`
     * * `ap-southeast-1`
     * * `ap-southeast-2`
     * * `ap-east-1`
     */
    readonly region?: pulumi.Input<string>;
    /**
     * Status of the AWS PrivateLink connection.
     * Returns one of the following values:
     */
    readonly status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateEndpoint resource.
 */
export interface PrivateEndpointArgs {
    /**
     * Required 	Unique identifier for the project.
     */
    readonly projectId: pulumi.Input<string>;
    readonly providerName: pulumi.Input<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are:
     * * `us-east-1`
     * * `us-east-2`
     * * `us-west-1`
     * * `us-west-2`
     * * `ca-central-1`
     * * `sa-east-1`
     * * `eu-north-1`
     * * `eu-west-1`
     * * `eu-west-2`
     * * `eu-west-3`
     * * `eu-central-1`
     * * `me-south-1`
     * * `ap-northeast-1`
     * * `ap-northeast-2`
     * * `ap-south-1`
     * * `ap-southeast-1`
     * * `ap-southeast-2`
     * * `ap-east-1`
     */
    readonly region: pulumi.Input<string>;
}
