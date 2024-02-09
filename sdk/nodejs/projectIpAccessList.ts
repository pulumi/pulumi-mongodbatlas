// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ProjectIpAccessList` provides an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * > **IMPORTANT:**
 * When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.
 *
 * ## Example Usage
 * ### Using CIDR Block
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ProjectIpAccessList("test", {
 *     cidrBlock: "1.2.3.4/32",
 *     comment: "cidr block for tf acc testing",
 *     projectId: "<PROJECT-ID>",
 * });
 * ```
 * ### Using IP Address
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ProjectIpAccessList("test", {
 *     comment: "ip address for tf acc testing",
 *     ipAddress: "2.3.4.5",
 *     projectId: "<PROJECT-ID>",
 * });
 * ```
 * ### Using an AWS Security Group
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testNetworkContainer = new mongodbatlas.NetworkContainer("testNetworkContainer", {
 *     projectId: "<PROJECT-ID>",
 *     atlasCidrBlock: "192.168.208.0/21",
 *     providerName: "AWS",
 *     regionName: "US_EAST_1",
 * });
 * const testNetworkPeering = new mongodbatlas.NetworkPeering("testNetworkPeering", {
 *     projectId: "<PROJECT-ID>",
 *     containerId: testNetworkContainer.containerId,
 *     accepterRegionName: "us-east-1",
 *     providerName: "AWS",
 *     routeTableCidrBlock: "172.31.0.0/16",
 *     vpcId: "vpc-0d93d6f69f1578bd8",
 *     awsAccountId: "232589400519",
 * });
 * const testProjectIpAccessList = new mongodbatlas.ProjectIpAccessList("testProjectIpAccessList", {
 *     projectId: "<PROJECT-ID>",
 *     awsSecurityGroup: "sg-0026348ec11780bd1",
 *     comment: "TestAcc for awsSecurityGroup",
 * }, {
 *     dependsOn: ["mongodbatlas_network_peering.test"],
 * });
 * ```
 *
 * > **IMPORTANT:** In order to use AWS Security Group(s) VPC Peering must be enabled like above example.
 *
 * ## Import
 *
 * IP Access List entries can be imported using the `project_id` and `cidr_block` or `ip_address`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/projectIpAccessList:ProjectIpAccessList test 5d0f1f74cf09a29120e123cd-10.242.88.0/21
 * ```
 *  For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/access-lists/)
 */
export class ProjectIpAccessList extends pulumi.CustomResource {
    /**
     * Get an existing ProjectIpAccessList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectIpAccessListState, opts?: pulumi.CustomResourceOptions): ProjectIpAccessList {
        return new ProjectIpAccessList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/projectIpAccessList:ProjectIpAccessList';

    /**
     * Returns true if the given object is an instance of ProjectIpAccessList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectIpAccessList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectIpAccessList.__pulumiType;
    }

    /**
     * Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     */
    public readonly awsSecurityGroup!: pulumi.Output<string>;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     */
    public readonly cidrBlock!: pulumi.Output<string>;
    /**
     * Comment to add to the access list entry.
     *
     * > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
     */
    public readonly comment!: pulumi.Output<string>;
    /**
     * Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     */
    public readonly projectId!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.ProjectIpAccessListTimeouts | undefined>;

    /**
     * Create a ProjectIpAccessList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectIpAccessListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectIpAccessListArgs | ProjectIpAccessListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectIpAccessListState | undefined;
            resourceInputs["awsSecurityGroup"] = state ? state.awsSecurityGroup : undefined;
            resourceInputs["cidrBlock"] = state ? state.cidrBlock : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
        } else {
            const args = argsOrState as ProjectIpAccessListArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["awsSecurityGroup"] = args ? args.awsSecurityGroup : undefined;
            resourceInputs["cidrBlock"] = args ? args.cidrBlock : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectIpAccessList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectIpAccessList resources.
 */
export interface ProjectIpAccessListState {
    /**
     * Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     */
    awsSecurityGroup?: pulumi.Input<string>;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * Comment to add to the access list entry.
     *
     * > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
     */
    comment?: pulumi.Input<string>;
    /**
     * Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     */
    projectId?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.ProjectIpAccessListTimeouts>;
}

/**
 * The set of arguments for constructing a ProjectIpAccessList resource.
 */
export interface ProjectIpAccessListArgs {
    /**
     * Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     */
    awsSecurityGroup?: pulumi.Input<string>;
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * Comment to add to the access list entry.
     *
     * > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
     */
    comment?: pulumi.Input<string>;
    /**
     * Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     */
    projectId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.ProjectIpAccessListTimeouts>;
}
