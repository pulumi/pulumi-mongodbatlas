// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivatelinkEndpointServerlessState extends com.pulumi.resources.ResourceArgs {

    public static final PrivatelinkEndpointServerlessState Empty = new PrivatelinkEndpointServerlessState();

    /**
     * Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    @Import(name="endpointId")
    private @Nullable Output<String> endpointId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    public Optional<Output<String>> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * Unique string that identifies the PrivateLink endpoint service.
     * 
     */
    @Import(name="endpointServiceName")
    private @Nullable Output<String> endpointServiceName;

    /**
     * @return Unique string that identifies the PrivateLink endpoint service.
     * 
     */
    public Optional<Output<String>> endpointServiceName() {
        return Optional.ofNullable(this.endpointServiceName);
    }

    /**
     * Human-readable label that identifies the serverless instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    @Import(name="privateLinkServiceResourceId")
    private @Nullable Output<String> privateLinkServiceResourceId;

    /**
     * @return Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
     * 
     */
    public Optional<Output<String>> privateLinkServiceResourceId() {
        return Optional.ofNullable(this.privateLinkServiceResourceId);
    }

    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Cloud provider name; AWS is currently supported
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return Cloud provider name; AWS is currently supported
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    /**
     * Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivatelinkEndpointServerlessState() {}

    private PrivatelinkEndpointServerlessState(PrivatelinkEndpointServerlessState $) {
        this.endpointId = $.endpointId;
        this.endpointServiceName = $.endpointServiceName;
        this.instanceName = $.instanceName;
        this.privateLinkServiceResourceId = $.privateLinkServiceResourceId;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivatelinkEndpointServerlessState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivatelinkEndpointServerlessState $;

        public Builder() {
            $ = new PrivatelinkEndpointServerlessState();
        }

        public Builder(PrivatelinkEndpointServerlessState defaults) {
            $ = new PrivatelinkEndpointServerlessState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointId Unique 24-hexadecimal digit string that identifies the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(@Nullable Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointId Unique 24-hexadecimal digit string that identifies the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param endpointServiceName Unique string that identifies the PrivateLink endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder endpointServiceName(@Nullable Output<String> endpointServiceName) {
            $.endpointServiceName = endpointServiceName;
            return this;
        }

        /**
         * @param endpointServiceName Unique string that identifies the PrivateLink endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder endpointServiceName(String endpointServiceName) {
            return endpointServiceName(Output.of(endpointServiceName));
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param privateLinkServiceResourceId Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceResourceId(@Nullable Output<String> privateLinkServiceResourceId) {
            $.privateLinkServiceResourceId = privateLinkServiceResourceId;
            return this;
        }

        /**
         * @param privateLinkServiceResourceId Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceResourceId(String privateLinkServiceResourceId) {
            return privateLinkServiceResourceId(Output.of(privateLinkServiceResourceId));
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param providerName Cloud provider name; AWS is currently supported
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud provider name; AWS is currently supported
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param status Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public PrivatelinkEndpointServerlessState build() {
            return $;
        }
    }

}
