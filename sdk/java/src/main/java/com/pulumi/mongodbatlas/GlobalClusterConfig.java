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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.GlobalClusterConfig
 * 
 * `mongodbatlas.GlobalClusterConfig` provides a Global Cluster Configuration resource.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * &gt; **NOTE:** This resource can only be used with Atlas-managed clusters. See doc for `global_cluster_self_managed_sharding` attribute in `mongodbatlas.AdvancedCluster` resource for more info.
 * 
 * &gt; **IMPORTANT:** You can update a Global Cluster Configuration to add new custom zone mappings and managed namespaces. However, once configured, you can&#39;t modify or partially delete custom zone mappings (you must remove them all at once). You can add or remove, but can&#39;t modify, managed namespaces. Any update that changes an existing managed namespace results in an error. [Read more about Global Cluster Configuration](https://www.mongodb.com/docs/atlas/global-clusters/). For more details, see [Global Clusters API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Global-Clusters)
 * 
 * ## Examples Usage
 * 
 * ### Example Global cluster
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.AdvancedCluster;
 * import com.pulumi.mongodbatlas.AdvancedClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecArgs;
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
 *         var test = new AdvancedCluster("test", AdvancedClusterArgs.builder()
 *             .projectId("<YOUR-PROJECT-ID>")
 *             .name("<CLUSTER-NAME>")
 *             .clusterType("GEOSHARDED")
 *             .backupEnabled(true)
 *             .replicationSpecs(            
 *                 AdvancedClusterReplicationSpecArgs.builder()
 *                     .zoneName("Zone 1")
 *                     .regionConfigs(AdvancedClusterReplicationSpecRegionConfigArgs.builder()
 *                         .electableSpecs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs.builder()
 *                             .instanceSize("M30")
 *                             .nodeCount(3)
 *                             .build())
 *                         .providerName("AWS")
 *                         .priority(7)
 *                         .regionName("EU_CENTRAL_1")
 *                         .build())
 *                     .build(),
 *                 AdvancedClusterReplicationSpecArgs.builder()
 *                     .zoneName("Zone 2")
 *                     .regionConfigs(AdvancedClusterReplicationSpecRegionConfigArgs.builder()
 *                         .electableSpecs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs.builder()
 *                             .instanceSize("M30")
 *                             .nodeCount(3)
 *                             .build())
 *                         .providerName("AWS")
 *                         .priority(7)
 *                         .regionName("US_EAST_2")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var config = new GlobalClusterConfig("config", GlobalClusterConfigArgs.builder()
 *             .projectId(test.projectId())
 *             .clusterName(test.name())
 *             .managedNamespaces(GlobalClusterConfigManagedNamespaceArgs.builder()
 *                 .db("mydata")
 *                 .collection("publishers")
 *                 .customShardKey("city")
 *                 .isCustomShardKeyHashed(false)
 *                 .isShardKeyUnique(false)
 *                 .build())
 *             .customZoneMappings(GlobalClusterConfigCustomZoneMappingArgs.builder()
 *                 .location("CA")
 *                 .zone("Zone 1")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)
 * 
 */
@ResourceType(type="mongodbatlas:index/globalClusterConfig:GlobalClusterConfig")
public class GlobalClusterConfig extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Global Cluster.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return The name of the Global Cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id. */
    @Export(name="customZoneMapping", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> customZoneMapping;

    /**
     * @return (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead.
     * 
     */
    public Output<Map<String,String>> customZoneMapping() {
        return this.customZoneMapping;
    }
    /**
     * A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     * 
     */
    @Export(name="customZoneMappingZoneId", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> customZoneMappingZoneId;

    /**
     * @return A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     * 
     */
    public Output<Map<String,String>> customZoneMappingZoneId() {
        return this.customZoneMappingZoneId;
    }
    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     * 
     */
    @Export(name="customZoneMappings", refs={List.class,GlobalClusterConfigCustomZoneMapping.class}, tree="[0,1]")
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
    @Export(name="managedNamespaces", refs={List.class,GlobalClusterConfigManagedNamespace.class}, tree="[0,1]")
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
    @Export(name="projectId", refs={String.class}, tree="[0]")
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
    public GlobalClusterConfig(java.lang.String name) {
        this(name, GlobalClusterConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalClusterConfig(java.lang.String name, GlobalClusterConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalClusterConfig(java.lang.String name, GlobalClusterConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GlobalClusterConfig(java.lang.String name, Output<java.lang.String> id, @Nullable GlobalClusterConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static GlobalClusterConfigArgs makeArgs(GlobalClusterConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GlobalClusterConfigArgs.Empty : args;
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
    public static GlobalClusterConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable GlobalClusterConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalClusterConfig(name, id, state, options);
    }
}
