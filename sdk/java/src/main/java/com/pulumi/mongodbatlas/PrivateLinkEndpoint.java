// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivateLinkEndpointArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivateLinkEndpointState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Private Endpoint Service can be imported using project ID, private link ID, provider name and region, in the format `{project_id}-{private_link_id}-{provider_name}-{region}`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint test 1112222b3bf99403840e8934-3242342343112-AWS-us-east-1
 * ```
 * 
 *  See detailed information for arguments and attributes[MongoDB API Private Endpoint Service](https://docs.atlas.mongodb.com/reference/api/private-endpoints-service-create-one//)
 * 
 */
@ResourceType(type="mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint")
public class PrivateLinkEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
     * 
     */
    @Export(name="endpointGroupNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> endpointGroupNames;

    /**
     * @return GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
     * 
     */
    public Output<List<String>> endpointGroupNames() {
        return this.endpointGroupNames;
    }
    /**
     * Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
     * 
     */
    @Export(name="endpointServiceName", refs={String.class}, tree="[0]")
    private Output<String> endpointServiceName;

    /**
     * @return Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
     * 
     */
    public Output<String> endpointServiceName() {
        return this.endpointServiceName;
    }
    /**
     * Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
     * AWS:
     * 
     */
    @Export(name="errorMessage", refs={String.class}, tree="[0]")
    private Output<String> errorMessage;

    /**
     * @return Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
     * AWS:
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
     * AZURE:
     * 
     */
    @Export(name="interfaceEndpoints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> interfaceEndpoints;

    /**
     * @return Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
     * AZURE:
     * 
     */
    public Output<List<String>> interfaceEndpoints() {
        return this.interfaceEndpoints;
    }
    /**
     * All private endpoints that you have added to this Azure Private Link Service.
     * 
     */
    @Export(name="privateEndpoints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privateEndpoints;

    /**
     * @return All private endpoints that you have added to this Azure Private Link Service.
     * 
     */
    public Output<List<String>> privateEndpoints() {
        return this.privateEndpoints;
    }
    /**
     * Unique identifier of the AWS PrivateLink connection.
     * 
     */
    @Export(name="privateLinkId", refs={String.class}, tree="[0]")
    private Output<String> privateLinkId;

    /**
     * @return Unique identifier of the AWS PrivateLink connection.
     * 
     */
    public Output<String> privateLinkId() {
        return this.privateLinkId;
    }
    /**
     * Name of the Azure Private Link Service that Atlas manages.
     * GCP:
     * 
     */
    @Export(name="privateLinkServiceName", refs={String.class}, tree="[0]")
    private Output<String> privateLinkServiceName;

    /**
     * @return Name of the Azure Private Link Service that Atlas manages.
     * GCP:
     * 
     */
    public Output<String> privateLinkServiceName() {
        return this.privateLinkServiceName;
    }
    @Export(name="privateLinkServiceResourceId", refs={String.class}, tree="[0]")
    private Output<String> privateLinkServiceResourceId;

    public Output<String> privateLinkServiceResourceId() {
        return this.privateLinkServiceResourceId;
    }
    /**
     * Required 	Unique identifier for the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Required 	Unique identifier for the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Cloud provider region in which you want to create the private endpoint connection.
     * Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * GCP region for the Private Service Connect endpoint service.
     * 
     */
    @Export(name="regionName", refs={String.class}, tree="[0]")
    private Output<String> regionName;

    /**
     * @return GCP region for the Private Service Connect endpoint service.
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }
    /**
     * Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
     * 
     */
    @Export(name="serviceAttachmentNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> serviceAttachmentNames;

    /**
     * @return Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
     * 
     */
    public Output<List<String>> serviceAttachmentNames() {
        return this.serviceAttachmentNames;
    }
    /**
     * Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
     * AWS:
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
     * AWS:
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkEndpoint(String name) {
        this(name, PrivateLinkEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkEndpoint(String name, PrivateLinkEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkEndpoint(String name, PrivateLinkEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, args == null ? PrivateLinkEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkEndpoint(String name, Output<String> id, @Nullable PrivateLinkEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateLinkEndpoint get(String name, Output<String> id, @Nullable PrivateLinkEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkEndpoint(name, id, state, options);
    }
}
