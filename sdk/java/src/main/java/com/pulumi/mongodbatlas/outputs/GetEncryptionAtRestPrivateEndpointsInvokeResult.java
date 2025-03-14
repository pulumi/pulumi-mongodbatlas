// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetEncryptionAtRestPrivateEndpointsResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEncryptionAtRestPrivateEndpointsInvokeResult {
    /**
     * @return Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     * 
     */
    private String cloudProvider;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    private String projectId;
    /**
     * @return List of documents that MongoDB Cloud returns for this request.
     * 
     */
    private List<GetEncryptionAtRestPrivateEndpointsResult> results;

    private GetEncryptionAtRestPrivateEndpointsInvokeResult() {}
    /**
     * @return Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return List of documents that MongoDB Cloud returns for this request.
     * 
     */
    public List<GetEncryptionAtRestPrivateEndpointsResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionAtRestPrivateEndpointsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String id;
        private String projectId;
        private List<GetEncryptionAtRestPrivateEndpointsResult> results;
        public Builder() {}
        public Builder(GetEncryptionAtRestPrivateEndpointsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            if (cloudProvider == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsInvokeResult", "cloudProvider");
            }
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetEncryptionAtRestPrivateEndpointsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetEncryptionAtRestPrivateEndpointsResult... results) {
            return results(List.of(results));
        }
        public GetEncryptionAtRestPrivateEndpointsInvokeResult build() {
            final var _resultValue = new GetEncryptionAtRestPrivateEndpointsInvokeResult();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.id = id;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
