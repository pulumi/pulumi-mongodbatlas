// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### S
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * export = async () => {
 *     const project_tf = new mongodbatlas.Project("project-tf", {
 *         name: atlasProjectName,
 *         orgId: atlasOrgId,
 *     });
 *     // Set up cloud provider access in Atlas using the created IAM role
 *     const setupOnly = new mongodbatlas.CloudProviderAccessSetup("setup_only", {
 *         projectId: project_tf.id,
 *         providerName: "AWS",
 *     });
 *     const authRole = new mongodbatlas.CloudProviderAccessAuthorization("auth_role", {
 *         projectId: project_tf.id,
 *         roleId: setupOnly.roleId,
 *         aws: {
 *             iamAssumedRoleArn: testRole.arn,
 *         },
 *     });
 *     // Set up push-based log export with authorized IAM role
 *     const testPushBasedLogExport = new mongodbatlas.PushBasedLogExport("test", {
 *         projectId: project_tf.id,
 *         bucketName: logBucket.bucket,
 *         iamRoleId: authRole.roleId,
 *         prefixPath: "push-based-log-test",
 *     });
 *     const test = mongodbatlas.getPushBasedLogExportOutput({
 *         projectId: testPushBasedLogExport.projectId,
 *     });
 *     return {
 *         test: test.apply(test => test.prefixPath),
 *     };
 * }
 * ```
 *
 * ## Import
 *
 * Push-based log export resource can be imported using the project ID, e.g.
 *
 * For more information see: [MongoDB Atlas API - Push-Based Log Export](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Push-Based-Log-Export) Documentation.
 */
export class PushBasedLogExport extends pulumi.CustomResource {
    /**
     * Get an existing PushBasedLogExport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PushBasedLogExportState, opts?: pulumi.CustomResourceOptions): PushBasedLogExport {
        return new PushBasedLogExport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/pushBasedLogExport:PushBasedLogExport';

    /**
     * Returns true if the given object is an instance of PushBasedLogExport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PushBasedLogExport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PushBasedLogExport.__pulumiType;
    }

    /**
     * The name of the bucket to which the agent sends the logs to.
     */
    public readonly bucketName!: pulumi.Output<string>;
    /**
     * Date and time that this feature was enabled on.
     */
    public /*out*/ readonly createDate!: pulumi.Output<string>;
    /**
     * ID of the AWS IAM role that is used to write to the S3 bucket.
     */
    public readonly iamRoleId!: pulumi.Output<string>;
    /**
     * S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
     */
    public readonly prefixPath!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Describes whether or not the feature is enabled and what status it is in.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.PushBasedLogExportTimeouts | undefined>;

    /**
     * Create a PushBasedLogExport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PushBasedLogExportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PushBasedLogExportArgs | PushBasedLogExportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PushBasedLogExportState | undefined;
            resourceInputs["bucketName"] = state ? state.bucketName : undefined;
            resourceInputs["createDate"] = state ? state.createDate : undefined;
            resourceInputs["iamRoleId"] = state ? state.iamRoleId : undefined;
            resourceInputs["prefixPath"] = state ? state.prefixPath : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
        } else {
            const args = argsOrState as PushBasedLogExportArgs | undefined;
            if ((!args || args.bucketName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucketName'");
            }
            if ((!args || args.iamRoleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iamRoleId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["bucketName"] = args ? args.bucketName : undefined;
            resourceInputs["iamRoleId"] = args ? args.iamRoleId : undefined;
            resourceInputs["prefixPath"] = args ? args.prefixPath : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["createDate"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PushBasedLogExport.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PushBasedLogExport resources.
 */
export interface PushBasedLogExportState {
    /**
     * The name of the bucket to which the agent sends the logs to.
     */
    bucketName?: pulumi.Input<string>;
    /**
     * Date and time that this feature was enabled on.
     */
    createDate?: pulumi.Input<string>;
    /**
     * ID of the AWS IAM role that is used to write to the S3 bucket.
     */
    iamRoleId?: pulumi.Input<string>;
    /**
     * S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
     */
    prefixPath?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Describes whether or not the feature is enabled and what status it is in.
     */
    state?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.PushBasedLogExportTimeouts>;
}

/**
 * The set of arguments for constructing a PushBasedLogExport resource.
 */
export interface PushBasedLogExportArgs {
    /**
     * The name of the bucket to which the agent sends the logs to.
     */
    bucketName: pulumi.Input<string>;
    /**
     * ID of the AWS IAM role that is used to write to the S3 bucket.
     */
    iamRoleId: pulumi.Input<string>;
    /**
     * S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
     */
    prefixPath?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     */
    projectId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.PushBasedLogExportTimeouts>;
}
