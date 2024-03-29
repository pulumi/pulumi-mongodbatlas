// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs Empty = new FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs();

    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    @Import(name="collection")
    private @Nullable Output<String> collection;

    public Optional<Output<String>> collection() {
        return Optional.ofNullable(this.collection);
    }

    @Import(name="collectionRegex")
    private @Nullable Output<String> collectionRegex;

    public Optional<Output<String>> collectionRegex() {
        return Optional.ofNullable(this.collectionRegex);
    }

    @Import(name="database")
    private @Nullable Output<String> database;

    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    @Import(name="databaseRegex")
    private @Nullable Output<String> databaseRegex;

    public Optional<Output<String>> databaseRegex() {
        return Optional.ofNullable(this.databaseRegex);
    }

    @Import(name="datasetName")
    private @Nullable Output<String> datasetName;

    public Optional<Output<String>> datasetName() {
        return Optional.ofNullable(this.datasetName);
    }

    @Import(name="defaultFormat")
    private @Nullable Output<String> defaultFormat;

    public Optional<Output<String>> defaultFormat() {
        return Optional.ofNullable(this.defaultFormat);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="provenanceFieldName")
    private @Nullable Output<String> provenanceFieldName;

    public Optional<Output<String>> provenanceFieldName() {
        return Optional.ofNullable(this.provenanceFieldName);
    }

    @Import(name="storeName")
    private @Nullable Output<String> storeName;

    public Optional<Output<String>> storeName() {
        return Optional.ofNullable(this.storeName);
    }

    @Import(name="urls")
    private @Nullable Output<List<String>> urls;

    public Optional<Output<List<String>>> urls() {
        return Optional.ofNullable(this.urls);
    }

    private FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs() {}

    private FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs(FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs $) {
        this.allowInsecure = $.allowInsecure;
        this.collection = $.collection;
        this.collectionRegex = $.collectionRegex;
        this.database = $.database;
        this.databaseRegex = $.databaseRegex;
        this.datasetName = $.datasetName;
        this.defaultFormat = $.defaultFormat;
        this.path = $.path;
        this.provenanceFieldName = $.provenanceFieldName;
        this.storeName = $.storeName;
        this.urls = $.urls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs();
        }

        public Builder(FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs defaults) {
            $ = new FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        public Builder collection(@Nullable Output<String> collection) {
            $.collection = collection;
            return this;
        }

        public Builder collection(String collection) {
            return collection(Output.of(collection));
        }

        public Builder collectionRegex(@Nullable Output<String> collectionRegex) {
            $.collectionRegex = collectionRegex;
            return this;
        }

        public Builder collectionRegex(String collectionRegex) {
            return collectionRegex(Output.of(collectionRegex));
        }

        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder databaseRegex(@Nullable Output<String> databaseRegex) {
            $.databaseRegex = databaseRegex;
            return this;
        }

        public Builder databaseRegex(String databaseRegex) {
            return databaseRegex(Output.of(databaseRegex));
        }

        public Builder datasetName(@Nullable Output<String> datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        public Builder datasetName(String datasetName) {
            return datasetName(Output.of(datasetName));
        }

        public Builder defaultFormat(@Nullable Output<String> defaultFormat) {
            $.defaultFormat = defaultFormat;
            return this;
        }

        public Builder defaultFormat(String defaultFormat) {
            return defaultFormat(Output.of(defaultFormat));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder provenanceFieldName(@Nullable Output<String> provenanceFieldName) {
            $.provenanceFieldName = provenanceFieldName;
            return this;
        }

        public Builder provenanceFieldName(String provenanceFieldName) {
            return provenanceFieldName(Output.of(provenanceFieldName));
        }

        public Builder storeName(@Nullable Output<String> storeName) {
            $.storeName = storeName;
            return this;
        }

        public Builder storeName(String storeName) {
            return storeName(Output.of(storeName));
        }

        public Builder urls(@Nullable Output<List<String>> urls) {
            $.urls = urls;
            return this;
        }

        public Builder urls(List<String> urls) {
            return urls(Output.of(urls));
        }

        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }

        public FederatedDatabaseInstanceStorageDatabaseCollectionDataSourceArgs build() {
            return $;
        }
    }

}
