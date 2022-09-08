// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.GlobalClusterConfigArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigState;
import com.pulumi.mongodbatlas.outputs.GlobalClusterConfigCustomZoneMapping;
import com.pulumi.mongodbatlas.outputs.GlobalClusterConfigManagedNamespace;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.GlobalClusterConfig` provides a Global Cluster Configuration resource.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * ## Examples Usage
 * 
 * ### Example Global cluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.mongodbatlas.GlobalClusterConfig;
 * import com.pulumi.mongodbatlas.GlobalClusterConfigArgs;
 * import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigManagedNamespaceArgs;
 * import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigCustomZoneMappingArgs;
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
 *         var test = new Cluster(&#34;test&#34;, ClusterArgs.builder()        
 *             .projectId(&#34;&lt;YOUR-PROJECT-ID&gt;&#34;)
 *             .diskSizeGb(80)
 *             .cloudBackup(true)
 *             .clusterType(&#34;GEOSHARDED&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .providerInstanceSizeName(&#34;M30&#34;)
 *             .replicationSpecs(            
 *                 ClusterReplicationSpecArgs.builder()
 *                     .zoneName(&#34;Zone 1&#34;)
 *                     .numShards(1)
 *                     .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                         .regionName(&#34;EU_CENTRAL_1&#34;)
 *                         .electableNodes(3)
 *                         .priority(7)
 *                         .readOnlyNodes(0)
 *                         .build())
 *                     .build(),
 *                 ClusterReplicationSpecArgs.builder()
 *                     .zoneName(&#34;Zone 2&#34;)
 *                     .numShards(1)
 *                     .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                         .regionName(&#34;US_EAST_2&#34;)
 *                         .electableNodes(3)
 *                         .priority(7)
 *                         .readOnlyNodes(0)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var config = new GlobalClusterConfig(&#34;config&#34;, GlobalClusterConfigArgs.builder()        
 *             .projectId(test.projectId())
 *             .clusterName(test.name())
 *             .managedNamespaces(GlobalClusterConfigManagedNamespaceArgs.builder()
 *                 .db(&#34;mydata&#34;)
 *                 .collection(&#34;publishers&#34;)
 *                 .customShardKey(&#34;city&#34;)
 *                 .isCustomShardKeyHashed(false)
 *                 .isShardKeyUnique(false)
 *                 .build())
 *             .customZoneMappings(GlobalClusterConfigCustomZoneMappingArgs.builder()
 *                 .location(&#34;CA&#34;)
 *                 .zone(&#34;Zone 1&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### Example Global cluster config
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.mongodbatlas.GlobalClusterConfig;
 * import com.pulumi.mongodbatlas.GlobalClusterConfigArgs;
 * import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigManagedNamespaceArgs;
 * import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigCustomZoneMappingArgs;
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
 *         var cluster_test = new Cluster(&#34;cluster-test&#34;, ClusterArgs.builder()        
 *             .projectId(&#34;&lt;YOUR-PROJECT-ID&gt;&#34;)
 *             .clusterType(&#34;REPLICASET&#34;)
 *             .replicationSpecs(ClusterReplicationSpecArgs.builder()
 *                 .numShards(1)
 *                 .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                     .regionName(&#34;US_EAST_1&#34;)
 *                     .electableNodes(3)
 *                     .priority(7)
 *                     .readOnlyNodes(0)
 *                     .build())
 *                 .build())
 *             .backupEnabled(true)
 *             .autoScalingDiskGbEnabled(true)
 *             .mongoDbMajorVersion(&#34;4.0&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .diskSizeGb(100)
 *             .providerInstanceSizeName(&#34;M40&#34;)
 *             .build());
 * 
 *         var config = new GlobalClusterConfig(&#34;config&#34;, GlobalClusterConfigArgs.builder()        
 *             .projectId(mongodbatlas_cluster.test().project_id())
 *             .clusterName(mongodbatlas_cluster.test().name())
 *             .managedNamespaces(GlobalClusterConfigManagedNamespaceArgs.builder()
 *                 .db(&#34;mydata&#34;)
 *                 .collection(&#34;publishers&#34;)
 *                 .customShardKey(&#34;city&#34;)
 *                 .build())
 *             .customZoneMappings(GlobalClusterConfigCustomZoneMappingArgs.builder()
 *                 .location(&#34;CA&#34;)
 *                 .zone(&#34;Zone 1&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
 * ```
 * 
 *  See detailed information for arguments and attributes[MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)
 * 
 */
@ResourceType(type="mongodbatlas:index/globalClusterConfig:GlobalClusterConfig")
public class GlobalClusterConfig extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Global Cluster.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The name of the Global Cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     * 
     */
    @Export(name="customZoneMapping", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> customZoneMapping;

    /**
     * @return A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     * 
     */
    public Output<Map<String,Object>> customZoneMapping() {
        return this.customZoneMapping;
    }
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     * 
     */
    @Export(name="customZoneMappings", type=List.class, parameters={GlobalClusterConfigCustomZoneMapping.class})
    private Output</* @Nullable */ List<GlobalClusterConfigCustomZoneMapping>> customZoneMappings;

    /**
     * @return Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     * 
     */
    public Output<Optional<List<GlobalClusterConfigCustomZoneMapping>>> customZoneMappings() {
        return Codegen.optional(this.customZoneMappings);
    }
    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     * 
     */
    @Export(name="managedNamespaces", type=List.class, parameters={GlobalClusterConfigManagedNamespace.class})
    private Output<List<GlobalClusterConfigManagedNamespace>> managedNamespaces;

    /**
     * @return Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     * 
     */
    public Output<List<GlobalClusterConfigManagedNamespace>> managedNamespaces() {
        return this.managedNamespaces;
    }
    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalClusterConfig(String name) {
        this(name, GlobalClusterConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalClusterConfig(String name, GlobalClusterConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalClusterConfig(String name, GlobalClusterConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, args == null ? GlobalClusterConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalClusterConfig(String name, Output<String> id, @Nullable GlobalClusterConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, state, makeResourceOptions(options, id));
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
    public static GlobalClusterConfig get(String name, Output<String> id, @Nullable GlobalClusterConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalClusterConfig(name, id, state, options);
    }
}
