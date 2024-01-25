// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.ServerlessInstance` describe a single serverless instance. This represents a single serverless instance that have been created.
 * > **NOTE:**  Serverless instances do not support some Atlas features at this time.
 * For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 * ### Basic
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testTwo = mongodbatlas.getServerlessInstance({
 *     name: "<SERVERLESS_INSTANCE_NAME>",
 *     projectId: "<PROJECT_ID >",
 * });
 * ```
 *
 * **NOTE:**  `mongodbatlas.ServerlessInstance` and `mongodbatlas.PrivatelinkEndpointServiceServerless` resources have a circular dependency in some respects.\
 * That is, the `serverlessInstance` must exist before the `privatelinkEndpointService` can be created,\
 * and the `privatelinkEndpointService` must exist before the `serverlessInstance` gets its respective `connectionStringsPrivateEndpointSrv` values.
 *
 * Because of this, the `serverlessInstance` data source has particular value as a source of the `connectionStringsPrivateEndpointSrv`.\
 * When using the dataSource in-tandem with the afforementioned resources, we can create and retrieve the `connectionStringsPrivateEndpointSrv` in a single `pulumi up`.
 *
 * Follow this example to setup private connection to a serverless instance using aws vpc and get the connection strings in a single `pulumi up`
 */
export function getServerlessInstance(args: GetServerlessInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetServerlessInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getServerlessInstance:getServerlessInstance", {
        "continuousBackupEnabled": args.continuousBackupEnabled,
        "links": args.links,
        "name": args.name,
        "projectId": args.projectId,
        "stateName": args.stateName,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerlessInstance.
 */
export interface GetServerlessInstanceArgs {
    /**
     * Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
     */
    continuousBackupEnabled?: boolean;
    links?: inputs.GetServerlessInstanceLink[];
    /**
     * Human-readable label that identifies your serverless instance.
     */
    name: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
     */
    projectId: string;
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     */
    stateName?: string;
}

/**
 * A collection of values returned by getServerlessInstance.
 */
export interface GetServerlessInstanceResult {
    /**
     * List of Serverless Private Endpoint Connections
     */
    readonly connectionStringsPrivateEndpointSrvs: string[];
    /**
     * Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     */
    readonly connectionStringsStandardSrv: string;
    /**
     * Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
     */
    readonly continuousBackupEnabled: boolean;
    readonly createDate: string;
    /**
     * Unique 24-hexadecimal digit string that identifies the serverless instance.
     */
    readonly id: string;
    readonly links: outputs.GetServerlessInstanceLink[];
    /**
     * Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
     */
    readonly mongoDbVersion: string;
    readonly name: string;
    readonly projectId: string;
    /**
     * Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     */
    readonly providerSettingsBackingProviderName: string;
    /**
     * Cloud service provider that applies to the provisioned the serverless instance.
     */
    readonly providerSettingsProviderName: string;
    /**
     * Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     */
    readonly providerSettingsRegionName: string;
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     */
    readonly stateName: string;
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     */
    readonly tags: outputs.GetServerlessInstanceTag[];
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    readonly terminationProtectionEnabled: boolean;
}
/**
 * `mongodbatlas.ServerlessInstance` describe a single serverless instance. This represents a single serverless instance that have been created.
 * > **NOTE:**  Serverless instances do not support some Atlas features at this time.
 * For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 * ### Basic
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testTwo = mongodbatlas.getServerlessInstance({
 *     name: "<SERVERLESS_INSTANCE_NAME>",
 *     projectId: "<PROJECT_ID >",
 * });
 * ```
 *
 * **NOTE:**  `mongodbatlas.ServerlessInstance` and `mongodbatlas.PrivatelinkEndpointServiceServerless` resources have a circular dependency in some respects.\
 * That is, the `serverlessInstance` must exist before the `privatelinkEndpointService` can be created,\
 * and the `privatelinkEndpointService` must exist before the `serverlessInstance` gets its respective `connectionStringsPrivateEndpointSrv` values.
 *
 * Because of this, the `serverlessInstance` data source has particular value as a source of the `connectionStringsPrivateEndpointSrv`.\
 * When using the dataSource in-tandem with the afforementioned resources, we can create and retrieve the `connectionStringsPrivateEndpointSrv` in a single `pulumi up`.
 *
 * Follow this example to setup private connection to a serverless instance using aws vpc and get the connection strings in a single `pulumi up`
 */
export function getServerlessInstanceOutput(args: GetServerlessInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerlessInstanceResult> {
    return pulumi.output(args).apply((a: any) => getServerlessInstance(a, opts))
}

/**
 * A collection of arguments for invoking getServerlessInstance.
 */
export interface GetServerlessInstanceOutputArgs {
    /**
     * Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
     */
    continuousBackupEnabled?: pulumi.Input<boolean>;
    links?: pulumi.Input<pulumi.Input<inputs.GetServerlessInstanceLinkArgs>[]>;
    /**
     * Human-readable label that identifies your serverless instance.
     */
    name: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
     */
    projectId: pulumi.Input<string>;
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     */
    stateName?: pulumi.Input<string>;
}
