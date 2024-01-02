// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet {
    private List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags;

    private GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet() {}
    public List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder tags(List<GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTag... tags) {
            return tags(List.of(tags));
        }
        public GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet build() {
            final var _resultValue = new GetFederatedDatabaseInstanceStorageStoreReadPreferenceTagSet();
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
