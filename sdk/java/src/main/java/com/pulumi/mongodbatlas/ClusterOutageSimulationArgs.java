// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.ClusterOutageSimulationOutageFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterOutageSimulationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOutageSimulationArgs Empty = new ClusterOutageSimulationArgs();

    /**
     * Name of the Atlas Cluster that is/will undergoing outage simulation.
     * 
     */
    @Import(name="clusterName", required=true)
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
    @Import(name="outageFilters", required=true)
    private Output<List<ClusterOutageSimulationOutageFilterArgs>> outageFilters;

    /**
     * @return List of settings that specify the type of cluster outage simulation.
     * 
     */
    public Output<List<ClusterOutageSimulationOutageFilterArgs>> outageFilters() {
        return this.outageFilters;
    }

    /**
     * The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private ClusterOutageSimulationArgs() {}

    private ClusterOutageSimulationArgs(ClusterOutageSimulationArgs $) {
        this.clusterName = $.clusterName;
        this.outageFilters = $.outageFilters;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOutageSimulationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOutageSimulationArgs $;

        public Builder() {
            $ = new ClusterOutageSimulationArgs();
        }

        public Builder(ClusterOutageSimulationArgs defaults) {
            $ = new ClusterOutageSimulationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Atlas Cluster that is/will undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
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
        public Builder outageFilters(Output<List<ClusterOutageSimulationOutageFilterArgs>> outageFilters) {
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
        public Builder projectId(Output<String> projectId) {
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

        public ClusterOutageSimulationArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("ClusterOutageSimulationArgs", "clusterName");
            }
            if ($.outageFilters == null) {
                throw new MissingRequiredPropertyException("ClusterOutageSimulationArgs", "outageFilters");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ClusterOutageSimulationArgs", "projectId");
            }
            return $;
        }
    }

}
