// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataLakeStorageStore {
    private List<String> additionalStorageClasses;
    private String bucket;
    private String delimiter;
    private Boolean includeTags;
    /**
     * @return Name of the data lake.
     * 
     */
    private String name;
    private String prefix;
    private String provider;
    private String region;

    private GetDataLakeStorageStore() {}
    public List<String> additionalStorageClasses() {
        return this.additionalStorageClasses;
    }
    public String bucket() {
        return this.bucket;
    }
    public String delimiter() {
        return this.delimiter;
    }
    public Boolean includeTags() {
        return this.includeTags;
    }
    /**
     * @return Name of the data lake.
     * 
     */
    public String name() {
        return this.name;
    }
    public String prefix() {
        return this.prefix;
    }
    public String provider() {
        return this.provider;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakeStorageStore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalStorageClasses;
        private String bucket;
        private String delimiter;
        private Boolean includeTags;
        private String name;
        private String prefix;
        private String provider;
        private String region;
        public Builder() {}
        public Builder(GetDataLakeStorageStore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalStorageClasses = defaults.additionalStorageClasses;
    	      this.bucket = defaults.bucket;
    	      this.delimiter = defaults.delimiter;
    	      this.includeTags = defaults.includeTags;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.provider = defaults.provider;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder additionalStorageClasses(List<String> additionalStorageClasses) {
            this.additionalStorageClasses = Objects.requireNonNull(additionalStorageClasses);
            return this;
        }
        public Builder additionalStorageClasses(String... additionalStorageClasses) {
            return additionalStorageClasses(List.of(additionalStorageClasses));
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder delimiter(String delimiter) {
            this.delimiter = Objects.requireNonNull(delimiter);
            return this;
        }
        @CustomType.Setter
        public Builder includeTags(Boolean includeTags) {
            this.includeTags = Objects.requireNonNull(includeTags);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetDataLakeStorageStore build() {
            final var o = new GetDataLakeStorageStore();
            o.additionalStorageClasses = additionalStorageClasses;
            o.bucket = bucket;
            o.delimiter = delimiter;
            o.includeTags = includeTags;
            o.name = name;
            o.prefix = prefix;
            o.provider = provider;
            o.region = region;
            return o;
        }
    }
}
