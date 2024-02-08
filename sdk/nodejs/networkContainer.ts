// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.NetworkContainer` provides a Network Peering Container resource. The resource lets you create, edit and delete network peering containers. You must delete network peering containers before creating clusters in your project. You can't delete a network peering container if your project contains clusters. The resource requires your Project ID.  Each cloud provider requires slightly different attributes so read the argument reference carefully.
 *
 *  Network peering container is a general term used to describe any cloud providers' VPC/VNet concept.  Containers only need to be created if the peering connection to the cloud provider will be created before the first cluster that requires the container.  If the cluster has been/will be created first Atlas automatically creates the required container per the "containers per cloud provider" information that follows (in this case you can obtain the container id from the cluster resource attribute `containerId`).
 *
 * The following is the maximum number of Network Peering containers per cloud provider:
 * <br> &#8226;  GCP -  One container per project.
 * <br> &#8226;  AWS and Azure - One container per cloud provider region.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 *
 * ## Example Usage
 * ### Example with AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.NetworkContainer("test", {
 *     atlasCidrBlock: "10.8.0.0/21",
 *     projectId: "<YOUR-PROJECT-ID>",
 *     providerName: "AWS",
 *     regionName: "US_EAST_1",
 * });
 * ```
 * ### Example with GCP
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.NetworkContainer("test", {
 *     atlasCidrBlock: "10.8.0.0/21",
 *     projectId: "<YOUR-PROJECT-ID>",
 *     providerName: "GCP",
 *     regions: [
 *         "US_EAST_4",
 *         "US_WEST_3",
 *     ],
 * });
 * ```
 * ### Example with Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.NetworkContainer("test", {
 *     atlasCidrBlock: "10.8.0.0/21",
 *     projectId: "<YOUR-PROJECT-ID>",
 *     providerName: "AZURE",
 *     region: "US_EAST_2",
 * });
 * ```
 *
 * ## Import
 *
 * Network Peering Containers can be imported using project ID and network peering container id, in the format `PROJECTID-CONTAINER-ID`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/networkContainer:NetworkContainer my_container 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a
 * ```
 *  See detailed information for arguments and attributes: [MongoDB API Network Peering Container](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/)
 *
 * -> __NOTE:__ If you need to get an existing container ID see the How-To Guide.
 */
export class NetworkContainer extends pulumi.CustomResource {
    /**
     * Get an existing NetworkContainer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkContainerState, opts?: pulumi.CustomResourceOptions): NetworkContainer {
        return new NetworkContainer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/networkContainer:NetworkContainer';

    /**
     * Returns true if the given object is an instance of NetworkContainer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkContainer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkContainer.__pulumiType;
    }

    /**
     * CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     *
     * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     *
     * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     */
    public readonly atlasCidrBlock!: pulumi.Output<string>;
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     */
    public /*out*/ readonly azureSubscriptionId!: pulumi.Output<string>;
    /**
     * The Network Peering Container ID.
     */
    public /*out*/ readonly containerId!: pulumi.Output<string>;
    /**
     * Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     */
    public /*out*/ readonly gcpProjectId!: pulumi.Output<string>;
    /**
     * Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     */
    public /*out*/ readonly networkName!: pulumi.Output<string>;
    /**
     * Unique identifier for the Atlas project for this Network Peering Container.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     */
    public readonly providerName!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the project has Network Peering connections deployed in the container.
     */
    public /*out*/ readonly provisioned!: pulumi.Output<boolean>;
    /**
     * Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    public readonly regionName!: pulumi.Output<string>;
    /**
     * Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     */
    public readonly regions!: pulumi.Output<string[]>;
    /**
     * The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     */
    public /*out*/ readonly vnetName!: pulumi.Output<string>;
    /**
     * Unique identifier of Atlas' AWS VPC.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a NetworkContainer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkContainerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkContainerArgs | NetworkContainerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkContainerState | undefined;
            resourceInputs["atlasCidrBlock"] = state ? state.atlasCidrBlock : undefined;
            resourceInputs["azureSubscriptionId"] = state ? state.azureSubscriptionId : undefined;
            resourceInputs["containerId"] = state ? state.containerId : undefined;
            resourceInputs["gcpProjectId"] = state ? state.gcpProjectId : undefined;
            resourceInputs["networkName"] = state ? state.networkName : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerName"] = state ? state.providerName : undefined;
            resourceInputs["provisioned"] = state ? state.provisioned : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["regionName"] = state ? state.regionName : undefined;
            resourceInputs["regions"] = state ? state.regions : undefined;
            resourceInputs["vnetName"] = state ? state.vnetName : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as NetworkContainerArgs | undefined;
            if ((!args || args.atlasCidrBlock === undefined) && !opts.urn) {
                throw new Error("Missing required property 'atlasCidrBlock'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["atlasCidrBlock"] = args ? args.atlasCidrBlock : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerName"] = args ? args.providerName : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["regionName"] = args ? args.regionName : undefined;
            resourceInputs["regions"] = args ? args.regions : undefined;
            resourceInputs["azureSubscriptionId"] = undefined /*out*/;
            resourceInputs["containerId"] = undefined /*out*/;
            resourceInputs["gcpProjectId"] = undefined /*out*/;
            resourceInputs["networkName"] = undefined /*out*/;
            resourceInputs["provisioned"] = undefined /*out*/;
            resourceInputs["vnetName"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkContainer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkContainer resources.
 */
export interface NetworkContainerState {
    /**
     * CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     *
     * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     *
     * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     */
    atlasCidrBlock?: pulumi.Input<string>;
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     */
    azureSubscriptionId?: pulumi.Input<string>;
    /**
     * The Network Peering Container ID.
     */
    containerId?: pulumi.Input<string>;
    /**
     * Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     */
    gcpProjectId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     */
    networkName?: pulumi.Input<string>;
    /**
     * Unique identifier for the Atlas project for this Network Peering Container.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     */
    providerName?: pulumi.Input<string>;
    /**
     * Indicates whether the project has Network Peering connections deployed in the container.
     */
    provisioned?: pulumi.Input<boolean>;
    /**
     * Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     */
    region?: pulumi.Input<string>;
    /**
     * The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    regionName?: pulumi.Input<string>;
    /**
     * Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     */
    regions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     */
    vnetName?: pulumi.Input<string>;
    /**
     * Unique identifier of Atlas' AWS VPC.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkContainer resource.
 */
export interface NetworkContainerArgs {
    /**
     * CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     *
     * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     *
     * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     */
    atlasCidrBlock: pulumi.Input<string>;
    /**
     * Unique identifier for the Atlas project for this Network Peering Container.
     */
    projectId: pulumi.Input<string>;
    /**
     * Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     */
    providerName?: pulumi.Input<string>;
    /**
     * Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     */
    region?: pulumi.Input<string>;
    /**
     * The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     */
    regionName?: pulumi.Input<string>;
    /**
     * Atlas regions where the container resides. Provide this field only if you provide an `atlasCidrBlock` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     */
    regions?: pulumi.Input<pulumi.Input<string>[]>;
}
