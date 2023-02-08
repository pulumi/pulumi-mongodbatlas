// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakeStorageDatabaseCollectionDataSource {
    private @Nullable String defaultFormat;
    private @Nullable String path;
    private @Nullable String storeName;

    private DataLakeStorageDatabaseCollectionDataSource() {}
    public Optional<String> defaultFormat() {
        return Optional.ofNullable(this.defaultFormat);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> storeName() {
        return Optional.ofNullable(this.storeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeStorageDatabaseCollectionDataSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultFormat;
        private @Nullable String path;
        private @Nullable String storeName;
        public Builder() {}
        public Builder(DataLakeStorageDatabaseCollectionDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultFormat = defaults.defaultFormat;
    	      this.path = defaults.path;
    	      this.storeName = defaults.storeName;
        }

        @CustomType.Setter
        public Builder defaultFormat(@Nullable String defaultFormat) {
            this.defaultFormat = defaultFormat;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder storeName(@Nullable String storeName) {
            this.storeName = storeName;
            return this;
        }
        public DataLakeStorageDatabaseCollectionDataSource build() {
            final var o = new DataLakeStorageDatabaseCollectionDataSource();
            o.defaultFormat = defaultFormat;
            o.path = path;
            o.storeName = storeName;
            return o;
        }
    }
}