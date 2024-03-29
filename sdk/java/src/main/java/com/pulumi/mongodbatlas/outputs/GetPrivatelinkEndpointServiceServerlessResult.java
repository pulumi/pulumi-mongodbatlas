// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivatelinkEndpointServiceServerlessResult {
    private String cloudProviderEndpointId;
    private String comment;
    private String endpointId;
    /**
     * @return Unique string that identifies the PrivateLink endpoint service. MongoDB Cloud returns null while it creates the endpoint service.
     * 
     */
    private String endpointServiceName;
    private String errorMessage;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceName;
    /**
     * @return IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
     * 
     */
    private String privateEndpointIpAddress;
    /**
     * @return Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    private String privateLinkServiceResourceId;
    private String projectId;
    /**
     * @return Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    private String status;

    private GetPrivatelinkEndpointServiceServerlessResult() {}
    public String cloudProviderEndpointId() {
        return this.cloudProviderEndpointId;
    }
    public String comment() {
        return this.comment;
    }
    public String endpointId() {
        return this.endpointId;
    }
    /**
     * @return Unique string that identifies the PrivateLink endpoint service. MongoDB Cloud returns null while it creates the endpoint service.
     * 
     */
    public String endpointServiceName() {
        return this.endpointServiceName;
    }
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
     * 
     */
    public String privateEndpointIpAddress() {
        return this.privateEndpointIpAddress;
    }
    /**
     * @return Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    public String privateLinkServiceResourceId() {
        return this.privateLinkServiceResourceId;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivatelinkEndpointServiceServerlessResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProviderEndpointId;
        private String comment;
        private String endpointId;
        private String endpointServiceName;
        private String errorMessage;
        private String id;
        private String instanceName;
        private String privateEndpointIpAddress;
        private String privateLinkServiceResourceId;
        private String projectId;
        private String status;
        public Builder() {}
        public Builder(GetPrivatelinkEndpointServiceServerlessResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProviderEndpointId = defaults.cloudProviderEndpointId;
    	      this.comment = defaults.comment;
    	      this.endpointId = defaults.endpointId;
    	      this.endpointServiceName = defaults.endpointServiceName;
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.privateEndpointIpAddress = defaults.privateEndpointIpAddress;
    	      this.privateLinkServiceResourceId = defaults.privateLinkServiceResourceId;
    	      this.projectId = defaults.projectId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder cloudProviderEndpointId(String cloudProviderEndpointId) {
            if (cloudProviderEndpointId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "cloudProviderEndpointId");
            }
            this.cloudProviderEndpointId = cloudProviderEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            if (endpointId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "endpointId");
            }
            this.endpointId = endpointId;
            return this;
        }
        @CustomType.Setter
        public Builder endpointServiceName(String endpointServiceName) {
            if (endpointServiceName == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "endpointServiceName");
            }
            this.endpointServiceName = endpointServiceName;
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            if (errorMessage == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "errorMessage");
            }
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            if (privateEndpointIpAddress == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "privateEndpointIpAddress");
            }
            this.privateEndpointIpAddress = privateEndpointIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkServiceResourceId(String privateLinkServiceResourceId) {
            if (privateLinkServiceResourceId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "privateLinkServiceResourceId");
            }
            this.privateLinkServiceResourceId = privateLinkServiceResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceServerlessResult", "status");
            }
            this.status = status;
            return this;
        }
        public GetPrivatelinkEndpointServiceServerlessResult build() {
            final var _resultValue = new GetPrivatelinkEndpointServiceServerlessResult();
            _resultValue.cloudProviderEndpointId = cloudProviderEndpointId;
            _resultValue.comment = comment;
            _resultValue.endpointId = endpointId;
            _resultValue.endpointServiceName = endpointServiceName;
            _resultValue.errorMessage = errorMessage;
            _resultValue.id = id;
            _resultValue.instanceName = instanceName;
            _resultValue.privateEndpointIpAddress = privateEndpointIpAddress;
            _resultValue.privateLinkServiceResourceId = privateLinkServiceResourceId;
            _resultValue.projectId = projectId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
