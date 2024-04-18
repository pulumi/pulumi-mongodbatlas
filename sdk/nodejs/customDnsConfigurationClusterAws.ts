// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.CustomDnsConfigurationClusterAws` provides a Custom DNS Configuration for Atlas Clusters on AWS resource. This represents a Custom DNS Configuration for Atlas Clusters on AWS that can be updated in an Atlas project.
 *
 * > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.CustomDnsConfigurationClusterAws("test", {
 *     projectId: "<PROJECT-ID>",
 *     enabled: true,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Custom DNS Configuration for Atlas Clusters on AWS must be imported using Project ID, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws test 1112222b3bf99403840e8934
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Custom DNS Configuration for Atlas Clusters on AWS](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/AWS-Clusters-DNS/operation/getAWSCustomDNS).
 */
export class CustomDnsConfigurationClusterAws extends pulumi.CustomResource {
    /**
     * Get an existing CustomDnsConfigurationClusterAws resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomDnsConfigurationClusterAwsState, opts?: pulumi.CustomResourceOptions): CustomDnsConfigurationClusterAws {
        return new CustomDnsConfigurationClusterAws(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws';

    /**
     * Returns true if the given object is an instance of CustomDnsConfigurationClusterAws.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomDnsConfigurationClusterAws {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomDnsConfigurationClusterAws.__pulumiType;
    }

    /**
     * Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Required 	Unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a CustomDnsConfigurationClusterAws resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomDnsConfigurationClusterAwsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomDnsConfigurationClusterAwsArgs | CustomDnsConfigurationClusterAwsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomDnsConfigurationClusterAwsState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as CustomDnsConfigurationClusterAwsArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomDnsConfigurationClusterAws.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomDnsConfigurationClusterAws resources.
 */
export interface CustomDnsConfigurationClusterAwsState {
    /**
     * Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Required 	Unique identifier for the project.
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomDnsConfigurationClusterAws resource.
 */
export interface CustomDnsConfigurationClusterAwsArgs {
    /**
     * Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Required 	Unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
}
