// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet {
    private List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags;

    private FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet() {}
    public List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder tags(List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag... tags) {
            return tags(List.of(tags));
        }
        public FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet build() {
            final var _resultValue = new FederatedDatabaseInstanceStorageStoreReadPreferenceTagSet();
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
