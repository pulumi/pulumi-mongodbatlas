// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.PrivateLinkEndpoint` provides a Private Endpoint resource. This represents a Private Endpoint Service that can be created in an Atlas project.
 *
 * > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **NOTE:** A network container is created for a private endpoint to reside in if one does not yet exist in the project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.PrivateLinkEndpoint("test", {
 *     projectId: "<PROJECT-ID>",
 *     providerName: "AWS/AZURE",
 *     region: "us-east-1",
 * });
 * ```
 *
 * ## Import
 *
 * Private Endpoint Service can be imported using project ID, private link ID, provider name and region, in the format `{project_id}-{private_link_id}-{provider_name}-{region}`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint test 1112222b3bf99403840e8934-3242342343112-AWS-us-east-1
 * ```
 *
 *  See detailed information for arguments and attributes[MongoDB API Private Endpoint Service](https://docs.atlas.mongodb.com/reference/api/private-endpoints-service-create-one//)
 */
export class PrivateLinkEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing PrivateLinkEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateLinkEndpointState, opts?: pulumi.CustomResourceOptions): PrivateLinkEndpoint {
        return new PrivateLinkEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint';

    /**
     * Returns true if the given object is an instance of PrivateLinkEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateLinkEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateLinkEndpoint.__pulumiType;
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
     * All private endpoints that you have added to this Azure Private Link Service.
     */
    public /*out*/ readonly privateEndpoints!: pulumi.Output<string[]>;
    /**
     * Unique identifier of the AWS PrivateLink connection.
     */
    public /*out*/ readonly privateLinkId!: pulumi.Output<string>;
    /**
     * Name of the Azure Private Link Service that Atlas manages.
     */
    public /*out*/ readonly privateLinkServiceName!: pulumi.Output<string>;
    /**
     * Resource ID of the Azure Private Link Service that Atlas manages.
     */
    public /*out*/ readonly privateLinkServiceResourceId!: pulumi.Output<string>;
    /**
     * Required 	Unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    public readonly providerName!: pulumi.Output<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
     * AWS:
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a PrivateLinkEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateLinkEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateLinkEndpointArgs | PrivateLinkEndpointState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateLinkEndpointState | undefined;
            inputs["endpointServiceName"] = state ? state.endpointServiceName : undefined;
            inputs["errorMessage"] = state ? state.errorMessage : undefined;
            inputs["interfaceEndpoints"] = state ? state.interfaceEndpoints : undefined;
            inputs["privateEndpoints"] = state ? state.privateEndpoints : undefined;
            inputs["privateLinkId"] = state ? state.privateLinkId : undefined;
            inputs["privateLinkServiceName"] = state ? state.privateLinkServiceName : undefined;
            inputs["privateLinkServiceResourceId"] = state ? state.privateLinkServiceResourceId : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["providerName"] = state ? state.providerName : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PrivateLinkEndpointArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerName'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["providerName"] = args ? args.providerName : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["endpointServiceName"] = undefined /*out*/;
            inputs["errorMessage"] = undefined /*out*/;
            inputs["interfaceEndpoints"] = undefined /*out*/;
            inputs["privateEndpoints"] = undefined /*out*/;
            inputs["privateLinkId"] = undefined /*out*/;
            inputs["privateLinkServiceName"] = undefined /*out*/;
            inputs["privateLinkServiceResourceId"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(PrivateLinkEndpoint.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateLinkEndpoint resources.
 */
export interface PrivateLinkEndpointState {
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
     * All private endpoints that you have added to this Azure Private Link Service.
     */
    readonly privateEndpoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the AWS PrivateLink connection.
     */
    readonly privateLinkId?: pulumi.Input<string>;
    /**
     * Name of the Azure Private Link Service that Atlas manages.
     */
    readonly privateLinkServiceName?: pulumi.Input<string>;
    /**
     * Resource ID of the Azure Private Link Service that Atlas manages.
     */
    readonly privateLinkServiceResourceId?: pulumi.Input<string>;
    /**
     * Required 	Unique identifier for the project.
     */
    readonly projectId?: pulumi.Input<string>;
    readonly providerName?: pulumi.Input<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
     */
    readonly region?: pulumi.Input<string>;
    /**
     * Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
     * AWS:
     */
    readonly status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateLinkEndpoint resource.
 */
export interface PrivateLinkEndpointArgs {
    /**
     * Required 	Unique identifier for the project.
     */
    readonly projectId: pulumi.Input<string>;
    readonly providerName: pulumi.Input<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
     */
    readonly region: pulumi.Input<string>;
}
