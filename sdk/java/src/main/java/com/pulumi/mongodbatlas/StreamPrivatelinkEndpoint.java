// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.StreamPrivatelinkEndpointArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.StreamPrivatelinkEndpointState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.StreamPrivatelinkEndpoint
 * 
 * `mongodbatlas.StreamPrivatelinkEndpoint` describes a Privatelink Endpoint for Streams.
 * 
 * ## Example Usage
 * 
 * ### S
 * 
 */
@ResourceType(type="mongodbatlas:index/streamPrivatelinkEndpoint:StreamPrivatelinkEndpoint")
public class StreamPrivatelinkEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> arn;

    /**
     * @return Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
     * 
     */
    public Output<Optional<String>> arn() {
        return Codegen.optional(this.arn);
    }
    /**
     * The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
     * 
     */
    @Export(name="dnsDomain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dnsDomain;

    /**
     * @return The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
     * 
     */
    public Output<Optional<String>> dnsDomain() {
        return Codegen.optional(this.dnsDomain);
    }
    /**
     * Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn&#39;t use subdomains, you must set this to the empty array [].
     * 
     */
    @Export(name="dnsSubDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsSubDomains;

    /**
     * @return Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn&#39;t use subdomains, you must set this to the empty array [].
     * 
     */
    public Output<Optional<List<String>>> dnsSubDomains() {
        return Codegen.optional(this.dnsSubDomains);
    }
    /**
     * Error message if the connection is in a failed state.
     * 
     */
    @Export(name="errorMessage", refs={String.class}, tree="[0]")
    private Output<String> errorMessage;

    /**
     * @return Error message if the connection is in a failed state.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * Interface endpoint ID that is created from the specified service endpoint ID.
     * 
     */
    @Export(name="interfaceEndpointId", refs={String.class}, tree="[0]")
    private Output<String> interfaceEndpointId;

    /**
     * @return Interface endpoint ID that is created from the specified service endpoint ID.
     * 
     */
    public Output<String> interfaceEndpointId() {
        return this.interfaceEndpointId;
    }
    /**
     * Name of interface endpoint that is created from the specified service endpoint ID.
     * 
     */
    @Export(name="interfaceEndpointName", refs={String.class}, tree="[0]")
    private Output<String> interfaceEndpointName;

    /**
     * @return Name of interface endpoint that is created from the specified service endpoint ID.
     * 
     */
    public Output<String> interfaceEndpointName() {
        return this.interfaceEndpointName;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Account ID from the cloud provider.
     * 
     */
    @Export(name="providerAccountId", refs={String.class}, tree="[0]")
    private Output<String> providerAccountId;

    /**
     * @return Account ID from the cloud provider.
     * 
     */
    public Output<String> providerAccountId() {
        return this.providerAccountId;
    }
    /**
     * Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
     * 
     */
    @Export(name="serviceEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceEndpointId;

    /**
     * @return For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
     * 
     */
    public Output<Optional<String>> serviceEndpointId() {
        return Codegen.optional(this.serviceEndpointId);
    }
    /**
     * Status of the connection.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Status of the connection.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
     * 
     */
    @Export(name="vendor", refs={String.class}, tree="[0]")
    private Output<String> vendor;

    /**
     * @return Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
     * 
     */
    public Output<String> vendor() {
        return this.vendor;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamPrivatelinkEndpoint(java.lang.String name) {
        this(name, StreamPrivatelinkEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamPrivatelinkEndpoint(java.lang.String name, StreamPrivatelinkEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamPrivatelinkEndpoint(java.lang.String name, StreamPrivatelinkEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamPrivatelinkEndpoint:StreamPrivatelinkEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamPrivatelinkEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable StreamPrivatelinkEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/streamPrivatelinkEndpoint:StreamPrivatelinkEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamPrivatelinkEndpointArgs makeArgs(StreamPrivatelinkEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamPrivatelinkEndpointArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static StreamPrivatelinkEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamPrivatelinkEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamPrivatelinkEndpoint(name, id, state, options);
    }
}
