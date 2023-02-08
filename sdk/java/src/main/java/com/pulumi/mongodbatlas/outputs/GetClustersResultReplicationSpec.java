// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetClustersResultReplicationSpecRegionsConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersResultReplicationSpec {
    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster.
     * 
     */
    private String id;
    /**
     * @return Number of shards to deploy in the specified zone.
     * 
     */
    private Integer numShards;
    /**
     * @return Describes the physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
     * 
     */
    private List<GetClustersResultReplicationSpecRegionsConfig> regionsConfigs;
    /**
     * @return Indicates the n ame for the zone in a Global Cluster.
     * 
     */
    private String zoneName;

    private GetClustersResultReplicationSpec() {}
    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Number of shards to deploy in the specified zone.
     * 
     */
    public Integer numShards() {
        return this.numShards;
    }
    /**
     * @return Describes the physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
     * 
     */
    public List<GetClustersResultReplicationSpecRegionsConfig> regionsConfigs() {
        return this.regionsConfigs;
    }
    /**
     * @return Indicates the n ame for the zone in a Global Cluster.
     * 
     */
    public String zoneName() {
        return this.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResultReplicationSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Integer numShards;
        private List<GetClustersResultReplicationSpecRegionsConfig> regionsConfigs;
        private String zoneName;
        public Builder() {}
        public Builder(GetClustersResultReplicationSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.numShards = defaults.numShards;
    	      this.regionsConfigs = defaults.regionsConfigs;
    	      this.zoneName = defaults.zoneName;
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
        public Builder regionsConfigs(List<GetClustersResultReplicationSpecRegionsConfig> regionsConfigs) {
            this.regionsConfigs = Objects.requireNonNull(regionsConfigs);
            return this;
        }
        public Builder regionsConfigs(GetClustersResultReplicationSpecRegionsConfig... regionsConfigs) {
            return regionsConfigs(List.of(regionsConfigs));
        }
        @CustomType.Setter
        public Builder zoneName(String zoneName) {
            this.zoneName = Objects.requireNonNull(zoneName);
            return this;
        }
        public GetClustersResultReplicationSpec build() {
            final var o = new GetClustersResultReplicationSpec();
            o.id = id;
            o.numShards = numShards;
            o.regionsConfigs = regionsConfigs;
            o.zoneName = zoneName;
            return o;
        }
    }
}