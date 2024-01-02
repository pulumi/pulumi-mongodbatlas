// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FederatedDatabaseInstanceStorageStoreReadPreference {
    private @Nullable Integer maxStalenessSeconds;
    private @Nullable String mode;
    private @Nullable List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets;

    private FederatedDatabaseInstanceStorageStoreReadPreference() {}
    public Optional<Integer> maxStalenessSeconds() {
        return Optional.ofNullable(this.maxStalenessSeconds);
    }
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    public List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets() {
        return this.tagSets == null ? List.of() : this.tagSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceStorageStoreReadPreference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxStalenessSeconds;
        private @Nullable String mode;
        private @Nullable List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceStorageStoreReadPreference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxStalenessSeconds = defaults.maxStalenessSeconds;
    	      this.mode = defaults.mode;
    	      this.tagSets = defaults.tagSets;
        }

        @CustomType.Setter
        public Builder maxStalenessSeconds(@Nullable Integer maxStalenessSeconds) {

            this.maxStalenessSeconds = maxStalenessSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder tagSets(@Nullable List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets) {

            this.tagSets = tagSets;
            return this;
        }
        public Builder tagSets(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet... tagSets) {
            return tagSets(List.of(tagSets));
        }
        public FederatedDatabaseInstanceStorageStoreReadPreference build() {
            final var _resultValue = new FederatedDatabaseInstanceStorageStoreReadPreference();
            _resultValue.maxStalenessSeconds = maxStalenessSeconds;
            _resultValue.mode = mode;
            _resultValue.tagSets = tagSets;
            return _resultValue;
        }
    }
}
