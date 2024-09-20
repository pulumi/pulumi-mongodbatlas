// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionAtRestPrivateEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionAtRestPrivateEndpointState Empty = new EncryptionAtRestPrivateEndpointState();

    /**
     * Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     * 
     */
    @Import(name="cloudProvider")
    private @Nullable Output<String> cloudProvider;

    /**
     * @return Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     * 
     */
    public Optional<Output<String>> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    /**
     * Error message for failures associated with the Encryption At Rest private endpoint.
     * 
     */
    @Import(name="errorMessage")
    private @Nullable Output<String> errorMessage;

    /**
     * @return Error message for failures associated with the Encryption At Rest private endpoint.
     * 
     */
    public Optional<Output<String>> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    /**
     * Connection name of the Azure Private Endpoint.
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    /**
     * @return Connection name of the Azure Private Endpoint.
     * 
     */
    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Cloud provider region in which the Encryption At Rest private endpoint is located.
     * 
     */
    @Import(name="regionName")
    private @Nullable Output<String> regionName;

    /**
     * @return Cloud provider region in which the Encryption At Rest private endpoint is located.
     * 
     */
    public Optional<Output<String>> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    /**
     * State of the Encryption At Rest private endpoint.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return State of the Encryption At Rest private endpoint.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private EncryptionAtRestPrivateEndpointState() {}

    private EncryptionAtRestPrivateEndpointState(EncryptionAtRestPrivateEndpointState $) {
        this.cloudProvider = $.cloudProvider;
        this.errorMessage = $.errorMessage;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.projectId = $.projectId;
        this.regionName = $.regionName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionAtRestPrivateEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionAtRestPrivateEndpointState $;

        public Builder() {
            $ = new EncryptionAtRestPrivateEndpointState();
        }

        public Builder(EncryptionAtRestPrivateEndpointState defaults) {
            $ = new EncryptionAtRestPrivateEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Label that identifies the cloud provider for the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(@Nullable Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider Label that identifies the cloud provider for the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param errorMessage Error message for failures associated with the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param errorMessage Error message for failures associated with the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(String errorMessage) {
            return errorMessage(Output.of(errorMessage));
        }

        /**
         * @param privateEndpointConnectionName Connection name of the Azure Private Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName Connection name of the Azure Private Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param regionName Cloud provider region in which the Encryption At Rest private endpoint is located.
         * 
         * @return builder
         * 
         */
        public Builder regionName(@Nullable Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName Cloud provider region in which the Encryption At Rest private endpoint is located.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        /**
         * @param status State of the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status State of the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public EncryptionAtRestPrivateEndpointState build() {
            return $;
        }
    }

}