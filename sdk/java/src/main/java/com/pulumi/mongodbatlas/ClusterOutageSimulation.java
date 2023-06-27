// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ClusterOutageSimulationArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ClusterOutageSimulationState;
import com.pulumi.mongodbatlas.outputs.ClusterOutageSimulationOutageFilter;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.ClusterOutageSimulation` provides a Cluster Outage Simulation resource. For more details see https://www.mongodb.com/docs/atlas/tutorial/test-resilience/simulate-regional-outage/
 * 
 * Test Outage on Minority of Electable Nodes - Select fewer than half of your electable nodes.
 * 
 * Test Outage on Majority of Electable Nodes - Select at least one more than half of your electable nodes and keep at least one electable node remaining.
 * 
 * **IMPORTANT:** Test Outage on Majority of Electable Nodes will leave the Atlas cluster without a majority quorum. There will be no primary so write operations will not succeed, and reads will succeed only when configured with a suitable [readPreference](https://www.mongodb.com/docs/manual/core/read-preference/). To recover the majority quorum, you will have the option to manually reconfigure your cluster by adding new nodes to existing regions or adding new regions at the risk of losing recent writes, or end the simulation.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * &gt; **IMPORTANT:** This resource cannot be updated.
 * **IMPORTANT:** An existing Cluster Outage Simulation cannot be imported as this resource does not support import operation.
 * 
 * ## Example Usage
 * ### S
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ClusterOutageSimulation;
 * import com.pulumi.mongodbatlas.ClusterOutageSimulationArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterOutageSimulationOutageFilterArgs;
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
 *         var outageSimulation = new ClusterOutageSimulation(&#34;outageSimulation&#34;, ClusterOutageSimulationArgs.builder()        
 *             .clusterName(&#34;Cluster0&#34;)
 *             .outageFilters(            
 *                 ClusterOutageSimulationOutageFilterArgs.builder()
 *                     .cloudProvider(&#34;AWS&#34;)
 *                     .regionName(&#34;US_EAST_1&#34;)
 *                     .build(),
 *                 ClusterOutageSimulationOutageFilterArgs.builder()
 *                     .cloudProvider(&#34;AWS&#34;)
 *                     .regionName(&#34;US_EAST_2&#34;)
 *                     .build())
 *             .projectId(&#34;64707f06c519c20c3a2b1b03&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The `mongodbatlas_cluster_outage_simulation` resource does not support import operation. See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cluster-Outage-Simulation) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation")
public class ClusterOutageSimulation extends com.pulumi.resources.CustomResource {
    /**
     * Name of the Atlas Cluster that is/will undergoing outage simulation.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of the Atlas Cluster that is/will undergoing outage simulation.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * List of settings that specify the type of cluster outage simulation.
     * 
     */
    @Export(name="outageFilters", type=List.class, parameters={ClusterOutageSimulationOutageFilter.class})
    private Output<List<ClusterOutageSimulationOutageFilter>> outageFilters;

    /**
     * @return List of settings that specify the type of cluster outage simulation.
     * 
     */
    public Output<List<ClusterOutageSimulationOutageFilter>> outageFilters() {
        return this.outageFilters;
    }
    /**
     * The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Unique 24-hexadecimal character string that identifies the outage simulation.
     * 
     */
    @Export(name="simulationId", type=String.class, parameters={})
    private Output<String> simulationId;

    /**
     * @return Unique 24-hexadecimal character string that identifies the outage simulation.
     * 
     */
    public Output<String> simulationId() {
        return this.simulationId;
    }
    /**
     * Date and time when MongoDB Cloud started the regional outage simulation.
     * 
     */
    @Export(name="startRequestDate", type=String.class, parameters={})
    private Output<String> startRequestDate;

    /**
     * @return Date and time when MongoDB Cloud started the regional outage simulation.
     * 
     */
    public Output<String> startRequestDate() {
        return this.startRequestDate;
    }
    /**
     * Current phase of the outage simulation:
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current phase of the outage simulation:
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterOutageSimulation(String name) {
        this(name, ClusterOutageSimulationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterOutageSimulation(String name, ClusterOutageSimulationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterOutageSimulation(String name, ClusterOutageSimulationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation", name, args == null ? ClusterOutageSimulationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterOutageSimulation(String name, Output<String> id, @Nullable ClusterOutageSimulationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation", name, state, makeResourceOptions(options, id));
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
    public static ClusterOutageSimulation get(String name, Output<String> id, @Nullable ClusterOutageSimulationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterOutageSimulation(name, id, state, options);
    }
}
