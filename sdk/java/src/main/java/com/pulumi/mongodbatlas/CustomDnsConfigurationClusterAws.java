// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CustomDnsConfigurationClusterAwsArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CustomDnsConfigurationClusterAwsState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.CustomDnsConfigurationClusterAws` provides a Custom DNS Configuration for Atlas Clusters on AWS resource. This represents a Custom DNS Configuration for Atlas Clusters on AWS that can be updated in an Atlas project.
 * 
 * &gt; **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
 *   * Organization Owner
 *   * Project Owner
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.CustomDnsConfigurationClusterAws;
 * import com.pulumi.mongodbatlas.CustomDnsConfigurationClusterAwsArgs;
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
 *         var test = new CustomDnsConfigurationClusterAws(&#34;test&#34;, CustomDnsConfigurationClusterAwsArgs.builder()        
 *             .enabled(true)
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Custom DNS Configuration for Atlas Clusters on AWS must be imported using Project ID, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws test 1112222b3bf99403840e8934
 * ```
 *  See detailed information for arguments and attributes: [MongoDB API Custom DNS Configuration for Atlas Clusters on AWS](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/AWS-Clusters-DNS/operation/getAWSCustomDNS).
 * 
 */
@ResourceType(type="mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws")
public class CustomDnsConfigurationClusterAws extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether the project&#39;s clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether the project&#39;s clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDnsConfigurationClusterAws(String name) {
        this(name, CustomDnsConfigurationClusterAwsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDnsConfigurationClusterAws(String name, CustomDnsConfigurationClusterAwsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDnsConfigurationClusterAws(String name, CustomDnsConfigurationClusterAwsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws", name, args == null ? CustomDnsConfigurationClusterAwsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDnsConfigurationClusterAws(String name, Output<String> id, @Nullable CustomDnsConfigurationClusterAwsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws", name, state, makeResourceOptions(options, id));
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
    public static CustomDnsConfigurationClusterAws get(String name, Output<String> id, @Nullable CustomDnsConfigurationClusterAwsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDnsConfigurationClusterAws(name, id, state, options);
    }
}
