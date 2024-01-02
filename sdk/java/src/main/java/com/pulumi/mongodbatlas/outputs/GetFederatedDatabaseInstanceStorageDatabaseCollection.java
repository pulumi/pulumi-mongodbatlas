// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceStorageDatabaseCollection {
    private List<GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources;
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    private String name;

    private GetFederatedDatabaseInstanceStorageDatabaseCollection() {}
    public List<GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources() {
        return this.dataSources;
    }
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceStorageDatabaseCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources;
        private String name;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceStorageDatabaseCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder dataSources(List<GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources) {
            if (dataSources == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageDatabaseCollection", "dataSources");
            }
            this.dataSources = dataSources;
            return this;
        }
        public Builder dataSources(GetFederatedDatabaseInstanceStorageDatabaseCollectionDataSource... dataSources) {
            return dataSources(List.of(dataSources));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageDatabaseCollection", "name");
            }
            this.name = name;
            return this;
        }
        public GetFederatedDatabaseInstanceStorageDatabaseCollection build() {
            final var _resultValue = new GetFederatedDatabaseInstanceStorageDatabaseCollection();
            _resultValue.dataSources = dataSources;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
