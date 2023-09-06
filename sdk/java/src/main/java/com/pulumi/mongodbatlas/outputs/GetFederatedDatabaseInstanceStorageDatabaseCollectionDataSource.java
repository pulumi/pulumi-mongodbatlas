// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource {
    private Boolean allowInsecure;
    private String collection;
    private String collectionRegex;
    private String database;
    private String databaseRegex;
    private String datasetName;
    private String defaultFormat;
    private String path;
    private String provenanceFieldName;
    private String storeName;
    private List<String> urls;

    private GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource() {}
    public Boolean allowInsecure() {
        return this.allowInsecure;
    }
    public String collection() {
        return this.collection;
    }
    public String collectionRegex() {
        return this.collectionRegex;
    }
    public String database() {
        return this.database;
    }
    public String databaseRegex() {
        return this.databaseRegex;
    }
    public String datasetName() {
        return this.datasetName;
    }
    public String defaultFormat() {
        return this.defaultFormat;
    }
    public String path() {
        return this.path;
    }
    public String provenanceFieldName() {
        return this.provenanceFieldName;
    }
    public String storeName() {
        return this.storeName;
    }
    public List<String> urls() {
        return this.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowInsecure;
        private String collection;
        private String collectionRegex;
        private String database;
        private String databaseRegex;
        private String datasetName;
        private String defaultFormat;
        private String path;
        private String provenanceFieldName;
        private String storeName;
        private List<String> urls;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.collection = defaults.collection;
    	      this.collectionRegex = defaults.collectionRegex;
    	      this.database = defaults.database;
    	      this.databaseRegex = defaults.databaseRegex;
    	      this.datasetName = defaults.datasetName;
    	      this.defaultFormat = defaults.defaultFormat;
    	      this.path = defaults.path;
    	      this.provenanceFieldName = defaults.provenanceFieldName;
    	      this.storeName = defaults.storeName;
    	      this.urls = defaults.urls;
        }

        @CustomType.Setter
        public Builder allowInsecure(Boolean allowInsecure) {
            this.allowInsecure = Objects.requireNonNull(allowInsecure);
            return this;
        }
        @CustomType.Setter
        public Builder collection(String collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }
        @CustomType.Setter
        public Builder collectionRegex(String collectionRegex) {
            this.collectionRegex = Objects.requireNonNull(collectionRegex);
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder databaseRegex(String databaseRegex) {
            this.databaseRegex = Objects.requireNonNull(databaseRegex);
            return this;
        }
        @CustomType.Setter
        public Builder datasetName(String datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }
        @CustomType.Setter
        public Builder defaultFormat(String defaultFormat) {
            this.defaultFormat = Objects.requireNonNull(defaultFormat);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder provenanceFieldName(String provenanceFieldName) {
            this.provenanceFieldName = Objects.requireNonNull(provenanceFieldName);
            return this;
        }
        @CustomType.Setter
        public Builder storeName(String storeName) {
            this.storeName = Objects.requireNonNull(storeName);
            return this;
        }
        @CustomType.Setter
        public Builder urls(List<String> urls) {
            this.urls = Objects.requireNonNull(urls);
            return this;
        }
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }
        public GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource build() {
            final var o = new GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource();
            o.allowInsecure = allowInsecure;
            o.collection = collection;
            o.collectionRegex = collectionRegex;
            o.database = database;
            o.databaseRegex = databaseRegex;
            o.datasetName = datasetName;
            o.defaultFormat = defaultFormat;
            o.path = path;
            o.provenanceFieldName = provenanceFieldName;
            o.storeName = storeName;
            o.urls = urls;
            return o;
        }
    }
}
