// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetPrivateLinkEndpointServiceEndpoint;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkEndpointServiceResult {
    /**
     * @return Status of the interface endpoint for AWS.
     * Returns one of the following values:
     * 
     */
    private String awsConnectionStatus;
    /**
     * @return Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * 
     */
    private String azureStatus;
    /**
     * @return Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     * 
     */
    private Boolean deleteRequested;
    private String endpointServiceId;
    /**
     * @return Collection of individual private endpoints that comprise your network endpoint group.
     * 
     */
    private List<GetPrivateLinkEndpointServiceEndpoint> endpoints;
    /**
     * @return Error message pertaining to the interface endpoint. Returns null if there are no errors.
     * 
     */
    private String errorMessage;
    /**
     * @return Status of the interface endpoint for GCP.
     * Returns one of the following values:
     * 
     */
    private String gcpStatus;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the interface endpoint.
     * 
     */
    private String interfaceEndpointId;
    /**
     * @return Name of the connection for this private endpoint that Atlas generates.
     * 
     */
    private String privateEndpointConnectionName;
    /**
     * @return Private IP address of the private endpoint network interface.
     * 
     */
    private String privateEndpointIpAddress;
    /**
     * @return Unique identifier of the private endpoint.
     * 
     */
    private String privateEndpointResourceId;
    private String privateLinkId;
    private String projectId;
    private String providerName;

    private GetPrivateLinkEndpointServiceResult() {}
    /**
     * @return Status of the interface endpoint for AWS.
     * Returns one of the following values:
     * 
     */
    public String awsConnectionStatus() {
        return this.awsConnectionStatus;
    }
    /**
     * @return Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * 
     */
    public String azureStatus() {
        return this.azureStatus;
    }
    /**
     * @return Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     * 
     */
    public Boolean deleteRequested() {
        return this.deleteRequested;
    }
    public String endpointServiceId() {
        return this.endpointServiceId;
    }
    /**
     * @return Collection of individual private endpoints that comprise your network endpoint group.
     * 
     */
    public List<GetPrivateLinkEndpointServiceEndpoint> endpoints() {
        return this.endpoints;
    }
    /**
     * @return Error message pertaining to the interface endpoint. Returns null if there are no errors.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return Status of the interface endpoint for GCP.
     * Returns one of the following values:
     * 
     */
    public String gcpStatus() {
        return this.gcpStatus;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the interface endpoint.
     * 
     */
    public String interfaceEndpointId() {
        return this.interfaceEndpointId;
    }
    /**
     * @return Name of the connection for this private endpoint that Atlas generates.
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }
    /**
     * @return Private IP address of the private endpoint network interface.
     * 
     */
    public String privateEndpointIpAddress() {
        return this.privateEndpointIpAddress;
    }
    /**
     * @return Unique identifier of the private endpoint.
     * 
     */
    public String privateEndpointResourceId() {
        return this.privateEndpointResourceId;
    }
    public String privateLinkId() {
        return this.privateLinkId;
    }
    public String projectId() {
        return this.projectId;
    }
    public String providerName() {
        return this.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkEndpointServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String awsConnectionStatus;
        private String azureStatus;
        private Boolean deleteRequested;
        private String endpointServiceId;
        private List<GetPrivateLinkEndpointServiceEndpoint> endpoints;
        private String errorMessage;
        private String gcpStatus;
        private String id;
        private String interfaceEndpointId;
        private String privateEndpointConnectionName;
        private String privateEndpointIpAddress;
        private String privateEndpointResourceId;
        private String privateLinkId;
        private String projectId;
        private String providerName;
        public Builder() {}
        public Builder(GetPrivateLinkEndpointServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsConnectionStatus = defaults.awsConnectionStatus;
    	      this.azureStatus = defaults.azureStatus;
    	      this.deleteRequested = defaults.deleteRequested;
    	      this.endpointServiceId = defaults.endpointServiceId;
    	      this.endpoints = defaults.endpoints;
    	      this.errorMessage = defaults.errorMessage;
    	      this.gcpStatus = defaults.gcpStatus;
    	      this.id = defaults.id;
    	      this.interfaceEndpointId = defaults.interfaceEndpointId;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateEndpointIpAddress = defaults.privateEndpointIpAddress;
    	      this.privateEndpointResourceId = defaults.privateEndpointResourceId;
    	      this.privateLinkId = defaults.privateLinkId;
    	      this.projectId = defaults.projectId;
    	      this.providerName = defaults.providerName;
        }

        @CustomType.Setter
        public Builder awsConnectionStatus(String awsConnectionStatus) {
            if (awsConnectionStatus == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "awsConnectionStatus");
            }
            this.awsConnectionStatus = awsConnectionStatus;
            return this;
        }
        @CustomType.Setter
        public Builder azureStatus(String azureStatus) {
            if (azureStatus == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "azureStatus");
            }
            this.azureStatus = azureStatus;
            return this;
        }
        @CustomType.Setter
        public Builder deleteRequested(Boolean deleteRequested) {
            if (deleteRequested == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "deleteRequested");
            }
            this.deleteRequested = deleteRequested;
            return this;
        }
        @CustomType.Setter
        public Builder endpointServiceId(String endpointServiceId) {
            if (endpointServiceId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "endpointServiceId");
            }
            this.endpointServiceId = endpointServiceId;
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(List<GetPrivateLinkEndpointServiceEndpoint> endpoints) {
            if (endpoints == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "endpoints");
            }
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(GetPrivateLinkEndpointServiceEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            if (errorMessage == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "errorMessage");
            }
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder gcpStatus(String gcpStatus) {
            if (gcpStatus == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "gcpStatus");
            }
            this.gcpStatus = gcpStatus;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceEndpointId(String interfaceEndpointId) {
            if (interfaceEndpointId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "interfaceEndpointId");
            }
            this.interfaceEndpointId = interfaceEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            if (privateEndpointConnectionName == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "privateEndpointConnectionName");
            }
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            if (privateEndpointIpAddress == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "privateEndpointIpAddress");
            }
            this.privateEndpointIpAddress = privateEndpointIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointResourceId(String privateEndpointResourceId) {
            if (privateEndpointResourceId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "privateEndpointResourceId");
            }
            this.privateEndpointResourceId = privateEndpointResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkId(String privateLinkId) {
            if (privateLinkId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "privateLinkId");
            }
            this.privateLinkId = privateLinkId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            if (providerName == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkEndpointServiceResult", "providerName");
            }
            this.providerName = providerName;
            return this;
        }
        public GetPrivateLinkEndpointServiceResult build() {
            final var _resultValue = new GetPrivateLinkEndpointServiceResult();
            _resultValue.awsConnectionStatus = awsConnectionStatus;
            _resultValue.azureStatus = azureStatus;
            _resultValue.deleteRequested = deleteRequested;
            _resultValue.endpointServiceId = endpointServiceId;
            _resultValue.endpoints = endpoints;
            _resultValue.errorMessage = errorMessage;
            _resultValue.gcpStatus = gcpStatus;
            _resultValue.id = id;
            _resultValue.interfaceEndpointId = interfaceEndpointId;
            _resultValue.privateEndpointConnectionName = privateEndpointConnectionName;
            _resultValue.privateEndpointIpAddress = privateEndpointIpAddress;
            _resultValue.privateEndpointResourceId = privateEndpointResourceId;
            _resultValue.privateLinkId = privateLinkId;
            _resultValue.projectId = projectId;
            _resultValue.providerName = providerName;
            return _resultValue;
        }
    }
}
