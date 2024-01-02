// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstancesResultStorageStoreReadPreference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstancesResultStorageStore {
    private List<String> additionalStorageClasses;
    private Boolean allowInsecure;
    private String bucket;
    /**
     * @deprecated
     * this parameter is deprecated and will be removed by September 2024
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed by September 2024 */
    private String clusterId;
    private String clusterName;
    private String defaultFormat;
    private String delimiter;
    private Boolean includeTags;
    private String name;
    private String prefix;
    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    private String projectId;
    private String provider;
    private String public_;
    private List<GetFederatedDatabaseInstancesResultStorageStoreReadPreference> readPreferences;
    /**
     * @return Name of the region to which the Federanted Instnace routes client connections for data processing.
     * 
     */
    private String region;
    private List<String> urls;

    private GetFederatedDatabaseInstancesResultStorageStore() {}
    public List<String> additionalStorageClasses() {
        return this.additionalStorageClasses;
    }
    public Boolean allowInsecure() {
        return this.allowInsecure;
    }
    public String bucket() {
        return this.bucket;
    }
    /**
     * @deprecated
     * this parameter is deprecated and will be removed by September 2024
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed by September 2024 */
    public String clusterId() {
        return this.clusterId;
    }
    public String clusterName() {
        return this.clusterName;
    }
    public String defaultFormat() {
        return this.defaultFormat;
    }
    public String delimiter() {
        return this.delimiter;
    }
    public Boolean includeTags() {
        return this.includeTags;
    }
    public String name() {
        return this.name;
    }
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public String provider() {
        return this.provider;
    }
    public String public_() {
        return this.public_;
    }
    public List<GetFederatedDatabaseInstancesResultStorageStoreReadPreference> readPreferences() {
        return this.readPreferences;
    }
    /**
     * @return Name of the region to which the Federanted Instnace routes client connections for data processing.
     * 
     */
    public String region() {
        return this.region;
    }
    public List<String> urls() {
        return this.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstancesResultStorageStore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalStorageClasses;
        private Boolean allowInsecure;
        private String bucket;
        private String clusterId;
        private String clusterName;
        private String defaultFormat;
        private String delimiter;
        private Boolean includeTags;
        private String name;
        private String prefix;
        private String projectId;
        private String provider;
        private String public_;
        private List<GetFederatedDatabaseInstancesResultStorageStoreReadPreference> readPreferences;
        private String region;
        private List<String> urls;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstancesResultStorageStore defaults) {
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
    	      this.readPreferences = defaults.readPreferences;
    	      this.region = defaults.region;
    	      this.urls = defaults.urls;
        }

        @CustomType.Setter
        public Builder additionalStorageClasses(List<String> additionalStorageClasses) {
            if (additionalStorageClasses == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "additionalStorageClasses");
            }
            this.additionalStorageClasses = additionalStorageClasses;
            return this;
        }
        public Builder additionalStorageClasses(String... additionalStorageClasses) {
            return additionalStorageClasses(List.of(additionalStorageClasses));
        }
        @CustomType.Setter
        public Builder allowInsecure(Boolean allowInsecure) {
            if (allowInsecure == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "allowInsecure");
            }
            this.allowInsecure = allowInsecure;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder defaultFormat(String defaultFormat) {
            if (defaultFormat == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "defaultFormat");
            }
            this.defaultFormat = defaultFormat;
            return this;
        }
        @CustomType.Setter
        public Builder delimiter(String delimiter) {
            if (delimiter == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "delimiter");
            }
            this.delimiter = delimiter;
            return this;
        }
        @CustomType.Setter
        public Builder includeTags(Boolean includeTags) {
            if (includeTags == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "includeTags");
            }
            this.includeTags = includeTags;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder provider(String provider) {
            if (provider == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "provider");
            }
            this.provider = provider;
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(String public_) {
            if (public_ == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "public_");
            }
            this.public_ = public_;
            return this;
        }
        @CustomType.Setter
        public Builder readPreferences(List<GetFederatedDatabaseInstancesResultStorageStoreReadPreference> readPreferences) {
            if (readPreferences == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "readPreferences");
            }
            this.readPreferences = readPreferences;
            return this;
        }
        public Builder readPreferences(GetFederatedDatabaseInstancesResultStorageStoreReadPreference... readPreferences) {
            return readPreferences(List.of(readPreferences));
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder urls(List<String> urls) {
            if (urls == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageStore", "urls");
            }
            this.urls = urls;
            return this;
        }
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }
        public GetFederatedDatabaseInstancesResultStorageStore build() {
            final var _resultValue = new GetFederatedDatabaseInstancesResultStorageStore();
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
            _resultValue.readPreferences = readPreferences;
            _resultValue.region = region;
            _resultValue.urls = urls;
            return _resultValue;
        }
    }
}
