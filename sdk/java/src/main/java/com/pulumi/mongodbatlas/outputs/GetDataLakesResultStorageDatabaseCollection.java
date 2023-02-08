// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetDataLakesResultStorageDatabaseCollectionDataSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataLakesResultStorageDatabaseCollection {
    private List<GetDataLakesResultStorageDatabaseCollectionDataSource> dataSources;
    private String name;

    private GetDataLakesResultStorageDatabaseCollection() {}
    public List<GetDataLakesResultStorageDatabaseCollectionDataSource> dataSources() {
        return this.dataSources;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakesResultStorageDatabaseCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDataLakesResultStorageDatabaseCollectionDataSource> dataSources;
        private String name;
        public Builder() {}
        public Builder(GetDataLakesResultStorageDatabaseCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder dataSources(List<GetDataLakesResultStorageDatabaseCollectionDataSource> dataSources) {
            this.dataSources = Objects.requireNonNull(dataSources);
            return this;
        }
        public Builder dataSources(GetDataLakesResultStorageDatabaseCollectionDataSource... dataSources) {
            return dataSources(List.of(dataSources));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetDataLakesResultStorageDatabaseCollection build() {
            final var o = new GetDataLakesResultStorageDatabaseCollection();
            o.dataSources = dataSources;
            o.name = name;
            return o;
        }
    }
}