// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivatelinkEndpointServerlessArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivatelinkEndpointServerlessState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * `privatelink_endpoint_serverless` Provides a Serverless PrivateLink Endpoint resource.
 * This is the first of two resources required to configure PrivateLink for Serverless, the second is mongodbatlas_privatelink_endpoint_service_serverless.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * ## Example Usage
 * ### AWS Example
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
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
 * ```
 * 
 *  For more information see[MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).
 * 
 */
@ResourceType(type="mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless")
public class PrivatelinkEndpointServerless extends com.pulumi.resources.CustomResource {
    /**
     * Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    @Export(name="endpointId", type=String.class, parameters={})
    private Output<String> endpointId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * Unique string that identifies the PrivateLink endpoint service.
     * 
     */
    @Export(name="endpointServiceName", type=String.class, parameters={})
    private Output<String> endpointServiceName;

    /**
     * @return Unique string that identifies the PrivateLink endpoint service.
     * 
     */
    public Output<String> endpointServiceName() {
        return this.endpointServiceName;
    }
    /**
     * Human-readable label that identifies the serverless instance.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    @Export(name="privateLinkServiceResourceId", type=String.class, parameters={})
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
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Cloud provider name; AWS is currently supported
     * 
     */
    @Export(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    /**
     * @return Cloud provider name; AWS is currently supported
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
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
    public PrivatelinkEndpointServerless(String name) {
        this(name, PrivatelinkEndpointServerlessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivatelinkEndpointServerless(String name, PrivatelinkEndpointServerlessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivatelinkEndpointServerless(String name, PrivatelinkEndpointServerlessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless", name, args == null ? PrivatelinkEndpointServerlessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivatelinkEndpointServerless(String name, Output<String> id, @Nullable PrivatelinkEndpointServerlessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless", name, state, makeResourceOptions(options, id));
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
    public static PrivatelinkEndpointServerless get(String name, Output<String> id, @Nullable PrivatelinkEndpointServerlessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivatelinkEndpointServerless(name, id, state, options);
    }
}
