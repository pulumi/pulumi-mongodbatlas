// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivateLinkEndpointServiceArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivateLinkEndpointServiceState;
import com.pulumi.mongodbatlas.outputs.PrivateLinkEndpointServiceEndpoint;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.PrivateLinkEndpointService
 * 
 * `mongodbatlas.PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one [Interface Endpoint](https://www.mongodb.com/docs/atlas/security-private-endpoint/#private-endpoint-concepts) to a private endpoint connection in an Atlas project.
 * 
 * &gt; **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * &gt; **NOTE:** Create and delete wait for all clusters on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation or deletion of this resource. Default timeout is 2hrs.
 * 
 * ## Example with AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpoint;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpointArgs;
 * import com.pulumi.aws.vpcEndpoint;
 * import com.pulumi.aws.VpcEndpointArgs;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpointService;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpointServiceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new PrivateLinkEndpoint("test", PrivateLinkEndpointArgs.builder()
 *             .projectId("<PROJECT_ID>")
 *             .providerName("AWS")
 *             .region("US_EAST_1")
 *             .build());
 * 
 *         var ptfeService = new VpcEndpoint("ptfeService", VpcEndpointArgs.builder()
 *             .vpcId("vpc-7fc0a543")
 *             .serviceName(test.endpointServiceName())
 *             .vpcEndpointType("Interface")
 *             .subnetIds("subnet-de0406d2")
 *             .securityGroupIds("sg-3f238186")
 *             .build());
 * 
 *         var testPrivateLinkEndpointService = new PrivateLinkEndpointService("testPrivateLinkEndpointService", PrivateLinkEndpointServiceArgs.builder()
 *             .projectId(test.projectId())
 *             .privateLinkId(test.privateLinkId())
 *             .endpointServiceId(ptfeService.id())
 *             .providerName("AWS")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Example with Azure
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpoint;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpointArgs;
 * import com.pulumi.azurerm.privateEndpoint;
 * import com.pulumi.azurerm.PrivateEndpointArgs;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpointService;
 * import com.pulumi.mongodbatlas.PrivateLinkEndpointServiceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new PrivateLinkEndpoint("test", PrivateLinkEndpointArgs.builder()
 *             .projectId(projectId)
 *             .providerName("AZURE")
 *             .region("eastus2")
 *             .build());
 * 
 *         var testPrivateEndpoint = new PrivateEndpoint("testPrivateEndpoint", PrivateEndpointArgs.builder()
 *             .name("endpoint-test")
 *             .location(testAzurermResourceGroup.location())
 *             .resourceGroupName(resourceGroupName)
 *             .subnetId(testAzurermSubnet.id())
 *             .privateServiceConnection(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .build());
 * 
 *         var testPrivateLinkEndpointService = new PrivateLinkEndpointService("testPrivateLinkEndpointService", PrivateLinkEndpointServiceArgs.builder()
 *             .projectId(test.projectId())
 *             .privateLinkId(test.privateLinkId())
 *             .endpointServiceId(testPrivateEndpoint.id())
 *             .privateEndpointIpAddress(testPrivateEndpoint.privateServiceConnection()[0].privateIpAddress())
 *             .providerName("AZURE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Example with GCP
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Available complete examples
 * - Setup private connection to a MongoDB Atlas Cluster with AWS VPC
 * 
 * ## Import
 * 
 * Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)
 * 
 */
@ResourceType(type="mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService")
public class PrivateLinkEndpointService extends com.pulumi.resources.CustomResource {
    /**
     * Status of the interface endpoint for AWS.
     * Returns one of the following values:
     * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
     * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
     * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
     * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
     * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
     * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
     * 
     */
    @Export(name="awsConnectionStatus", refs={String.class}, tree="[0]")
    private Output<String> awsConnectionStatus;

    /**
     * @return Status of the interface endpoint for AWS.
     * Returns one of the following values:
     * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
     * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
     * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
     * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
     * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
     * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
     * 
     */
    public Output<String> awsConnectionStatus() {
        return this.awsConnectionStatus;
    }
    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    @Export(name="azureStatus", refs={String.class}, tree="[0]")
    private Output<String> azureStatus;

    /**
     * @return Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    public Output<String> azureStatus() {
        return this.azureStatus;
    }
    /**
     * Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     * 
     */
    @Export(name="deleteRequested", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deleteRequested;

    /**
     * @return Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     * 
     */
    public Output<Boolean> deleteRequested() {
        return this.deleteRequested;
    }
    /**
     * (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
     * 
     */
    @Export(name="endpointGroupName", refs={String.class}, tree="[0]")
    private Output<String> endpointGroupName;

    /**
     * @return (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
     * 
     */
    public Output<String> endpointGroupName() {
        return this.endpointGroupName;
    }
    /**
     * Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     * 
     */
    @Export(name="endpointServiceId", refs={String.class}, tree="[0]")
    private Output<String> endpointServiceId;

    /**
     * @return Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     * 
     */
    public Output<String> endpointServiceId() {
        return this.endpointServiceId;
    }
    /**
     * Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     * 
     */
    @Export(name="endpoints", refs={List.class,PrivateLinkEndpointServiceEndpoint.class}, tree="[0,1]")
    private Output<List<PrivateLinkEndpointServiceEndpoint>> endpoints;

    /**
     * @return Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     * 
     */
    public Output<List<PrivateLinkEndpointServiceEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * Error message pertaining to the interface endpoint. Returns null if there are no errors.
     * 
     */
    @Export(name="errorMessage", refs={String.class}, tree="[0]")
    private Output<String> errorMessage;

    /**
     * @return Error message pertaining to the interface endpoint. Returns null if there are no errors.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     * 
     */
    @Export(name="gcpProjectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gcpProjectId;

    /**
     * @return Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     * 
     */
    public Output<Optional<String>> gcpProjectId() {
        return Codegen.optional(this.gcpProjectId);
    }
    /**
     * Status of the interface endpoint for GCP.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    @Export(name="gcpStatus", refs={String.class}, tree="[0]")
    private Output<String> gcpStatus;

    /**
     * @return Status of the interface endpoint for GCP.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    public Output<String> gcpStatus() {
        return this.gcpStatus;
    }
    /**
     * Unique identifier of the interface endpoint.
     * 
     */
    @Export(name="interfaceEndpointId", refs={String.class}, tree="[0]")
    private Output<String> interfaceEndpointId;

    /**
     * @return Unique identifier of the interface endpoint.
     * 
     */
    public Output<String> interfaceEndpointId() {
        return this.interfaceEndpointId;
    }
    /**
     * Name of the connection for this private endpoint that Atlas generates.
     * 
     */
    @Export(name="privateEndpointConnectionName", refs={String.class}, tree="[0]")
    private Output<String> privateEndpointConnectionName;

    /**
     * @return Name of the connection for this private endpoint that Atlas generates.
     * 
     */
    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }
    /**
     * Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     * 
     */
    @Export(name="privateEndpointIpAddress", refs={String.class}, tree="[0]")
    private Output<String> privateEndpointIpAddress;

    /**
     * @return Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     * 
     */
    public Output<String> privateEndpointIpAddress() {
        return this.privateEndpointIpAddress;
    }
    /**
     * Unique identifier of the private endpoint.
     * 
     */
    @Export(name="privateEndpointResourceId", refs={String.class}, tree="[0]")
    private Output<String> privateEndpointResourceId;

    /**
     * @return Unique identifier of the private endpoint.
     * 
     */
    public Output<String> privateEndpointResourceId() {
        return this.privateEndpointResourceId;
    }
    /**
     * Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     * 
     */
    @Export(name="privateLinkId", refs={String.class}, tree="[0]")
    private Output<String> privateLinkId;

    /**
     * @return Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     * 
     */
    public Output<String> privateLinkId() {
        return this.privateLinkId;
    }
    /**
     * Unique identifier for the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique identifier for the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkEndpointService(String name) {
        this(name, PrivateLinkEndpointServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkEndpointService(String name, PrivateLinkEndpointServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkEndpointService(String name, PrivateLinkEndpointServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkEndpointService(String name, Output<String> id, @Nullable PrivateLinkEndpointServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService", name, state, makeResourceOptions(options, id));
    }

    private static PrivateLinkEndpointServiceArgs makeArgs(PrivateLinkEndpointServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PrivateLinkEndpointServiceArgs.Empty : args;
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
    public static PrivateLinkEndpointService get(String name, Output<String> id, @Nullable PrivateLinkEndpointServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkEndpointService(name, id, state, options);
    }
}
