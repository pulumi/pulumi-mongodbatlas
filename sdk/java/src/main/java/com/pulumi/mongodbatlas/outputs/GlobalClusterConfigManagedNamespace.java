// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalClusterConfigManagedNamespace {
    /**
     * @return The name of the collection associated with the managed namespace.
     * 
     */
    private String collection;
    /**
     * @return The custom shard key for the collection. Global Clusters require a compound shard key consisting of a location field and a user-selected second key, the custom shard key.
     * 
     */
    private String customShardKey;
    /**
     * @return The name of the database containing the collection.
     * 
     */
    private String db;
    /**
     * @return Specifies whether the custom shard key for the collection is [hashed](https://docs.mongodb.com/manual/reference/method/sh.shardCollection/#hashed-shard-keys). If omitted, defaults to `false`. If `false`, Atlas uses [ranged sharding](https://docs.mongodb.com/manual/core/ranged-sharding/). This is only available for Atlas clusters with MongoDB v4.4 and later.
     * 
     */
    private @Nullable Boolean isCustomShardKeyHashed;
    /**
     * @return Specifies whether the underlying index enforces a unique constraint. If omitted, defaults to false. You cannot specify true when using [hashed shard keys](https://docs.mongodb.com/manual/core/hashed-sharding/#std-label-sharding-hashed).
     * 
     */
    private @Nullable Boolean isShardKeyUnique;

    private GlobalClusterConfigManagedNamespace() {}
    /**
     * @return The name of the collection associated with the managed namespace.
     * 
     */
    public String collection() {
        return this.collection;
    }
    /**
     * @return The custom shard key for the collection. Global Clusters require a compound shard key consisting of a location field and a user-selected second key, the custom shard key.
     * 
     */
    public String customShardKey() {
        return this.customShardKey;
    }
    /**
     * @return The name of the database containing the collection.
     * 
     */
    public String db() {
        return this.db;
    }
    /**
     * @return Specifies whether the custom shard key for the collection is [hashed](https://docs.mongodb.com/manual/reference/method/sh.shardCollection/#hashed-shard-keys). If omitted, defaults to `false`. If `false`, Atlas uses [ranged sharding](https://docs.mongodb.com/manual/core/ranged-sharding/). This is only available for Atlas clusters with MongoDB v4.4 and later.
     * 
     */
    public Optional<Boolean> isCustomShardKeyHashed() {
        return Optional.ofNullable(this.isCustomShardKeyHashed);
    }
    /**
     * @return Specifies whether the underlying index enforces a unique constraint. If omitted, defaults to false. You cannot specify true when using [hashed shard keys](https://docs.mongodb.com/manual/core/hashed-sharding/#std-label-sharding-hashed).
     * 
     */
    public Optional<Boolean> isShardKeyUnique() {
        return Optional.ofNullable(this.isShardKeyUnique);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterConfigManagedNamespace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String collection;
        private String customShardKey;
        private String db;
        private @Nullable Boolean isCustomShardKeyHashed;
        private @Nullable Boolean isShardKeyUnique;
        public Builder() {}
        public Builder(GlobalClusterConfigManagedNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.customShardKey = defaults.customShardKey;
    	      this.db = defaults.db;
    	      this.isCustomShardKeyHashed = defaults.isCustomShardKeyHashed;
    	      this.isShardKeyUnique = defaults.isShardKeyUnique;
        }

        @CustomType.Setter
        public Builder collection(String collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }
        @CustomType.Setter
        public Builder customShardKey(String customShardKey) {
            this.customShardKey = Objects.requireNonNull(customShardKey);
            return this;
        }
        @CustomType.Setter
        public Builder db(String db) {
            this.db = Objects.requireNonNull(db);
            return this;
        }
        @CustomType.Setter
        public Builder isCustomShardKeyHashed(@Nullable Boolean isCustomShardKeyHashed) {
            this.isCustomShardKeyHashed = isCustomShardKeyHashed;
            return this;
        }
        @CustomType.Setter
        public Builder isShardKeyUnique(@Nullable Boolean isShardKeyUnique) {
            this.isShardKeyUnique = isShardKeyUnique;
            return this;
        }
        public GlobalClusterConfigManagedNamespace build() {
            final var o = new GlobalClusterConfigManagedNamespace();
            o.collection = collection;
            o.customShardKey = customShardKey;
            o.db = db;
            o.isCustomShardKeyHashed = isCustomShardKeyHashed;
            o.isShardKeyUnique = isShardKeyUnique;
            return o;
        }
    }
}