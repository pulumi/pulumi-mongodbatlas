// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetSearchIndexesResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSearchIndexesInvokeResult {
    private String clusterName;
    /**
     * @return (Required) Name of the collection the index is on.
     * 
     */
    private String collectionName;
    /**
     * @return (Required) Name of the database the collection is in.
     * 
     */
    private String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String projectId;
    /**
     * @return A list where each represents a search index.
     * 
     */
    private List<GetSearchIndexesResult> results;
    /**
     * @return Represents the total of the search indexes
     * 
     */
    private Integer totalCount;

    private GetSearchIndexesInvokeResult() {}
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return (Required) Name of the collection the index is on.
     * 
     */
    public String collectionName() {
        return this.collectionName;
    }
    /**
     * @return (Required) Name of the database the collection is in.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return A list where each represents a search index.
     * 
     */
    public List<GetSearchIndexesResult> results() {
        return this.results;
    }
    /**
     * @return Represents the total of the search indexes
     * 
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchIndexesInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterName;
        private String collectionName;
        private String database;
        private String id;
        private String projectId;
        private List<GetSearchIndexesResult> results;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetSearchIndexesInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.collectionName = defaults.collectionName;
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder collectionName(String collectionName) {
            if (collectionName == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "collectionName");
            }
            this.collectionName = collectionName;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetSearchIndexesResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetSearchIndexesResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            if (totalCount == null) {
              throw new MissingRequiredPropertyException("GetSearchIndexesInvokeResult", "totalCount");
            }
            this.totalCount = totalCount;
            return this;
        }
        public GetSearchIndexesInvokeResult build() {
            final var _resultValue = new GetSearchIndexesInvokeResult();
            _resultValue.clusterName = clusterName;
            _resultValue.collectionName = collectionName;
            _resultValue.database = database;
            _resultValue.id = id;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            _resultValue.totalCount = totalCount;
            return _resultValue;
        }
    }
}
