// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceStorageDatabaseCollectionDataSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FederatedDatabaseInstanceStorageDatabaseCollection {
    private @Nullable List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources;
    /**
     * @return Name of the Atlas Federated Database Instance.
     * ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
     * #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * 
     */
    private @Nullable String name;

    private FederatedDatabaseInstanceStorageDatabaseCollection() {}
    public List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources() {
        return this.dataSources == null ? List.of() : this.dataSources;
    }
    /**
     * @return Name of the Atlas Federated Database Instance.
     * ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
     * #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceStorageDatabaseCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources;
        private @Nullable String name;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceStorageDatabaseCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder dataSources(@Nullable List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSource> dataSources) {

            this.dataSources = dataSources;
            return this;
        }
        public Builder dataSources(FederatedDatabaseInstanceStorageDatabaseCollectionDataSource... dataSources) {
            return dataSources(List.of(dataSources));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public FederatedDatabaseInstanceStorageDatabaseCollection build() {
            final var _resultValue = new FederatedDatabaseInstanceStorageDatabaseCollection();
            _resultValue.dataSources = dataSources;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
