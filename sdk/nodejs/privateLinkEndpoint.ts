// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.PrivateLinkEndpoint("test", {
 *     projectId: "<PROJECT-ID>",
 *     providerName: "AWS/AZURE",
 *     region: "US_EAST_1",
 * });
 * ```
 *
 * ### Available complete examples
 * - Setup private connection to a MongoDB Atlas Cluster with AWS VPC
 *
 * ## Import
 *
 * Private Endpoint Service can be imported using project ID, private link ID, provider name and region, in the format `{project_id}-{private_link_id}-{provider_name}-{region}`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint test 1112222b3bf99403840e8934-3242342343112-AWS-us-east-1
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Private Endpoint Service](https://docs.atlas.mongodb.com/reference/api/private-endpoints-service-create-one/)
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
     * GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
     */
    public /*out*/ readonly endpointGroupNames!: pulumi.Output<string[]>;
    /**
     * Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
     */
    public /*out*/ readonly endpointServiceName!: pulumi.Output<string>;
    /**
     * Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
     * AWS:
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
     * AZURE:
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
     * GCP:
     */
    public /*out*/ readonly privateLinkServiceName!: pulumi.Output<string>;
    public /*out*/ readonly privateLinkServiceResourceId!: pulumi.Output<string>;
    /**
     * Required 	Unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     */
    public readonly providerName!: pulumi.Output<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * GCP region for the Private Service Connect endpoint service.
     */
    public /*out*/ readonly regionName!: pulumi.Output<string>;
    /**
     * Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
     */
    public /*out*/ readonly serviceAttachmentNames!: pulumi.Output<string[]>;
    /**
     * Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
     * AWS:
     * * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
     * * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
     * * `FAILED` 	A system failure has occurred.
     * * `DELETING` 	The AWS PrivateLink connection is being deleted.
     * AZURE:
     * * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
     * * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
     * * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
     * * `DELETING` 	Atlas is deleting the Private Link service.
     * GCP:
     * * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
     * * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
     * * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
     * * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateLinkEndpointState | undefined;
            resourceInputs["endpointGroupNames"] = state ? state.endpointGroupNames : undefined;
            resourceInputs["endpointServiceName"] = state ? state.endpointServiceName : undefined;
            resourceInputs["errorMessage"] = state ? state.errorMessage : undefined;
            resourceInputs["interfaceEndpoints"] = state ? state.interfaceEndpoints : undefined;
            resourceInputs["privateEndpoints"] = state ? state.privateEndpoints : undefined;
            resourceInputs["privateLinkId"] = state ? state.privateLinkId : undefined;
            resourceInputs["privateLinkServiceName"] = state ? state.privateLinkServiceName : undefined;
            resourceInputs["privateLinkServiceResourceId"] = state ? state.privateLinkServiceResourceId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerName"] = state ? state.providerName : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["regionName"] = state ? state.regionName : undefined;
            resourceInputs["serviceAttachmentNames"] = state ? state.serviceAttachmentNames : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
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
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerName"] = args ? args.providerName : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["endpointGroupNames"] = undefined /*out*/;
            resourceInputs["endpointServiceName"] = undefined /*out*/;
            resourceInputs["errorMessage"] = undefined /*out*/;
            resourceInputs["interfaceEndpoints"] = undefined /*out*/;
            resourceInputs["privateEndpoints"] = undefined /*out*/;
            resourceInputs["privateLinkId"] = undefined /*out*/;
            resourceInputs["privateLinkServiceName"] = undefined /*out*/;
            resourceInputs["privateLinkServiceResourceId"] = undefined /*out*/;
            resourceInputs["regionName"] = undefined /*out*/;
            resourceInputs["serviceAttachmentNames"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateLinkEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateLinkEndpoint resources.
 */
export interface PrivateLinkEndpointState {
    /**
     * GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
     */
    endpointGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
     */
    endpointServiceName?: pulumi.Input<string>;
    /**
     * Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
     * AWS:
     */
    errorMessage?: pulumi.Input<string>;
    /**
     * Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
     * AZURE:
     */
    interfaceEndpoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * All private endpoints that you have added to this Azure Private Link Service.
     */
    privateEndpoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the AWS PrivateLink connection.
     */
    privateLinkId?: pulumi.Input<string>;
    /**
     * Name of the Azure Private Link Service that Atlas manages.
     * GCP:
     */
    privateLinkServiceName?: pulumi.Input<string>;
    privateLinkServiceResourceId?: pulumi.Input<string>;
    /**
     * Required 	Unique identifier for the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     */
    providerName?: pulumi.Input<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
     */
    region?: pulumi.Input<string>;
    /**
     * GCP region for the Private Service Connect endpoint service.
     */
    regionName?: pulumi.Input<string>;
    /**
     * Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
     */
    serviceAttachmentNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
     * AWS:
     * * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
     * * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
     * * `FAILED` 	A system failure has occurred.
     * * `DELETING` 	The AWS PrivateLink connection is being deleted.
     * AZURE:
     * * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
     * * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
     * * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
     * * `DELETING` 	Atlas is deleting the Private Link service.
     * GCP:
     * * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
     * * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
     * * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
     * * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateLinkEndpoint resource.
 */
export interface PrivateLinkEndpointArgs {
    /**
     * Required 	Unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     */
    providerName: pulumi.Input<string>;
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
     */
    region: pulumi.Input<string>;
}
