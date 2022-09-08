// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkEndpointPlainArgs Empty = new GetPrivateLinkEndpointPlainArgs();

    /**
     * Unique identifier of the private endpoint service that you want to retrieve.
     * 
     */
    @Import(name="privateLinkId", required=true)
    private String privateLinkId;

    /**
     * @return Unique identifier of the private endpoint service that you want to retrieve.
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
     * Cloud provider for which you want to retrieve a private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    /**
     * @return Cloud provider for which you want to retrieve a private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    private GetPrivateLinkEndpointPlainArgs() {}

    private GetPrivateLinkEndpointPlainArgs(GetPrivateLinkEndpointPlainArgs $) {
        this.privateLinkId = $.privateLinkId;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkEndpointPlainArgs $;

        public Builder() {
            $ = new GetPrivateLinkEndpointPlainArgs();
        }

        public Builder(GetPrivateLinkEndpointPlainArgs defaults) {
            $ = new GetPrivateLinkEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateLinkId Unique identifier of the private endpoint service that you want to retrieve.
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
         * @param providerName Cloud provider for which you want to retrieve a private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        public GetPrivateLinkEndpointPlainArgs build() {
            $.privateLinkId = Objects.requireNonNull($.privateLinkId, "expected parameter 'privateLinkId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            return $;
        }
    }

}
