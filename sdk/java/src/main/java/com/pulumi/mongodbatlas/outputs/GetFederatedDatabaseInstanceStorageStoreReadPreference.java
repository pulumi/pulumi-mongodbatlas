// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceStorageStoreReadPreference {
    private Integer maxStalenessSeconds;
    private String mode;
    private List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets;

    private GetFederatedDatabaseInstanceStorageStoreReadPreference() {}
    public Integer maxStalenessSeconds() {
        return this.maxStalenessSeconds;
    }
    public String mode() {
        return this.mode;
    }
    public List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets() {
        return this.tagSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceStorageStoreReadPreference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxStalenessSeconds;
        private String mode;
        private List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceStorageStoreReadPreference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxStalenessSeconds = defaults.maxStalenessSeconds;
    	      this.mode = defaults.mode;
    	      this.tagSets = defaults.tagSets;
        }

        @CustomType.Setter
        public Builder maxStalenessSeconds(Integer maxStalenessSeconds) {
            if (maxStalenessSeconds == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageStoreReadPreference", "maxStalenessSeconds");
            }
            this.maxStalenessSeconds = maxStalenessSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageStoreReadPreference", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder tagSets(List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet> tagSets) {
            if (tagSets == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageStoreReadPreference", "tagSets");
            }
            this.tagSets = tagSets;
            return this;
        }
        public Builder tagSets(GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet... tagSets) {
            return tagSets(List.of(tagSets));
        }
        public GetFederatedDatabaseInstanceStorageStoreReadPreference build() {
            final var _resultValue = new GetFederatedDatabaseInstanceStorageStoreReadPreference();
            _resultValue.maxStalenessSeconds = maxStalenessSeconds;
            _resultValue.mode = mode;
            _resultValue.tagSets = tagSets;
            return _resultValue;
        }
    }
}
