// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersResultReplicationSpecRegionsConfig {
    /**
     * @return Indicates the number of analytics nodes for Atlas to deploy to the region. Analytics nodes are useful for handling analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only, and can never become the primary.
     * 
     */
    private Integer analyticsNodes;
    /**
     * @return Number of electable nodes for Atlas to deploy to the region.
     * 
     */
    private Integer electableNodes;
    /**
     * @return Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * 
     */
    private Integer priority;
    /**
     * @return Number of read-only nodes for Atlas to deploy to the region. Read-only nodes can never become the primary, but can facilitate local-reads. Specify 0 if you do not want any read-only nodes in the region.
     * 
     */
    private Integer readOnlyNodes;
    /**
     * @return Name for the region specified.
     * 
     */
    private String regionName;

    private GetClustersResultReplicationSpecRegionsConfig() {}
    /**
     * @return Indicates the number of analytics nodes for Atlas to deploy to the region. Analytics nodes are useful for handling analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only, and can never become the primary.
     * 
     */
    public Integer analyticsNodes() {
        return this.analyticsNodes;
    }
    /**
     * @return Number of electable nodes for Atlas to deploy to the region.
     * 
     */
    public Integer electableNodes() {
        return this.electableNodes;
    }
    /**
     * @return Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Number of read-only nodes for Atlas to deploy to the region. Read-only nodes can never become the primary, but can facilitate local-reads. Specify 0 if you do not want any read-only nodes in the region.
     * 
     */
    public Integer readOnlyNodes() {
        return this.readOnlyNodes;
    }
    /**
     * @return Name for the region specified.
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResultReplicationSpecRegionsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer analyticsNodes;
        private Integer electableNodes;
        private Integer priority;
        private Integer readOnlyNodes;
        private String regionName;
        public Builder() {}
        public Builder(GetClustersResultReplicationSpecRegionsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsNodes = defaults.analyticsNodes;
    	      this.electableNodes = defaults.electableNodes;
    	      this.priority = defaults.priority;
    	      this.readOnlyNodes = defaults.readOnlyNodes;
    	      this.regionName = defaults.regionName;
        }

        @CustomType.Setter
        public Builder analyticsNodes(Integer analyticsNodes) {
            this.analyticsNodes = Objects.requireNonNull(analyticsNodes);
            return this;
        }
        @CustomType.Setter
        public Builder electableNodes(Integer electableNodes) {
            this.electableNodes = Objects.requireNonNull(electableNodes);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder readOnlyNodes(Integer readOnlyNodes) {
            this.readOnlyNodes = Objects.requireNonNull(readOnlyNodes);
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public GetClustersResultReplicationSpecRegionsConfig build() {
            final var o = new GetClustersResultReplicationSpecRegionsConfig();
            o.analyticsNodes = analyticsNodes;
            o.electableNodes = electableNodes;
            o.priority = priority;
            o.readOnlyNodes = readOnlyNodes;
            o.regionName = regionName;
            return o;
        }
    }
}
