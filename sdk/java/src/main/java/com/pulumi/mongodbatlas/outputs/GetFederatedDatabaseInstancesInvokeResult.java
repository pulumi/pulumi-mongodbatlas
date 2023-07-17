// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstancesResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstancesInvokeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String projectId;
    /**
     * @return Includes Federated Database instance for each item detailed in the results array section.
     * 
     */
    private List<GetFederatedDatabaseInstancesResult> results;

    private GetFederatedDatabaseInstancesInvokeResult() {}
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
     * @return Includes Federated Database instance for each item detailed in the results array section.
     * 
     */
    public List<GetFederatedDatabaseInstancesResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstancesInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String projectId;
        private List<GetFederatedDatabaseInstancesResult> results;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstancesInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetFederatedDatabaseInstancesResult> results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }
        public Builder results(GetFederatedDatabaseInstancesResult... results) {
            return results(List.of(results));
        }
        public GetFederatedDatabaseInstancesInvokeResult build() {
            final var o = new GetFederatedDatabaseInstancesInvokeResult();
            o.id = id;
            o.projectId = projectId;
            o.results = results;
            return o;
        }
    }
}