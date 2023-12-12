// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudBackupSnapshotMember {
    /**
     * @return Cloud provider that stores this snapshot.
     * 
     */
    private @Nullable String cloudProvider;
    /**
     * @return Unique identifier for the sharded cluster snapshot.
     * 
     */
    private @Nullable String id;
    /**
     * @return Label given to a shard or config server from which Atlas took this snapshot.
     * 
     */
    private @Nullable String replicaSetName;

    private CloudBackupSnapshotMember() {}
    /**
     * @return Cloud provider that stores this snapshot.
     * 
     */
    public Optional<String> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }
    /**
     * @return Unique identifier for the sharded cluster snapshot.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Label given to a shard or config server from which Atlas took this snapshot.
     * 
     */
    public Optional<String> replicaSetName() {
        return Optional.ofNullable(this.replicaSetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBackupSnapshotMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudProvider;
        private @Nullable String id;
        private @Nullable String replicaSetName;
        public Builder() {}
        public Builder(CloudBackupSnapshotMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.id = defaults.id;
    	      this.replicaSetName = defaults.replicaSetName;
        }

        @CustomType.Setter
        public Builder cloudProvider(@Nullable String cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder replicaSetName(@Nullable String replicaSetName) {
            this.replicaSetName = replicaSetName;
            return this;
        }
        public CloudBackupSnapshotMember build() {
            final var _resultValue = new CloudBackupSnapshotMember();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.id = id;
            _resultValue.replicaSetName = replicaSetName;
            return _resultValue;
        }
    }
}
