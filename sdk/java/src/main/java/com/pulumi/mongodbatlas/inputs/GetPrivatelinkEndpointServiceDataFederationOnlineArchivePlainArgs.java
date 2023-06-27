// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs Empty = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs();

    /**
     * Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     * 
     */
    @Import(name="endpointId", required=true)
    private String endpointId;

    /**
     * @return Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
     * 
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs() {}

    private GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs(GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs $) {
        this.endpointId = $.endpointId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs $;

        public Builder() {
            $ = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs();
        }

        public Builder(GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs defaults) {
            $ = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointId Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetPrivatelinkEndpointServiceDataFederationOnlineArchivePlainArgs build() {
            $.endpointId = Objects.requireNonNull($.endpointId, "expected parameter 'endpointId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
