// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivatelinkEndpointServiceServerlessArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivatelinkEndpointServiceServerlessArgs Empty = new PrivatelinkEndpointServiceServerlessArgs();

    /**
     * Unique string that identifies the private endpoint&#39;s network interface.
     * 
     */
    @Import(name="cloudProviderEndpointId")
    private @Nullable Output<String> cloudProviderEndpointId;

    /**
     * @return Unique string that identifies the private endpoint&#39;s network interface.
     * 
     */
    public Optional<Output<String>> cloudProviderEndpointId() {
        return Optional.ofNullable(this.cloudProviderEndpointId);
    }

    /**
     * Human-readable string to associate with this private endpoint.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Human-readable string to associate with this private endpoint.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the private endpoint.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }

    /**
     * Human-readable label that identifies the serverless instance.
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
     * 
     */
    @Import(name="privateEndpointIpAddress")
    private @Nullable Output<String> privateEndpointIpAddress;

    /**
     * @return IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
     * 
     */
    public Optional<Output<String>> privateEndpointIpAddress() {
        return Optional.ofNullable(this.privateEndpointIpAddress);
    }

    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    private PrivatelinkEndpointServiceServerlessArgs() {}

    private PrivatelinkEndpointServiceServerlessArgs(PrivatelinkEndpointServiceServerlessArgs $) {
        this.cloudProviderEndpointId = $.cloudProviderEndpointId;
        this.comment = $.comment;
        this.endpointId = $.endpointId;
        this.instanceName = $.instanceName;
        this.privateEndpointIpAddress = $.privateEndpointIpAddress;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivatelinkEndpointServiceServerlessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivatelinkEndpointServiceServerlessArgs $;

        public Builder() {
            $ = new PrivatelinkEndpointServiceServerlessArgs();
        }

        public Builder(PrivatelinkEndpointServiceServerlessArgs defaults) {
            $ = new PrivatelinkEndpointServiceServerlessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProviderEndpointId Unique string that identifies the private endpoint&#39;s network interface.
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderEndpointId(@Nullable Output<String> cloudProviderEndpointId) {
            $.cloudProviderEndpointId = cloudProviderEndpointId;
            return this;
        }

        /**
         * @param cloudProviderEndpointId Unique string that identifies the private endpoint&#39;s network interface.
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderEndpointId(String cloudProviderEndpointId) {
            return cloudProviderEndpointId(Output.of(cloudProviderEndpointId));
        }

        /**
         * @param comment Human-readable string to associate with this private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Human-readable string to associate with this private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param endpointId Unique 24-hexadecimal digit string that identifies the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(Output<String> endpointId) {
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
         * @param instanceName Human-readable label that identifies the serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
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
         * @param privateEndpointIpAddress IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointIpAddress(@Nullable Output<String> privateEndpointIpAddress) {
            $.privateEndpointIpAddress = privateEndpointIpAddress;
            return this;
        }

        /**
         * @param privateEndpointIpAddress IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            return privateEndpointIpAddress(Output.of(privateEndpointIpAddress));
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
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
         * @param providerName Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        public PrivatelinkEndpointServiceServerlessArgs build() {
            if ($.endpointId == null) {
                throw new MissingRequiredPropertyException("PrivatelinkEndpointServiceServerlessArgs", "endpointId");
            }
            if ($.instanceName == null) {
                throw new MissingRequiredPropertyException("PrivatelinkEndpointServiceServerlessArgs", "instanceName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("PrivatelinkEndpointServiceServerlessArgs", "projectId");
            }
            if ($.providerName == null) {
                throw new MissingRequiredPropertyException("PrivatelinkEndpointServiceServerlessArgs", "providerName");
            }
            return $;
        }
    }

}
