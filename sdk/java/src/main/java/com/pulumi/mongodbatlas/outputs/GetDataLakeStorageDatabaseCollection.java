// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetDataLakeStorageDatabaseCollectionDataSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataLakeStorageDatabaseCollection {
    private List<GetDataLakeStorageDatabaseCollectionDataSource> dataSources;
    /**
     * @return Name of the data lake.
     * 
     */
    private String name;

    private GetDataLakeStorageDatabaseCollection() {}
    public List<GetDataLakeStorageDatabaseCollectionDataSource> dataSources() {
        return this.dataSources;
    }
    /**
     * @return Name of the data lake.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakeStorageDatabaseCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDataLakeStorageDatabaseCollectionDataSource> dataSources;
        private String name;
        public Builder() {}
        public Builder(GetDataLakeStorageDatabaseCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder dataSources(List<GetDataLakeStorageDatabaseCollectionDataSource> dataSources) {
            this.dataSources = Objects.requireNonNull(dataSources);
            return this;
        }
        public Builder dataSources(GetDataLakeStorageDatabaseCollectionDataSource... dataSources) {
            return dataSources(List.of(dataSources));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetDataLakeStorageDatabaseCollection build() {
            final var o = new GetDataLakeStorageDatabaseCollection();
            o.dataSources = dataSources;
            o.name = name;
            return o;
        }
    }
}
