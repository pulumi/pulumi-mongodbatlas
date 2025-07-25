// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives
 *
 * `mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const atlas_project = new mongodbatlas.Project("atlas-project", {
 *     orgId: atlasOrgId,
 *     name: atlasProjectName,
 * });
 * const test = new mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test", {
 *     projectId: atlas_project.id,
 *     endpointId: "vpce-046cf43c79424d4c9",
 *     providerName: "AWS",
 *     comment: "Test",
 *     region: "US_EAST_1",
 *     customerEndpointDnsName: "vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com",
 * });
 * const testDataSource = mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput({
 *     projectId: atlas_project.id,
 * });
 * ```
 */
export function getPrivatelinkEndpointServiceDataFederationOnlineArchives(args: GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchives.
 */
export interface GetPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchives.
 */
export interface GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * A list where each represents a Private Endpoint Service
     */
    readonly results: outputs.GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult[];
}
/**
 * ## # Data Source: mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives
 *
 * `mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const atlas_project = new mongodbatlas.Project("atlas-project", {
 *     orgId: atlasOrgId,
 *     name: atlasProjectName,
 * });
 * const test = new mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test", {
 *     projectId: atlas_project.id,
 *     endpointId: "vpce-046cf43c79424d4c9",
 *     providerName: "AWS",
 *     comment: "Test",
 *     region: "US_EAST_1",
 *     customerEndpointDnsName: "vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com",
 * });
 * const testDataSource = mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput({
 *     projectId: atlas_project.id,
 * });
 * ```
 */
export function getPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput(args: GetPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchives.
 */
export interface GetPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: pulumi.Input<string>;
}
