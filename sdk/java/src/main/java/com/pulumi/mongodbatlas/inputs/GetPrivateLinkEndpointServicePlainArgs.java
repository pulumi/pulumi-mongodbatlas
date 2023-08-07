// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkEndpointServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkEndpointServicePlainArgs Empty = new GetPrivateLinkEndpointServicePlainArgs();

    /**
     * Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
     * 
     */
    @Import(name="endpointServiceId", required=true)
    private String endpointServiceId;

    /**
     * @return Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
     * 
     */
    public String endpointServiceId() {
        return this.endpointServiceId;
    }

    /**
     * Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
     * 
     */
    @Import(name="privateLinkId", required=true)
    private String privateLinkId;

    /**
     * @return Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
     * 
     */
    public String privateLinkId() {
        return this.privateLinkId;
    }

    /**
     * Unique identifier for the project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique identifier for the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    /**
     * @return Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    private GetPrivateLinkEndpointServicePlainArgs() {}

    private GetPrivateLinkEndpointServicePlainArgs(GetPrivateLinkEndpointServicePlainArgs $) {
        this.endpointServiceId = $.endpointServiceId;
        this.privateLinkId = $.privateLinkId;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkEndpointServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkEndpointServicePlainArgs $;

        public Builder() {
            $ = new GetPrivateLinkEndpointServicePlainArgs();
        }

        public Builder(GetPrivateLinkEndpointServicePlainArgs defaults) {
            $ = new GetPrivateLinkEndpointServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointServiceId Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
         * 
         * @return builder
         * 
         */
        public Builder endpointServiceId(String endpointServiceId) {
            $.endpointServiceId = endpointServiceId;
            return this;
        }

        /**
         * @param privateLinkId Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkId(String privateLinkId) {
            $.privateLinkId = privateLinkId;
            return this;
        }

        /**
         * @param projectId Unique identifier for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param providerName Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        public GetPrivateLinkEndpointServicePlainArgs build() {
            $.endpointServiceId = Objects.requireNonNull($.endpointServiceId, "expected parameter 'endpointServiceId' to be non-null");
            $.privateLinkId = Objects.requireNonNull($.privateLinkId, "expected parameter 'privateLinkId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            return $;
        }
    }

}
