// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one [Interface Endpoint](https://www.mongodb.com/docs/atlas/security-private-endpoint/#private-endpoint-concepts) to a private endpoint connection in an Atlas project.
 *
 * > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **NOTE:** Create and delete wait for all clusters on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation or deletion of this resource. Default timeout is 2hrs.
 *
 * ## Example with AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.PrivateLinkEndpoint("test", {
 *     projectId: "<PROJECT_ID>",
 *     providerName: "AWS",
 *     region: "US_EAST_1",
 * });
 * const ptfeService = new aws.index.VpcEndpoint("ptfe_service", {
 *     vpcId: "vpc-7fc0a543",
 *     serviceName: test.endpointServiceName,
 *     vpcEndpointType: "Interface",
 *     subnetIds: ["subnet-de0406d2"],
 *     securityGroupIds: ["sg-3f238186"],
 * });
 * const testPrivateLinkEndpointService = new mongodbatlas.PrivateLinkEndpointService("test", {
 *     projectId: test.projectId,
 *     privateLinkId: test.privateLinkId,
 *     endpointServiceId: ptfeService.id,
 *     providerName: "AWS",
 * });
 * ```
 *
 * ## Example with Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azurerm from "@pulumi/azurerm";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.PrivateLinkEndpoint("test", {
 *     projectId: projectId,
 *     providerName: "AZURE",
 *     region: "eastus2",
 * });
 * const testPrivateEndpoint = new azurerm.index.PrivateEndpoint("test", {
 *     name: "endpoint-test",
 *     location: testAzurermResourceGroup.location,
 *     resourceGroupName: resourceGroupName,
 *     subnetId: testAzurermSubnet.id,
 *     privateServiceConnection: [{
 *         name: test.privateLinkServiceName,
 *         privateConnectionResourceId: test.privateLinkServiceResourceId,
 *         isManualConnection: true,
 *         requestMessage: "Azure Private Link test",
 *     }],
 * });
 * const testPrivateLinkEndpointService = new mongodbatlas.PrivateLinkEndpointService("test", {
 *     projectId: test.projectId,
 *     privateLinkId: test.privateLinkId,
 *     endpointServiceId: testPrivateEndpoint.id,
 *     privateEndpointIpAddress: testPrivateEndpoint.privateServiceConnection[0].privateIpAddress,
 *     providerName: "AZURE",
 * });
 * ```
 *
 * ## Example with GCP
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as google from "@pulumi/google";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.PrivateLinkEndpoint("test", {
 *     projectId: projectId,
 *     providerName: "GCP",
 *     region: gcpRegion,
 * });
 * // Create a Google Network
 * const _default = new google.index.ComputeNetwork("default", {
 *     project: gcpProject,
 *     name: "my-network",
 * });
 * // Create a Google Sub Network
 * const defaultComputeSubnetwork = new google.index.ComputeSubnetwork("default", {
 *     project: _default.project,
 *     name: "my-subnet",
 *     ipCidrRange: "10.0.0.0/16",
 *     region: gcpRegion,
 *     network: _default.id,
 * });
 * // Create Google 50 Addresses
 * const defaultComputeAddress: google.index.ComputeAddress[] = [];
 * for (const range = {value: 0}; range.value < 50; range.value++) {
 *     defaultComputeAddress.push(new google.index.ComputeAddress(`default-${range.value}`, {
 *         project: defaultComputeSubnetwork.project,
 *         name: `tf-test${range.value}`,
 *         subnetwork: defaultComputeSubnetwork.id,
 *         addressType: "INTERNAL",
 *         address: `10.0.42.${range.value}`,
 *         region: gcpRegion,
 *     }, {
 *     dependsOn: [test],
 * }));
 * }
 * // Create 50 Forwarding rules
 * const defaultComputeForwardingRule: google.index.ComputeForwardingRule[] = [];
 * for (const range = {value: 0}; range.value < 50; range.value++) {
 *     defaultComputeForwardingRule.push(new google.index.ComputeForwardingRule(`default-${range.value}`, {
 *         target: test.serviceAttachmentNames[range.value],
 *         project: defaultComputeAddress[range.value].project,
 *         region: defaultComputeAddress[range.value].region,
 *         name: defaultComputeAddress[range.value].name,
 *         ipAddress: defaultComputeAddress[range.value].id,
 *         network: _default.id,
 *         loadBalancingScheme: "",
 *     }));
 * }
 * const testPrivateLinkEndpointService = new mongodbatlas.PrivateLinkEndpointService("test", {
 *     endpoints: defaultComputeAddress.map((v, k) => ({key: k, value: v})).map(entry => ({
 *         ipAddress: entry.value.address,
 *         endpointName: defaultComputeForwardingRule[entry.key].name,
 *     })),
 *     projectId: test.projectId,
 *     privateLinkId: test.privateLinkId,
 *     providerName: "GCP",
 *     endpointServiceId: _default.name,
 *     gcpProjectId: gcpProject,
 * }, {
 *     dependsOn: [defaultComputeForwardingRule],
 * });
 * ```
 *
 * ### Available complete examples
 * - Setup private connection to a MongoDB Atlas Cluster with AWS VPC
 *
 * ## Import
 *
 * Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)
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
     * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
     * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
     * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
     * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
     * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
     * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
     */
    public /*out*/ readonly awsConnectionStatus!: pulumi.Output<string>;
    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
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
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
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
     * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
     * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
     * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
     * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
     * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
     * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
     */
    awsConnectionStatus?: pulumi.Input<string>;
    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
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
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
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
