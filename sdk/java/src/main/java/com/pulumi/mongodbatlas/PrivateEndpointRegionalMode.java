// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.PrivateEndpointRegionalModeArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.PrivateEndpointRegionalModeState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## # Resource: private_endpoint_regional_mode
 * 
 * `mongodbatlas.PrivateEndpointRegionalMode` provides a Private Endpoint Regional Mode resource. This represents a regionalized private endpoint setting for a Project. Enable it to allow region specific private endpoints.
 * 
 * &gt; **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * &gt; **WARNING:**Your [connection strings](https://www.mongodb.com/docs/atlas/reference/faq/connection-changes/#std-label-connstring-privatelink) to existing multi-region and global sharded clusters change when you enable this setting.  You must update your applications to use the new connection strings. This might cause downtime.
 * 
 * ## Import
 * 
 * Private Endpoint Regional Mode can be imported using project id in format `{project_id}`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode test 1112222b3bf99403840e8934
 * ```
 * See detailed information for arguments and attributes: __Private Endpoints__ [Get Regional Mode](https://www.mongodb.com/docs/atlas/reference/api/private-endpoints-get-regional-mode/) | [Update Regional Mode](https://www.mongodb.com/docs/atlas/reference/api/private-endpoints-update-regional-mode/)
 * 
 */
@ResourceType(type="mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode")
public class PrivateEndpointRegionalMode extends com.pulumi.resources.CustomResource {
    /**
     * Flag that indicates whether the regionalized private endpoint setting is enabled for the project.   Set this value to true to create more than one private endpoint in a cloud provider region to connect to multi-region and global Atlas sharded clusters. You can enable this setting only if your Atlas project contains no replica sets. You can&#39;t disable this setting if you have:
     * * More than one private endpoint in more than one region, or
     * * More than one private endpoint in one region and one private endpoint in one or more regions.
     *   You can create only sharded clusters when you enable the regionalized private endpoint setting. You can&#39;t create replica sets.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Flag that indicates whether the regionalized private endpoint setting is enabled for the project.   Set this value to true to create more than one private endpoint in a cloud provider region to connect to multi-region and global Atlas sharded clusters. You can enable this setting only if your Atlas project contains no replica sets. You can&#39;t disable this setting if you have:
     * * More than one private endpoint in more than one region, or
     * * More than one private endpoint in one region and one private endpoint in one or more regions.
     *   You can create only sharded clusters when you enable the regionalized private endpoint setting. You can&#39;t create replica sets.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointRegionalMode(String name) {
        this(name, PrivateEndpointRegionalModeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointRegionalMode(String name, PrivateEndpointRegionalModeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointRegionalMode(String name, PrivateEndpointRegionalModeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointRegionalMode(String name, Output<String> id, @Nullable PrivateEndpointRegionalModeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode", name, state, makeResourceOptions(options, id));
    }

    private static PrivateEndpointRegionalModeArgs makeArgs(PrivateEndpointRegionalModeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PrivateEndpointRegionalModeArgs.Empty : args;
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
    public static PrivateEndpointRegionalMode get(String name, Output<String> id, @Nullable PrivateEndpointRegionalModeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointRegionalMode(name, id, state, options);
    }
}
