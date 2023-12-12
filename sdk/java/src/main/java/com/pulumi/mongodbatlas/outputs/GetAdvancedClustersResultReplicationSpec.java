// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpecRegionConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersResultReplicationSpec {
    /**
     * @return A key-value map of the Network Peering Container ID(s) for the configuration specified in `region_configs`. The Container ID is the id of the container either created programmatically by the user before any clusters existed in a project or when the first cluster in the region (AWS/Azure) or project (GCP) was created.  The syntax is `&#34;providerName:regionName&#34; = &#34;containerId&#34;`. Example `AWS:US_EAST_1&#34; = &#34;61e0797dde08fb498ca11a71`.
     * 
     */
    private Map<String,String> containerId;
    private String id;
    /**
     * @return Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED.
     * 
     */
    private Integer numShards;
    /**
     * @return Configuration for the hardware specifications for nodes set for a given regionEach `region_configs` object describes the region&#39;s priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below
     * 
     */
    private List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs;
    /**
     * @return Name for the zone in a Global Cluster.
     * 
     */
    private String zoneName;

    private GetAdvancedClustersResultReplicationSpec() {}
    /**
     * @return A key-value map of the Network Peering Container ID(s) for the configuration specified in `region_configs`. The Container ID is the id of the container either created programmatically by the user before any clusters existed in a project or when the first cluster in the region (AWS/Azure) or project (GCP) was created.  The syntax is `&#34;providerName:regionName&#34; = &#34;containerId&#34;`. Example `AWS:US_EAST_1&#34; = &#34;61e0797dde08fb498ca11a71`.
     * 
     */
    public Map<String,String> containerId() {
        return this.containerId;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED.
     * 
     */
    public Integer numShards() {
        return this.numShards;
    }
    /**
     * @return Configuration for the hardware specifications for nodes set for a given regionEach `region_configs` object describes the region&#39;s priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below
     * 
     */
    public List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs() {
        return this.regionConfigs;
    }
    /**
     * @return Name for the zone in a Global Cluster.
     * 
     */
    public String zoneName() {
        return this.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultReplicationSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> containerId;
        private String id;
        private Integer numShards;
        private List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs;
        private String zoneName;
        public Builder() {}
        public Builder(GetAdvancedClustersResultReplicationSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerId = defaults.containerId;
    	      this.id = defaults.id;
    	      this.numShards = defaults.numShards;
    	      this.regionConfigs = defaults.regionConfigs;
    	      this.zoneName = defaults.zoneName;
        }

        @CustomType.Setter
        public Builder containerId(Map<String,String> containerId) {
            this.containerId = Objects.requireNonNull(containerId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder numShards(Integer numShards) {
            this.numShards = Objects.requireNonNull(numShards);
            return this;
        }
        @CustomType.Setter
        public Builder regionConfigs(List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs) {
            this.regionConfigs = Objects.requireNonNull(regionConfigs);
            return this;
        }
        public Builder regionConfigs(GetAdvancedClustersResultReplicationSpecRegionConfig... regionConfigs) {
            return regionConfigs(List.of(regionConfigs));
        }
        @CustomType.Setter
        public Builder zoneName(String zoneName) {
            this.zoneName = Objects.requireNonNull(zoneName);
            return this;
        }
        public GetAdvancedClustersResultReplicationSpec build() {
            final var _resultValue = new GetAdvancedClustersResultReplicationSpec();
            _resultValue.containerId = containerId;
            _resultValue.id = id;
            _resultValue.numShards = numShards;
            _resultValue.regionConfigs = regionConfigs;
            _resultValue.zoneName = zoneName;
            return _resultValue;
        }
    }
}
