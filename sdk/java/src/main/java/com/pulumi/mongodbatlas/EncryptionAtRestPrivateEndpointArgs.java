// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EncryptionAtRestPrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionAtRestPrivateEndpointArgs Empty = new EncryptionAtRestPrivateEndpointArgs();

    /**
     * Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     * 
     */
    @Import(name="cloudProvider", required=true)
    private Output<String> cloudProvider;

    /**
     * @return Label that identifies the cloud provider for the Encryption At Rest private endpoint.
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Cloud provider region in which the Encryption At Rest private endpoint is located.
     * 
     */
    @Import(name="regionName", required=true)
    private Output<String> regionName;

    /**
     * @return Cloud provider region in which the Encryption At Rest private endpoint is located.
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }

    private EncryptionAtRestPrivateEndpointArgs() {}

    private EncryptionAtRestPrivateEndpointArgs(EncryptionAtRestPrivateEndpointArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.projectId = $.projectId;
        this.regionName = $.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionAtRestPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionAtRestPrivateEndpointArgs $;

        public Builder() {
            $ = new EncryptionAtRestPrivateEndpointArgs();
        }

        public Builder(EncryptionAtRestPrivateEndpointArgs defaults) {
            $ = new EncryptionAtRestPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Label that identifies the cloud provider for the Encryption At Rest private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(Output<String> cloudProvider) {
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
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
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
        public Builder regionName(Output<String> regionName) {
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

        public EncryptionAtRestPrivateEndpointArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("EncryptionAtRestPrivateEndpointArgs", "cloudProvider");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("EncryptionAtRestPrivateEndpointArgs", "projectId");
            }
            if ($.regionName == null) {
                throw new MissingRequiredPropertyException("EncryptionAtRestPrivateEndpointArgs", "regionName");
            }
            return $;
        }
    }

}
