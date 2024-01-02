// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSearchIndexesResultSynonym {
    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     * 
     */
    private String analyzer;
    /**
     * @return Name of the index.
     * 
     */
    private String name;
    private String sourceCollection;

    private GetSearchIndexesResultSynonym() {}
    /**
     * @return [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
     * 
     */
    public String analyzer() {
        return this.analyzer;
    }
    /**
     * @return Name of the index.
     * 
     */
    public String name() {
        return this.name;
    }
    public String sourceCollection() {
        return this.sourceCollection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchIndexesResultSynonym defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String analyzer;
        private String name;
        private String sourceCollection;
        public Builder() {}
        public Builder(GetSearchIndexesResultSynonym defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzer = defaults.analyzer;
    	      this.name = defaults.name;
    	      this.sourceCollection = defaults.sourceCollection;
        }

        @CustomType.Setter
        public Builder analyzer(String analyzer) {
            if (analyzer == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesResultSynonym", "analyzer");
            }
            this.analyzer = analyzer;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesResultSynonym", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sourceCollection(String sourceCollection) {
            if (sourceCollection == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesResultSynonym", "sourceCollection");
            }
            this.sourceCollection = sourceCollection;
            return this;
        }
        public GetSearchIndexesResultSynonym build() {
            final var _resultValue = new GetSearchIndexesResultSynonym();
            _resultValue.analyzer = analyzer;
            _resultValue.name = name;
            _resultValue.sourceCollection = sourceCollection;
            return _resultValue;
        }
    }
}
