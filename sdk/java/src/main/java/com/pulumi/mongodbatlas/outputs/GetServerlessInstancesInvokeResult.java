// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetServerlessInstancesResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerlessInstancesInvokeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String projectId;
    /**
     * @return A list where each result represents a Serverless Instance. To learn more, see Serverless Instance.
     * 
     */
    private List<GetServerlessInstancesResult> results;

    private GetServerlessInstancesInvokeResult() {}
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
     * @return A list where each result represents a Serverless Instance. To learn more, see Serverless Instance.
     * 
     */
    public List<GetServerlessInstancesResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerlessInstancesInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String projectId;
        private List<GetServerlessInstancesResult> results;
        public Builder() {}
        public Builder(GetServerlessInstancesInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerlessInstancesInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetServerlessInstancesInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetServerlessInstancesResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetServerlessInstancesInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetServerlessInstancesResult... results) {
            return results(List.of(results));
        }
        public GetServerlessInstancesInvokeResult build() {
            final var _resultValue = new GetServerlessInstancesInvokeResult();
            _resultValue.id = id;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
