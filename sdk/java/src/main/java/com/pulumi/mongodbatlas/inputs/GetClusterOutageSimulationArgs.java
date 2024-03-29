// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterOutageSimulationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterOutageSimulationArgs Empty = new GetClusterOutageSimulationArgs();

    /**
     * Name of the Atlas Cluster that is undergoing outage simulation.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Name of the Atlas Cluster that is undergoing outage simulation.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The unique ID for the project that contains the cluster that is undergoing outage simulation.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project that contains the cluster that is undergoing outage simulation.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetClusterOutageSimulationArgs() {}

    private GetClusterOutageSimulationArgs(GetClusterOutageSimulationArgs $) {
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterOutageSimulationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterOutageSimulationArgs $;

        public Builder() {
            $ = new GetClusterOutageSimulationArgs();
        }

        public Builder(GetClusterOutageSimulationArgs defaults) {
            $ = new GetClusterOutageSimulationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Atlas Cluster that is undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the Atlas Cluster that is undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param projectId The unique ID for the project that contains the cluster that is undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project that contains the cluster that is undergoing outage simulation.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetClusterOutageSimulationArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetClusterOutageSimulationArgs", "clusterName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetClusterOutageSimulationArgs", "projectId");
            }
            return $;
        }
    }

}
