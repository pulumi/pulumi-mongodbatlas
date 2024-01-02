// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersInvokeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String projectId;
    /**
     * @return A list where each represents a Cluster. See below for more details.
     * 
     */
    private List<GetAdvancedClustersResult> results;

    private GetAdvancedClustersInvokeResult() {}
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
     * @return A list where each represents a Cluster. See below for more details.
     * 
     */
    public List<GetAdvancedClustersResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String projectId;
        private List<GetAdvancedClustersResult> results;
        public Builder() {}
        public Builder(GetAdvancedClustersInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetAdvancedClustersResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetAdvancedClustersResult... results) {
            return results(List.of(results));
        }
        public GetAdvancedClustersInvokeResult build() {
            final var _resultValue = new GetAdvancedClustersInvokeResult();
            _resultValue.id = id;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
