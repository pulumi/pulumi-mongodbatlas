// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const atlas_project = new mongodbatlas.Project("atlas-project", {orgId: _var.atlas_org_id});
 * const test = new mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test", {
 *     projectId: atlas_project.id,
 *     endpointId: "<PRIVATE-ENDPOINT-SERVICE-ID>",
 *     providerName: "AWS",
 *     comment: "Test",
 * });
 * const testDataSource = mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput({
 *     projectId: atlas_project.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
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
 * `mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const atlas_project = new mongodbatlas.Project("atlas-project", {orgId: _var.atlas_org_id});
 * const test = new mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test", {
 *     projectId: atlas_project.id,
 *     endpointId: "<PRIVATE-ENDPOINT-SERVICE-ID>",
 *     providerName: "AWS",
 *     comment: "Test",
 * });
 * const testDataSource = mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput({
 *     projectId: atlas_project.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput(args: GetPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult> {
    return pulumi.output(args).apply((a: any) => getPrivatelinkEndpointServiceDataFederationOnlineArchives(a, opts))
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
