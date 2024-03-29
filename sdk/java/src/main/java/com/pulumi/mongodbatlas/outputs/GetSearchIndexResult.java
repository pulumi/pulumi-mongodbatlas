// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetSearchIndexSynonym;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSearchIndexResult {
    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     * 
     */
    private @Nullable String analyzer;
    /**
     * @return [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     * 
     */
    private @Nullable String analyzers;
    private String clusterName;
    /**
     * @return Name of the collection the index is on.
     * 
     */
    private @Nullable String collectionName;
    /**
     * @return Name of the database the collection is in.
     * 
     */
    private @Nullable String database;
    private @Nullable String fields;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String indexId;
    /**
     * @return Flag indicating whether the index uses dynamic or static mappings.
     * 
     */
    private @Nullable Boolean mappingsDynamic;
    /**
     * @return Object containing one or more field specifications.
     * 
     */
    private @Nullable String mappingsFields;
    /**
     * @return Name of the index.
     * 
     */
    private @Nullable String name;
    private String projectId;
    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     * 
     */
    private @Nullable String searchAnalyzer;
    /**
     * @return Current status of the index.
     * 
     */
    private String status;
    /**
     * @return Synonyms mapping definition to use in this index.
     * * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
     * * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
     * * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
     * 
     */
    private List<GetSearchIndexSynonym> synonyms;
    private @Nullable String type;

    private GetSearchIndexResult() {}
    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     * 
     */
    public Optional<String> analyzer() {
        return Optional.ofNullable(this.analyzer);
    }
    /**
     * @return [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
     * 
     */
    public Optional<String> analyzers() {
        return Optional.ofNullable(this.analyzers);
    }
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return Name of the collection the index is on.
     * 
     */
    public Optional<String> collectionName() {
        return Optional.ofNullable(this.collectionName);
    }
    /**
     * @return Name of the database the collection is in.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    public Optional<String> fields() {
        return Optional.ofNullable(this.fields);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String indexId() {
        return this.indexId;
    }
    /**
     * @return Flag indicating whether the index uses dynamic or static mappings.
     * 
     */
    public Optional<Boolean> mappingsDynamic() {
        return Optional.ofNullable(this.mappingsDynamic);
    }
    /**
     * @return Object containing one or more field specifications.
     * 
     */
    public Optional<String> mappingsFields() {
        return Optional.ofNullable(this.mappingsFields);
    }
    /**
     * @return Name of the index.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
     * 
     */
    public Optional<String> searchAnalyzer() {
        return Optional.ofNullable(this.searchAnalyzer);
    }
    /**
     * @return Current status of the index.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Synonyms mapping definition to use in this index.
     * * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
     * * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
     * * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
     * 
     */
    public List<GetSearchIndexSynonym> synonyms() {
        return this.synonyms;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchIndexResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String analyzer;
        private @Nullable String analyzers;
        private String clusterName;
        private @Nullable String collectionName;
        private @Nullable String database;
        private @Nullable String fields;
        private String id;
        private String indexId;
        private @Nullable Boolean mappingsDynamic;
        private @Nullable String mappingsFields;
        private @Nullable String name;
        private String projectId;
        private @Nullable String searchAnalyzer;
        private String status;
        private List<GetSearchIndexSynonym> synonyms;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetSearchIndexResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzer = defaults.analyzer;
    	      this.analyzers = defaults.analyzers;
    	      this.clusterName = defaults.clusterName;
    	      this.collectionName = defaults.collectionName;
    	      this.database = defaults.database;
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
    	      this.mappingsDynamic = defaults.mappingsDynamic;
    	      this.mappingsFields = defaults.mappingsFields;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.searchAnalyzer = defaults.searchAnalyzer;
    	      this.status = defaults.status;
    	      this.synonyms = defaults.synonyms;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder analyzer(@Nullable String analyzer) {

            this.analyzer = analyzer;
            return this;
        }
        @CustomType.Setter
        public Builder analyzers(@Nullable String analyzers) {

            this.analyzers = analyzers;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder collectionName(@Nullable String collectionName) {

            this.collectionName = collectionName;
            return this;
        }
        @CustomType.Setter
        public Builder database(@Nullable String database) {

            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder fields(@Nullable String fields) {

            this.fields = fields;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder indexId(String indexId) {
            if (indexId == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexResult", "indexId");
            }
            this.indexId = indexId;
            return this;
        }
        @CustomType.Setter
        public Builder mappingsDynamic(@Nullable Boolean mappingsDynamic) {

            this.mappingsDynamic = mappingsDynamic;
            return this;
        }
        @CustomType.Setter
        public Builder mappingsFields(@Nullable String mappingsFields) {

            this.mappingsFields = mappingsFields;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder searchAnalyzer(@Nullable String searchAnalyzer) {

            this.searchAnalyzer = searchAnalyzer;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder synonyms(List<GetSearchIndexSynonym> synonyms) {
            if (synonyms == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexResult", "synonyms");
            }
            this.synonyms = synonyms;
            return this;
        }
        public Builder synonyms(GetSearchIndexSynonym... synonyms) {
            return synonyms(List.of(synonyms));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetSearchIndexResult build() {
            final var _resultValue = new GetSearchIndexResult();
            _resultValue.analyzer = analyzer;
            _resultValue.analyzers = analyzers;
            _resultValue.clusterName = clusterName;
            _resultValue.collectionName = collectionName;
            _resultValue.database = database;
            _resultValue.fields = fields;
            _resultValue.id = id;
            _resultValue.indexId = indexId;
            _resultValue.mappingsDynamic = mappingsDynamic;
            _resultValue.mappingsFields = mappingsFields;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.searchAnalyzer = searchAnalyzer;
            _resultValue.status = status;
            _resultValue.synonyms = synonyms;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
