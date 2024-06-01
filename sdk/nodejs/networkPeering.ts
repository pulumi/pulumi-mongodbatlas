// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.NetworkPeering` provides a Network Peering Connection resource. The resource lets you create, edit and delete network peering connections. The resource requires your Project ID.
 *
 * Ensure you have first created a network container if it is required for your configuration.  See the networkContainer resource documentation to determine if you need a network container first.  Examples for creating both container and peering resource are shown below as well as examples for creating the peering connection only.
 *
 * > **GCP AND AZURE ONLY:** Connect via Peering Only mode is deprecated, so no longer needed.  See [disable Peering Only mode](https://docs.atlas.mongodb.com/reference/faq/connection-changes/#disable-peering-mode) for details
 *
 * > **AZURE ONLY:** To create the peering request with an Azure VNET, you must grant Atlas the following permissions on the virtual network.
 *     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/read
 *     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/write
 *     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/delete
 *     Microsoft.Network/virtualNetworks/peer/action
 * For more information see https://docs.atlas.mongodb.com/security-vpc-peering/ and https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/
 *
 * > **Create a Whitelist:** Ensure you whitelist the private IP ranges of the subnets in which your application is hosted in order to connect to your Atlas cluster.  See the projectIpWhitelist resource.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 *
 * ### Container & Peering Connection
 *
 * ### Example with AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * // Container example provided but not always required, 
 * // see network_container documentation for details. 
 * const test = new mongodbatlas.NetworkContainer("test", {
 *     projectId: projectId,
 *     atlasCidrBlock: "10.8.0.0/21",
 *     providerName: "AWS",
 *     regionName: "US_EAST_1",
 * });
 * // Create the peering connection request
 * const testNetworkPeering = new mongodbatlas.NetworkPeering("test", {
 *     accepterRegionName: "us-east-1",
 *     projectId: projectId,
 *     containerId: "507f1f77bcf86cd799439011",
 *     providerName: "AWS",
 *     routeTableCidrBlock: "192.168.0.0/24",
 *     vpcId: "vpc-abc123abc123",
 *     awsAccountId: "abc123abc123",
 * });
 * // the following assumes an AWS provider is configured
 * // Accept the peering connection request
 * const peer = new aws.index.VpcPeeringConnectionAccepter("peer", {
 *     vpcPeeringConnectionId: testNetworkPeering.connectionId,
 *     autoAccept: true,
 * });
 * ```
 *
 * ### Example with Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * // Ensure you have created the required Azure service principal first, see
 * // see https://docs.atlas.mongodb.com/security-vpc-peering/
 * // Container example provided but not always required, 
 * // see network_container documentation for details. 
 * const test = new mongodbatlas.NetworkContainer("test", {
 *     projectId: projectId,
 *     atlasCidrBlock: ATLAS_CIDR_BLOCK,
 *     providerName: "AZURE",
 *     region: "US_EAST_2",
 * });
 * // Create the peering connection request
 * const testNetworkPeering = new mongodbatlas.NetworkPeering("test", {
 *     projectId: projectId,
 *     containerId: test.containerId,
 *     providerName: "AZURE",
 *     azureDirectoryId: AZURE_DIRECTORY_ID,
 *     azureSubscriptionId: AZURE_SUBSCRIPTION_ID,
 *     resourceGroupName: AZURE_RESOURCES_GROUP_NAME,
 *     vnetName: AZURE_VNET_NAME,
 * });
 * // Create the cluster once the peering connection is completed
 * const testCluster = new mongodbatlas.Cluster("test", {
 *     projectId: projectId,
 *     name: "terraform-manually-test",
 *     clusterType: "REPLICASET",
 *     replicationSpecs: [{
 *         numShards: 1,
 *         regionsConfigs: [{
 *             regionName: "US_EAST_2",
 *             electableNodes: 3,
 *             priority: 7,
 *             readOnlyNodes: 0,
 *         }],
 *     }],
 *     autoScalingDiskGbEnabled: true,
 *     mongoDbMajorVersion: "7.0",
 *     providerName: "AZURE",
 *     providerDiskTypeName: "P4",
 *     providerInstanceSizeName: "M10",
 * }, {
 *     dependsOn: [testNetworkPeering],
 * });
 * ```
 *
 * ### Peering Connection Only, Container Exists
 * You can create a peering connection if an appropriate container for your cloud provider already exists in your project (see the networkContainer resource for more information).  A container may already exist if you have already created a cluster in your project, if so you may obtain the `containerId` from the cluster resource as shown in the examples below.
 *
 * ### Example with AWS
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * // Create an Atlas cluster, this creates a container if one
 * // does not yet exist for this AWS region
 * const test = new mongodbatlas.Cluster("test", {
 *     projectId: projectId,
 *     name: "terraform-test",
 *     clusterType: "REPLICASET",
 *     replicationSpecs: [{
 *         numShards: 1,
 *         regionsConfigs: [{
 *             regionName: "US_EAST_2",
 *             electableNodes: 3,
 *             priority: 7,
 *             readOnlyNodes: 0,
 *         }],
 *     }],
 *     autoScalingDiskGbEnabled: false,
 *     mongoDbMajorVersion: "7.0",
 *     providerName: "AWS",
 *     providerInstanceSizeName: "M10",
 * });
 * // the following assumes an AWS provider is configured
 * const _default = new aws.index.DefaultVpc("default", {tags: {
 *     name: "Default VPC",
 * }});
 * // Create the peering connection request
 * const mongoPeer = new mongodbatlas.NetworkPeering("mongo_peer", {
 *     accepterRegionName: "us-east-2",
 *     projectId: projectId,
 *     containerId: test.containerId,
 *     providerName: "AWS",
 *     routeTableCidrBlock: "172.31.0.0/16",
 *     vpcId: _default.id,
 *     awsAccountId: AWS_ACCOUNT_ID,
 * });
 * // Accept the connection 
 * const awsPeer = new aws.index.VpcPeeringConnectionAccepter("aws_peer", {
 *     vpcPeeringConnectionId: mongoPeer.connectionId,
 *     autoAccept: true,
 *     tags: {
 *         side: "Accepter",
 *     },
 * });
 * ```
 *
 * ### Example with Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * // Ensure you have created the required Azure service principal first, see
 * // see https://docs.atlas.mongodb.com/security-vpc-peering/
 * // Create an Atlas cluster, this creates a container if one
 * // does not yet exist for this AZURE region
 * const test = new mongodbatlas.Cluster("test", {
 *     projectId: projectId,
 *     name: "cluster-azure",
 *     clusterType: "REPLICASET",
 *     replicationSpecs: [{
 *         numShards: 1,
 *         regionsConfigs: [{
 *             regionName: "US_EAST_2",
 *             electableNodes: 3,
 *             priority: 7,
 *             readOnlyNodes: 0,
 *         }],
 *     }],
 *     autoScalingDiskGbEnabled: false,
 *     mongoDbMajorVersion: "7.0",
 *     providerName: "AZURE",
 *     providerInstanceSizeName: "M10",
 * });
 * // Create the peering connection request
 * const testNetworkPeering = new mongodbatlas.NetworkPeering("test", {
 *     projectId: projectId,
 *     containerId: test.containerId,
 *     providerName: "AZURE",
 *     azureDirectoryId: AZURE_DIRECTORY_ID,
 *     azureSubscriptionId: AZURE_SUBSCRIPTION_ID,
 *     resourceGroupName: AZURE_RESOURCE_GROUP_NAME,
 *     vnetName: AZURE_VNET_NAME,
 * });
 * ```
 *
 * ## Import
 *
 * Network Peering Connections can be imported using project ID and network peering id, in the format `PROJECTID-PEERID-PROVIDERNAME`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/networkPeering:NetworkPeering my_peering 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a-AWS
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Network Peering Connection](https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/)
 *
 * -> __NOTE:__ If you need to get an existing container ID see the How-To Guide.
 */
export class NetworkPeering extends pulumi.CustomResource {
    /**
     * Get an existing NetworkPeering resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkPeeringState, opts?: pulumi.CustomResourceOptions): NetworkPeering {
        return new NetworkPeering(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/networkPeering:NetworkPeering';

    /**
     * Returns true if the given object is an instance of NetworkPeering.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkPeering {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkPeering.__pulumiType;
    }

    /**
     * Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    public readonly accepterRegionName!: pulumi.Output<string>;
    public readonly atlasCidrBlock!: pulumi.Output<string>;
    /**
     * The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     */
    public readonly atlasGcpProjectId!: pulumi.Output<string>;
    public /*out*/ readonly atlasId!: pulumi.Output<string>;
    /**
     * Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     */
    public readonly atlasVpcName!: pulumi.Output<string>;
    /**
     * AWS Account ID of the owner of the peer VPC.
     */
    public readonly awsAccountId!: pulumi.Output<string>;
    /**
     * Unique identifier for an Azure AD directory.
     */
    public readonly azureDirectoryId!: pulumi.Output<string>;
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     */
    public readonly azureSubscriptionId!: pulumi.Output<string>;
    /**
     * Unique identifier of the Atlas network peering container.
     */
    public /*out*/ readonly connectionId!: pulumi.Output<string>;
    /**
     * Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     */
    public readonly containerId!: pulumi.Output<string>;
    /**
     * When `"status" : "FAILED"`, Atlas provides a description of the error.
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
     */
    public /*out*/ readonly errorState!: pulumi.Output<string>;
    /**
     * Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
     */
    public /*out*/ readonly errorStateName!: pulumi.Output<string>;
    /**
     * GCP project ID of the owner of the network peer.
     */
    public readonly gcpProjectId!: pulumi.Output<string>;
    /**
     * Name of the network peer to which Atlas connects.
     *
     * **AZURE ONLY:**
     */
    public readonly networkName!: pulumi.Output<string>;
    /**
     * Unique identifier of the Atlas network peer.
     */
    public /*out*/ readonly peerId!: pulumi.Output<string>;
    /**
     * The unique ID for the MongoDB Atlas project to create the database user.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
     *
     * **AWS ONLY:**
     */
    public readonly providerName!: pulumi.Output<string>;
    /**
     * Name of your Azure resource group.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * AWS VPC CIDR block or subnet.
     *
     * **GCP ONLY:**
     */
    public readonly routeTableCidrBlock!: pulumi.Output<string>;
    /**
     * Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
     */
    public /*out*/ readonly statusName!: pulumi.Output<string>;
    /**
     * Name of your Azure VNet.
     */
    public readonly vnetName!: pulumi.Output<string>;
    /**
     * Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a NetworkPeering resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkPeeringArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkPeeringArgs | NetworkPeeringState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkPeeringState | undefined;
            resourceInputs["accepterRegionName"] = state ? state.accepterRegionName : undefined;
            resourceInputs["atlasCidrBlock"] = state ? state.atlasCidrBlock : undefined;
            resourceInputs["atlasGcpProjectId"] = state ? state.atlasGcpProjectId : undefined;
            resourceInputs["atlasId"] = state ? state.atlasId : undefined;
            resourceInputs["atlasVpcName"] = state ? state.atlasVpcName : undefined;
            resourceInputs["awsAccountId"] = state ? state.awsAccountId : undefined;
            resourceInputs["azureDirectoryId"] = state ? state.azureDirectoryId : undefined;
            resourceInputs["azureSubscriptionId"] = state ? state.azureSubscriptionId : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["containerId"] = state ? state.containerId : undefined;
            resourceInputs["errorMessage"] = state ? state.errorMessage : undefined;
            resourceInputs["errorState"] = state ? state.errorState : undefined;
            resourceInputs["errorStateName"] = state ? state.errorStateName : undefined;
            resourceInputs["gcpProjectId"] = state ? state.gcpProjectId : undefined;
            resourceInputs["networkName"] = state ? state.networkName : undefined;
            resourceInputs["peerId"] = state ? state.peerId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerName"] = state ? state.providerName : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["routeTableCidrBlock"] = state ? state.routeTableCidrBlock : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["statusName"] = state ? state.statusName : undefined;
            resourceInputs["vnetName"] = state ? state.vnetName : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as NetworkPeeringArgs | undefined;
            if ((!args || args.containerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'containerId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerName'");
            }
            resourceInputs["accepterRegionName"] = args ? args.accepterRegionName : undefined;
            resourceInputs["atlasCidrBlock"] = args ? args.atlasCidrBlock : undefined;
            resourceInputs["atlasGcpProjectId"] = args ? args.atlasGcpProjectId : undefined;
            resourceInputs["atlasVpcName"] = args ? args.atlasVpcName : undefined;
            resourceInputs["awsAccountId"] = args ? args.awsAccountId : undefined;
            resourceInputs["azureDirectoryId"] = args ? args.azureDirectoryId : undefined;
            resourceInputs["azureSubscriptionId"] = args ? args.azureSubscriptionId : undefined;
            resourceInputs["containerId"] = args ? args.containerId : undefined;
            resourceInputs["gcpProjectId"] = args ? args.gcpProjectId : undefined;
            resourceInputs["networkName"] = args ? args.networkName : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerName"] = args ? args.providerName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["routeTableCidrBlock"] = args ? args.routeTableCidrBlock : undefined;
            resourceInputs["vnetName"] = args ? args.vnetName : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["atlasId"] = undefined /*out*/;
            resourceInputs["connectionId"] = undefined /*out*/;
            resourceInputs["errorMessage"] = undefined /*out*/;
            resourceInputs["errorState"] = undefined /*out*/;
            resourceInputs["errorStateName"] = undefined /*out*/;
            resourceInputs["peerId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["statusName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkPeering.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkPeering resources.
 */
export interface NetworkPeeringState {
    /**
     * Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    accepterRegionName?: pulumi.Input<string>;
    atlasCidrBlock?: pulumi.Input<string>;
    /**
     * The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     */
    atlasGcpProjectId?: pulumi.Input<string>;
    atlasId?: pulumi.Input<string>;
    /**
     * Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     */
    atlasVpcName?: pulumi.Input<string>;
    /**
     * AWS Account ID of the owner of the peer VPC.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * Unique identifier for an Azure AD directory.
     */
    azureDirectoryId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     */
    azureSubscriptionId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Atlas network peering container.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     */
    containerId?: pulumi.Input<string>;
    /**
     * When `"status" : "FAILED"`, Atlas provides a description of the error.
     */
    errorMessage?: pulumi.Input<string>;
    /**
     * Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
     */
    errorState?: pulumi.Input<string>;
    /**
     * Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
     */
    errorStateName?: pulumi.Input<string>;
    /**
     * GCP project ID of the owner of the network peer.
     */
    gcpProjectId?: pulumi.Input<string>;
    /**
     * Name of the network peer to which Atlas connects.
     *
     * **AZURE ONLY:**
     */
    networkName?: pulumi.Input<string>;
    /**
     * Unique identifier of the Atlas network peer.
     */
    peerId?: pulumi.Input<string>;
    /**
     * The unique ID for the MongoDB Atlas project to create the database user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
     *
     * **AWS ONLY:**
     */
    providerName?: pulumi.Input<string>;
    /**
     * Name of your Azure resource group.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * AWS VPC CIDR block or subnet.
     *
     * **GCP ONLY:**
     */
    routeTableCidrBlock?: pulumi.Input<string>;
    /**
     * Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
     */
    status?: pulumi.Input<string>;
    /**
     * (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
     */
    statusName?: pulumi.Input<string>;
    /**
     * Name of your Azure VNet.
     */
    vnetName?: pulumi.Input<string>;
    /**
     * Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkPeering resource.
 */
export interface NetworkPeeringArgs {
    /**
     * Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    accepterRegionName?: pulumi.Input<string>;
    atlasCidrBlock?: pulumi.Input<string>;
    /**
     * The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     */
    atlasGcpProjectId?: pulumi.Input<string>;
    /**
     * Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     */
    atlasVpcName?: pulumi.Input<string>;
    /**
     * AWS Account ID of the owner of the peer VPC.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * Unique identifier for an Azure AD directory.
     */
    azureDirectoryId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     */
    azureSubscriptionId?: pulumi.Input<string>;
    /**
     * Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the networkContainer resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     */
    containerId: pulumi.Input<string>;
    /**
     * GCP project ID of the owner of the network peer.
     */
    gcpProjectId?: pulumi.Input<string>;
    /**
     * Name of the network peer to which Atlas connects.
     *
     * **AZURE ONLY:**
     */
    networkName?: pulumi.Input<string>;
    /**
     * The unique ID for the MongoDB Atlas project to create the database user.
     */
    projectId: pulumi.Input<string>;
    /**
     * Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
     *
     * **AWS ONLY:**
     */
    providerName: pulumi.Input<string>;
    /**
     * Name of your Azure resource group.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * AWS VPC CIDR block or subnet.
     *
     * **GCP ONLY:**
     */
    routeTableCidrBlock?: pulumi.Input<string>;
    /**
     * Name of your Azure VNet.
     */
    vnetName?: pulumi.Input<string>;
    /**
     * Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the networkContainer resource).
     */
    vpcId?: pulumi.Input<string>;
}
