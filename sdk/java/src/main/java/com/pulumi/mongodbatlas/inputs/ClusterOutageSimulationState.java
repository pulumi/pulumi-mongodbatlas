// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ClusterOutageSimulationOutageFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterOutageSimulationState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOutageSimulationState Empty = new ClusterOutageSimulationState();

    /**
     * Name of the Atlas Cluster that is/will undergoing outage simulation.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Name of the Atlas Cluster that is/will undergoing outage simulation.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * List of settings that specify the type of cluster outage simulation.
     * 
     */
    @Import(name="outageFilters")
    private @Nullable Output<List<ClusterOutageSimulationOutageFilterArgs>> outageFilters;

    /**
     * @return List of settings that specify the type of cluster outage simulation.
     * 
     */
    public Optional<Output<List<ClusterOutageSimulationOutageFilterArgs>>> outageFilters() {
        return Optional.ofNullable(this.outageFilters);
    }

    /**
     * The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Unique 24-hexadecimal character string that identifies the outage simulation.
     * 
     */
    @Import(name="simulationId")
    private @Nullable Output<String> simulationId;

    /**
     * @return Unique 24-hexadecimal character string that identifies the outage simulation.
     * 
     */
    public Optional<Output<String>> simulationId() {
        return Optional.ofNullable(this.simulationId);
    }

    /**
     * Date and time when MongoDB Cloud started the regional outage simulation.
     * 
     */
    @Import(name="startRequestDate")
    private @Nullable Output<String> startRequestDate;

    /**
     * @return Date and time when MongoDB Cloud started the regional outage simulation.
     * 
     */
    public Optional<Output<String>> startRequestDate() {
        return Optional.ofNullable(this.startRequestDate);
    }

    /**
     * Current phase of the outage simulation:
     * * `START_REQUESTED` - User has requested cluster outage simulation.
     * * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
     * * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
     * * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
     * * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
     * * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Current phase of the outage simulation:
     * * `START_REQUESTED` - User has requested cluster outage simulation.
     * * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
     * * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
     * * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
     * * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
     * * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private ClusterOutageSimulationState() {}

    private ClusterOutageSimulationState(ClusterOutageSimulationState $) {
        this.clusterName = $.clusterName;
        this.outageFilters = $.outageFilters;
        this.projectId = $.projectId;
        this.simulationId = $.simulationId;
        this.startRequestDate = $.startRequestDate;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOutageSimulationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOutageSimulationState $;

        public Builder() {
            $ = new ClusterOutageSimulationState();
        }

        public Builder(ClusterOutageSimulationState defaults) {
            $ = new ClusterOutageSimulationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Atlas Cluster that is/will undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the Atlas Cluster that is/will undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param outageFilters List of settings that specify the type of cluster outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder outageFilters(@Nullable Output<List<ClusterOutageSimulationOutageFilterArgs>> outageFilters) {
            $.outageFilters = outageFilters;
            return this;
        }

        /**
         * @param outageFilters List of settings that specify the type of cluster outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder outageFilters(List<ClusterOutageSimulationOutageFilterArgs> outageFilters) {
            return outageFilters(Output.of(outageFilters));
        }

        /**
         * @param outageFilters List of settings that specify the type of cluster outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder outageFilters(ClusterOutageSimulationOutageFilterArgs... outageFilters) {
            return outageFilters(List.of(outageFilters));
        }

        /**
         * @param projectId The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param simulationId Unique 24-hexadecimal character string that identifies the outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder simulationId(@Nullable Output<String> simulationId) {
            $.simulationId = simulationId;
            return this;
        }

        /**
         * @param simulationId Unique 24-hexadecimal character string that identifies the outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder simulationId(String simulationId) {
            return simulationId(Output.of(simulationId));
        }

        /**
         * @param startRequestDate Date and time when MongoDB Cloud started the regional outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder startRequestDate(@Nullable Output<String> startRequestDate) {
            $.startRequestDate = startRequestDate;
            return this;
        }

        /**
         * @param startRequestDate Date and time when MongoDB Cloud started the regional outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder startRequestDate(String startRequestDate) {
            return startRequestDate(Output.of(startRequestDate));
        }

        /**
         * @param state Current phase of the outage simulation:
         * * `START_REQUESTED` - User has requested cluster outage simulation.
         * * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
         * * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
         * * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
         * * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
         * * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Current phase of the outage simulation:
         * * `START_REQUESTED` - User has requested cluster outage simulation.
         * * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
         * * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
         * * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
         * * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
         * * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public ClusterOutageSimulationState build() {
            return $;
        }
    }

}