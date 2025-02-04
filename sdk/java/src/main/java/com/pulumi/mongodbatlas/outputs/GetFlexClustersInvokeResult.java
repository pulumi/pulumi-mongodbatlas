// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetFlexClustersResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFlexClustersInvokeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique 24-hexadecimal character string that identifies the project.
     * 
     */
    private String projectId;
    /**
     * @return List of documents that MongoDB Cloud returns for this request.
     * 
     */
    private List<GetFlexClustersResult> results;

    private GetFlexClustersInvokeResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return List of documents that MongoDB Cloud returns for this request.
     * 
     */
    public List<GetFlexClustersResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlexClustersInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String projectId;
        private List<GetFlexClustersResult> results;
        public Builder() {}
        public Builder(GetFlexClustersInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlexClustersInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetFlexClustersInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetFlexClustersResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetFlexClustersInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetFlexClustersResult... results) {
            return results(List.of(results));
        }
        public GetFlexClustersInvokeResult build() {
            final var _resultValue = new GetFlexClustersInvokeResult();
            _resultValue.id = id;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
