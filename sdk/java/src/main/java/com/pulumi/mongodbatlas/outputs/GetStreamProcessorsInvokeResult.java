// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetStreamProcessorsResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStreamProcessorsInvokeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    private String instanceName;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    private String projectId;
    private List<GetStreamProcessorsResult> results;

    private GetStreamProcessorsInvokeResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public List<GetStreamProcessorsResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamProcessorsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceName;
        private String projectId;
        private List<GetStreamProcessorsResult> results;
        public Builder() {}
        public Builder(GetStreamProcessorsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsInvokeResult", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetStreamProcessorsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetStreamProcessorsResult... results) {
            return results(List.of(results));
        }
        public GetStreamProcessorsInvokeResult build() {
            final var _resultValue = new GetStreamProcessorsInvokeResult();
            _resultValue.id = id;
            _resultValue.instanceName = instanceName;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}