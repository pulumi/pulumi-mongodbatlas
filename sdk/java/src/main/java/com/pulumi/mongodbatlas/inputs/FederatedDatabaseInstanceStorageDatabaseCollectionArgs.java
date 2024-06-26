// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FederatedDatabaseInstanceStorageDatabaseCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceStorageDatabaseCollectionArgs Empty = new FederatedDatabaseInstanceStorageDatabaseCollectionArgs();

    @Import(name="dataSources")
    private @Nullable Output<List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs>> dataSources;

    public Optional<Output<List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs>>> dataSources() {
        return Optional.ofNullable(this.dataSources);
    }

    /**
     * Name of the Atlas Federated Database Instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FederatedDatabaseInstanceStorageDatabaseCollectionArgs() {}

    private FederatedDatabaseInstanceStorageDatabaseCollectionArgs(FederatedDatabaseInstanceStorageDatabaseCollectionArgs $) {
        this.dataSources = $.dataSources;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceStorageDatabaseCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceStorageDatabaseCollectionArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceStorageDatabaseCollectionArgs();
        }

        public Builder(FederatedDatabaseInstanceStorageDatabaseCollectionArgs defaults) {
            $ = new FederatedDatabaseInstanceStorageDatabaseCollectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataSources(@Nullable Output<List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs>> dataSources) {
            $.dataSources = dataSources;
            return this;
        }

        public Builder dataSources(List<FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs> dataSources) {
            return dataSources(Output.of(dataSources));
        }

        public Builder dataSources(FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs... dataSources) {
            return dataSources(List.of(dataSources));
        }

        /**
         * @param name Name of the Atlas Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Atlas Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FederatedDatabaseInstanceStorageDatabaseCollectionArgs build() {
            return $;
        }
    }

}
