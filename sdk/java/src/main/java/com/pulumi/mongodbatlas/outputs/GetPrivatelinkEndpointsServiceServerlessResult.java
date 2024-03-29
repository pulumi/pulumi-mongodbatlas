// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivatelinkEndpointsServiceServerlessResult {
    /**
     * @return Unique string that identifies the private endpoint&#39;s network interface.
     * 
     */
    private String cloudProviderEndpointId;
    /**
     * @return Human-readable string to associate with this private endpoint.
     * 
     */
    private String comment;
    /**
     * @return (Required) Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [AWS PrivateLink](https://aws.amazon.com/privatelink/) feature.
     * 
     */
    private String endpointId;
    /**
     * @return Unique string that identifies the PrivateLink endpoint service. MongoDB Cloud returns null while it creates the endpoint service.
     * 
     */
    private String endpointServiceName;
    private String errorMessage;
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
    /**
     * @return Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    private String status;

    private GetPrivatelinkEndpointsServiceServerlessResult() {}
    /**
     * @return Unique string that identifies the private endpoint&#39;s network interface.
     * 
     */
    public String cloudProviderEndpointId() {
        return this.cloudProviderEndpointId;
    }
    /**
     * @return Human-readable string to associate with this private endpoint.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return (Required) Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [AWS PrivateLink](https://aws.amazon.com/privatelink/) feature.
     * 
     */
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

    public static Builder builder(GetPrivatelinkEndpointsServiceServerlessResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProviderEndpointId;
        private String comment;
        private String endpointId;
        private String endpointServiceName;
        private String errorMessage;
        private String privateEndpointIpAddress;
        private String privateLinkServiceResourceId;
        private String status;
        public Builder() {}
        public Builder(GetPrivatelinkEndpointsServiceServerlessResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProviderEndpointId = defaults.cloudProviderEndpointId;
    	      this.comment = defaults.comment;
    	      this.endpointId = defaults.endpointId;
    	      this.endpointServiceName = defaults.endpointServiceName;
    	      this.errorMessage = defaults.errorMessage;
    	      this.privateEndpointIpAddress = defaults.privateEndpointIpAddress;
    	      this.privateLinkServiceResourceId = defaults.privateLinkServiceResourceId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder cloudProviderEndpointId(String cloudProviderEndpointId) {
            if (cloudProviderEndpointId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "cloudProviderEndpointId");
            }
            this.cloudProviderEndpointId = cloudProviderEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            if (endpointId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "endpointId");
            }
            this.endpointId = endpointId;
            return this;
        }
        @CustomType.Setter
        public Builder endpointServiceName(String endpointServiceName) {
            if (endpointServiceName == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "endpointServiceName");
            }
            this.endpointServiceName = endpointServiceName;
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            if (errorMessage == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "errorMessage");
            }
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            if (privateEndpointIpAddress == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "privateEndpointIpAddress");
            }
            this.privateEndpointIpAddress = privateEndpointIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkServiceResourceId(String privateLinkServiceResourceId) {
            if (privateLinkServiceResourceId == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "privateLinkServiceResourceId");
            }
            this.privateLinkServiceResourceId = privateLinkServiceResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessResult", "status");
            }
            this.status = status;
            return this;
        }
        public GetPrivatelinkEndpointsServiceServerlessResult build() {
            final var _resultValue = new GetPrivatelinkEndpointsServiceServerlessResult();
            _resultValue.cloudProviderEndpointId = cloudProviderEndpointId;
            _resultValue.comment = comment;
            _resultValue.endpointId = endpointId;
            _resultValue.endpointServiceName = endpointServiceName;
            _resultValue.errorMessage = errorMessage;
            _resultValue.privateEndpointIpAddress = privateEndpointIpAddress;
            _resultValue.privateLinkServiceResourceId = privateLinkServiceResourceId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
