// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivatelinkEndpointServiceDataFederationOnlineArchiveState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive` provides a Private Endpoint Service resource for Data Federation and Online Archive. The resource allows you to create and manage a private endpoint for Federated Database Instances and Online Archives to the specified project.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Project;
 * import com.pulumi.mongodbatlas.ProjectArgs;
 * import com.pulumi.mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive;
 * import com.pulumi.mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs;
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
 *         var atlas_project = new Project(&#34;atlas-project&#34;, ProjectArgs.builder()        
 *             .orgId(var_.atlas_org_id())
 *             .build());
 * 
 *         var test = new PrivatelinkEndpointServiceDataFederationOnlineArchive(&#34;test&#34;, PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs.builder()        
 *             .projectId(atlas_project.id())
 *             .endpointId(&#34;&lt;PRIVATE-ENDPOINT-SERVICE-ID&gt;&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .comment(&#34;Test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private Endpoint Service resource for Data Federation and Online Archive can be imported using project ID, endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive example 1112222b3bf99403840e8934--vpce-3bf78b0ddee411ba1
 * ```
 *  See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive")
public class PrivatelinkEndpointServiceDataFederationOnlineArchive extends com.pulumi.resources.CustomResource {
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
     * Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     * 
     */
    @Export(name="endpointId", refs={String.class}, tree="[0]")
    private Output<String> endpointId;

    /**
     * @return Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Human-readable label that identifies the cloud service provider.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return Human-readable label that identifies the cloud service provider.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * Human-readable label that identifies the resource type associated with this private endpoint.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Human-readable label that identifies the resource type associated with this private endpoint.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivatelinkEndpointServiceDataFederationOnlineArchive(String name) {
        this(name, PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivatelinkEndpointServiceDataFederationOnlineArchive(String name, PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivatelinkEndpointServiceDataFederationOnlineArchive(String name, PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive", name, args == null ? PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivatelinkEndpointServiceDataFederationOnlineArchive(String name, Output<String> id, @Nullable PrivatelinkEndpointServiceDataFederationOnlineArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive", name, state, makeResourceOptions(options, id));
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
    public static PrivatelinkEndpointServiceDataFederationOnlineArchive get(String name, Output<String> id, @Nullable PrivatelinkEndpointServiceDataFederationOnlineArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivatelinkEndpointServiceDataFederationOnlineArchive(name, id, state, options);
    }
}
