// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterReplicationSpecRegionsConfig {
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

    private GetClusterReplicationSpecRegionsConfig() {}
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

    public static Builder builder(GetClusterReplicationSpecRegionsConfig defaults) {
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
        public Builder(GetClusterReplicationSpecRegionsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsNodes = defaults.analyticsNodes;
    	      this.electableNodes = defaults.electableNodes;
    	      this.priority = defaults.priority;
    	      this.readOnlyNodes = defaults.readOnlyNodes;
    	      this.regionName = defaults.regionName;
        }

        @CustomType.Setter
        public Builder analyticsNodes(Integer analyticsNodes) {
            if (analyticsNodes == null) {
              throw new MissingRequiredPropertyException("GetClusterReplicationSpecRegionsConfig", "analyticsNodes");
            }
            this.analyticsNodes = analyticsNodes;
            return this;
        }
        @CustomType.Setter
        public Builder electableNodes(Integer electableNodes) {
            if (electableNodes == null) {
              throw new MissingRequiredPropertyException("GetClusterReplicationSpecRegionsConfig", "electableNodes");
            }
            this.electableNodes = electableNodes;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetClusterReplicationSpecRegionsConfig", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder readOnlyNodes(Integer readOnlyNodes) {
            if (readOnlyNodes == null) {
              throw new MissingRequiredPropertyException("GetClusterReplicationSpecRegionsConfig", "readOnlyNodes");
            }
            this.readOnlyNodes = readOnlyNodes;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            if (regionName == null) {
              throw new MissingRequiredPropertyException("GetClusterReplicationSpecRegionsConfig", "regionName");
            }
            this.regionName = regionName;
            return this;
        }
        public GetClusterReplicationSpecRegionsConfig build() {
            final var _resultValue = new GetClusterReplicationSpecRegionsConfig();
            _resultValue.analyticsNodes = analyticsNodes;
            _resultValue.electableNodes = electableNodes;
            _resultValue.priority = priority;
            _resultValue.readOnlyNodes = readOnlyNodes;
            _resultValue.regionName = regionName;
            return _resultValue;
        }
    }
}
