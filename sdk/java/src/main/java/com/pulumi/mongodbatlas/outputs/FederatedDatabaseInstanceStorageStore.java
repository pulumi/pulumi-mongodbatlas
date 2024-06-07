// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceStorageStoreReadPreference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FederatedDatabaseInstanceStorageStore {
    private @Nullable List<String> additionalStorageClasses;
    private @Nullable Boolean allowInsecure;
    private @Nullable String bucket;
    /**
     * @deprecated
     * This parameter is deprecated and will be removed by September 2024.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed by September 2024. */
    private @Nullable String clusterId;
    private @Nullable String clusterName;
    private @Nullable String defaultFormat;
    private @Nullable String delimiter;
    private @Nullable Boolean includeTags;
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    private @Nullable String name;
    private @Nullable String prefix;
    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    private @Nullable String projectId;
    private @Nullable String provider;
    private @Nullable String public_;
    private @Nullable FederatedDatabaseInstanceStorageStoreReadPreference readPreference;
    private @Nullable String region;
    private @Nullable List<String> urls;

    private FederatedDatabaseInstanceStorageStore() {}
    public List<String> additionalStorageClasses() {
        return this.additionalStorageClasses == null ? List.of() : this.additionalStorageClasses;
    }
    public Optional<Boolean> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * @deprecated
     * This parameter is deprecated and will be removed by September 2024.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed by September 2024. */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    public Optional<String> defaultFormat() {
        return Optional.ofNullable(this.defaultFormat);
    }
    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    public Optional<Boolean> includeTags() {
        return Optional.ofNullable(this.includeTags);
    }
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    public Optional<String> public_() {
        return Optional.ofNullable(this.public_);
    }
    public Optional<FederatedDatabaseInstanceStorageStoreReadPreference> readPreference() {
        return Optional.ofNullable(this.readPreference);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public List<String> urls() {
        return this.urls == null ? List.of() : this.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceStorageStore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> additionalStorageClasses;
        private @Nullable Boolean allowInsecure;
        private @Nullable String bucket;
        private @Nullable String clusterId;
        private @Nullable String clusterName;
        private @Nullable String defaultFormat;
        private @Nullable String delimiter;
        private @Nullable Boolean includeTags;
        private @Nullable String name;
        private @Nullable String prefix;
        private @Nullable String projectId;
        private @Nullable String provider;
        private @Nullable String public_;
        private @Nullable FederatedDatabaseInstanceStorageStoreReadPreference readPreference;
        private @Nullable String region;
        private @Nullable List<String> urls;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceStorageStore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalStorageClasses = defaults.additionalStorageClasses;
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.bucket = defaults.bucket;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.defaultFormat = defaults.defaultFormat;
    	      this.delimiter = defaults.delimiter;
    	      this.includeTags = defaults.includeTags;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.projectId = defaults.projectId;
    	      this.provider = defaults.provider;
    	      this.public_ = defaults.public_;
    	      this.readPreference = defaults.readPreference;
    	      this.region = defaults.region;
    	      this.urls = defaults.urls;
        }

        @CustomType.Setter
        public Builder additionalStorageClasses(@Nullable List<String> additionalStorageClasses) {

            this.additionalStorageClasses = additionalStorageClasses;
            return this;
        }
        public Builder additionalStorageClasses(String... additionalStorageClasses) {
            return additionalStorageClasses(List.of(additionalStorageClasses));
        }
        @CustomType.Setter
        public Builder allowInsecure(@Nullable Boolean allowInsecure) {

            this.allowInsecure = allowInsecure;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(@Nullable String bucket) {

            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {

            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder defaultFormat(@Nullable String defaultFormat) {

            this.defaultFormat = defaultFormat;
            return this;
        }
        @CustomType.Setter
        public Builder delimiter(@Nullable String delimiter) {

            this.delimiter = delimiter;
            return this;
        }
        @CustomType.Setter
        public Builder includeTags(@Nullable Boolean includeTags) {

            this.includeTags = includeTags;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(@Nullable String public_) {

            this.public_ = public_;
            return this;
        }
        @CustomType.Setter
        public Builder readPreference(@Nullable FederatedDatabaseInstanceStorageStoreReadPreference readPreference) {

            this.readPreference = readPreference;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder urls(@Nullable List<String> urls) {

            this.urls = urls;
            return this;
        }
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }
        public FederatedDatabaseInstanceStorageStore build() {
            final var _resultValue = new FederatedDatabaseInstanceStorageStore();
            _resultValue.additionalStorageClasses = additionalStorageClasses;
            _resultValue.allowInsecure = allowInsecure;
            _resultValue.bucket = bucket;
            _resultValue.clusterId = clusterId;
            _resultValue.clusterName = clusterName;
            _resultValue.defaultFormat = defaultFormat;
            _resultValue.delimiter = delimiter;
            _resultValue.includeTags = includeTags;
            _resultValue.name = name;
            _resultValue.prefix = prefix;
            _resultValue.projectId = projectId;
            _resultValue.provider = provider;
            _resultValue.public_ = public_;
            _resultValue.readPreference = readPreference;
            _resultValue.region = region;
            _resultValue.urls = urls;
            return _resultValue;
        }
    }
}
