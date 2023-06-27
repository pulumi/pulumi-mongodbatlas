// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.SearchIndexSynonymArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SearchIndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final SearchIndexArgs Empty = new SearchIndexArgs();

    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    @Import(name="analyzer")
    private @Nullable Output<String> analyzer;

    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    public Optional<Output<String>> analyzer() {
        return Optional.ofNullable(this.analyzer);
    }

    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * 
     */
    @Import(name="analyzers")
    private @Nullable Output<String> analyzers;

    /**
     * @return [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
     * 
     */
    public Optional<Output<String>> analyzers() {
        return Optional.ofNullable(this.analyzers);
    }

    /**
     * The name of the cluster where you want to create the search index within.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster where you want to create the search index within.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Name of the collection the index is on.
     * 
     */
    @Import(name="collectionName", required=true)
    private Output<String> collectionName;

    /**
     * @return Name of the collection the index is on.
     * 
     */
    public Output<String> collectionName() {
        return this.collectionName;
    }

    /**
     * Name of the database the collection is in.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return Name of the database the collection is in.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Indicates whether the index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
     * 
     */
    @Import(name="mappingsDynamic")
    private @Nullable Output<Boolean> mappingsDynamic;

    /**
     * @return Indicates whether the index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
     * 
     */
    public Optional<Output<Boolean>> mappingsDynamic() {
        return Optional.ofNullable(this.mappingsDynamic);
    }

    /**
     * attribute is required when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     * 
     */
    @Import(name="mappingsFields")
    private @Nullable Output<String> mappingsFields;

    /**
     * @return attribute is required when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
     * 
     */
    public Optional<Output<String>> mappingsFields() {
        return Optional.ofNullable(this.mappingsFields);
    }

    /**
     * The name of the search index you want to create.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the search index you want to create.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the organization or project you want to create the search index within.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The ID of the organization or project you want to create the search index within.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    @Import(name="searchAnalyzer")
    private @Nullable Output<String> searchAnalyzer;

    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
     * 
     */
    public Optional<Output<String>> searchAnalyzer() {
        return Optional.ofNullable(this.searchAnalyzer);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Synonyms mapping definition to use in this index.
     * 
     */
    @Import(name="synonyms")
    private @Nullable Output<List<SearchIndexSynonymArgs>> synonyms;

    /**
     * @return Synonyms mapping definition to use in this index.
     * 
     */
    public Optional<Output<List<SearchIndexSynonymArgs>>> synonyms() {
        return Optional.ofNullable(this.synonyms);
    }

    @Import(name="waitForIndexBuildCompletion")
    private @Nullable Output<Boolean> waitForIndexBuildCompletion;

    public Optional<Output<Boolean>> waitForIndexBuildCompletion() {
        return Optional.ofNullable(this.waitForIndexBuildCompletion);
    }

    private SearchIndexArgs() {}

    private SearchIndexArgs(SearchIndexArgs $) {
        this.analyzer = $.analyzer;
        this.analyzers = $.analyzers;
        this.clusterName = $.clusterName;
        this.collectionName = $.collectionName;
        this.database = $.database;
        this.mappingsDynamic = $.mappingsDynamic;
        this.mappingsFields = $.mappingsFields;
        this.name = $.name;
        this.projectId = $.projectId;
        this.searchAnalyzer = $.searchAnalyzer;
        this.status = $.status;
        this.synonyms = $.synonyms;
        this.waitForIndexBuildCompletion = $.waitForIndexBuildCompletion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchIndexArgs $;

        public Builder() {
            $ = new SearchIndexArgs();
        }

        public Builder(SearchIndexArgs defaults) {
            $ = new SearchIndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
         * 
         * @return builder
         * 
         */
        public Builder analyzer(@Nullable Output<String> analyzer) {
            $.analyzer = analyzer;
            return this;
        }

        /**
         * @param analyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
         * 
         * @return builder
         * 
         */
        public Builder analyzer(String analyzer) {
            return analyzer(Output.of(analyzer));
        }

        /**
         * @param analyzers [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
         * 
         * @return builder
         * 
         */
        public Builder analyzers(@Nullable Output<String> analyzers) {
            $.analyzers = analyzers;
            return this;
        }

        /**
         * @param analyzers [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
         * 
         * @return builder
         * 
         */
        public Builder analyzers(String analyzers) {
            return analyzers(Output.of(analyzers));
        }

        /**
         * @param clusterName The name of the cluster where you want to create the search index within.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster where you want to create the search index within.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param collectionName Name of the collection the index is on.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(Output<String> collectionName) {
            $.collectionName = collectionName;
            return this;
        }

        /**
         * @param collectionName Name of the collection the index is on.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(String collectionName) {
            return collectionName(Output.of(collectionName));
        }

        /**
         * @param database Name of the database the collection is in.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Name of the database the collection is in.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param mappingsDynamic Indicates whether the index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
         * 
         * @return builder
         * 
         */
        public Builder mappingsDynamic(@Nullable Output<Boolean> mappingsDynamic) {
            $.mappingsDynamic = mappingsDynamic;
            return this;
        }

        /**
         * @param mappingsDynamic Indicates whether the index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappings_fields`
         * 
         * @return builder
         * 
         */
        public Builder mappingsDynamic(Boolean mappingsDynamic) {
            return mappingsDynamic(Output.of(mappingsDynamic));
        }

        /**
         * @param mappingsFields attribute is required when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
         * 
         * @return builder
         * 
         */
        public Builder mappingsFields(@Nullable Output<String> mappingsFields) {
            $.mappingsFields = mappingsFields;
            return this;
        }

        /**
         * @param mappingsFields attribute is required when `mappings_dynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
         * 
         * @return builder
         * 
         */
        public Builder mappingsFields(String mappingsFields) {
            return mappingsFields(Output.of(mappingsFields));
        }

        /**
         * @param name The name of the search index you want to create.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the search index you want to create.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The ID of the organization or project you want to create the search index within.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the organization or project you want to create the search index within.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param searchAnalyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
         * 
         * @return builder
         * 
         */
        public Builder searchAnalyzer(@Nullable Output<String> searchAnalyzer) {
            $.searchAnalyzer = searchAnalyzer;
            return this;
        }

        /**
         * @param searchAnalyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
         * 
         * @return builder
         * 
         */
        public Builder searchAnalyzer(String searchAnalyzer) {
            return searchAnalyzer(Output.of(searchAnalyzer));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param synonyms Synonyms mapping definition to use in this index.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(@Nullable Output<List<SearchIndexSynonymArgs>> synonyms) {
            $.synonyms = synonyms;
            return this;
        }

        /**
         * @param synonyms Synonyms mapping definition to use in this index.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(List<SearchIndexSynonymArgs> synonyms) {
            return synonyms(Output.of(synonyms));
        }

        /**
         * @param synonyms Synonyms mapping definition to use in this index.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(SearchIndexSynonymArgs... synonyms) {
            return synonyms(List.of(synonyms));
        }

        public Builder waitForIndexBuildCompletion(@Nullable Output<Boolean> waitForIndexBuildCompletion) {
            $.waitForIndexBuildCompletion = waitForIndexBuildCompletion;
            return this;
        }

        public Builder waitForIndexBuildCompletion(Boolean waitForIndexBuildCompletion) {
            return waitForIndexBuildCompletion(Output.of(waitForIndexBuildCompletion));
        }

        public SearchIndexArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.collectionName = Objects.requireNonNull($.collectionName, "expected parameter 'collectionName' to be non-null");
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
