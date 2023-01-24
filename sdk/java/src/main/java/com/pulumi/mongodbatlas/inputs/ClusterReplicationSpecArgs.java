// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecRegionsConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterReplicationSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterReplicationSpecArgs Empty = new ClusterReplicationSpecArgs();

    /**
     * Unique identifer of the replication document for a zone in a Global Cluster.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
     * 
     */
    @Import(name="numShards", required=true)
    private Output<Integer> numShards;

    /**
     * @return Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
     * 
     */
    public Output<Integer> numShards() {
        return this.numShards;
    }

    /**
     * Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
     * 
     */
    @Import(name="regionsConfigs")
    private @Nullable Output<List<ClusterReplicationSpecRegionsConfigArgs>> regionsConfigs;

    /**
     * @return Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
     * 
     */
    public Optional<Output<List<ClusterReplicationSpecRegionsConfigArgs>>> regionsConfigs() {
        return Optional.ofNullable(this.regionsConfigs);
    }

    /**
     * Name for the zone in a Global Cluster.
     * 
     */
    @Import(name="zoneName")
    private @Nullable Output<String> zoneName;

    /**
     * @return Name for the zone in a Global Cluster.
     * 
     */
    public Optional<Output<String>> zoneName() {
        return Optional.ofNullable(this.zoneName);
    }

    private ClusterReplicationSpecArgs() {}

    private ClusterReplicationSpecArgs(ClusterReplicationSpecArgs $) {
        this.id = $.id;
        this.numShards = $.numShards;
        this.regionsConfigs = $.regionsConfigs;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterReplicationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterReplicationSpecArgs $;

        public Builder() {
            $ = new ClusterReplicationSpecArgs();
        }

        public Builder(ClusterReplicationSpecArgs defaults) {
            $ = new ClusterReplicationSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Unique identifer of the replication document for a zone in a Global Cluster.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifer of the replication document for a zone in a Global Cluster.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param numShards Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
         * 
         * @return builder
         * 
         */
        public Builder numShards(Output<Integer> numShards) {
            $.numShards = numShards;
            return this;
        }

        /**
         * @param numShards Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
         * 
         * @return builder
         * 
         */
        public Builder numShards(Integer numShards) {
            return numShards(Output.of(numShards));
        }

        /**
         * @param regionsConfigs Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
         * 
         * @return builder
         * 
         */
        public Builder regionsConfigs(@Nullable Output<List<ClusterReplicationSpecRegionsConfigArgs>> regionsConfigs) {
            $.regionsConfigs = regionsConfigs;
            return this;
        }

        /**
         * @param regionsConfigs Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
         * 
         * @return builder
         * 
         */
        public Builder regionsConfigs(List<ClusterReplicationSpecRegionsConfigArgs> regionsConfigs) {
            return regionsConfigs(Output.of(regionsConfigs));
        }

        /**
         * @param regionsConfigs Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
         * 
         * @return builder
         * 
         */
        public Builder regionsConfigs(ClusterReplicationSpecRegionsConfigArgs... regionsConfigs) {
            return regionsConfigs(List.of(regionsConfigs));
        }

        /**
         * @param zoneName Name for the zone in a Global Cluster.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(@Nullable Output<String> zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        /**
         * @param zoneName Name for the zone in a Global Cluster.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            return zoneName(Output.of(zoneName));
        }

        public ClusterReplicationSpecArgs build() {
            $.numShards = Objects.requireNonNull($.numShards, "expected parameter 'numShards' to be non-null");
            return $;
        }
    }

}
