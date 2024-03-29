// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivatelinkEndpointServiceServerlessArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivatelinkEndpointServiceServerlessState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `privatelink_endpoint_service_serverless` Provides a Serverless PrivateLink Endpoint Service resource.
 * This is the second of two resources required to configure PrivateLink for Serverless, the first is mongodbatlas_privatelink_endpoint_serverless.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * **NOTE:** Create waits for all serverless instances on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation of this resource. Default timeout is 2hrs.
 * 
 * ## Example with AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ServerlessInstance;
 * import com.pulumi.mongodbatlas.ServerlessInstanceArgs;
 * import com.pulumi.mongodbatlas.PrivatelinkEndpointServerless;
 * import com.pulumi.mongodbatlas.PrivatelinkEndpointServerlessArgs;
 * import com.pulumi.aws.ec2.VpcEndpoint;
 * import com.pulumi.aws.ec2.VpcEndpointArgs;
 * import com.pulumi.mongodbatlas.PrivatelinkEndpointServiceServerless;
 * import com.pulumi.mongodbatlas.PrivatelinkEndpointServiceServerlessArgs;
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
 *         var testServerlessInstance = new ServerlessInstance(&#34;testServerlessInstance&#34;, ServerlessInstanceArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT_ID&gt;&#34;)
 *             .providerSettingsBackingProviderName(&#34;AWS&#34;)
 *             .providerSettingsProviderName(&#34;SERVERLESS&#34;)
 *             .providerSettingsRegionName(&#34;US_EAST_1&#34;)
 *             .continuousBackupEnabled(true)
 *             .build());
 * 
 *         var testPrivatelinkEndpointServerless = new PrivatelinkEndpointServerless(&#34;testPrivatelinkEndpointServerless&#34;, PrivatelinkEndpointServerlessArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT_ID&gt;&#34;)
 *             .instanceName(testServerlessInstance.name())
 *             .providerName(&#34;AWS&#34;)
 *             .build());
 * 
 *         var ptfeService = new VpcEndpoint(&#34;ptfeService&#34;, VpcEndpointArgs.builder()        
 *             .vpcId(&#34;vpc-7fc0a543&#34;)
 *             .serviceName(testPrivatelinkEndpointServerless.endpointServiceName())
 *             .vpcEndpointType(&#34;Interface&#34;)
 *             .subnetIds(&#34;subnet-de0406d2&#34;)
 *             .securityGroupIds(&#34;sg-3f238186&#34;)
 *             .build());
 * 
 *         var testPrivatelinkEndpointServiceServerless = new PrivatelinkEndpointServiceServerless(&#34;testPrivatelinkEndpointServiceServerless&#34;, PrivatelinkEndpointServiceServerlessArgs.builder()        
 *             .projectId(&#34;&lt;PROJECT_ID&gt;&#34;)
 *             .instanceName(testServerlessInstance.name())
 *             .endpointId(testPrivatelinkEndpointServerless.endpointId())
 *             .cloudProviderEndpointId(ptfeService.id())
 *             .providerName(&#34;AWS&#34;)
 *             .comment(&#34;New serverless endpoint&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
 * ```
 * For more information see: [MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).
 * 
 */
@ResourceType(type="mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless")
public class PrivatelinkEndpointServiceServerless extends com.pulumi.resources.CustomResource {
    /**
     * Unique string that identifies the private endpoint&#39;s network interface.
     * 
     */
    @Export(name="cloudProviderEndpointId", refs={String.class}, tree="[0]")
    private Output<String> cloudProviderEndpointId;

    /**
     * @return Unique string that identifies the private endpoint&#39;s network interface.
     * 
     */
    public Output<String> cloudProviderEndpointId() {
        return this.cloudProviderEndpointId;
    }
    /**
     * Human-readable string to associate with this private endpoint.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Human-readable string to associate with this private endpoint.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    @Export(name="endpointId", refs={String.class}, tree="[0]")
    private Output<String> endpointId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * Human-readable label that identifies the serverless instance.
     * 
     */
    @Export(name="instanceName", refs={String.class}, tree="[0]")
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
     * 
     */
    @Export(name="privateEndpointIpAddress", refs={String.class}, tree="[0]")
    private Output<String> privateEndpointIpAddress;

    /**
     * @return IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
     * 
     */
    public Output<String> privateEndpointIpAddress() {
        return this.privateEndpointIpAddress;
    }
    /**
     * Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    @Export(name="privateLinkServiceResourceId", refs={String.class}, tree="[0]")
    private Output<String> privateLinkServiceResourceId;

    /**
     * @return Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    public Output<String> privateLinkServiceResourceId() {
        return this.privateLinkServiceResourceId;
    }
    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivatelinkEndpointServiceServerless(String name) {
        this(name, PrivatelinkEndpointServiceServerlessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivatelinkEndpointServiceServerless(String name, PrivatelinkEndpointServiceServerlessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivatelinkEndpointServiceServerless(String name, PrivatelinkEndpointServiceServerlessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless", name, args == null ? PrivatelinkEndpointServiceServerlessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivatelinkEndpointServiceServerless(String name, Output<String> id, @Nullable PrivatelinkEndpointServiceServerlessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless", name, state, makeResourceOptions(options, id));
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
    public static PrivatelinkEndpointServiceServerless get(String name, Output<String> id, @Nullable PrivatelinkEndpointServiceServerlessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivatelinkEndpointServiceServerless(name, id, state, options);
    }
}
