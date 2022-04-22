// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one interface endpoint to a private endpoint connection in an Atlas project.
 *
 * > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example with AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testPrivateLinkEndpoint = new mongodbatlas.PrivateLinkEndpoint("testPrivateLinkEndpoint", {
 *     projectId: "<PROJECT_ID>",
 *     providerName: "AWS",
 *     region: "US_EAST_1",
 * });
 * const ptfeService = new aws.ec2.VpcEndpoint("ptfeService", {
 *     vpcId: "vpc-7fc0a543",
 *     serviceName: testPrivateLinkEndpoint.endpointServiceName,
 *     vpcEndpointType: "Interface",
 *     subnetIds: ["subnet-de0406d2"],
 *     securityGroupIds: ["sg-3f238186"],
 * });
 * const testPrivateLinkEndpointService = new mongodbatlas.PrivateLinkEndpointService("testPrivateLinkEndpointService", {
 *     projectId: testPrivateLinkEndpoint.projectId,
 *     privateLinkId: testPrivateLinkEndpoint.privateLinkId,
 *     endpointServiceId: ptfeService.id,
 *     providerName: "AWS",
 * });
 * ```
 *
 * ## Example with Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testPrivateLinkEndpoint = new mongodbatlas.PrivateLinkEndpoint("testPrivateLinkEndpoint", {
 *     projectId: _var.project_id,
 *     providerName: "AZURE",
 *     region: "eastus2",
 * });
 * const testEndpoint = new azure.privatelink.Endpoint("testEndpoint", {
 *     location: data.azurerm_resource_group.test.location,
 *     resourceGroupName: _var.resource_group_name,
 *     subnetId: azurerm_subnet.test.id,
 *     privateServiceConnection: {
 *         name: testPrivateLinkEndpoint.privateLinkServiceName,
 *         privateConnectionResourceId: testPrivateLinkEndpoint.privateLinkServiceResourceId,
 *         isManualConnection: true,
 *         requestMessage: "Azure Private Link test",
 *     },
 * });
 * const testPrivateLinkEndpointService = new mongodbatlas.PrivateLinkEndpointService("testPrivateLinkEndpointService", {
 *     projectId: testPrivateLinkEndpoint.projectId,
 *     privateLinkId: testPrivateLinkEndpoint.privateLinkId,
 *     endpointServiceId: testEndpoint.id,
 *     privateEndpointIpAddress: testEndpoint.privateServiceConnection.apply(privateServiceConnection => privateServiceConnection.privateIpAddress),
 *     providerName: "AZURE",
 * });
 * ```
 *
 * ## Import
 *
 * Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
 * ```
 *
 *  See detailed information for arguments and attributes[MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)
 */
export class PrivateLinkEndpointService extends pulumi.CustomResource {
    /**
     * Get an existing PrivateLinkEndpointService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateLinkEndpointServiceState, opts?: pulumi.CustomResourceOptions): PrivateLinkEndpointService {
        return new PrivateLinkEndpointService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService';

    /**
     * Returns true if the given object is an instance of PrivateLinkEndpointService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateLinkEndpointService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateLinkEndpointService.__pulumiType;
    }

    /**
     * Status of the interface endpoint for AWS.
     * Returns one of the following values:
     */
    public /*out*/ readonly awsConnectionStatus!: pulumi.Output<string>;
    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     */
    public /*out*/ readonly azureStatus!: pulumi.Output<string>;
    /**
     * Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     */
    public /*out*/ readonly deleteRequested!: pulumi.Output<boolean>;
    /**
     * (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
     */
    public /*out*/ readonly endpointGroupName!: pulumi.Output<string>;
    /**
     * Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     */
    public readonly endpointServiceId!: pulumi.Output<string>;
    /**
     * Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     */
    public readonly endpoints!: pulumi.Output<outputs.PrivateLinkEndpointServiceEndpoint[]>;
    /**
     * Error message pertaining to the interface endpoint. Returns null if there are no errors.
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     */
    public readonly gcpProjectId!: pulumi.Output<string | undefined>;
    /**
     * Status of the interface endpoint for GCP.
     * Returns one of the following values:
     */
    public /*out*/ readonly gcpStatus!: pulumi.Output<string>;
    /**
     * Unique identifier of the interface endpoint.
     */
    public /*out*/ readonly interfaceEndpointId!: pulumi.Output<string>;
    /**
     * Name of the connection for this private endpoint that Atlas generates.
     */
    public /*out*/ readonly privateEndpointConnectionName!: pulumi.Output<string>;
    /**
     * Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     */
    public readonly privateEndpointIpAddress!: pulumi.Output<string>;
    /**
     * Unique identifier of the private endpoint.
     */
    public /*out*/ readonly privateEndpointResourceId!: pulumi.Output<string>;
    /**
     * Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     */
    public readonly privateLinkId!: pulumi.Output<string>;
    /**
     * Unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     */
    public readonly providerName!: pulumi.Output<string>;

    /**
     * Create a PrivateLinkEndpointService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateLinkEndpointServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateLinkEndpointServiceArgs | PrivateLinkEndpointServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateLinkEndpointServiceState | undefined;
            resourceInputs["awsConnectionStatus"] = state ? state.awsConnectionStatus : undefined;
            resourceInputs["azureStatus"] = state ? state.azureStatus : undefined;
            resourceInputs["deleteRequested"] = state ? state.deleteRequested : undefined;
            resourceInputs["endpointGroupName"] = state ? state.endpointGroupName : undefined;
            resourceInputs["endpointServiceId"] = state ? state.endpointServiceId : undefined;
            resourceInputs["endpoints"] = state ? state.endpoints : undefined;
            resourceInputs["errorMessage"] = state ? state.errorMessage : undefined;
            resourceInputs["gcpProjectId"] = state ? state.gcpProjectId : undefined;
            resourceInputs["gcpStatus"] = state ? state.gcpStatus : undefined;
            resourceInputs["interfaceEndpointId"] = state ? state.interfaceEndpointId : undefined;
            resourceInputs["privateEndpointConnectionName"] = state ? state.privateEndpointConnectionName : undefined;
            resourceInputs["privateEndpointIpAddress"] = state ? state.privateEndpointIpAddress : undefined;
            resourceInputs["privateEndpointResourceId"] = state ? state.privateEndpointResourceId : undefined;
            resourceInputs["privateLinkId"] = state ? state.privateLinkId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerName"] = state ? state.providerName : undefined;
        } else {
            const args = argsOrState as PrivateLinkEndpointServiceArgs | undefined;
            if ((!args || args.endpointServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointServiceId'");
            }
            if ((!args || args.privateLinkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateLinkId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerName'");
            }
            resourceInputs["endpointServiceId"] = args ? args.endpointServiceId : undefined;
            resourceInputs["endpoints"] = args ? args.endpoints : undefined;
            resourceInputs["gcpProjectId"] = args ? args.gcpProjectId : undefined;
            resourceInputs["privateEndpointIpAddress"] = args ? args.privateEndpointIpAddress : undefined;
            resourceInputs["privateLinkId"] = args ? args.privateLinkId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerName"] = args ? args.providerName : undefined;
            resourceInputs["awsConnectionStatus"] = undefined /*out*/;
            resourceInputs["azureStatus"] = undefined /*out*/;
            resourceInputs["deleteRequested"] = undefined /*out*/;
            resourceInputs["endpointGroupName"] = undefined /*out*/;
            resourceInputs["errorMessage"] = undefined /*out*/;
            resourceInputs["gcpStatus"] = undefined /*out*/;
            resourceInputs["interfaceEndpointId"] = undefined /*out*/;
            resourceInputs["privateEndpointConnectionName"] = undefined /*out*/;
            resourceInputs["privateEndpointResourceId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateLinkEndpointService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateLinkEndpointService resources.
 */
export interface PrivateLinkEndpointServiceState {
    /**
     * Status of the interface endpoint for AWS.
     * Returns one of the following values:
     */
    awsConnectionStatus?: pulumi.Input<string>;
    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     */
    azureStatus?: pulumi.Input<string>;
    /**
     * Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     */
    deleteRequested?: pulumi.Input<boolean>;
    /**
     * (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
     */
    endpointGroupName?: pulumi.Input<string>;
    /**
     * Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     */
    endpointServiceId?: pulumi.Input<string>;
    /**
     * Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     */
    endpoints?: pulumi.Input<pulumi.Input<inputs.PrivateLinkEndpointServiceEndpoint>[]>;
    /**
     * Error message pertaining to the interface endpoint. Returns null if there are no errors.
     */
    errorMessage?: pulumi.Input<string>;
    /**
     * Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     */
    gcpProjectId?: pulumi.Input<string>;
    /**
     * Status of the interface endpoint for GCP.
     * Returns one of the following values:
     */
    gcpStatus?: pulumi.Input<string>;
    /**
     * Unique identifier of the interface endpoint.
     */
    interfaceEndpointId?: pulumi.Input<string>;
    /**
     * Name of the connection for this private endpoint that Atlas generates.
     */
    privateEndpointConnectionName?: pulumi.Input<string>;
    /**
     * Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     */
    privateEndpointIpAddress?: pulumi.Input<string>;
    /**
     * Unique identifier of the private endpoint.
     */
    privateEndpointResourceId?: pulumi.Input<string>;
    /**
     * Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     */
    privateLinkId?: pulumi.Input<string>;
    /**
     * Unique identifier for the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     */
    providerName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateLinkEndpointService resource.
 */
export interface PrivateLinkEndpointServiceArgs {
    /**
     * Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     */
    endpointServiceId: pulumi.Input<string>;
    /**
     * Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     */
    endpoints?: pulumi.Input<pulumi.Input<inputs.PrivateLinkEndpointServiceEndpoint>[]>;
    /**
     * Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     */
    gcpProjectId?: pulumi.Input<string>;
    /**
     * Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     */
    privateEndpointIpAddress?: pulumi.Input<string>;
    /**
     * Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     */
    privateLinkId: pulumi.Input<string>;
    /**
     * Unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     */
    providerName: pulumi.Input<string>;
}
