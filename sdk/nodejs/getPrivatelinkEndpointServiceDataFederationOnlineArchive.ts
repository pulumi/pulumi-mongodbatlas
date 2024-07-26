// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive
 *
 * `mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive` describes a Private Endpoint Service resource for Data Federation and Online Archive.
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
 * const testDataSource = mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchiveOutput({
 *     projectId: atlas_project.id,
 *     endpointId: test.endpointId,
 * });
 * ```
 */
export function getPrivatelinkEndpointServiceDataFederationOnlineArchive(args: GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchive:getPrivatelinkEndpointServiceDataFederationOnlineArchive", {
        "endpointId": args.endpointId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchive.
 */
export interface GetPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs {
    /**
     * Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     */
    endpointId: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchive.
 */
export interface GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult {
    /**
     * Human-readable string to associate with this private endpoint.
     */
    readonly comment: string;
    /**
     * (Optional) Human-readable label to identify VPC endpoint DNS name.
     */
    readonly customerEndpointDnsName: string;
    readonly endpointId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    /**
     * Human-readable label that identifies the cloud service provider.
     */
    readonly providerName: string;
    /**
     * Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     */
    readonly region: string;
    /**
     * Human-readable label that identifies the resource type associated with this private endpoint.
     */
    readonly type: string;
}
/**
 * ## # Data Source: mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive
 *
 * `mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive` describes a Private Endpoint Service resource for Data Federation and Online Archive.
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
 * const testDataSource = mongodbatlas.getPrivatelinkEndpointServiceDataFederationOnlineArchiveOutput({
 *     projectId: atlas_project.id,
 *     endpointId: test.endpointId,
 * });
 * ```
 */
export function getPrivatelinkEndpointServiceDataFederationOnlineArchiveOutput(args: GetPrivatelinkEndpointServiceDataFederationOnlineArchiveOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult> {
    return pulumi.output(args).apply((a: any) => getPrivatelinkEndpointServiceDataFederationOnlineArchive(a, opts))
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchive.
 */
export interface GetPrivatelinkEndpointServiceDataFederationOnlineArchiveOutputArgs {
    /**
     * Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     */
    endpointId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: pulumi.Input<string>;
}
