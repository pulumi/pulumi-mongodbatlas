// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstancesResultStorageDatabaseCollection;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstancesResultStorageDatabaseView;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstancesResultStorageDatabase {
    private List<GetFederatedDatabaseInstancesResultStorageDatabaseCollection> collections;
    private Integer maxWildcardCollections;
    private String name;
    private List<GetFederatedDatabaseInstancesResultStorageDatabaseView> views;

    private GetFederatedDatabaseInstancesResultStorageDatabase() {}
    public List<GetFederatedDatabaseInstancesResultStorageDatabaseCollection> collections() {
        return this.collections;
    }
    public Integer maxWildcardCollections() {
        return this.maxWildcardCollections;
    }
    public String name() {
        return this.name;
    }
    public List<GetFederatedDatabaseInstancesResultStorageDatabaseView> views() {
        return this.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstancesResultStorageDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFederatedDatabaseInstancesResultStorageDatabaseCollection> collections;
        private Integer maxWildcardCollections;
        private String name;
        private List<GetFederatedDatabaseInstancesResultStorageDatabaseView> views;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstancesResultStorageDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collections = defaults.collections;
    	      this.maxWildcardCollections = defaults.maxWildcardCollections;
    	      this.name = defaults.name;
    	      this.views = defaults.views;
        }

        @CustomType.Setter
        public Builder collections(List<GetFederatedDatabaseInstancesResultStorageDatabaseCollection> collections) {
            if (collections == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageDatabase", "collections");
            }
            this.collections = collections;
            return this;
        }
        public Builder collections(GetFederatedDatabaseInstancesResultStorageDatabaseCollection... collections) {
            return collections(List.of(collections));
        }
        @CustomType.Setter
        public Builder maxWildcardCollections(Integer maxWildcardCollections) {
            if (maxWildcardCollections == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageDatabase", "maxWildcardCollections");
            }
            this.maxWildcardCollections = maxWildcardCollections;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageDatabase", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder views(List<GetFederatedDatabaseInstancesResultStorageDatabaseView> views) {
            if (views == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstancesResultStorageDatabase", "views");
            }
            this.views = views;
            return this;
        }
        public Builder views(GetFederatedDatabaseInstancesResultStorageDatabaseView... views) {
            return views(List.of(views));
        }
        public GetFederatedDatabaseInstancesResultStorageDatabase build() {
            final var _resultValue = new GetFederatedDatabaseInstancesResultStorageDatabase();
            _resultValue.collections = collections;
            _resultValue.maxWildcardCollections = maxWildcardCollections;
            _resultValue.name = name;
            _resultValue.views = views;
            return _resultValue;
        }
    }
}
