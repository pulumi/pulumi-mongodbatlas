// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAdvancedClustersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdvancedClustersPlainArgs Empty = new GetAdvancedClustersPlainArgs();

    /**
     * The unique ID for the project to get the clusters.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to get the clusters.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling. **Note:** If not set to true, this data source return all clusters except clusters with asymmetric shards.
     * 
     */
    @Import(name="useReplicationSpecPerShard")
    private @Nullable Boolean useReplicationSpecPerShard;

    /**
     * @return Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling. **Note:** If not set to true, this data source return all clusters except clusters with asymmetric shards.
     * 
     */
    public Optional<Boolean> useReplicationSpecPerShard() {
        return Optional.ofNullable(this.useReplicationSpecPerShard);
    }

    private GetAdvancedClustersPlainArgs() {}

    private GetAdvancedClustersPlainArgs(GetAdvancedClustersPlainArgs $) {
        this.projectId = $.projectId;
        this.useReplicationSpecPerShard = $.useReplicationSpecPerShard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAdvancedClustersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdvancedClustersPlainArgs $;

        public Builder() {
            $ = new GetAdvancedClustersPlainArgs();
        }

        public Builder(GetAdvancedClustersPlainArgs defaults) {
            $ = new GetAdvancedClustersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The unique ID for the project to get the clusters.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param useReplicationSpecPerShard Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling. **Note:** If not set to true, this data source return all clusters except clusters with asymmetric shards.
         * 
         * @return builder
         * 
         */
        public Builder useReplicationSpecPerShard(@Nullable Boolean useReplicationSpecPerShard) {
            $.useReplicationSpecPerShard = useReplicationSpecPerShard;
            return this;
        }

        public GetAdvancedClustersPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetAdvancedClustersPlainArgs", "projectId");
            }
            return $;
        }
    }

}
