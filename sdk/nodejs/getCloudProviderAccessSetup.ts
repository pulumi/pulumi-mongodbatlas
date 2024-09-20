// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.CloudProviderAccessSetup
 *
 * `mongodbatlas.CloudProviderAccessSetup` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ### With AWS
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRole = new mongodbatlas.CloudProviderAccessSetup("test_role", {
 *     projectId: "64259ee860c43338194b0f8e",
 *     providerName: "AWS",
 * });
 * const singleSetup = mongodbatlas.getCloudProviderAccessSetupOutput({
 *     projectId: testRole.projectId,
 *     providerName: testRole.providerName,
 *     roleId: testRole.roleId,
 * });
 * ```
 *
 * ### With AZURE
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRole = new mongodbatlas.CloudProviderAccessSetup("test_role", {
 *     projectId: "64259ee860c43338194b0f8e",
 *     providerName: "AZURE",
 *     azureConfigs: [{
 *         atlasAzureAppId: "9f2deb0d-be22-4524-a403-df531868bac0",
 *         servicePrincipalId: "22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1",
 *         tenantId: "91402384-d71e-22f5-22dd-759e272cdc1c",
 *     }],
 * });
 * const singleSetup = mongodbatlas.getCloudProviderAccessSetupOutput({
 *     projectId: testRole.projectId,
 *     providerName: testRole.providerName,
 *     roleId: testRole.roleId,
 * });
 * ```
 */
export function getCloudProviderAccessSetup(args: GetCloudProviderAccessSetupArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudProviderAccessSetupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", {
        "azureConfigs": args.azureConfigs,
        "projectId": args.projectId,
        "providerName": args.providerName,
        "roleId": args.roleId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudProviderAccessSetup.
 */
export interface GetCloudProviderAccessSetupArgs {
    /**
     * azure related configurations
     */
    azureConfigs?: inputs.GetCloudProviderAccessSetupAzureConfig[];
    /**
     * The unique ID for the project to get all Cloud Provider Access
     */
    projectId: string;
    /**
     * cloud provider name, currently only AWS is supported
     */
    providerName: string;
    /**
     * unique role id among all the aws roles provided by mongodb atlas
     */
    roleId: string;
}

/**
 * A collection of values returned by getCloudProviderAccessSetup.
 */
export interface GetCloudProviderAccessSetupResult {
    /**
     * aws related role information
     */
    readonly aws: {[key: string]: string};
    /**
     * aws related role information
     */
    readonly awsConfigs: outputs.GetCloudProviderAccessSetupAwsConfig[];
    /**
     * azure related configurations
     */
    readonly azureConfigs?: outputs.GetCloudProviderAccessSetupAzureConfig[];
    /**
     * Date on which this role was created.
     */
    readonly createdDate: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Date and time when this Azure Service Principal was last updated. This parameter expresses its value in the ISO 8601 timestamp format in UTC.
     */
    readonly lastUpdatedDate: string;
    readonly projectId: string;
    readonly providerName: string;
    readonly roleId: string;
}
/**
 * ## # Data Source: mongodbatlas.CloudProviderAccessSetup
 *
 * `mongodbatlas.CloudProviderAccessSetup` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ### With AWS
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRole = new mongodbatlas.CloudProviderAccessSetup("test_role", {
 *     projectId: "64259ee860c43338194b0f8e",
 *     providerName: "AWS",
 * });
 * const singleSetup = mongodbatlas.getCloudProviderAccessSetupOutput({
 *     projectId: testRole.projectId,
 *     providerName: testRole.providerName,
 *     roleId: testRole.roleId,
 * });
 * ```
 *
 * ### With AZURE
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testRole = new mongodbatlas.CloudProviderAccessSetup("test_role", {
 *     projectId: "64259ee860c43338194b0f8e",
 *     providerName: "AZURE",
 *     azureConfigs: [{
 *         atlasAzureAppId: "9f2deb0d-be22-4524-a403-df531868bac0",
 *         servicePrincipalId: "22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1",
 *         tenantId: "91402384-d71e-22f5-22dd-759e272cdc1c",
 *     }],
 * });
 * const singleSetup = mongodbatlas.getCloudProviderAccessSetupOutput({
 *     projectId: testRole.projectId,
 *     providerName: testRole.providerName,
 *     roleId: testRole.roleId,
 * });
 * ```
 */
export function getCloudProviderAccessSetupOutput(args: GetCloudProviderAccessSetupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudProviderAccessSetupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", {
        "azureConfigs": args.azureConfigs,
        "projectId": args.projectId,
        "providerName": args.providerName,
        "roleId": args.roleId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudProviderAccessSetup.
 */
export interface GetCloudProviderAccessSetupOutputArgs {
    /**
     * azure related configurations
     */
    azureConfigs?: pulumi.Input<pulumi.Input<inputs.GetCloudProviderAccessSetupAzureConfigArgs>[]>;
    /**
     * The unique ID for the project to get all Cloud Provider Access
     */
    projectId: pulumi.Input<string>;
    /**
     * cloud provider name, currently only AWS is supported
     */
    providerName: pulumi.Input<string>;
    /**
     * unique role id among all the aws roles provided by mongodb atlas
     */
    roleId: pulumi.Input<string>;
}
