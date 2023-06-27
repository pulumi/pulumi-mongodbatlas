// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetClusterOutageSimulationOutageFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterOutageSimulationResult {
    private String clusterName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of settings that specify the type of cluster outage simulation.
     * 
     */
    private List<GetClusterOutageSimulationOutageFilter> outageFilters;
    private String projectId;
    /**
     * @return Unique 24-hexadecimal character string that identifies the outage simulation.
     * 
     */
    private String simulationId;
    /**
     * @return Date and time when MongoDB Cloud started the regional outage simulation.
     * 
     */
    private String startRequestDate;
    /**
     * @return Current phase of the outage simulation:
     * 
     */
    private String state;

    private GetClusterOutageSimulationResult() {}
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of settings that specify the type of cluster outage simulation.
     * 
     */
    public List<GetClusterOutageSimulationOutageFilter> outageFilters() {
        return this.outageFilters;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies the outage simulation.
     * 
     */
    public String simulationId() {
        return this.simulationId;
    }
    /**
     * @return Date and time when MongoDB Cloud started the regional outage simulation.
     * 
     */
    public String startRequestDate() {
        return this.startRequestDate;
    }
    /**
     * @return Current phase of the outage simulation:
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterOutageSimulationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterName;
        private String id;
        private List<GetClusterOutageSimulationOutageFilter> outageFilters;
        private String projectId;
        private String simulationId;
        private String startRequestDate;
        private String state;
        public Builder() {}
        public Builder(GetClusterOutageSimulationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
    	      this.outageFilters = defaults.outageFilters;
    	      this.projectId = defaults.projectId;
    	      this.simulationId = defaults.simulationId;
    	      this.startRequestDate = defaults.startRequestDate;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder outageFilters(List<GetClusterOutageSimulationOutageFilter> outageFilters) {
            this.outageFilters = Objects.requireNonNull(outageFilters);
            return this;
        }
        public Builder outageFilters(GetClusterOutageSimulationOutageFilter... outageFilters) {
            return outageFilters(List.of(outageFilters));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder simulationId(String simulationId) {
            this.simulationId = Objects.requireNonNull(simulationId);
            return this;
        }
        @CustomType.Setter
        public Builder startRequestDate(String startRequestDate) {
            this.startRequestDate = Objects.requireNonNull(startRequestDate);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetClusterOutageSimulationResult build() {
            final var o = new GetClusterOutageSimulationResult();
            o.clusterName = clusterName;
            o.id = id;
            o.outageFilters = outageFilters;
            o.projectId = projectId;
            o.simulationId = simulationId;
            o.startRequestDate = startRequestDate;
            o.state = state;
            return o;
        }
    }
}
