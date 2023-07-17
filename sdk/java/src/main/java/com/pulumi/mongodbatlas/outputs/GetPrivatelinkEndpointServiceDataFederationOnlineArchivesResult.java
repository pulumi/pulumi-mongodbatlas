// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult {
    /**
     * @return Human-readable string to associate with this private endpoint.
     * 
     */
    private String comment;
    /**
     * @return Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     * 
     */
    private String endpointId;
    /**
     * @return Human-readable label that identifies the cloud service provider.
     * 
     */
    private String providerName;
    /**
     * @return Human-readable label that identifies the resource type associated with this private endpoint.
     * 
     */
    private String type;

    private GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult() {}
    /**
     * @return Human-readable string to associate with this private endpoint.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     * 
     */
    public String endpointId() {
        return this.endpointId;
    }
    /**
     * @return Human-readable label that identifies the cloud service provider.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    /**
     * @return Human-readable label that identifies the resource type associated with this private endpoint.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String endpointId;
        private String providerName;
        private String type;
        public Builder() {}
        public Builder(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.endpointId = defaults.endpointId;
    	      this.providerName = defaults.providerName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult build() {
            final var o = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult();
            o.comment = comment;
            o.endpointId = endpointId;
            o.providerName = providerName;
            o.type = type;
            return o;
        }
    }
}