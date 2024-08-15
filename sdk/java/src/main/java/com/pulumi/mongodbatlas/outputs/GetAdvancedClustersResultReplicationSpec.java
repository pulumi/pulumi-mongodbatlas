// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
    private String externalId;
    /**
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    private String id;
    /**
     * @return Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED. **(DEPRECATED.)** To learn more, see the Migration Guide for more details.
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    private Integer numShards;
    /**
     * @return Configuration for the hardware specifications for nodes set for a given regionEach `region_configs` object describes the region&#39;s priority in elections and the number and type of MongoDB nodes that Atlas deploys to the region. Each `region_configs` object must have either an `analytics_specs` object, `electable_specs` object, or `read_only_specs` object. See below
     * 
     */
    private List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the zone in a Global Cluster. If clusterType is GEOSHARDED, this value indicates the zone that the given shard belongs to and can be used to configure Global Cluster backup policies.
     * 
     */
    private String zoneId;
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
    public String externalId() {
        return this.externalId;
    }
    /**
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    public String id() {
        return this.id;
    }
    /**
     * @return Provide this value if you set a `cluster_type` of SHARDED or GEOSHARDED. **(DEPRECATED.)** To learn more, see the Migration Guide for more details.
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
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
     * @return Unique 24-hexadecimal digit string that identifies the zone in a Global Cluster. If clusterType is GEOSHARDED, this value indicates the zone that the given shard belongs to and can be used to configure Global Cluster backup policies.
     * 
     */
    public String zoneId() {
        return this.zoneId;
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
        private String externalId;
        private String id;
        private Integer numShards;
        private List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs;
        private String zoneId;
        private String zoneName;
        public Builder() {}
        public Builder(GetAdvancedClustersResultReplicationSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerId = defaults.containerId;
    	      this.externalId = defaults.externalId;
    	      this.id = defaults.id;
    	      this.numShards = defaults.numShards;
    	      this.regionConfigs = defaults.regionConfigs;
    	      this.zoneId = defaults.zoneId;
    	      this.zoneName = defaults.zoneName;
        }

        @CustomType.Setter
        public Builder containerId(Map<String,String> containerId) {
            if (containerId == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "containerId");
            }
            this.containerId = containerId;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(String externalId) {
            if (externalId == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "externalId");
            }
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder numShards(Integer numShards) {
            if (numShards == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "numShards");
            }
            this.numShards = numShards;
            return this;
        }
        @CustomType.Setter
        public Builder regionConfigs(List<GetAdvancedClustersResultReplicationSpecRegionConfig> regionConfigs) {
            if (regionConfigs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "regionConfigs");
            }
            this.regionConfigs = regionConfigs;
            return this;
        }
        public Builder regionConfigs(GetAdvancedClustersResultReplicationSpecRegionConfig... regionConfigs) {
            return regionConfigs(List.of(regionConfigs));
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneName(String zoneName) {
            if (zoneName == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpec", "zoneName");
            }
            this.zoneName = zoneName;
            return this;
        }
        public GetAdvancedClustersResultReplicationSpec build() {
            final var _resultValue = new GetAdvancedClustersResultReplicationSpec();
            _resultValue.containerId = containerId;
            _resultValue.externalId = externalId;
            _resultValue.id = id;
            _resultValue.numShards = numShards;
            _resultValue.regionConfigs = regionConfigs;
            _resultValue.zoneId = zoneId;
            _resultValue.zoneName = zoneName;
            return _resultValue;
        }
    }
}
