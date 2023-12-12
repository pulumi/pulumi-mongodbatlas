// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakePipelineSnapshot {
    private @Nullable String copyRegion;
    private @Nullable String createdAt;
    private @Nullable String expiresAt;
    private @Nullable String frequencyYype;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
     * 
     */
    private @Nullable String id;
    private @Nullable String masterKey;
    private @Nullable String mongodVersion;
    private @Nullable List<String> policies;
    /**
     * @return Target cloud provider for this Data Lake Pipeline.
     * 
     */
    private @Nullable String provider;
    private @Nullable String replicaSetName;
    private @Nullable Integer size;
    private @Nullable String snapshotType;
    private @Nullable String status;
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    private @Nullable String type;

    private DataLakePipelineSnapshot() {}
    public Optional<String> copyRegion() {
        return Optional.ofNullable(this.copyRegion);
    }
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    public Optional<String> frequencyYype() {
        return Optional.ofNullable(this.frequencyYype);
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> masterKey() {
        return Optional.ofNullable(this.masterKey);
    }
    public Optional<String> mongodVersion() {
        return Optional.ofNullable(this.mongodVersion);
    }
    public List<String> policies() {
        return this.policies == null ? List.of() : this.policies;
    }
    /**
     * @return Target cloud provider for this Data Lake Pipeline.
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    public Optional<String> replicaSetName() {
        return Optional.ofNullable(this.replicaSetName);
    }
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakePipelineSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String copyRegion;
        private @Nullable String createdAt;
        private @Nullable String expiresAt;
        private @Nullable String frequencyYype;
        private @Nullable String id;
        private @Nullable String masterKey;
        private @Nullable String mongodVersion;
        private @Nullable List<String> policies;
        private @Nullable String provider;
        private @Nullable String replicaSetName;
        private @Nullable Integer size;
        private @Nullable String snapshotType;
        private @Nullable String status;
        private @Nullable String type;
        public Builder() {}
        public Builder(DataLakePipelineSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyRegion = defaults.copyRegion;
    	      this.createdAt = defaults.createdAt;
    	      this.expiresAt = defaults.expiresAt;
    	      this.frequencyYype = defaults.frequencyYype;
    	      this.id = defaults.id;
    	      this.masterKey = defaults.masterKey;
    	      this.mongodVersion = defaults.mongodVersion;
    	      this.policies = defaults.policies;
    	      this.provider = defaults.provider;
    	      this.replicaSetName = defaults.replicaSetName;
    	      this.size = defaults.size;
    	      this.snapshotType = defaults.snapshotType;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder copyRegion(@Nullable String copyRegion) {
            this.copyRegion = copyRegion;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(@Nullable String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder frequencyYype(@Nullable String frequencyYype) {
            this.frequencyYype = frequencyYype;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder masterKey(@Nullable String masterKey) {
            this.masterKey = masterKey;
            return this;
        }
        @CustomType.Setter
        public Builder mongodVersion(@Nullable String mongodVersion) {
            this.mongodVersion = mongodVersion;
            return this;
        }
        @CustomType.Setter
        public Builder policies(@Nullable List<String> policies) {
            this.policies = policies;
            return this;
        }
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder replicaSetName(@Nullable String replicaSetName) {
            this.replicaSetName = replicaSetName;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DataLakePipelineSnapshot build() {
            final var _resultValue = new DataLakePipelineSnapshot();
            _resultValue.copyRegion = copyRegion;
            _resultValue.createdAt = createdAt;
            _resultValue.expiresAt = expiresAt;
            _resultValue.frequencyYype = frequencyYype;
            _resultValue.id = id;
            _resultValue.masterKey = masterKey;
            _resultValue.mongodVersion = mongodVersion;
            _resultValue.policies = policies;
            _resultValue.provider = provider;
            _resultValue.replicaSetName = replicaSetName;
            _resultValue.size = size;
            _resultValue.snapshotType = snapshotType;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
