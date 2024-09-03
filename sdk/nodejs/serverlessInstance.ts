// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * # Resource: mongodbatlas.ServerlessInstance
 *
 * `mongodbatlas.ServerlessInstance` provides a Serverless Instance resource. This allows serverless instances to be created.
 *
 * > **NOTE:**  Serverless instances do not support some Atlas features at this time.
 * For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
 *
 * ## Example Usage
 *
 * ### Basic
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.ServerlessInstance("test", {
 *     projectId: "<PROJECT_ID>",
 *     name: "<SERVERLESS_INSTANCE_NAME>",
 *     providerSettingsBackingProviderName: "AWS",
 *     providerSettingsProviderName: "SERVERLESS",
 *     providerSettingsRegionName: "US_EAST_1",
 * });
 * ```
 *
 * **NOTE:**  `mongodbatlas.ServerlessInstance` and `mongodbatlas.PrivatelinkEndpointServiceServerless` resources have a circular dependency in some respects.That is, the `serverlessInstance` must exist before the `privatelinkEndpointService` can be created,and the `privatelinkEndpointService` must exist before the `serverlessInstance` gets its respective `connectionStringsPrivateEndpointSrv` values.
 *
 * Because of this, the `serverlessInstance` data source has particular value as a source of the `connectionStringsPrivateEndpointSrv`.When using the dataSource in-tandem with the afforementioned resources, we can create and retrieve the `connectionStringsPrivateEndpointSrv` in a single `pulumi up`.
 *
 * Follow this example to setup private connection to a serverless instance using aws vpc and get the connection strings in a single `pulumi up`
 *
 * ## Import
 *
 * Serverless Instance can be imported using the group ID and serverless instance name, in the format `GROUP_ID-SERVERLESS_INSTANCE_NAME`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/serverlessInstance:ServerlessInstance my_serverless_instance 1112222b3bf99403840e8934-My Serverless Instance
 * ```
 *
 * For more information see: [MongoDB Atlas API - Serverless Instance](https://docs.atlas.mongodb.com/reference/api/serverless-instances/) Documentation.
 */
export class ServerlessInstance extends pulumi.CustomResource {
    /**
     * Get an existing ServerlessInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerlessInstanceState, opts?: pulumi.CustomResourceOptions): ServerlessInstance {
        return new ServerlessInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/serverlessInstance:ServerlessInstance';

    /**
     * Returns true if the given object is an instance of ServerlessInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerlessInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerlessInstance.__pulumiType;
    }

    /**
     * Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/). This parameter defaults to true.
     */
    public readonly autoIndexing!: pulumi.Output<boolean>;
    /**
     * List of Serverless Private Endpoint Connections
     */
    public /*out*/ readonly connectionStringsPrivateEndpointSrvs!: pulumi.Output<string[]>;
    /**
     * Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     */
    public /*out*/ readonly connectionStringsStandardSrv!: pulumi.Output<string>;
    /**
     * Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
     */
    public readonly continuousBackupEnabled!: pulumi.Output<boolean>;
    /**
     * Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
     */
    public /*out*/ readonly createDate!: pulumi.Output<string>;
    public readonly links!: pulumi.Output<outputs.ServerlessInstanceLink[]>;
    /**
     * Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
     */
    public /*out*/ readonly mongoDbVersion!: pulumi.Output<string>;
    /**
     * Human-readable label that identifies the serverless instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the organization or project you want to create the serverless instance within.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     */
    public readonly providerSettingsBackingProviderName!: pulumi.Output<string>;
    /**
     * Cloud service provider that applies to the provisioned the serverless instance.
     */
    public readonly providerSettingsProviderName!: pulumi.Output<string>;
    /**
     * Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     */
    public readonly providerSettingsRegionName!: pulumi.Output<string>;
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     */
    public readonly stateName!: pulumi.Output<string>;
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     */
    public readonly tags!: pulumi.Output<outputs.ServerlessInstanceTag[] | undefined>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    public readonly terminationProtectionEnabled!: pulumi.Output<boolean>;

    /**
     * Create a ServerlessInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerlessInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerlessInstanceArgs | ServerlessInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerlessInstanceState | undefined;
            resourceInputs["autoIndexing"] = state ? state.autoIndexing : undefined;
            resourceInputs["connectionStringsPrivateEndpointSrvs"] = state ? state.connectionStringsPrivateEndpointSrvs : undefined;
            resourceInputs["connectionStringsStandardSrv"] = state ? state.connectionStringsStandardSrv : undefined;
            resourceInputs["continuousBackupEnabled"] = state ? state.continuousBackupEnabled : undefined;
            resourceInputs["createDate"] = state ? state.createDate : undefined;
            resourceInputs["links"] = state ? state.links : undefined;
            resourceInputs["mongoDbVersion"] = state ? state.mongoDbVersion : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerSettingsBackingProviderName"] = state ? state.providerSettingsBackingProviderName : undefined;
            resourceInputs["providerSettingsProviderName"] = state ? state.providerSettingsProviderName : undefined;
            resourceInputs["providerSettingsRegionName"] = state ? state.providerSettingsRegionName : undefined;
            resourceInputs["stateName"] = state ? state.stateName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["terminationProtectionEnabled"] = state ? state.terminationProtectionEnabled : undefined;
        } else {
            const args = argsOrState as ServerlessInstanceArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerSettingsBackingProviderName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerSettingsBackingProviderName'");
            }
            if ((!args || args.providerSettingsProviderName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerSettingsProviderName'");
            }
            if ((!args || args.providerSettingsRegionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerSettingsRegionName'");
            }
            resourceInputs["autoIndexing"] = args ? args.autoIndexing : undefined;
            resourceInputs["continuousBackupEnabled"] = args ? args.continuousBackupEnabled : undefined;
            resourceInputs["links"] = args ? args.links : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerSettingsBackingProviderName"] = args ? args.providerSettingsBackingProviderName : undefined;
            resourceInputs["providerSettingsProviderName"] = args ? args.providerSettingsProviderName : undefined;
            resourceInputs["providerSettingsRegionName"] = args ? args.providerSettingsRegionName : undefined;
            resourceInputs["stateName"] = args ? args.stateName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["terminationProtectionEnabled"] = args ? args.terminationProtectionEnabled : undefined;
            resourceInputs["connectionStringsPrivateEndpointSrvs"] = undefined /*out*/;
            resourceInputs["connectionStringsStandardSrv"] = undefined /*out*/;
            resourceInputs["createDate"] = undefined /*out*/;
            resourceInputs["mongoDbVersion"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerlessInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerlessInstance resources.
 */
export interface ServerlessInstanceState {
    /**
     * Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/). This parameter defaults to true.
     */
    autoIndexing?: pulumi.Input<boolean>;
    /**
     * List of Serverless Private Endpoint Connections
     */
    connectionStringsPrivateEndpointSrvs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     */
    connectionStringsStandardSrv?: pulumi.Input<string>;
    /**
     * Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
     */
    continuousBackupEnabled?: pulumi.Input<boolean>;
    /**
     * Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
     */
    createDate?: pulumi.Input<string>;
    links?: pulumi.Input<pulumi.Input<inputs.ServerlessInstanceLink>[]>;
    /**
     * Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
     */
    mongoDbVersion?: pulumi.Input<string>;
    /**
     * Human-readable label that identifies the serverless instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization or project you want to create the serverless instance within.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     */
    providerSettingsBackingProviderName?: pulumi.Input<string>;
    /**
     * Cloud service provider that applies to the provisioned the serverless instance.
     */
    providerSettingsProviderName?: pulumi.Input<string>;
    /**
     * Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     */
    providerSettingsRegionName?: pulumi.Input<string>;
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     */
    stateName?: pulumi.Input<string>;
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ServerlessInstanceTag>[]>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    terminationProtectionEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ServerlessInstance resource.
 */
export interface ServerlessInstanceArgs {
    /**
     * Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/). This parameter defaults to true.
     */
    autoIndexing?: pulumi.Input<boolean>;
    /**
     * Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
     */
    continuousBackupEnabled?: pulumi.Input<boolean>;
    links?: pulumi.Input<pulumi.Input<inputs.ServerlessInstanceLink>[]>;
    /**
     * Human-readable label that identifies the serverless instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization or project you want to create the serverless instance within.
     */
    projectId: pulumi.Input<string>;
    /**
     * Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     */
    providerSettingsBackingProviderName: pulumi.Input<string>;
    /**
     * Cloud service provider that applies to the provisioned the serverless instance.
     */
    providerSettingsProviderName: pulumi.Input<string>;
    /**
     * Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     */
    providerSettingsRegionName: pulumi.Input<string>;
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     */
    stateName?: pulumi.Input<string>;
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ServerlessInstanceTag>[]>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    terminationProtectionEnabled?: pulumi.Input<boolean>;
}
