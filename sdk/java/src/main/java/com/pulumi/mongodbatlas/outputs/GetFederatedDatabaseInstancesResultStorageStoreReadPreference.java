// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstancesResultStorageStoreReadPreferenceTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstancesResultStorageStoreReadPreference {
    private Integer maxStalenessSeconds;
    private String mode;
    private List<GetFederatedDatabaseInstancesResultStorageStoreReadPreferenceTag> tags;

    private GetFederatedDatabaseInstancesResultStorageStoreReadPreference() {}
    public Integer maxStalenessSeconds() {
        return this.maxStalenessSeconds;
    }
    public String mode() {
        return this.mode;
    }
    public List<GetFederatedDatabaseInstancesResultStorageStoreReadPreferenceTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstancesResultStorageStoreReadPreference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxStalenessSeconds;
        private String mode;
        private List<GetFederatedDatabaseInstancesResultStorageStoreReadPreferenceTag> tags;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstancesResultStorageStoreReadPreference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxStalenessSeconds = defaults.maxStalenessSeconds;
    	      this.mode = defaults.mode;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder maxStalenessSeconds(Integer maxStalenessSeconds) {
            this.maxStalenessSeconds = Objects.requireNonNull(maxStalenessSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetFederatedDatabaseInstancesResultStorageStoreReadPreferenceTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetFederatedDatabaseInstancesResultStorageStoreReadPreferenceTag... tags) {
            return tags(List.of(tags));
        }
        public GetFederatedDatabaseInstancesResultStorageStoreReadPreference build() {
            final var o = new GetFederatedDatabaseInstancesResultStorageStoreReadPreference();
            o.maxStalenessSeconds = maxStalenessSeconds;
            o.mode = mode;
            o.tags = tags;
            return o;
        }
    }
}