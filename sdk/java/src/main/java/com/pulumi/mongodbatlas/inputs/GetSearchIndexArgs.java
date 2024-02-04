// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSearchIndexArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSearchIndexArgs Empty = new GetSearchIndexArgs();

    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     * 
     */
    @Import(name="analyzer")
    private @Nullable Output<String> analyzer;

    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     * 
     */
    public Optional<Output<String>> analyzer() {
        return Optional.ofNullable(this.analyzer);
    }

    /**
     * [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     * 
     */
    @Import(name="analyzers")
    private @Nullable Output<String> analyzers;

    /**
     * @return [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     * 
     */
    public Optional<Output<String>> analyzers() {
        return Optional.ofNullable(this.analyzers);
    }

    /**
     * The name of the cluster containing the collection with one or more Atlas Search indexes.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster containing the collection with one or more Atlas Search indexes.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Name of the collection the index is on.
     * 
     */
    @Import(name="collectionName")
    private @Nullable Output<String> collectionName;

    /**
     * @return Name of the collection the index is on.
     * 
     */
    public Optional<Output<String>> collectionName() {
        return Optional.ofNullable(this.collectionName);
    }

    /**
     * Name of the database the collection is in.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Name of the database the collection is in.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    @Import(name="fields")
    private @Nullable Output<String> fields;

    public Optional<Output<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
     * 
     */
    @Import(name="indexId", required=true)
    private Output<String> indexId;

    /**
     * @return The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }

    /**
     * Flag indicating whether the index uses dynamic or static mappings.
     * 
     */
    @Import(name="mappingsDynamic")
    private @Nullable Output<Boolean> mappingsDynamic;

    /**
     * @return Flag indicating whether the index uses dynamic or static mappings.
     * 
     */
    public Optional<Output<Boolean>> mappingsDynamic() {
        return Optional.ofNullable(this.mappingsDynamic);
    }

    /**
     * Object containing one or more field specifications.
     * 
     */
    @Import(name="mappingsFields")
    private @Nullable Output<String> mappingsFields;

    /**
     * @return Object containing one or more field specifications.
     * 
     */
    public Optional<Output<String>> mappingsFields() {
        return Optional.ofNullable(this.mappingsFields);
    }

    /**
     * Name of the index.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the index.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     * 
     */
    @Import(name="searchAnalyzer")
    private @Nullable Output<String> searchAnalyzer;

    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     * 
     */
    public Optional<Output<String>> searchAnalyzer() {
        return Optional.ofNullable(this.searchAnalyzer);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GetSearchIndexArgs() {}

    private GetSearchIndexArgs(GetSearchIndexArgs $) {
        this.analyzer = $.analyzer;
        this.analyzers = $.analyzers;
        this.clusterName = $.clusterName;
        this.collectionName = $.collectionName;
        this.database = $.database;
        this.fields = $.fields;
        this.indexId = $.indexId;
        this.mappingsDynamic = $.mappingsDynamic;
        this.mappingsFields = $.mappingsFields;
        this.name = $.name;
        this.projectId = $.projectId;
        this.searchAnalyzer = $.searchAnalyzer;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSearchIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSearchIndexArgs $;

        public Builder() {
            $ = new GetSearchIndexArgs();
        }

        public Builder(GetSearchIndexArgs defaults) {
            $ = new GetSearchIndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
         * 
         * @return builder
         * 
         */
        public Builder analyzer(@Nullable Output<String> analyzer) {
            $.analyzer = analyzer;
            return this;
        }

        /**
         * @param analyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
         * 
         * @return builder
         * 
         */
        public Builder analyzer(String analyzer) {
            return analyzer(Output.of(analyzer));
        }

        /**
         * @param analyzers [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
         * 
         * @return builder
         * 
         */
        public Builder analyzers(@Nullable Output<String> analyzers) {
            $.analyzers = analyzers;
            return this;
        }

        /**
         * @param analyzers [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
         * 
         * @return builder
         * 
         */
        public Builder analyzers(String analyzers) {
            return analyzers(Output.of(analyzers));
        }

        /**
         * @param clusterName The name of the cluster containing the collection with one or more Atlas Search indexes.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster containing the collection with one or more Atlas Search indexes.
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
        public Builder collectionName(@Nullable Output<String> collectionName) {
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
        public Builder database(@Nullable Output<String> database) {
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

        public Builder fields(@Nullable Output<String> fields) {
            $.fields = fields;
            return this;
        }

        public Builder fields(String fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param indexId The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
         * 
         * @return builder
         * 
         */
        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        /**
         * @param indexId The unique identifier of the Atlas Search index. Use the `mongodbatlas.getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        /**
         * @param mappingsDynamic Flag indicating whether the index uses dynamic or static mappings.
         * 
         * @return builder
         * 
         */
        public Builder mappingsDynamic(@Nullable Output<Boolean> mappingsDynamic) {
            $.mappingsDynamic = mappingsDynamic;
            return this;
        }

        /**
         * @param mappingsDynamic Flag indicating whether the index uses dynamic or static mappings.
         * 
         * @return builder
         * 
         */
        public Builder mappingsDynamic(Boolean mappingsDynamic) {
            return mappingsDynamic(Output.of(mappingsDynamic));
        }

        /**
         * @param mappingsFields Object containing one or more field specifications.
         * 
         * @return builder
         * 
         */
        public Builder mappingsFields(@Nullable Output<String> mappingsFields) {
            $.mappingsFields = mappingsFields;
            return this;
        }

        /**
         * @param mappingsFields Object containing one or more field specifications.
         * 
         * @return builder
         * 
         */
        public Builder mappingsFields(String mappingsFields) {
            return mappingsFields(Output.of(mappingsFields));
        }

        /**
         * @param name Name of the index.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the index.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param searchAnalyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
         * 
         * @return builder
         * 
         */
        public Builder searchAnalyzer(@Nullable Output<String> searchAnalyzer) {
            $.searchAnalyzer = searchAnalyzer;
            return this;
        }

        /**
         * @param searchAnalyzer [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
         * 
         * @return builder
         * 
         */
        public Builder searchAnalyzer(String searchAnalyzer) {
            return searchAnalyzer(Output.of(searchAnalyzer));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetSearchIndexArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetSearchIndexArgs", "clusterName");
            }
            if ($.indexId == null) {
                throw new MissingRequiredPropertyException("GetSearchIndexArgs", "indexId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetSearchIndexArgs", "projectId");
            }
            return $;
        }
    }

}
