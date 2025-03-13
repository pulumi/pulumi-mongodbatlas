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


public final class GetAdvancedClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdvancedClusterPlainArgs Empty = new GetAdvancedClusterPlainArgs();

    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    @Import(name="pitEnabled")
    private @Nullable Boolean pitEnabled;

    /**
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    public Optional<Boolean> pitEnabled() {
        return Optional.ofNullable(this.pitEnabled);
    }

    /**
     * The unique ID for the project to create the cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to create the cluster.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling.
     * 
     */
    @Import(name="useReplicationSpecPerShard")
    private @Nullable Boolean useReplicationSpecPerShard;

    /**
     * @return Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling.
     * 
     */
    public Optional<Boolean> useReplicationSpecPerShard() {
        return Optional.ofNullable(this.useReplicationSpecPerShard);
    }

    private GetAdvancedClusterPlainArgs() {}

    private GetAdvancedClusterPlainArgs(GetAdvancedClusterPlainArgs $) {
        this.name = $.name;
        this.pitEnabled = $.pitEnabled;
        this.projectId = $.projectId;
        this.useReplicationSpecPerShard = $.useReplicationSpecPerShard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAdvancedClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdvancedClusterPlainArgs $;

        public Builder() {
            $ = new GetAdvancedClusterPlainArgs();
        }

        public Builder(GetAdvancedClusterPlainArgs defaults) {
            $ = new GetAdvancedClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param pitEnabled Flag that indicates if the cluster uses Continuous Cloud Backup.
         * 
         * @return builder
         * 
         */
        public Builder pitEnabled(@Nullable Boolean pitEnabled) {
            $.pitEnabled = pitEnabled;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create the cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param useReplicationSpecPerShard Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replication_specs` object. This enables representing clusters with independent shard scaling.
         * 
         * @return builder
         * 
         */
        public Builder useReplicationSpecPerShard(@Nullable Boolean useReplicationSpecPerShard) {
            $.useReplicationSpecPerShard = useReplicationSpecPerShard;
            return this;
        }

        public GetAdvancedClusterPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAdvancedClusterPlainArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetAdvancedClusterPlainArgs", "projectId");
            }
            return $;
        }
    }

}
