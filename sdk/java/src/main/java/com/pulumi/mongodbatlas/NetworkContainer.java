// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.NetworkContainerArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.NetworkContainerState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.NetworkContainer` provides a Network Peering Container resource. The resource lets you create, edit and delete network peering containers. The resource requires your Project ID.  Each cloud provider requires slightly different attributes so read the argument reference carefully.
 * 
 *  Network peering container is a general term used to describe any cloud providers&#39; VPC/VNet concept.  Containers only need to be created if the peering connection to the cloud provider will be created before the first cluster that requires the container.  If the cluster has been/will be created first Atlas automatically creates the required container per the &#34;containers per cloud provider&#34; information that follows (in this case you can obtain the container id from the cluster resource attribute `container_id`).
 * 
 * The following is the maximum number of Network Peering containers per cloud provider:
 * &lt;br&gt; &amp;#8226;  GCP -  One container per project.
 * &lt;br&gt; &amp;#8226;  AWS and Azure - One container per cloud provider region.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 * 
 * ## Example Usage
 * ### Example with AWS
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
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
 *         var test = new NetworkContainer(&#34;test&#34;, NetworkContainerArgs.builder()        
 *             .atlasCidrBlock(&#34;10.8.0.0/21&#34;)
 *             .projectId(&#34;&lt;YOUR-PROJECT-ID&gt;&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .regionName(&#34;US_EAST_1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example with GCP
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
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
 *         var test = new NetworkContainer(&#34;test&#34;, NetworkContainerArgs.builder()        
 *             .atlasCidrBlock(&#34;10.8.0.0/21&#34;)
 *             .projectId(&#34;&lt;YOUR-PROJECT-ID&gt;&#34;)
 *             .providerName(&#34;GCP&#34;)
 *             .regions(            
 *                 &#34;US_EAST_4&#34;,
 *                 &#34;US_WEST_3&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example with Azure
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
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
 *         var test = new NetworkContainer(&#34;test&#34;, NetworkContainerArgs.builder()        
 *             .atlasCidrBlock(&#34;10.8.0.0/21&#34;)
 *             .projectId(&#34;&lt;YOUR-PROJECT-ID&gt;&#34;)
 *             .providerName(&#34;AZURE&#34;)
 *             .region(&#34;US_EAST_2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network Peering Containers can be imported using project ID and network peering container id, in the format `PROJECTID-CONTAINER-ID`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/networkContainer:NetworkContainer my_container 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a
 * ```
 *  See detailed information for arguments and attributes[MongoDB API Network Peering Container](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/)
 * 
 * -&gt; __NOTE:__ If you need to get an existing container ID see the How-To Guide.
 * 
 */
@ResourceType(type="mongodbatlas:index/networkContainer:NetworkContainer")
public class NetworkContainer extends com.pulumi.resources.CustomResource {
    /**
     * CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     *   
     *   **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     *   
     *   **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     * 
     */
    @Export(name="atlasCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> atlasCidrBlock;

    /**
     * @return CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     *   
     *   **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     *   
     *   **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     * 
     */
    public Output<String> atlasCidrBlock() {
        return this.atlasCidrBlock;
    }
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     * 
     */
    @Export(name="azureSubscriptionId", refs={String.class}, tree="[0]")
    private Output<String> azureSubscriptionId;

    /**
     * @return Unique identifier of the Azure subscription in which the VNet resides.
     * 
     */
    public Output<String> azureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * The Network Peering Container ID.
     * 
     */
    @Export(name="containerId", refs={String.class}, tree="[0]")
    private Output<String> containerId;

    /**
     * @return The Network Peering Container ID.
     * 
     */
    public Output<String> containerId() {
        return this.containerId;
    }
    /**
     * Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     * 
     */
    @Export(name="gcpProjectId", refs={String.class}, tree="[0]")
    private Output<String> gcpProjectId;

    /**
     * @return Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     * 
     */
    public Output<String> gcpProjectId() {
        return this.gcpProjectId;
    }
    /**
     * Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     * 
     */
    @Export(name="networkName", refs={String.class}, tree="[0]")
    private Output<String> networkName;

    /**
     * @return Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     * 
     */
    public Output<String> networkName() {
        return this.networkName;
    }
    /**
     * Unique identifier for the Atlas project for this Network Peering Container.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique identifier for the Atlas project for this Network Peering Container.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> providerName;

    /**
     * @return Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     * 
     */
    public Output<Optional<String>> providerName() {
        return Codegen.optional(this.providerName);
    }
    /**
     * Indicates whether the project has Network Peering connections deployed in the container.
     * 
     */
    @Export(name="provisioned", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> provisioned;

    /**
     * @return Indicates whether the project has Network Peering connections deployed in the container.
     * 
     */
    public Output<Boolean> provisioned() {
        return this.provisioned;
    }
    /**
     * Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    @Export(name="regionName", refs={String.class}, tree="[0]")
    private Output<String> regionName;

    /**
     * @return The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }
    /**
     * Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     * 
     */
    @Export(name="regions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> regions;

    /**
     * @return Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     * 
     */
    public Output<Optional<List<String>>> regions() {
        return Codegen.optional(this.regions);
    }
    /**
     * The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     * 
     */
    @Export(name="vnetName", refs={String.class}, tree="[0]")
    private Output<String> vnetName;

    /**
     * @return The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
     * 
     */
    public Output<String> vnetName() {
        return this.vnetName;
    }
    /**
     * Unique identifier of Atlas&#39; AWS VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return Unique identifier of Atlas&#39; AWS VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkContainer(String name) {
        this(name, NetworkContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkContainer(String name, NetworkContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkContainer(String name, NetworkContainerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/networkContainer:NetworkContainer", name, args == null ? NetworkContainerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkContainer(String name, Output<String> id, @Nullable NetworkContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/networkContainer:NetworkContainer", name, state, makeResourceOptions(options, id));
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
    public static NetworkContainer get(String name, Output<String> id, @Nullable NetworkContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkContainer(name, id, state, options);
    }
}
